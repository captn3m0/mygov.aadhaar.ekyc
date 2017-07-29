package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class qk
  extends to
  implements ql.a
{
  final qo.a a;
  final Object b = new Object();
  final Context c;
  Runnable d;
  tv e;
  qr f;
  ns g;
  private final qj.a h;
  private qo i;
  
  public qk(Context paramContext, qo.a parama, qj.a parama1)
  {
    h = parama1;
    c = paramContext;
    a = parama;
  }
  
  private il a(qo paramqo)
  {
    int k;
    int j;
    il localil;
    if (f.A)
    {
      localObject = d.g;
      k = localObject.length;
      j = 0;
      while (j < k)
      {
        localil = localObject[j];
        if (i) {
          return new il(localil, d.g);
        }
        j += 1;
      }
    }
    if (f.m == null) {
      throw new a("The ad response must specify one of the supported ad sizes.", 0);
    }
    Object localObject = f.m.split("x");
    if (localObject.length != 2)
    {
      paramqo = String.valueOf(f.m);
      if (paramqo.length() != 0) {}
      for (paramqo = "Invalid ad size format from the ad response: ".concat(paramqo);; paramqo = new String("Invalid ad size format from the ad response: ")) {
        throw new a(paramqo, 0);
      }
    }
    try
    {
      n = Integer.parseInt(localObject[0]);
      i1 = Integer.parseInt(localObject[1]);
      localObject = d.g;
      i2 = localObject.length;
      j = 0;
    }
    catch (NumberFormatException paramqo)
    {
      for (;;)
      {
        int n;
        int i1;
        int i2;
        float f1;
        paramqo = String.valueOf(f.m);
        if (paramqo.length() != 0) {}
        for (paramqo = "Invalid ad size number from the ad response: ".concat(paramqo);; paramqo = new String("Invalid ad size number from the ad response: ")) {
          throw new a(paramqo, 0);
        }
        k = e;
        continue;
        label359:
        int m = b;
        continue;
        label369:
        j += 1;
      }
      paramqo = String.valueOf(f.m);
      if (paramqo.length() == 0) {
        break label411;
      }
    }
    if (j < i2)
    {
      localil = localObject[j];
      f1 = c.getResources().getDisplayMetrics().density;
      if (e == -1)
      {
        k = (int)(f / f1);
        if (b != -2) {
          break label359;
        }
        m = (int)(c / f1);
        if ((n != k) || (i1 != m) || (i)) {
          break label369;
        }
        return new il(localil, d.g);
      }
    }
    label411:
    for (paramqo = "The ad size from the ad response was not one of the requested sizes: ".concat(paramqo);; paramqo = new String("The ad size from the ad response was not one of the requested sizes: ")) {
      throw new a(paramqo, 0);
    }
  }
  
  public final void a()
  {
    tp.b("AdLoaderBackgroundTask started.");
    d = new Runnable()
    {
      public final void run()
      {
        synchronized (b)
        {
          if (e == null) {
            return;
          }
          c_();
          a(2, "Timed out waiting for ad response.");
          return;
        }
      }
    };
    final Object localObject1 = tt.a;
    Object localObject2 = d;
    Object localObject3 = ke.bF;
    ((Handler)localObject1).postDelayed((Runnable)localObject2, ((Long)w.q().a((jz)localObject3)).longValue());
    long l = w.k().b();
    localObject1 = ke.bE;
    if ((((Boolean)w.q().a((jz)localObject1)).booleanValue()) && (a.b.c != null))
    {
      localObject1 = a.b.c.getString("_ad");
      if (localObject1 != null)
      {
        i = new qo(a, l, null, null, null);
        a(ri.a(c, i, (String)localObject1));
        return;
      }
    }
    localObject1 = new uw();
    ts.a(new Runnable()
    {
      public final void run()
      {
        synchronized (b)
        {
          qk localqk = qk.this;
          Object localObject1 = qk.this;
          un localun = a.j;
          uv localuv = localObject1;
          Context localContext = c;
          if (new ql.1(localContext).a(localun))
          {
            tp.b("Fetching ad response from local ad request service.");
            localObject1 = new qm.a(localContext, localuv, (ql.a)localObject1);
            ((qm)localObject1).c();
          }
          for (;;)
          {
            e = ((tv)localObject1);
            if (e == null)
            {
              a(0, "Could not start the ad request service.");
              tt.a.removeCallbacks(d);
            }
            return;
            tp.b("Fetching ad response from remote ad request service.");
            ip.a();
            if (uk.c(localContext)) {
              break;
            }
            tp.e("Failed to connect to remote ad request service.");
            localObject1 = null;
          }
          localObject1 = new qm.b(localContext, localun, localuv, (ql.a)localObject1);
        }
      }
    });
    localObject2 = w.D().b(c);
    localObject3 = w.D().c(c);
    String str = w.D().d(c);
    w.D().c(c, str);
    i = new qo(a, l, (String)localObject2, (String)localObject3, str);
    ((uv)localObject1).a(i);
  }
  
  final void a(int paramInt, String paramString)
  {
    if ((paramInt == 3) || (paramInt == -1))
    {
      tp.d(paramString);
      if (f != null) {
        break label93;
      }
      f = new qr(paramInt);
      label33:
      if (i == null) {
        break label115;
      }
    }
    label93:
    label115:
    for (paramString = i;; paramString = new qo(a, -1L, null, null, null))
    {
      paramString = new tg.a(paramString, f, g, null, paramInt, -1L, f.n, null);
      h.a(paramString);
      return;
      tp.e(paramString);
      break;
      f = new qr(paramInt, f.k);
      break label33;
    }
  }
  
  public final void a(qr arg1)
  {
    tp.b("Received ad response.");
    f = ???;
    long l = w.k().b();
    label283:
    Object localObject3;
    for (;;)
    {
      synchronized (b)
      {
        e = null;
        w.i().b(c, f.H);
        ??? = ke.aW;
        if (((Boolean)w.q().a(???)).booleanValue())
        {
          if (!f.P) {
            break label283;
          }
          w.i();
          Object localObject1 = c;
          ??? = i.e;
          localObject1 = ((Context)localObject1).getSharedPreferences("admob", 0);
          localObject5 = ((SharedPreferences)localObject1).getStringSet("never_pool_slots", Collections.emptySet());
          if (!((Set)localObject5).contains(???))
          {
            localObject5 = new HashSet((Collection)localObject5);
            ((Set)localObject5).add(???);
            ??? = ((SharedPreferences)localObject1).edit();
            ???.putStringSet("never_pool_slots", (Set)localObject5);
            ???.apply();
          }
        }
        try
        {
          if ((f.e == -2) || (f.e == -3)) {
            break;
          }
          int j = f.e;
          throw new a(66 + "There was a problem getting an ad response. ErrorCode: " + j, f.e);
        }
        catch (a ???)
        {
          a(a, ???.getMessage());
          tt.a.removeCallbacks(d);
          return;
        }
      }
      w.i();
      localObject3 = c;
      ??? = i.e;
      localObject3 = ((Context)localObject3).getSharedPreferences("admob", 0);
      Object localObject5 = ((SharedPreferences)localObject3).getStringSet("never_pool_slots", Collections.emptySet());
      if (((Set)localObject5).contains(???))
      {
        localObject5 = new HashSet((Collection)localObject5);
        ((Set)localObject5).remove(???);
        ??? = ((SharedPreferences)localObject3).edit();
        ???.putStringSet("never_pool_slots", (Set)localObject5);
        ???.apply();
      }
    }
    if (f.e != -3)
    {
      if (TextUtils.isEmpty(f.c)) {
        throw new a("No fill from ad server.", 3);
      }
      w.i().a(c, f.u);
      boolean bool = f.h;
      if (!bool) {
        break label744;
      }
    }
    for (;;)
    {
      try
      {
        g = new ns(f.c);
        ih = g.g;
        if (!TextUtils.isEmpty(f.I))
        {
          ??? = ke.cV;
          if (((Boolean)w.q().a(???)).booleanValue())
          {
            tp.b("Received cookie from server. Setting webview cookie in CookieManager.");
            ??? = w.g().c(c);
            if (??? != null) {
              ???.setCookie("googleads.g.doubleclick.net", f.I);
            }
          }
        }
        if (i.d.g == null) {
          break label776;
        }
        ??? = a(i);
        w.i().b(f.v);
        w.i().c(f.O);
        if (TextUtils.isEmpty(f.r)) {
          break label770;
        }
        ??? = "Could not parse mediation config: ".concat(???);
      }
      catch (JSONException ???)
      {
        try
        {
          localObject3 = new JSONObject(f.r);
          ??? = new tg.a(i, f, g, ???, -2, l, f.n, (JSONObject)localObject3);
          h.a(???);
          tt.a.removeCallbacks(d);
          return;
        }
        catch (Exception localException)
        {
          tp.b("Error parsing the JSON for Active View.", localException);
        }
        ??? = ???;
        tp.b("Could not parse mediation config.", ???);
        ??? = String.valueOf(f.c);
        if (???.length() == 0) {}
      }
      for (;;)
      {
        throw new a(???, 0);
        ??? = new String("Could not parse mediation config: ");
      }
      label744:
      ih = f.K;
      continue;
      label770:
      Object localObject4 = null;
      continue;
      label776:
      ??? = null;
    }
  }
  
  public final void c_()
  {
    synchronized (b)
    {
      if (e != null) {
        e.b();
      }
      return;
    }
  }
  
  @qi
  static final class a
    extends Exception
  {
    final int a;
    
    public a(String paramString, int paramInt)
    {
      super();
      a = paramInt;
    }
  }
}


/* Location:              com/google/android/gms/b/qk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */