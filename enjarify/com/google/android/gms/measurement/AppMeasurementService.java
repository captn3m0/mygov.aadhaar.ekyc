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
    dk localdk = a;
    if (localdk == null)
    {
      localdk = new com/google/android/gms/b/dk;
      localdk.<init>(this);
      a = localdk;
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
    Object localObject1 = null;
    Object localObject2 = b();
    String str1;
    if (paramIntent == null)
    {
      localObject2 = aa;
      str1 = "onBind called with null intent";
      ((cu.a)localObject2).a(str1);
    }
    for (;;)
    {
      return (IBinder)localObject1;
      str1 = paramIntent.getAction();
      String str2 = "com.google.android.gms.measurement.START";
      boolean bool = str2.equals(str1);
      if (bool)
      {
        localObject1 = new com/google/android/gms/b/dd;
        localObject2 = dc.a(b);
        ((dd)localObject1).<init>((dc)localObject2);
      }
      else
      {
        localObject2 = ac;
        str2 = "onBind received unknown action";
        ((cu.a)localObject2).a(str2, str1);
      }
    }
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
    Object localObject = b();
    String str1;
    if (paramIntent == null)
    {
      localObject = aa;
      str1 = "onRebind called with null intent";
      ((cu.a)localObject).a(str1);
    }
    for (;;)
    {
      return;
      str1 = paramIntent.getAction();
      localObject = ag;
      String str2 = "onRebind called. action";
      ((cu.a)localObject).a(str2, str1);
    }
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Object localObject1 = b();
    Object localObject2 = dc.a(b);
    cu localcu = ((dc)localObject2).e();
    if (paramIntent == null)
    {
      localObject1 = c;
      localObject2 = "AppMeasurementService started with null intent";
      ((cu.a)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      AppMeasurementReceiver.a(paramIntent);
      return 2;
      Object localObject3 = paramIntent.getAction();
      cf.W();
      Object localObject4 = g;
      String str = "Local AppMeasurementService called. startId, action";
      Integer localInteger = Integer.valueOf(paramInt2);
      ((cu.a)localObject4).a(str, localInteger, localObject3);
      localObject4 = "com.google.android.gms.measurement.UPLOAD";
      boolean bool = ((String)localObject4).equals(localObject3);
      if (bool)
      {
        localObject3 = ((dc)localObject2).f();
        localObject4 = new com/google/android/gms/b/dk$1;
        ((dk.1)localObject4).<init>((dk)localObject1, (dc)localObject2, paramInt2, localcu);
        ((db)localObject3).a((Runnable)localObject4);
      }
    }
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    boolean bool = true;
    Object localObject = b();
    String str1;
    if (paramIntent == null)
    {
      localObject = aa;
      str1 = "onUnbind called with null intent";
      ((cu.a)localObject).a(str1);
    }
    for (;;)
    {
      return bool;
      str1 = paramIntent.getAction();
      localObject = ag;
      String str2 = "onUnbind called for intent. action";
      ((cu.a)localObject).a(str2, str1);
    }
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurementService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */