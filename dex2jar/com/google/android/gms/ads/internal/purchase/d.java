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
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tk;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@qi
public final class d
  extends pg.a
{
  private String a;
  private Context b;
  private String c;
  private ArrayList<String> d;
  
  public d(String paramString1, ArrayList<String> paramArrayList, Context paramContext, String paramString2)
  {
    c = paramString1;
    d = paramArrayList;
    a = paramString2;
    b = paramContext;
  }
  
  private Map<String, String> b()
  {
    String str = b.getPackageName();
    Object localObject1 = "";
    try
    {
      localObject2 = ab).b(str, 0).versionName;
      localObject1 = localObject2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        long l1;
        long l2;
        tp.c("Error to retrieve app version", localNameNotFoundException);
      }
    }
    l1 = idb;
    l2 = SystemClock.elapsedRealtime();
    localObject2 = new HashMap();
    ((Map)localObject2).put("sessionid", ib);
    ((Map)localObject2).put("appid", str);
    ((Map)localObject2).put("osversion", String.valueOf(Build.VERSION.SDK_INT));
    ((Map)localObject2).put("sdkversion", a);
    ((Map)localObject2).put("appversion", localObject1);
    ((Map)localObject2).put("timestamp", String.valueOf(l2 - l1));
    return (Map<String, String>)localObject2;
  }
  
  private void c()
  {
    try
    {
      b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[] { Context.class, String.class, String.class, Boolean.TYPE }).invoke(null, new Object[] { b, c, "", Boolean.valueOf(true) });
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      tp.e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      tp.e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (Exception localException)
    {
      tp.c("Fail to report a conversion.", localException);
    }
  }
  
  public final String a()
  {
    return c;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 1) {
      c();
    }
    Map localMap = b();
    localMap.put("status", String.valueOf(paramInt));
    localMap.put("sku", c);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = d.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      w.e();
      localLinkedList.add(tt.a(str, localMap));
    }
    w.e();
    tt.a(b, a, localLinkedList);
  }
  
  public final void b(int paramInt)
  {
    int i = 1;
    if (paramInt == 0) {
      c();
    }
    Map localMap = b();
    localMap.put("google_play_status", String.valueOf(paramInt));
    localMap.put("sku", c);
    if (paramInt == 0) {
      paramInt = i;
    }
    LinkedList localLinkedList;
    for (;;)
    {
      localMap.put("status", String.valueOf(paramInt));
      localLinkedList = new LinkedList();
      Iterator localIterator = d.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        w.e();
        localLinkedList.add(tt.a(str, localMap));
      }
      if (paramInt == 1) {
        paramInt = 2;
      } else if (paramInt == 4) {
        paramInt = 3;
      } else {
        paramInt = 0;
      }
    }
    w.e();
    tt.a(b, a, localLinkedList);
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */