package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

final class StaggeredGridLayoutManager$e
{
  ArrayList a;
  int b;
  int c;
  int d;
  final int e;
  
  StaggeredGridLayoutManager$e(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a = localArrayList;
    b = i;
    c = i;
    d = 0;
    e = paramInt;
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    int i = -1;
    int j = 1;
    int k = f.b.b();
    Object localObject = f.b;
    int m = ((as)localObject).c();
    int n;
    if (paramInt2 > paramInt1) {
      n = j;
    }
    for (;;)
    {
      int i1;
      as localas;
      int i2;
      int i3;
      label103:
      int i4;
      if (paramInt1 != paramInt2)
      {
        localObject = (View)a.get(paramInt1);
        i1 = f.b.a((View)localObject);
        localas = f.b;
        i2 = localas.b((View)localObject);
        if (i1 > m) {
          break label152;
        }
        i3 = j;
        if (i2 < k) {
          break label158;
        }
        i4 = j;
      }
      for (;;)
      {
        if ((i3 == 0) || (i4 == 0) || ((i1 >= k) && (i2 <= m))) {
          break label167;
        }
        i = StaggeredGridLayoutManager.a((View)localObject);
        return i;
        n = i;
        break;
        label152:
        i3 = 0;
        break label103;
        label158:
        i4 = 0;
        localas = null;
      }
      label167:
      paramInt1 += n;
    }
  }
  
  private void h()
  {
    Object localObject1 = a;
    int i = 0;
    localObject1 = (View)((ArrayList)localObject1).get(0);
    Object localObject2 = (StaggeredGridLayoutManager.b)((View)localObject1).getLayoutParams();
    as localas = f.b;
    int j = localas.a((View)localObject1);
    b = j;
    boolean bool = b;
    if (bool)
    {
      localObject1 = f.h;
      localObject2 = c;
      i = ((at.u)localObject2).c();
      localObject1 = ((StaggeredGridLayoutManager.c)localObject1).d(i);
      if (localObject1 != null)
      {
        i = b;
        int m = -1;
        if (i == m)
        {
          i = b;
          m = e;
          int k = ((StaggeredGridLayoutManager.c.a)localObject1).a(m);
          k = i - k;
          b = k;
        }
      }
    }
  }
  
  private void i()
  {
    Object localObject1 = a;
    int i = a.size() + -1;
    localObject1 = (View)((ArrayList)localObject1).get(i);
    Object localObject2 = (StaggeredGridLayoutManager.b)((View)localObject1).getLayoutParams();
    as localas = f.b;
    int j = localas.b((View)localObject1);
    c = j;
    boolean bool = b;
    if (bool)
    {
      localObject1 = f.h;
      localObject2 = c;
      i = ((at.u)localObject2).c();
      localObject1 = ((StaggeredGridLayoutManager.c)localObject1).d(i);
      if (localObject1 != null)
      {
        i = b;
        int m = 1;
        if (i == m)
        {
          i = c;
          m = e;
          int k = ((StaggeredGridLayoutManager.c.a)localObject1).a(m) + i;
          c = k;
        }
      }
    }
  }
  
  final int a()
  {
    int i = b;
    int j = -1 << -1;
    if (i != j) {}
    for (i = b;; i = b)
    {
      return i;
      h();
    }
  }
  
  final int a(int paramInt)
  {
    int i = b;
    int j = -1 << -1;
    if (i != j) {
      paramInt = b;
    }
    for (;;)
    {
      return paramInt;
      ArrayList localArrayList = a;
      i = localArrayList.size();
      if (i != 0)
      {
        h();
        paramInt = b;
      }
    }
  }
  
  public final View a(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = -1;
    int i1;
    if (paramInt2 == j)
    {
      int k = a.size();
      j = 0;
      localObject2 = null;
      i1 = 0;
      while (i1 < k)
      {
        localObject2 = (View)a.get(i1);
        StaggeredGridLayoutManager localStaggeredGridLayoutManager1 = f;
        boolean bool4 = d;
        if (bool4)
        {
          int i2 = StaggeredGridLayoutManager.a((View)localObject2);
          if (i2 <= paramInt1) {
            break;
          }
        }
        localStaggeredGridLayoutManager1 = f;
        boolean bool5 = d;
        if (!bool5)
        {
          int i3 = StaggeredGridLayoutManager.a((View)localObject2);
          if (i3 >= paramInt1) {
            break;
          }
        }
        boolean bool6 = ((View)localObject2).hasFocusable();
        if (!bool6) {
          break;
        }
        i = i1 + 1;
        i1 = i;
        localObject1 = localObject2;
      }
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      return (View)localObject2;
      localObject2 = a;
      j = ((ArrayList)localObject2).size() + -1;
      i1 = j;
      while (i1 >= 0)
      {
        localObject2 = (View)a.get(i1);
        StaggeredGridLayoutManager localStaggeredGridLayoutManager2 = f;
        boolean bool1 = d;
        if (bool1)
        {
          int m = StaggeredGridLayoutManager.a((View)localObject2);
          if (m >= paramInt1) {
            break;
          }
        }
        localStaggeredGridLayoutManager2 = f;
        boolean bool2 = d;
        if (!bool2)
        {
          int n = StaggeredGridLayoutManager.a((View)localObject2);
          if (n <= paramInt1) {
            break;
          }
        }
        boolean bool3 = ((View)localObject2).hasFocusable();
        if (!bool3) {
          break;
        }
        i = i1 + -1;
        i1 = i;
        localObject1 = localObject2;
      }
    }
  }
  
  final void a(View paramView)
  {
    int i = -1 << -1;
    Object localObject1 = (StaggeredGridLayoutManager.b)paramView.getLayoutParams();
    a = this;
    a.add(0, paramView);
    b = i;
    Object localObject2 = a;
    int j = ((ArrayList)localObject2).size();
    int m = 1;
    if (j == m) {
      c = i;
    }
    localObject2 = c;
    boolean bool1 = ((at.u)localObject2).m();
    if (!bool1)
    {
      localObject1 = c;
      boolean bool2 = ((at.u)localObject1).s();
      if (!bool2) {}
    }
    else
    {
      int n = d;
      localObject2 = f.b;
      int k = ((as)localObject2).e(paramView);
      n += k;
      d = n;
    }
  }
  
  final int b()
  {
    int i = c;
    int j = -1 << -1;
    if (i != j) {}
    for (i = c;; i = c)
    {
      return i;
      i();
    }
  }
  
  final int b(int paramInt)
  {
    int i = c;
    int j = -1 << -1;
    if (i != j) {
      paramInt = c;
    }
    for (;;)
    {
      return paramInt;
      ArrayList localArrayList = a;
      i = localArrayList.size();
      if (i != 0)
      {
        i();
        paramInt = c;
      }
    }
  }
  
  final void b(View paramView)
  {
    int i = -1 << -1;
    Object localObject1 = (StaggeredGridLayoutManager.b)paramView.getLayoutParams();
    a = this;
    a.add(paramView);
    c = i;
    Object localObject2 = a;
    int j = ((ArrayList)localObject2).size();
    int m = 1;
    if (j == m) {
      b = i;
    }
    localObject2 = c;
    boolean bool1 = ((at.u)localObject2).m();
    if (!bool1)
    {
      localObject1 = c;
      boolean bool2 = ((at.u)localObject1).s();
      if (!bool2) {}
    }
    else
    {
      int n = d;
      localObject2 = f.b;
      int k = ((as)localObject2).e(paramView);
      n += k;
      d = n;
    }
  }
  
  final void c()
  {
    int i = -1 << -1;
    a.clear();
    b = i;
    c = i;
    d = 0;
  }
  
  final void c(int paramInt)
  {
    b = paramInt;
    c = paramInt;
  }
  
  final void d()
  {
    int i = -1 << -1;
    int j = a.size();
    Object localObject1 = a;
    int k = j + -1;
    localObject1 = (View)((ArrayList)localObject1).remove(k);
    Object localObject2 = (StaggeredGridLayoutManager.b)((View)localObject1).getLayoutParams();
    a = null;
    Object localObject3 = c;
    boolean bool2 = ((at.u)localObject3).m();
    if (!bool2)
    {
      localObject2 = c;
      boolean bool1 = ((at.u)localObject2).s();
      if (!bool1) {}
    }
    else
    {
      int m = d;
      localObject3 = f.b;
      n = ((as)localObject3).e((View)localObject1);
      n = m - n;
      d = n;
    }
    int n = 1;
    if (j == n) {
      b = i;
    }
    c = i;
  }
  
  final void d(int paramInt)
  {
    int i = -1 << -1;
    int j = b;
    if (j != i)
    {
      j = b + paramInt;
      b = j;
    }
    j = c;
    if (j != i)
    {
      j = c + paramInt;
      c = j;
    }
  }
  
  final void e()
  {
    int i = -1 << -1;
    Object localObject1 = a;
    boolean bool1 = false;
    localObject1 = (View)((ArrayList)localObject1).remove(0);
    Object localObject2 = (StaggeredGridLayoutManager.b)((View)localObject1).getLayoutParams();
    a = null;
    Object localObject3 = a;
    int k = ((ArrayList)localObject3).size();
    if (k == 0) {
      c = i;
    }
    localObject3 = c;
    boolean bool2 = ((at.u)localObject3).m();
    if (!bool2)
    {
      localObject2 = c;
      bool1 = ((at.u)localObject2).s();
      if (!bool1) {}
    }
    else
    {
      int j = d;
      localObject3 = f.b;
      int m = ((as)localObject3).e((View)localObject1);
      m = j - m;
      d = m;
    }
    b = i;
  }
  
  public final int f()
  {
    Object localObject = f;
    boolean bool = d;
    int j;
    if (bool)
    {
      localObject = a;
      i = ((ArrayList)localObject).size() + -1;
      j = -1;
    }
    for (int i = b(i, j);; i = b(0, j))
    {
      return i;
      localObject = null;
      ArrayList localArrayList = a;
      j = localArrayList.size();
    }
  }
  
  public final int g()
  {
    Object localObject = f;
    boolean bool = d;
    int j;
    if (bool)
    {
      localObject = null;
      ArrayList localArrayList = a;
      j = localArrayList.size();
    }
    for (int i = b(0, j);; i = b(i, j))
    {
      return i;
      localObject = a;
      i = ((ArrayList)localObject).size() + -1;
      j = -1;
    }
  }
}


/* Location:              android/support/v7/widget/StaggeredGridLayoutManager$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */