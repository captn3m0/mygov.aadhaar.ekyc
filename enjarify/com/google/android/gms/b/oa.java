package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.i;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.customevent.a;
import java.util.Map;

public final class oa
  extends oc.a
{
  public Map a;
  
  private od c(String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject3 = oa.class;
    for (;;)
    {
      try
      {
        localObject3 = ((Class)localObject3).getClassLoader();
        localObject1 = Class.forName(paramString, false, (ClassLoader)localObject3);
        localObject3 = com.google.ads.mediation.c.class;
        bool = ((Class)localObject3).isAssignableFrom((Class)localObject1);
        if (!bool) {
          continue;
        }
        localObject1 = ((Class)localObject1).newInstance();
        localObject1 = (com.google.ads.mediation.c)localObject1;
        localObject3 = a;
        Object localObject4 = ((com.google.ads.mediation.c)localObject1).a();
        localObject3 = ((Map)localObject3).get(localObject4);
        localObject3 = (i)localObject3;
        localObject4 = new com/google/android/gms/b/oo;
        ((oo)localObject4).<init>((com.google.ads.mediation.c)localObject1, (i)localObject3);
        localObject1 = localObject4;
      }
      finally
      {
        boolean bool;
        od localod = d(paramString);
        continue;
      }
      return (od)localObject1;
      localObject3 = b.class;
      bool = ((Class)localObject3).isAssignableFrom((Class)localObject1);
      if (!bool) {
        continue;
      }
      localObject1 = ((Class)localObject1).newInstance();
      localObject1 = (b)localObject1;
      localObject3 = new com/google/android/gms/b/oj;
      ((oj)localObject3).<init>((b)localObject1);
      localObject1 = localObject3;
    }
    localObject1 = String.valueOf(paramString);
    i = ((String)localObject1).length() + 64;
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>(i);
    localObject1 = "Could not instantiate mediation adapter: ";
    localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    localObject3 = " (not a valid adapter).";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
    localObject1 = ((StringBuilder)localObject1).toString();
    ul.e((String)localObject1);
    localObject1 = new android/os/RemoteException;
    ((RemoteException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  private od d(String paramString)
  {
    Object localObject1 = "Reflection failed, retrying using direct instantiation";
    for (;;)
    {
      Object localObject3;
      Object localObject4;
      Object localObject2;
      try
      {
        ul.b((String)localObject1);
        localObject1 = "com.google.ads.mediation.admob.AdMobAdapter";
        bool = ((String)localObject1).equals(paramString);
        if (bool)
        {
          localObject1 = new com/google/android/gms/b/oj;
          localObject3 = new com/google/ads/mediation/admob/AdMobAdapter;
          ((AdMobAdapter)localObject3).<init>();
          ((oj)localObject1).<init>((b)localObject3);
          return (od)localObject1;
        }
        localObject1 = "com.google.ads.mediation.AdUrlAdapter";
        bool = ((String)localObject1).equals(paramString);
        if (bool)
        {
          localObject1 = new com/google/android/gms/b/oj;
          localObject3 = new com/google/ads/mediation/AdUrlAdapter;
          ((AdUrlAdapter)localObject3).<init>();
          ((oj)localObject1).<init>((b)localObject3);
          continue;
        }
        int i;
        localObject2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
      }
      finally
      {
        i = String.valueOf(paramString).length() + 43;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(i);
        localObject3 = ((StringBuilder)localObject4).append("Could not instantiate mediation adapter: ").append(paramString);
        localObject4 = ". ";
        localObject3 = (String)localObject4;
        ul.c((String)localObject3, localThrowable);
        localObject2 = new android/os/RemoteException;
        ((RemoteException)localObject2).<init>();
      }
      boolean bool = ((String)localObject2).equals(paramString);
      if (bool)
      {
        localObject2 = new com/google/android/gms/b/oj;
        localObject3 = new com/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
        ((com.google.android.gms.ads.mediation.customevent.CustomEventAdapter)localObject3).<init>();
        ((oj)localObject2).<init>((b)localObject3);
      }
      else
      {
        localObject2 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        bool = ((String)localObject2).equals(paramString);
        if (bool)
        {
          localObject4 = new com/google/ads/mediation/customevent/CustomEventAdapter;
          ((com.google.ads.mediation.customevent.CustomEventAdapter)localObject4).<init>();
          localObject2 = a;
          localObject3 = com.google.android.gms.ads.mediation.customevent.c.class;
          localObject2 = ((Map)localObject2).get(localObject3);
          localObject2 = (com.google.android.gms.ads.mediation.customevent.c)localObject2;
          localObject3 = new com/google/android/gms/b/oo;
          ((oo)localObject3).<init>((com.google.ads.mediation.c)localObject4, (i)localObject2);
          localObject2 = localObject3;
        }
      }
    }
  }
  
  public final od a(String paramString)
  {
    return c(paramString);
  }
  
  public final boolean b(String paramString)
  {
    boolean bool = false;
    i = 0;
    Class localClass = null;
    localObject3 = oa.class;
    try
    {
      localObject3 = ((Class)localObject3).getClassLoader();
      localClass = Class.forName(paramString, false, (ClassLoader)localObject3);
      localObject3 = a.class;
      bool = ((Class)localObject3).isAssignableFrom(localClass);
    }
    finally
    {
      for (;;)
      {
        i = String.valueOf(paramString).length() + 80;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(i);
        Object localObject2 = ((StringBuilder)localObject3).append("Could not load custom event implementation class: ").append(paramString);
        localObject3 = ", assuming old implementation.";
        localObject2 = (String)localObject3;
        ul.e((String)localObject2);
      }
    }
    return bool;
  }
}


/* Location:              com/google/android/gms/b/oa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */