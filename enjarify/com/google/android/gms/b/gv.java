package com.google.android.gms.b;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class gv
  implements gx
{
  public final Object a;
  public final WeakHashMap b;
  private final ArrayList c;
  private final Context d;
  private final un e;
  private final nj f;
  
  public gv(Context paramContext, un paramun, nj paramnj)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    b = ((WeakHashMap)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((ArrayList)localObject);
    localObject = paramContext.getApplicationContext();
    d = ((Context)localObject);
    e = paramun;
    f = paramnj;
  }
  
  private boolean d(tg paramtg)
  {
    synchronized (a)
    {
      Object localObject2 = b;
      localObject2 = ((WeakHashMap)localObject2).get(paramtg);
      localObject2 = (gw)localObject2;
      if (localObject2 != null)
      {
        bool = ((gw)localObject2).b();
        if (bool)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
      localObject2 = null;
    }
  }
  
  public final void a(gw paramgw)
  {
    synchronized (a)
    {
      boolean bool = paramgw.b();
      if (!bool)
      {
        Object localObject2 = c;
        ((ArrayList)localObject2).remove(paramgw);
        localObject2 = b;
        localObject2 = ((WeakHashMap)localObject2).entrySet();
        Iterator localIterator = ((Set)localObject2).iterator();
        do
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (Map.Entry)localObject2;
          localObject2 = ((Map.Entry)localObject2).getValue();
        } while (localObject2 != paramgw);
        localIterator.remove();
      }
    }
  }
  
  public final void a(il paramil, tg paramtg)
  {
    View localView = b.b();
    a(paramil, paramtg, localView);
  }
  
  public final void a(il paramil, tg paramtg, View paramView)
  {
    gw.d locald = new com/google/android/gms/b/gw$d;
    locald.<init>(paramView, paramtg);
    a(paramil, paramtg, locald, null);
  }
  
  public final void a(il paramil, tg paramtg, View paramView, nk paramnk)
  {
    gw.d locald = new com/google/android/gms/b/gw$d;
    locald.<init>(paramView, paramtg);
    a(paramil, paramtg, locald, paramnk);
  }
  
  public final void a(il paramil, tg paramtg, he paramhe, nk paramnk)
  {
    for (;;)
    {
      synchronized (a)
      {
        boolean bool = d(paramtg);
        Object localObject2;
        if (bool)
        {
          localObject2 = b;
          localObject2 = ((WeakHashMap)localObject2).get(paramtg);
          localObject2 = (gw)localObject2;
          if (paramnk != null)
          {
            localObject3 = new com/google/android/gms/b/gy;
            ((gy)localObject3).<init>((gw)localObject2, paramnk);
            ((gw)localObject2).b((ha)localObject3);
          }
        }
        else
        {
          localObject2 = new com/google/android/gms/b/gw;
          localObject3 = d;
          un localun = e;
          localObject4 = paramil;
          ((gw)localObject2).<init>((Context)localObject3, paramil, paramtg, localun, paramhe);
          ((gw)localObject2).a(this);
          localObject3 = b;
          ((WeakHashMap)localObject3).put(paramtg, localObject2);
          localObject3 = c;
          ((ArrayList)localObject3).add(localObject2);
        }
      }
      Object localObject3 = new com/google/android/gms/b/gz;
      Object localObject4 = f;
      ((gz)localObject3).<init>(localgw, (nj)localObject4);
      localgw.b((ha)localObject3);
    }
  }
  
  public final void a(tg paramtg)
  {
    synchronized (a)
    {
      Object localObject2 = b;
      localObject2 = ((WeakHashMap)localObject2).get(paramtg);
      localObject2 = (gw)localObject2;
      if (localObject2 != null) {
        ((gw)localObject2).a();
      }
      return;
    }
  }
  
  public final void b(tg paramtg)
  {
    synchronized (a)
    {
      Object localObject2 = b;
      localObject2 = ((WeakHashMap)localObject2).get(paramtg);
      localObject2 = (gw)localObject2;
      if (localObject2 != null) {
        ((gw)localObject2).e();
      }
      return;
    }
  }
  
  public final void c(tg paramtg)
  {
    synchronized (a)
    {
      Object localObject2 = b;
      localObject2 = ((WeakHashMap)localObject2).get(paramtg);
      localObject2 = (gw)localObject2;
      if (localObject2 != null) {
        ((gw)localObject2).f();
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/gv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */