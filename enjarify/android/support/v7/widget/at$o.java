package android.support.v7.widget;

import java.util.ArrayList;

final class at$o
  extends at.c
{
  at$o(at paramat) {}
  
  public final void a()
  {
    int i = 512;
    int j = 1;
    int k = 0;
    Object localObject = null;
    a.a(null);
    at.r localr = a.F;
    f = j;
    at localat = a;
    int m = w;
    if (m == 0)
    {
      w = j;
      j = f.b();
      m = 0;
      localr = null;
      while (m < j)
      {
        at.u localu = at.c(f.c(m));
        if (localu != null)
        {
          boolean bool2 = localu.b();
          if (!bool2) {
            localu.b(i);
          }
        }
        m += 1;
      }
      at.m localm = d;
      int i1 = c.size();
      int n = 0;
      localr = null;
      while (n < i1)
      {
        localObject = (at.u)c.get(n);
        if (localObject != null) {
          ((at.u)localObject).b(i);
        }
        k = n + 1;
        n = k;
      }
      localat.l();
    }
    localObject = a.e;
    boolean bool1 = ((f)localObject).d();
    if (!bool1)
    {
      localObject = a;
      ((at)localObject).requestLayout();
    }
  }
}


/* Location:              android/support/v7/widget/at$o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */