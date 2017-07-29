package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class aa
  extends Thread
  implements SurfaceTexture.OnFrameAvailableListener, z.a
{
  private static final float[] f;
  private volatile boolean A;
  private volatile boolean B;
  float a;
  float b;
  int c;
  int d;
  SurfaceTexture e;
  private final z g;
  private final float[] h;
  private final float[] i;
  private final float[] j;
  private final float[] k;
  private final float[] l;
  private final float[] m;
  private final float[] n;
  private float o;
  private SurfaceTexture p;
  private int q;
  private int r;
  private int s;
  private FloatBuffer t;
  private final CountDownLatch u;
  private final Object v;
  private EGL10 w;
  private EGLDisplay x;
  private EGLContext y;
  private EGLSurface z;
  
  static
  {
    float[] arrayOfFloat = new float[12];
    arrayOfFloat[0] = -1.0F;
    arrayOfFloat[1] = -1.0F;
    arrayOfFloat[2] = -1.0F;
    arrayOfFloat[3] = 1.0F;
    arrayOfFloat[4] = -1.0F;
    arrayOfFloat[5] = -1.0F;
    arrayOfFloat[6] = -1.0F;
    arrayOfFloat[7] = 1.0F;
    arrayOfFloat[8] = -1.0F;
    arrayOfFloat[9] = 1.0F;
    arrayOfFloat[10] = 1.0F;
    arrayOfFloat[11] = -1.0F;
    f = arrayOfFloat;
  }
  
  public aa(Context paramContext)
  {
    super("SphericalVideoProcessor");
    Object localObject1 = ByteBuffer.allocateDirect(f.length * 4);
    Object localObject2 = ByteOrder.nativeOrder();
    localObject1 = ((ByteBuffer)localObject1).order((ByteOrder)localObject2).asFloatBuffer();
    t = ((FloatBuffer)localObject1);
    localObject1 = t;
    localObject2 = f;
    ((FloatBuffer)localObject1).put((float[])localObject2).position(0);
    localObject1 = new float[i1];
    h = ((float[])localObject1);
    localObject1 = new float[i1];
    i = ((float[])localObject1);
    localObject1 = new float[i1];
    j = ((float[])localObject1);
    localObject1 = new float[i1];
    k = ((float[])localObject1);
    localObject1 = new float[i1];
    l = ((float[])localObject1);
    localObject1 = new float[i1];
    m = ((float[])localObject1);
    localObject1 = new float[i1];
    n = ((float[])localObject1);
    o = (0.0F / 0.0F);
    localObject1 = new com/google/android/gms/ads/internal/overlay/z;
    ((z)localObject1).<init>(paramContext);
    g = ((z)localObject1);
    g.c = this;
    localObject1 = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject1).<init>(1);
    u = ((CountDownLatch)localObject1);
    localObject1 = new java/lang/Object;
    localObject1.<init>();
    v = localObject1;
  }
  
  private static int a(int paramInt, String paramString)
  {
    int i1 = 0;
    int i2 = GLES20.glCreateShader(paramInt);
    Object localObject1 = "createShader";
    a((String)localObject1);
    if (i2 != 0)
    {
      GLES20.glShaderSource(i2, paramString);
      a("shaderSource");
      GLES20.glCompileShader(i2);
      a("compileShader");
      localObject1 = new int[1];
      int i3 = 35713;
      GLES20.glGetShaderiv(i2, i3, (int[])localObject1, 0);
      Object localObject2 = "getShaderiv";
      a((String)localObject2);
      int i4 = localObject1[0];
      if (i4 == 0)
      {
        i3 = 37;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(i3);
        localObject2 = ((StringBuilder)localObject3).append("Could not compile shader ").append(paramInt);
        localObject3 = ":";
        localObject2 = (String)localObject3;
        Log.e("SphericalVideoRenderer", (String)localObject2);
        localObject1 = "SphericalVideoRenderer";
        localObject2 = GLES20.glGetShaderInfoLog(i2);
        Log.e((String)localObject1, (String)localObject2);
        GLES20.glDeleteShader(i2);
        String str = "deleteShader";
        a(str);
      }
    }
    for (;;)
    {
      return i1;
      i1 = i2;
    }
  }
  
  private static void a(String paramString)
  {
    int i1 = GLES20.glGetError();
    if (i1 != 0)
    {
      String str1 = "SphericalVideoRenderer";
      int i2 = String.valueOf(paramString).length() + 21;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>(i2);
      StringBuilder localStringBuilder = ((StringBuilder)localObject).append(paramString);
      localObject = ": glError ";
      localStringBuilder = localStringBuilder.append((String)localObject);
      String str2 = i1;
      Log.e(str1, str2);
    }
  }
  
  private static void a(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = 1.0F;
    paramArrayOfFloat[1] = 0.0F;
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = 0.0F;
    float f1 = (float)Math.cos(paramFloat);
    paramArrayOfFloat[4] = f1;
    f1 = (float)-Math.sin(paramFloat);
    paramArrayOfFloat[5] = f1;
    paramArrayOfFloat[6] = 0.0F;
    f1 = (float)Math.sin(paramFloat);
    paramArrayOfFloat[7] = f1;
    f1 = (float)Math.cos(paramFloat);
    paramArrayOfFloat[8] = f1;
  }
  
  private static void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    int i1 = 4;
    int i2 = 3;
    int i3 = 2;
    int i4 = 1;
    float f1 = paramArrayOfFloat2[0];
    float f2 = paramArrayOfFloat3[0];
    f1 *= f2;
    f2 = paramArrayOfFloat2[i4];
    float f3 = paramArrayOfFloat3[i2];
    f2 *= f3;
    f1 += f2;
    f2 = paramArrayOfFloat2[i3];
    f3 = paramArrayOfFloat3[6];
    f2 *= f3;
    f1 += f2;
    paramArrayOfFloat1[0] = f1;
    f1 = paramArrayOfFloat2[0];
    f2 = paramArrayOfFloat3[i4];
    f1 *= f2;
    f2 = paramArrayOfFloat2[i4];
    f3 = paramArrayOfFloat3[i1];
    f2 *= f3;
    f1 += f2;
    f2 = paramArrayOfFloat2[i3];
    f3 = paramArrayOfFloat3[7];
    f2 *= f3;
    f1 += f2;
    paramArrayOfFloat1[i4] = f1;
    f1 = paramArrayOfFloat2[0];
    f2 = paramArrayOfFloat3[i3];
    f1 *= f2;
    f2 = paramArrayOfFloat2[i4];
    f3 = paramArrayOfFloat3[5];
    f2 *= f3;
    f1 += f2;
    f2 = paramArrayOfFloat2[i3];
    f3 = paramArrayOfFloat3[8];
    f2 *= f3;
    f1 += f2;
    paramArrayOfFloat1[i3] = f1;
    f1 = paramArrayOfFloat2[i2];
    f2 = paramArrayOfFloat3[0];
    f1 *= f2;
    f2 = paramArrayOfFloat2[i1];
    f3 = paramArrayOfFloat3[i2];
    f2 *= f3;
    f1 += f2;
    f2 = paramArrayOfFloat2[5];
    f3 = paramArrayOfFloat3[6];
    f2 *= f3;
    f1 += f2;
    paramArrayOfFloat1[i2] = f1;
    f1 = paramArrayOfFloat2[i2];
    f2 = paramArrayOfFloat3[i4];
    f1 *= f2;
    f2 = paramArrayOfFloat2[i1];
    f3 = paramArrayOfFloat3[i1];
    f2 *= f3;
    f1 += f2;
    f2 = paramArrayOfFloat2[5];
    f3 = paramArrayOfFloat3[7];
    f2 *= f3;
    f1 += f2;
    paramArrayOfFloat1[i1] = f1;
    f2 = paramArrayOfFloat2[i2];
    f3 = paramArrayOfFloat3[i3];
    f2 *= f3;
    f3 = paramArrayOfFloat2[i1];
    float f4 = paramArrayOfFloat3[5];
    f3 *= f4;
    f2 += f3;
    f3 = paramArrayOfFloat2[5];
    f4 = paramArrayOfFloat3[8];
    f3 *= f4;
    f2 += f3;
    paramArrayOfFloat1[5] = f2;
    f2 = paramArrayOfFloat2[6];
    f3 = paramArrayOfFloat3[0];
    f2 *= f3;
    f3 = paramArrayOfFloat2[7];
    f4 = paramArrayOfFloat3[i2];
    f3 *= f4;
    f2 += f3;
    f3 = paramArrayOfFloat2[8];
    f4 = paramArrayOfFloat3[6];
    f3 *= f4;
    f2 += f3;
    paramArrayOfFloat1[6] = f2;
    f2 = paramArrayOfFloat2[6];
    f3 = paramArrayOfFloat3[i4];
    f2 *= f3;
    f3 = paramArrayOfFloat2[7];
    f4 = paramArrayOfFloat3[i1];
    f3 *= f4;
    f2 += f3;
    f3 = paramArrayOfFloat2[8];
    f4 = paramArrayOfFloat3[7];
    f3 *= f4;
    f2 += f3;
    paramArrayOfFloat1[7] = f2;
    f2 = paramArrayOfFloat2[6];
    f3 = paramArrayOfFloat3[i3];
    f2 *= f3;
    f3 = paramArrayOfFloat2[7];
    f4 = paramArrayOfFloat3[5];
    f3 *= f4;
    f2 += f3;
    f3 = paramArrayOfFloat2[8];
    f4 = paramArrayOfFloat3[8];
    f3 *= f4;
    f2 += f3;
    paramArrayOfFloat1[8] = f2;
  }
  
  private static void b(float[] paramArrayOfFloat, float paramFloat)
  {
    float f1 = (float)Math.cos(paramFloat);
    paramArrayOfFloat[0] = f1;
    f1 = (float)-Math.sin(paramFloat);
    paramArrayOfFloat[1] = f1;
    paramArrayOfFloat[2] = 0.0F;
    f1 = (float)Math.sin(paramFloat);
    paramArrayOfFloat[3] = f1;
    f1 = (float)Math.cos(paramFloat);
    paramArrayOfFloat[4] = f1;
    paramArrayOfFloat[5] = 0.0F;
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = 0.0F;
    paramArrayOfFloat[8] = 1.0F;
  }
  
  private void d()
  {
    float f1 = 1.5707964F;
    int i1 = 3;
    int i2 = 2;
    int i3 = 1;
    for (;;)
    {
      int i4 = s;
      if (i4 <= 0) {
        break;
      }
      localObject1 = p;
      ((SurfaceTexture)localObject1).updateTexImage();
      i4 = s + -1;
      s = i4;
    }
    Object localObject1 = g;
    Object localObject2 = h;
    boolean bool = ((z)localObject1).a((float[])localObject2);
    Object localObject3;
    float f6;
    if (bool)
    {
      float f2 = o;
      bool = Float.isNaN(f2);
      if (bool)
      {
        localObject1 = h;
        localObject2 = new float[i1];
        Object tmp106_104 = localObject2;
        tmp106_104[0] = 0.0F;
        Object tmp110_106 = tmp106_104;
        tmp110_106[1] = 1.0F;
        tmp110_106[2] = 0.0F;
        localObject3 = new float[i1];
        float f3 = localObject1[0];
        float f4 = localObject2[0];
        f3 *= f4;
        f4 = localObject1[i3];
        float f5 = localObject2[i3];
        f4 *= f5;
        f3 += f4;
        f4 = localObject1[i2];
        f5 = localObject2[i2];
        f4 *= f5;
        f3 += f4;
        localObject3[0] = f3;
        f3 = localObject1[i1];
        f4 = localObject2[0];
        f3 *= f4;
        f4 = localObject1[4];
        f5 = localObject2[i3];
        f4 *= f5;
        f3 += f4;
        f4 = localObject1[5];
        f5 = localObject2[i2];
        f4 *= f5;
        f3 += f4;
        localObject3[i3] = f3;
        int i6 = 6;
        f3 = localObject1[i6];
        f4 = localObject2[0];
        f3 *= f4;
        f4 = localObject1[7];
        f5 = localObject2[i3];
        f4 *= f5;
        f3 += f4;
        int i7 = 8;
        f4 = 1.1E-44F;
        f2 = localObject1[i7];
        f6 = localObject2[i2];
        f2 = f2 * f6 + f3;
        localObject3[i2] = f2;
        double d1 = localObject3[i3];
        f7 = localObject3[0];
        double d2 = f7;
        d1 = Math.atan2(d1, d2);
        f2 = -((float)d1 - f1);
        o = f2;
      }
      localObject1 = m;
      f6 = o;
      float f7 = a;
      f6 += f7;
      b((float[])localObject1, f6);
    }
    for (;;)
    {
      a(i, f1);
      localObject1 = j;
      localObject2 = m;
      localObject3 = i;
      a((float[])localObject1, (float[])localObject2, (float[])localObject3);
      localObject1 = k;
      localObject2 = h;
      localObject3 = j;
      a((float[])localObject1, (float[])localObject2, (float[])localObject3);
      localObject1 = l;
      f6 = b;
      a((float[])localObject1, f6);
      localObject1 = n;
      localObject2 = l;
      localObject3 = k;
      a((float[])localObject1, (float[])localObject2, (float[])localObject3);
      int i5 = r;
      localObject2 = n;
      GLES20.glUniformMatrix3fv(i5, i3, false, (float[])localObject2, 0);
      GLES20.glDrawArrays(5, 0, 4);
      a("drawArrays");
      GLES20.glFinish();
      localObject1 = w;
      localObject2 = x;
      localObject3 = z;
      ((EGL10)localObject1).eglSwapBuffers((EGLDisplay)localObject2, (EGLSurface)localObject3);
      return;
      a(h, -1.5707964F);
      localObject1 = m;
      f6 = a;
      b((float[])localObject1, f6);
    }
  }
  
  private boolean e()
  {
    boolean bool1 = false;
    EGL10 localEGL10 = null;
    Object localObject1 = z;
    Object localObject2;
    Object localObject3;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject1 = z;
      localObject2 = EGL10.EGL_NO_SURFACE;
      if (localObject1 != localObject2)
      {
        localEGL10 = w;
        localObject1 = x;
        localObject2 = EGL10.EGL_NO_SURFACE;
        localObject3 = EGL10.EGL_NO_SURFACE;
        EGLContext localEGLContext = EGL10.EGL_NO_CONTEXT;
        bool1 = localEGL10.eglMakeCurrent((EGLDisplay)localObject1, (EGLSurface)localObject2, (EGLSurface)localObject3, localEGLContext) | false;
        localObject1 = w;
        localObject2 = x;
        localObject3 = z;
        bool2 = ((EGL10)localObject1).eglDestroySurface((EGLDisplay)localObject2, (EGLSurface)localObject3);
        bool1 |= bool2;
        z = null;
      }
    }
    localObject1 = y;
    if (localObject1 != null)
    {
      localObject1 = w;
      localObject2 = x;
      localObject3 = y;
      bool2 = ((EGL10)localObject1).eglDestroyContext((EGLDisplay)localObject2, (EGLContext)localObject3);
      bool1 |= bool2;
      y = null;
    }
    localObject1 = x;
    if (localObject1 != null)
    {
      localObject1 = w;
      localObject2 = x;
      bool2 = ((EGL10)localObject1).eglTerminate((EGLDisplay)localObject2);
      bool1 |= bool2;
      x = null;
    }
    return bool1;
  }
  
  public final void a()
  {
    synchronized (v)
    {
      Object localObject2 = v;
      localObject2.notifyAll();
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    synchronized (v)
    {
      d = paramInt1;
      c = paramInt2;
      boolean bool = true;
      A = bool;
      Object localObject2 = v;
      localObject2.notifyAll();
      return;
    }
  }
  
  public final void b()
  {
    Object localObject1 = v;
    boolean bool = true;
    try
    {
      B = bool;
      bool = false;
      Object localObject2 = null;
      e = null;
      localObject2 = v;
      localObject2.notifyAll();
      return;
    }
    finally {}
  }
  
  public final SurfaceTexture c()
  {
    Object localObject = e;
    if (localObject == null) {}
    for (localObject = null;; localObject = p)
    {
      return (SurfaceTexture)localObject;
      try
      {
        localObject = u;
        ((CountDownLatch)localObject).await();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    int i1 = s + 1;
    s = i1;
    synchronized (v)
    {
      Object localObject2 = v;
      localObject2.notifyAll();
      return;
    }
  }
  
  public final void run()
  {
    float f1 = 0.87266463F;
    int i1 = 36197;
    int i2 = 1;
    Object localObject1 = e;
    if (localObject1 == null)
    {
      tp.c("SphericalVideoProcessor started with no output texture.");
      localObject1 = u;
      ((CountDownLatch)localObject1).countDown();
    }
    for (;;)
    {
      return;
      localObject1 = (EGL10)EGLContext.getEGL();
      w = ((EGL10)localObject1);
      localObject1 = w;
      ??? = EGL10.EGL_DEFAULT_DISPLAY;
      localObject1 = ((EGL10)localObject1).eglGetDisplay(???);
      x = ((EGLDisplay)localObject1);
      localObject1 = x;
      ??? = EGL10.EGL_NO_DISPLAY;
      int i3;
      label105:
      int i5;
      float f2;
      Object localObject6;
      Object localObject7;
      label167:
      float f3;
      label190:
      float f4;
      Object localObject8;
      int i16;
      if (localObject1 == ???)
      {
        i3 = 0;
        ??? = null;
        i5 = 35633;
        f2 = 4.9932E-41F;
        localObject6 = ke.bi;
        localObject1 = (String)w.q().a((jz)localObject6);
        localObject7 = b;
        int i6 = ((String)localObject1).equals(localObject7);
        if (i6 != 0) {
          break label1048;
        }
        localObject1 = (String)w.q().a((jz)localObject6);
        i5 = a(i5, (String)localObject1);
        if (i5 != 0) {
          break label1056;
        }
        i6 = 0;
        localObject1 = null;
        f3 = 0.0F;
        q = i6;
        GLES20.glUseProgram(q);
        a("useProgram");
        int i12 = GLES20.glGetAttribLocation(q, "aPosition");
        int i13 = 3;
        int i14 = 5126;
        int i15 = 12;
        FloatBuffer localFloatBuffer = t;
        GLES20.glVertexAttribPointer(i12, i13, i14, false, i15, localFloatBuffer);
        a("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(i12);
        a("enableVertexAttribArray");
        localObject1 = new int[i2];
        GLES20.glGenTextures(i2, (int[])localObject1, 0);
        a("genTextures");
        int i7 = localObject1[0];
        GLES20.glBindTexture(i1, i7);
        a("bindTextures");
        GLES20.glTexParameteri(i1, 10240, 9729);
        a("texParameteri");
        GLES20.glTexParameteri(i1, 10241, 9729);
        a("texParameteri");
        GLES20.glTexParameteri(i1, 10242, 33071);
        a("texParameteri");
        f4 = 4.6342E-41F;
        GLES20.glTexParameteri(i1, 10243, 33071);
        a("texParameteri");
        i5 = q;
        localObject6 = "uVMat";
        i5 = GLES20.glGetUniformLocation(i5, (String)localObject6);
        r = i5;
        f2 = 1.3E-44F;
        localObject8 = new float[9];
        Object tmp413_411 = localObject8;
        Object tmp414_413 = tmp413_411;
        Object tmp414_413 = tmp413_411;
        tmp414_413[0] = 1.0F;
        tmp414_413[1] = 0.0F;
        Object tmp422_414 = tmp414_413;
        Object tmp422_414 = tmp414_413;
        tmp422_414[2] = 0.0F;
        tmp422_414[3] = 0.0F;
        Object tmp429_422 = tmp422_414;
        Object tmp429_422 = tmp422_414;
        tmp429_422[4] = 1.0F;
        tmp429_422[5] = 0.0F;
        tmp429_422[6] = 0.0F;
        Object tmp441_429 = tmp429_422;
        tmp441_429[7] = 0.0F;
        tmp441_429[8] = 1.0F;
        i16 = r;
        GLES20.glUniformMatrix3fv(i16, i2, false, (float[])localObject8, 0);
        i5 = q;
        if (i5 == 0) {
          break label1325;
        }
        label478:
        if ((i3 != 0) && (i2 != 0)) {
          break label1345;
        }
        i7 = w.eglGetError();
        localObject1 = GLUtils.getEGLErrorString(i7);
        ??? = "EGL initialization failed: ";
        localObject1 = String.valueOf(localObject1);
        i5 = ((String)localObject1).length();
        if (i5 == 0) {
          break label1330;
        }
        localObject1 = ((String)???).concat((String)localObject1);
      }
      label799:
      label1048:
      label1056:
      label1152:
      int i9;
      for (;;)
      {
        tp.c((String)localObject1);
        ??? = w.i();
        localObject8 = new java/lang/Throwable;
        ((Throwable)localObject8).<init>((String)localObject1);
        ((tj)???).a((Throwable)localObject8, "SphericalVideoProcessor.run.1");
        e();
        localObject1 = u;
        ((CountDownLatch)localObject1).countDown();
        break;
        f3 = 2.8E-45F;
        localObject1 = new int[2];
        ??? = w;
        localObject8 = x;
        boolean bool1 = ((EGL10)???).eglInitialize((EGLDisplay)localObject8, (int[])localObject1);
        if (!bool1)
        {
          i3 = 0;
          ??? = null;
          break label105;
        }
        localObject7 = new int[i2];
        localObject6 = new EGLConfig[i2];
        f3 = 1.5E-44F;
        localObject8 = new int[11];
        Object tmp661_659 = localObject8;
        Object tmp662_661 = tmp661_659;
        Object tmp662_661 = tmp661_659;
        tmp662_661[0] = '぀';
        tmp662_661[1] = 4;
        Object tmp671_662 = tmp662_661;
        Object tmp671_662 = tmp662_661;
        tmp671_662[2] = '〤';
        tmp671_662[3] = 8;
        Object tmp681_671 = tmp671_662;
        Object tmp681_671 = tmp671_662;
        tmp681_671[4] = '〣';
        tmp681_671[5] = 8;
        Object tmp691_681 = tmp681_671;
        Object tmp691_681 = tmp681_671;
        tmp691_681[6] = '〢';
        tmp691_681[7] = 8;
        tmp691_681[8] = '〥';
        Object tmp709_691 = tmp691_681;
        tmp709_691[9] = 16;
        tmp709_691[10] = '〸';
        localObject1 = w;
        ??? = x;
        bool1 = ((EGL10)localObject1).eglChooseConfig((EGLDisplay)???, (int[])localObject8, (EGLConfig[])localObject6, i2, (int[])localObject7);
        int i8;
        if (bool1)
        {
          i8 = localObject7[0];
          if (i8 > 0) {
            localObject1 = localObject6[0];
          }
        }
        for (;;)
        {
          if (localObject1 != null) {
            break label799;
          }
          i3 = 0;
          ??? = null;
          break;
          i8 = 0;
          localObject1 = null;
          f3 = 0.0F;
        }
        i3 = 3;
        ??? = new int[i3];
        Object tmp810_808 = ???;
        tmp810_808[0] = '゘';
        Object tmp816_810 = tmp810_808;
        tmp816_810[1] = 2;
        tmp816_810[2] = '〸';
        localObject8 = w;
        localObject6 = x;
        localObject7 = EGL10.EGL_NO_CONTEXT;
        ??? = ((EGL10)localObject8).eglCreateContext((EGLDisplay)localObject6, (EGLConfig)localObject1, (EGLContext)localObject7, (int[])???);
        y = ((EGLContext)???);
        ??? = y;
        if (??? != null)
        {
          ??? = y;
          localObject8 = EGL10.EGL_NO_CONTEXT;
          if (??? != localObject8) {}
        }
        else
        {
          i3 = 0;
          ??? = null;
          break label105;
        }
        ??? = w;
        localObject8 = x;
        localObject6 = e;
        localObject1 = ((EGL10)???).eglCreateWindowSurface((EGLDisplay)localObject8, (EGLConfig)localObject1, localObject6, null);
        z = ((EGLSurface)localObject1);
        localObject1 = z;
        if (localObject1 != null)
        {
          localObject1 = z;
          ??? = EGL10.EGL_NO_SURFACE;
          if (localObject1 != ???) {}
        }
        else
        {
          i3 = 0;
          ??? = null;
          break label105;
        }
        localObject1 = w;
        ??? = x;
        localObject8 = z;
        localObject6 = z;
        localObject7 = y;
        boolean bool2 = ((EGL10)localObject1).eglMakeCurrent((EGLDisplay)???, (EGLSurface)localObject8, (EGLSurface)localObject6, (EGLContext)localObject7);
        if (!bool2)
        {
          i3 = 0;
          ??? = null;
          break label105;
        }
        i3 = i2;
        break label105;
        localObject1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
        break label167;
        i16 = 35632;
        f4 = 4.9931E-41F;
        localObject7 = ke.bj;
        localObject1 = (String)w.q().a((jz)localObject7);
        Object localObject9 = b;
        bool2 = ((String)localObject1).equals(localObject9);
        if (!bool2) {}
        for (localObject1 = (String)w.q().a((jz)localObject7);; localObject1 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}")
        {
          i16 = a(i16, (String)localObject1);
          if (i16 != 0) {
            break label1152;
          }
          bool2 = false;
          localObject1 = null;
          f3 = 0.0F;
          break;
        }
        i9 = GLES20.glCreateProgram();
        localObject7 = "createProgram";
        a((String)localObject7);
        if (i9 == 0) {
          break label190;
        }
        GLES20.glAttachShader(i9, i5);
        a("attachShader");
        GLES20.glAttachShader(i9, i16);
        a("attachShader");
        GLES20.glLinkProgram(i9);
        a("linkProgram");
        localObject8 = new int[i2];
        i16 = 35714;
        f4 = 5.0046E-41F;
        GLES20.glGetProgramiv(i9, i16, (int[])localObject8, 0);
        localObject6 = "getProgramiv";
        a((String)localObject6);
        i5 = localObject8[0];
        if (i5 != i2)
        {
          Log.e("SphericalVideoRenderer", "Could not link program: ");
          localObject8 = "SphericalVideoRenderer";
          localObject6 = GLES20.glGetProgramInfoLog(i9);
          Log.e((String)localObject8, (String)localObject6);
          GLES20.glDeleteProgram(i9);
          a("deleteProgram");
          i9 = 0;
          localObject1 = null;
          f3 = 0.0F;
          break label190;
        }
        GLES20.glValidateProgram(i9);
        localObject8 = "validateProgram";
        a((String)localObject8);
        break label190;
        label1325:
        i2 = 0;
        break label478;
        label1330:
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)???);
      }
      label1345:
      ??? = new android/graphics/SurfaceTexture;
      ((SurfaceTexture)???).<init>(i9);
      p = ((SurfaceTexture)???);
      p.setOnFrameAvailableListener(this);
      u.countDown();
      localObject1 = g;
      ??? = b;
      if (??? == null)
      {
        ??? = a;
        i5 = 11;
        f2 = 1.5E-44F;
        ??? = ((SensorManager)???).getDefaultSensor(i5);
        if (??? == null)
        {
          localObject1 = "No Sensor of TYPE_ROTATION_VECTOR";
          tp.c((String)localObject1);
        }
      }
      else
      {
        i9 = 1;
        f3 = Float.MIN_VALUE;
      }
      try
      {
        A = i9;
        boolean bool3 = B;
        if (!bool3)
        {
          d();
          bool3 = A;
          int i10;
          if (bool3)
          {
            bool3 = false;
            f3 = 0.0F;
            localObject1 = null;
            i3 = 0;
            ??? = null;
            i5 = d;
            i16 = c;
            GLES20.glViewport(0, 0, i5, i16);
            localObject1 = "viewport";
            a((String)localObject1);
            i10 = q;
            ??? = "uFOVx";
            i10 = GLES20.glGetUniformLocation(i10, (String)???);
            i3 = q;
            localObject8 = "uFOVy";
            i3 = GLES20.glGetUniformLocation(i3, (String)localObject8);
            i5 = d;
            i16 = c;
            if (i5 <= i16) {
              break label1816;
            }
            i5 = 1063216883;
            f2 = 0.87266463F;
            GLES20.glUniform1f(i10, f2);
            i10 = c;
            f3 = i10 * f1;
            i5 = d;
            f2 = i5;
            f3 /= f2;
            GLES20.glUniform1f(i3, f3);
          }
          for (;;)
          {
            i10 = 0;
            f3 = 0.0F;
            localObject1 = null;
            A = false;
            try
            {
              synchronized (v)
              {
                boolean bool4 = B;
                if (!bool4)
                {
                  bool4 = A;
                  if (!bool4)
                  {
                    i11 = s;
                    if (i11 == 0)
                    {
                      localObject1 = v;
                      localObject1.wait();
                    }
                  }
                }
              }
            }
            catch (InterruptedException localInterruptedException) {}
            localObject8 = new android/os/HandlerThread;
            ((HandlerThread)localObject8).<init>("OrientationMonitor");
            ((HandlerThread)localObject8).start();
            localObject6 = new android/os/Handler;
            localObject8 = ((HandlerThread)localObject8).getLooper();
            ((Handler)localObject6).<init>((Looper)localObject8);
            b = ((Handler)localObject6);
            localObject8 = a;
            localObject6 = b;
            int i4 = ((SensorManager)localObject8).registerListener(localInterruptedException, (Sensor)???, 0, (Handler)localObject6);
            if (i4 != 0) {
              break;
            }
            ??? = "SensorManager.registerListener failed.";
            tp.c((String)???);
            localInterruptedException.a();
            break;
            label1816:
            i5 = d;
            f2 = i5 * f1;
            i16 = c;
            f4 = i16;
            f2 /= f4;
            GLES20.glUniform1f(i11, f2);
            int i11 = 1063216883;
            f3 = 0.87266463F;
            GLES20.glUniform1f(i4, f3);
          }
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Object localObject3 = "SphericalVideoProcessor halted unexpectedly.";
        try
        {
          tp.e((String)localObject3);
          g.a();
          localObject3 = p;
          ((SurfaceTexture)localObject3).setOnFrameAvailableListener(null);
          p = null;
          e();
          continue;
        }
        finally
        {
          SurfaceTexture localSurfaceTexture;
          g.a();
          p.setOnFrameAvailableListener(null);
          p = null;
          e();
        }
        g.a();
        localObject3 = p;
        ((SurfaceTexture)localObject3).setOnFrameAvailableListener(null);
        p = null;
        e();
      }
      finally
      {
        ??? = "SphericalVideoProcessor died.";
        tp.b((String)???, localThrowable);
        ??? = w.i();
        localObject8 = "SphericalVideoProcessor.run.2";
        ((tj)???).a(localThrowable, (String)localObject8);
        g.a();
        localSurfaceTexture = p;
        localSurfaceTexture.setOnFrameAvailableListener(null);
        p = null;
        e();
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */