package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.c;

public final class dk
{
  final Handler a;
  public final Context b;
  final a c;
  
  public dk(a parama)
  {
    b = parama.a();
    c.a(b);
    c = parama;
    a = new Handler();
  }
  
  public static boolean a(Context paramContext)
  {
    c.a(paramContext);
    return dr.b(paramContext, "com.google.android.gms.measurement.AppMeasurementService");
  }
  
  public final cu a()
  {
    return dc.a(b).e();
  }
  
  public static abstract interface a
  {
    public abstract Context a();
    
    public abstract boolean a(int paramInt);
  }
}


/* Location:              com/google/android/gms/b/dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */