package android.support.v7.view.menu;

import android.support.v7.widget.an;
import android.support.v7.widget.aq;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Iterator;
import java.util.List;

final class e$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  e$1(e parame) {}
  
  public final void onGlobalLayout()
  {
    Object localObject = a;
    boolean bool1 = ((e)localObject).f();
    boolean bool2;
    if (bool1)
    {
      localObject = a.b;
      int i = ((List)localObject).size();
      if (i > 0)
      {
        localObject = a.b;
        localIterator = null;
        localObject = get0a;
        bool2 = p;
        if (!bool2)
        {
          localObject = a.c;
          if (localObject != null)
          {
            bool2 = ((View)localObject).isShown();
            if (bool2) {
              break label97;
            }
          }
          localObject = a;
          ((e)localObject).e();
        }
      }
    }
    return;
    label97:
    localObject = a.b;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = nexta;
      ((aq)localObject).d();
    }
  }
}


/* Location:              android/support/v7/view/menu/e$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */