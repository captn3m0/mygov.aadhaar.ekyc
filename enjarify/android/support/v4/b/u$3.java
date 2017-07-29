package android.support.v4.b;

import android.view.View;
import java.util.ArrayList;

final class u$3
  implements Runnable
{
  u$3(int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4) {}
  
  public final void run()
  {
    int i = 0;
    View localView = null;
    for (int j = 0;; j = i)
    {
      i = a;
      if (j >= i) {
        break;
      }
      localView = (View)b.get(j);
      String str = (String)c.get(j);
      localView.setTransitionName(str);
      localView = (View)d.get(j);
      str = (String)e.get(j);
      localView.setTransitionName(str);
      i = j + 1;
    }
  }
}


/* Location:              android/support/v4/b/u$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */