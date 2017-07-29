package android.support.v7.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

final class y$b$3
  implements PopupWindow.OnDismissListener
{
  y$b$3(y.b paramb, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener) {}
  
  public final void onDismiss()
  {
    ViewTreeObserver localViewTreeObserver = b.d.getViewTreeObserver();
    if (localViewTreeObserver != null)
    {
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = a;
      localViewTreeObserver.removeGlobalOnLayoutListener(localOnGlobalLayoutListener);
    }
  }
}


/* Location:              android/support/v7/widget/y$b$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */