package android.support.v4.h.a;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

class b$k
  extends b.j
{
  public Object a(int paramInt1, int paramInt2)
  {
    return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false);
  }
  
  public Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
  }
  
  public final void b(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (AccessibilityNodeInfo)paramObject1;
    paramObject2 = (AccessibilityNodeInfo.CollectionInfo)paramObject2;
    ((AccessibilityNodeInfo)paramObject1).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject2);
  }
  
  public final void c(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (AccessibilityNodeInfo)paramObject1;
    paramObject2 = (AccessibilityNodeInfo.CollectionItemInfo)paramObject2;
    ((AccessibilityNodeInfo)paramObject1).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject2);
  }
}


/* Location:              android/support/v4/h/a/b$k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */