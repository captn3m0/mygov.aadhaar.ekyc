package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;

final class z
  implements SensorEventListener
{
  final SensorManager a;
  Handler b;
  z.a c;
  private final Object d;
  private final Display e;
  private final float[] f;
  private final float[] g;
  private float[] h;
  
  z(Context paramContext)
  {
    Object localObject = (SensorManager)paramContext.getSystemService("sensor");
    a = ((SensorManager)localObject);
    localObject = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    e = ((Display)localObject);
    localObject = new float[i];
    f = ((float[])localObject);
    localObject = new float[i];
    g = ((float[])localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    float f1 = g[paramInt1];
    float[] arrayOfFloat = g;
    float f2 = g[paramInt2];
    arrayOfFloat[paramInt1] = f2;
    g[paramInt2] = f1;
  }
  
  final void a()
  {
    Handler localHandler = b;
    if (localHandler == null) {}
    for (;;)
    {
      return;
      a.unregisterListener(this);
      localHandler = b;
      z.1 local1 = new com/google/android/gms/ads/internal/overlay/z$1;
      local1.<init>();
      localHandler.post(local1);
      localHandler = null;
      b = null;
    }
  }
  
  final boolean a(float[] paramArrayOfFloat)
  {
    boolean bool = false;
    float[] arrayOfFloat1 = null;
    synchronized (d)
    {
      float[] arrayOfFloat2 = h;
      if (arrayOfFloat2 == null) {
        return bool;
      }
      arrayOfFloat1 = h;
      arrayOfFloat2 = null;
      float[] arrayOfFloat3 = h;
      int i = arrayOfFloat3.length;
      System.arraycopy(arrayOfFloat1, 0, paramArrayOfFloat, 0, i);
      bool = true;
    }
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    int i = 9;
    int j = 2;
    int k = 1;
    int m = 0;
    float[] arrayOfFloat1 = null;
    float[] arrayOfFloat2 = null;
    Object localObject1 = values;
    float f1 = localObject1[0];
    boolean bool = f1 < 0.0F;
    if (!bool)
    {
      f1 = localObject1[k];
      bool = f1 < 0.0F;
      if (!bool)
      {
        f1 = localObject1[j];
        bool = f1 < 0.0F;
        if (!bool) {
          break label293;
        }
      }
    }
    for (;;)
    {
      int n;
      synchronized (d)
      {
        arrayOfFloat1 = h;
        if (arrayOfFloat1 == null)
        {
          m = 9;
          arrayOfFloat1 = new float[m];
          h = arrayOfFloat1;
        }
        ??? = f;
        SensorManager.getRotationMatrixFromVector((float[])???, (float[])localObject1);
        localObject1 = e;
        int i1 = ((Display)localObject1).getRotation();
        switch (i1)
        {
        default: 
          localObject1 = f;
          ??? = g;
          System.arraycopy(localObject1, 0, ???, 0, i);
          a(k, 3);
          a(j, 6);
          i1 = 5;
          n = 7;
          f1 = 9.8E-45F;
          a(i1, n);
        }
      }
      synchronized (d)
      {
        localObject1 = g;
        m = 0;
        arrayOfFloat1 = null;
        arrayOfFloat2 = h;
        k = 0;
        j = 9;
        System.arraycopy(localObject1, 0, arrayOfFloat2, 0, j);
        localObject1 = c;
        if (localObject1 != null)
        {
          localObject1 = c;
          ((z.a)localObject1).a();
        }
        label293:
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        float[] arrayOfFloat3 = f;
        n = 129;
        f1 = 1.81E-43F;
        arrayOfFloat1 = g;
        SensorManager.remapCoordinateSystem(arrayOfFloat3, j, n, arrayOfFloat1);
        continue;
        arrayOfFloat3 = f;
        n = 129;
        f1 = 1.81E-43F;
        m = 130;
        arrayOfFloat2 = g;
        SensorManager.remapCoordinateSystem(arrayOfFloat3, n, m, arrayOfFloat2);
        continue;
        arrayOfFloat3 = f;
        n = 130;
        f1 = 1.82E-43F;
        arrayOfFloat1 = g;
        SensorManager.remapCoordinateSystem(arrayOfFloat3, n, k, arrayOfFloat1);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */