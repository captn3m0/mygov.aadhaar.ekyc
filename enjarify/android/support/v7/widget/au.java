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
  final android.support.v4.h.b c;
  
  public au(at paramat)
  {
    au.1 local1 = new android/support/v7/widget/au$1;
    local1.<init>(this);
    c = local1;
    a = paramat;
  }
  
  public final void a(View paramView, android.support.v4.h.a.b paramb)
  {
    int i = 1;
    int j = -1;
    super.a(paramView, paramb);
    Object localObject1 = at.class.getName();
    paramb.a((CharSequence)localObject1);
    localObject1 = a;
    boolean bool1 = ((at)localObject1).n();
    if (!bool1)
    {
      localObject1 = a.getLayoutManager();
      if (localObject1 != null)
      {
        localObject1 = a.getLayoutManager();
        Object localObject2 = q.d;
        Object localObject3 = q.F;
        at localat = q;
        boolean bool2 = w.b(localat, j);
        if (!bool2)
        {
          localat = q;
          bool2 = w.a(localat, j);
          if (!bool2) {}
        }
        else
        {
          int k = 8192;
          paramb.a(k);
          paramb.h();
        }
        localat = q;
        boolean bool3 = w.b(localat, i);
        if (!bool3)
        {
          localat = q;
          bool3 = w.a(localat, i);
          if (!bool3) {}
        }
        else
        {
          m = 4096;
          paramb.a(m);
          paramb.h();
        }
        int m = ((at.g)localObject1).a((at.m)localObject2, (at.r)localObject3);
        int n = ((at.g)localObject1).b((at.m)localObject2, (at.r)localObject3);
        localObject1 = new android/support/v4/h/a/b$m;
        localObject2 = android.support.v4.h.a.b.a.a(m, n);
        ((b.m)localObject1).<init>(localObject2);
        localObject2 = android.support.v4.h.a.b.a;
        localObject3 = b;
        localObject1 = a;
        ((b.g)localObject2).b(localObject3, localObject1);
      }
    }
  }
  
  public final void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    Object localObject = at.class.getName();
    paramAccessibilityEvent.setClassName((CharSequence)localObject);
    boolean bool = paramView instanceof at;
    if (bool)
    {
      localObject = a;
      bool = ((at)localObject).n();
      if (!bool)
      {
        paramView = (at)paramView;
        localObject = paramView.getLayoutManager();
        if (localObject != null)
        {
          localObject = paramView.getLayoutManager();
          ((at.g)localObject).a(paramAccessibilityEvent);
        }
      }
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    int i = -1;
    int j = 1;
    boolean bool1 = false;
    at localat1 = null;
    int k = super.a(paramView, paramInt, paramBundle);
    if (k != 0) {
      bool1 = j;
    }
    at.g localg;
    int i1;
    at localat2;
    for (;;)
    {
      return bool1;
      localObject = a;
      k = ((at)localObject).n();
      if (k == 0)
      {
        localObject = a.getLayoutManager();
        if (localObject != null)
        {
          localg = a.getLayoutManager();
          localObject = q.d;
          localObject = q.F;
          localObject = q;
          if (localObject != null) {
            switch (paramInt)
            {
            default: 
              k = 0;
              localObject = null;
              i1 = 0;
              localat2 = null;
              if ((i1 != 0) || (k != 0))
              {
                localat1 = q;
                localat1.scrollBy(k, i1);
                bool1 = j;
              }
              break;
            }
          }
        }
      }
    }
    Object localObject = q;
    boolean bool2 = w.b((View)localObject, i);
    int m;
    if (bool2)
    {
      m = E;
      i1 = localg.n();
      m -= i1;
      i1 = localg.p();
      m = -(m - i1);
    }
    for (;;)
    {
      localat2 = q;
      boolean bool4 = w.a(localat2, i);
      int i4;
      if (bool4)
      {
        int i2 = D;
        i = localg.m();
        i2 -= i;
        i = localg.o();
        i4 = -(i2 - i);
        i2 = m;
        m = i4;
        break;
        localObject = q;
        boolean bool3 = w.b((View)localObject, j);
        if (!bool3) {
          break label438;
        }
        n = E;
        i2 = localg.n();
        n -= i2;
        i2 = localg.p();
        n -= i2;
      }
      for (;;)
      {
        localat2 = q;
        boolean bool5 = w.a(localat2, j);
        if (bool5)
        {
          i3 = D;
          i = localg.m();
          i3 -= i;
          i = localg.o();
          i4 = i3 - i;
          i3 = n;
          n = i4;
          break;
        }
        int i3 = n;
        n = 0;
        localObject = null;
        break;
        label438:
        n = 0;
        localObject = null;
      }
      int n = 0;
      localObject = null;
    }
  }
}


/* Location:              android/support/v7/widget/au.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */