package com.google.firebase.iid;

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
    String str1 = null;
    int j = -1;
    paramIntent.setComponent(null);
    paramIntent.setPackage(paramContext.getPackageName());
    if (Build.VERSION.SDK_INT <= 18) {
      paramIntent.removeCategory(paramContext.getPackageName());
    }
    String str2 = paramIntent.getStringExtra("gcm.rawData64");
    if (str2 != null)
    {
      paramIntent.putExtra("rawData", Base64.decode(str2, 0));
      paramIntent.removeExtra("gcm.rawData64");
    }
    str2 = paramIntent.getStringExtra("from");
    if (("google.com/iid".equals(str2)) || ("gcm.googleapis.com/refresh".equals(str2)))
    {
      str1 = "com.google.firebase.INSTANCE_ID_EVENT";
      i = j;
      if (str1 != null)
      {
        if (!FirebaseInstanceIdInternalReceiver.a(paramContext)) {
          break label188;
        }
        if (isOrderedBroadcast()) {
          setResultCode(-1);
        }
        FirebaseInstanceIdInternalReceiver.a(paramContext, str1).a(paramIntent, goAsync());
      }
    }
    label188:
    for (int i = j;; i = g.a().a(paramContext, str1, paramIntent))
    {
      if (isOrderedBroadcast()) {
        setResultCode(i);
      }
      return;
      if ("com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction()))
      {
        str1 = "com.google.firebase.MESSAGING_EVENT";
        break;
      }
      Log.d("FirebaseInstanceId", "Unexpected intent");
      break;
    }
  }
}


/* Location:              com/google/firebase/iid/FirebaseInstanceIdReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */