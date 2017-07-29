package android.support.v4.h.a;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

class b$b
  extends b.k
{
  public final Object a(int paramInt)
  {
    AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction = new android/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;
    localAccessibilityAction.<init>(paramInt, null);
    return localAccessibilityAction;
  }
  
  public final Object a(int paramInt1, int paramInt2)
  {
    return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false, 0);
  }
  
  public final Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, false);
  }
  
  public final boolean a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (AccessibilityNodeInfo)paramObject1;
    paramObject2 = (AccessibilityNodeInfo.AccessibilityAction)paramObject2;
    return ((AccessibilityNodeInfo)paramObject1).removeAction((AccessibilityNodeInfo.AccessibilityAction)paramObject2);
  }
}


/* Location:              android/support/v4/h/a/b$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */