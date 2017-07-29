package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.b.it;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.tp;

final class v$1
  extends WebViewClient
{
  v$1(v paramv) {}
  
  public final void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    Object localObject = v.a(a);
    if (localObject != null) {}
    try
    {
      localObject = a;
      localObject = v.a((v)localObject);
      str = null;
      ((it)localObject).a(0);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call AdListener.onAdFailedToLoad().";
        tp.c(str, localRemoteException);
      }
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    localObject1 = null;
    int i = 1;
    Object localObject2 = a.b();
    boolean bool1 = paramString.startsWith((String)localObject2);
    if (bool1)
    {
      bool1 = false;
      localObject2 = null;
    }
    for (;;)
    {
      return bool1;
      localObject2 = ke.cI;
      Object localObject6 = w.q();
      localObject2 = (String)((kd)localObject6).a((jz)localObject2);
      bool1 = paramString.startsWith((String)localObject2);
      int k;
      if (bool1)
      {
        localObject2 = v.a(a);
        if (localObject2 != null) {}
        try
        {
          localObject2 = a;
          localObject2 = v.a((v)localObject2);
          k = 3;
          ((it)localObject2).a(k);
        }
        catch (RemoteException localRemoteException1)
        {
          for (;;)
          {
            localObject6 = "Could not call AdListener.onAdFailedToLoad().";
            tp.c((String)localObject6, localRemoteException1);
          }
        }
        localObject2 = a;
        ((v)localObject2).a(0);
        bool1 = i;
        continue;
      }
      Object localObject3 = ke.cJ;
      localObject6 = w.q();
      localObject3 = (String)((kd)localObject6).a((jz)localObject3);
      bool1 = paramString.startsWith((String)localObject3);
      if (bool1)
      {
        localObject3 = v.a(a);
        if (localObject3 != null) {}
        try
        {
          localObject3 = a;
          localObject3 = v.a((v)localObject3);
          k = 0;
          localObject6 = null;
          ((it)localObject3).a(0);
        }
        catch (RemoteException localRemoteException2)
        {
          for (;;)
          {
            localObject6 = "Could not call AdListener.onAdFailedToLoad().";
            tp.c((String)localObject6, localRemoteException2);
          }
        }
        localObject3 = a;
        ((v)localObject3).a(0);
        bool1 = i;
        continue;
      }
      Object localObject4 = ke.cK;
      localObject1 = w.q();
      localObject4 = (String)((kd)localObject1).a((jz)localObject4);
      bool1 = paramString.startsWith((String)localObject4);
      if (bool1)
      {
        localObject4 = v.a(a);
        if (localObject4 != null) {}
        try
        {
          localObject4 = a;
          localObject4 = v.a((v)localObject4);
          ((it)localObject4).c();
        }
        catch (RemoteException localRemoteException3)
        {
          for (;;)
          {
            int j;
            localObject1 = "Could not call AdListener.onAdLoaded().";
            tp.c((String)localObject1, localRemoteException3);
          }
        }
        localObject4 = a;
        j = ((v)localObject4).b(paramString);
        localObject1 = a;
        ((v)localObject1).a(j);
        j = i;
        continue;
      }
      Object localObject5 = "gmsg://";
      boolean bool2 = paramString.startsWith((String)localObject5);
      if (bool2)
      {
        bool2 = i;
      }
      else
      {
        localObject5 = v.a(a);
        if (localObject5 == null) {}
      }
      try
      {
        localObject5 = a;
        localObject5 = v.a((v)localObject5);
        ((it)localObject5).b();
      }
      catch (RemoteException localRemoteException4)
      {
        for (;;)
        {
          localObject1 = "Could not call AdListener.onAdLeftApplication().";
          tp.c((String)localObject1, localRemoteException4);
        }
      }
      localObject5 = v.a(a, paramString);
      localObject1 = a;
      v.b((v)localObject1, (String)localObject5);
      bool2 = i;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/v$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */