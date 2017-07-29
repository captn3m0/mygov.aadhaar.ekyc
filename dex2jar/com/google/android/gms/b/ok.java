package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.common.internal.c;

@qi
public final class ok
  implements d, f, h
{
  i a;
  private final oe b;
  
  public ok(oe paramoe)
  {
    b = paramoe;
  }
  
  public final void a()
  {
    c.b("onAdLoaded must be called on the main UI thread.");
    ul.b("Adapter called onAdLoaded.");
    try
    {
      b.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdLoaded.", localRemoteException);
    }
  }
  
  public final void a(int paramInt)
  {
    c.b("onAdFailedToLoad must be called on the main UI thread.");
    ul.b(55 + "Adapter called onAdFailedToLoad with error. " + paramInt);
    try
    {
      b.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
  
  public final void a(i parami)
  {
    c.b("onAdLoaded must be called on the main UI thread.");
    ul.b("Adapter called onAdLoaded.");
    a = parami;
    try
    {
      b.e();
      return;
    }
    catch (RemoteException parami)
    {
      ul.c("Could not call onAdLoaded.", parami);
    }
  }
  
  public final void b()
  {
    c.b("onAdOpened must be called on the main UI thread.");
    ul.b("Adapter called onAdOpened.");
    try
    {
      b.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdOpened.", localRemoteException);
    }
  }
  
  public final void b(int paramInt)
  {
    c.b("onAdFailedToLoad must be called on the main UI thread.");
    ul.b(55 + "Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      b.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
  
  public final void c()
  {
    c.b("onAdClosed must be called on the main UI thread.");
    ul.b("Adapter called onAdClosed.");
    try
    {
      b.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdClosed.", localRemoteException);
    }
  }
  
  public final void c(int paramInt)
  {
    c.b("onAdFailedToLoad must be called on the main UI thread.");
    ul.b(55 + "Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      b.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
  
  public final void d()
  {
    c.b("onAdLeftApplication must be called on the main UI thread.");
    ul.b("Adapter called onAdLeftApplication.");
    try
    {
      b.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }
  
  public final void e()
  {
    c.b("onAdClicked must be called on the main UI thread.");
    ul.b("Adapter called onAdClicked.");
    try
    {
      b.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdClicked.", localRemoteException);
    }
  }
  
  public final void f()
  {
    c.b("onAdLoaded must be called on the main UI thread.");
    ul.b("Adapter called onAdLoaded.");
    try
    {
      b.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdLoaded.", localRemoteException);
    }
  }
  
  public final void g()
  {
    c.b("onAdOpened must be called on the main UI thread.");
    ul.b("Adapter called onAdOpened.");
    try
    {
      b.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdOpened.", localRemoteException);
    }
  }
  
  public final void h()
  {
    c.b("onAdClosed must be called on the main UI thread.");
    ul.b("Adapter called onAdClosed.");
    try
    {
      b.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdClosed.", localRemoteException);
    }
  }
  
  public final void i()
  {
    c.b("onAdLeftApplication must be called on the main UI thread.");
    ul.b("Adapter called onAdLeftApplication.");
    try
    {
      b.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }
  
  public final void j()
  {
    c.b("onAdClicked must be called on the main UI thread.");
    ul.b("Adapter called onAdClicked.");
    try
    {
      b.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdClicked.", localRemoteException);
    }
  }
  
  public final void k()
  {
    c.b("onAdOpened must be called on the main UI thread.");
    ul.b("Adapter called onAdOpened.");
    try
    {
      b.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdOpened.", localRemoteException);
    }
  }
  
  public final void l()
  {
    c.b("onAdClosed must be called on the main UI thread.");
    ul.b("Adapter called onAdClosed.");
    try
    {
      b.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdClosed.", localRemoteException);
    }
  }
  
  public final void m()
  {
    c.b("onAdLeftApplication must be called on the main UI thread.");
    ul.b("Adapter called onAdLeftApplication.");
    try
    {
      b.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }
  
  public final void n()
  {
    c.b("onAdClicked must be called on the main UI thread.");
    i locali = a;
    if (locali == null)
    {
      ul.e("Could not call onAdClicked since NativeAdMapper is null.");
      return;
    }
    if (!locali.d())
    {
      ul.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
      return;
    }
    ul.b("Adapter called onAdClicked.");
    try
    {
      b.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not call onAdClicked.", localRemoteException);
    }
  }
}


/* Location:              com/google/android/gms/b/ok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */