package android.support.v7.widget;

import android.view.View;

final class at$4
  implements bj.b
{
  at$4(at paramat) {}
  
  public final void a(at.u paramu)
  {
    at.g localg = a.m;
    View localView = a;
    at.m localm = a.d;
    localg.a(localView, localm);
  }
  
  public final void a(at.u paramu, at.e.b paramb1, at.e.b paramb2)
  {
    a.d.b(paramu);
    at localat = a;
    localat.a(paramu);
    paramu.a(false);
    at.e locale = B;
    boolean bool = locale.a(paramu, paramb1, paramb2);
    if (bool) {
      localat.k();
    }
  }
  
  public final void b(at.u paramu, at.e.b paramb1, at.e.b paramb2)
  {
    at localat = a;
    paramu.a(false);
    at.e locale = B;
    boolean bool = locale.b(paramu, paramb1, paramb2);
    if (bool) {
      localat.k();
    }
  }
  
  public final void c(at.u paramu, at.e.b paramb1, at.e.b paramb2)
  {
    paramu.a(false);
    Object localObject = a;
    boolean bool = w;
    if (bool)
    {
      localObject = a.B;
      bool = ((at.e)localObject).a(paramu, paramu, paramb1, paramb2);
      if (bool)
      {
        localObject = a;
        ((at)localObject).k();
      }
    }
    for (;;)
    {
      return;
      localObject = a.B;
      bool = ((at.e)localObject).c(paramu, paramb1, paramb2);
      if (bool)
      {
        localObject = a;
        ((at)localObject).k();
      }
    }
  }
}


/* Location:              android/support/v7/widget/at$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */