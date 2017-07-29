package com.google.android.gms.b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;
import com.google.ads.mediation.h;
import com.google.ads.mediation.i;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class oo
  extends od.a
{
  private final c a;
  private final i b;
  
  public oo(c paramc, i parami)
  {
    a = paramc;
    b = parami;
  }
  
  private h a(String paramString)
  {
    if (paramString != null) {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localObject1 = new java/util/HashMap;
        int i = localJSONObject.length();
        ((HashMap)localObject1).<init>(i);
        Iterator localIterator = localJSONObject.keys();
        for (;;)
        {
          boolean bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          Object localObject2 = localIterator.next();
          localObject2 = (String)localObject2;
          String str = localJSONObject.getString((String)localObject2);
          ((Map)localObject1).put(localObject2, str);
        }
        localObject3 = new java/util/HashMap;
      }
      finally
      {
        ul.c("Could not get MediationServerParameters.", localThrowable);
        localObject3 = new android/os/RemoteException;
        ((RemoteException)localObject3).<init>();
      }
    }
    Object localObject1 = null;
    ((HashMap)localObject3).<init>(0);
    localObject1 = localObject3;
    Object localObject3 = a;
    localObject3 = ((c)localObject3).b();
    localObject3 = ((Class)localObject3).newInstance();
    localObject3 = (h)localObject3;
    ((h)localObject3).a((Map)localObject1);
    return (h)localObject3;
  }
  
  public final a a()
  {
    Object localObject = a;
    boolean bool = localObject instanceof d;
    if (!bool)
    {
      String str = "MediationAdapter is not a MediationBannerAdapter: ";
      localObject = String.valueOf(a.getClass().getCanonicalName());
      int i = ((String)localObject).length();
      if (i != 0) {
        localObject = str.concat((String)localObject);
      }
      for (;;)
      {
        ul.e((String)localObject);
        localObject = new android/os/RemoteException;
        ((RemoteException)localObject).<init>();
        throw ((Throwable)localObject);
        localObject = new java/lang/String;
        ((String)localObject).<init>(str);
      }
    }
    RemoteException localRemoteException;
    try
    {
      localObject = a;
      localObject = (d)localObject;
      localObject = ((d)localObject).c();
      return b.a(localObject);
    }
    finally
    {
      ul.c("Could not get banner view from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
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
    Object localObject1 = a;
    boolean bool = localObject1 instanceof f;
    Object localObject2;
    int i;
    if (!bool)
    {
      localObject2 = "MediationAdapter is not a MediationInterstitialAdapter: ";
      localObject1 = String.valueOf(a.getClass().getCanonicalName());
      i = ((String)localObject1).length();
      if (i != 0) {
        localObject1 = ((String)localObject2).concat((String)localObject1);
      }
      for (;;)
      {
        ul.e((String)localObject1);
        localObject1 = new android/os/RemoteException;
        ((RemoteException)localObject1).<init>();
        throw ((Throwable)localObject1);
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject2);
      }
    }
    localObject1 = "Requesting interstitial ad from adapter.";
    ul.b((String)localObject1);
    RemoteException localRemoteException;
    try
    {
      localObject1 = a;
      localObject1 = (f)localObject1;
      localObject2 = new com/google/android/gms/b/op;
      ((op)localObject2).<init>(paramoe);
      b.a(parama);
      i = g;
      h localh = a(paramString1);
      oq.a(paramih);
      i locali = b;
      ((f)localObject1).a((g)localObject2, localh, locali);
      return;
    }
    finally
    {
      ul.c("Could not request interstitial ad from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final void a(a parama, ih paramih, String paramString1, String paramString2, oe paramoe, le paramle, List paramList) {}
  
  public final void a(a parama, il paramil, ih paramih, String paramString, oe paramoe)
  {
    a(parama, paramil, paramih, paramString, null, paramoe);
  }
  
  public final void a(a parama, il paramil, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    Object localObject1 = a;
    boolean bool = localObject1 instanceof d;
    Object localObject2;
    int i;
    if (!bool)
    {
      localObject2 = "MediationAdapter is not a MediationBannerAdapter: ";
      localObject1 = String.valueOf(a.getClass().getCanonicalName());
      i = ((String)localObject1).length();
      if (i != 0) {
        localObject1 = ((String)localObject2).concat((String)localObject1);
      }
      for (;;)
      {
        ul.e((String)localObject1);
        localObject1 = new android/os/RemoteException;
        ((RemoteException)localObject1).<init>();
        throw ((Throwable)localObject1);
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject2);
      }
    }
    localObject1 = "Requesting banner ad from adapter.";
    ul.b((String)localObject1);
    RemoteException localRemoteException;
    try
    {
      localObject1 = a;
      localObject1 = (d)localObject1;
      localObject2 = new com/google/android/gms/b/op;
      ((op)localObject2).<init>(paramoe);
      b.a(parama);
      i = g;
      h localh = a(paramString1);
      oq.a(paramil);
      oq.a(paramih);
      i locali = b;
      ((d)localObject1).a((e)localObject2, localh, locali);
      return;
    }
    finally
    {
      ul.c("Could not request banner ad from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final void a(a parama, sq paramsq, List paramList) {}
  
  public final void a(ih paramih, String paramString) {}
  
  public final void a(ih paramih, String paramString1, String paramString2) {}
  
  public final void b()
  {
    Object localObject = a;
    boolean bool = localObject instanceof f;
    if (!bool)
    {
      String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
      localObject = String.valueOf(a.getClass().getCanonicalName());
      int i = ((String)localObject).length();
      if (i != 0) {
        localObject = str.concat((String)localObject);
      }
      for (;;)
      {
        ul.e((String)localObject);
        localObject = new android/os/RemoteException;
        ((RemoteException)localObject).<init>();
        throw ((Throwable)localObject);
        localObject = new java/lang/String;
        ((String)localObject).<init>(str);
      }
    }
    ul.b("Showing interstitial from adapter.");
  }
  
  public final void c() {}
  
  public final void d()
  {
    RemoteException localRemoteException = new android/os/RemoteException;
    localRemoteException.<init>();
    throw localRemoteException;
  }
  
  public final void e()
  {
    RemoteException localRemoteException = new android/os/RemoteException;
    localRemoteException.<init>();
    throw localRemoteException;
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
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
  
  public final Bundle k()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
  
  public final Bundle l()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
  
  public final boolean m()
  {
    return false;
  }
}


/* Location:              com/google/android/gms/b/oo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */