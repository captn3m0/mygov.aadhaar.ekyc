package com.google.android.gms.b;

import android.os.RemoteException;

public final class sr
  implements com.google.android.gms.ads.d.a.c
{
  private final sq a;
  
  public sr(sq paramsq)
  {
    a = paramsq;
  }
  
  public final void a(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onInitializationSucceeded must be called on the main UI thread.");
    Object localObject1 = "Adapter called onInitializationSucceeded.";
    ul.b((String)localObject1);
    try
    {
      localObject1 = a;
      localObject2 = com.google.android.gms.a.b.a(paramb);
      ((sq)localObject1).a((com.google.android.gms.a.a)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onInitializationSucceeded.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public final void a(com.google.android.gms.ads.d.a.b paramb, int paramInt)
  {
    com.google.android.gms.common.internal.c.b("onAdFailedToLoad must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdFailedToLoad.";
    ul.b((String)localObject1);
    try
    {
      localObject1 = a;
      localObject2 = com.google.android.gms.a.b.a(paramb);
      ((sq)localObject1).b((com.google.android.gms.a.a)localObject2, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdFailedToLoad.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public final void a(com.google.android.gms.ads.d.a.b paramb, com.google.android.gms.ads.d.a parama)
  {
    com.google.android.gms.common.internal.c.b("onRewarded must be called on the main UI thread.");
    Object localObject1 = "Adapter called onRewarded.";
    ul.b((String)localObject1);
    if (parama != null) {}
    for (;;)
    {
      try
      {
        localObject1 = a;
        localObject2 = com.google.android.gms.a.b.a(paramb);
        localss = new com/google/android/gms/b/ss;
        localss.<init>(parama);
        ((sq)localObject1).a((com.google.android.gms.a.a)localObject2, localss);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        ss localss;
        String str;
        int i;
        Object localObject2 = "Could not call onRewarded.";
        ul.c((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = a;
      localObject2 = com.google.android.gms.a.b.a(paramb);
      localss = new com/google/android/gms/b/ss;
      str = "";
      i = 1;
      localss.<init>(str, i);
      ((sq)localObject1).a((com.google.android.gms.a.a)localObject2, localss);
    }
  }
  
  public final void b(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onAdLoaded must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdLoaded.";
    ul.b((String)localObject1);
    try
    {
      localObject1 = a;
      localObject2 = com.google.android.gms.a.b.a(paramb);
      ((sq)localObject1).b((com.google.android.gms.a.a)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdLoaded.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public final void c(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onAdOpened must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdOpened.";
    ul.b((String)localObject1);
    try
    {
      localObject1 = a;
      localObject2 = com.google.android.gms.a.b.a(paramb);
      ((sq)localObject1).c((com.google.android.gms.a.a)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdOpened.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public final void d(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onVideoStarted must be called on the main UI thread.");
    Object localObject1 = "Adapter called onVideoStarted.";
    ul.b((String)localObject1);
    try
    {
      localObject1 = a;
      localObject2 = com.google.android.gms.a.b.a(paramb);
      ((sq)localObject1).d((com.google.android.gms.a.a)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onVideoStarted.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public final void e(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onAdClosed must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdClosed.";
    ul.b((String)localObject1);
    try
    {
      localObject1 = a;
      localObject2 = com.google.android.gms.a.b.a(paramb);
      ((sq)localObject1).e((com.google.android.gms.a.a)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdClosed.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public final void f(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onAdLeftApplication must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdLeftApplication.";
    ul.b((String)localObject1);
    try
    {
      localObject1 = a;
      localObject2 = com.google.android.gms.a.b.a(paramb);
      ((sq)localObject1).g((com.google.android.gms.a.a)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdLeftApplication.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/sr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */