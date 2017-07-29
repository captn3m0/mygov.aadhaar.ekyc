package android.support.design.widget;

import android.support.v4.h.w;
import android.support.v4.widget.p;
import android.view.View;

final class BottomSheetBehavior$b
  implements Runnable
{
  private final View b;
  private final int c;
  
  BottomSheetBehavior$b(BottomSheetBehavior paramBottomSheetBehavior, View paramView, int paramInt)
  {
    b = paramView;
    c = paramInt;
  }
  
  public final void run()
  {
    Object localObject = a.e;
    if (localObject != null)
    {
      localObject = a.e;
      boolean bool = ((p)localObject).b();
      if (bool)
      {
        localObject = b;
        w.a((View)localObject, this);
      }
    }
    for (;;)
    {
      return;
      localObject = a;
      int i = c;
      ((BottomSheetBehavior)localObject).a(i);
    }
  }
}


/* Location:              android/support/design/widget/BottomSheetBehavior$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */