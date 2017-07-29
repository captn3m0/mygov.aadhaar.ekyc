package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.Style;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.c.a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.a.b;
import com.google.android.gms.common.util.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

final class c
{
  static c a;
  final Context b;
  final AtomicInteger c;
  private Bundle d;
  private Method e;
  private Method f;
  
  private c(Context paramContext)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicInteger;
    int i = (int)SystemClock.elapsedRealtime();
    ((AtomicInteger)localObject).<init>(i);
    c = ((AtomicInteger)localObject);
    localObject = paramContext.getApplicationContext();
    b = ((Context)localObject);
  }
  
  static c a(Context paramContext)
  {
    synchronized (c.class)
    {
      c localc = a;
      if (localc == null)
      {
        localc = new com/google/firebase/messaging/c;
        localc.<init>(paramContext);
        a = localc;
      }
      localc = a;
      return localc;
    }
  }
  
  static String a(Bundle paramBundle, String paramString)
  {
    String str1 = paramBundle.getString(paramString);
    if (str1 == null)
    {
      String str2 = "gcm.notification.";
      str1 = paramString.replace("gcm.n.", str2);
      str1 = paramBundle.getString(str1);
    }
    return str1;
  }
  
  static void a(Intent paramIntent, Bundle paramBundle)
  {
    Object localObject = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = "google.c.a.";
      boolean bool2 = ((String)localObject).startsWith(str);
      if (!bool2)
      {
        str = "from";
        bool2 = ((String)localObject).equals(str);
        if (!bool2) {}
      }
      else
      {
        str = paramBundle.getString((String)localObject);
        paramIntent.putExtra((String)localObject, str);
      }
    }
  }
  
  private static Object[] c(Bundle paramBundle, String paramString)
  {
    String str1 = String.valueOf(paramString);
    Object localObject1 = String.valueOf("_loc_args");
    int i = ((String)localObject1).length();
    String str2;
    if (i != 0)
    {
      localObject1 = str1.concat((String)localObject1);
      str2 = a(paramBundle, (String)localObject1);
      boolean bool = TextUtils.isEmpty(str2);
      if (!bool) {
        break label66;
      }
      bool = false;
      localObject1 = null;
    }
    label66:
    Object localObject3;
    int j;
    int m;
    Object localObject4;
    Object localObject2;
    for (;;)
    {
      return (Object[])localObject1;
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>(str1);
      break;
      try
      {
        localObject3 = new org/json/JSONArray;
        ((JSONArray)localObject3).<init>(str2);
        j = ((JSONArray)localObject3).length();
        localObject1 = new String[j];
        int k = 0;
        str1 = null;
        for (;;)
        {
          m = localObject1.length;
          if (k >= m) {
            break;
          }
          localObject4 = ((JSONArray)localObject3).opt(k);
          localObject1[k] = localObject4;
          k += 1;
        }
        localObject2 = ((String)localObject3).concat((String)localObject2);
      }
      catch (JSONException localJSONException)
      {
        str1 = "FirebaseMessaging";
        localObject3 = String.valueOf(paramString);
        localObject2 = String.valueOf("_loc_args");
        m = ((String)localObject2).length();
        if (m == 0) {}
      }
    }
    for (;;)
    {
      localObject2 = String.valueOf(((String)localObject2).substring(6));
      int n = String.valueOf(localObject2).length() + 41;
      m = String.valueOf(str2).length();
      n += m;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>(n);
      localObject2 = ((StringBuilder)localObject4).append("Malformed ").append((String)localObject2);
      localObject3 = ": ";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(str2);
      str2 = "  Default value will be used.";
      localObject2 = str2;
      Log.w(str1, (String)localObject2);
      j = 0;
      localObject2 = null;
      break;
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>((String)localObject3);
    }
  }
  
  final Notification a(CharSequence paramCharSequence, String paramString1, int paramInt, Integer paramInteger, Uri paramUri, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, String paramString2)
  {
    boolean bool1 = true;
    Object localObject1 = new android/app/Notification$Builder;
    Object localObject2 = b;
    ((Notification.Builder)localObject1).<init>((Context)localObject2);
    localObject1 = ((Notification.Builder)localObject1).setAutoCancel(bool1);
    localObject2 = ((Notification.Builder)localObject1).setSmallIcon(paramInt);
    boolean bool2 = TextUtils.isEmpty(paramCharSequence);
    if (!bool2) {
      ((Notification.Builder)localObject2).setContentTitle(paramCharSequence);
    }
    bool2 = TextUtils.isEmpty(paramString1);
    if (!bool2)
    {
      ((Notification.Builder)localObject2).setContentText(paramString1);
      localObject1 = new android/app/Notification$BigTextStyle;
      ((Notification.BigTextStyle)localObject1).<init>();
      localObject1 = ((Notification.BigTextStyle)localObject1).bigText(paramString1);
      ((Notification.Builder)localObject2).setStyle((Notification.Style)localObject1);
    }
    if (paramInteger != null)
    {
      int i = paramInteger.intValue();
      ((Notification.Builder)localObject2).setColor(i);
    }
    if (paramUri != null) {
      ((Notification.Builder)localObject2).setSound(paramUri);
    }
    if (paramPendingIntent1 != null) {
      ((Notification.Builder)localObject2).setContentIntent(paramPendingIntent1);
    }
    if (paramPendingIntent2 != null) {
      ((Notification.Builder)localObject2).setDeleteIntent(paramPendingIntent2);
    }
    if (paramString2 != null) {}
    try
    {
      localObject1 = e;
      if (localObject1 == null)
      {
        localObject1 = localObject2.getClass();
        localObject3 = "setChannel";
        j = 1;
        localObject4 = new Class[j];
        Class localClass = String.class;
        localObject4[0] = localClass;
        localObject1 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
        e = ((Method)localObject1);
      }
      localObject1 = e;
      bool1 = true;
      localObject3 = new Object[bool1];
      int j = 0;
      localObject4 = null;
      localObject3[0] = paramString2;
      ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        localObject3 = "FirebaseMessaging";
        localObject4 = "Error while setting the notification channel";
        Log.e((String)localObject3, (String)localObject4, localNoSuchMethodException);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localObject3 = "FirebaseMessaging";
        localObject4 = "Error while setting the notification channel";
        Log.e((String)localObject3, (String)localObject4, localIllegalAccessException);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        localObject3 = "FirebaseMessaging";
        localObject4 = "Error while setting the notification channel";
        Log.e((String)localObject3, (String)localObject4, localInvocationTargetException);
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        localObject3 = "FirebaseMessaging";
        localObject4 = "Error while setting the notification channel";
        Log.e((String)localObject3, (String)localObject4, localSecurityException);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localObject3 = "FirebaseMessaging";
        localObject4 = "Error while setting the notification channel";
        Log.e((String)localObject3, (String)localObject4, localIllegalArgumentException);
      }
    }
    catch (LinkageError localLinkageError)
    {
      for (;;)
      {
        Object localObject3 = "FirebaseMessaging";
        Object localObject4 = "Error while setting the notification channel";
        Log.e((String)localObject3, (String)localObject4, localLinkageError);
      }
    }
    return ((Notification.Builder)localObject2).build();
  }
  
  final PendingIntent a(Bundle paramBundle)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = "gcm.n.click_action";
    Object localObject3 = a(paramBundle, (String)localObject2);
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject3);
    if (!bool1)
    {
      localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>((String)localObject3);
      localObject3 = b.getPackageName();
      ((Intent)localObject2).setPackage((String)localObject3);
      int k = 268435456;
      ((Intent)localObject2).setFlags(k);
      localObject3 = localObject2;
      if (localObject3 != null) {
        break label257;
      }
      bool1 = false;
    }
    label201:
    label257:
    int m;
    for (localObject2 = null;; localObject2 = PendingIntent.getActivity((Context)localObject2, i, (Intent)localObject3, m))
    {
      return (PendingIntent)localObject2;
      localObject2 = a(paramBundle, "gcm.n.link_android");
      boolean bool3 = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool3) {
        localObject2 = a(paramBundle, "gcm.n.link");
      }
      bool3 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool3) {
        localObject2 = Uri.parse((String)localObject2);
      }
      String str;
      for (localObject3 = localObject2;; localObject3 = null)
      {
        if (localObject3 == null) {
          break label201;
        }
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>("android.intent.action.VIEW");
        str = b.getPackageName();
        ((Intent)localObject2).setPackage(str);
        ((Intent)localObject2).setData((Uri)localObject3);
        localObject3 = localObject2;
        break;
        bool3 = false;
      }
      localObject2 = b.getPackageManager();
      localObject3 = b.getPackageName();
      localObject2 = ((PackageManager)localObject2).getLaunchIntentForPackage((String)localObject3);
      if (localObject2 == null)
      {
        localObject3 = "FirebaseMessaging";
        str = "No activity found to launch app";
        Log.w((String)localObject3, str);
      }
      localObject3 = localObject2;
      break;
      int j = 67108864;
      ((Intent)localObject3).addFlags(j);
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>(paramBundle);
      FirebaseMessagingService.a((Bundle)localObject2);
      ((Intent)localObject3).putExtras((Bundle)localObject2);
      localObject2 = ((Bundle)localObject2).keySet();
      localObject1 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (String)((Iterator)localObject1).next();
        str = "gcm.n.";
        boolean bool4 = ((String)localObject2).startsWith(str);
        if (!bool4)
        {
          str = "gcm.notification.";
          bool4 = ((String)localObject2).startsWith(str);
          if (!bool4) {}
        }
        else
        {
          ((Intent)localObject3).removeExtra((String)localObject2);
        }
      }
      localObject2 = b;
      localObject1 = c;
      i = ((AtomicInteger)localObject1).incrementAndGet();
      m = 1073741824;
    }
  }
  
  final Integer a(String paramString)
  {
    Integer localInteger = null;
    int i = Build.VERSION.SDK_INT;
    int k = 21;
    if (i < k) {}
    for (;;)
    {
      return localInteger;
      boolean bool = TextUtils.isEmpty(paramString);
      int j;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (!bool)
      {
        try
        {
          j = Color.parseColor(paramString);
          localInteger = Integer.valueOf(j);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          localObject1 = "FirebaseMessaging";
          k = String.valueOf(paramString).length() + 54;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(k);
          localObject3 = ((StringBuilder)localObject2).append("Color ").append(paramString);
          localObject2 = " not valid. Notification will use default color.";
          localObject3 = (String)localObject2;
          Log.w((String)localObject1, (String)localObject3);
        }
      }
      else
      {
        localObject1 = b();
        localObject3 = "com.google.firebase.messaging.default_notification_color";
        localObject2 = null;
        j = ((Bundle)localObject1).getInt((String)localObject3, 0);
        if (j != 0) {
          try
          {
            localObject3 = b;
            j = a.c((Context)localObject3, j);
            localInteger = Integer.valueOf(j);
          }
          catch (Resources.NotFoundException localNotFoundException)
          {
            String str = "FirebaseMessaging";
            localObject3 = "Cannot find the color resource referenced in AndroidManifest.";
            Log.w(str, (String)localObject3);
          }
        }
      }
    }
  }
  
  final boolean a()
  {
    Object localObject1 = b;
    String str = "keyguard";
    localObject1 = (KeyguardManager)((Context)localObject1).getSystemService(str);
    boolean bool = ((KeyguardManager)localObject1).inKeyguardRestrictedInputMode();
    if (bool)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      bool = i.e();
      if (!bool)
      {
        long l = 10;
        SystemClock.sleep(l);
      }
      int j = Process.myPid();
      localObject1 = b;
      Object localObject2 = "activity";
      localObject1 = ((ActivityManager)((Context)localObject1).getSystemService((String)localObject2)).getRunningAppProcesses();
      int i;
      if (localObject1 != null)
      {
        localObject2 = ((List)localObject1).iterator();
        int k;
        do
        {
          bool = ((Iterator)localObject2).hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next();
          k = pid;
        } while (k != j);
        i = importance;
        j = 100;
        if (i == j)
        {
          i = 1;
        }
        else
        {
          i = 0;
          localObject1 = null;
        }
      }
      else
      {
        i = 0;
        localObject1 = null;
      }
    }
  }
  
  final Bundle b()
  {
    Object localObject1 = d;
    if (localObject1 != null) {
      localObject1 = d;
    }
    for (;;)
    {
      return (Bundle)localObject1;
      localObject1 = null;
      try
      {
        localObject2 = b;
        localObject2 = ((Context)localObject2).getPackageManager();
        Object localObject3 = b;
        localObject3 = ((Context)localObject3).getPackageName();
        int i = 128;
        localObject1 = ((PackageManager)localObject2).getApplicationInfo((String)localObject3, i);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject2;
        for (;;) {}
      }
      if (localObject1 != null)
      {
        localObject2 = metaData;
        if (localObject2 != null)
        {
          localObject1 = metaData;
          d = ((Bundle)localObject1);
          localObject1 = d;
          continue;
        }
      }
      localObject1 = Bundle.EMPTY;
    }
  }
  
  final String b(Bundle paramBundle, String paramString)
  {
    Object localObject1 = a(paramBundle, paramString);
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool1) {}
    for (;;)
    {
      return (String)localObject1;
      Object localObject3 = String.valueOf(paramString);
      localObject1 = String.valueOf("_loc_key");
      int i = ((String)localObject1).length();
      if (i != 0) {
        localObject1 = ((String)localObject3).concat((String)localObject1);
      }
      boolean bool2;
      for (;;)
      {
        localObject3 = a(paramBundle, (String)localObject1);
        bool2 = TextUtils.isEmpty((CharSequence)localObject3);
        if (!bool2) {
          break label90;
        }
        bool2 = false;
        localObject1 = null;
        break;
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject3);
      }
      label90:
      localObject1 = b.getResources();
      String str = "string";
      Object localObject4 = b.getPackageName();
      i = ((Resources)localObject1).getIdentifier((String)localObject3, str, (String)localObject4);
      int j;
      Object localObject5;
      if (i == 0)
      {
        str = "FirebaseMessaging";
        localObject4 = String.valueOf(paramString);
        localObject1 = String.valueOf("_loc_key");
        j = ((String)localObject1).length();
        if (j != 0) {
          localObject1 = ((String)localObject4).concat((String)localObject1);
        }
        for (;;)
        {
          localObject1 = String.valueOf(((String)localObject1).substring(6));
          int k = String.valueOf(localObject1).length() + 49;
          j = String.valueOf(localObject3).length();
          k += j;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>(k);
          localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
          localObject4 = " resource not found: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4).append((String)localObject3);
          localObject3 = " Default value will be used.";
          localObject1 = (String)localObject3;
          Log.w(str, (String)localObject1);
          bool2 = false;
          localObject1 = null;
          break;
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>((String)localObject4);
        }
      }
      localObject4 = c(paramBundle, paramString);
      if (localObject4 == null) {
        localObject1 = ((Resources)localObject1).getString(i);
      } else {
        try
        {
          localObject1 = ((Resources)localObject1).getString(i, (Object[])localObject4);
        }
        catch (MissingFormatArgumentException localMissingFormatArgumentException)
        {
          str = "FirebaseMessaging";
          localObject4 = String.valueOf(Arrays.toString((Object[])localObject4));
          j = String.valueOf(localObject3).length() + 58;
          int m = String.valueOf(localObject4).length();
          j += m;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(j);
          localObject3 = localStringBuilder.append("Missing format argument for ").append((String)localObject3);
          localObject5 = ": ";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject5).append((String)localObject4);
          localObject4 = " Default value will be used.";
          localObject3 = (String)localObject4;
          Log.w(str, (String)localObject3, localMissingFormatArgumentException);
          bool2 = false;
          Object localObject2 = null;
        }
      }
    }
  }
  
  final String b(String paramString)
  {
    boolean bool1 = i.g();
    if (!bool1) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      Object localObject1 = b;
      Object localObject2 = NotificationManager.class;
      localObject1 = (NotificationManager)((Context)localObject1).getSystemService((Class)localObject2);
      try
      {
        localObject2 = f;
        int i;
        Object localObject4;
        int j;
        Object localObject5;
        Object localObject6;
        if (localObject2 == null)
        {
          localObject2 = localObject1.getClass();
          localObject3 = "getNotificationChannel";
          i = 1;
          localObject4 = new Class[i];
          j = 0;
          localObject5 = null;
          localObject6 = String.class;
          localObject4[0] = localObject6;
          localObject2 = ((Class)localObject2).getMethod((String)localObject3, (Class[])localObject4);
          f = ((Method)localObject2);
        }
        boolean bool2 = TextUtils.isEmpty(paramString);
        int k;
        if (!bool2)
        {
          localObject2 = f;
          k = 1;
          localObject3 = new Object[k];
          i = 0;
          localObject4 = null;
          localObject3[0] = paramString;
          localObject2 = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
          if (localObject2 != null) {
            continue;
          }
          localObject2 = "FirebaseMessaging";
          localObject3 = String.valueOf(paramString);
          k = ((String)localObject3).length() + 122;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(k);
          localObject3 = "Notification Channel requested (";
          localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
          localObject3 = ((StringBuilder)localObject3).append(paramString);
          localObject4 = ") has not been created by the app. Manifest configuration, or default, value will be used.";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject3 = ((StringBuilder)localObject3).toString();
          Log.w((String)localObject2, (String)localObject3);
        }
        localObject2 = b();
        localObject3 = "com.google.firebase.messaging.default_notification_channel_id";
        paramString = ((Bundle)localObject2).getString((String)localObject3);
        bool2 = TextUtils.isEmpty(paramString);
        if (!bool2)
        {
          localObject2 = f;
          k = 1;
          localObject3 = new Object[k];
          i = 0;
          localObject4 = null;
          localObject3[0] = paramString;
          localObject2 = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
          if (localObject2 != null) {
            continue;
          }
          localObject2 = "FirebaseMessaging";
          localObject3 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
          Log.w((String)localObject2, (String)localObject3);
        }
        for (;;)
        {
          localObject2 = f;
          k = 1;
          localObject3 = new Object[k];
          i = 0;
          localObject4 = null;
          localObject5 = "fcm_fallback_notification_channel";
          localObject3[0] = localObject5;
          localObject2 = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
          if (localObject2 == null)
          {
            localObject2 = "android.app.NotificationChannel";
            localObject2 = Class.forName((String)localObject2);
            k = 3;
            localObject3 = new Class[k];
            i = 0;
            localObject4 = null;
            localObject5 = String.class;
            localObject3[0] = localObject5;
            i = 1;
            localObject5 = CharSequence.class;
            localObject3[i] = localObject5;
            i = 2;
            localObject5 = Integer.TYPE;
            localObject3[i] = localObject5;
            localObject3 = ((Class)localObject2).getConstructor((Class[])localObject3);
            i = 3;
            localObject4 = new Object[i];
            j = 0;
            localObject5 = null;
            localObject6 = "fcm_fallback_notification_channel";
            localObject4[0] = localObject6;
            j = 1;
            localObject6 = b;
            int m = a.b.fcm_fallback_notification_channel_label;
            localObject6 = ((Context)localObject6).getString(m);
            localObject4[j] = localObject6;
            j = 2;
            int n = 3;
            localObject6 = Integer.valueOf(n);
            localObject4[j] = localObject6;
            localObject3 = ((Constructor)localObject3).newInstance((Object[])localObject4);
            localObject4 = localObject1.getClass();
            localObject5 = "createNotificationChannel";
            n = 1;
            localObject6 = new Class[n];
            m = 0;
            localObject6[0] = localObject2;
            localObject2 = ((Class)localObject4).getMethod((String)localObject5, (Class[])localObject6);
            i = 1;
            localObject4 = new Object[i];
            j = 0;
            localObject5 = null;
            localObject4[0] = localObject3;
            ((Method)localObject2).invoke(localObject1, (Object[])localObject4);
          }
          paramString = "fcm_fallback_notification_channel";
          break;
          localObject2 = "FirebaseMessaging";
          localObject3 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
          Log.w((String)localObject2, (String)localObject3);
        }
      }
      catch (InstantiationException localInstantiationException)
      {
        localObject2 = "FirebaseMessaging";
        localObject3 = "Error while setting the notification channel";
        Log.e((String)localObject2, (String)localObject3, localInstantiationException);
        paramString = null;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        for (;;)
        {
          localObject2 = "FirebaseMessaging";
          localObject3 = "Error while setting the notification channel";
          Log.e((String)localObject2, (String)localObject3, localInvocationTargetException);
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;)
        {
          localObject2 = "FirebaseMessaging";
          localObject3 = "Error while setting the notification channel";
          Log.e((String)localObject2, (String)localObject3, localNoSuchMethodException);
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          localObject2 = "FirebaseMessaging";
          localObject3 = "Error while setting the notification channel";
          Log.e((String)localObject2, (String)localObject3, localIllegalAccessException);
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        for (;;)
        {
          localObject2 = "FirebaseMessaging";
          localObject3 = "Error while setting the notification channel";
          Log.e((String)localObject2, (String)localObject3, localClassNotFoundException);
        }
      }
      catch (SecurityException localSecurityException)
      {
        for (;;)
        {
          localObject2 = "FirebaseMessaging";
          localObject3 = "Error while setting the notification channel";
          Log.e((String)localObject2, (String)localObject3, localSecurityException);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;)
        {
          localObject2 = "FirebaseMessaging";
          localObject3 = "Error while setting the notification channel";
          Log.e((String)localObject2, (String)localObject3, localIllegalArgumentException);
        }
      }
      catch (LinkageError localLinkageError)
      {
        for (;;)
        {
          localObject2 = "FirebaseMessaging";
          Object localObject3 = "Error while setting the notification channel";
          Log.e((String)localObject2, (String)localObject3, localLinkageError);
        }
      }
    }
  }
}


/* Location:              com/google/firebase/messaging/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */