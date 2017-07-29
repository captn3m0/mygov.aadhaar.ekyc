package com.google.android.gms.b;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class kf
{
  boolean a;
  String b;
  Map c;
  Context d = null;
  String e = null;
  
  public kf(Context paramContext, String paramString)
  {
    d = paramContext;
    e = paramString;
    Object localObject1 = ke.T;
    boolean bool = ((Boolean)w.q().a((jz)localObject1)).booleanValue();
    a = bool;
    localObject1 = ke.U;
    localObject1 = (String)w.q().a((jz)localObject1);
    b = ((String)localObject1);
    localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    c = ((Map)localObject1);
    c.put("s", "gmob_sdk");
    c.put("v", "3");
    localObject1 = c;
    localObject2 = Build.VERSION.RELEASE;
    ((Map)localObject1).put("os", localObject2);
    localObject1 = c;
    localObject2 = Build.VERSION.SDK;
    ((Map)localObject1).put("sdk", localObject2);
    localObject1 = c;
    w.e();
    localObject2 = tt.c();
    ((Map)localObject1).put("device", localObject2);
    localObject3 = c;
    localObject2 = "app";
    localObject1 = paramContext.getApplicationContext();
    if (localObject1 != null)
    {
      localObject1 = paramContext.getApplicationContext().getPackageName();
      ((Map)localObject3).put(localObject2, localObject1);
      localObject3 = c;
      localObject2 = "is_lite_sdk";
      w.e();
      bool = tt.j(paramContext);
      if (!bool) {
        break label381;
      }
    }
    label381:
    for (localObject1 = "1";; localObject1 = "0")
    {
      ((Map)localObject3).put(localObject2, localObject1);
      localObject1 = w.n();
      localObject3 = d;
      localObject3 = ((ro)localObject1).a((Context)localObject3);
      try
      {
        ((Future)localObject3).get();
        localObject2 = c;
        String str = "network_coarse";
        localObject1 = ((Future)localObject3).get();
        localObject1 = (rn)localObject1;
        int i = m;
        localObject1 = Integer.toString(i);
        ((Map)localObject2).put(str, localObject1);
        localObject2 = c;
        str = "network_fine";
        localObject1 = ((Future)localObject3).get();
        localObject1 = (rn)localObject1;
        i = n;
        localObject1 = Integer.toString(i);
        ((Map)localObject2).put(str, localObject1);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localObject3 = w.i();
          localObject2 = "CsiConfiguration.CsiConfiguration";
          ((tj)localObject3).a(localException, (String)localObject2);
        }
      }
      localObject1 = paramContext.getPackageName();
      break;
    }
  }
}


/* Location:              com/google/android/gms/b/kf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */