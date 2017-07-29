package android.support.design.widget;

import android.support.v4.h.a.b.g;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class CheckableImageButton$1
  extends android.support.v4.h.b
{
  CheckableImageButton$1(CheckableImageButton paramCheckableImageButton) {}
  
  public final void a(View paramView, android.support.v4.h.a.b paramb)
  {
    super.a(paramView, paramb);
    paramb.a(true);
    boolean bool = a.isChecked();
    b.g localg = android.support.v4.h.a.b.a;
    Object localObject = b;
    localg.b(localObject, bool);
  }
  
  public final void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramView, paramAccessibilityEvent);
    boolean bool = a.isChecked();
    paramAccessibilityEvent.setChecked(bool);
  }
}


/* Location:              android/support/design/widget/CheckableImageButton$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */