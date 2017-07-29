package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.b.bv;
import com.google.android.gms.b.dv;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.ts;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@qi
final class j
  implements bv, Runnable
{
  CountDownLatch a = new CountDownLatch(1);
  private final List<Object[]> b = new Vector();
  private final AtomicReference<bv> c = new AtomicReference();
  private x d;
  
  public j(x paramx)
  {
    d = paramx;
    ip.a();
    if (uk.b())
    {
      ts.a(this);
      return;
    }
    run();
  }
  
  private boolean a()
  {
    try
    {
      a.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      tp.c("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }
  
  private static Context b(Context paramContext)
  {
    Object localObject = ke.m;
    if (!((Boolean)w.q().a((jz)localObject)).booleanValue()) {}
    do
    {
      return paramContext;
      localObject = paramContext.getApplicationContext();
    } while (localObject == null);
    return (Context)localObject;
  }
  
  private void b()
  {
    if (b.isEmpty()) {
      return;
    }
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      Object[] arrayOfObject = (Object[])localIterator.next();
      if (arrayOfObject.length == 1) {
        ((bv)c.get()).a((MotionEvent)arrayOfObject[0]);
      } else if (arrayOfObject.length == 3) {
        ((bv)c.get()).a(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
      }
    }
    b.clear();
  }
  
  public final String a(Context paramContext)
  {
    if (a())
    {
      bv localbv = (bv)c.get();
      if (localbv != null)
      {
        b();
        return localbv.a(b(paramContext));
      }
    }
    return "";
  }
  
  public final String a(Context paramContext, String paramString, View paramView)
  {
    if (a())
    {
      bv localbv = (bv)c.get();
      if (localbv != null)
      {
        b();
        return localbv.a(b(paramContext), paramString, paramView);
      }
    }
    return "";
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    bv localbv = (bv)c.get();
    if (localbv != null)
    {
      b();
      localbv.a(paramInt1, paramInt2, paramInt3);
      return;
    }
    b.add(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    bv localbv = (bv)c.get();
    if (localbv != null)
    {
      b();
      localbv.a(paramMotionEvent);
      return;
    }
    b.add(new Object[] { paramMotionEvent });
  }
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        if (d.e.d) {
          break label133;
        }
        localObject1 = ke.I;
        if (((Boolean)w.q().a((jz)localObject1)).booleanValue()) {
          break label128;
        }
      }
      finally
      {
        Object localObject1;
        a.countDown();
        d = null;
      }
      localObject1 = ke.aO;
      if ((!((Boolean)w.q().a((jz)localObject1)).booleanValue()) && (i != 0))
      {
        bool = true;
        localObject1 = dv.a(d.e.a, b(d.c), bool);
        c.set(localObject1);
        a.countDown();
        d = null;
        return;
      }
      boolean bool = false;
      continue;
      label128:
      int i = 0;
      continue;
      label133:
      i = 1;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */