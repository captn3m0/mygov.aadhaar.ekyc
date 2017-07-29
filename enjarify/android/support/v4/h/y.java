package android.support.v4.h;

import android.view.View;

final class y
{
  private static void a(View paramView)
  {
    float f1 = paramView.getTranslationY();
    float f2 = 1.0F + f1;
    paramView.setTranslationY(f2);
    paramView.setTranslationY(f1);
  }
  
  static void a(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    int i = paramView.getVisibility();
    if (i == 0)
    {
      a(paramView);
      Object localObject = paramView.getParent();
      boolean bool = localObject instanceof View;
      if (bool)
      {
        localObject = (View)localObject;
        a((View)localObject);
      }
    }
  }
  
  static void b(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    int i = paramView.getVisibility();
    if (i == 0)
    {
      a(paramView);
      Object localObject = paramView.getParent();
      boolean bool = localObject instanceof View;
      if (bool)
      {
        localObject = (View)localObject;
        a((View)localObject);
      }
    }
  }
}


/* Location:              android/support/v4/h/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */