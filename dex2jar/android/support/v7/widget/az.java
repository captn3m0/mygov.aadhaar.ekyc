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
    int k = a;
    int n = b;
    paramb1 = a;
    int i;
    if (paramb2 == null)
    {
      i = paramb1.getLeft();
      if (paramb2 != null) {
        break label103;
      }
    }
    label103:
    for (int j = paramb1.getTop();; j = b)
    {
      if ((paramu.m()) || ((k == i) && (n == j))) {
        break label112;
      }
      paramb1.layout(i, j, paramb1.getWidth() + i, paramb1.getHeight() + j);
      return a(paramu, k, n, i, j);
      i = a;
      break;
    }
    label112:
    return a(paramu);
  }
  
  public abstract boolean a(at.u paramu1, at.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public final boolean a(at.u paramu1, at.u paramu2, at.e.b paramb1, at.e.b paramb2)
  {
    int k = a;
    int n = b;
    int i;
    if (paramu2.b()) {
      i = a;
    }
    for (int j = b;; j = b)
    {
      return a(paramu1, paramu2, k, n, i, j);
      i = a;
    }
  }
  
  public abstract boolean b(at.u paramu);
  
  public final boolean b(at.u paramu, at.e.b paramb1, at.e.b paramb2)
  {
    if ((paramb1 != null) && ((a != a) || (b != b))) {
      return a(paramu, a, b, a, b);
    }
    return b(paramu);
  }
  
  public final boolean c(at.u paramu, at.e.b paramb1, at.e.b paramb2)
  {
    if ((a != a) || (b != b)) {
      return a(paramu, a, b, a, b);
    }
    e(paramu);
    return false;
  }
  
  public final boolean f(at.u paramu)
  {
    return (!m) || (paramu.j());
  }
}


/* Location:              android/support/v7/widget/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */