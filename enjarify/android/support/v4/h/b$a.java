package android.support.v4.h;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class b$a
  extends b.d
{
  public final Object a()
  {
    View.AccessibilityDelegate localAccessibilityDelegate = new android/view/View$AccessibilityDelegate;
    localAccessibilityDelegate.<init>();
    return localAccessibilityDelegate;
  }
  
  public Object a(b paramb)
  {
    b.a.1 local1 = new android/support/v4/h/b$a$1;
    local1.<init>(this, paramb);
    c.1 local11 = new android/support/v4/h/c$1;
    local11.<init>(local1);
    return local11;
  }
  
  public final void a(Object paramObject, View paramView, int paramInt)
  {
    ((View.AccessibilityDelegate)paramObject).sendAccessibilityEvent(paramView, paramInt);
  }
  
  public final void a(Object paramObject, View paramView, android.support.v4.h.a.b paramb)
  {
    Object localObject = b;
    paramObject = (View.AccessibilityDelegate)paramObject;
    localObject = (AccessibilityNodeInfo)localObject;
    ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityNodeInfo(paramView, (AccessibilityNodeInfo)localObject);
  }
  
  public final boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ((View.AccessibilityDelegate)paramObject).dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public final boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ((View.AccessibilityDelegate)paramObject).onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public final void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public final void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public final void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}


/* Location:              android/support/v4/h/b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */