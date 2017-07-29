package android.support.v7.app;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class AlertController$4
  implements AbsListView.OnScrollListener
{
  AlertController$4(AlertController paramAlertController, View paramView1, View paramView2) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    View localView1 = a;
    View localView2 = b;
    AlertController.a(paramAbsListView, localView1, localView2);
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              android/support/v7/app/AlertController$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */