package android.support.v4.b;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class u$4
  implements Runnable
{
  u$4(ArrayList paramArrayList, Map paramMap) {}
  
  public final void run()
  {
    int i = a.size();
    int j = 0;
    View localView = null;
    int k = 0;
    if (k < i)
    {
      localView = (View)a.get(k);
      String str = localView.getTransitionName();
      boolean bool1;
      if (str != null)
      {
        localObject1 = b.entrySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        boolean bool2;
        do
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (Map.Entry)localIterator.next();
          Object localObject2 = ((Map.Entry)localObject1).getValue();
          bool2 = str.equals(localObject2);
        } while (!bool2);
      }
      for (Object localObject1 = (String)((Map.Entry)localObject1).getKey();; localObject1 = null)
      {
        localView.setTransitionName((String)localObject1);
        j = k + 1;
        k = j;
        break;
        bool1 = false;
      }
    }
  }
}


/* Location:              android/support/v4/b/u$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */