package android.support.v4.h;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(11)
final class y
{
  private static void a(View paramView)
  {
    float f = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f);
    paramView.setTranslationY(f);
  }
  
  static void a(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    if (paramView.getVisibility() == 0)
    {
      a(paramView);
      paramView = paramView.getParent();
      if ((paramView instanceof View)) {
        a((View)paramView);
      }
    }
  }
  
  static void b(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    if (paramView.getVisibility() == 0)
    {
      a(paramView);
      paramView = paramView.getParent();
      if ((paramView instanceof View)) {
        a((View)paramView);
      }
    }
  }
}


/* Location:              android/support/v4/h/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */