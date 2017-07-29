package android.support.v7.app;

import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

final class m$5
  implements Runnable
{
  m$5(m paramm) {}
  
  public final void run()
  {
    float f = 1.0F;
    Object localObject1 = a.s;
    Object localObject2 = a.r;
    int i = 55;
    ((PopupWindow)localObject1).showAtLocation((View)localObject2, i, 0, 0);
    a.p();
    localObject1 = a;
    boolean bool = ((m)localObject1).o();
    if (bool)
    {
      w.c(a.r, 0.0F);
      localObject1 = a;
      localObject2 = w.s(a.r).a(f);
      u = ((ae)localObject2);
      localObject1 = a.u;
      localObject2 = new android/support/v7/app/m$5$1;
      ((m.5.1)localObject2).<init>(this);
      ((ae)localObject1).a((ai)localObject2);
    }
    for (;;)
    {
      return;
      w.c(a.r, f);
      localObject1 = a.r;
      ((ActionBarContextView)localObject1).setVisibility(0);
    }
  }
}


/* Location:              android/support/v7/app/m$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */