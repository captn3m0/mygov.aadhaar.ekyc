package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.ic;
import com.google.android.gms.b.id;
import com.google.android.gms.b.ik;
import com.google.android.gms.b.il;
import com.google.android.gms.b.in;
import com.google.android.gms.b.io;
import com.google.android.gms.b.io.3;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.ix;
import com.google.android.gms.b.jj;
import com.google.android.gms.b.jl;
import com.google.android.gms.b.kr;
import com.google.android.gms.b.pm;
import com.google.android.gms.b.pq;
import com.google.android.gms.b.se;
import com.google.android.gms.b.ul;

public final class h
{
  public final jl a;
  
  public h(Context paramContext)
  {
    a = new jl(paramContext);
  }
  
  public final void a()
  {
    jl localjl = a;
    try
    {
      localjl.a("show");
      e.G();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to show interstitial.", localRemoteException);
    }
  }
  
  public final void a(a parama)
  {
    jl localjl = a;
    try
    {
      c = parama;
      if (e != null) {
        e.a(new id(parama));
      }
      if ((parama instanceof ib))
      {
        localjl = a;
        parama = (ib)parama;
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        try
        {
          d = parama;
          if (e != null) {
            e.a(new ic(parama));
          }
          return;
        }
        catch (RemoteException parama)
        {
          ul.c("Failed to set the AdClickListener.", parama);
        }
        localRemoteException = localRemoteException;
        ul.c("Failed to set the AdListener.", localRemoteException);
      }
    }
  }
  
  public final void a(c paramc)
  {
    jl localjl = a;
    jj localjj = a;
    try
    {
      if (e == null)
      {
        if (f == null) {
          localjl.a("loadAd");
        }
        if (!n) {
          break label333;
        }
      }
      label333:
      for (paramc = il.b();; paramc = new il())
      {
        io localio = ip.b();
        Context localContext = b;
        e = ((ix)io.a(localContext, false, new io.3(localio, localContext, paramc, f, a)));
        if (c != null) {
          e.a(new id(c));
        }
        if (d != null) {
          e.a(new ic(d));
        }
        if (h != null) {
          e.a(new in(h));
        }
        if (j != null) {
          e.a(new pm(j));
        }
        if (i != null) {
          e.a(new pq(i), g);
        }
        if (k != null) {
          e.a(new kr(k));
        }
        if (l != null) {
          e.a(l.a);
        }
        if (m != null) {
          e.a(new se(m));
        }
        if (!e.a(ik.a(b, localjj))) {
          break;
        }
        a.a = h;
        return;
      }
      return;
    }
    catch (RemoteException paramc)
    {
      ul.c("Failed to load ad.", paramc);
    }
  }
  
  public final void a(String paramString)
  {
    jl localjl = a;
    if (f != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }
    f = paramString;
  }
}


/* Location:              com/google/android/gms/ads/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */