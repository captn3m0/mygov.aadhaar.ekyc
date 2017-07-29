package android.support.v7.app;

import android.support.v4.h.aj;
import android.support.v4.h.w;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

final class t$1
  extends aj
{
  t$1(t paramt) {}
  
  public final void b(View paramView)
  {
    b.a locala = null;
    Object localObject = a;
    boolean bool = k;
    if (bool)
    {
      localObject = a.f;
      if (localObject != null)
      {
        w.b(a.f, 0.0F);
        localObject = a.c;
        w.b((View)localObject, 0.0F);
      }
    }
    a.c.setVisibility(8);
    a.c.setTransitioning(false);
    a.n = null;
    localObject = a;
    locala = j;
    if (locala != null)
    {
      locala = j;
      b localb = i;
      locala.a(localb);
      i = null;
      j = null;
    }
    localObject = a.b;
    if (localObject != null)
    {
      localObject = a.b;
      w.w((View)localObject);
    }
  }
}


/* Location:              android/support/v7/app/t$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */