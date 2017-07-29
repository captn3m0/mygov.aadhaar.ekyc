package android.support.v7.view;

import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.aj;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  public final ArrayList<ae> a = new ArrayList();
  ai b;
  boolean c;
  private long d = -1L;
  private Interpolator e;
  private final aj f = new aj()
  {
    private boolean b = false;
    private int c = 0;
    
    public final void a(View paramAnonymousView)
    {
      if (b) {}
      do
      {
        return;
        b = true;
      } while (b == null);
      b.a(null);
    }
    
    public final void b(View paramAnonymousView)
    {
      int i = c + 1;
      c = i;
      if (i == a.size())
      {
        if (b != null) {
          b.b(null);
        }
        c = 0;
        b = false;
        c = false;
      }
    }
  };
  
  public final h a(ae paramae)
  {
    if (!c) {
      a.add(paramae);
    }
    return this;
  }
  
  public final h a(ai paramai)
  {
    if (!c) {
      b = paramai;
    }
    return this;
  }
  
  public final h a(Interpolator paramInterpolator)
  {
    if (!c) {
      e = paramInterpolator;
    }
    return this;
  }
  
  public final void a()
  {
    if (c) {
      return;
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      ae localae = (ae)localIterator.next();
      if (d >= 0L) {
        localae.a(d);
      }
      if (e != null) {
        localae.a(e);
      }
      if (b != null) {
        localae.a(f);
      }
      localae.b();
    }
    c = true;
  }
  
  public final void b()
  {
    if (!c) {
      return;
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).a();
    }
    c = false;
  }
  
  public final h c()
  {
    if (!c) {
      d = 250L;
    }
    return this;
  }
}


/* Location:              android/support/v7/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */