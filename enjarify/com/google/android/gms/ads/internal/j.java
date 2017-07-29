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
import com.google.android.gms.b.tp;
import com.google.android.gms.b.ts;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class j
  implements bv, Runnable
{
  CountDownLatch a;
  private final List b;
  private final AtomicReference c;
  private x d;
  
  public j(x paramx)
  {
    Object localObject = new java/util/Vector;
    ((Vector)localObject).<init>();
    b = ((List)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    c = ((AtomicReference)localObject);
    localObject = new java/util/concurrent/CountDownLatch;
    int i = 1;
    ((CountDownLatch)localObject).<init>(i);
    a = ((CountDownLatch)localObject);
    d = paramx;
    ip.a();
    boolean bool = uk.b();
    if (bool) {
      ts.a(this);
    }
    for (;;)
    {
      return;
      run();
    }
  }
  
  private boolean a()
  {
    try
    {
      CountDownLatch localCountDownLatch = a;
      localCountDownLatch.await();
      bool = true;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        String str = "Interrupted during GADSignals creation.";
        tp.c(str, localInterruptedException);
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  private static Context b(Context paramContext)
  {
    Object localObject = ke.m;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (!bool) {}
    for (;;)
    {
      return paramContext;
      localObject = paramContext.getApplicationContext();
      if (localObject != null) {
        paramContext = (Context)localObject;
      }
    }
  }
  
  private void b()
  {
    int i = 1;
    Object localObject = b;
    boolean bool = ((List)localObject).isEmpty();
    if (bool) {}
    for (;;)
    {
      return;
      localObject = b;
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Object[])localIterator.next();
        int k = localObject.length;
        bv localbv;
        if (k == i)
        {
          localbv = (bv)c.get();
          localObject = (MotionEvent)localObject[0];
          localbv.a((MotionEvent)localObject);
        }
        else
        {
          k = localObject.length;
          int m = 3;
          if (k == m)
          {
            localbv = (bv)c.get();
            int n = ((Integer)localObject[0]).intValue();
            Integer localInteger = (Integer)localObject[i];
            m = localInteger.intValue();
            int i1 = 2;
            localObject = (Integer)localObject[i1];
            int j = ((Integer)localObject).intValue();
            localbv.a(n, m, j);
          }
        }
      }
      localObject = b;
      ((List)localObject).clear();
    }
  }
  
  public final String a(Context paramContext)
  {
    boolean bool = a();
    Context localContext;
    if (bool)
    {
      localObject = (bv)c.get();
      if (localObject != null)
      {
        b();
        localContext = b(paramContext);
      }
    }
    for (Object localObject = ((bv)localObject).a(localContext);; localObject = "") {
      return (String)localObject;
    }
  }
  
  public final String a(Context paramContext, String paramString, View paramView)
  {
    boolean bool = a();
    Context localContext;
    if (bool)
    {
      localObject = (bv)c.get();
      if (localObject != null)
      {
        b();
        localContext = b(paramContext);
      }
    }
    for (Object localObject = ((bv)localObject).a(localContext, paramString, paramView);; localObject = "") {
      return (String)localObject;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = (bv)c.get();
    if (localObject != null)
    {
      b();
      ((bv)localObject).a(paramInt1, paramInt2, paramInt3);
    }
    for (;;)
    {
      return;
      localObject = b;
      int i = 3;
      Object[] arrayOfObject = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt1);
      arrayOfObject[0] = localInteger;
      localInteger = Integer.valueOf(paramInt2);
      arrayOfObject[1] = localInteger;
      int j = 2;
      localInteger = Integer.valueOf(paramInt3);
      arrayOfObject[j] = localInteger;
      ((List)localObject).add(arrayOfObject);
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    Object localObject = (bv)c.get();
    if (localObject != null)
    {
      b();
      ((bv)localObject).a(paramMotionEvent);
    }
    for (;;)
    {
      return;
      localObject = b;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramMotionEvent;
      ((List)localObject).add(arrayOfObject);
    }
  }
  
  public final void run()
  {
    boolean bool1 = true;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        Object localObject2 = d;
        localObject2 = e;
        bool2 = d;
        if (!bool2)
        {
          localObject2 = ke.I;
          localkd1 = w.q();
          localObject2 = localkd1.a((jz)localObject2);
          localObject2 = (Boolean)localObject2;
          bool2 = ((Boolean)localObject2).booleanValue();
          if (bool2) {
            break label192;
          }
        }
        i = bool1;
        localObject2 = ke.aO;
        kd localkd2 = w.q();
        localObject2 = localkd2.a((jz)localObject2);
        localObject2 = (Boolean)localObject2;
        bool2 = ((Boolean)localObject2).booleanValue();
        if ((!bool2) && (i != 0))
        {
          bool2 = bool1;
          Object localObject5 = d;
          localObject5 = e;
          localObject5 = a;
          localObject1 = d;
          localObject1 = c;
          localObject1 = b((Context)localObject1);
          localObject2 = dv.a((String)localObject5, (Context)localObject1, bool2);
          localObject5 = c;
          ((AtomicReference)localObject5).set(localObject2);
          return;
        }
      }
      finally
      {
        a.countDown();
        d = null;
      }
      boolean bool2 = false;
      Object localObject4 = null;
      continue;
      label192:
      int i = 0;
      kd localkd1 = null;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */