package android.support.v7.widget;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class s$1
  implements ViewTreeObserver.OnScrollChangedListener
{
  s$1(Field paramField, PopupWindow paramPopupWindow, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener) {}
  
  public final void onScrollChanged()
  {
    for (;;)
    {
      try
      {
        localObject = a;
        PopupWindow localPopupWindow = b;
        localObject = ((Field)localObject).get(localPopupWindow);
        localObject = (WeakReference)localObject;
        if (localObject != null)
        {
          localObject = ((WeakReference)localObject).get();
          if (localObject != null) {}
        }
        else
        {
          return;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Object localObject;
        continue;
      }
      localObject = c;
      ((ViewTreeObserver.OnScrollChangedListener)localObject).onScrollChanged();
    }
  }
}


/* Location:              android/support/v7/widget/s$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */