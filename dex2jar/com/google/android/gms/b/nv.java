package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.b.c.a;
import com.google.android.gms.ads.internal.w;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class nv
  implements nw.a
{
  final String a;
  final nr b;
  ih c;
  final il d;
  final Context e;
  final Object f = new Object();
  final un g;
  final boolean h;
  final le i;
  final List<String> j;
  final boolean k;
  od l;
  int m = -2;
  private final oc n;
  private final long o;
  private final ns p;
  private of q;
  
  public nv(Context paramContext, String paramString, oc paramoc, ns paramns, nr paramnr, ih paramih, il paramil, un paramun, boolean paramBoolean1, boolean paramBoolean2, le paramle, List<String> paramList)
  {
    e = paramContext;
    n = paramoc;
    b = paramnr;
    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
    {
      a = d();
      p = paramns;
      if (b == -1L) {
        break label136;
      }
    }
    label136:
    for (long l1 = b;; l1 = 10000L)
    {
      o = l1;
      c = paramih;
      d = paramil;
      g = paramun;
      h = paramBoolean1;
      k = paramBoolean2;
      i = paramle;
      j = paramList;
      return;
      a = paramString;
      break;
    }
  }
  
  private static od a(com.google.android.gms.ads.mediation.b paramb)
  {
    return new oj(paramb);
  }
  
  static com.google.android.gms.ads.b.c b(String paramString)
  {
    int i1 = 0;
    c.a locala = new c.a();
    if (paramString == null) {
      return locala.a();
    }
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString);
        c = paramString.optBoolean("multiple_images", false);
        a = paramString.optBoolean("only_urls", false);
        paramString = paramString.optString("native_image_orientation", "any");
        if (!"landscape".equals(paramString)) {
          continue;
        }
        i1 = 2;
        b = i1;
      }
      catch (JSONException paramString)
      {
        boolean bool;
        tp.c("Exception occurred when creating native ad options", paramString);
        continue;
      }
      return locala.a();
      bool = "portrait".equals(paramString);
      if (bool) {
        i1 = 1;
      }
    }
  }
  
  private String d()
  {
    try
    {
      if (!TextUtils.isEmpty(b.e))
      {
        if (n.b(b.e)) {
          return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
      }
    }
    catch (RemoteException localRemoteException)
    {
      tp.e("Fail to determine the custom event's version, assuming the old one.");
    }
    return "com.google.ads.mediation.customevent.CustomEventAdapter";
  }
  
  private of e()
  {
    if ((m != 0) || (!c())) {
      return null;
    }
    try
    {
      if ((b(4)) && (q != null) && (q.a() != 0))
      {
        of localof = q;
        return localof;
      }
    }
    catch (RemoteException localRemoteException)
    {
      tp.e("Could not get cpm value from MediationResponseMetadata");
    }
    new of.a()
    {
      public final int a()
      {
        return a;
      }
    };
  }
  
  private int f()
  {
    int i2;
    if (b.i == null)
    {
      i2 = 0;
      return i2;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject(b.i);
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(a)) {
        return localJSONObject.optInt("cpm_cents", 0);
      }
    }
    catch (JSONException localJSONException)
    {
      tp.e("Could not convert to json. Returning 0");
      return 0;
    }
    if (b(2)) {}
    for (int i1 = localJSONException.optInt("cpm_floor_cents", 0);; i1 = 0)
    {
      i2 = i1;
      if (i1 != 0) {
        break;
      }
      return localJSONException.optInt("penalized_average_cpm_cents", 0);
    }
  }
  
  public final nw a(long paramLong1, long paramLong2)
  {
    for (;;)
    {
      long l4;
      long l3;
      synchronized (f)
      {
        long l1 = SystemClock.elapsedRealtime();
        final Object localObject2 = new nu();
        tt.a.post(new Runnable()
        {
          public final void run()
          {
            synchronized (f)
            {
              if (m != -2) {
                return;
              }
              l = b();
              if (l == null)
              {
                a(4);
                return;
              }
            }
            if ((c()) && (!b(1)))
            {
              ??? = a;
              tp.e(String.valueOf(???).length() + 56 + "Ignoring adapter " + (String)??? + " as delayed impression is not supported");
              a(2);
              return;
            }
            nu localnu = localObject2;
            Object localObject4 = nv.this;
            synchronized (a)
            {
              b = ((nw.a)localObject4);
              ??? = nv.this;
              localnu = localObject2;
              localObject4 = ((nv)???).a(b.i);
            }
            try
            {
              if (g.c < 4100000)
              {
                if (d.d) {
                  l.a(com.google.android.gms.a.b.a(e), c, (String)localObject4, localnu);
                }
                for (;;)
                {
                  return;
                  localoe = finally;
                  throw localoe;
                  l.a(com.google.android.gms.a.b.a(e), d, c, (String)localObject4, localoe);
                }
              }
            }
            catch (RemoteException localRemoteException)
            {
              for (;;)
              {
                tp.c("Could not request ad from mediation adapter.", localRemoteException);
                ((nv)???).a(5);
                continue;
                if (h) {
                  l.a(com.google.android.gms.a.b.a(e), c, (String)localObject4, b.a, localRemoteException, i, j);
                } else if (d.d) {
                  l.a(com.google.android.gms.a.b.a(e), c, (String)localObject4, b.a, localRemoteException);
                } else if (k)
                {
                  if (b.l != null) {
                    l.a(com.google.android.gms.a.b.a(e), c, (String)localObject4, b.a, localRemoteException, new le(nv.b(b.p)), b.o);
                  } else {
                    l.a(com.google.android.gms.a.b.a(e), d, c, (String)localObject4, b.a, localRemoteException);
                  }
                }
                else {
                  l.a(com.google.android.gms.a.b.a(e), d, c, (String)localObject4, b.a, localRemoteException);
                }
              }
            }
          }
        });
        long l2 = o;
        if (m != -2)
        {
          paramLong1 = w.k().b();
          localObject2 = new nw(b, l, a, (nu)localObject2, m, e(), paramLong1 - l1);
          return (nw)localObject2;
        }
        l4 = SystemClock.elapsedRealtime();
        l3 = l2 - (l4 - l1);
        l4 = paramLong2 - (l4 - paramLong1);
        if ((l3 <= 0L) || (l4 <= 0L))
        {
          tp.d("Timed out waiting for adapter.");
          m = 3;
        }
      }
      try
      {
        f.wait(Math.min(l3, l4));
      }
      catch (InterruptedException localInterruptedException)
      {
        m = -1;
      }
    }
  }
  
  final String a(String paramString)
  {
    if ((paramString == null) || (!c()) || (b(2))) {
      return paramString;
    }
    try
    {
      Object localObject = new JSONObject(paramString);
      ((JSONObject)localObject).remove("cpm_floor_cents");
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (JSONException localJSONException)
    {
      tp.e("Could not remove field. Returning the original value");
    }
    return paramString;
  }
  
  public final void a()
  {
    synchronized (f)
    {
      try
      {
        if (l != null) {
          l.c();
        }
        m = -1;
        f.notify();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          tp.c("Could not destroy mediation adapter.", localRemoteException);
        }
      }
    }
  }
  
  public final void a(int paramInt)
  {
    synchronized (f)
    {
      m = paramInt;
      f.notify();
      return;
    }
  }
  
  public final void a(of paramof)
  {
    synchronized (f)
    {
      m = 0;
      q = paramof;
      f.notify();
      return;
    }
  }
  
  final od b()
  {
    Object localObject = String.valueOf(a);
    if (((String)localObject).length() != 0) {}
    for (localObject = "Instantiating mediation adapter: ".concat((String)localObject);; localObject = new String("Instantiating mediation adapter: "))
    {
      tp.d((String)localObject);
      if (h) {
        break label163;
      }
      localObject = ke.bC;
      if ((!((Boolean)w.q().a((jz)localObject)).booleanValue()) || (!"com.google.ads.mediation.admob.AdMobAdapter".equals(a))) {
        break;
      }
      return a(new AdMobAdapter());
    }
    localObject = ke.bD;
    if ((((Boolean)w.q().a((jz)localObject)).booleanValue()) && ("com.google.ads.mediation.AdUrlAdapter".equals(a))) {
      return a(new AdUrlAdapter());
    }
    if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(a)) {
      return new oj(new or());
    }
    try
    {
      label163:
      localObject = n.a(a);
      return (od)localObject;
    }
    catch (RemoteException localRemoteException)
    {
      localObject = String.valueOf(a);
      if (((String)localObject).length() == 0) {}
    }
    for (localObject = "Could not instantiate mediation adapter: ".concat((String)localObject);; localObject = new String("Could not instantiate mediation adapter: "))
    {
      tp.a((String)localObject, localRemoteException);
      return null;
    }
  }
  
  final boolean b(int paramInt)
  {
    boolean bool2 = false;
    try
    {
      Bundle localBundle;
      if (h) {
        localBundle = l.l();
      }
      for (;;)
      {
        boolean bool1 = bool2;
        if (localBundle != null)
        {
          bool1 = bool2;
          if ((localBundle.getInt("capabilities", 0) & paramInt) == paramInt) {
            bool1 = true;
          }
        }
        return bool1;
        if (d.d) {
          localBundle = l.k();
        } else {
          localBundle = l.j();
        }
      }
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      tp.e("Could not get adapter info. Returning false");
    }
  }
  
  final boolean c()
  {
    return p.l != -1;
  }
}


/* Location:              com/google/android/gms/b/nv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */