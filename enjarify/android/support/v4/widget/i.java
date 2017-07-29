package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

public final class i
  extends a
{
  private final ListView f;
  
  public i(ListView paramListView)
  {
    super(paramListView);
    f = paramListView;
  }
  
  public final void a(int paramInt)
  {
    ListView localListView = f;
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {
      localListView.scrollListBy(paramInt);
    }
    for (;;)
    {
      return;
      i = localListView.getFirstVisiblePosition();
      j = -1;
      if (i != j)
      {
        j = 0;
        View localView = localListView.getChildAt(0);
        if (localView != null)
        {
          j = localView.getTop() - paramInt;
          localListView.setSelectionFromTop(i, j);
        }
      }
    }
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool = false;
    Object localObject = f;
    int i = ((ListView)localObject).getCount();
    if (i == 0) {}
    for (;;)
    {
      return bool;
      int j = ((ListView)localObject).getChildCount();
      int k = ((ListView)localObject).getFirstVisiblePosition();
      int m = k + j;
      int n;
      if (paramInt > 0) {
        if (m >= i)
        {
          i = j + -1;
          View localView = ((ListView)localObject).getChildAt(i);
          i = localView.getBottom();
          n = ((ListView)localObject).getHeight();
          if (i <= n) {
            continue;
          }
        }
      }
      do
      {
        do
        {
          bool = true;
          break;
          if (paramInt >= 0) {
            break;
          }
        } while (k > 0);
        localObject = ((ListView)localObject).getChildAt(0);
        n = ((View)localObject).getTop();
      } while (n < 0);
    }
  }
}


/* Location:              android/support/v4/widget/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */