package android.support.design.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

final class t$b
  implements t.a
{
  public final void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    paramViewGroup.offsetDescendantRectToMyCoords(paramView, paramRect);
    int i = paramView.getScrollX();
    int j = paramView.getScrollY();
    paramRect.offset(i, j);
  }
}


/* Location:              android/support/design/widget/t$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */