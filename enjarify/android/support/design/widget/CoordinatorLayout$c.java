package android.support.design.widget;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

final class CoordinatorLayout$c
  implements ViewGroup.OnHierarchyChangeListener
{
  CoordinatorLayout$c(CoordinatorLayout paramCoordinatorLayout) {}
  
  public final void onChildViewAdded(View paramView1, View paramView2)
  {
    ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = a.i;
    if (localOnHierarchyChangeListener != null)
    {
      localOnHierarchyChangeListener = a.i;
      localOnHierarchyChangeListener.onChildViewAdded(paramView1, paramView2);
    }
  }
  
  public final void onChildViewRemoved(View paramView1, View paramView2)
  {
    Object localObject = a;
    int i = 2;
    ((CoordinatorLayout)localObject).a(i);
    localObject = a.i;
    if (localObject != null)
    {
      localObject = a.i;
      ((ViewGroup.OnHierarchyChangeListener)localObject).onChildViewRemoved(paramView1, paramView2);
    }
  }
}


/* Location:              android/support/design/widget/CoordinatorLayout$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */