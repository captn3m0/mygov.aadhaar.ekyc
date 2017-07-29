package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.util.Log;
import com.google.android.gms.b.qi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@qi
@TargetApi(14)
public final class aa
  extends Thread
  implements SurfaceTexture.OnFrameAvailableListener, z.a
{
  private static final float[] f = { -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F };
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
  private FloatBuffer t = ByteBuffer.allocateDirect(f.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
  private final CountDownLatch u;
  private final Object v;
  private EGL10 w;
  private EGLDisplay x;
  private EGLContext y;
  private EGLSurface z;
  
  public aa(Context paramContext)
  {
    super("SphericalVideoProcessor");
    t.put(f).position(0);
    h = new float[9];
    i = new float[9];
    j = new float[9];
    k = new float[9];
    l = new float[9];
    m = new float[9];
    n = new float[9];
    o = NaN.0F;
    g = new z(paramContext);
    g.c = this;
    u = new CountDownLatch(1);
    v = new Object();
  }
  
  private static int a(int paramInt, String paramString)
  {
    int i1 = GLES20.glCreateShader(paramInt);
    a("createShader");
    if (i1 != 0)
    {
      GLES20.glShaderSource(i1, paramString);
      a("shaderSource");
      GLES20.glCompileShader(i1);
      a("compileShader");
      paramString = new int[1];
      GLES20.glGetShaderiv(i1, 35713, paramString, 0);
      a("getShaderiv");
      if (paramString[0] == 0)
      {
        Log.e("SphericalVideoRenderer", 37 + "Could not compile shader " + paramInt + ":");
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(i1));
        GLES20.glDeleteShader(i1);
        a("deleteShader");
        return 0;
      }
    }
    return i1;
  }
  
  private static void a(String paramString)
  {
    int i1 = GLES20.glGetError();
    if (i1 != 0) {
      Log.e("SphericalVideoRenderer", String.valueOf(paramString).length() + 21 + paramString + ": glError " + i1);
    }
  }
  
  private static void a(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = 1.0F;
    paramArrayOfFloat[1] = 0.0F;
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = 0.0F;
    paramArrayOfFloat[4] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[5] = ((float)-Math.sin(paramFloat));
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = ((float)Math.sin(paramFloat));
    paramArrayOfFloat[8] = ((float)Math.cos(paramFloat));
  }
  
  private static void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[0] + paramArrayOfFloat2[1] * paramArrayOfFloat3[3] + paramArrayOfFloat2[2] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[1] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[1] + paramArrayOfFloat2[1] * paramArrayOfFloat3[4] + paramArrayOfFloat2[2] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[2] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[2] + paramArrayOfFloat2[1] * paramArrayOfFloat3[5] + paramArrayOfFloat2[2] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[3] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[0] + paramArrayOfFloat2[4] * paramArrayOfFloat3[3] + paramArrayOfFloat2[5] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[4] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[1] + paramArrayOfFloat2[4] * paramArrayOfFloat3[4] + paramArrayOfFloat2[5] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[5] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[2] + paramArrayOfFloat2[4] * paramArrayOfFloat3[5] + paramArrayOfFloat2[5] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[6] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[0] + paramArrayOfFloat2[7] * paramArrayOfFloat3[3] + paramArrayOfFloat2[8] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[7] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[1] + paramArrayOfFloat2[7] * paramArrayOfFloat3[4] + paramArrayOfFloat2[8] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[8] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[2] + paramArrayOfFloat2[7] * paramArrayOfFloat3[5] + paramArrayOfFloat2[8] * paramArrayOfFloat3[8]);
  }
  
  private static void b(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[1] = ((float)-Math.sin(paramFloat));
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = ((float)Math.sin(paramFloat));
    paramArrayOfFloat[4] = ((float)Math.cos(paramFloat));
    paramArrayOfFloat[5] = 0.0F;
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = 0.0F;
    paramArrayOfFloat[8] = 1.0F;
  }
  
  private void d()
  {
    while (s > 0)
    {
      p.updateTexImage();
      s -= 1;
    }
    if (g.a(h))
    {
      if (Float.isNaN(o))
      {
        float[] arrayOfFloat1 = h;
        float[] arrayOfFloat2 = new float[3];
        float[] tmp64_62 = arrayOfFloat2;
        tmp64_62[0] = 0.0F;
        float[] tmp68_64 = tmp64_62;
        tmp68_64[1] = 1.0F;
        float[] tmp72_68 = tmp68_64;
        tmp72_68[2] = 0.0F;
        tmp72_68;
        float[] arrayOfFloat3 = new float[3];
        arrayOfFloat3[0] = (arrayOfFloat1[0] * arrayOfFloat2[0] + arrayOfFloat1[1] * arrayOfFloat2[1] + arrayOfFloat1[2] * arrayOfFloat2[2]);
        arrayOfFloat3[1] = (arrayOfFloat1[3] * arrayOfFloat2[0] + arrayOfFloat1[4] * arrayOfFloat2[1] + arrayOfFloat1[5] * arrayOfFloat2[2]);
        float f1 = arrayOfFloat1[6];
        float f2 = arrayOfFloat2[0];
        float f3 = arrayOfFloat1[7];
        float f4 = arrayOfFloat2[1];
        arrayOfFloat3[2] = (arrayOfFloat1[8] * arrayOfFloat2[2] + (f1 * f2 + f3 * f4));
        o = (-((float)Math.atan2(arrayOfFloat3[1], arrayOfFloat3[0]) - 1.5707964F));
      }
      b(m, o + a);
    }
    for (;;)
    {
      a(i, 1.5707964F);
      a(j, m, i);
      a(k, h, j);
      a(l, b);
      a(n, l, k);
      GLES20.glUniformMatrix3fv(r, 1, false, n, 0);
      GLES20.glDrawArrays(5, 0, 4);
      a("drawArrays");
      GLES20.glFinish();
      w.eglSwapBuffers(x, z);
      return;
      a(h, -1.5707964F);
      b(m, a);
    }
  }
  
  private boolean e()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (z != null)
    {
      bool1 = bool2;
      if (z != EGL10.EGL_NO_SURFACE)
      {
        bool1 = w.eglMakeCurrent(x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false | w.eglDestroySurface(x, z);
        z = null;
      }
    }
    bool2 = bool1;
    if (y != null)
    {
      bool2 = bool1 | w.eglDestroyContext(x, y);
      y = null;
    }
    bool1 = bool2;
    if (x != null)
    {
      bool1 = bool2 | w.eglTerminate(x);
      x = null;
    }
    return bool1;
  }
  
  public final void a()
  {
    synchronized (v)
    {
      v.notifyAll();
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    synchronized (v)
    {
      d = paramInt1;
      c = paramInt2;
      A = true;
      v.notifyAll();
      return;
    }
  }
  
  public final void b()
  {
    synchronized (v)
    {
      B = true;
      e = null;
      v.notifyAll();
      return;
    }
  }
  
  public final SurfaceTexture c()
  {
    if (e == null) {
      return null;
    }
    try
    {
      u.await();
      return p;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final void onFrameAvailable(SurfaceTexture arg1)
  {
    s += 1;
    synchronized (v)
    {
      v.notifyAll();
      return;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 325	com/google/android/gms/ads/internal/overlay/aa:e	Landroid/graphics/SurfaceTexture;
    //   6: ifnonnull +17 -> 23
    //   9: ldc_w 340
    //   12: invokestatic 344	com/google/android/gms/b/tp:c	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield 131	com/google/android/gms/ads/internal/overlay/aa:u	Ljava/util/concurrent/CountDownLatch;
    //   19: invokevirtual 347	java/util/concurrent/CountDownLatch:countDown	()V
    //   22: return
    //   23: aload_0
    //   24: invokestatic 353	javax/microedition/khronos/egl/EGLContext:getEGL	()Ljavax/microedition/khronos/egl/EGL;
    //   27: checkcast 282	javax/microedition/khronos/egl/EGL10
    //   30: putfield 276	com/google/android/gms/ads/internal/overlay/aa:w	Ljavax/microedition/khronos/egl/EGL10;
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 276	com/google/android/gms/ads/internal/overlay/aa:w	Ljavax/microedition/khronos/egl/EGL10;
    //   38: getstatic 356	javax/microedition/khronos/egl/EGL10:EGL_DEFAULT_DISPLAY	Ljava/lang/Object;
    //   41: invokeinterface 360 2 0
    //   46: putfield 278	com/google/android/gms/ads/internal/overlay/aa:x	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   49: aload_0
    //   50: getfield 278	com/google/android/gms/ads/internal/overlay/aa:x	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   53: getstatic 363	javax/microedition/khronos/egl/EGL10:EGL_NO_DISPLAY	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   56: if_acmpne +387 -> 443
    //   59: iconst_0
    //   60: istore_1
    //   61: getstatic 369	com/google/android/gms/b/ke:bi	Lcom/google/android/gms/b/jz;
    //   64: astore 7
    //   66: invokestatic 374	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   69: aload 7
    //   71: invokevirtual 379	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   74: checkcast 206	java/lang/String
    //   77: aload 7
    //   79: getfield 383	com/google/android/gms/b/jz:b	Ljava/lang/Object;
    //   82: invokevirtual 387	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   85: ifne +663 -> 748
    //   88: invokestatic 374	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   91: aload 7
    //   93: invokevirtual 379	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   96: checkcast 206	java/lang/String
    //   99: astore 7
    //   101: ldc_w 388
    //   104: aload 7
    //   106: invokestatic 390	com/google/android/gms/ads/internal/overlay/aa:a	(ILjava/lang/String;)I
    //   109: istore 5
    //   111: iload 5
    //   113: ifne +643 -> 756
    //   116: iconst_0
    //   117: istore_2
    //   118: aload_0
    //   119: iload_2
    //   120: putfield 392	com/google/android/gms/ads/internal/overlay/aa:q	I
    //   123: aload_0
    //   124: getfield 392	com/google/android/gms/ads/internal/overlay/aa:q	I
    //   127: invokestatic 395	android/opengl/GLES20:glUseProgram	(I)V
    //   130: ldc_w 397
    //   133: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   136: aload_0
    //   137: getfield 392	com/google/android/gms/ads/internal/overlay/aa:q	I
    //   140: ldc_w 399
    //   143: invokestatic 402	android/opengl/GLES20:glGetAttribLocation	(ILjava/lang/String;)I
    //   146: istore_2
    //   147: iload_2
    //   148: iconst_3
    //   149: sipush 5126
    //   152: iconst_0
    //   153: bipush 12
    //   155: aload_0
    //   156: getfield 88	com/google/android/gms/ads/internal/overlay/aa:t	Ljava/nio/FloatBuffer;
    //   159: invokestatic 406	android/opengl/GLES20:glVertexAttribPointer	(IIIZILjava/nio/Buffer;)V
    //   162: ldc_w 408
    //   165: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   168: iload_2
    //   169: invokestatic 411	android/opengl/GLES20:glEnableVertexAttribArray	(I)V
    //   172: ldc_w 413
    //   175: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   178: iconst_1
    //   179: newarray <illegal type>
    //   181: astore 7
    //   183: iconst_1
    //   184: aload 7
    //   186: iconst_0
    //   187: invokestatic 417	android/opengl/GLES20:glGenTextures	(I[II)V
    //   190: ldc_w 419
    //   193: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   196: aload 7
    //   198: iconst_0
    //   199: iaload
    //   200: istore 4
    //   202: ldc_w 420
    //   205: iload 4
    //   207: invokestatic 423	android/opengl/GLES20:glBindTexture	(II)V
    //   210: ldc_w 425
    //   213: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   216: ldc_w 420
    //   219: sipush 10240
    //   222: sipush 9729
    //   225: invokestatic 428	android/opengl/GLES20:glTexParameteri	(III)V
    //   228: ldc_w 430
    //   231: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   234: ldc_w 420
    //   237: sipush 10241
    //   240: sipush 9729
    //   243: invokestatic 428	android/opengl/GLES20:glTexParameteri	(III)V
    //   246: ldc_w 430
    //   249: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   252: ldc_w 420
    //   255: sipush 10242
    //   258: ldc_w 431
    //   261: invokestatic 428	android/opengl/GLES20:glTexParameteri	(III)V
    //   264: ldc_w 430
    //   267: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   270: ldc_w 420
    //   273: sipush 10243
    //   276: ldc_w 431
    //   279: invokestatic 428	android/opengl/GLES20:glTexParameteri	(III)V
    //   282: ldc_w 430
    //   285: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   288: aload_0
    //   289: aload_0
    //   290: getfield 392	com/google/android/gms/ads/internal/overlay/aa:q	I
    //   293: ldc_w 433
    //   296: invokestatic 436	android/opengl/GLES20:glGetUniformLocation	(ILjava/lang/String;)I
    //   299: putfield 261	com/google/android/gms/ads/internal/overlay/aa:r	I
    //   302: aload_0
    //   303: getfield 261	com/google/android/gms/ads/internal/overlay/aa:r	I
    //   306: iconst_1
    //   307: iconst_0
    //   308: bipush 9
    //   310: newarray <illegal type>
    //   312: dup
    //   313: iconst_0
    //   314: fconst_1
    //   315: fastore
    //   316: dup
    //   317: iconst_1
    //   318: fconst_0
    //   319: fastore
    //   320: dup
    //   321: iconst_2
    //   322: fconst_0
    //   323: fastore
    //   324: dup
    //   325: iconst_3
    //   326: fconst_0
    //   327: fastore
    //   328: dup
    //   329: iconst_4
    //   330: fconst_1
    //   331: fastore
    //   332: dup
    //   333: iconst_5
    //   334: fconst_0
    //   335: fastore
    //   336: dup
    //   337: bipush 6
    //   339: fconst_0
    //   340: fastore
    //   341: dup
    //   342: bipush 7
    //   344: fconst_0
    //   345: fastore
    //   346: dup
    //   347: bipush 8
    //   349: fconst_1
    //   350: fastore
    //   351: iconst_0
    //   352: invokestatic 265	android/opengl/GLES20:glUniformMatrix3fv	(IIZ[FI)V
    //   355: aload_0
    //   356: getfield 392	com/google/android/gms/ads/internal/overlay/aa:q	I
    //   359: ifeq +604 -> 963
    //   362: iload_3
    //   363: istore_2
    //   364: iload_1
    //   365: ifeq +7 -> 372
    //   368: iload_2
    //   369: ifne +614 -> 983
    //   372: aload_0
    //   373: getfield 276	com/google/android/gms/ads/internal/overlay/aa:w	Ljavax/microedition/khronos/egl/EGL10;
    //   376: invokeinterface 439 1 0
    //   381: invokestatic 444	android/opengl/GLUtils:getEGLErrorString	(I)Ljava/lang/String;
    //   384: invokestatic 210	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   387: astore 7
    //   389: aload 7
    //   391: invokevirtual 213	java/lang/String:length	()I
    //   394: ifeq +574 -> 968
    //   397: ldc_w 446
    //   400: aload 7
    //   402: invokevirtual 450	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   405: astore 7
    //   407: aload 7
    //   409: invokestatic 344	com/google/android/gms/b/tp:c	(Ljava/lang/String;)V
    //   412: invokestatic 453	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   415: new 338	java/lang/Throwable
    //   418: dup
    //   419: aload 7
    //   421: invokespecial 454	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   424: ldc_w 456
    //   427: invokevirtual 461	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   430: aload_0
    //   431: invokespecial 463	com/google/android/gms/ads/internal/overlay/aa:e	()Z
    //   434: pop
    //   435: aload_0
    //   436: getfield 131	com/google/android/gms/ads/internal/overlay/aa:u	Ljava/util/concurrent/CountDownLatch;
    //   439: invokevirtual 347	java/util/concurrent/CountDownLatch:countDown	()V
    //   442: return
    //   443: iconst_2
    //   444: newarray <illegal type>
    //   446: astore 7
    //   448: aload_0
    //   449: getfield 276	com/google/android/gms/ads/internal/overlay/aa:w	Ljavax/microedition/khronos/egl/EGL10;
    //   452: aload_0
    //   453: getfield 278	com/google/android/gms/ads/internal/overlay/aa:x	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   456: aload 7
    //   458: invokeinterface 467 3 0
    //   463: ifne +8 -> 471
    //   466: iconst_0
    //   467: istore_1
    //   468: goto -407 -> 61
    //   471: iconst_1
    //   472: newarray <illegal type>
    //   474: astore 7
    //   476: iconst_1
    //   477: anewarray 469	javax/microedition/khronos/egl/EGLConfig
    //   480: astore 8
    //   482: aload_0
    //   483: getfield 276	com/google/android/gms/ads/internal/overlay/aa:w	Ljavax/microedition/khronos/egl/EGL10;
    //   486: aload_0
    //   487: getfield 278	com/google/android/gms/ads/internal/overlay/aa:x	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   490: bipush 11
    //   492: newarray <illegal type>
    //   494: dup
    //   495: iconst_0
    //   496: sipush 12352
    //   499: iastore
    //   500: dup
    //   501: iconst_1
    //   502: iconst_4
    //   503: iastore
    //   504: dup
    //   505: iconst_2
    //   506: sipush 12324
    //   509: iastore
    //   510: dup
    //   511: iconst_3
    //   512: bipush 8
    //   514: iastore
    //   515: dup
    //   516: iconst_4
    //   517: sipush 12323
    //   520: iastore
    //   521: dup
    //   522: iconst_5
    //   523: bipush 8
    //   525: iastore
    //   526: dup
    //   527: bipush 6
    //   529: sipush 12322
    //   532: iastore
    //   533: dup
    //   534: bipush 7
    //   536: bipush 8
    //   538: iastore
    //   539: dup
    //   540: bipush 8
    //   542: sipush 12325
    //   545: iastore
    //   546: dup
    //   547: bipush 9
    //   549: bipush 16
    //   551: iastore
    //   552: dup
    //   553: bipush 10
    //   555: sipush 12344
    //   558: iastore
    //   559: aload 8
    //   561: iconst_1
    //   562: aload 7
    //   564: invokeinterface 473 6 0
    //   569: ifeq +26 -> 595
    //   572: aload 7
    //   574: iconst_0
    //   575: iaload
    //   576: ifle +19 -> 595
    //   579: aload 8
    //   581: iconst_0
    //   582: aaload
    //   583: astore 7
    //   585: aload 7
    //   587: ifnonnull +14 -> 601
    //   590: iconst_0
    //   591: istore_1
    //   592: goto -531 -> 61
    //   595: aconst_null
    //   596: astore 7
    //   598: goto -13 -> 585
    //   601: aload_0
    //   602: aload_0
    //   603: getfield 276	com/google/android/gms/ads/internal/overlay/aa:w	Ljavax/microedition/khronos/egl/EGL10;
    //   606: aload_0
    //   607: getfield 278	com/google/android/gms/ads/internal/overlay/aa:x	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   610: aload 7
    //   612: getstatic 294	javax/microedition/khronos/egl/EGL10:EGL_NO_CONTEXT	Ljavax/microedition/khronos/egl/EGLContext;
    //   615: iconst_3
    //   616: newarray <illegal type>
    //   618: dup
    //   619: iconst_0
    //   620: sipush 12440
    //   623: iastore
    //   624: dup
    //   625: iconst_1
    //   626: iconst_2
    //   627: iastore
    //   628: dup
    //   629: iconst_2
    //   630: sipush 12344
    //   633: iastore
    //   634: invokeinterface 477 5 0
    //   639: putfield 303	com/google/android/gms/ads/internal/overlay/aa:y	Ljavax/microedition/khronos/egl/EGLContext;
    //   642: aload_0
    //   643: getfield 303	com/google/android/gms/ads/internal/overlay/aa:y	Ljavax/microedition/khronos/egl/EGLContext;
    //   646: ifnull +13 -> 659
    //   649: aload_0
    //   650: getfield 303	com/google/android/gms/ads/internal/overlay/aa:y	Ljavax/microedition/khronos/egl/EGLContext;
    //   653: getstatic 294	javax/microedition/khronos/egl/EGL10:EGL_NO_CONTEXT	Ljavax/microedition/khronos/egl/EGLContext;
    //   656: if_acmpne +8 -> 664
    //   659: iconst_0
    //   660: istore_1
    //   661: goto -600 -> 61
    //   664: aload_0
    //   665: aload_0
    //   666: getfield 276	com/google/android/gms/ads/internal/overlay/aa:w	Ljavax/microedition/khronos/egl/EGL10;
    //   669: aload_0
    //   670: getfield 278	com/google/android/gms/ads/internal/overlay/aa:x	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   673: aload 7
    //   675: aload_0
    //   676: getfield 325	com/google/android/gms/ads/internal/overlay/aa:e	Landroid/graphics/SurfaceTexture;
    //   679: aconst_null
    //   680: invokeinterface 481 5 0
    //   685: putfield 280	com/google/android/gms/ads/internal/overlay/aa:z	Ljavax/microedition/khronos/egl/EGLSurface;
    //   688: aload_0
    //   689: getfield 280	com/google/android/gms/ads/internal/overlay/aa:z	Ljavax/microedition/khronos/egl/EGLSurface;
    //   692: ifnull +13 -> 705
    //   695: aload_0
    //   696: getfield 280	com/google/android/gms/ads/internal/overlay/aa:z	Ljavax/microedition/khronos/egl/EGLSurface;
    //   699: getstatic 291	javax/microedition/khronos/egl/EGL10:EGL_NO_SURFACE	Ljavax/microedition/khronos/egl/EGLSurface;
    //   702: if_acmpne +8 -> 710
    //   705: iconst_0
    //   706: istore_1
    //   707: goto -646 -> 61
    //   710: aload_0
    //   711: getfield 276	com/google/android/gms/ads/internal/overlay/aa:w	Ljavax/microedition/khronos/egl/EGL10;
    //   714: aload_0
    //   715: getfield 278	com/google/android/gms/ads/internal/overlay/aa:x	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   718: aload_0
    //   719: getfield 280	com/google/android/gms/ads/internal/overlay/aa:z	Ljavax/microedition/khronos/egl/EGLSurface;
    //   722: aload_0
    //   723: getfield 280	com/google/android/gms/ads/internal/overlay/aa:z	Ljavax/microedition/khronos/egl/EGLSurface;
    //   726: aload_0
    //   727: getfield 303	com/google/android/gms/ads/internal/overlay/aa:y	Ljavax/microedition/khronos/egl/EGLContext;
    //   730: invokeinterface 298 5 0
    //   735: ifne +8 -> 743
    //   738: iconst_0
    //   739: istore_1
    //   740: goto -679 -> 61
    //   743: iconst_1
    //   744: istore_1
    //   745: goto -684 -> 61
    //   748: ldc_w 483
    //   751: astore 7
    //   753: goto -652 -> 101
    //   756: getstatic 486	com/google/android/gms/b/ke:bj	Lcom/google/android/gms/b/jz;
    //   759: astore 7
    //   761: invokestatic 374	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   764: aload 7
    //   766: invokevirtual 379	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   769: checkcast 206	java/lang/String
    //   772: aload 7
    //   774: getfield 383	com/google/android/gms/b/jz:b	Ljava/lang/Object;
    //   777: invokevirtual 387	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   780: ifne +36 -> 816
    //   783: invokestatic 374	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   786: aload 7
    //   788: invokevirtual 379	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   791: checkcast 206	java/lang/String
    //   794: astore 7
    //   796: ldc_w 487
    //   799: aload 7
    //   801: invokestatic 390	com/google/android/gms/ads/internal/overlay/aa:a	(ILjava/lang/String;)I
    //   804: istore 6
    //   806: iload 6
    //   808: ifne +16 -> 824
    //   811: iconst_0
    //   812: istore_2
    //   813: goto -695 -> 118
    //   816: ldc_w 489
    //   819: astore 7
    //   821: goto -25 -> 796
    //   824: invokestatic 492	android/opengl/GLES20:glCreateProgram	()I
    //   827: istore 4
    //   829: ldc_w 494
    //   832: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   835: iload 4
    //   837: istore_2
    //   838: iload 4
    //   840: ifeq -722 -> 118
    //   843: iload 4
    //   845: iload 5
    //   847: invokestatic 497	android/opengl/GLES20:glAttachShader	(II)V
    //   850: ldc_w 499
    //   853: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   856: iload 4
    //   858: iload 6
    //   860: invokestatic 497	android/opengl/GLES20:glAttachShader	(II)V
    //   863: ldc_w 499
    //   866: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   869: iload 4
    //   871: invokestatic 502	android/opengl/GLES20:glLinkProgram	(I)V
    //   874: ldc_w 504
    //   877: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   880: iconst_1
    //   881: newarray <illegal type>
    //   883: astore 7
    //   885: iload 4
    //   887: ldc_w 505
    //   890: aload 7
    //   892: iconst_0
    //   893: invokestatic 508	android/opengl/GLES20:glGetProgramiv	(II[II)V
    //   896: ldc_w 510
    //   899: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   902: aload 7
    //   904: iconst_0
    //   905: iaload
    //   906: iconst_1
    //   907: if_icmpeq +39 -> 946
    //   910: ldc -88
    //   912: ldc_w 512
    //   915: invokestatic 191	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   918: pop
    //   919: ldc -88
    //   921: iload 4
    //   923: invokestatic 515	android/opengl/GLES20:glGetProgramInfoLog	(I)Ljava/lang/String;
    //   926: invokestatic 191	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   929: pop
    //   930: iload 4
    //   932: invokestatic 518	android/opengl/GLES20:glDeleteProgram	(I)V
    //   935: ldc_w 520
    //   938: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   941: iconst_0
    //   942: istore_2
    //   943: goto -825 -> 118
    //   946: iload 4
    //   948: invokestatic 523	android/opengl/GLES20:glValidateProgram	(I)V
    //   951: ldc_w 525
    //   954: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   957: iload 4
    //   959: istore_2
    //   960: goto -842 -> 118
    //   963: iconst_0
    //   964: istore_2
    //   965: goto -601 -> 364
    //   968: new 206	java/lang/String
    //   971: dup
    //   972: ldc_w 446
    //   975: invokespecial 526	java/lang/String:<init>	(Ljava/lang/String;)V
    //   978: astore 7
    //   980: goto -573 -> 407
    //   983: aload_0
    //   984: new 232	android/graphics/SurfaceTexture
    //   987: dup
    //   988: iload 4
    //   990: invokespecial 527	android/graphics/SurfaceTexture:<init>	(I)V
    //   993: putfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   996: aload_0
    //   997: getfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1000: aload_0
    //   1001: invokevirtual 531	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1004: aload_0
    //   1005: getfield 131	com/google/android/gms/ads/internal/overlay/aa:u	Ljava/util/concurrent/CountDownLatch;
    //   1008: invokevirtual 347	java/util/concurrent/CountDownLatch:countDown	()V
    //   1011: aload_0
    //   1012: getfield 121	com/google/android/gms/ads/internal/overlay/aa:g	Lcom/google/android/gms/ads/internal/overlay/z;
    //   1015: astore 7
    //   1017: aload 7
    //   1019: getfield 534	com/google/android/gms/ads/internal/overlay/z:b	Landroid/os/Handler;
    //   1022: ifnonnull +26 -> 1048
    //   1025: aload 7
    //   1027: getfield 537	com/google/android/gms/ads/internal/overlay/z:a	Landroid/hardware/SensorManager;
    //   1030: bipush 11
    //   1032: invokevirtual 543	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
    //   1035: astore 8
    //   1037: aload 8
    //   1039: ifnonnull +171 -> 1210
    //   1042: ldc_w 545
    //   1045: invokestatic 344	com/google/android/gms/b/tp:c	(Ljava/lang/String;)V
    //   1048: aload_0
    //   1049: iconst_1
    //   1050: putfield 321	com/google/android/gms/ads/internal/overlay/aa:A	Z
    //   1053: aload_0
    //   1054: getfield 323	com/google/android/gms/ads/internal/overlay/aa:B	Z
    //   1057: ifne +285 -> 1342
    //   1060: aload_0
    //   1061: invokespecial 547	com/google/android/gms/ads/internal/overlay/aa:d	()V
    //   1064: aload_0
    //   1065: getfield 321	com/google/android/gms/ads/internal/overlay/aa:A	Z
    //   1068: ifeq +86 -> 1154
    //   1071: iconst_0
    //   1072: iconst_0
    //   1073: aload_0
    //   1074: getfield 317	com/google/android/gms/ads/internal/overlay/aa:d	I
    //   1077: aload_0
    //   1078: getfield 319	com/google/android/gms/ads/internal/overlay/aa:c	I
    //   1081: invokestatic 551	android/opengl/GLES20:glViewport	(IIII)V
    //   1084: ldc_w 553
    //   1087: invokestatic 148	com/google/android/gms/ads/internal/overlay/aa:a	(Ljava/lang/String;)V
    //   1090: aload_0
    //   1091: getfield 392	com/google/android/gms/ads/internal/overlay/aa:q	I
    //   1094: ldc_w 555
    //   1097: invokestatic 436	android/opengl/GLES20:glGetUniformLocation	(ILjava/lang/String;)I
    //   1100: istore_1
    //   1101: aload_0
    //   1102: getfield 392	com/google/android/gms/ads/internal/overlay/aa:q	I
    //   1105: ldc_w 557
    //   1108: invokestatic 436	android/opengl/GLES20:glGetUniformLocation	(ILjava/lang/String;)I
    //   1111: istore_2
    //   1112: aload_0
    //   1113: getfield 317	com/google/android/gms/ads/internal/overlay/aa:d	I
    //   1116: aload_0
    //   1117: getfield 319	com/google/android/gms/ads/internal/overlay/aa:c	I
    //   1120: if_icmple +159 -> 1279
    //   1123: iload_1
    //   1124: ldc_w 558
    //   1127: invokestatic 562	android/opengl/GLES20:glUniform1f	(IF)V
    //   1130: iload_2
    //   1131: aload_0
    //   1132: getfield 319	com/google/android/gms/ads/internal/overlay/aa:c	I
    //   1135: i2f
    //   1136: ldc_w 558
    //   1139: fmul
    //   1140: aload_0
    //   1141: getfield 317	com/google/android/gms/ads/internal/overlay/aa:d	I
    //   1144: i2f
    //   1145: fdiv
    //   1146: invokestatic 562	android/opengl/GLES20:glUniform1f	(IF)V
    //   1149: aload_0
    //   1150: iconst_0
    //   1151: putfield 321	com/google/android/gms/ads/internal/overlay/aa:A	Z
    //   1154: aload_0
    //   1155: getfield 137	com/google/android/gms/ads/internal/overlay/aa:v	Ljava/lang/Object;
    //   1158: astore 7
    //   1160: aload 7
    //   1162: monitorenter
    //   1163: aload_0
    //   1164: getfield 323	com/google/android/gms/ads/internal/overlay/aa:B	Z
    //   1167: ifne +24 -> 1191
    //   1170: aload_0
    //   1171: getfield 321	com/google/android/gms/ads/internal/overlay/aa:A	Z
    //   1174: ifne +17 -> 1191
    //   1177: aload_0
    //   1178: getfield 228	com/google/android/gms/ads/internal/overlay/aa:s	I
    //   1181: ifne +10 -> 1191
    //   1184: aload_0
    //   1185: getfield 137	com/google/android/gms/ads/internal/overlay/aa:v	Ljava/lang/Object;
    //   1188: invokevirtual 565	java/lang/Object:wait	()V
    //   1191: aload 7
    //   1193: monitorexit
    //   1194: goto -141 -> 1053
    //   1197: astore 8
    //   1199: aload 7
    //   1201: monitorexit
    //   1202: aload 8
    //   1204: athrow
    //   1205: astore 7
    //   1207: goto -154 -> 1053
    //   1210: new 567	android/os/HandlerThread
    //   1213: dup
    //   1214: ldc_w 569
    //   1217: invokespecial 570	android/os/HandlerThread:<init>	(Ljava/lang/String;)V
    //   1220: astore 9
    //   1222: aload 9
    //   1224: invokevirtual 573	android/os/HandlerThread:start	()V
    //   1227: aload 7
    //   1229: new 575	android/os/Handler
    //   1232: dup
    //   1233: aload 9
    //   1235: invokevirtual 579	android/os/HandlerThread:getLooper	()Landroid/os/Looper;
    //   1238: invokespecial 582	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   1241: putfield 534	com/google/android/gms/ads/internal/overlay/z:b	Landroid/os/Handler;
    //   1244: aload 7
    //   1246: getfield 537	com/google/android/gms/ads/internal/overlay/z:a	Landroid/hardware/SensorManager;
    //   1249: aload 7
    //   1251: aload 8
    //   1253: iconst_0
    //   1254: aload 7
    //   1256: getfield 534	com/google/android/gms/ads/internal/overlay/z:b	Landroid/os/Handler;
    //   1259: invokevirtual 586	android/hardware/SensorManager:registerListener	(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z
    //   1262: ifne -214 -> 1048
    //   1265: ldc_w 588
    //   1268: invokestatic 344	com/google/android/gms/b/tp:c	(Ljava/lang/String;)V
    //   1271: aload 7
    //   1273: invokevirtual 590	com/google/android/gms/ads/internal/overlay/z:a	()V
    //   1276: goto -228 -> 1048
    //   1279: iload_1
    //   1280: aload_0
    //   1281: getfield 317	com/google/android/gms/ads/internal/overlay/aa:d	I
    //   1284: i2f
    //   1285: ldc_w 558
    //   1288: fmul
    //   1289: aload_0
    //   1290: getfield 319	com/google/android/gms/ads/internal/overlay/aa:c	I
    //   1293: i2f
    //   1294: fdiv
    //   1295: invokestatic 562	android/opengl/GLES20:glUniform1f	(IF)V
    //   1298: iload_2
    //   1299: ldc_w 558
    //   1302: invokestatic 562	android/opengl/GLES20:glUniform1f	(IF)V
    //   1305: goto -156 -> 1149
    //   1308: astore 7
    //   1310: ldc_w 592
    //   1313: invokestatic 594	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   1316: aload_0
    //   1317: getfield 121	com/google/android/gms/ads/internal/overlay/aa:g	Lcom/google/android/gms/ads/internal/overlay/z;
    //   1320: invokevirtual 590	com/google/android/gms/ads/internal/overlay/z:a	()V
    //   1323: aload_0
    //   1324: getfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1327: aconst_null
    //   1328: invokevirtual 531	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1331: aload_0
    //   1332: aconst_null
    //   1333: putfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1336: aload_0
    //   1337: invokespecial 463	com/google/android/gms/ads/internal/overlay/aa:e	()Z
    //   1340: pop
    //   1341: return
    //   1342: aload_0
    //   1343: getfield 121	com/google/android/gms/ads/internal/overlay/aa:g	Lcom/google/android/gms/ads/internal/overlay/z;
    //   1346: invokevirtual 590	com/google/android/gms/ads/internal/overlay/z:a	()V
    //   1349: aload_0
    //   1350: getfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1353: aconst_null
    //   1354: invokevirtual 531	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1357: aload_0
    //   1358: aconst_null
    //   1359: putfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1362: aload_0
    //   1363: invokespecial 463	com/google/android/gms/ads/internal/overlay/aa:e	()Z
    //   1366: pop
    //   1367: return
    //   1368: astore 7
    //   1370: ldc_w 596
    //   1373: aload 7
    //   1375: invokestatic 599	com/google/android/gms/b/tp:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1378: invokestatic 453	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1381: aload 7
    //   1383: ldc_w 601
    //   1386: invokevirtual 461	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   1389: aload_0
    //   1390: getfield 121	com/google/android/gms/ads/internal/overlay/aa:g	Lcom/google/android/gms/ads/internal/overlay/z;
    //   1393: invokevirtual 590	com/google/android/gms/ads/internal/overlay/z:a	()V
    //   1396: aload_0
    //   1397: getfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1400: aconst_null
    //   1401: invokevirtual 531	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1404: aload_0
    //   1405: aconst_null
    //   1406: putfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1409: aload_0
    //   1410: invokespecial 463	com/google/android/gms/ads/internal/overlay/aa:e	()Z
    //   1413: pop
    //   1414: return
    //   1415: astore 7
    //   1417: aload_0
    //   1418: getfield 121	com/google/android/gms/ads/internal/overlay/aa:g	Lcom/google/android/gms/ads/internal/overlay/z;
    //   1421: invokevirtual 590	com/google/android/gms/ads/internal/overlay/z:a	()V
    //   1424: aload_0
    //   1425: getfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1428: aconst_null
    //   1429: invokevirtual 531	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1432: aload_0
    //   1433: aconst_null
    //   1434: putfield 230	com/google/android/gms/ads/internal/overlay/aa:p	Landroid/graphics/SurfaceTexture;
    //   1437: aload_0
    //   1438: invokespecial 463	com/google/android/gms/ads/internal/overlay/aa:e	()Z
    //   1441: pop
    //   1442: aload 7
    //   1444: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1445	0	this	aa
    //   60	1220	1	i1	int
    //   117	1182	2	i2	int
    //   1	362	3	i3	int
    //   200	789	4	i4	int
    //   109	737	5	i5	int
    //   804	55	6	i6	int
    //   1205	67	7	localInterruptedException	InterruptedException
    //   1308	1	7	localIllegalStateException	IllegalStateException
    //   1368	14	7	localThrowable	Throwable
    //   1415	28	7	localObject2	Object
    //   480	558	8	localObject3	Object
    //   1197	55	8	localSensor	android.hardware.Sensor
    //   1220	14	9	localHandlerThread	android.os.HandlerThread
    // Exception table:
    //   from	to	target	type
    //   1163	1191	1197	finally
    //   1191	1194	1197	finally
    //   1199	1202	1197	finally
    //   1154	1163	1205	java/lang/InterruptedException
    //   1202	1205	1205	java/lang/InterruptedException
    //   1048	1053	1308	java/lang/IllegalStateException
    //   1053	1149	1308	java/lang/IllegalStateException
    //   1149	1154	1308	java/lang/IllegalStateException
    //   1154	1163	1308	java/lang/IllegalStateException
    //   1202	1205	1308	java/lang/IllegalStateException
    //   1279	1305	1308	java/lang/IllegalStateException
    //   1048	1053	1368	java/lang/Throwable
    //   1053	1149	1368	java/lang/Throwable
    //   1149	1154	1368	java/lang/Throwable
    //   1154	1163	1368	java/lang/Throwable
    //   1202	1205	1368	java/lang/Throwable
    //   1279	1305	1368	java/lang/Throwable
    //   1048	1053	1415	finally
    //   1053	1149	1415	finally
    //   1149	1154	1415	finally
    //   1154	1163	1415	finally
    //   1202	1205	1415	finally
    //   1279	1305	1415	finally
    //   1310	1316	1415	finally
    //   1370	1389	1415	finally
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */