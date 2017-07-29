package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.a.b;
import com.google.android.gms.b.bb;
import com.google.android.gms.b.bc;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class o
{
  private static boolean a = false;
  @Deprecated
  public static final int b = 10260000;
  public static boolean c = false;
  public static boolean d = false;
  static boolean e = false;
  static final AtomicBoolean f = new AtomicBoolean();
  private static final AtomicBoolean g = new AtomicBoolean();
  
  @Deprecated
  public static String a(int paramInt)
  {
    return a.a(paramInt);
  }
  
  @Deprecated
  public static boolean a(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return a(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  @Deprecated
  @TargetApi(19)
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    return m.a(paramContext, paramInt, paramString);
  }
  
  @TargetApi(21)
  static boolean a(Context paramContext, String paramString)
  {
    boolean bool = paramString.equals("com.google.android.gms");
    if (i.e())
    {
      localObject = paramContext.getPackageManager().getPackageInstaller().getAllSessions().iterator();
      while (((Iterator)localObject).hasNext()) {
        if (paramString.equals(((PackageInstaller.SessionInfo)((Iterator)localObject).next()).getAppPackageName())) {
          return true;
        }
      }
    }
    Object localObject = paramContext.getPackageManager();
    try
    {
      paramString = ((PackageManager)localObject).getApplicationInfo(paramString, 8192);
      if (bool) {
        return enabled;
      }
      if (enabled)
      {
        if (i.b())
        {
          paramContext = ((UserManager)paramContext.getSystemService("user")).getApplicationRestrictions(paramContext.getPackageName());
          if (paramContext != null)
          {
            bool = "true".equals(paramContext.getString("restricted_profile"));
            if (!bool) {}
          }
        }
        for (int i = 1; i == 0; i = 0) {
          return true;
        }
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  @Deprecated
  public static int b(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      paramContext.getResources().getString(a.b.common_google_play_services_unknown_issue);
      if ((!"com.google.android.gms".equals(paramContext.getPackageName())) && (!g.get()))
      {
        i = ag.b(paramContext);
        if (i == 0) {
          throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
      }
      int j;
      if (i != b)
      {
        j = b;
        paramContext = String.valueOf("com.google.android.gms.version");
        throw new IllegalStateException(String.valueOf(paramContext).length() + 290 + "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + j + " but found " + i + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"" + paramContext + "\" android:value=\"@integer/google_play_services_version\" />");
      }
      if (!f.a(paramContext))
      {
        if (f.a == null) {
          f.a = Boolean.valueOf(paramContext.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        if (f.a.booleanValue()) {}
      }
      PackageInfo localPackageInfo;
      for (int i = 1;; i = 0)
      {
        localObject = null;
        if (i != 0) {}
        try
        {
          localObject = localPackageManager.getPackageInfo("com.android.vending", 8256);
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
          return 9;
        }
        try
        {
          localPackageInfo = localPackageManager.getPackageInfo("com.google.android.gms", 64);
          p.a(paramContext);
          if (i == 0) {
            break label305;
          }
          paramContext = p.a((PackageInfo)localObject, n.d.a);
          if (paramContext != null) {
            break label277;
          }
          Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
          return 9;
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
          return 1;
        }
      }
      label277:
      if (p.a(localPackageInfo, new n.a[] { paramContext }) == null)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        label305:
        if (p.a(localPackageInfo, n.d.a) == null)
        {
          Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
          return 9;
        }
      }
      i = g.a(b);
      if (g.a(versionCode) < i)
      {
        i = b;
        j = versionCode;
        Log.w("GooglePlayServicesUtil", 77 + "Google Play services out of date.  Requires " + i + " but found " + j);
        return 2;
      }
      Object localObject = applicationInfo;
      paramContext = (Context)localObject;
      if (localObject == null) {}
      try
      {
        paramContext = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
        if (!enabled) {
          return 3;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", paramContext);
        return 1;
      }
    }
    return 0;
  }
  
  @Deprecated
  public static boolean b(int paramInt)
  {
    return m.a(null, paramInt);
  }
  
  @Deprecated
  public static boolean c(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean c(Context paramContext)
  {
    boolean bool = false;
    if (!a) {}
    for (;;)
    {
      try
      {
        PackageInfo localPackageInfo = bc.a(paramContext).b("com.google.android.gms", 64);
        if (localPackageInfo == null) {
          continue;
        }
        p.a(paramContext);
        if (p.a(localPackageInfo, new n.a[] { n.d.a[1] }) == null) {
          continue;
        }
        e = true;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", paramContext);
        a = true;
        continue;
      }
      finally
      {
        a = true;
      }
      if ((e) || (!"user".equals(Build.TYPE))) {
        bool = true;
      }
      return bool;
      e = false;
    }
  }
  
  @Deprecated
  public static void d(Context paramContext)
  {
    if (f.getAndSet(true)) {}
    for (;;)
    {
      return;
      try
      {
        paramContext = (NotificationManager)paramContext.getSystemService("notification");
        if (paramContext != null)
        {
          paramContext.cancel(10436);
          return;
        }
      }
      catch (SecurityException paramContext) {}
    }
  }
  
  public static Resources e(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static Context f(Context paramContext)
  {
    try
    {
      paramContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  @Deprecated
  public static int g(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return versionCode;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 0;
  }
}


/* Location:              com/google/android/gms/common/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */