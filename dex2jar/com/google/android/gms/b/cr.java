package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

public final class cr
  extends df
{
  private String a;
  private String b;
  private int c;
  private String d;
  private String e;
  private long f;
  private long g;
  private int h;
  private String i;
  
  cr(dc paramdc)
  {
    super(paramdc);
  }
  
  final ca a(String paramString)
  {
    super.e();
    String str1 = x();
    String str2 = y();
    J();
    String str3 = b;
    long l1 = z();
    J();
    String str4 = d;
    long l2 = cf.V();
    J();
    super.e();
    if (f == 0L) {
      f = q.i().c(super.n(), super.n().getPackageName());
    }
    long l3 = f;
    boolean bool2 = q.r();
    if (!vp) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      String str5 = super.v().z();
      J();
      long l4 = q.m;
      J();
      return new ca(str1, str2, str3, l1, str4, l2, l3, paramString, bool2, bool1, str5, 0L, l4, h);
    }
  }
  
  protected final void a()
  {
    int k = 1;
    Object localObject3 = "unknown";
    String str3 = "Unknown";
    int m = Integer.MIN_VALUE;
    String str1 = "Unknown";
    String str4 = super.n().getPackageName();
    Object localObject6 = super.n().getPackageManager();
    Object localObject5;
    String str2;
    int j;
    Object localObject1;
    if (localObject6 == null)
    {
      ua.a("PackageManager is null, app identity information might be inaccurate. appId", cu.a(str4));
      localObject5 = localObject3;
      str2 = str3;
      j = m;
      localObject3 = str1;
      a = str4;
      d = ((String)localObject5);
      b = str2;
      c = j;
      e = ((String)localObject3);
      f = 0L;
      cf.W();
      localObject1 = ab.a(super.n());
      if ((localObject1 == null) || (!((Status)localObject1).b())) {
        break label523;
      }
      j = 1;
      label133:
      if (j == 0)
      {
        if (localObject1 != null) {
          break label528;
        }
        ua.a("GoogleService failed to initialize (no status)");
      }
      label154:
      if (j == 0) {
        break label670;
      }
      localObject1 = super.w().b("firebase_analytics_collection_enabled");
      if (!super.w().Y()) {
        break label556;
      }
      ue.a("Collection disabled with firebase_analytics_collection_deactivated=1");
      j = 0;
    }
    for (;;)
    {
      i = "";
      g = 0L;
      cf.W();
      try
      {
        localObject3 = ab.a();
        localObject1 = localObject3;
        if (TextUtils.isEmpty((CharSequence)localObject3)) {
          localObject1 = "";
        }
        i = ((String)localObject1);
        if (j != 0) {
          ug.a("App package, google app id", a, i);
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          Object localObject2;
          label523:
          label528:
          label556:
          ua.a("getGoogleAppId or isMeasurementEnabled failed with exception. appId", cu.a(str4), localIllegalStateException);
          continue;
          j = 0;
        }
        h = 0;
        return;
      }
      if (Build.VERSION.SDK_INT >= 16) {
        if (ba.a(super.n()))
        {
          j = k;
          h = j;
          return;
          try
          {
            localObject1 = ((PackageManager)localObject6).getInstallerPackageName(str4);
            localObject3 = localObject1;
            if (localObject3 == null)
            {
              localObject1 = "manual_install";
              localObject5 = str1;
              str2 = str3;
            }
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            for (;;)
            {
              try
              {
                PackageInfo localPackageInfo = ((PackageManager)localObject6).getPackageInfo(super.n().getPackageName(), 0);
                localObject3 = str1;
                j = m;
                str2 = str3;
                localObject5 = localObject1;
                if (localPackageInfo == null) {
                  break;
                }
                localObject5 = str1;
                str2 = str3;
                localObject6 = ((PackageManager)localObject6).getApplicationLabel(applicationInfo);
                localObject3 = str1;
                localObject5 = str1;
                str2 = str3;
                if (!TextUtils.isEmpty((CharSequence)localObject6))
                {
                  localObject5 = str1;
                  str2 = str3;
                  localObject3 = ((CharSequence)localObject6).toString();
                }
                localObject5 = localObject3;
                str2 = str3;
                str1 = versionName;
                localObject5 = localObject3;
                str2 = str1;
                j = versionCode;
                str2 = str1;
                localObject5 = localObject1;
              }
              catch (PackageManager.NameNotFoundException localNameNotFoundException)
              {
                ua.a("Error retrieving package info. appId, appName", cu.a(str4), localObject5);
                Object localObject4 = localObject5;
                j = m;
                localObject5 = localObject2;
              }
              localIllegalArgumentException = localIllegalArgumentException;
              ua.a("Error retrieving app installer package name. appId", cu.a(str4));
              continue;
              localObject2 = localObject3;
              if ("com.android.vending".equals(localObject3)) {
                localObject2 = "";
              }
            }
          }
          break;
          j = 0;
          break label133;
          ua.a("GoogleService failed to initialize, status", Integer.valueOf(i), j);
          break label154;
          if ((localObject2 != null) && (!((Boolean)localObject2).booleanValue()))
          {
            ue.a("Collection disabled with firebase_analytics_collection_enabled=0");
            j = 0;
            continue;
          }
          if ((localObject2 == null) && (cf.Z()))
          {
            ue.a("Collection disabled with google_app_measurement_enable=0");
            j = 0;
            continue;
          }
          ug.a("Collection enabled");
          j = 1;
          continue;
        }
      }
      label670:
      j = 0;
    }
  }
  
  final String x()
  {
    J();
    return a;
  }
  
  final String y()
  {
    J();
    return i;
  }
  
  final int z()
  {
    J();
    return c;
  }
}


/* Location:              com/google/android/gms/b/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */