package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class rw
  extends rz.a
{
  private final Context a;
  private final Object b;
  private final un c;
  private final rx d;
  
  public rw(Context paramContext, e parame, oc paramoc, un paramun)
  {
    this(paramContext, paramun, localrx);
  }
  
  private rw(Context paramContext, un paramun, rx paramrx)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    a = paramContext;
    c = paramun;
    d = paramrx;
  }
  
  public final void a()
  {
    synchronized (b)
    {
      rx localrx = d;
      localrx.K();
      return;
    }
  }
  
  public final void a(a parama)
  {
    synchronized (b)
    {
      rx localrx = d;
      localrx.m();
      return;
    }
  }
  
  public final void a(sb paramsb)
  {
    synchronized (b)
    {
      rx localrx = d;
      localrx.a(paramsb);
      return;
    }
  }
  
  public final void a(sg paramsg)
  {
    synchronized (b)
    {
      rx localrx = d;
      localrx.a(paramsg);
      return;
    }
  }
  
  public final void a(String paramString)
  {
    tp.e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
  }
  
  public final void b(a parama)
  {
    Object localObject1 = b;
    boolean bool;
    Object localObject2;
    Object localObject5;
    if (parama == null)
    {
      bool = false;
      localObject2 = null;
      localObject5 = null;
    }
    for (;;)
    {
      if (localObject5 != null) {}
      try
      {
        localObject2 = d;
        localObject2 = l;
        localObject2 = ((Map)localObject2).values();
        Iterator localIterator = ((Collection)localObject2).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (sp)localObject2;
          try
          {
            localObject2 = a;
            localObject6 = b.a(localObject5);
            ((od)localObject2).a((a)localObject6);
          }
          catch (RemoteException localRemoteException)
          {
            Object localObject6 = "Unable to call Adapter.onContextChanged.";
            tp.b((String)localObject6, localRemoteException);
          }
        }
      }
      catch (Exception localException)
      {
        localObject5 = "Unable to extract updated context.";
        tp.c((String)localObject5, localException);
        Object localObject3 = d;
        ((rx)localObject3).n();
        return;
        localObject3 = b.a(parama);
        localObject3 = (Context)localObject3;
        localObject5 = localObject3;
      }
      finally {}
    }
  }
  
  public final boolean b()
  {
    synchronized (b)
    {
      rx localrx = d;
      boolean bool = localrx.L();
      return bool;
    }
  }
  
  public final void c()
  {
    a(null);
  }
  
  public final void c(a parama)
  {
    synchronized (b)
    {
      rx localrx = d;
      localrx.h();
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */