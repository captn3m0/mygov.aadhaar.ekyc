package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.h.a.a;
import android.support.v4.h.a.f;
import android.support.v4.h.a.f.c;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

final class NestedScrollView$a
  extends android.support.v4.h.b
{
  public final void a(View paramView, android.support.v4.h.a.b paramb)
  {
    super.a(paramView, paramb);
    paramView = (NestedScrollView)paramView;
    String str = ScrollView.class.getName();
    paramb.a(str);
    boolean bool = paramView.isEnabled();
    if (bool)
    {
      int i = paramView.getScrollRange();
      if (i > 0)
      {
        paramb.h();
        int j = paramView.getScrollY();
        if (j > 0)
        {
          j = 8192;
          paramb.a(j);
        }
        j = paramView.getScrollY();
        if (j < i)
        {
          i = 4096;
          paramb.a(i);
        }
      }
    }
  }
  
  public final void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    paramView = (NestedScrollView)paramView;
    String str = ScrollView.class.getName();
    paramAccessibilityEvent.setClassName(str);
    Object localObject1 = a.a(paramAccessibilityEvent);
    int i = paramView.getScrollRange();
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      ((f)localObject1).a(i);
      int j = paramView.getScrollX();
      f.c localc = f.a;
      Object localObject2 = b;
      localc.c(localObject2, j);
      j = paramView.getScrollY();
      localc = f.a;
      localObject2 = b;
      localc.d(localObject2, j);
      j = paramView.getScrollX();
      localc = f.a;
      localObject2 = b;
      localc.f(localObject2, j);
      j = paramView.getScrollRange();
      localc = f.a;
      localObject1 = b;
      localc.g(localObject1, j);
      return;
      j = 0;
      str = null;
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool1 = true;
    boolean bool2 = super.a(paramView, paramInt, paramBundle);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      paramView = (NestedScrollView)paramView;
      bool2 = paramView.isEnabled();
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        int i;
        int j;
        switch (paramInt)
        {
        default: 
          bool1 = false;
          break;
        case 4096: 
          i = paramView.getHeight();
          j = paramView.getPaddingBottom();
          i -= j;
          j = paramView.getPaddingTop();
          i -= j;
          j = paramView.getScrollY();
          i += j;
          j = paramView.getScrollRange();
          i = Math.min(i, j);
          j = paramView.getScrollY();
          if (i != j) {
            paramView.a(i);
          } else {
            bool1 = false;
          }
          break;
        case 8192: 
          i = paramView.getHeight();
          j = paramView.getPaddingBottom();
          i -= j;
          j = paramView.getPaddingTop();
          i -= j;
          i = Math.max(paramView.getScrollY() - i, 0);
          j = paramView.getScrollY();
          if (i != j) {
            paramView.a(i);
          } else {
            bool1 = false;
          }
          break;
        }
      }
    }
  }
}


/* Location:              android/support/v4/widget/NestedScrollView$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */