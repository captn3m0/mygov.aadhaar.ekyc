package android.support.v7.view;

import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.aj;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  public final ArrayList a;
  ai b;
  boolean c;
  private long d = -1;
  private Interpolator e;
  private final aj f;
  
  public h()
  {
    Object localObject = new android/support/v7/view/h$1;
    ((h.1)localObject).<init>(this);
    f = ((aj)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    a = ((ArrayList)localObject);
  }
  
  public final h a(ae paramae)
  {
    boolean bool = c;
    if (!bool)
    {
      ArrayList localArrayList = a;
      localArrayList.add(paramae);
    }
    return this;
  }
  
  public final h a(ai paramai)
  {
    boolean bool = c;
    if (!bool) {
      b = paramai;
    }
    return this;
  }
  
  public final h a(Interpolator paramInterpolator)
  {
    boolean bool = c;
    if (!bool) {
      e = paramInterpolator;
    }
    return this;
  }
  
  public final void a()
  {
    boolean bool1 = c;
    if (bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = a;
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (ae)localIterator.next();
        long l1 = d;
        long l2 = 0L;
        boolean bool2 = l1 < l2;
        if (!bool2)
        {
          l1 = d;
          ((ae)localObject1).a(l1);
        }
        Object localObject2 = e;
        if (localObject2 != null)
        {
          localObject2 = e;
          ((ae)localObject1).a((Interpolator)localObject2);
        }
        localObject2 = b;
        if (localObject2 != null)
        {
          localObject2 = f;
          ((ae)localObject1).a((ai)localObject2);
        }
        ((ae)localObject1).b();
      }
      bool1 = true;
      c = bool1;
    }
  }
  
  public final void b()
  {
    boolean bool = c;
    if (!bool) {}
    for (;;)
    {
      return;
      Object localObject = a;
      Iterator localIterator = ((ArrayList)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (ae)localIterator.next();
        ((ae)localObject).a();
      }
      bool = false;
      localObject = null;
      c = false;
    }
  }
  
  public final h c()
  {
    boolean bool = c;
    if (!bool)
    {
      long l = 250L;
      d = l;
    }
    return this;
  }
}


/* Location:              android/support/v7/view/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */