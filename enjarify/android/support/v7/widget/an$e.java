package android.support.v7.widget;

import android.support.v4.h.w;
import android.view.View;
import android.widget.PopupWindow;

final class an$e
  implements Runnable
{
  an$e(an paraman) {}
  
  public final void run()
  {
    Object localObject1 = a.e;
    if (localObject1 != null)
    {
      localObject1 = a.e;
      boolean bool = w.H((View)localObject1);
      if (bool)
      {
        localObject1 = a.e;
        int i = ((ah)localObject1).getCount();
        Object localObject2 = a.e;
        int j = ((ah)localObject2).getChildCount();
        if (i > j)
        {
          localObject1 = a.e;
          i = ((ah)localObject1).getChildCount();
          localObject2 = a;
          j = i;
          if (i <= j)
          {
            localObject1 = a.q;
            j = 2;
            ((PopupWindow)localObject1).setInputMethodMode(j);
            localObject1 = a;
            ((an)localObject1).d();
          }
        }
      }
    }
  }
}


/* Location:              android/support/v7/widget/an$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */