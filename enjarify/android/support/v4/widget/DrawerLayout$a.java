package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.h.a.b.a;
import android.support.v4.h.a.b.g;
import android.support.v4.h.f;
import android.support.v4.h.w;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

final class DrawerLayout$a
  extends android.support.v4.h.b
{
  private final Rect c;
  
  DrawerLayout$a(DrawerLayout paramDrawerLayout)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    c = localRect;
  }
  
  public final void a(View paramView, android.support.v4.h.a.b paramb)
  {
    boolean bool1 = DrawerLayout.b;
    if (bool1) {
      super.a(paramView, paramb);
    }
    for (;;)
    {
      Object localObject1 = DrawerLayout.class.getName();
      paramb.a((CharSequence)localObject1);
      paramb.b(false);
      paramb.c(false);
      localObject1 = b.a.a;
      paramb.a((b.a)localObject1);
      localObject1 = b.a.b;
      paramb.a((b.a)localObject1);
      return;
      Object localObject2 = android.support.v4.h.a.b.a(paramb);
      super.a(paramView, (android.support.v4.h.a.b)localObject2);
      localObject1 = android.support.v4.h.a.b.a;
      Object localObject3 = b;
      ((b.g)localObject1).c(localObject3, paramView);
      localObject1 = w.h(paramView);
      boolean bool2 = localObject1 instanceof View;
      if (bool2)
      {
        localObject1 = (View)localObject1;
        paramb.a((View)localObject1);
      }
      localObject1 = c;
      ((android.support.v4.h.a.b)localObject2).a((Rect)localObject1);
      localObject3 = android.support.v4.h.a.b.a;
      Object localObject4 = b;
      ((b.g)localObject3).c(localObject4, (Rect)localObject1);
      ((android.support.v4.h.a.b)localObject2).b((Rect)localObject1);
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).d(localObject4, (Rect)localObject1);
      localObject1 = android.support.v4.h.a.b.a;
      localObject3 = b;
      bool1 = ((b.g)localObject1).s(localObject3);
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).i(localObject4, bool1);
      localObject1 = ((android.support.v4.h.a.b)localObject2).i();
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).c(localObject4, (CharSequence)localObject1);
      localObject1 = ((android.support.v4.h.a.b)localObject2).j();
      paramb.a((CharSequence)localObject1);
      localObject1 = ((android.support.v4.h.a.b)localObject2).k();
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).b(localObject4, (CharSequence)localObject1);
      bool1 = ((android.support.v4.h.a.b)localObject2).g();
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).d(localObject4, bool1);
      bool1 = ((android.support.v4.h.a.b)localObject2).e();
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).c(localObject4, bool1);
      bool1 = ((android.support.v4.h.a.b)localObject2).b();
      paramb.b(bool1);
      bool1 = ((android.support.v4.h.a.b)localObject2).c();
      paramb.c(bool1);
      localObject1 = android.support.v4.h.a.b.a;
      localObject3 = b;
      bool1 = ((b.g)localObject1).t(localObject3);
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).j(localObject4, bool1);
      bool1 = ((android.support.v4.h.a.b)localObject2).d();
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).h(localObject4, bool1);
      bool1 = ((android.support.v4.h.a.b)localObject2).f();
      localObject3 = android.support.v4.h.a.b.a;
      localObject4 = b;
      ((b.g)localObject3).g(localObject4, bool1);
      int i = ((android.support.v4.h.a.b)localObject2).a();
      paramb.a(i);
      localObject1 = android.support.v4.h.a.b.a;
      localObject2 = b;
      ((b.g)localObject1).r(localObject2);
      paramView = (ViewGroup)paramView;
      int j = paramView.getChildCount();
      i = 0;
      localObject1 = null;
      while (i < j)
      {
        localObject3 = paramView.getChildAt(i);
        boolean bool3 = DrawerLayout.h((View)localObject3);
        if (bool3)
        {
          localObject4 = android.support.v4.h.a.b.a;
          Object localObject5 = b;
          ((b.g)localObject4).a(localObject5, (View)localObject3);
        }
        i += 1;
      }
    }
  }
  
  public final void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    String str = DrawerLayout.class.getName();
    paramAccessibilityEvent.setClassName(str);
  }
  
  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = DrawerLayout.b;
    if (!bool)
    {
      bool = DrawerLayout.h(paramView);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (bool = super.a(paramViewGroup, paramView, paramAccessibilityEvent);; bool = false) {
      return bool;
    }
  }
  
  public final boolean c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    int i = paramAccessibilityEvent.getEventType();
    int j = 32;
    Object localObject;
    DrawerLayout localDrawerLayout;
    if (i == j)
    {
      List localList = paramAccessibilityEvent.getText();
      localObject = a.c();
      if (localObject != null)
      {
        i = a.c((View)localObject);
        localDrawerLayout = a;
        int k = w.g(localDrawerLayout);
        i = f.a(i, k);
        k = 3;
        if (i != k) {
          break label100;
        }
        localObject = h;
        if (localObject != null) {
          localList.add(localObject);
        }
      }
    }
    label100:
    boolean bool;
    for (i = 1;; bool = super.c(paramView, paramAccessibilityEvent))
    {
      return i;
      int m = 5;
      if (i == m)
      {
        localObject = i;
        break;
      }
      bool = false;
      localObject = null;
      break;
    }
  }
}


/* Location:              android/support/v4/widget/DrawerLayout$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */