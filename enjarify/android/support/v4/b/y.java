package android.support.v4.b;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

final class y
  extends FrameLayout
{
  private y(Context paramContext)
  {
    super(paramContext);
  }
  
  static ViewGroup a(View paramView)
  {
    int i = -1;
    y localy = new android/support/v4/b/y;
    Object localObject = paramView.getContext();
    localy.<init>((Context)localObject);
    localObject = paramView.getLayoutParams();
    if (localObject != null) {
      localy.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    localObject = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject).<init>(i, i);
    paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localy.addView(paramView);
    return localy;
  }
  
  protected final void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected final void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
}


/* Location:              android/support/v4/b/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */