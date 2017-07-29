package android.support.v4.h;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

final class b$a$1
  implements c.a
{
  b$a$1(b.a parama, b paramb) {}
  
  public final void a(View paramView, int paramInt)
  {
    b.a(paramView, paramInt);
  }
  
  public final void a(View paramView, Object paramObject)
  {
    b localb = a;
    android.support.v4.h.a.b localb1 = new android/support/v4/h/a/b;
    localb1.<init>(paramObject);
    localb.a(paramView, localb1);
  }
  
  public final boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.c(paramView, paramAccessibilityEvent);
  }
  
  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public final void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.a(paramView, paramAccessibilityEvent);
  }
  
  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.d(paramView, paramAccessibilityEvent);
  }
  
  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b(paramView, paramAccessibilityEvent);
  }
}


/* Location:              android/support/v4/h/b$a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */