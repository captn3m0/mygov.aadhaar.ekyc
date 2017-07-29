package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.bb;
import com.google.android.gms.b.bc;
import com.google.android.gms.b.pg.a;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tk;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
  extends pg.a
{
  private String a;
  private Context b;
  private String c;
  private ArrayList d;
  
  public d(String paramString1, ArrayList paramArrayList, Context paramContext, String paramString2)
  {
    c = paramString1;
    d = paramArrayList;
    a = paramString2;
    b = paramContext;
  }
  
  private Map b()
  {
    String str1 = b.getPackageName();
    String str2 = "";
    try
    {
      localObject = b;
      localObject = bc.a((Context)localObject);
      str3 = null;
      localObject = ((bb)localObject).b(str1, 0);
      str2 = versionName;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject;
        long l;
        String str4;
        String str3 = "Error to retrieve app version";
        tp.c(str3, localNameNotFoundException);
      }
    }
    l = idb;
    l = SystemClock.elapsedRealtime() - l;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    str4 = ib;
    ((Map)localObject).put("sessionid", str4);
    ((Map)localObject).put("appid", str1);
    str3 = String.valueOf(Build.VERSION.SDK_INT);
    ((Map)localObject).put("osversion", str3);
    str3 = a;
    ((Map)localObject).put("sdkversion", str3);
    ((Map)localObject).put("appversion", str2);
    str1 = String.valueOf(l);
    ((Map)localObject).put("timestamp", str1);
    return (Map)localObject;
  }
  
  private void c()
  {
    try
    {
      Object localObject1 = b;
      localObject1 = ((Context)localObject1).getClassLoader();
      str3 = "com.google.ads.conversiontracking.IAPConversionReporter";
      localObject1 = ((ClassLoader)localObject1).loadClass(str3);
      str3 = "reportWithProductId";
      int i = 4;
      Object localObject2 = new Class[i];
      int j = 0;
      Object localObject3 = Context.class;
      localObject2[0] = localObject3;
      j = 1;
      localObject3 = String.class;
      localObject2[j] = localObject3;
      j = 2;
      localObject3 = String.class;
      localObject2[j] = localObject3;
      j = 3;
      localObject3 = Boolean.TYPE;
      localObject2[j] = localObject3;
      localObject1 = ((Class)localObject1).getDeclaredMethod(str3, (Class[])localObject2);
      str3 = null;
      i = 4;
      localObject2 = new Object[i];
      j = 0;
      localObject3 = b;
      localObject2[0] = localObject3;
      j = 1;
      localObject3 = c;
      localObject2[j] = localObject3;
      j = 2;
      localObject3 = "";
      localObject2[j] = localObject3;
      j = 3;
      boolean bool = true;
      localObject3 = Boolean.valueOf(bool);
      localObject2[j] = localObject3;
      ((Method)localObject1).invoke(null, (Object[])localObject2);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        String str1 = "Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.";
        tp.e(str1);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        String str2 = "Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.";
        tp.e(str2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str3 = "Fail to report a conversion.";
        tp.c(str3, localException);
      }
    }
  }
  
  public final String a()
  {
    return c;
  }
  
  public final void a(int paramInt)
  {
    int i = 1;
    if (paramInt == i) {
      c();
    }
    Object localObject1 = b();
    Object localObject2 = String.valueOf(paramInt);
    ((Map)localObject1).put("status", localObject2);
    localObject2 = c;
    ((Map)localObject1).put("sku", localObject2);
    localObject2 = new java/util/LinkedList;
    ((LinkedList)localObject2).<init>();
    Object localObject3 = d;
    Iterator localIterator = ((ArrayList)localObject3).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject3 = (String)localIterator.next();
      w.e();
      localObject3 = tt.a((String)localObject3, (Map)localObject1);
      ((LinkedList)localObject2).add(localObject3);
    }
    w.e();
    localObject3 = b;
    localObject1 = a;
    tt.a((Context)localObject3, (String)localObject1, (List)localObject2);
  }
  
  public final void b(int paramInt)
  {
    int i = 1;
    if (paramInt == 0) {
      c();
    }
    Object localObject1 = b();
    Object localObject2 = String.valueOf(paramInt);
    ((Map)localObject1).put("google_play_status", localObject2);
    localObject2 = c;
    ((Map)localObject1).put("sku", localObject2);
    Object localObject3 = "status";
    if (paramInt == 0) {}
    for (;;)
    {
      localObject4 = String.valueOf(i);
      ((Map)localObject1).put(localObject3, localObject4);
      localObject3 = new java/util/LinkedList;
      ((LinkedList)localObject3).<init>();
      localObject4 = d;
      localObject2 = ((ArrayList)localObject4).iterator();
      int j;
      for (;;)
      {
        j = ((Iterator)localObject2).hasNext();
        if (j == 0) {
          break;
        }
        localObject4 = (String)((Iterator)localObject2).next();
        w.e();
        localObject4 = tt.a((String)localObject4, (Map)localObject1);
        ((LinkedList)localObject3).add(localObject4);
      }
      if (paramInt == j)
      {
        j = 2;
      }
      else
      {
        j = 4;
        if (paramInt == j)
        {
          j = 3;
        }
        else
        {
          j = 0;
          localObject4 = null;
        }
      }
    }
    w.e();
    Object localObject4 = b;
    localObject1 = a;
    tt.a((Context)localObject4, (String)localObject1, (List)localObject3);
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */