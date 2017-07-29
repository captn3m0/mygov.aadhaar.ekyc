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
  private final AlarmManager b;
  private final ch c;
  
  protected dn(dc paramdc)
  {
    super(paramdc);
    Object localObject = (AlarmManager)super.n().getSystemService("alarm");
    b = ((AlarmManager)localObject);
    localObject = new com/google/android/gms/b/dn$1;
    ((dn.1)localObject).<init>(this, paramdc);
    c = ((ch)localObject);
  }
  
  private PendingIntent y()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Context localContext = super.n();
    cf.W();
    localIntent = localIntent.setClassName(localContext, "com.google.android.gms.measurement.AppMeasurementReceiver");
    localIntent.setAction("com.google.android.gms.measurement.UPLOAD");
    return PendingIntent.getBroadcast(super.n(), 0, localIntent, 0);
  }
  
  protected final void a()
  {
    AlarmManager localAlarmManager = b;
    PendingIntent localPendingIntent = y();
    localAlarmManager.cancel(localPendingIntent);
  }
  
  public final void a(long paramLong)
  {
    J();
    cf.W();
    Object localObject = super.n();
    boolean bool = cz.a((Context)localObject);
    String str;
    if (!bool)
    {
      localObject = uf;
      str = "Receiver not registered/enabled";
      ((cu.a)localObject).a(str);
    }
    cf.W();
    localObject = super.n();
    bool = dk.a((Context)localObject);
    if (!bool)
    {
      localObject = uf;
      str = "Service not registered/enabled";
      ((cu.a)localObject).a(str);
    }
    x();
    localObject = super.m();
    long l1 = ((c)localObject).b() + paramLong;
    a = true;
    long l2 = cf.ap();
    bool = paramLong < l2;
    if (bool)
    {
      localObject = c;
      bool = ((ch)localObject).b();
      if (!bool)
      {
        localObject = c;
        ((ch)localObject).a(paramLong);
      }
    }
    localObject = b;
    long l3 = Math.max(cf.aq(), paramLong);
    PendingIntent localPendingIntent = y();
    ((AlarmManager)localObject).setInexactRepeating(2, l1, l3, localPendingIntent);
  }
  
  public final void x()
  {
    J();
    a = false;
    AlarmManager localAlarmManager = b;
    PendingIntent localPendingIntent = y();
    localAlarmManager.cancel(localPendingIntent);
    c.c();
  }
}


/* Location:              com/google/android/gms/b/dn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */