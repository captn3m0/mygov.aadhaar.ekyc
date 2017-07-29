package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

final class an$c
  implements AbsListView.OnScrollListener
{
  an$c(an paraman) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    int i = 1;
    if (paramInt == i)
    {
      Object localObject = a;
      boolean bool = ((an)localObject).j();
      if (!bool)
      {
        localObject = a.q.getContentView();
        if (localObject != null)
        {
          localObject = a.n;
          an.e locale = a.m;
          ((Handler)localObject).removeCallbacks(locale);
          localObject = a.m;
          ((an.e)localObject).run();
        }
      }
    }
  }
}


/* Location:              android/support/v7/widget/an$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */