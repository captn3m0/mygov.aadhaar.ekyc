package com.google.android.gms.b;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

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
    Object localObject1 = "Server parameters: ";
    Object localObject2 = String.valueOf(paramString1);
    int i = ((String)localObject2).length();
    if (i != 0) {
      localObject2 = ((String)localObject1).concat((String)localObject2);
    }
    for (;;)
    {
      ul.e((String)localObject2);
      try
      {
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        if (paramString1 == null) {
          break label170;
        }
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString1);
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        Iterator localIterator = localJSONObject.keys();
        for (;;)
        {
          boolean bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (String)localObject2;
          String str = localJSONObject.getString((String)localObject2);
          ((Bundle)localObject1).putString((String)localObject2, str);
        }
        localObject3 = new java/lang/String;
      }
      finally
      {
        ul.c("Could not get Server Parameters Bundle.", localThrowable);
        localObject3 = new android/os/RemoteException;
        ((RemoteException)localObject3).<init>();
      }
      ((String)localObject3).<init>((String)localObject1);
    }
    Object localObject3 = localObject1;
    label170:
    localObject1 = a;
    boolean bool2 = localObject1 instanceof AdMobAdapter;
    if (bool2)
    {
      localObject1 = "adJson";
      ((Bundle)localObject3).putString((String)localObject1, paramString2);
      if (paramih != null)
      {
        localObject1 = "tagForChildDirectedTreatment";
        i = g;
        ((Bundle)localObject3).putInt((String)localObject1, i);
      }
    }
    return (Bundle)localObject3;
  }
  
  public final com.google.android.gms.a.a a()
  {
    Object localObject = a;
    boolean bool = localObject instanceof com.google.android.gms.ads.mediation.c;
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
      localObject = (com.google.android.gms.ads.mediation.c)localObject;
      localObject = ((com.google.android.gms.ads.mediation.c)localObject).getBannerView();
      return com.google.android.gms.a.b.a(localObject);
    }
    finally
    {
      ul.c("Could not get banner view from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final void a(com.google.android.gms.a.a parama)
  {
    try
    {
      com.google.android.gms.a.b.a(parama);
      return;
    }
    finally
    {
      for (;;)
      {
        String str = "Could not inform adapter of changed context";
        ul.a(str, localThrowable);
      }
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, ih paramih, String paramString, oe paramoe)
  {
    a(parama, paramih, paramString, null, paramoe);
  }
  
  public final void a(com.google.android.gms.a.a parama, ih paramih, String paramString1, sq paramsq, String paramString2)
  {
    Object localObject1 = a;
    boolean bool1 = localObject1 instanceof com.google.android.gms.ads.d.a.b;
    Object localObject2;
    int i;
    if (!bool1)
    {
      localObject2 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
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
    localObject1 = "Initialize rewarded video adapter.";
    ul.b((String)localObject1);
    for (;;)
    {
      RemoteException localRemoteException;
      try
      {
        localObject1 = a;
        com.google.android.gms.ads.d.a.b localb = (com.google.android.gms.ads.d.a.b)localObject1;
        bool1 = false;
        localObject1 = null;
        boolean bool2 = false;
        localObject2 = null;
        Bundle localBundle1 = a(paramString2, paramih, null);
        if (paramih == null) {
          break label407;
        }
        localObject1 = e;
        Object localObject3;
        if (localObject1 != null)
        {
          localObject3 = new java/util/HashSet;
          localObject1 = e;
          ((HashSet)localObject3).<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/b/oi;
          l1 = b;
          long l2 = -1;
          bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            i = d;
            Object localObject4 = k;
            boolean bool3 = f;
            j = g;
            boolean bool4 = r;
            ((oi)localObject1).<init>((Date)localObject2, i, (Set)localObject3, (Location)localObject4, bool3, j, bool4);
            localObject2 = m;
            if (localObject2 == null) {
              break label394;
            }
            localObject2 = m;
            localObject5 = localb.getClass();
            localObject5 = ((Class)localObject5).getName();
            localBundle2 = ((Bundle)localObject2).getBundle((String)localObject5);
            localObject5 = localObject1;
            localObject2 = com.google.android.gms.a.b.a(parama);
            localObject2 = (Context)localObject2;
            localObject4 = new com/google/android/gms/b/sr;
            ((sr)localObject4).<init>(paramsq);
            localObject1 = localb;
            localObject3 = paramString1;
            localb.initialize((Context)localObject2, (com.google.android.gms.ads.mediation.a)localObject5, paramString1, (com.google.android.gms.ads.d.a.c)localObject4, localBundle1, localBundle2);
          }
        }
        else
        {
          localObject3 = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = b;
        ((Date)localObject2).<init>(l1);
        continue;
        j = 0;
      }
      finally
      {
        ul.c("Could not initialize rewarded video adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label394:
      Bundle localBundle2 = null;
      Object localObject5 = localRemoteException;
      continue;
      label407:
      int j = 0;
      localBundle2 = null;
      i = 0;
      localObject5 = null;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    Object localObject1 = a;
    boolean bool1 = localObject1 instanceof e;
    Object localObject2;
    int i;
    if (!bool1)
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
    for (;;)
    {
      try
      {
        localObject1 = a;
        Object localObject3 = localObject1;
        localObject3 = (e)localObject1;
        Object localObject4 = localObject3;
        localObject1 = e;
        Object localObject5;
        if (localObject1 != null)
        {
          localObject5 = new java/util/HashSet;
          localObject1 = e;
          ((HashSet)localObject5).<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/b/oi;
          l1 = b;
          long l2 = -1;
          boolean bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            i = d;
            Object localObject6 = k;
            boolean bool3 = f;
            j = g;
            boolean bool4 = r;
            ((oi)localObject1).<init>((Date)localObject2, i, (Set)localObject5, (Location)localObject6, bool3, j, bool4);
            localObject2 = m;
            if (localObject2 == null) {
              break label386;
            }
            localObject2 = m;
            Object localObject7 = localObject4.getClass();
            localObject7 = ((Class)localObject7).getName();
            localBundle = ((Bundle)localObject2).getBundle((String)localObject7);
            localObject7 = com.google.android.gms.a.b.a(parama);
            localObject7 = (Context)localObject7;
            localObject5 = new com/google/android/gms/b/ok;
            localObject3 = paramoe;
            ((ok)localObject5).<init>(paramoe);
            localObject3 = paramString2;
            localObject6 = a(paramString1, paramih, paramString2);
            localObject2 = localObject4;
            ((e)localObject4).requestInterstitialAd((Context)localObject7, (f)localObject5, (Bundle)localObject6, (com.google.android.gms.ads.mediation.a)localObject1, localBundle);
          }
        }
        else
        {
          localObject5 = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = b;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        int j = 0;
      }
      finally
      {
        ul.c("Could not request interstitial ad from adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label386:
      Bundle localBundle = null;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, ih paramih, String paramString1, String paramString2, oe paramoe, le paramle, List paramList)
  {
    Object localObject1 = a;
    boolean bool1 = localObject1 instanceof g;
    Object localObject2;
    int i;
    if (!bool1)
    {
      localObject2 = "MediationAdapter is not a MediationNativeAdapter: ";
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
    for (;;)
    {
      try
      {
        localObject1 = a;
        Object localObject3 = localObject1;
        localObject3 = (g)localObject1;
        Object localObject4 = localObject3;
        localObject1 = e;
        Object localObject5;
        if (localObject1 != null)
        {
          localObject5 = new java/util/HashSet;
          localObject1 = e;
          ((HashSet)localObject5).<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/b/on;
          l1 = b;
          long l2 = -1;
          boolean bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            i = d;
            Object localObject6 = k;
            boolean bool3 = f;
            j = g;
            boolean bool4 = r;
            ((on)localObject1).<init>((Date)localObject2, i, (Set)localObject5, (Location)localObject6, bool3, j, paramle, paramList, bool4);
            localObject2 = m;
            if (localObject2 == null) {
              break label392;
            }
            localObject2 = m;
            Object localObject7 = localObject4.getClass();
            localObject7 = ((Class)localObject7).getName();
            localBundle = ((Bundle)localObject2).getBundle((String)localObject7);
            localObject2 = new com/google/android/gms/b/ok;
            localObject3 = paramoe;
            ((ok)localObject2).<init>(paramoe);
            b = ((ok)localObject2);
            localObject7 = com.google.android.gms.a.b.a(parama);
            localObject7 = (Context)localObject7;
            localObject5 = b;
            localObject3 = paramString1;
            localObject6 = a(paramString1, paramih, paramString2);
            localObject2 = localObject4;
            ((g)localObject4).requestNativeAd((Context)localObject7, (h)localObject5, (Bundle)localObject6, (l)localObject1, localBundle);
          }
        }
        else
        {
          localObject5 = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = b;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        int j = 0;
      }
      finally
      {
        ul.c("Could not request native ad from adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label392:
      Bundle localBundle = null;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, il paramil, ih paramih, String paramString, oe paramoe)
  {
    a(parama, paramil, paramih, paramString, null, paramoe);
  }
  
  public final void a(com.google.android.gms.a.a parama, il paramil, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    Object localObject1 = a;
    boolean bool1 = localObject1 instanceof com.google.android.gms.ads.mediation.c;
    Object localObject2;
    int i;
    if (!bool1)
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
    for (;;)
    {
      try
      {
        localObject1 = a;
        Object localObject3 = localObject1;
        localObject3 = (com.google.android.gms.ads.mediation.c)localObject1;
        Object localObject4 = localObject3;
        localObject1 = e;
        Object localObject5;
        if (localObject1 != null)
        {
          localObject5 = new java/util/HashSet;
          localObject1 = e;
          ((HashSet)localObject5).<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/b/oi;
          l1 = b;
          long l2 = -1;
          boolean bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            i = d;
            Object localObject6 = k;
            boolean bool3 = f;
            int m = g;
            bool4 = r;
            ((oi)localObject1).<init>((Date)localObject2, i, (Set)localObject5, (Location)localObject6, bool3, m, bool4);
            localObject2 = m;
            if (localObject2 == null) {
              break label423;
            }
            localObject2 = m;
            Object localObject7 = localObject4.getClass();
            localObject7 = ((Class)localObject7).getName();
            localBundle = ((Bundle)localObject2).getBundle((String)localObject7);
            localObject7 = com.google.android.gms.a.b.a(parama);
            localObject7 = (Context)localObject7;
            localObject5 = new com/google/android/gms/b/ok;
            localObject3 = paramoe;
            ((ok)localObject5).<init>(paramoe);
            localObject3 = paramString2;
            localObject6 = a(paramString1, paramih, paramString2);
            int j = e;
            int k = b;
            Object localObject8 = a;
            com.google.android.gms.ads.d locald = com.google.android.gms.ads.k.a(j, k, (String)localObject8);
            localObject2 = localObject4;
            localObject8 = localObject1;
            ((com.google.android.gms.ads.mediation.c)localObject4).requestBannerAd((Context)localObject7, (com.google.android.gms.ads.mediation.d)localObject5, (Bundle)localObject6, locald, (com.google.android.gms.ads.mediation.a)localObject1, localBundle);
          }
        }
        else
        {
          localObject5 = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = b;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        boolean bool4 = false;
      }
      finally
      {
        ul.c("Could not request banner ad from adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label423:
      Bundle localBundle = null;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, sq paramsq, List paramList)
  {
    Object localObject1 = a;
    boolean bool = localObject1 instanceof com.google.android.gms.ads.d.a.a;
    Object localObject3;
    if (!bool)
    {
      localObject3 = "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ";
      localObject1 = String.valueOf(a.getClass().getCanonicalName());
      int i = ((String)localObject1).length();
      if (i != 0) {
        localObject1 = ((String)localObject3).concat((String)localObject1);
      }
      for (;;)
      {
        ul.e((String)localObject1);
        localObject1 = new android/os/RemoteException;
        ((RemoteException)localObject1).<init>();
        throw ((Throwable)localObject1);
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject3);
      }
    }
    localObject1 = "Initialize rewarded video adapter.";
    ul.b((String)localObject1);
    try
    {
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        localObject1 = a((String)localObject1, null, null);
        ((List)localObject3).add(localObject1);
      }
      com.google.android.gms.a.b.a(parama);
    }
    finally
    {
      ul.c("Could not initialize rewarded video adapter.", localThrowable);
      localObject2 = new android/os/RemoteException;
      ((RemoteException)localObject2).<init>();
    }
    Object localObject2 = new com/google/android/gms/b/sr;
    ((sr)localObject2).<init>(paramsq);
  }
  
  public final void a(ih paramih, String paramString)
  {
    a(paramih, paramString, null);
  }
  
  public final void a(ih paramih, String paramString1, String paramString2)
  {
    Object localObject1 = a;
    boolean bool1 = localObject1 instanceof com.google.android.gms.ads.d.a.b;
    Object localObject2;
    int i;
    if (!bool1)
    {
      localObject2 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
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
    localObject1 = "Requesting rewarded video ad from adapter.";
    ul.b((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = a;
        Object localObject3 = localObject1;
        localObject3 = (com.google.android.gms.ads.d.a.b)localObject1;
        Object localObject4 = localObject3;
        localObject1 = e;
        HashSet localHashSet;
        if (localObject1 != null)
        {
          localHashSet = new java/util/HashSet;
          localObject1 = e;
          localHashSet.<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/b/oi;
          l1 = b;
          long l2 = -1;
          bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            i = d;
            Location localLocation = k;
            boolean bool3 = f;
            int j = g;
            boolean bool4 = r;
            ((oi)localObject1).<init>((Date)localObject2, i, localHashSet, localLocation, bool3, j, bool4);
            localObject2 = m;
            if (localObject2 == null) {
              break label346;
            }
            localObject2 = m;
            Object localObject5 = localObject4.getClass();
            localObject5 = ((Class)localObject5).getName();
            localObject2 = ((Bundle)localObject2).getBundle((String)localObject5);
            localObject5 = a(paramString1, paramih, paramString2);
            ((com.google.android.gms.ads.d.a.b)localObject4).loadAd((com.google.android.gms.ads.mediation.a)localObject1, (Bundle)localObject5, (Bundle)localObject2);
          }
        }
        else
        {
          localHashSet = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = b;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        boolean bool2 = false;
      }
      finally
      {
        ul.c("Could not load rewarded video ad from adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label346:
      localObject2 = null;
    }
  }
  
  public final void b()
  {
    Object localObject = a;
    boolean bool = localObject instanceof e;
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
    localObject = "Showing interstitial from adapter.";
    ul.b((String)localObject);
    RemoteException localRemoteException;
    try
    {
      localObject = a;
      localObject = (e)localObject;
      ((e)localObject).showInterstitial();
      return;
    }
    finally
    {
      ul.c("Could not show interstitial from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final void c()
  {
    RemoteException localRemoteException;
    try
    {
      com.google.android.gms.ads.mediation.b localb = a;
      localb.onDestroy();
      return;
    }
    finally
    {
      ul.c("Could not destroy adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final void d()
  {
    RemoteException localRemoteException;
    try
    {
      com.google.android.gms.ads.mediation.b localb = a;
      localb.onPause();
      return;
    }
    finally
    {
      ul.c("Could not pause adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final void e()
  {
    RemoteException localRemoteException;
    try
    {
      com.google.android.gms.ads.mediation.b localb = a;
      localb.onResume();
      return;
    }
    finally
    {
      ul.c("Could not resume adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final void f()
  {
    Object localObject = a;
    boolean bool = localObject instanceof com.google.android.gms.ads.d.a.b;
    if (!bool)
    {
      String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
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
    localObject = "Show rewarded video ad from adapter.";
    ul.b((String)localObject);
    RemoteException localRemoteException;
    try
    {
      localObject = a;
      localObject = (com.google.android.gms.ads.d.a.b)localObject;
      ((com.google.android.gms.ads.d.a.b)localObject).showVideo();
      return;
    }
    finally
    {
      ul.c("Could not show rewarded video ad from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final boolean g()
  {
    Object localObject = a;
    boolean bool = localObject instanceof com.google.android.gms.ads.d.a.b;
    if (!bool)
    {
      String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
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
    localObject = "Check if adapter is initialized.";
    ul.b((String)localObject);
    RemoteException localRemoteException;
    try
    {
      localObject = a;
      localObject = (com.google.android.gms.ads.d.a.b)localObject;
      return ((com.google.android.gms.ads.d.a.b)localObject).isInitialized();
    }
    finally
    {
      ul.c("Could not check if adapter is initialized.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public final og h()
  {
    Object localObject = b.a;
    boolean bool = localObject instanceof j;
    ol localol;
    if (bool)
    {
      localol = new com/google/android/gms/b/ol;
      localObject = (j)localObject;
      localol.<init>((j)localObject);
    }
    for (localObject = localol;; localObject = null) {
      return (og)localObject;
    }
  }
  
  public final oh i()
  {
    Object localObject = b.a;
    boolean bool = localObject instanceof com.google.android.gms.ads.mediation.k;
    om localom;
    if (bool)
    {
      localom = new com/google/android/gms/b/om;
      localObject = (com.google.android.gms.ads.mediation.k)localObject;
      localom.<init>((com.google.android.gms.ads.mediation.k)localObject);
    }
    for (localObject = localom;; localObject = null) {
      return (oh)localObject;
    }
  }
  
  public final Bundle j()
  {
    Object localObject = a;
    boolean bool = localObject instanceof vp;
    String str;
    if (!bool)
    {
      str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
      localObject = String.valueOf(a.getClass().getCanonicalName());
      int i = ((String)localObject).length();
      if (i != 0)
      {
        localObject = str.concat((String)localObject);
        ul.e((String)localObject);
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
      }
    }
    for (;;)
    {
      return (Bundle)localObject;
      localObject = new java/lang/String;
      ((String)localObject).<init>(str);
      break;
      localObject = ((vp)a).a();
    }
  }
  
  public final Bundle k()
  {
    Object localObject = a;
    boolean bool = localObject instanceof vq;
    String str;
    if (!bool)
    {
      str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
      localObject = String.valueOf(a.getClass().getCanonicalName());
      int i = ((String)localObject).length();
      if (i != 0)
      {
        localObject = str.concat((String)localObject);
        ul.e((String)localObject);
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
      }
    }
    for (;;)
    {
      return (Bundle)localObject;
      localObject = new java/lang/String;
      ((String)localObject).<init>(str);
      break;
      localObject = ((vq)a).getInterstitialAdapterInfo();
    }
  }
  
  public final Bundle l()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
  
  public final boolean m()
  {
    return a instanceof com.google.android.gms.ads.d.a.a;
  }
}


/* Location:              com/google/android/gms/b/oj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */