package com.google.android.gms.b;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

@qi
public final class gv
  implements gx
{
  public final Object a = new Object();
  public final WeakHashMap<tg, gw> b = new WeakHashMap();
  private final ArrayList<gw> c = new ArrayList();
  private final Context d;
  private final un e;
  private final nj f;
  
  public gv(Context paramContext, un paramun, nj paramnj)
  {
    d = paramContext.getApplicationContext();
    e = paramun;
    f = paramnj;
  }
  
  private boolean d(tg paramtg)
  {
    for (;;)
    {
      synchronized (a)
      {
        paramtg = (gw)b.get(paramtg);
        if ((paramtg != null) && (paramtg.b()))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void a(gw paramgw)
  {
    synchronized (a)
    {
      if (!paramgw.b())
      {
        c.remove(paramgw);
        Iterator localIterator = b.entrySet().iterator();
        while (localIterator.hasNext()) {
          if (((Map.Entry)localIterator.next()).getValue() == paramgw) {
            localIterator.remove();
          }
        }
      }
    }
  }
  
  public final void a(il paramil, tg paramtg)
  {
    a(paramil, paramtg, b.b());
  }
  
  public final void a(il paramil, tg paramtg, View paramView)
  {
    a(paramil, paramtg, new gw.d(paramView, paramtg), null);
  }
  
  public final void a(il paramil, tg paramtg, View paramView, nk paramnk)
  {
    a(paramil, paramtg, new gw.d(paramView, paramtg), paramnk);
  }
  
  public final void a(il paramil, tg paramtg, he paramhe, nk paramnk)
  {
    for (;;)
    {
      synchronized (a)
      {
        if (d(paramtg))
        {
          paramil = (gw)b.get(paramtg);
          if (paramnk != null) {
            paramil.b(new gy(paramil, paramnk));
          }
        }
        else
        {
          paramil = new gw(d, paramil, paramtg, e, paramhe);
          paramil.a(this);
          b.put(paramtg, paramil);
          c.add(paramil);
        }
      }
      paramil.b(new gz(paramil, f));
    }
  }
  
  public final void a(tg paramtg)
  {
    synchronized (a)
    {
      paramtg = (gw)b.get(paramtg);
      if (paramtg != null) {
        paramtg.a();
      }
      return;
    }
  }
  
  public final void b(tg paramtg)
  {
    synchronized (a)
    {
      paramtg = (gw)b.get(paramtg);
      if (paramtg != null) {
        paramtg.e();
      }
      return;
    }
  }
  
  public final void c(tg paramtg)
  {
    synchronized (a)
    {
      paramtg = (gw)b.get(paramtg);
      if (paramtg != null) {
        paramtg.f();
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */