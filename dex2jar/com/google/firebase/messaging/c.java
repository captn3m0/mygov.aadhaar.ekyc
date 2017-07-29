package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
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
  final AtomicInteger c = new AtomicInteger((int)SystemClock.elapsedRealtime());
  private Bundle d;
  private Method e;
  private Method f;
  
  private c(Context paramContext)
  {
    b = paramContext.getApplicationContext();
  }
  
  static c a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new c(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  static String a(Bundle paramBundle, String paramString)
  {
    String str2 = paramBundle.getString(paramString);
    String str1 = str2;
    if (str2 == null) {
      str1 = paramBundle.getString(paramString.replace("gcm.n.", "gcm.notification."));
    }
    return str1;
  }
  
  static void a(Intent paramIntent, Bundle paramBundle)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.startsWith("google.c.a.")) || (str.equals("from"))) {
        paramIntent.putExtra(str, paramBundle.getString(str));
      }
    }
  }
  
  private static Object[] c(Bundle paramBundle, String paramString)
  {
    Object localObject = String.valueOf(paramString);
    String str = String.valueOf("_loc_args");
    if (str.length() != 0)
    {
      localObject = ((String)localObject).concat(str);
      str = a(paramBundle, (String)localObject);
      if (!TextUtils.isEmpty(str)) {
        break label58;
      }
      paramBundle = null;
    }
    for (;;)
    {
      return paramBundle;
      localObject = new String((String)localObject);
      break;
      try
      {
        label58:
        JSONArray localJSONArray = new JSONArray(str);
        localObject = new String[localJSONArray.length()];
        int i = 0;
        for (;;)
        {
          paramBundle = (Bundle)localObject;
          if (i >= localObject.length) {
            break;
          }
          localObject[i] = localJSONArray.opt(i);
          i += 1;
        }
        paramBundle = paramBundle.concat(paramString);
      }
      catch (JSONException paramBundle)
      {
        paramBundle = String.valueOf(paramString);
        paramString = String.valueOf("_loc_args");
        if (paramString.length() == 0) {}
      }
    }
    for (;;)
    {
      paramBundle = String.valueOf(paramBundle.substring(6));
      Log.w("FirebaseMessaging", String.valueOf(paramBundle).length() + 41 + String.valueOf(str).length() + "Malformed " + paramBundle + ": " + str + "  Default value will be used.");
      return null;
      paramBundle = new String(paramBundle);
    }
  }
  
  @TargetApi(26)
  final Notification a(CharSequence paramCharSequence, String paramString1, int paramInt, Integer paramInteger, Uri paramUri, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, String paramString2)
  {
    Notification.Builder localBuilder = new Notification.Builder(b).setAutoCancel(true).setSmallIcon(paramInt);
    if (!TextUtils.isEmpty(paramCharSequence)) {
      localBuilder.setContentTitle(paramCharSequence);
    }
    if (!TextUtils.isEmpty(paramString1))
    {
      localBuilder.setContentText(paramString1);
      localBuilder.setStyle(new Notification.BigTextStyle().bigText(paramString1));
    }
    if (paramInteger != null) {
      localBuilder.setColor(paramInteger.intValue());
    }
    if (paramUri != null) {
      localBuilder.setSound(paramUri);
    }
    if (paramPendingIntent1 != null) {
      localBuilder.setContentIntent(paramPendingIntent1);
    }
    if (paramPendingIntent2 != null) {
      localBuilder.setDeleteIntent(paramPendingIntent2);
    }
    if (paramString2 != null) {}
    try
    {
      if (e == null) {
        e = localBuilder.getClass().getMethod("setChannel", new Class[] { String.class });
      }
      e.invoke(localBuilder, new Object[] { paramString2 });
    }
    catch (NoSuchMethodException paramCharSequence)
    {
      for (;;)
      {
        Log.e("FirebaseMessaging", "Error while setting the notification channel", paramCharSequence);
      }
    }
    catch (IllegalAccessException paramCharSequence)
    {
      for (;;)
      {
        Log.e("FirebaseMessaging", "Error while setting the notification channel", paramCharSequence);
      }
    }
    catch (InvocationTargetException paramCharSequence)
    {
      for (;;)
      {
        Log.e("FirebaseMessaging", "Error while setting the notification channel", paramCharSequence);
      }
    }
    catch (SecurityException paramCharSequence)
    {
      for (;;)
      {
        Log.e("FirebaseMessaging", "Error while setting the notification channel", paramCharSequence);
      }
    }
    catch (IllegalArgumentException paramCharSequence)
    {
      for (;;)
      {
        Log.e("FirebaseMessaging", "Error while setting the notification channel", paramCharSequence);
      }
    }
    catch (LinkageError paramCharSequence)
    {
      for (;;)
      {
        Log.e("FirebaseMessaging", "Error while setting the notification channel", paramCharSequence);
      }
    }
    return localBuilder.build();
  }
  
  final PendingIntent a(Bundle paramBundle)
  {
    Object localObject1 = a(paramBundle, "gcm.n.click_action");
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject1 = new Intent((String)localObject1);
      ((Intent)localObject1).setPackage(b.getPackageName());
      ((Intent)localObject1).setFlags(268435456);
    }
    Object localObject2;
    while (localObject1 == null)
    {
      return null;
      localObject2 = a(paramBundle, "gcm.n.link_android");
      localObject1 = localObject2;
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        localObject1 = a(paramBundle, "gcm.n.link");
      }
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {}
      for (localObject1 = Uri.parse((String)localObject1);; localObject1 = null)
      {
        if (localObject1 == null) {
          break label130;
        }
        localObject2 = new Intent("android.intent.action.VIEW");
        ((Intent)localObject2).setPackage(b.getPackageName());
        ((Intent)localObject2).setData((Uri)localObject1);
        localObject1 = localObject2;
        break;
      }
      label130:
      localObject1 = b.getPackageManager().getLaunchIntentForPackage(b.getPackageName());
      if (localObject1 == null) {
        Log.w("FirebaseMessaging", "No activity found to launch app");
      }
    }
    ((Intent)localObject1).addFlags(67108864);
    paramBundle = new Bundle(paramBundle);
    FirebaseMessagingService.a(paramBundle);
    ((Intent)localObject1).putExtras(paramBundle);
    paramBundle = paramBundle.keySet().iterator();
    while (paramBundle.hasNext())
    {
      localObject2 = (String)paramBundle.next();
      if ((((String)localObject2).startsWith("gcm.n.")) || (((String)localObject2).startsWith("gcm.notification."))) {
        ((Intent)localObject1).removeExtra((String)localObject2);
      }
    }
    return PendingIntent.getActivity(b, c.incrementAndGet(), (Intent)localObject1, 1073741824);
  }
  
  final Integer a(String paramString)
  {
    if (Build.VERSION.SDK_INT < 21) {}
    int i;
    do
    {
      return null;
      if (!TextUtils.isEmpty(paramString)) {
        try
        {
          i = Color.parseColor(paramString);
          return Integer.valueOf(i);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          Log.w("FirebaseMessaging", String.valueOf(paramString).length() + 54 + "Color " + paramString + " not valid. Notification will use default color.");
        }
      }
      i = b().getInt("com.google.firebase.messaging.default_notification_color", 0);
    } while (i == 0);
    try
    {
      i = a.c(b, i);
      return Integer.valueOf(i);
    }
    catch (Resources.NotFoundException paramString)
    {
      Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
    }
    return null;
  }
  
  final boolean a()
  {
    if (((KeyguardManager)b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
      return false;
    }
    if (!i.e()) {
      SystemClock.sleep(10L);
    }
    int i = Process.myPid();
    Object localObject = ((ActivityManager)b.getSystemService("activity")).getRunningAppProcesses();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
        if (pid == i) {
          return importance == 100;
        }
      }
    }
    return false;
  }
  
  final Bundle b()
  {
    if (d != null) {
      return d;
    }
    Object localObject = null;
    try
    {
      ApplicationInfo localApplicationInfo = b.getPackageManager().getApplicationInfo(b.getPackageName(), 128);
      localObject = localApplicationInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    if ((localObject != null) && (metaData != null))
    {
      d = metaData;
      return d;
    }
    return Bundle.EMPTY;
  }
  
  final String b(Bundle paramBundle, String paramString)
  {
    String str = a(paramBundle, paramString);
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    str = String.valueOf(paramString);
    Object localObject = String.valueOf("_loc_key");
    if (((String)localObject).length() != 0) {}
    for (str = str.concat((String)localObject);; str = new String(str))
    {
      str = a(paramBundle, str);
      if (!TextUtils.isEmpty(str)) {
        break;
      }
      return null;
    }
    localObject = b.getResources();
    int i = ((Resources)localObject).getIdentifier(str, "string", b.getPackageName());
    if (i == 0)
    {
      paramBundle = String.valueOf(paramString);
      paramString = String.valueOf("_loc_key");
      if (paramString.length() != 0) {}
      for (paramBundle = paramBundle.concat(paramString);; paramBundle = new String(paramBundle))
      {
        paramBundle = String.valueOf(paramBundle.substring(6));
        Log.w("FirebaseMessaging", String.valueOf(paramBundle).length() + 49 + String.valueOf(str).length() + paramBundle + " resource not found: " + str + " Default value will be used.");
        return null;
      }
    }
    paramBundle = c(paramBundle, paramString);
    if (paramBundle == null) {
      return ((Resources)localObject).getString(i);
    }
    try
    {
      paramString = ((Resources)localObject).getString(i, paramBundle);
      return paramString;
    }
    catch (MissingFormatArgumentException paramString)
    {
      paramBundle = String.valueOf(Arrays.toString(paramBundle));
      Log.w("FirebaseMessaging", String.valueOf(str).length() + 58 + String.valueOf(paramBundle).length() + "Missing format argument for " + str + ": " + paramBundle + " Default value will be used.", paramString);
    }
    return null;
  }
  
  @TargetApi(26)
  final String b(String paramString)
  {
    Object localObject;
    if (!i.g()) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      NotificationManager localNotificationManager = (NotificationManager)b.getSystemService(NotificationManager.class);
      try
      {
        if (f == null) {
          f = localNotificationManager.getClass().getMethod("getNotificationChannel", new Class[] { String.class });
        }
        if (!TextUtils.isEmpty(paramString))
        {
          localObject = paramString;
          if (f.invoke(localNotificationManager, new Object[] { paramString }) != null) {
            continue;
          }
          Log.w("FirebaseMessaging", String.valueOf(paramString).length() + 122 + "Notification Channel requested (" + paramString + ") has not been created by the app. Manifest configuration, or default, value will be used.");
        }
        paramString = b().getString("com.google.firebase.messaging.default_notification_channel_id");
        if (!TextUtils.isEmpty(paramString))
        {
          localObject = paramString;
          if (f.invoke(localNotificationManager, new Object[] { paramString }) != null) {
            continue;
          }
          Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        while (f.invoke(localNotificationManager, new Object[] { "fcm_fallback_notification_channel" }) == null)
        {
          paramString = Class.forName("android.app.NotificationChannel");
          localObject = paramString.getConstructor(new Class[] { String.class, CharSequence.class, Integer.TYPE }).newInstance(new Object[] { "fcm_fallback_notification_channel", b.getString(a.b.fcm_fallback_notification_channel_label), Integer.valueOf(3) });
          localNotificationManager.getClass().getMethod("createNotificationChannel", new Class[] { paramString }).invoke(localNotificationManager, new Object[] { localObject });
          break;
          Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        }
        return "fcm_fallback_notification_channel";
      }
      catch (InstantiationException paramString)
      {
        Log.e("FirebaseMessaging", "Error while setting the notification channel", paramString);
        return null;
      }
      catch (InvocationTargetException paramString)
      {
        for (;;)
        {
          Log.e("FirebaseMessaging", "Error while setting the notification channel", paramString);
        }
      }
      catch (NoSuchMethodException paramString)
      {
        for (;;)
        {
          Log.e("FirebaseMessaging", "Error while setting the notification channel", paramString);
        }
      }
      catch (IllegalAccessException paramString)
      {
        for (;;)
        {
          Log.e("FirebaseMessaging", "Error while setting the notification channel", paramString);
        }
      }
      catch (ClassNotFoundException paramString)
      {
        for (;;)
        {
          Log.e("FirebaseMessaging", "Error while setting the notification channel", paramString);
        }
      }
      catch (SecurityException paramString)
      {
        for (;;)
        {
          Log.e("FirebaseMessaging", "Error while setting the notification channel", paramString);
        }
      }
      catch (IllegalArgumentException paramString)
      {
        for (;;)
        {
          Log.e("FirebaseMessaging", "Error while setting the notification channel", paramString);
        }
      }
      catch (LinkageError paramString)
      {
        for (;;)
        {
          Log.e("FirebaseMessaging", "Error while setting the notification channel", paramString);
        }
      }
    }
  }
}


/* Location:              com/google/firebase/messaging/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */