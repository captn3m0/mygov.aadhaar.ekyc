package android.support.v7.widget;

import android.view.View;

public abstract class az
  extends at.e
{
  boolean m = true;
  
  public abstract boolean a(at.u paramu);
  
  public abstract boolean a(at.u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public final boolean a(at.u paramu, at.e.b paramb1, at.e.b paramb2)
  {
    int i = a;
    int j = b;
    Object localObject = a;
    int k;
    int n;
    if (paramb2 == null)
    {
      k = ((View)localObject).getLeft();
      if (paramb2 != null) {
        break label128;
      }
      n = ((View)localObject).getTop();
      label40:
      boolean bool1 = paramu.m();
      if ((bool1) || ((i == k) && (j == n))) {
        break label137;
      }
      int i1 = ((View)localObject).getWidth() + k;
      int i2 = ((View)localObject).getHeight() + n;
      ((View)localObject).layout(k, n, i1, i2);
      localObject = this;
    }
    label128:
    label137:
    for (boolean bool2 = a(paramu, i, j, k, n);; bool2 = a(paramu))
    {
      return bool2;
      k = a;
      break;
      n = b;
      break label40;
    }
  }
  
  public abstract boolean a(at.u paramu1, at.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public final boolean a(at.u paramu1, at.u paramu2, at.e.b paramb1, at.e.b paramb2)
  {
    int i = a;
    int j = b;
    boolean bool = paramu2.b();
    int k;
    if (bool) {
      k = a;
    }
    for (int n = b;; n = b)
    {
      return a(paramu1, paramu2, i, j, k, n);
      k = a;
    }
  }
  
  public abstract boolean b(at.u paramu);
  
  public final boolean b(at.u paramu, at.e.b paramb1, at.e.b paramb2)
  {
    int k;
    int n;
    int i1;
    int i2;
    if (paramb1 != null)
    {
      int i = a;
      int j = a;
      if (i == j)
      {
        i = b;
        j = b;
        if (i == j) {}
      }
      else
      {
        k = a;
        n = b;
        i1 = a;
        i2 = b;
      }
    }
    for (boolean bool = a(paramu, k, n, i1, i2);; bool = b(paramu)) {
      return bool;
    }
  }
  
  public final boolean c(at.u paramu, at.e.b paramb1, at.e.b paramb2)
  {
    int i = a;
    int j = a;
    int k;
    int n;
    int i1;
    int i2;
    if (i == j)
    {
      i = b;
      j = b;
      if (i == j) {}
    }
    else
    {
      k = a;
      n = b;
      i1 = a;
      i2 = b;
    }
    for (boolean bool = a(paramu, k, n, i1, i2);; bool = false)
    {
      return bool;
      e(paramu);
    }
  }
  
  public final boolean f(at.u paramu)
  {
    boolean bool = m;
    if (bool)
    {
      bool = paramu.j();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              android/support/v7/widget/az.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */