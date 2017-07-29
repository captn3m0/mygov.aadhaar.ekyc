package android.support.v7.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.ap;
import android.view.MenuItem;
import java.util.List;

final class e$2
  implements ap
{
  e$2(e parame) {}
  
  public final void a(h paramh, MenuItem paramMenuItem)
  {
    a.a.removeCallbacksAndMessages(paramh);
  }
  
  public final void b(h paramh, MenuItem paramMenuItem)
  {
    Object localObject1 = null;
    int i = -1;
    a.a.removeCallbacksAndMessages(null);
    int j = 0;
    List localList = null;
    Object localObject2 = a.b;
    int k = ((List)localObject2).size();
    if (j < k)
    {
      localObject2 = a.b.get(j)).b;
      if (paramh != localObject2) {}
    }
    for (int m = j;; m = i)
    {
      if (m == i)
      {
        return;
        j += 1;
        break;
      }
      m += 1;
      localList = a.b;
      j = localList.size();
      if (m < j) {
        localObject1 = a.b;
      }
      for (localObject2 = (e.a)((List)localObject1).get(m);; localObject2 = null)
      {
        localObject1 = new android/support/v7/view/menu/e$2$1;
        ((e.2.1)localObject1).<init>(this, (e.a)localObject2, paramMenuItem, paramh);
        long l1 = SystemClock.uptimeMillis();
        long l2 = 200L;
        l1 += l2;
        localObject2 = a.a;
        ((Handler)localObject2).postAtTime((Runnable)localObject1, paramh, l1);
        break;
        m = 0;
      }
    }
  }
}


/* Location:              android/support/v7/view/menu/e$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */