package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.b.ab.c;
import android.support.v4.b.ab.d;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.b.gg.a;
import com.google.android.gms.b.gg.b;
import com.google.android.gms.common.util.i;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.iid.g;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class FirebaseMessagingService
  extends com.google.firebase.iid.b
{
  static void a(Bundle paramBundle)
  {
    paramBundle = paramBundle.keySet().iterator();
    while (paramBundle.hasNext())
    {
      String str = (String)paramBundle.next();
      if ((str != null) && (str.startsWith("google.c."))) {
        paramBundle.remove();
      }
    }
  }
  
  private static boolean b(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return false;
    }
    return "1".equals(paramBundle.getString("google.c.a.e"));
  }
  
  public void a(a parama) {}
  
  public final boolean a(Intent paramIntent)
  {
    if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(paramIntent.getAction()))
    {
      Object localObject = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
      if (localObject != null) {}
      try
      {
        ((PendingIntent)localObject).send();
        if (b(paramIntent.getExtras()))
        {
          if (paramIntent != null)
          {
            if (!"1".equals(paramIntent.getStringExtra("google.c.a.tc"))) {
              break label177;
            }
            localObject = f.a(this);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
              Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (localObject != null)
            {
              String str = paramIntent.getStringExtra("google.c.a.c_id");
              ((AppMeasurement)localObject).zzb("fcm", "_ln", str);
              Bundle localBundle = new Bundle();
              localBundle.putString("source", "Firebase");
              localBundle.putString("medium", "notification");
              localBundle.putString("campaign", str);
              ((AppMeasurement)localObject).logEventInternal("fcm", "_cmp", localBundle);
            }
          }
          else
          {
            f.a(this, "_no", paramIntent);
          }
        }
        else {
          return true;
        }
      }
      catch (PendingIntent.CanceledException localCanceledException)
      {
        for (;;)
        {
          Log.e("FirebaseMessaging", "Notification pending intent canceled");
          continue;
          Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
          continue;
          label177:
          if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
          }
        }
      }
    }
    return false;
  }
  
  public final void b(Intent paramIntent)
  {
    Object localObject3 = paramIntent.getAction();
    Object localObject1 = localObject3;
    if (localObject3 == null) {
      localObject1 = "";
    }
    int i;
    switch (((String)localObject1).hashCode())
    {
    default: 
      i = -1;
      switch (i)
      {
      default: 
        label54:
        paramIntent = String.valueOf(paramIntent.getAction());
        if (paramIntent.length() != 0) {
          paramIntent = "Unknown intent action: ".concat(paramIntent);
        }
        break;
      }
      break;
    }
    for (;;)
    {
      Log.d("FirebaseMessaging", paramIntent);
      label105:
      return;
      if (!((String)localObject1).equals("com.google.android.c2dm.intent.RECEIVE")) {
        break;
      }
      i = 0;
      break label54;
      if (!((String)localObject1).equals("com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
        break;
      }
      i = 1;
      break label54;
      localObject3 = paramIntent.getStringExtra("message_type");
      localObject1 = localObject3;
      if (localObject3 == null) {
        localObject1 = "gcm";
      }
      i = -1;
      switch (((String)localObject1).hashCode())
      {
      }
      for (;;)
      {
        switch (i)
        {
        case 1: 
        default: 
          paramIntent = String.valueOf(localObject1);
          if (paramIntent.length() == 0) {
            break label2085;
          }
          paramIntent = "Received message with unknown type: ".concat(paramIntent);
          label260:
          Log.w("FirebaseMessaging", paramIntent);
          return;
          if (((String)localObject1).equals("gcm"))
          {
            i = 0;
            continue;
            if (((String)localObject1).equals("deleted_messages"))
            {
              i = 1;
              continue;
              if (((String)localObject1).equals("send_event"))
              {
                i = 2;
                continue;
                if (((String)localObject1).equals("send_error")) {
                  i = 3;
                }
              }
            }
          }
          break;
        }
      }
      Object localObject4;
      if (b(paramIntent.getExtras()))
      {
        localObject1 = paramIntent.getStringExtra("google.c.a.abt");
        if (localObject1 != null)
        {
          localObject4 = Base64.decode((String)localObject1, 0);
          localObject3 = new d();
          if (Log.isLoggable("FirebaseAbtUtil", 2))
          {
            localObject1 = String.valueOf("fcm");
            if (((String)localObject1).length() == 0) {
              break label572;
            }
          }
        }
      }
      label451:
      label478:
      label512:
      Object localObject8;
      label539:
      label572:
      for (localObject1 = "_SE called by ".concat((String)localObject1);; localObject1 = new String("_SE called by "))
      {
        Log.v("FirebaseAbtUtil", (String)localObject1);
        if (e.b(this))
        {
          localObject1 = e.a(this);
          localObject4 = e.a((byte[])localObject4);
          if (localObject4 != null) {
            break label586;
          }
          if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            Log.v("FirebaseAbtUtil", "_SE failed; either _P was not set, or we couldn't deserialize the _P.");
          }
        }
        f.a(this, "_nr", paramIntent);
        localObject3 = paramIntent.getExtras();
        if (localObject3 != null) {
          break label2130;
        }
        localObject3 = new Bundle();
        ((Bundle)localObject3).remove("android.support.content.wakelockid");
        if ((!"1".equals(c.a((Bundle)localObject3, "gcm.n.e"))) && (c.a((Bundle)localObject3, "gcm.n.icon") == null)) {
          break label1210;
        }
        i = 1;
        if (i != 0)
        {
          localObject8 = c.a(this);
          if (!"1".equals(c.a((Bundle)localObject3, "gcm.n.noui"))) {
            break label1215;
          }
          i = 1;
          if (i != 0) {
            break;
          }
          if (b((Bundle)localObject3)) {
            f.a(this, "_nf", paramIntent);
          }
        }
        a(new a((Bundle)localObject3));
        return;
      }
      try
      {
        label586:
        Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty");
        localObject5 = e.a((AppMeasurement)localObject1, "fcm").iterator();
        i = 0;
        for (;;)
        {
          if (!((Iterator)localObject5).hasNext()) {
            break label1095;
          }
          localObject8 = ((Iterator)localObject5).next();
          localObject6 = e.a(localObject8);
          localObject7 = e.b(localObject8);
          l = ((Long)Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mCreationTimestamp").get(localObject8)).longValue();
          if ((a.equals(localObject6)) && (b.equals(localObject7)))
          {
            if (!Log.isLoggable("FirebaseAbtUtil", 2)) {
              break label2133;
            }
            Log.v("FirebaseAbtUtil", String.valueOf(localObject6).length() + 23 + String.valueOf(localObject7).length() + "_E is already set. [" + (String)localObject6 + ", " + (String)localObject7 + "]");
            break label2133;
          }
          int m = 0;
          localObject8 = m;
          int n = localObject8.length;
          j = 0;
          k = m;
          if (j < n)
          {
            if (!a.equals(localObject6)) {
              break;
            }
            if (!Log.isLoggable("FirebaseAbtUtil", 2)) {
              break label2138;
            }
            Log.v("FirebaseAbtUtil", String.valueOf(localObject6).length() + 33 + String.valueOf(localObject7).length() + "_E is found in the _OE list. [" + (String)localObject6 + ", " + (String)localObject7 + "]");
            break label2138;
          }
          if (k == 0)
          {
            if (c <= l) {
              break label1019;
            }
            if (Log.isLoggable("FirebaseAbtUtil", 2)) {
              Log.v("FirebaseAbtUtil", String.valueOf(localObject6).length() + 115 + String.valueOf(localObject7).length() + "Clearing _E as it was not in the _OE list, andits start time is older than the start time of the _E to be set. [" + (String)localObject6 + ", " + (String)localObject7 + "]");
            }
            e.a(this, "fcm", (String)localObject6, (String)localObject7, e.a((gg.b)localObject4, (d)localObject3));
          }
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        for (;;)
        {
          Object localObject5;
          Object localObject6;
          Object localObject7;
          long l;
          int j;
          int k;
          Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", localClassNotFoundException);
          break label451;
          j += 1;
          continue;
          if (Log.isLoggable("FirebaseAbtUtil", 2))
          {
            Log.v("FirebaseAbtUtil", String.valueOf(localObject6).length() + 109 + String.valueOf(localObject7).length() + "_E was not found in the _OE list, but not clearing it as it has a new start time than the _E to be set.  [" + (String)localObject6 + ", " + (String)localObject7 + "]");
            continue;
            if (i != 0)
            {
              if (!Log.isLoggable("FirebaseAbtUtil", 2)) {
                break label451;
              }
              localObject2 = String.valueOf(a);
              localObject3 = String.valueOf(b);
              Log.v("FirebaseAbtUtil", String.valueOf(localObject2).length() + 44 + String.valueOf(localObject3).length() + "_E is already set. Not setting it again [" + (String)localObject2 + ", " + (String)localObject3 + "]");
              break label451;
            }
            e.a((AppMeasurement)localObject2, this, "fcm", (gg.b)localObject4, (d)localObject3);
            break label451;
            i = 0;
            break label512;
            if (((c)localObject8).a())
            {
              i = 0;
              break label539;
            }
            Object localObject2 = ((c)localObject8).b((Bundle)localObject3, "gcm.n.title");
            localObject4 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2)) {
              localObject4 = b.getApplicationInfo().loadLabel(b.getPackageManager());
            }
            String str = ((c)localObject8).b((Bundle)localObject3, "gcm.n.body");
            localObject2 = c.a((Bundle)localObject3, "gcm.n.icon");
            Integer localInteger;
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              localObject5 = b.getResources();
              i = ((Resources)localObject5).getIdentifier((String)localObject2, "drawable", b.getPackageName());
              if (i != 0)
              {
                localInteger = ((c)localObject8).a(c.a((Bundle)localObject3, "gcm.n.color"));
                localObject5 = c.a((Bundle)localObject3, "gcm.n.sound2");
                localObject2 = localObject5;
                if (TextUtils.isEmpty((CharSequence)localObject5)) {
                  localObject2 = c.a((Bundle)localObject3, "gcm.n.sound");
                }
                if (!TextUtils.isEmpty((CharSequence)localObject2)) {
                  break label1771;
                }
                localObject2 = null;
                localObject7 = ((c)localObject8).a((Bundle)localObject3);
                localObject6 = null;
                localObject5 = localObject7;
                if (b((Bundle)localObject3))
                {
                  localObject5 = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                  c.a((Intent)localObject5, (Bundle)localObject3);
                  ((Intent)localObject5).putExtra("pending_intent", (Parcelable)localObject7);
                  localObject5 = g.a(b, c.incrementAndGet(), (Intent)localObject5);
                  localObject6 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                  c.a((Intent)localObject6, (Bundle)localObject3);
                  localObject6 = g.a(b, c.incrementAndGet(), (Intent)localObject6);
                }
                if ((!i.g()) || (b.getApplicationInfo().targetSdkVersion <= 25)) {
                  break label1906;
                }
              }
            }
            for (localObject2 = ((c)localObject8).a((CharSequence)localObject4, str, i, localInteger, (Uri)localObject2, (PendingIntent)localObject5, (PendingIntent)localObject6, ((c)localObject8).b(c.a((Bundle)localObject3, "gcm.n.android_channel_id")));; localObject2 = ((ab.d)localObject7).b())
            {
              localObject5 = c.a((Bundle)localObject3, "gcm.n.tag");
              if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
              }
              localObject6 = (NotificationManager)b.getSystemService("notification");
              localObject4 = localObject5;
              if (TextUtils.isEmpty((CharSequence)localObject5))
              {
                l = SystemClock.uptimeMillis();
                localObject4 = 37 + "FCM-Notification:" + l;
              }
              ((NotificationManager)localObject6).notify((String)localObject4, 0, (Notification)localObject2);
              i = 1;
              break;
              j = ((Resources)localObject5).getIdentifier((String)localObject2, "mipmap", b.getPackageName());
              i = j;
              if (j != 0) {
                break label1335;
              }
              Log.w("FirebaseMessaging", String.valueOf(localObject2).length() + 61 + "Icon resource " + (String)localObject2 + " not found. Notification will use default icon.");
              i = ((c)localObject8).b().getInt("com.google.firebase.messaging.default_notification_icon", 0);
              j = i;
              if (i == 0) {
                j = b.getApplicationInfo().icon;
              }
              i = j;
              if (j != 0) {
                break label1335;
              }
              i = 17301651;
              break label1335;
              if ((!"default".equals(localObject2)) && (b.getResources().getIdentifier((String)localObject2, "raw", b.getPackageName()) != 0))
              {
                localObject5 = String.valueOf("android.resource://");
                localObject6 = String.valueOf(b.getPackageName());
                localObject2 = Uri.parse(String.valueOf(localObject5).length() + 5 + String.valueOf(localObject6).length() + String.valueOf(localObject2).length() + (String)localObject5 + (String)localObject6 + "/raw/" + (String)localObject2);
                break label1393;
              }
              localObject2 = RingtoneManager.getDefaultUri(2);
              break label1393;
              localObject7 = new ab.d(b).a().a(i);
              if (!TextUtils.isEmpty((CharSequence)localObject4)) {
                ((ab.d)localObject7).a((CharSequence)localObject4);
              }
              if (!TextUtils.isEmpty(str))
              {
                ((ab.d)localObject7).b(str);
                ((ab.d)localObject7).a(new ab.c().a(str));
              }
              if (localInteger != null) {
                z = localInteger.intValue();
              }
              if (localObject2 != null) {
                ((ab.d)localObject7).a((Uri)localObject2);
              }
              if (localObject5 != null) {
                d = ((PendingIntent)localObject5);
              }
              if (localObject6 != null) {
                F.deleteIntent = ((PendingIntent)localObject6);
              }
            }
            paramIntent.getStringExtra("google.message_id");
            return;
            if (paramIntent.getStringExtra("google.message_id") == null) {
              paramIntent.getStringExtra("message_id");
            }
            new b(paramIntent.getStringExtra("error"));
            return;
            paramIntent = new String("Received message with unknown type: ");
            break label260;
            if (!b(paramIntent.getExtras())) {
              break label105;
            }
            f.a(this, "_nd", paramIntent);
            return;
            paramIntent = new String("Unknown intent action: ");
            break;
            break label478;
            i = 1;
            continue;
            k = 1;
          }
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        label1019:
        label1095:
        label1210:
        label1215:
        label1335:
        label1393:
        label1771:
        label1906:
        label2085:
        label2130:
        label2133:
        label2138:
        for (;;) {}
      }
    }
  }
  
  protected final Intent c(Intent paramIntent)
  {
    return (Intent)ab.poll();
  }
}


/* Location:              com/google/firebase/messaging/FirebaseMessagingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */