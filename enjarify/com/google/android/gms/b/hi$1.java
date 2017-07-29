package com.google.android.gms.b;

import android.view.View;
import java.util.List;

final class hi$1
  implements Runnable
{
  hi$1(hi paramhi, View paramView) {}
  
  public final void run()
  {
    localhi = b;
    View localView = a;
    for (;;)
    {
      try
      {
        localhf = new com/google/android/gms/b/hf;
        i = e;
        j = f;
        k = g;
        m = h;
        int n = i;
        int i1 = j;
        int i2 = k;
        localhf.<init>(i, j, k, m, n, i1, i2);
        localObject2 = localhi.a(localView, localhf);
        localhf.c();
        j = a;
        if (j == 0)
        {
          j = b;
          if (j == 0) {
            return;
          }
        }
      }
      catch (Exception localException)
      {
        hf localhf;
        int i;
        int j;
        int k;
        int m;
        boolean bool;
        tp.b("Exception in fetchContentOnUIThread", localException);
        Object localObject2 = d;
        ??? = "ContentFetchTask.fetchContent";
        ((qh)localObject2).a(localException, (String)???);
        continue;
      }
      j = b;
      if (j == 0)
      {
        j = b;
        if (j == 0) {
          continue;
        }
      }
      i = b;
      if (i == 0)
      {
        localObject2 = c;
        bool = ((hg)localObject2).a(localhf);
        if (bool) {
          continue;
        }
      }
      localObject2 = c;
      synchronized (a)
      {
        Object localObject4 = c;
        k = ((List)localObject4).size();
        m = 10;
        if (k >= m)
        {
          localObject4 = c;
          k = ((List)localObject4).size();
          m = 41;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(m);
          Object localObject5 = "Queue is full, current size = ";
          localObject5 = localStringBuilder.append((String)localObject5);
          localObject4 = ((StringBuilder)localObject5).append(k);
          localObject4 = ((StringBuilder)localObject4).toString();
          tp.b((String)localObject4);
          localObject4 = c;
          m = 0;
          localObject5 = null;
          ((List)localObject4).remove(0);
        }
        k = b;
        m = k + 1;
        b = m;
        c = k;
        localObject2 = c;
        ((List)localObject2).add(localhf);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/hi$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */