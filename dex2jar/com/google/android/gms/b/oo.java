package com.google.android.gms.b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.f;
import com.google.ads.mediation.h;
import com.google.ads.mediation.i;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@qi
public final class oo<NETWORK_EXTRAS extends i, SERVER_PARAMETERS extends h>
  extends od.a
{
  private final c<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
  private final NETWORK_EXTRAS b;
  
  public oo(c<NETWORK_EXTRAS, SERVER_PARAMETERS> paramc, NETWORK_EXTRAS paramNETWORK_EXTRAS)
  {
    a = paramc;
    b = paramNETWORK_EXTRAS;
  }
  
  private SERVER_PARAMETERS a(String paramString)
  {
    if (paramString != null) {
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        localObject = new HashMap(localJSONObject.length());
        Iterator localIterator = localJSONObject.keys();
        for (;;)
        {
          paramString = (String)localObject;
          if (!localIterator.hasNext()) {
            break;
          }
          paramString = (String)localIterator.next();
          ((Map)localObject).put(paramString, localJSONObject.getString(paramString));
        }
        paramString = new HashMap(0);
      }
      catch (Throwable paramString)
      {
        ul.c("Could not get MediationServerParameters.", paramString);
        throw new RemoteException();
      }
    }
    Object localObject = (h)a.b().newInstance();
    ((h)localObject).a(paramString);
    return (SERVER_PARAMETERS)localObject;
  }
  
  public final a a()
  {
    Object localObject;
    if (!(a instanceof d))
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
      localObject = b.a(((d)a).c());
      return (a)localObject;
    }
    catch (Throwable localThrowable)
    {
      ul.c("Could not get banner view from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void a(a parama) {}
  
  public final void a(a parama, ih paramih, String paramString, oe paramoe)
  {
    a(parama, paramih, paramString, null, paramoe);
  }
  
  public final void a(a parama, ih paramih, String paramString1, sq paramsq, String paramString2) {}
  
  public final void a(a parama, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    if (!(a instanceof f))
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
    try
    {
      paramString2 = (f)a;
      paramoe = new op(paramoe);
      b.a(parama);
      int i = g;
      parama = a(paramString1);
      oq.a(paramih);
      paramString2.a(paramoe, parama, b);
      return;
    }
    catch (Throwable parama)
    {
      ul.c("Could not request interstitial ad from adapter.", parama);
      throw new RemoteException();
    }
  }
  
  public final void a(a parama, ih paramih, String paramString1, String paramString2, oe paramoe, le paramle, List<String> paramList) {}
  
  public final void a(a parama, il paramil, ih paramih, String paramString, oe paramoe)
  {
    a(parama, paramil, paramih, paramString, null, paramoe);
  }
  
  public final void a(a parama, il paramil, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    if (!(a instanceof d))
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
    try
    {
      paramString2 = (d)a;
      paramoe = new op(paramoe);
      b.a(parama);
      int i = g;
      parama = a(paramString1);
      oq.a(paramil);
      oq.a(paramih);
      paramString2.a(paramoe, parama, b);
      return;
    }
    catch (Throwable parama)
    {
      ul.c("Could not request banner ad from adapter.", parama);
      throw new RemoteException();
    }
  }
  
  public final void a(a parama, sq paramsq, List<String> paramList) {}
  
  public final void a(ih paramih, String paramString) {}
  
  public final void a(ih paramih, String paramString1, String paramString2) {}
  
  public final void b()
  {
    if (!(a instanceof f))
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
  }
  
  public final void c() {}
  
  public final void d()
  {
    throw new RemoteException();
  }
  
  public final void e()
  {
    throw new RemoteException();
  }
  
  public final void f() {}
  
  public final boolean g()
  {
    return true;
  }
  
  public final og h()
  {
    return null;
  }
  
  public final oh i()
  {
    return null;
  }
  
  public final Bundle j()
  {
    return new Bundle();
  }
  
  public final Bundle k()
  {
    return new Bundle();
  }
  
  public final Bundle l()
  {
    return new Bundle();
  }
  
  public final boolean m()
  {
    return false;
  }
}


/* Location:              com/google/android/gms/b/oo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */