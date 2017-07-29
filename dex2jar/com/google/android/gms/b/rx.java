package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.ads.internal.x;
import com.google.android.gms.common.internal.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class rx
  extends b
  implements sl
{
  private static rx m;
  private static final oa n = new oa();
  final Map<String, sp> l = new HashMap();
  private boolean o;
  
  public rx(Context paramContext, e parame, il paramil, oc paramoc, un paramun)
  {
    super(paramContext, paramil, null, paramoc, paramun, parame);
    m = this;
  }
  
  public static rx J()
  {
    return m;
  }
  
  private static tg.a b(tg.a parama)
  {
    tp.a("Creating mediation ad response for non-mediated rewarded ad.");
    try
    {
      Object localObject1 = ri.a(b).toString();
      Object localObject2 = new JSONObject();
      ((JSONObject)localObject2).put("pubid", a.e);
      localObject2 = ((JSONObject)localObject2).toString();
      localObject1 = Arrays.asList(new nr[] { new nr((String)localObject1, Arrays.asList(new String[] { "com.google.ads.mediation.admob.AdMobAdapter" }), Collections.emptyList(), Collections.emptyList(), (String)localObject2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList()) });
      localObject2 = ke.bG;
      localObject1 = new ns((List)localObject1, ((Long)w.q().a((jz)localObject2)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "");
      return new tg.a(a, b, (ns)localObject1, d, e, f, g, h);
    }
    catch (JSONException localJSONException)
    {
      tp.b("Unable to generate ad state for non-mediated rewarded video.", localJSONException);
    }
    return new tg.a(a, b, null, d, 0, f, g, h);
  }
  
  public final void K()
  {
    c.b("showAd must be called on the main UI thread.");
    if (!L()) {
      tp.e("The reward video has not loaded.");
    }
    sp localsp;
    do
    {
      return;
      o = true;
      localsp = b(f.j.q);
    } while ((localsp == null) || (a == null));
    try
    {
      a.f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      tp.c("Could not call showVideo.", localRemoteException);
    }
  }
  
  public final boolean L()
  {
    c.b("isLoaded must be called on the main UI thread.");
    return (f.g == null) && (f.h == null) && (f.j != null) && (!o);
  }
  
  public final void M()
  {
    a(f.j, false);
    t();
  }
  
  public final void N()
  {
    if ((f.j != null) && (f.j.o != null))
    {
      w.x();
      nx.a(f.c, f.e.a, f.j, f.b, false, f.j.o.j);
    }
    v();
  }
  
  public final void O()
  {
    r();
  }
  
  public final void P()
  {
    e();
  }
  
  public final void Q()
  {
    s();
  }
  
  public final void a(sg paramsg)
  {
    c.b("loadAd must be called on the main UI thread.");
    if (TextUtils.isEmpty(b))
    {
      tp.e("Invalid ad unit id. Aborting.");
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          rx.a(rx.this);
        }
      });
      return;
    }
    o = false;
    f.b = b;
    super.a(a);
  }
  
  public final void a(final tg.a parama, km paramkm)
  {
    if (e != -2)
    {
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          b(new tg(parama));
        }
      });
      return;
    }
    f.k = parama;
    if (c == null) {
      f.k = b(parama);
    }
    f.F = 0;
    paramkm = f;
    w.d();
    so localso = new so(f.c, f.k, this);
    parama = String.valueOf(localso.getClass().getName());
    if (parama.length() != 0) {}
    for (parama = "AdRenderer: ".concat(parama);; parama = new String("AdRenderer: "))
    {
      tp.b(parama);
      localso.c();
      h = localso;
      return;
    }
  }
  
  protected final boolean a(ih paramih, tg paramtg, boolean paramBoolean)
  {
    return false;
  }
  
  public final boolean a(tg paramtg1, tg paramtg2)
  {
    return true;
  }
  
  public final sp b(String paramString)
  {
    Object localObject1 = (sp)l.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null) {}
    try
    {
      localObject2 = j;
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
      {
        localObject2 = n;
        localObject2 = new sp(((oc)localObject2).a(paramString), this);
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          l.put(paramString, localObject2);
          return (sp)localObject2;
        }
        catch (Exception localException2)
        {
          localObject1 = localException1;
          Object localObject3 = localException2;
          continue;
        }
        localException1 = localException1;
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0)
        {
          paramString = "Fail to instantiate adapter ".concat(paramString);
          tp.c(paramString, localException1);
          return (sp)localObject1;
        }
        paramString = new String("Fail to instantiate adapter ");
      }
    }
  }
  
  public final void b(ss paramss)
  {
    if ((f.j != null) && (f.j.o != null))
    {
      w.x();
      nx.a(f.c, f.e.a, f.j, f.b, false, f.j.o.k);
    }
    ss localss = paramss;
    if (f.j != null)
    {
      localss = paramss;
      if (f.j.r != null)
      {
        localss = paramss;
        if (!TextUtils.isEmpty(f.j.r.j)) {
          localss = new ss(f.j.r.j, f.j.r.k);
        }
      }
    }
    a(localss);
  }
  
  public final void h()
  {
    c.b("destroy must be called on the main UI thread.");
    Iterator localIterator = l.keySet().iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          sp localsp = (sp)l.get(str);
          if ((localsp != null) && (a != null)) {
            a.c();
          }
        }
        catch (RemoteException localRemoteException)
        {
          str = String.valueOf(str);
          if (str.length() != 0) {}
          for (str = "Fail to destroy adapter: ".concat(str);; str = new String("Fail to destroy adapter: "))
          {
            tp.e(str);
            break;
          }
        }
      }
    }
  }
  
  public final void m()
  {
    c.b("pause must be called on the main UI thread.");
    Iterator localIterator = l.keySet().iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          sp localsp = (sp)l.get(str);
          if ((localsp != null) && (a != null)) {
            a.d();
          }
        }
        catch (RemoteException localRemoteException)
        {
          str = String.valueOf(str);
          if (str.length() != 0) {}
          for (str = "Fail to pause adapter: ".concat(str);; str = new String("Fail to pause adapter: "))
          {
            tp.e(str);
            break;
          }
        }
      }
    }
  }
  
  public final void n()
  {
    c.b("resume must be called on the main UI thread.");
    Iterator localIterator = l.keySet().iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          sp localsp = (sp)l.get(str);
          if ((localsp != null) && (a != null)) {
            a.e();
          }
        }
        catch (RemoteException localRemoteException)
        {
          str = String.valueOf(str);
          if (str.length() != 0) {}
          for (str = "Fail to resume adapter: ".concat(str);; str = new String("Fail to resume adapter: "))
          {
            tp.e(str);
            break;
          }
        }
      }
    }
  }
  
  protected final void r()
  {
    f.j = null;
    super.r();
  }
}


/* Location:              com/google/android/gms/b/rx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */