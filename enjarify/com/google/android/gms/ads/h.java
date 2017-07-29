package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.ic;
import com.google.android.gms.b.id;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.ik;
import com.google.android.gms.b.il;
import com.google.android.gms.b.in;
import com.google.android.gms.b.io;
import com.google.android.gms.b.io.3;
import com.google.android.gms.b.io.a;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.is;
import com.google.android.gms.b.it;
import com.google.android.gms.b.ix;
import com.google.android.gms.b.iz;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.jj;
import com.google.android.gms.b.jl;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.kr;
import com.google.android.gms.b.oa;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.pm;
import com.google.android.gms.b.pq;
import com.google.android.gms.b.sb;
import com.google.android.gms.b.se;
import com.google.android.gms.b.ul;
import java.util.Map;

public final class h
{
  public final jl a;
  
  public h(Context paramContext)
  {
    jl localjl = new com/google/android/gms/b/jl;
    localjl.<init>(paramContext);
    a = localjl;
  }
  
  public final void a()
  {
    Object localObject = a;
    String str = "show";
    try
    {
      ((jl)localObject).a(str);
      localObject = e;
      ((ix)localObject).G();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        str = "Failed to show interstitial.";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  public final void a(a parama)
  {
    localObject1 = a;
    try
    {
      c = parama;
      localObject2 = e;
      if (localObject2 != null)
      {
        localObject1 = e;
        localObject2 = new com/google/android/gms/b/id;
        ((id)localObject2).<init>(parama);
        ((ix)localObject1).a((it)localObject2);
      }
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          boolean bool;
          d = parama;
          localObject2 = e;
          if (localObject2 != null)
          {
            localObject1 = e;
            localObject2 = new com/google/android/gms/b/ic;
            ((ic)localObject2).<init>(parama);
            ((ix)localObject1).a((is)localObject2);
          }
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          Object localObject2 = "Failed to set the AdClickListener.";
          ul.c((String)localObject2, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        localObject2 = "Failed to set the AdListener.";
        ul.c((String)localObject2, localRemoteException1);
      }
    }
    bool = parama instanceof ib;
    if (bool)
    {
      localObject1 = a;
      parama = (ib)parama;
    }
  }
  
  public final void a(c paramc)
  {
    jl localjl = a;
    jj localjj = a;
    for (;;)
    {
      try
      {
        Object localObject1 = e;
        if (localObject1 == null)
        {
          localObject1 = "loadAd";
          localObject2 = f;
          if (localObject2 == null) {
            localjl.a((String)localObject1);
          }
          bool = n;
          if (!bool) {
            continue;
          }
          localil = il.b();
          localObject2 = ip.b();
          Object localObject3 = b;
          String str = f;
          oa localoa = a;
          localObject1 = new com/google/android/gms/b/io$3;
          ((io.3)localObject1).<init>((io)localObject2, (Context)localObject3, localil, str, localoa);
          localObject1 = io.a((Context)localObject3, false, (io.a)localObject1);
          localObject1 = (ix)localObject1;
          e = ((ix)localObject1);
          localObject1 = c;
          if (localObject1 != null)
          {
            localObject1 = e;
            localObject2 = new com/google/android/gms/b/id;
            localObject3 = c;
            ((id)localObject2).<init>((a)localObject3);
            ((ix)localObject1).a((it)localObject2);
          }
          localObject1 = d;
          if (localObject1 != null)
          {
            localObject1 = e;
            localObject2 = new com/google/android/gms/b/ic;
            localObject3 = d;
            ((ic)localObject2).<init>((ib)localObject3);
            ((ix)localObject1).a((is)localObject2);
          }
          localObject1 = h;
          if (localObject1 != null)
          {
            localObject1 = e;
            localObject2 = new com/google/android/gms/b/in;
            localObject3 = h;
            ((in)localObject2).<init>((com.google.android.gms.ads.a.a)localObject3);
            ((ix)localObject1).a((iz)localObject2);
          }
          localObject1 = j;
          if (localObject1 != null)
          {
            localObject1 = e;
            localObject2 = new com/google/android/gms/b/pm;
            localObject3 = j;
            ((pm)localObject2).<init>((com.google.android.gms.ads.purchase.a)localObject3);
            ((ix)localObject1).a((ph)localObject2);
          }
          localObject1 = i;
          if (localObject1 != null)
          {
            localObject1 = e;
            localObject2 = new com/google/android/gms/b/pq;
            localObject3 = i;
            ((pq)localObject2).<init>((com.google.android.gms.ads.purchase.b)localObject3);
            localObject3 = g;
            ((ix)localObject1).a((pl)localObject2, (String)localObject3);
          }
          localObject1 = k;
          if (localObject1 != null)
          {
            localObject1 = e;
            localObject2 = new com/google/android/gms/b/kr;
            localObject3 = k;
            ((kr)localObject2).<init>((com.google.android.gms.ads.a.b)localObject3);
            ((ix)localObject1).a((kq)localObject2);
          }
          localObject1 = l;
          if (localObject1 != null)
          {
            localObject1 = e;
            localObject2 = l;
            localObject2 = a;
            ((ix)localObject1).a((jb)localObject2);
          }
          localObject1 = m;
          if (localObject1 != null)
          {
            localObject1 = e;
            localObject2 = new com/google/android/gms/b/se;
            localObject3 = m;
            ((se)localObject2).<init>((com.google.android.gms.ads.d.b)localObject3);
            ((ix)localObject1).a((sb)localObject2);
          }
        }
        localObject1 = e;
        localObject2 = b;
        localObject2 = ik.a((Context)localObject2, localjj);
        boolean bool = ((ix)localObject1).a((ih)localObject2);
        if (bool)
        {
          localObject1 = a;
          localObject2 = h;
          a = ((Map)localObject2);
        }
        return;
      }
      catch (RemoteException localRemoteException)
      {
        il localil;
        Object localObject2 = "Failed to load ad.";
        ul.c((String)localObject2, localRemoteException);
        continue;
      }
      localil = new com/google/android/gms/b/il;
      localil.<init>();
    }
  }
  
  public final void a(String paramString)
  {
    Object localObject = a;
    String str = f;
    if (str != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("The ad unit ID can only be set once on InterstitialAd.");
      throw ((Throwable)localObject);
    }
    f = paramString;
  }
}


/* Location:              com/google/android/gms/ads/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */