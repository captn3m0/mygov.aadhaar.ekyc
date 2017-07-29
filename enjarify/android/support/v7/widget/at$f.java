package android.support.v7.widget;

import android.view.View;

final class at$f
  implements at.e.a
{
  at$f(at paramat) {}
  
  public final void a(at.u paramu)
  {
    at localat1 = null;
    boolean bool1 = true;
    paramu.a(bool1);
    Object localObject1 = h;
    if (localObject1 != null)
    {
      localObject1 = i;
      if (localObject1 == null) {
        h = null;
      }
    }
    i = null;
    boolean bool2 = at.u.e(paramu);
    Object localObject2;
    int i;
    if (!bool2)
    {
      localat1 = a;
      localObject2 = a;
      localat1.c();
      localObject1 = f;
      Object localObject3 = a;
      i = ((ac.b)localObject3).a((View)localObject2);
      int j = -1;
      if (i != j) {
        break label191;
      }
      ((ac)localObject1).b((View)localObject2);
      bool2 = bool1;
      if (bool2)
      {
        localObject2 = at.c((View)localObject2);
        d.b((at.u)localObject2);
        localObject3 = d;
        ((at.m)localObject3).a((at.u)localObject2);
      }
      if (bool2) {
        break label266;
      }
    }
    for (;;)
    {
      localat1.a(bool1);
      if (!bool2)
      {
        bool1 = paramu.n();
        if (bool1)
        {
          localat2 = a;
          localObject1 = a;
          localat2.removeDetachedView((View)localObject1, false);
        }
      }
      return;
      label191:
      ac.a locala = b;
      boolean bool3 = locala.c(i);
      if (bool3)
      {
        locala = b;
        locala.d(i);
        ((ac)localObject1).b((View)localObject2);
        localObject1 = a;
        ((ac.b)localObject1).a(i);
        bool2 = bool1;
        break;
      }
      bool2 = false;
      localObject1 = null;
      break;
      label266:
      bool1 = false;
      at localat2 = null;
    }
  }
}


/* Location:              android/support/v7/widget/at$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */