package android.support.v7.view.menu;

import android.support.v7.widget.an;
import android.support.v7.widget.aq;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class t$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  t$1(t paramt) {}
  
  public final void onGlobalLayout()
  {
    Object localObject = a;
    boolean bool = ((t)localObject).f();
    if (bool)
    {
      localObject = a.a;
      bool = p;
      if (!bool)
      {
        localObject = a.b;
        if (localObject != null)
        {
          bool = ((View)localObject).isShown();
          if (bool) {
            break label62;
          }
        }
        localObject = a;
        ((t)localObject).e();
      }
    }
    for (;;)
    {
      return;
      label62:
      localObject = a.a;
      ((aq)localObject).d();
    }
  }
}


/* Location:              android/support/v7/view/menu/t$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */