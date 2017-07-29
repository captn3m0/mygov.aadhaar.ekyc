package android.support.v4.b;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

final class u$7
  implements Runnable
{
  u$7(ArrayList paramArrayList, Map paramMap) {}
  
  public final void run()
  {
    int i = a.size();
    int j = 0;
    View localView = null;
    for (int k = 0; k < i; k = j)
    {
      localView = (View)a.get(k);
      String str = localView.getTransitionName();
      Map localMap = b;
      str = (String)localMap.get(str);
      localView.setTransitionName(str);
      j = k + 1;
    }
  }
}


/* Location:              android/support/v4/b/u$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */