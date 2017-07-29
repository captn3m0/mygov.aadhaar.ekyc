package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.w;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class fb
  extends gm
{
  private static volatile bi i = null;
  private static final Object j = new Object();
  private bd.a k = null;
  
  public fb(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt, bd.a parama1)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 27);
    k = parama1;
  }
  
  private static String a(bd.a parama)
  {
    if ((parama != null) && (b != null) && (!ew.b(b.a))) {
      return b.a;
    }
    return null;
  }
  
  private String b()
  {
    try
    {
      if (b.h != null) {
        b.h.get();
      }
      Object localObject = b.g;
      if ((localObject != null) && (w != null))
      {
        localObject = w;
        return (String)localObject;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
  }
  
  protected final void a()
  {
    int m;
    if ((i == null) || (ew.b(ia)) || (ia.equals("E")))
    {
      m = 1;
      if (m == 0) {}
    }
    for (;;)
    {
      Object localObject2;
      synchronized (j)
      {
        if (!ew.b(a(k)))
        {
          m = 4;
          if (m == 3) {
            b.f();
          }
          localObject2 = f;
          Context localContext = b.a();
          if (m != 2) {
            break label499;
          }
          bool = true;
          localObject2 = new bi((String)((Method)localObject2).invoke(null, new Object[] { localContext, Boolean.valueOf(bool) }));
          i = (bi)localObject2;
          if (ew.b(a)) {
            break label447;
          }
          if (ia.equals("E")) {
            break label447;
          }
        }
      }
      synchronized (e)
      {
        if (i != null)
        {
          e.w = ia;
          e.C = Long.valueOf(ib);
          e.B = ic;
          e.M = id;
          e.N = ie;
        }
        return;
        m = 0;
        break;
        localObject2 = k;
        if ((!ew.b(a((bd.a)localObject2))) || (localObject2 == null) || (a == null) || (a.a.intValue() != 3)) {
          break label484;
        }
        bool = true;
        label298:
        if (!Boolean.valueOf(bool).booleanValue()) {
          break label494;
        }
        if (!b.e()) {
          break label489;
        }
        localObject2 = ke.bQ;
        if (!((Boolean)w.q().a((jz)localObject2)).booleanValue()) {
          break label489;
        }
        localObject2 = ke.bR;
        if (!((Boolean)w.q().a((jz)localObject2)).booleanValue()) {
          break label489;
        }
        localObject2 = ke.bP;
        if (!((Boolean)w.q().a((jz)localObject2)).booleanValue()) {
          break label489;
        }
        m = 1;
        break label475;
        ia = k.b.a;
        continue;
        localObject3 = finally;
        throw ((Throwable)localObject3);
        String str = b();
        if (ew.b(str)) {
          continue;
        }
        ia = str;
      }
      label447:
      switch (m)
      {
      }
      continue;
      for (;;)
      {
        label475:
        if (m == 0) {
          break label494;
        }
        m = 3;
        break;
        label484:
        bool = false;
        break label298;
        label489:
        m = 0;
      }
      label494:
      m = 2;
      continue;
      label499:
      boolean bool = false;
    }
  }
}


/* Location:              com/google/android/gms/b/fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */