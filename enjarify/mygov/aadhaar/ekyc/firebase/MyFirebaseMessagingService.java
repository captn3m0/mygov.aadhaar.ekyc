package mygov.aadhaar.ekyc.firebase;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.b.ab.d;
import android.support.v7.app.e;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mygov.aadhaar.ekyc.MainActivity;

public class MyFirebaseMessagingService
  extends FirebaseMessagingService
{
  public final void a(com.google.firebase.messaging.a parama)
  {
    Object localObject1 = b;
    boolean bool1;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v4/g/a;
      ((android.support.v4.g.a)localObject1).<init>();
      b = ((Map)localObject1);
      localObject1 = a.keySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        localObject3 = a.get((String)localObject1);
        boolean bool2 = localObject3 instanceof String;
        if (bool2)
        {
          localObject3 = (String)localObject3;
          localObject4 = "google.";
          bool2 = ((String)localObject1).startsWith((String)localObject4);
          if (!bool2)
          {
            localObject4 = "gcm.";
            bool2 = ((String)localObject1).startsWith((String)localObject4);
            if (!bool2)
            {
              localObject4 = "from";
              bool2 = ((String)localObject1).equals(localObject4);
              if (!bool2)
              {
                localObject4 = "message_type";
                bool2 = ((String)localObject1).equals(localObject4);
                if (!bool2)
                {
                  localObject4 = "collapse_key";
                  bool2 = ((String)localObject1).equals(localObject4);
                  if (!bool2)
                  {
                    localObject4 = b;
                    ((Map)localObject4).put(localObject1, localObject3);
                  }
                }
              }
            }
          }
        }
      }
    }
    Object localObject3 = b;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("From: ");
    Object localObject4 = a;
    String str = "from";
    localObject4 = ((Bundle)localObject4).getString(str);
    localObject2 = (String)localObject4;
    Log.d("MyFirebaseMsgService", (String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Notification Message Body: ");
    localObject4 = localObject3.toString();
    localObject2 = (String)localObject4;
    Log.d("MyFirebaseMsgService", (String)localObject2);
    localObject1 = MainActivity.e();
    if (localObject1 != null)
    {
      bool1 = Boolean.parseBoolean((String)((Map)localObject3).get("success"));
      localObject1 = Boolean.valueOf(bool1);
      localObject2 = MainActivity.e();
      localObject4 = new mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1;
      ((MyFirebaseMessagingService.1)localObject4).<init>(this, (Map)localObject3, (Boolean)localObject1);
      ((e)localObject2).runOnUiThread((Runnable)localObject4);
    }
    for (;;)
    {
      return;
      localObject1 = localObject3.toString();
      localObject3 = new android/content/Intent;
      ((Intent)localObject3).<init>(this, MainActivity.class);
      ((Intent)localObject3).addFlags(67108864);
      localObject3 = PendingIntent.getActivity(this, 0, (Intent)localObject3, 1073741824);
      int i = 2;
      localObject2 = RingtoneManager.getDefaultUri(i);
      localObject4 = new android/support/v4/b/ab$d;
      ((ab.d)localObject4).<init>(this);
      int j = 2130903040;
      localObject4 = ((ab.d)localObject4).a(j);
      str = "Firebase Push Notification";
      localObject4 = ((ab.d)localObject4).a(str);
      localObject2 = ((ab.d)localObject4).b((CharSequence)localObject1).a().a((Uri)localObject2);
      d = ((PendingIntent)localObject3);
      localObject1 = (NotificationManager)getSystemService("notification");
      localObject3 = ((ab.d)localObject2).b();
      ((NotificationManager)localObject1).notify(0, (Notification)localObject3);
    }
  }
}


/* Location:              mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */