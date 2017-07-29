package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.ads.d.a;

@qi
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
    ul.b("Adapter called onInitializationSucceeded.");
    try
    {
      a.a(com.google.android.gms.a.b.a(paramb));
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Could not call onInitializationSucceeded.", paramb);
    }
  }
  
  public final void a(com.google.android.gms.ads.d.a.b paramb, int paramInt)
  {
    com.google.android.gms.common.internal.c.b("onAdFailedToLoad must be called on the main UI thread.");
    ul.b("Adapter called onAdFailedToLoad.");
    try
    {
      a.b(com.google.android.gms.a.b.a(paramb), paramInt);
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Could not call onAdFailedToLoad.", paramb);
    }
  }
  
  public final void a(com.google.android.gms.ads.d.a.b paramb, a parama)
  {
    com.google.android.gms.common.internal.c.b("onRewarded must be called on the main UI thread.");
    ul.b("Adapter called onRewarded.");
    if (parama != null) {}
    try
    {
      a.a(com.google.android.gms.a.b.a(paramb), new ss(parama));
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Could not call onRewarded.", paramb);
    }
    a.a(com.google.android.gms.a.b.a(paramb), new ss("", 1));
    return;
  }
  
  public final void b(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onAdLoaded must be called on the main UI thread.");
    ul.b("Adapter called onAdLoaded.");
    try
    {
      a.b(com.google.android.gms.a.b.a(paramb));
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Could not call onAdLoaded.", paramb);
    }
  }
  
  public final void c(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onAdOpened must be called on the main UI thread.");
    ul.b("Adapter called onAdOpened.");
    try
    {
      a.c(com.google.android.gms.a.b.a(paramb));
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Could not call onAdOpened.", paramb);
    }
  }
  
  public final void d(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onVideoStarted must be called on the main UI thread.");
    ul.b("Adapter called onVideoStarted.");
    try
    {
      a.d(com.google.android.gms.a.b.a(paramb));
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Could not call onVideoStarted.", paramb);
    }
  }
  
  public final void e(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onAdClosed must be called on the main UI thread.");
    ul.b("Adapter called onAdClosed.");
    try
    {
      a.e(com.google.android.gms.a.b.a(paramb));
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Could not call onAdClosed.", paramb);
    }
  }
  
  public final void f(com.google.android.gms.ads.d.a.b paramb)
  {
    com.google.android.gms.common.internal.c.b("onAdLeftApplication must be called on the main UI thread.");
    ul.b("Adapter called onAdLeftApplication.");
    try
    {
      a.g(com.google.android.gms.a.b.a(paramb));
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Could not call onAdLeftApplication.", paramb);
    }
  }
}


/* Location:              com/google/android/gms/b/sr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */