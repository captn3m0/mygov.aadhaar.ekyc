package android.support.v7.widget;

import android.view.View;
import java.util.List;

final class LinearLayoutManager$c
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h = 0;
  boolean i = false;
  int j;
  List k = null;
  boolean l;
  
  final View a(at.m paramm)
  {
    Object localObject = k;
    int n;
    int i1;
    if (localObject != null)
    {
      int m = k.size();
      n = 0;
      localObject = null;
      i1 = 0;
      if (i1 < m)
      {
        View localView = k.get(i1)).a;
        localObject = (at.h)localView.getLayoutParams();
        at.u localu = c;
        boolean bool = localu.m();
        if (!bool)
        {
          int i2 = d;
          localObject = c;
          n = ((at.u)localObject).c();
          if (i2 == n)
          {
            a(localView);
            localObject = localView;
          }
        }
      }
    }
    for (;;)
    {
      return (View)localObject;
      n = i1 + 1;
      i1 = n;
      break;
      n = 0;
      localObject = null;
      continue;
      n = d;
      localObject = paramm.b(n);
      int i3 = d;
      i1 = e;
      i3 += i1;
      d = i3;
    }
  }
  
  public final void a(View paramView)
  {
    int m = k.size();
    Object localObject1 = null;
    int n = -1 >>> 1;
    int i1 = 0;
    Object localObject2 = null;
    int i2 = 0;
    Object localObject3;
    if (i2 < m)
    {
      localObject3 = k.get(i2)).a;
      localObject2 = (at.h)((View)localObject3).getLayoutParams();
      if (localObject3 == paramView) {
        break label214;
      }
      at.u localu = c;
      boolean bool = localu.m();
      if (bool) {
        break label214;
      }
      localObject2 = c;
      i1 = ((at.u)localObject2).c();
      int i3 = d;
      i1 -= i3;
      i3 = e;
      i1 *= i3;
      if ((i1 < 0) || (i1 >= n)) {
        break label214;
      }
      if (i1 == 0) {
        break label170;
      }
    }
    for (Object localObject4 = localObject3;; localObject4 = localObject1)
    {
      int i4 = i2 + 1;
      i2 = i4;
      localObject1 = localObject4;
      n = i1;
      break;
      localObject3 = localObject1;
      label170:
      if (localObject3 == null) {
        i1 = -1;
      }
      for (d = i1;; d = i1)
      {
        return;
        localObject2 = getLayoutParamsc;
        i1 = ((at.u)localObject2).c();
      }
      label214:
      i1 = n;
    }
  }
  
  final boolean a(at.r paramr)
  {
    int m = d;
    if (m >= 0)
    {
      m = d;
      int i1 = paramr.a();
      if (m >= i1) {}
    }
    int n;
    for (m = 1;; n = 0) {
      return m;
    }
  }
}


/* Location:              android/support/v7/widget/LinearLayoutManager$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */