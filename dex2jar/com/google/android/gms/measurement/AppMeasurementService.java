package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.b.cf;
import com.google.android.gms.b.cu;
import com.google.android.gms.b.cu.a;
import com.google.android.gms.b.db;
import com.google.android.gms.b.dc;
import com.google.android.gms.b.dd;
import com.google.android.gms.b.dk;
import com.google.android.gms.b.dk.1;
import com.google.android.gms.b.dk.a;

public final class AppMeasurementService
  extends Service
  implements dk.a
{
  private dk a;
  
  private dk b()
  {
    if (a == null) {
      a = new dk(this);
    }
    return a;
  }
  
  public final Context a()
  {
    return this;
  }
  
  public final boolean a(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    dk localdk = b();
    if (paramIntent == null)
    {
      aa.a("onBind called with null intent");
      return null;
    }
    paramIntent = paramIntent.getAction();
    if ("com.google.android.gms.measurement.START".equals(paramIntent)) {
      return new dd(dc.a(b));
    }
    ac.a("onBind received unknown action", paramIntent);
    return null;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    cu localcu = dc.a(bb).e();
    cf.W();
    g.a("Local AppMeasurementService is starting up");
  }
  
  public final void onDestroy()
  {
    cu localcu = dc.a(bb).e();
    cf.W();
    g.a("Local AppMeasurementService is shutting down");
    super.onDestroy();
  }
  
  public final void onRebind(Intent paramIntent)
  {
    dk localdk = b();
    if (paramIntent == null)
    {
      aa.a("onRebind called with null intent");
      return;
    }
    paramIntent = paramIntent.getAction();
    ag.a("onRebind called. action", paramIntent);
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    dk localdk = b();
    dc localdc = dc.a(b);
    cu localcu = localdc.e();
    if (paramIntent == null) {
      c.a("AppMeasurementService started with null intent");
    }
    for (;;)
    {
      AppMeasurementReceiver.a(paramIntent);
      return 2;
      String str = paramIntent.getAction();
      cf.W();
      g.a("Local AppMeasurementService called. startId, action", Integer.valueOf(paramInt2), str);
      if ("com.google.android.gms.measurement.UPLOAD".equals(str)) {
        localdc.f().a(new dk.1(localdk, localdc, paramInt2, localcu));
      }
    }
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    dk localdk = b();
    if (paramIntent == null)
    {
      aa.a("onUnbind called with null intent");
      return true;
    }
    paramIntent = paramIntent.getAction();
    ag.a("onUnbind called for intent. action", paramIntent);
    return true;
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurementService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */