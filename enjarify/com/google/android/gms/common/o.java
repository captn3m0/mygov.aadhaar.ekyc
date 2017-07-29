package com.google.android.gms.common;

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
  private static boolean a;
  public static final int b = 10260000;
  public static boolean c = false;
  public static boolean d = false;
  static boolean e = false;
  static final AtomicBoolean f;
  private static final AtomicBoolean g;
  
  static
  {
    a = false;
    AtomicBoolean localAtomicBoolean = new java/util/concurrent/atomic/AtomicBoolean;
    localAtomicBoolean.<init>();
    f = localAtomicBoolean;
    localAtomicBoolean = new java/util/concurrent/atomic/AtomicBoolean;
    localAtomicBoolean.<init>();
    g = localAtomicBoolean;
  }
  
  public static String a(int paramInt)
  {
    return a.a(paramInt);
  }
  
  public static boolean a(Context paramContext, int paramInt)
  {
    int i = 1;
    int j = 18;
    if (paramInt == j) {}
    for (;;)
    {
      return i;
      String str;
      boolean bool;
      if (paramInt == i)
      {
        str = "com.google.android.gms";
        bool = a(paramContext, str);
      }
      else
      {
        bool = false;
        str = null;
      }
    }
  }
  
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    return m.a(paramContext, paramInt, paramString);
  }
  
  static boolean a(Context paramContext, String paramString)
  {
    boolean bool1 = true;
    Object localObject1 = "com.google.android.gms";
    boolean bool2 = paramString.equals(localObject1);
    boolean bool3 = i.e();
    Object localObject3;
    if (bool3)
    {
      localObject1 = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
      localObject3 = ((List)localObject1).iterator();
      do
      {
        bool3 = ((Iterator)localObject3).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = ((PackageInstaller.SessionInfo)((Iterator)localObject3).next()).getAppPackageName();
        bool3 = paramString.equals(localObject1);
      } while (!bool3);
      bool3 = bool1;
    }
    for (;;)
    {
      return bool3;
      localObject1 = paramContext.getPackageManager();
      int i = 8192;
      try
      {
        localObject1 = ((PackageManager)localObject1).getApplicationInfo(paramString, i);
        if (bool2)
        {
          bool3 = enabled;
        }
        else
        {
          bool3 = enabled;
          if (bool3)
          {
            bool3 = i.b();
            if (bool3)
            {
              localObject1 = "user";
              localObject1 = paramContext.getSystemService((String)localObject1);
              localObject1 = (UserManager)localObject1;
              String str = paramContext.getPackageName();
              localObject1 = ((UserManager)localObject1).getApplicationRestrictions(str);
              if (localObject1 != null)
              {
                str = "true";
                localObject3 = "restricted_profile";
                localObject1 = ((Bundle)localObject1).getString((String)localObject3);
                bool3 = str.equals(localObject1);
                if (bool3) {
                  bool3 = bool1;
                }
              }
            }
            for (;;)
            {
              if (bool3) {
                break label221;
              }
              bool3 = bool1;
              break;
              bool3 = false;
              localObject1 = null;
            }
          }
          label221:
          bool3 = false;
          localObject1 = null;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        bool3 = false;
        Object localObject2 = null;
      }
    }
  }
  
  public static int b(Context paramContext)
  {
    i = 9;
    k = 1;
    m = 0;
    str1 = null;
    localObject1 = paramContext.getPackageManager();
    int n;
    try
    {
      localObject2 = paramContext.getResources();
      n = a.b.common_google_play_services_unknown_issue;
      ((Resources)localObject2).getString(n);
    }
    finally
    {
      int i1;
      for (;;)
      {
        Object localObject2;
        boolean bool2;
        localObject4 = "GooglePlayServicesUtil";
        localObject5 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.";
        Log.e((String)localObject4, (String)localObject5);
      }
      n = b;
      if (i1 == n) {
        break label228;
      }
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      k = b;
      str1 = String.valueOf("com.google.android.gms.version");
      n = String.valueOf(str1).length() + 290;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(n);
      str2 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + k + " but found " + i1 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"" + str1 + "\" android:value=\"@integer/google_play_services_version\" />";
      localIllegalStateException.<init>(str2);
      throw localIllegalStateException;
      bool3 = f.a(paramContext);
      if (bool3) {
        break label398;
      }
    }
    localObject2 = "com.google.android.gms";
    localObject5 = paramContext.getPackageName();
    bool2 = ((String)localObject2).equals(localObject5);
    if (!bool2)
    {
      localObject2 = g;
      bool2 = ((AtomicBoolean)localObject2).get();
      if (!bool2)
      {
        i1 = ag.b(paramContext);
        if (i1 == 0)
        {
          localIllegalStateException = new java/lang/IllegalStateException;
          localIllegalStateException.<init>("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
          throw localIllegalStateException;
        }
      }
    }
    String str2;
    label228:
    localObject4 = f.a;
    if (localObject4 == null)
    {
      localObject4 = paramContext.getPackageManager();
      localObject5 = "android.hardware.type.iot";
      bool3 = ((PackageManager)localObject4).hasSystemFeature((String)localObject5);
      localObject4 = Boolean.valueOf(bool3);
      f.a = (Boolean)localObject4;
    }
    localObject4 = f.a;
    boolean bool3 = ((Boolean)localObject4).booleanValue();
    if (!bool3) {
      n = k;
    }
    for (;;)
    {
      bool3 = false;
      localObject4 = null;
      int i3;
      if (n != 0)
      {
        localObject4 = "com.android.vending";
        i3 = 8256;
      }
      try
      {
        localObject4 = ((PackageManager)localObject1).getPackageInfo((String)localObject4, i3);
        localObject9 = "com.google.android.gms";
        i4 = 64;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException3)
      {
        for (;;)
        {
          int i4;
          label396:
          label398:
          localObject8 = "GooglePlayServicesUtil";
          str1 = "Google Play Store is missing.";
          Log.w((String)localObject8, str1);
        }
      }
      try
      {
        localObject9 = ((PackageManager)localObject1).getPackageInfo((String)localObject9, i4);
        p.a(paramContext);
        if (n == 0) {
          break label499;
        }
        localObject5 = n.d.a;
        localObject4 = p.a((PackageInfo)localObject4, (n.a[])localObject5);
        if (localObject4 != null) {
          break label453;
        }
        str2 = "GooglePlayServicesUtil";
        str1 = "Google Play Store signature invalid.";
        Log.w(str2, str1);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        Object localObject6 = "GooglePlayServicesUtil";
        str1 = "Google Play services is missing.";
        Log.w((String)localObject6, str1);
        i = k;
        break label396;
        localObject5 = new n.a[k];
        localObject5[0] = localObject4;
        localObject4 = p.a((PackageInfo)localObject9, (n.a[])localObject5);
        if (localObject4 != null) {
          break label538;
        }
        localObject8 = "GooglePlayServicesUtil";
        str1 = "Google Play services signature invalid.";
        Log.w((String)localObject8, str1);
        break label396;
        localObject4 = n.d.a;
        localObject4 = p.a((PackageInfo)localObject9, (n.a[])localObject4);
        if (localObject4 != null) {
          break label538;
        }
        localObject8 = "GooglePlayServicesUtil";
        str1 = "Google Play services signature invalid.";
        Log.w((String)localObject8, str1);
        break label396;
        i = g.a(b);
        int i2 = g.a(versionCode);
        if (i2 >= i) {
          break label638;
        }
        localObject6 = "GooglePlayServicesUtil";
        k = b;
        m = versionCode;
        i2 = 77;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>(i2);
        localObject8 = ((StringBuilder)localObject5).append("Google Play services out of date.  Requires ").append(k);
        localObject4 = " but found ";
        localObject8 = (String)localObject4 + m;
        Log.w((String)localObject6, (String)localObject8);
        i = 2;
        break label396;
        localObject6 = applicationInfo;
        if (localObject6 != null) {
          break label670;
        }
        localObject6 = "com.google.android.gms";
        i2 = 0;
        localObject4 = null;
        try
        {
          localObject6 = ((PackageManager)localObject1).getApplicationInfo((String)localObject6, 0);
          boolean bool1 = enabled;
          if (bool1) {
            break label711;
          }
          j = 3;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          str1 = "GooglePlayServicesUtil";
          localObject4 = "Google Play services missing when getting application info.";
          Log.wtf(str1, (String)localObject4, localNameNotFoundException2);
          j = k;
        }
        break label396;
        int j = 0;
        Object localObject7 = null;
        break label396;
      }
      return i;
      n = 0;
      localObject5 = null;
    }
  }
  
  public static boolean b(int paramInt)
  {
    return m.a(null, paramInt);
  }
  
  public static boolean c(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean c(Context paramContext)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    bool2 = true;
    boolean bool3 = a;
    if (!bool3) {}
    for (;;)
    {
      try
      {
        localObject3 = bc.a(paramContext);
        localObject4 = "com.google.android.gms";
        int i = 64;
        localObject3 = ((bb)localObject3).b((String)localObject4, i);
        if (localObject3 == null) {
          continue;
        }
        p.a(paramContext);
        int j = 1;
        localObject4 = new n.a[j];
        i = 0;
        str = null;
        Object localObject5 = n.d.a;
        int k = 1;
        localObject5 = localObject5[k];
        localObject4[0] = localObject5;
        localObject3 = p.a((PackageInfo)localObject3, (n.a[])localObject4);
        if (localObject3 == null) {
          continue;
        }
        bool3 = true;
        e = bool3;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject3;
        Object localObject4 = "GooglePlayServicesUtil";
        String str = "Cannot find Google Play services package name.";
        Log.w((String)localObject4, str, localNameNotFoundException);
        a = bool2;
        continue;
      }
      finally
      {
        a = bool2;
      }
      bool3 = e;
      if (!bool3)
      {
        localObject3 = "user";
        localObject4 = Build.TYPE;
        bool3 = ((String)localObject3).equals(localObject4);
        if (bool3) {}
      }
      else
      {
        bool1 = bool2;
      }
      return bool1;
      bool3 = false;
      localObject3 = null;
      e = false;
    }
  }
  
  public static void d(Context paramContext)
  {
    Object localObject = f;
    boolean bool1 = true;
    boolean bool2 = ((AtomicBoolean)localObject).getAndSet(bool1);
    if (bool2) {}
    for (;;)
    {
      return;
      localObject = "notification";
      try
      {
        localObject = paramContext.getSystemService((String)localObject);
        localObject = (NotificationManager)localObject;
        if (localObject != null)
        {
          int i = 10436;
          ((NotificationManager)localObject).cancel(i);
        }
      }
      catch (SecurityException localSecurityException) {}
    }
  }
  
  public static Resources e(Context paramContext)
  {
    try
    {
      localObject1 = paramContext.getPackageManager();
      String str = "com.google.android.gms";
      localObject1 = ((PackageManager)localObject1).getResourcesForApplication(str);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (Resources)localObject1;
  }
  
  public static Context f(Context paramContext)
  {
    Object localObject1 = "com.google.android.gms";
    int i = 3;
    try
    {
      localObject1 = paramContext.createPackageContext((String)localObject1, i);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (Context)localObject1;
  }
  
  public static int g(Context paramContext)
  {
    int i = 0;
    PackageInfo localPackageInfo = null;
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      str2 = "com.google.android.gms";
      localPackageInfo = localPackageManager.getPackageInfo(str2, 0);
      i = versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str1 = "GooglePlayServicesUtil";
        String str2 = "Google Play services is missing.";
        Log.w(str1, str2);
      }
    }
    return i;
  }
}


/* Location:              com/google/android/gms/common/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */