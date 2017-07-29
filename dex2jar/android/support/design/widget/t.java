package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

final class t
{
  private static final a a = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new c();
      return;
    }
  }
  
  static void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
    a.a(paramViewGroup, paramView, paramRect);
  }
  
  private static abstract interface a
  {
    public abstract void a(ViewGroup paramViewGroup, View paramView, Rect paramRect);
  }
  
  private static final class b
    implements t.a
  {
    public final void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
    {
      paramViewGroup.offsetDescendantRectToMyCoords(paramView, paramRect);
      paramRect.offset(paramView.getScrollX(), paramView.getScrollY());
    }
  }
  
  private static final class c
    implements t.a
  {
    public final void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
    {
      u.a(paramViewGroup, paramView, paramRect);
    }
  }
}


/* Location:              android/support/design/widget/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */