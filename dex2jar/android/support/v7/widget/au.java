package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.h.a.b.g;
import android.support.v4.h.a.b.m;
import android.support.v4.h.w;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class au
  extends android.support.v4.h.b
{
  final at a;
  final android.support.v4.h.b c = new android.support.v4.h.b()
  {
    public final void a(View paramAnonymousView, android.support.v4.h.a.b paramAnonymousb)
    {
      super.a(paramAnonymousView, paramAnonymousb);
      if ((!a.n()) && (a.getLayoutManager() != null)) {
        a.getLayoutManager().a(paramAnonymousView, paramAnonymousb);
      }
    }
    
    public final boolean a(View paramAnonymousView, int paramAnonymousInt, Bundle paramAnonymousBundle)
    {
      boolean bool2 = false;
      boolean bool1;
      if (super.a(paramAnonymousView, paramAnonymousInt, paramAnonymousBundle)) {
        bool1 = true;
      }
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (a.n());
        bool1 = bool2;
      } while (a.getLayoutManager() == null);
      paramAnonymousView = a.getLayoutManager();
      paramAnonymousBundle = q.d;
      paramAnonymousView = q.F;
      return false;
    }
  };
  
  public au(at paramat)
  {
    a = paramat;
  }
  
  public final void a(View paramView, android.support.v4.h.a.b paramb)
  {
    super.a(paramView, paramb);
    paramb.a(at.class.getName());
    if ((!a.n()) && (a.getLayoutManager() != null))
    {
      paramView = a.getLayoutManager();
      at.m localm = q.d;
      at.r localr = q.F;
      if ((w.b(q, -1)) || (w.a(q, -1)))
      {
        paramb.a(8192);
        paramb.h();
      }
      if ((w.b(q, 1)) || (w.a(q, 1)))
      {
        paramb.a(4096);
        paramb.h();
      }
      int i = paramView.a(localm, localr);
      int j = paramView.b(localm, localr);
      paramView = new b.m(android.support.v4.h.a.b.a.a(i, j));
      android.support.v4.h.a.b.a.b(b, a);
    }
  }
  
  public final void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(at.class.getName());
    if (((paramView instanceof at)) && (!a.n()))
    {
      paramView = (at)paramView;
      if (paramView.getLayoutManager() != null) {
        paramView.getLayoutManager().a(paramAccessibilityEvent);
      }
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool2 = false;
    boolean bool1;
    if (super.a(paramView, paramInt, paramBundle)) {
      bool1 = true;
    }
    int i;
    do
    {
      do
      {
        do
        {
          do
          {
            return bool1;
            bool1 = bool2;
          } while (a.n());
          bool1 = bool2;
        } while (a.getLayoutManager() == null);
        paramView = a.getLayoutManager();
        paramBundle = q.d;
        paramBundle = q.F;
        bool1 = bool2;
      } while (q == null);
      switch (paramInt)
      {
      default: 
        paramInt = 0;
        i = 0;
        if (i != 0) {
          break label126;
        }
        bool1 = bool2;
      }
    } while (paramInt == 0);
    label126:
    q.scrollBy(paramInt, i);
    return true;
    if (w.b(q, -1)) {}
    for (paramInt = -(E - paramView.n() - paramView.p());; paramInt = 0)
    {
      i = paramInt;
      int j;
      if (w.a(q, -1))
      {
        j = -(D - paramView.m() - paramView.o());
        i = paramInt;
        paramInt = j;
        break;
        if (!w.b(q, 1)) {
          break label283;
        }
      }
      label283:
      for (paramInt = E - paramView.n() - paramView.p();; paramInt = 0)
      {
        i = paramInt;
        if (w.a(q, 1))
        {
          j = D;
          int k = paramView.m();
          int m = paramView.o();
          i = paramInt;
          paramInt = j - k - m;
          break;
        }
        paramInt = 0;
        break;
      }
    }
  }
}


/* Location:              android/support/v7/widget/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */