package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.b.ab.c;
import android.support.v4.b.ab.d;
import android.support.v4.b.ab.q;
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
    Object localObject = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      if (localObject != null)
      {
        String str = "google.c.";
        bool = ((String)localObject).startsWith(str);
        if (bool) {
          localIterator.remove();
        }
      }
    }
  }
  
  private static boolean b(Bundle paramBundle)
  {
    boolean bool;
    String str1;
    if (paramBundle == null)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      str1 = "1";
      String str2 = paramBundle.getString("google.c.a.e");
      bool = str1.equals(str2);
    }
  }
  
  public void a(a parama) {}
  
  public final boolean a(Intent paramIntent)
  {
    int i = 3;
    Object localObject1 = "com.google.firebase.messaging.NOTIFICATION_OPEN";
    String str2 = paramIntent.getAction();
    boolean bool1 = ((String)localObject1).equals(str2);
    if (bool1)
    {
      localObject1 = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
      if (localObject1 == null) {}
    }
    for (;;)
    {
      try
      {
        ((PendingIntent)localObject1).send();
        localObject1 = paramIntent.getExtras();
        bool1 = b((Bundle)localObject1);
        if (bool1)
        {
          if (paramIntent != null)
          {
            localObject1 = paramIntent.getStringExtra("google.c.a.tc");
            str2 = "1";
            bool1 = str2.equals(localObject1);
            if (!bool1) {
              continue;
            }
            localObject1 = f.a(this);
            str2 = "FirebaseMessaging";
            boolean bool2 = Log.isLoggable(str2, i);
            Object localObject2;
            if (bool2)
            {
              str2 = "FirebaseMessaging";
              localObject2 = "Received event with track-conversion=true. Setting user property and reengagement event";
              Log.d(str2, (String)localObject2);
            }
            if (localObject1 != null)
            {
              str2 = paramIntent.getStringExtra("google.c.a.c_id");
              ((AppMeasurement)localObject1).zzb("fcm", "_ln", str2);
              localObject2 = new android/os/Bundle;
              ((Bundle)localObject2).<init>();
              ((Bundle)localObject2).putString("source", "Firebase");
              String str3 = "notification";
              ((Bundle)localObject2).putString("medium", str3);
              ((Bundle)localObject2).putString("campaign", str2);
              str2 = "fcm";
              String str4 = "_cmp";
              ((AppMeasurement)localObject1).logEventInternal(str2, str4, (Bundle)localObject2);
            }
          }
          else
          {
            localObject1 = "_no";
            f.a(this, (String)localObject1, paramIntent);
          }
        }
        else
        {
          bool1 = true;
          return bool1;
        }
      }
      catch (PendingIntent.CanceledException localCanceledException)
      {
        str1 = "FirebaseMessaging";
        str2 = "Notification pending intent canceled";
        Log.e(str1, str2);
        continue;
        str1 = "FirebaseMessaging";
        str2 = "Unable to set user property for conversion tracking:  analytics library is missing";
        Log.w(str1, str2);
        continue;
        str1 = "FirebaseMessaging";
        bool1 = Log.isLoggable(str1, i);
        if (!bool1) {
          continue;
        }
        str1 = "FirebaseMessaging";
        str2 = "Received event with track-conversion=false. Do not set user property";
        Log.d(str1, str2);
        continue;
      }
      bool1 = false;
      String str1 = null;
    }
  }
  
  public final void b(Intent paramIntent)
  {
    Object localObject1 = paramIntent.getAction();
    if (localObject1 == null) {
      localObject1 = "";
    }
    int i = -1;
    float f = 0.0F / 0.0F;
    int m = ((String)localObject1).hashCode();
    label52:
    int i1;
    switch (m)
    {
    default: 
      i1 = i;
    }
    Object localObject3;
    Object localObject4;
    int i3;
    for (;;)
    {
      switch (i1)
      {
      default: 
        localObject3 = "FirebaseMessaging";
        localObject4 = "Unknown intent action: ";
        localObject1 = String.valueOf(paramIntent.getAction());
        i3 = ((String)localObject1).length();
        if (i3 == 0) {
          break label3092;
        }
        localObject1 = ((String)localObject4).concat((String)localObject1);
        Log.d((String)localObject3, (String)localObject1);
        label121:
        return;
        localObject4 = "com.google.android.c2dm.intent.RECEIVE";
        i2 = ((String)localObject1).equals(localObject4);
        if (i2 == 0) {
          break label52;
        }
        i2 = 0;
        localObject1 = null;
        continue;
        localObject4 = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        i2 = ((String)localObject1).equals(localObject4);
        if (i2 == 0) {
          break label52;
        }
        i2 = 1;
      }
    }
    Object localObject5 = paramIntent;
    localObject1 = paramIntent.getStringExtra("message_type");
    if (localObject1 == null) {
      localObject1 = "gcm";
    }
    i = -1;
    f = 0.0F / 0.0F;
    m = ((String)localObject1).hashCode();
    switch (m)
    {
    }
    for (;;)
    {
      switch (i)
      {
      case 1: 
      default: 
        localObject3 = "FirebaseMessaging";
        localObject4 = "Received message with unknown type: ";
        localObject1 = String.valueOf(localObject1);
        i3 = ((String)localObject1).length();
        if (i3 == 0) {
          break label3047;
        }
        localObject1 = ((String)localObject4).concat((String)localObject1);
        label307:
        Log.w((String)localObject3, (String)localObject1);
        break label121;
        localObject4 = "gcm";
        boolean bool3 = ((String)localObject1).equals(localObject4);
        if (bool3)
        {
          i = 0;
          f = 0.0F;
          localObject3 = null;
          continue;
          localObject4 = "deleted_messages";
          bool3 = ((String)localObject1).equals(localObject4);
          if (bool3)
          {
            i = 1;
            f = Float.MIN_VALUE;
            continue;
            localObject4 = "send_event";
            bool3 = ((String)localObject1).equals(localObject4);
            if (bool3)
            {
              i = 2;
              f = 2.8E-45F;
              continue;
              localObject4 = "send_error";
              bool3 = ((String)localObject1).equals(localObject4);
              if (bool3)
              {
                i = 3;
                f = 4.2E-45F;
              }
            }
          }
        }
        break;
      }
    }
    localObject1 = paramIntent.getExtras();
    int i2 = b((Bundle)localObject1);
    Object localObject6;
    Object localObject7;
    int n;
    Object localObject8;
    label530:
    Object localObject9;
    if (i2 != 0)
    {
      localObject5 = paramIntent;
      localObject1 = paramIntent.getStringExtra("google.c.a.abt");
      if (localObject1 != null)
      {
        i = 0;
        f = 0.0F;
        localObject3 = Base64.decode((String)localObject1, 0);
        localObject6 = "fcm";
        localObject7 = new com/google/firebase/messaging/d;
        ((d)localObject7).<init>();
        localObject1 = "FirebaseAbtUtil";
        n = 2;
        i2 = Log.isLoggable((String)localObject1, n);
        if (i2 != 0)
        {
          localObject4 = "FirebaseAbtUtil";
          localObject8 = "_SE called by ";
          localObject1 = String.valueOf(localObject6);
          int i6 = ((String)localObject1).length();
          if (i6 == 0) {
            break label768;
          }
          localObject1 = ((String)localObject8).concat((String)localObject1);
          Log.v((String)localObject4, (String)localObject1);
        }
        i2 = e.b(this);
        if (i2 != 0)
        {
          localObject8 = e.a(this);
          localObject9 = e.a((byte[])localObject3);
          if (localObject9 != null) {
            break label781;
          }
          localObject1 = "FirebaseAbtUtil";
          i = 2;
          f = 2.8E-45F;
          i2 = Log.isLoggable((String)localObject1, i);
          if (i2 != 0)
          {
            localObject1 = "FirebaseAbtUtil";
            localObject3 = "_SE failed; either _P was not set, or we couldn't deserialize the _P.";
            Log.v((String)localObject1, (String)localObject3);
          }
        }
      }
      label601:
      localObject1 = "_nr";
      localObject5 = this;
      f.a(this, (String)localObject1, paramIntent);
    }
    else
    {
      localObject1 = paramIntent.getExtras();
      if (localObject1 != null) {
        break label3105;
      }
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
    }
    label680:
    label768:
    label781:
    label1524:
    label1675:
    Object localObject2;
    label1889:
    label1906:
    label2033:
    label2101:
    label2610:
    label2811:
    label3047:
    label3092:
    label3105:
    for (Object localObject10 = localObject1;; localObject10 = localObject2)
    {
      ((Bundle)localObject10).remove("android.support.content.wakelockid");
      localObject1 = "1";
      localObject3 = c.a((Bundle)localObject10, "gcm.n.e");
      i2 = ((String)localObject1).equals(localObject3);
      if (i2 == 0)
      {
        localObject1 = c.a((Bundle)localObject10, "gcm.n.icon");
        if (localObject1 == null) {}
      }
      else
      {
        i2 = 1;
        if (i2 != 0)
        {
          localObject1 = c.a(this);
          localObject3 = "1";
          localObject4 = c.a((Bundle)localObject10, "gcm.n.noui");
          boolean bool1 = ((String)localObject3).equals(localObject4);
          if (!bool1) {
            break label1889;
          }
          i2 = 1;
        }
      }
      Object localObject11;
      Object localObject12;
      Object localObject13;
      int i10;
      int i11;
      boolean bool2;
      while (i2 == 0)
      {
        i2 = b((Bundle)localObject10);
        if (i2 != 0)
        {
          localObject1 = "_nf";
          localObject5 = this;
          f.a(this, (String)localObject1, paramIntent);
        }
        localObject1 = new com/google/firebase/messaging/a;
        ((a)localObject1).<init>((Bundle)localObject10);
        localObject5 = this;
        a((a)localObject1);
        break;
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject8);
        break label530;
        localObject1 = "com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty";
        try
        {
          Class.forName((String)localObject1);
          localObject3 = e.a((AppMeasurement)localObject8, (String)localObject6);
          i2 = 0;
          localObject1 = null;
          localObject11 = ((List)localObject3).iterator();
          n = 0;
          localObject4 = null;
          for (;;)
          {
            i2 = ((Iterator)localObject11).hasNext();
            if (i2 == 0) {
              break label1675;
            }
            localObject1 = ((Iterator)localObject11).next();
            localObject12 = e.a(localObject1);
            localObject10 = e.b(localObject1);
            localObject3 = "com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty";
            localObject3 = Class.forName((String)localObject3);
            localObject13 = "mCreationTimestamp";
            localObject3 = ((Class)localObject3).getField((String)localObject13);
            localObject1 = ((Field)localObject3).get(localObject1);
            localObject1 = (Long)localObject1;
            long l1 = ((Long)localObject1).longValue();
            localObject1 = a;
            i2 = ((String)localObject1).equals(localObject12);
            if (i2 != 0)
            {
              localObject1 = b;
              i2 = ((String)localObject1).equals(localObject10);
              if (i2 != 0)
              {
                localObject1 = "FirebaseAbtUtil";
                j = 2;
                f = 2.8E-45F;
                i2 = Log.isLoggable((String)localObject1, j);
                if (i2 != 0)
                {
                  localObject1 = "FirebaseAbtUtil";
                  localObject3 = String.valueOf(localObject12);
                  j = ((String)localObject3).length() + 23;
                  localObject4 = String.valueOf(localObject10);
                  n = ((String)localObject4).length();
                  j += n;
                  localObject4 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject4).<init>(j);
                  localObject3 = "_E is already set. [";
                  localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
                  localObject3 = ((StringBuilder)localObject3).append((String)localObject12);
                  localObject4 = ", ";
                  localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                  localObject3 = ((StringBuilder)localObject3).append((String)localObject10);
                  localObject4 = "]";
                  localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                  localObject3 = ((StringBuilder)localObject3).toString();
                  Log.v((String)localObject1, (String)localObject3);
                }
                i2 = 1;
                n = i2;
                continue;
              }
            }
            i2 = 0;
            localObject1 = null;
            Object localObject14 = m;
            int i8 = localObject14.length;
            j = 0;
            f = 0.0F;
            localObject3 = null;
            if (j < i8)
            {
              Object localObject15 = localObject14[j];
              localObject5 = localObject15;
              localObject5 = a;
              localObject15 = localObject5;
              boolean bool8 = ((String)localObject5).equals(localObject12);
              if (!bool8) {
                break;
              }
              localObject1 = "FirebaseAbtUtil";
              j = 2;
              f = 2.8E-45F;
              i2 = Log.isLoggable((String)localObject1, j);
              if (i2 != 0)
              {
                localObject1 = "FirebaseAbtUtil";
                localObject3 = String.valueOf(localObject12);
                j = ((String)localObject3).length() + 33;
                localObject14 = String.valueOf(localObject10);
                int i9 = ((String)localObject14).length();
                j += i9;
                localObject14 = new java/lang/StringBuilder;
                ((StringBuilder)localObject14).<init>(j);
                localObject3 = "_E is found in the _OE list. [";
                localObject3 = ((StringBuilder)localObject14).append((String)localObject3);
                localObject3 = ((StringBuilder)localObject3).append((String)localObject12);
                localObject14 = ", ";
                localObject3 = ((StringBuilder)localObject3).append((String)localObject14);
                localObject3 = ((StringBuilder)localObject3).append((String)localObject10);
                localObject14 = "]";
                localObject3 = ((StringBuilder)localObject3).append((String)localObject14);
                localObject3 = ((StringBuilder)localObject3).toString();
                Log.v((String)localObject1, (String)localObject3);
              }
              i2 = 1;
            }
            if (i2 == 0)
            {
              long l2 = c;
              i2 = l2 < l1;
              if (i2 <= 0) {
                break label1524;
              }
              localObject1 = "FirebaseAbtUtil";
              j = 2;
              f = 2.8E-45F;
              i2 = Log.isLoggable((String)localObject1, j);
              if (i2 != 0)
              {
                localObject1 = "FirebaseAbtUtil";
                localObject3 = String.valueOf(localObject12);
                j = ((String)localObject3).length() + 115;
                localObject13 = String.valueOf(localObject10);
                i10 = ((String)localObject13).length();
                j += i10;
                localObject13 = new java/lang/StringBuilder;
                ((StringBuilder)localObject13).<init>(j);
                localObject3 = "Clearing _E as it was not in the _OE list, andits start time is older than the start time of the _E to be set. [";
                localObject3 = ((StringBuilder)localObject13).append((String)localObject3);
                localObject3 = ((StringBuilder)localObject3).append((String)localObject12);
                localObject13 = ", ";
                localObject3 = ((StringBuilder)localObject3).append((String)localObject13);
                localObject3 = ((StringBuilder)localObject3).append((String)localObject10);
                localObject13 = "]";
                localObject3 = ((StringBuilder)localObject3).append((String)localObject13);
                localObject3 = ((StringBuilder)localObject3).toString();
                Log.v((String)localObject1, (String)localObject3);
              }
              localObject1 = e.a((gg.b)localObject9, (d)localObject7);
              localObject5 = this;
              e.a(this, (String)localObject6, (String)localObject12, (String)localObject10, (String)localObject1);
            }
          }
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          for (;;)
          {
            localObject3 = "FirebaseAbtUtil";
            localObject4 = "Could not complete the operation due to an internal error.";
            Log.e((String)localObject3, (String)localObject4, localClassNotFoundException);
            break;
            j += 1;
            continue;
            String str1 = "FirebaseAbtUtil";
            j = 2;
            f = 2.8E-45F;
            i2 = Log.isLoggable(str1, j);
            if (i2 != 0)
            {
              str1 = "FirebaseAbtUtil";
              localObject3 = String.valueOf(localObject12);
              j = ((String)localObject3).length() + 109;
              localObject13 = String.valueOf(localObject10);
              i10 = ((String)localObject13).length();
              j += i10;
              localObject13 = new java/lang/StringBuilder;
              ((StringBuilder)localObject13).<init>(j);
              localObject3 = "_E was not found in the _OE list, but not clearing it as it has a new start time than the _E to be set.  [";
              localObject3 = ((StringBuilder)localObject13).append((String)localObject3);
              localObject3 = ((StringBuilder)localObject3).append((String)localObject12);
              localObject12 = ", ";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject12);
              localObject3 = ((StringBuilder)localObject3).append((String)localObject10);
              localObject12 = "]";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject12);
              localObject3 = ((StringBuilder)localObject3).toString();
              Log.v(str1, (String)localObject3);
            }
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          int j;
          for (;;) {}
          if (n != 0)
          {
            String str2 = "FirebaseAbtUtil";
            j = 2;
            f = 2.8E-45F;
            i2 = Log.isLoggable(str2, j);
            if (i2 == 0) {
              break label601;
            }
            str2 = "FirebaseAbtUtil";
            localObject3 = a;
            localObject3 = String.valueOf(localObject3);
            localObject4 = b;
            localObject4 = String.valueOf(localObject4);
            localObject6 = String.valueOf(localObject3);
            i3 = ((String)localObject6).length() + 44;
            localObject7 = String.valueOf(localObject4);
            i11 = ((String)localObject7).length();
            i3 += i11;
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>(i3);
            localObject6 = "_E is already set. Not setting it again [";
            localObject6 = ((StringBuilder)localObject7).append((String)localObject6);
            localObject3 = ((StringBuilder)localObject6).append((String)localObject3);
            localObject6 = ", ";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            localObject4 = "]";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            localObject3 = ((StringBuilder)localObject3).toString();
            Log.v(str2, (String)localObject3);
          }
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          for (;;) {}
          localObject5 = this;
          e.a((AppMeasurement)localObject8, this, (String)localObject6, (gg.b)localObject9, (d)localObject7);
        }
        break label601;
        i2 = 0;
        localObject2 = null;
        break label680;
        bool2 = ((c)localObject2).a();
        if (!bool2) {
          break label1906;
        }
        i2 = 0;
        localObject2 = null;
      }
      localObject3 = ((c)localObject2).b((Bundle)localObject10, "gcm.n.title");
      boolean bool4 = TextUtils.isEmpty((CharSequence)localObject3);
      if (bool4)
      {
        localObject3 = b.getApplicationInfo();
        localObject4 = b.getPackageManager();
        localObject3 = ((ApplicationInfo)localObject3).loadLabel((PackageManager)localObject4);
      }
      localObject4 = ((c)localObject2).b((Bundle)localObject10, "gcm.n.body");
      localObject6 = "gcm.n.icon";
      localObject7 = c.a((Bundle)localObject10, (String)localObject6);
      boolean bool5 = TextUtils.isEmpty((CharSequence)localObject7);
      int i4;
      boolean bool7;
      int i12;
      int i14;
      if (!bool5)
      {
        localObject8 = b.getResources();
        localObject6 = "drawable";
        localObject9 = b.getPackageName();
        i4 = ((Resources)localObject8).getIdentifier((String)localObject7, (String)localObject6, (String)localObject9);
        if (i4 != 0)
        {
          localObject7 = c.a((Bundle)localObject10, "gcm.n.color");
          localObject7 = ((c)localObject2).a((String)localObject7);
          localObject8 = c.a((Bundle)localObject10, "gcm.n.sound2");
          bool7 = TextUtils.isEmpty((CharSequence)localObject8);
          if (bool7) {
            localObject8 = c.a((Bundle)localObject10, "gcm.n.sound");
          }
          bool7 = TextUtils.isEmpty((CharSequence)localObject8);
          if (!bool7) {
            break label2610;
          }
          i12 = 0;
          localObject8 = null;
          localObject9 = ((c)localObject2).a((Bundle)localObject10);
          localObject11 = null;
          boolean bool9 = b((Bundle)localObject10);
          if (bool9)
          {
            localObject11 = new android/content/Intent;
            ((Intent)localObject11).<init>("com.google.firebase.messaging.NOTIFICATION_OPEN");
            c.a((Intent)localObject11, (Bundle)localObject10);
            ((Intent)localObject11).putExtra("pending_intent", (Parcelable)localObject9);
            localObject9 = b;
            int i13 = c.incrementAndGet();
            localObject9 = g.a((Context)localObject9, i13, (Intent)localObject11);
            localObject11 = new android/content/Intent;
            ((Intent)localObject11).<init>("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            c.a((Intent)localObject11, (Bundle)localObject10);
            localObject12 = b;
            localObject13 = c;
            i10 = ((AtomicInteger)localObject13).incrementAndGet();
            localObject11 = g.a((Context)localObject12, i10, (Intent)localObject11);
          }
          boolean bool10 = i.g();
          if (!bool10) {
            break label2811;
          }
          localObject12 = b.getApplicationInfo();
          i14 = targetSdkVersion;
          i10 = 25;
          if (i14 <= i10) {
            break label2811;
          }
          localObject12 = c.a((Bundle)localObject10, "gcm.n.android_channel_id");
          localObject12 = ((c)localObject2).b((String)localObject12);
        }
      }
      for (localObject3 = ((c)localObject2).a((CharSequence)localObject3, (String)localObject4, i4, (Integer)localObject7, (Uri)localObject8, (PendingIntent)localObject9, (PendingIntent)localObject11, (String)localObject12);; localObject3 = ((ab.d)localObject6).b())
      {
        localObject4 = c.a((Bundle)localObject10, "gcm.n.tag");
        localObject6 = "FirebaseMessaging";
        i11 = 3;
        boolean bool6 = Log.isLoggable((String)localObject6, i11);
        if (bool6)
        {
          localObject6 = "FirebaseMessaging";
          localObject7 = "Showing notification";
          Log.d((String)localObject6, (String)localObject7);
        }
        localObject2 = b;
        localObject6 = "notification";
        localObject2 = (NotificationManager)((Context)localObject2).getSystemService((String)localObject6);
        bool6 = TextUtils.isEmpty((CharSequence)localObject4);
        if (bool6)
        {
          long l3 = SystemClock.uptimeMillis();
          i11 = 37;
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>(i11);
          localObject7 = ((StringBuilder)localObject8).append("FCM-Notification:");
          localObject4 = l3;
        }
        bool6 = false;
        localObject6 = null;
        ((NotificationManager)localObject2).notify((String)localObject4, 0, (Notification)localObject3);
        i2 = 1;
        break;
        localObject6 = "mipmap";
        localObject9 = b.getPackageName();
        int i5 = ((Resources)localObject8).getIdentifier((String)localObject7, (String)localObject6, (String)localObject9);
        if (i5 != 0) {
          break label2033;
        }
        localObject6 = "FirebaseMessaging";
        i12 = String.valueOf(localObject7).length() + 61;
        localObject9 = new java/lang/StringBuilder;
        ((StringBuilder)localObject9).<init>(i12);
        localObject7 = ((StringBuilder)localObject9).append("Icon resource ").append((String)localObject7);
        localObject8 = " not found. Notification will use default icon.";
        localObject7 = (String)localObject8;
        Log.w((String)localObject6, (String)localObject7);
        localObject6 = ((c)localObject2).b();
        localObject7 = "com.google.firebase.messaging.default_notification_icon";
        i12 = 0;
        localObject8 = null;
        i5 = ((Bundle)localObject6).getInt((String)localObject7, 0);
        if (i5 == 0)
        {
          localObject6 = b.getApplicationInfo();
          i5 = icon;
        }
        if (i5 != 0) {
          break label2033;
        }
        i5 = 17301651;
        break label2033;
        localObject9 = "default";
        bool7 = ((String)localObject9).equals(localObject8);
        if (!bool7)
        {
          localObject9 = b.getResources();
          localObject11 = "raw";
          localObject12 = b.getPackageName();
          int i7 = ((Resources)localObject9).getIdentifier((String)localObject8, (String)localObject11, (String)localObject12);
          if (i7 != 0)
          {
            localObject9 = String.valueOf("android.resource://");
            localObject11 = String.valueOf(b.getPackageName());
            localObject12 = String.valueOf(localObject9);
            i14 = ((String)localObject12).length() + 5;
            i10 = String.valueOf(localObject11).length();
            i14 += i10;
            i10 = String.valueOf(localObject8).length();
            i14 += i10;
            localObject13 = new java/lang/StringBuilder;
            ((StringBuilder)localObject13).<init>(i14);
            localObject9 = ((StringBuilder)localObject13).append((String)localObject9).append((String)localObject11);
            localObject11 = "/raw/";
            localObject9 = ((StringBuilder)localObject9).append((String)localObject11);
            localObject8 = Uri.parse((String)localObject8);
            break label2101;
          }
        }
        i12 = 2;
        localObject8 = RingtoneManager.getDefaultUri(i12);
        break label2101;
        localObject12 = new android/support/v4/b/ab$d;
        localObject13 = b;
        ((ab.d)localObject12).<init>((Context)localObject13);
        localObject12 = ((ab.d)localObject12).a();
        localObject6 = ((ab.d)localObject12).a(i5);
        boolean bool11 = TextUtils.isEmpty((CharSequence)localObject3);
        if (!bool11) {
          ((ab.d)localObject6).a((CharSequence)localObject3);
        }
        bool2 = TextUtils.isEmpty((CharSequence)localObject4);
        if (!bool2)
        {
          ((ab.d)localObject6).b((CharSequence)localObject4);
          localObject3 = new android/support/v4/b/ab$c;
          ((ab.c)localObject3).<init>();
          localObject3 = ((ab.c)localObject3).a((CharSequence)localObject4);
          ((ab.d)localObject6).a((ab.q)localObject3);
        }
        if (localObject7 != null)
        {
          int k = ((Integer)localObject7).intValue();
          z = k;
        }
        if (localObject8 != null) {
          ((ab.d)localObject6).a((Uri)localObject8);
        }
        if (localObject9 != null) {
          d = ((PendingIntent)localObject9);
        }
        if (localObject11 != null)
        {
          localObject3 = F;
          deleteIntent = ((PendingIntent)localObject11);
        }
      }
      localObject2 = "google.message_id";
      localObject5 = paramIntent;
      paramIntent.getStringExtra((String)localObject2);
      break label121;
      localObject5 = paramIntent;
      localObject2 = paramIntent.getStringExtra("google.message_id");
      if (localObject2 == null)
      {
        localObject2 = "message_id";
        paramIntent.getStringExtra((String)localObject2);
      }
      localObject2 = new com/google/firebase/messaging/b;
      localObject5 = paramIntent;
      localObject3 = paramIntent.getStringExtra("error");
      ((b)localObject2).<init>((String)localObject3);
      break label121;
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>((String)localObject4);
      break label307;
      localObject2 = paramIntent.getExtras();
      i2 = b((Bundle)localObject2);
      if (i2 == 0) {
        break label121;
      }
      localObject2 = "_nd";
      localObject5 = this;
      f.a(this, (String)localObject2, paramIntent);
      break label121;
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>((String)localObject4);
      break;
    }
  }
  
  protected final Intent c(Intent paramIntent)
  {
    return (Intent)ab.poll();
  }
}


/* Location:              com/google/firebase/messaging/FirebaseMessagingService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */