package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@qi
public final class rw
  extends rz.a
{
  private final Context a;
  private final Object b = new Object();
  private final un c;
  private final rx d;
  
  public rw(Context paramContext, e parame, oc paramoc, un paramun)
  {
    this(paramContext, paramun, new rx(paramContext, parame, il.b(), paramoc, paramun));
  }
  
  private rw(Context paramContext, un paramun, rx paramrx)
  {
    a = paramContext;
    c = paramun;
    d = paramrx;
  }
  
  public final void a()
  {
    synchronized (b)
    {
      d.K();
      return;
    }
  }
  
  public final void a(a arg1)
  {
    synchronized (b)
    {
      d.m();
      return;
    }
  }
  
  public final void a(sb paramsb)
  {
    synchronized (b)
    {
      d.a(paramsb);
      return;
    }
  }
  
  public final void a(sg paramsg)
  {
    synchronized (b)
    {
      d.a(paramsg);
      return;
    }
  }
  
  public final void a(String paramString)
  {
    tp.e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
  }
  
  public final void b(a parama)
  {
    Object localObject = b;
    if (parama == null) {
      parama = null;
    }
    for (;;)
    {
      if (parama != null) {}
      try
      {
        Iterator localIterator = d.l.values().iterator();
        while (localIterator.hasNext())
        {
          sp localsp = (sp)localIterator.next();
          try
          {
            a.a(b.a(parama));
          }
          catch (RemoteException localRemoteException)
          {
            tp.b("Unable to call Adapter.onContextChanged.", localRemoteException);
          }
        }
      }
      catch (Exception parama)
      {
        tp.c("Unable to extract updated context.", parama);
        d.n();
        return;
        parama = (Context)b.a(parama);
      }
      finally {}
    }
  }
  
  public final boolean b()
  {
    synchronized (b)
    {
      boolean bool = d.L();
      return bool;
    }
  }
  
  public final void c()
  {
    a(null);
  }
  
  public final void c(a arg1)
  {
    synchronized (b)
    {
      d.h();
      return;
    }
  }
  
  public final void d()
  {
    b(null);
  }
  
  public final void e()
  {
    c(null);
  }
}


/* Location:              com/google/android/gms/b/rw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */