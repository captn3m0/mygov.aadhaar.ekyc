package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.common.internal.c;

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
    Object localObject = "Adapter called onAdLoaded.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLoaded.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void a(int paramInt)
  {
    c.b("onAdFailedToLoad must be called on the main UI thread.");
    int i = 55;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>(i);
    Object localObject2 = "Adapter called onAdFailedToLoad with error. " + paramInt;
    ul.b((String)localObject2);
    try
    {
      localObject2 = b;
      ((oe)localObject2).a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        localObject1 = "Could not call onAdFailedToLoad.";
        ul.c((String)localObject1, localRemoteException);
      }
    }
  }
  
  public final void a(i parami)
  {
    c.b("onAdLoaded must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLoaded.";
    ul.b((String)localObject);
    a = parami;
    try
    {
      localObject = b;
      ((oe)localObject).e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLoaded.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void b()
  {
    c.b("onAdOpened must be called on the main UI thread.");
    Object localObject = "Adapter called onAdOpened.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdOpened.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void b(int paramInt)
  {
    c.b("onAdFailedToLoad must be called on the main UI thread.");
    int i = 55;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>(i);
    Object localObject2 = ((StringBuilder)localObject1).append("Adapter called onAdFailedToLoad with error ").append(paramInt);
    localObject1 = ".";
    localObject2 = (String)localObject1;
    ul.b((String)localObject2);
    try
    {
      localObject2 = b;
      ((oe)localObject2).a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        localObject1 = "Could not call onAdFailedToLoad.";
        ul.c((String)localObject1, localRemoteException);
      }
    }
  }
  
  public final void c()
  {
    c.b("onAdClosed must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClosed.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClosed.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void c(int paramInt)
  {
    c.b("onAdFailedToLoad must be called on the main UI thread.");
    int i = 55;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>(i);
    Object localObject2 = ((StringBuilder)localObject1).append("Adapter called onAdFailedToLoad with error ").append(paramInt);
    localObject1 = ".";
    localObject2 = (String)localObject1;
    ul.b((String)localObject2);
    try
    {
      localObject2 = b;
      ((oe)localObject2).a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        localObject1 = "Could not call onAdFailedToLoad.";
        ul.c((String)localObject1, localRemoteException);
      }
    }
  }
  
  public final void d()
  {
    c.b("onAdLeftApplication must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLeftApplication.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLeftApplication.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void e()
  {
    c.b("onAdClicked must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClicked.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClicked.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void f()
  {
    c.b("onAdLoaded must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLoaded.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLoaded.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void g()
  {
    c.b("onAdOpened must be called on the main UI thread.");
    Object localObject = "Adapter called onAdOpened.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdOpened.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void h()
  {
    c.b("onAdClosed must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClosed.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClosed.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void i()
  {
    c.b("onAdLeftApplication must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLeftApplication.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLeftApplication.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void j()
  {
    c.b("onAdClicked must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClicked.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClicked.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void k()
  {
    c.b("onAdOpened must be called on the main UI thread.");
    Object localObject = "Adapter called onAdOpened.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdOpened.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void l()
  {
    c.b("onAdClosed must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClosed.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClosed.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void m()
  {
    c.b("onAdLeftApplication must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLeftApplication.";
    ul.b((String)localObject);
    try
    {
      localObject = b;
      ((oe)localObject).c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLeftApplication.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void n()
  {
    c.b("onAdClicked must be called on the main UI thread.");
    Object localObject = a;
    if (localObject == null)
    {
      localObject = "Could not call onAdClicked since NativeAdMapper is null.";
      ul.e((String)localObject);
    }
    for (;;)
    {
      return;
      boolean bool = ((i)localObject).d();
      if (!bool)
      {
        localObject = "Could not call onAdClicked since setOverrideClickHandling is not set to true";
        ul.b((String)localObject);
      }
      else
      {
        localObject = "Adapter called onAdClicked.";
        ul.b((String)localObject);
        try
        {
          localObject = b;
          ((oe)localObject).a();
        }
        catch (RemoteException localRemoteException)
        {
          String str = "Could not call onAdClicked.";
          ul.c(str, localRemoteException);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ok.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */