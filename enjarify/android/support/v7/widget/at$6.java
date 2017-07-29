package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

final class at$6
  implements f.a
{
  at$6(at paramat) {}
  
  private void c(f.b paramb)
  {
    int i = a;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      at.g localg = a.m;
      int j = b;
      int k = d;
      localg.a(j, k);
      continue;
      localg = a.m;
      j = b;
      k = d;
      localg.b(j, k);
      continue;
      localg = a.m;
      j = b;
      k = d;
      localg.c(j, k);
      continue;
      localg = a.m;
      j = b;
      k = d;
      localg.d(j, k);
    }
  }
  
  public final at.u a(int paramInt)
  {
    at localat = a;
    int i = f.b();
    Object localObject1 = null;
    int j = 0;
    View localView1 = null;
    boolean bool1 = false;
    Object localObject2 = null;
    if (j < i)
    {
      localObject1 = at.c(f.c(j));
      if (localObject1 == null) {
        break label173;
      }
      boolean bool3 = ((at.u)localObject1).m();
      if (bool3) {
        break label173;
      }
      int m = c;
      if (m != paramInt) {
        break label173;
      }
      localObject2 = f;
      View localView2 = a;
      bool1 = ((ac)localObject2).d(localView2);
      if (!bool1) {
        break label126;
      }
    }
    for (;;)
    {
      int k = j + 1;
      j = k;
      localObject2 = localObject1;
      break;
      localObject1 = localObject2;
      label126:
      if (localObject1 == null) {
        localObject1 = null;
      }
      for (;;)
      {
        return (at.u)localObject1;
        localObject2 = a.f;
        localView1 = a;
        boolean bool2 = ((ac)localObject2).d(localView1);
        if (bool2) {
          localObject1 = null;
        }
      }
      label173:
      localObject1 = localObject2;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    a.a(paramInt1, paramInt2, bool);
    a.G = bool;
    at.r localr = a.F;
    int i = c + paramInt2;
    c = i;
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject)
  {
    int i = 2;
    boolean bool1 = true;
    Object localObject1 = a;
    int j = f.b();
    int k = paramInt1 + paramInt2;
    int m = 0;
    Object localObject2 = null;
    for (int n = 0; n < j; n = m)
    {
      localObject2 = f.c(n);
      at.u localu = at.c((View)localObject2);
      if (localu != null)
      {
        boolean bool2 = localu.b();
        if (!bool2)
        {
          int i1 = c;
          if (i1 >= paramInt1)
          {
            i1 = c;
            if (i1 < k)
            {
              localu.b(i);
              localu.a(paramObject);
              localObject2 = (at.h)((View)localObject2).getLayoutParams();
              e = bool1;
            }
          }
        }
      }
      m = n + 1;
    }
    localObject1 = d;
    j = paramInt1 + paramInt2;
    localObject2 = c;
    m = ((ArrayList)localObject2).size() + -1;
    for (n = m; n >= 0; n = m)
    {
      localObject2 = (at.u)c.get(n);
      if (localObject2 != null)
      {
        k = c;
        if ((k >= paramInt1) && (k < j))
        {
          ((at.u)localObject2).b(i);
          ((at.m)localObject1).c(n);
        }
      }
      m = n + -1;
    }
    a.H = bool1;
  }
  
  public final void a(f.b paramb)
  {
    c(paramb);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    a.a(paramInt1, paramInt2, false);
    a.G = true;
  }
  
  public final void b(f.b paramb)
  {
    c(paramb);
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    int i = 0;
    at.u localu = null;
    at localat = a;
    int j = f.b();
    int k = 0;
    int m;
    while (k < j)
    {
      Object localObject = at.c(f.c(k));
      if (localObject != null)
      {
        boolean bool2 = ((at.u)localObject).b();
        if (!bool2)
        {
          m = c;
          if (m >= paramInt1)
          {
            ((at.u)localObject).a(paramInt2, false);
            localObject = F;
            f = bool1;
          }
        }
      }
      k += 1;
    }
    at.m localm = d;
    int n = c.size();
    for (k = 0; k < n; k = i)
    {
      localu = (at.u)c.get(k);
      if (localu != null)
      {
        m = c;
        if (m >= paramInt1) {
          localu.a(paramInt2, bool1);
        }
      }
      i = k + 1;
    }
    localat.requestLayout();
    a.G = bool1;
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    int i = -1;
    int j = 1;
    float f = Float.MIN_VALUE;
    at localat = a;
    Object localObject1 = f;
    int k = ((ac)localObject1).b();
    int m;
    int n;
    int i1;
    int i2;
    label46:
    Object localObject2;
    int i3;
    if (paramInt1 < paramInt2)
    {
      m = i;
      n = paramInt2;
      i1 = paramInt1;
      i2 = 0;
      if (i2 >= k) {
        break label174;
      }
      localObject2 = at.c(f.c(i2));
      if (localObject2 != null)
      {
        i3 = c;
        if (i3 >= i1)
        {
          i3 = c;
          if (i3 <= n)
          {
            i3 = c;
            if (i3 != paramInt1) {
              break label163;
            }
            i3 = paramInt2 - paramInt1;
            ((at.u)localObject2).a(i3, false);
          }
        }
      }
    }
    for (;;)
    {
      localObject2 = F;
      f = j;
      i2 += 1;
      break label46;
      m = j;
      n = paramInt1;
      i1 = paramInt2;
      break;
      label163:
      ((at.u)localObject2).a(m, false);
    }
    label174:
    at.m localm = d;
    if (paramInt1 < paramInt2)
    {
      n = paramInt2;
      i1 = paramInt1;
      localObject1 = c;
      int i4 = ((ArrayList)localObject1).size();
      i2 = 0;
      label209:
      if (i2 >= i4) {
        break label325;
      }
      localObject1 = (at.u)c.get(i2);
      if (localObject1 != null)
      {
        i3 = c;
        if (i3 >= i1)
        {
          i3 = c;
          if (i3 <= n)
          {
            i3 = c;
            if (i3 != paramInt1) {
              break label315;
            }
            i3 = paramInt2 - paramInt1;
            ((at.u)localObject1).a(i3, false);
          }
        }
      }
    }
    for (;;)
    {
      m = i2 + 1;
      i2 = m;
      break label209;
      i = j;
      n = paramInt1;
      i1 = paramInt2;
      break;
      label315:
      ((at.u)localObject1).a(i, false);
    }
    label325:
    localat.requestLayout();
    a.G = j;
  }
}


/* Location:              android/support/v7/widget/at$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */