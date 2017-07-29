package android.support.v4.h.a;

import android.view.accessibility.AccessibilityNodeInfo;

class b$h
  extends b.f
{
  public final void i(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityNodeInfo)paramObject).setVisibleToUser(paramBoolean);
  }
  
  public final void j(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityNodeInfo)paramObject).setAccessibilityFocused(paramBoolean);
  }
  
  public final boolean s(Object paramObject)
  {
    return ((AccessibilityNodeInfo)paramObject).isVisibleToUser();
  }
  
  public final boolean t(Object paramObject)
  {
    return ((AccessibilityNodeInfo)paramObject).isAccessibilityFocused();
  }
}


/* Location:              android/support/v4/h/a/b$h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */