package com.google.firebase.iid;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

final class f$1
  extends Handler
{
  f$1(f paramf, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    f localf = a;
    Object localObject1;
    Object localObject2;
    if (paramMessage != null)
    {
      localObject1 = obj;
      boolean bool1 = localObject1 instanceof Intent;
      if (!bool1) {
        break label136;
      }
      localObject1 = (Intent)obj;
      localObject2 = MessengerCompat.class.getClassLoader();
      ((Intent)localObject1).setExtrasClassLoader((ClassLoader)localObject2);
      localObject2 = "google.messenger";
      boolean bool2 = ((Intent)localObject1).hasExtra((String)localObject2);
      if (bool2)
      {
        localObject2 = ((Intent)localObject1).getParcelableExtra("google.messenger");
        bool1 = localObject2 instanceof MessengerCompat;
        if (bool1)
        {
          localObject1 = localObject2;
          localObject1 = (MessengerCompat)localObject2;
          j = ((MessengerCompat)localObject1);
        }
        bool1 = localObject2 instanceof Messenger;
        if (bool1)
        {
          localObject2 = (Messenger)localObject2;
          i = ((Messenger)localObject2);
        }
      }
      localObject1 = (Intent)obj;
      localf.b((Intent)localObject1);
    }
    for (;;)
    {
      return;
      label136:
      localObject1 = "InstanceID/Rpc";
      localObject2 = "Dropping invalid message";
      Log.w((String)localObject1, (String)localObject2);
    }
  }
}


/* Location:              com/google/firebase/iid/f$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */