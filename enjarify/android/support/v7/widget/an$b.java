package android.support.v7.widget;

import android.database.DataSetObserver;
import android.widget.PopupWindow;

final class an$b
  extends DataSetObserver
{
  an$b(an paraman) {}
  
  public final void onChanged()
  {
    Object localObject = a.q;
    boolean bool = ((PopupWindow)localObject).isShowing();
    if (bool)
    {
      localObject = a;
      ((an)localObject).d();
    }
  }
  
  public final void onInvalidated()
  {
    a.e();
  }
}


/* Location:              android/support/v7/widget/an$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */