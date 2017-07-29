package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

final class f$2
  extends BroadcastReceiver
{
  f$2(f paramf) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = "InstanceID/Rpc";
    int i = 3;
    boolean bool = Log.isLoggable(str1, i);
    if (bool)
    {
      str1 = "InstanceID/Rpc";
      String str2 = String.valueOf(paramIntent.getExtras());
      int j = String.valueOf(str2).length() + 44;
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>(j);
      StringBuilder localStringBuilder2 = localStringBuilder1.append("Received GSF callback via dynamic receiver: ");
      str2 = str2;
      Log.d(str1, str2);
    }
    a.b(paramIntent);
  }
}


/* Location:              com/google/firebase/iid/f$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */