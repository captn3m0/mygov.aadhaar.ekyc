package com.google.android.gms.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.c;

public final class dn
  extends df
{
  private boolean a;
  private final AlarmManager b = (AlarmManager)super.n().getSystemService("alarm");
  private final ch c;
  
  protected dn(dc paramdc)
  {
    super(paramdc);
    c = new ch(paramdc)
    {
      public final void a()
      {
        dn.a(dn.this);
      }
    };
  }
  
  private PendingIntent y()
  {
    Intent localIntent = new Intent();
    Context localContext = super.n();
    cf.W();
    localIntent = localIntent.setClassName(localContext, "com.google.android.gms.measurement.AppMeasurementReceiver");
    localIntent.setAction("com.google.android.gms.measurement.UPLOAD");
    return PendingIntent.getBroadcast(super.n(), 0, localIntent, 0);
  }
  
  protected final void a()
  {
    b.cancel(y());
  }
  
  public final void a(long paramLong)
  {
    J();
    cf.W();
    if (!cz.a(super.n())) {
      uf.a("Receiver not registered/enabled");
    }
    cf.W();
    if (!dk.a(super.n())) {
      uf.a("Service not registered/enabled");
    }
    x();
    long l = super.m().b();
    a = true;
    if ((paramLong < cf.ap()) && (!c.b())) {
      c.a(paramLong);
    }
    b.setInexactRepeating(2, l + paramLong, Math.max(cf.aq(), paramLong), y());
  }
  
  public final void x()
  {
    J();
    a = false;
    b.cancel(y());
    c.c();
  }
}


/* Location:              com/google/android/gms/b/dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */