package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

final class t
{
  private static final t.a a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/design/widget/t$c;
      ((t.c)localObject).<init>();
    }
    for (a = (t.a)localObject;; a = (t.a)localObject)
    {
      return;
      localObject = new android/support/design/widget/t$b;
      ((t.b)localObject).<init>();
    }
  }
  
  static void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    paramRect.set(0, 0, i, j);
    a.a(paramViewGroup, paramView, paramRect);
  }
}


/* Location:              android/support/design/widget/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */