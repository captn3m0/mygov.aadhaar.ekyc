package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.c.e;
import android.util.Base64;
import android.util.Log;

public final class FirebaseInstanceIdReceiver
  extends e
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = -1;
    paramIntent.setComponent(null);
    Object localObject2 = paramContext.getPackageName();
    paramIntent.setPackage((String)localObject2);
    int j = Build.VERSION.SDK_INT;
    int k = 18;
    if (j <= k)
    {
      localObject2 = paramContext.getPackageName();
      paramIntent.removeCategory((String)localObject2);
    }
    localObject2 = paramIntent.getStringExtra("gcm.rawData64");
    if (localObject2 != null)
    {
      str = "rawData";
      localObject2 = Base64.decode((String)localObject2, 0);
      paramIntent.putExtra(str, (byte[])localObject2);
      localObject2 = "gcm.rawData64";
      paramIntent.removeExtra((String)localObject2);
    }
    localObject2 = paramIntent.getStringExtra("from");
    String str = "google.com/iid";
    boolean bool3 = str.equals(localObject2);
    boolean bool2;
    if (!bool3)
    {
      str = "gcm.googleapis.com/refresh";
      bool2 = str.equals(localObject2);
      if (!bool2) {}
    }
    else
    {
      localObject1 = "com.google.firebase.INSTANCE_ID_EVENT";
      if (localObject1 != null)
      {
        bool2 = FirebaseInstanceIdInternalReceiver.a(paramContext);
        if (!bool2) {
          break label268;
        }
        bool2 = isOrderedBroadcast();
        if (bool2) {
          setResultCode(i);
        }
        localObject1 = FirebaseInstanceIdInternalReceiver.a(paramContext, (String)localObject1);
        localObject2 = goAsync();
        ((b.c)localObject1).a(paramIntent, (BroadcastReceiver.PendingResult)localObject2);
      }
    }
    for (;;)
    {
      bool1 = isOrderedBroadcast();
      if (bool1) {
        setResultCode(i);
      }
      return;
      localObject2 = "com.google.android.c2dm.intent.RECEIVE";
      str = paramIntent.getAction();
      bool2 = ((String)localObject2).equals(str);
      if (bool2)
      {
        localObject1 = "com.google.firebase.MESSAGING_EVENT";
        break;
      }
      localObject2 = "FirebaseInstanceId";
      str = "Unexpected intent";
      Log.d((String)localObject2, str);
      break;
      label268:
      g localg = g.a();
      i = localg.a(paramContext, (String)localObject1, paramIntent);
    }
  }
}


/* Location:              com/google/firebase/iid/FirebaseInstanceIdReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */