package android.support.v4.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class f$a
  implements View.OnApplyWindowInsetsListener
{
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramView = (g)paramView;
    int i = paramWindowInsets.getSystemWindowInsetTop();
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0)
    {
      paramView.a(paramWindowInsets, i);
      return paramWindowInsets.consumeSystemWindowInsets();
    }
  }
}


/* Location:              android/support/v4/widget/f$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */