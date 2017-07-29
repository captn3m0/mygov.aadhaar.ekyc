package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.e.a;
import com.google.android.gms.ads.b.f.a;
import com.google.android.gms.b.id;
import com.google.android.gms.b.io.4;
import com.google.android.gms.b.it;
import com.google.android.gms.b.iu;
import com.google.android.gms.b.iv;
import com.google.android.gms.b.le;
import com.google.android.gms.b.lq;
import com.google.android.gms.b.lr;
import com.google.android.gms.b.lv;
import com.google.android.gms.b.lw;
import com.google.android.gms.b.oa;
import com.google.android.gms.b.ul;

public final class b$a
{
  private final Context a;
  private final iv b;
  
  private b$a(Context paramContext, iv paramiv)
  {
    a = paramContext;
    b = paramiv;
  }
  
  public b$a(Context paramContext, String paramString)
  {
    this(localContext, (iv)localObject);
  }
  
  public final a a(a parama)
  {
    try
    {
      iv localiv = b;
      localObject = new com/google/android/gms/b/id;
      ((id)localObject).<init>(parama);
      localiv.a((it)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to set AdListener.";
        ul.c((String)localObject, localRemoteException);
      }
    }
    return this;
  }
  
  public final a a(c paramc)
  {
    try
    {
      iv localiv = b;
      localObject = new com/google/android/gms/b/le;
      ((le)localObject).<init>(paramc);
      localiv.a((le)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to specify native ad options";
        ul.c((String)localObject, localRemoteException);
      }
    }
    return this;
  }
  
  public final a a(e.a parama)
  {
    try
    {
      iv localiv = b;
      localObject = new com/google/android/gms/b/lv;
      ((lv)localObject).<init>(parama);
      localiv.a((lq)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to add app install ad listener";
        ul.c((String)localObject, localRemoteException);
      }
    }
    return this;
  }
  
  public final a a(f.a parama)
  {
    try
    {
      iv localiv = b;
      localObject = new com/google/android/gms/b/lw;
      ((lw)localObject).<init>(parama);
      localiv.a((lr)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to add content ad listener";
        ul.c((String)localObject, localRemoteException);
      }
    }
    return this;
  }
  
  public final b a()
  {
    try
    {
      localb = new com/google/android/gms/ads/b;
      localObject2 = a;
      Object localObject3 = b;
      localObject3 = ((iv)localObject3).a();
      localb.<init>((Context)localObject2, (iu)localObject3);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        b localb;
        Object localObject2 = "Failed to build AdLoader.";
        ul.b((String)localObject2, localRemoteException);
        Object localObject1 = null;
      }
    }
    return localb;
  }
}


/* Location:              com/google/android/gms/ads/b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */