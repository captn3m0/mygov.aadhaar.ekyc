package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.c;

public final class dk
{
  final Handler a;
  public final Context b;
  final dk.a c;
  
  public dk(dk.a parama)
  {
    Object localObject = parama.a();
    b = ((Context)localObject);
    c.a(b);
    c = parama;
    localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    a = ((Handler)localObject);
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
}


/* Location:              com/google/android/gms/b/dk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */