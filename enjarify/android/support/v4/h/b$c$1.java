package android.support.v4.h;

import android.os.Bundle;
import android.support.v4.h.a.c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

final class b$c$1
  implements d.a
{
  b$c$1(b.c paramc, b paramb) {}
  
  public final Object a(View paramView)
  {
    Object localObject = b.a(paramView);
    if (localObject != null) {}
    for (localObject = a;; localObject = null) {
      return localObject;
    }
  }
  
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
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return a.a(paramView, paramInt, paramBundle);
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


/* Location:              android/support/v4/h/b$c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */