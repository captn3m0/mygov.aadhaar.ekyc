package android.support.v4.h;

import android.os.Bundle;
import android.support.v4.h.a.c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

final class b$c
  extends b.a
{
  public final c a(Object paramObject, View paramView)
  {
    paramObject = (View.AccessibilityDelegate)paramObject;
    AccessibilityNodeProvider localAccessibilityNodeProvider = ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
    c localc;
    if (localAccessibilityNodeProvider != null)
    {
      localc = new android/support/v4/h/a/c;
      localc.<init>(localAccessibilityNodeProvider);
    }
    for (;;)
    {
      return localc;
      localc = null;
    }
  }
  
  public final Object a(b paramb)
  {
    b.c.1 local1 = new android/support/v4/h/b$c$1;
    local1.<init>(this, paramb);
    d.1 local11 = new android/support/v4/h/d$1;
    local11.<init>(local1);
    return local11;
  }
  
  public final boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}


/* Location:              android/support/v4/h/b$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */