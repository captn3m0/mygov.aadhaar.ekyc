package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

class FirebaseInstanceIdService$a
  extends BroadcastReceiver
{
  static BroadcastReceiver a;
  final int b;
  
  private FirebaseInstanceIdService$a(int paramInt)
  {
    b = paramInt;
  }
  
  static void a(Context paramContext, int paramInt)
  {
    synchronized (a.class)
    {
      Object localObject1 = a;
      if (localObject1 != null) {
        return;
      }
      localObject1 = new com/google/firebase/iid/FirebaseInstanceIdService$a;
      ((a)localObject1).<init>(paramInt);
      a = (BroadcastReceiver)localObject1;
      localObject1 = paramContext.getApplicationContext();
      BroadcastReceiver localBroadcastReceiver = a;
      IntentFilter localIntentFilter = new android/content/IntentFilter;
      String str = "android.net.conn.CONNECTIVITY_CHANGE";
      localIntentFilter.<init>(str);
      ((Context)localObject1).registerReceiver(localBroadcastReceiver, localIntentFilter);
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    for (;;)
    {
      synchronized (a.class)
      {
        BroadcastReceiver localBroadcastReceiver = a;
        if (localBroadcastReceiver != this) {
          return;
        }
        bool = FirebaseInstanceIdService.b(paramContext);
        if (bool) {}
      }
      Object localObject3 = "FirebaseInstanceId";
      int i = 3;
      boolean bool = Log.isLoggable((String)localObject3, i);
      if (bool)
      {
        localObject3 = "FirebaseInstanceId";
        String str = "connectivity changed. starting background sync.";
        Log.d((String)localObject3, str);
      }
      localObject3 = paramContext.getApplicationContext();
      ((Context)localObject3).unregisterReceiver(this);
      bool = false;
      localObject3 = null;
      a = null;
      localObject3 = g.a();
      int j = b;
      ??? = FirebaseInstanceIdService.a(j);
      ((g)localObject3).a(paramContext, (Intent)???);
    }
  }
}


/* Location:              com/google/firebase/iid/FirebaseInstanceIdService$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */