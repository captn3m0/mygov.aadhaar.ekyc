package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.b.qi;

@qi
final class z
  implements SensorEventListener
{
  final SensorManager a;
  Handler b;
  a c;
  private final Object d;
  private final Display e;
  private final float[] f;
  private final float[] g;
  private float[] h;
  
  z(Context paramContext)
  {
    a = ((SensorManager)paramContext.getSystemService("sensor"));
    e = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    f = new float[9];
    g = new float[9];
    d = new Object();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    float f1 = g[paramInt1];
    g[paramInt1] = g[paramInt2];
    g[paramInt2] = f1;
  }
  
  final void a()
  {
    if (b == null) {
      return;
    }
    a.unregisterListener(this);
    b.post(new Runnable()
    {
      public final void run()
      {
        Looper.myLooper().quit();
      }
    });
    b = null;
  }
  
  final boolean a(float[] paramArrayOfFloat)
  {
    synchronized (d)
    {
      if (h == null) {
        return false;
      }
      System.arraycopy(h, 0, paramArrayOfFloat, 0, h.length);
      return true;
    }
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent arg1)
  {
    float[] arrayOfFloat = values;
    if ((arrayOfFloat[0] != 0.0F) || (arrayOfFloat[1] != 0.0F) || (arrayOfFloat[2] != 0.0F)) {}
    for (;;)
    {
      synchronized (d)
      {
        if (h == null) {
          h = new float[9];
        }
        SensorManager.getRotationMatrixFromVector(f, arrayOfFloat);
        switch (e.getRotation())
        {
        default: 
          System.arraycopy(f, 0, g, 0, 9);
          a(1, 3);
          a(2, 6);
          a(5, 7);
        }
      }
      synchronized (d)
      {
        System.arraycopy(g, 0, h, 0, 9);
        if (c != null) {
          c.a();
        }
        return;
        localObject1 = finally;
        throw ((Throwable)localObject1);
        SensorManager.remapCoordinateSystem(f, 2, 129, g);
        continue;
        SensorManager.remapCoordinateSystem(f, 129, 130, g);
        continue;
        SensorManager.remapCoordinateSystem(f, 130, 1, g);
      }
    }
  }
  
  static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */