package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.j;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@qi
public final class oj
  extends od.a
{
  private final com.google.android.gms.ads.mediation.b a;
  private ok b;
  
  public oj(com.google.android.gms.ads.mediation.b paramb)
  {
    a = paramb;
  }
  
  private Bundle a(String paramString1, ih paramih, String paramString2)
  {
    Object localObject = String.valueOf(paramString1);
    if (((String)localObject).length() != 0) {
      localObject = "Server parameters: ".concat((String)localObject);
    }
    for (;;)
    {
      ul.e((String)localObject);
      try
      {
        localObject = new Bundle();
        if (paramString1 == null) {
          break;
        }
        paramString1 = new JSONObject(paramString1);
        localObject = new Bundle();
        Iterator localIterator = paramString1.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          ((Bundle)localObject).putString(str, paramString1.getString(str));
        }
        localObject = new String("Server parameters: ");
      }
      catch (Throwable paramString1)
      {
        ul.c("Could not get Server Parameters Bundle.", paramString1);
        throw new RemoteException();
      }
    }
    if ((a instanceof AdMobAdapter))
    {
      ((Bundle)localObject).putString("adJson", paramString2);
      if (paramih != null) {
        ((Bundle)localObject).putInt("tagForChildDirectedTreatment", g);
      }
    }
    return (Bundle)localObject;
  }
  
  public final com.google.android.gms.a.a a()
  {
    Object localObject;
    if (!(a instanceof c))
    {
      localObject = String.valueOf(a.getClass().getCanonicalName());
      if (((String)localObject).length() != 0) {}
      for (localObject = "MediationAdapter is not a MediationBannerAdapter: ".concat((String)localObject);; localObject = new String("MediationAdapter is not a MediationBannerAdapter: "))
      {
        ul.e((String)localObject);
        throw new RemoteException();
      }
    }
    try
    {
      localObject = com.google.android.gms.a.b.a(((c)a).getBannerView());
      return (com.google.android.gms.a.a)localObject;
    }
    catch (Throwable localThrowable)
    {
      ul.c("Could not get banner view from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void a(com.google.android.gms.a.a parama)
  {
    try
    {
      com.google.android.gms.a.b.a(parama);
      return;
    }
    catch (Throwable parama)
    {
      ul.a("Could not inform adapter of changed context", parama);
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, ih paramih, String paramString, oe paramoe)
  {
    a(parama, paramih, paramString, null, paramoe);
  }
  
  public final void a(com.google.android.gms.a.a parama, ih paramih, String paramString1, sq paramsq, String paramString2)
  {
    if (!(a instanceof com.google.android.gms.ads.d.a.b))
    {
      parama = String.valueOf(a.getClass().getCanonicalName());
      if (parama.length() != 0) {}
      for (parama = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(parama);; parama = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        ul.e(parama);
        throw new RemoteException();
      }
    }
    ul.b("Initialize rewarded video adapter.");
    for (;;)
    {
      Object localObject;
      try
      {
        com.google.android.gms.ads.d.a.b localb = (com.google.android.gms.ads.d.a.b)a;
        Bundle localBundle = a(paramString2, paramih, null);
        if (paramih == null) {
          break label263;
        }
        if (e == null) {
          break label271;
        }
        paramString2 = new HashSet(e);
        if (b == -1L)
        {
          localObject = null;
          paramString2 = new oi((Date)localObject, d, paramString2, k, f, g, r);
          if (m != null)
          {
            localObject = m.getBundle(localb.getClass().getName());
            paramih = paramString2;
            paramString2 = (String)localObject;
            localb.initialize((Context)com.google.android.gms.a.b.a(parama), paramih, paramString1, new sr(paramsq), localBundle, paramString2);
          }
        }
        else
        {
          localObject = new Date(b);
          continue;
        }
        localObject = null;
      }
      catch (Throwable parama)
      {
        ul.c("Could not initialize rewarded video adapter.", parama);
        throw new RemoteException();
      }
      paramih = paramString2;
      paramString2 = (String)localObject;
      continue;
      label263:
      paramString2 = null;
      paramih = null;
      continue;
      label271:
      paramString2 = null;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    if (!(a instanceof e))
    {
      parama = String.valueOf(a.getClass().getCanonicalName());
      if (parama.length() != 0) {}
      for (parama = "MediationAdapter is not a MediationInterstitialAdapter: ".concat(parama);; parama = new String("MediationAdapter is not a MediationInterstitialAdapter: "))
      {
        ul.e(parama);
        throw new RemoteException();
      }
    }
    ul.b("Requesting interstitial ad from adapter.");
    for (;;)
    {
      try
      {
        e locale = (e)a;
        if (e == null) {
          break label241;
        }
        localObject1 = new HashSet(e);
        Object localObject2;
        if (b == -1L)
        {
          localObject2 = null;
          localObject2 = new oi((Date)localObject2, d, (Set)localObject1, k, f, g, r);
          if (m != null)
          {
            localObject1 = m.getBundle(locale.getClass().getName());
            locale.requestInterstitialAd((Context)com.google.android.gms.a.b.a(parama), new ok(paramoe), a(paramString1, paramih, paramString2), (com.google.android.gms.ads.mediation.a)localObject2, (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(b);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable parama)
      {
        ul.c("Could not request interstitial ad from adapter.", parama);
        throw new RemoteException();
      }
      continue;
      label241:
      Object localObject1 = null;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, ih paramih, String paramString1, String paramString2, oe paramoe, le paramle, List<String> paramList)
  {
    if (!(a instanceof g))
    {
      parama = String.valueOf(a.getClass().getCanonicalName());
      if (parama.length() != 0) {}
      for (parama = "MediationAdapter is not a MediationNativeAdapter: ".concat(parama);; parama = new String("MediationAdapter is not a MediationNativeAdapter: "))
      {
        ul.e(parama);
        throw new RemoteException();
      }
    }
    for (;;)
    {
      try
      {
        g localg = (g)a;
        if (e == null) {
          break label248;
        }
        localHashSet = new HashSet(e);
        Date localDate;
        if (b == -1L)
        {
          localDate = null;
          paramList = new on(localDate, d, localHashSet, k, f, g, paramle, paramList, r);
          if (m != null)
          {
            paramle = m.getBundle(localg.getClass().getName());
            b = new ok(paramoe);
            localg.requestNativeAd((Context)com.google.android.gms.a.b.a(parama), b, a(paramString1, paramih, paramString2), paramList, paramle);
          }
        }
        else
        {
          localDate = new Date(b);
          continue;
        }
        paramle = null;
      }
      catch (Throwable parama)
      {
        ul.c("Could not request native ad from adapter.", parama);
        throw new RemoteException();
      }
      continue;
      label248:
      HashSet localHashSet = null;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, il paramil, ih paramih, String paramString, oe paramoe)
  {
    a(parama, paramil, paramih, paramString, null, paramoe);
  }
  
  public final void a(com.google.android.gms.a.a parama, il paramil, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    if (!(a instanceof c))
    {
      parama = String.valueOf(a.getClass().getCanonicalName());
      if (parama.length() != 0) {}
      for (parama = "MediationAdapter is not a MediationBannerAdapter: ".concat(parama);; parama = new String("MediationAdapter is not a MediationBannerAdapter: "))
      {
        ul.e(parama);
        throw new RemoteException();
      }
    }
    ul.b("Requesting banner ad from adapter.");
    for (;;)
    {
      try
      {
        c localc = (c)a;
        if (e == null) {
          break label258;
        }
        localObject1 = new HashSet(e);
        Object localObject2;
        if (b == -1L)
        {
          localObject2 = null;
          localObject2 = new oi((Date)localObject2, d, (Set)localObject1, k, f, g, r);
          if (m != null)
          {
            localObject1 = m.getBundle(localc.getClass().getName());
            localc.requestBannerAd((Context)com.google.android.gms.a.b.a(parama), new ok(paramoe), a(paramString1, paramih, paramString2), com.google.android.gms.ads.k.a(e, b, a), (com.google.android.gms.ads.mediation.a)localObject2, (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(b);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable parama)
      {
        ul.c("Could not request banner ad from adapter.", parama);
        throw new RemoteException();
      }
      continue;
      label258:
      Object localObject1 = null;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, sq paramsq, List<String> paramList)
  {
    if (!(a instanceof com.google.android.gms.ads.d.a.a))
    {
      parama = String.valueOf(a.getClass().getCanonicalName());
      if (parama.length() != 0) {}
      for (parama = "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ".concat(parama);; parama = new String("MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: "))
      {
        ul.e(parama);
        throw new RemoteException();
      }
    }
    ul.b("Initialize rewarded video adapter.");
    try
    {
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(a((String)paramList.next(), null, null));
      }
      com.google.android.gms.a.b.a(parama);
    }
    catch (Throwable parama)
    {
      ul.c("Could not initialize rewarded video adapter.", parama);
      throw new RemoteException();
    }
    new sr(paramsq);
  }
  
  public final void a(ih paramih, String paramString)
  {
    a(paramih, paramString, null);
  }
  
  public final void a(ih paramih, String paramString1, String paramString2)
  {
    if (!(a instanceof com.google.android.gms.ads.d.a.b))
    {
      paramih = String.valueOf(a.getClass().getCanonicalName());
      if (paramih.length() != 0) {}
      for (paramih = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(paramih);; paramih = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        ul.e(paramih);
        throw new RemoteException();
      }
    }
    ul.b("Requesting rewarded video ad from adapter.");
    for (;;)
    {
      try
      {
        com.google.android.gms.ads.d.a.b localb = (com.google.android.gms.ads.d.a.b)a;
        if (e == null) {
          break label226;
        }
        localObject1 = new HashSet(e);
        Object localObject2;
        if (b == -1L)
        {
          localObject2 = null;
          localObject2 = new oi((Date)localObject2, d, (Set)localObject1, k, f, g, r);
          if (m != null)
          {
            localObject1 = m.getBundle(localb.getClass().getName());
            localb.loadAd((com.google.android.gms.ads.mediation.a)localObject2, a(paramString1, paramih, paramString2), (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(b);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable paramih)
      {
        ul.c("Could not load rewarded video ad from adapter.", paramih);
        throw new RemoteException();
      }
      continue;
      label226:
      Object localObject1 = null;
    }
  }
  
  public final void b()
  {
    if (!(a instanceof e))
    {
      String str = String.valueOf(a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a MediationInterstitialAdapter: ".concat(str);; str = new String("MediationAdapter is not a MediationInterstitialAdapter: "))
      {
        ul.e(str);
        throw new RemoteException();
      }
    }
    ul.b("Showing interstitial from adapter.");
    try
    {
      ((e)a).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      ul.c("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void c()
  {
    try
    {
      a.onDestroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      ul.c("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void d()
  {
    try
    {
      a.onPause();
      return;
    }
    catch (Throwable localThrowable)
    {
      ul.c("Could not pause adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void e()
  {
    try
    {
      a.onResume();
      return;
    }
    catch (Throwable localThrowable)
    {
      ul.c("Could not resume adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void f()
  {
    if (!(a instanceof com.google.android.gms.ads.d.a.b))
    {
      String str = String.valueOf(a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(str);; str = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        ul.e(str);
        throw new RemoteException();
      }
    }
    ul.b("Show rewarded video ad from adapter.");
    try
    {
      ((com.google.android.gms.ads.d.a.b)a).showVideo();
      return;
    }
    catch (Throwable localThrowable)
    {
      ul.c("Could not show rewarded video ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final boolean g()
  {
    if (!(a instanceof com.google.android.gms.ads.d.a.b))
    {
      String str = String.valueOf(a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(str);; str = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        ul.e(str);
        throw new RemoteException();
      }
    }
    ul.b("Check if adapter is initialized.");
    try
    {
      boolean bool = ((com.google.android.gms.ads.d.a.b)a).isInitialized();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      ul.c("Could not check if adapter is initialized.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final og h()
  {
    i locali = b.a;
    if ((locali instanceof j)) {
      return new ol((j)locali);
    }
    return null;
  }
  
  public final oh i()
  {
    i locali = b.a;
    if ((locali instanceof com.google.android.gms.ads.mediation.k)) {
      return new om((com.google.android.gms.ads.mediation.k)locali);
    }
    return null;
  }
  
  public final Bundle j()
  {
    if (!(a instanceof vp))
    {
      String str = String.valueOf(a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a v2 MediationBannerAdapter: ".concat(str);; str = new String("MediationAdapter is not a v2 MediationBannerAdapter: "))
      {
        ul.e(str);
        return new Bundle();
      }
    }
    return ((vp)a).a();
  }
  
  public final Bundle k()
  {
    if (!(a instanceof vq))
    {
      String str = String.valueOf(a.getClass().getCanonicalName());
      if (str.length() != 0) {}
      for (str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ".concat(str);; str = new String("MediationAdapter is not a v2 MediationInterstitialAdapter: "))
      {
        ul.e(str);
        return new Bundle();
      }
    }
    return ((vq)a).getInterstitialAdapterInfo();
  }
  
  public final Bundle l()
  {
    return new Bundle();
  }
  
  public final boolean m()
  {
    return a instanceof com.google.android.gms.ads.d.a.a;
  }
}


/* Location:              com/google/android/gms/b/oj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */