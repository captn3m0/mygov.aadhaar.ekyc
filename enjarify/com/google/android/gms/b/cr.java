package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
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
    ca localca = new com/google/android/gms/b/ca;
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
    long l3 = f;
    long l4 = 0L;
    boolean bool1 = l3 < l4;
    if (!bool1)
    {
      localObject = q.i();
      Context localContext = super.n();
      String str5 = super.n().getPackageName();
      l3 = ((dr)localObject).c(localContext, str5);
      f = l3;
    }
    l3 = f;
    boolean bool2 = q.r();
    Object localObject = super.v();
    bool1 = p;
    if (!bool1) {}
    for (boolean bool3 = true;; bool3 = false)
    {
      String str6 = super.v().z();
      J();
      long l5 = q.m;
      J();
      int j = h;
      localca.<init>(str1, str2, str3, l1, str4, l2, l3, paramString, bool2, bool3, str6, 0L, l5, j);
      return localca;
    }
  }
  
  protected final void a()
  {
    long l = 0L;
    int j = 1;
    Object localObject1 = "unknown";
    Object localObject2 = "Unknown";
    int k = -1 << -1;
    Object localObject3 = "Unknown";
    String str = super.n().getPackageName();
    Object localObject5 = super.n().getPackageManager();
    Object localObject7;
    Object localObject9;
    Object localObject10;
    boolean bool3;
    if (localObject5 == null)
    {
      localObject5 = ua;
      localObject7 = "PackageManager is null, app identity information might be inaccurate. appId";
      localObject9 = cu.a(str);
      ((cu.a)localObject5).a((String)localObject7, localObject9);
      a = str;
      d = ((String)localObject1);
      b = ((String)localObject2);
      c = k;
      e = ((String)localObject3);
      f = l;
      cf.W();
      localObject3 = super.n();
      localObject10 = ab.a((Context)localObject3);
      if (localObject10 == null) {
        break label567;
      }
      bool3 = ((Status)localObject10).b();
      if (!bool3) {
        break label567;
      }
      bool3 = j;
      label145:
      if (!bool3)
      {
        if (localObject10 != null) {
          break label576;
        }
        localObject10 = ua;
        localObject2 = "GoogleService failed to initialize (no status)";
        ((cu.a)localObject10).a((String)localObject2);
      }
      label175:
      if (!bool3) {
        break label793;
      }
      localObject3 = super.w().b("firebase_analytics_collection_enabled");
      localObject10 = super.w();
      boolean bool1 = ((cf)localObject10).Y();
      if (!bool1) {
        break label624;
      }
      localObject3 = ue;
      localObject10 = "Collection disabled with firebase_analytics_collection_deactivated=1";
      ((cu.a)localObject3).a((String)localObject10);
      bool3 = false;
      localObject3 = null;
    }
    for (;;)
    {
      localObject10 = "";
      i = ((String)localObject10);
      g = l;
      cf.W();
      try
      {
        localObject10 = ab.a();
        boolean bool5 = TextUtils.isEmpty((CharSequence)localObject10);
        if (bool5) {
          localObject10 = "";
        }
        i = ((String)localObject10);
        if (bool3)
        {
          localObject3 = super.u();
          localObject3 = g;
          localObject10 = "App package, google app id";
          localObject2 = a;
          localObject1 = i;
          ((cu.a)localObject3).a((String)localObject10, localObject2, localObject1);
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          int n;
          int m;
          Object localObject6;
          label567:
          label576:
          int i1;
          label624:
          boolean bool2;
          localObject10 = ua;
          localObject2 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId";
          localObject1 = cu.a(str);
          ((cu.a)localObject10).a((String)localObject2, localObject1, localIllegalStateException);
          continue;
          j = 0;
          continue;
          h = 0;
        }
      }
      n = Build.VERSION.SDK_INT;
      m = 16;
      if (n >= m)
      {
        localObject3 = super.n();
        bool4 = ba.a((Context)localObject3);
        if (bool4)
        {
          h = j;
          return;
          try
          {
            localObject1 = ((PackageManager)localObject5).getInstallerPackageName(str);
            if (localObject1 == null) {
              localObject1 = "manual_install";
            }
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            for (;;)
            {
              try
              {
                localObject7 = super.n();
                localObject7 = ((Context)localObject7).getPackageName();
                boolean bool6 = false;
                localObject9 = null;
                localObject7 = ((PackageManager)localObject5).getPackageInfo((String)localObject7, 0);
                if (localObject7 == null) {
                  break;
                }
                localObject9 = applicationInfo;
                localObject5 = ((PackageManager)localObject5).getApplicationLabel((ApplicationInfo)localObject9);
                bool6 = TextUtils.isEmpty((CharSequence)localObject5);
                if (!bool6) {
                  localObject3 = ((CharSequence)localObject5).toString();
                }
                localObject2 = versionName;
                m = versionCode;
              }
              catch (PackageManager.NameNotFoundException localNameNotFoundException)
              {
                Object localObject11;
                boolean bool7;
                localObject6 = ua;
                Object localObject8 = "Error retrieving package info. appId, appName";
                localObject9 = cu.a(str);
                ((cu.a)localObject6).a((String)localObject8, localObject9, localObject3);
              }
              localIllegalArgumentException = localIllegalArgumentException;
              localObject8 = ua;
              localObject9 = "Error retrieving app installer package name. appId";
              localObject11 = cu.a(str);
              ((cu.a)localObject8).a((String)localObject9, localObject11);
              continue;
              localObject8 = "com.android.vending";
              bool7 = ((String)localObject8).equals(localObject1);
              if (bool7) {
                localObject1 = "";
              }
            }
          }
          break;
          bool4 = false;
          localObject3 = null;
          break label145;
          localObject2 = ua;
          localObject1 = "GoogleService failed to initialize, status";
          i1 = i;
          localObject6 = Integer.valueOf(i1);
          localObject10 = j;
          ((cu.a)localObject2).a((String)localObject1, localObject6, localObject10);
          break label175;
          if (localObject3 != null)
          {
            bool2 = ((Boolean)localObject3).booleanValue();
            if (!bool2)
            {
              localObject3 = ue;
              localObject10 = "Collection disabled with firebase_analytics_collection_enabled=0";
              ((cu.a)localObject3).a((String)localObject10);
              bool4 = false;
              localObject3 = null;
              continue;
            }
          }
          if (localObject3 == null)
          {
            bool4 = cf.Z();
            if (bool4)
            {
              localObject3 = ue;
              localObject10 = "Collection disabled with google_app_measurement_enable=0";
              ((cu.a)localObject3).a((String)localObject10);
              bool4 = false;
              localObject3 = null;
              continue;
            }
          }
          localObject3 = ug;
          localObject10 = "Collection enabled";
          ((cu.a)localObject3).a((String)localObject10);
          bool4 = j;
          continue;
        }
      }
      label793:
      boolean bool4 = false;
      Object localObject4 = null;
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */