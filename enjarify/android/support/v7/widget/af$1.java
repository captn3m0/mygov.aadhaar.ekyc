package android.support.v7.widget;

import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class af$1
  implements Runnable
{
  af$1(af paramaf, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Object localObject1 = a;
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (af.b)localIterator.next();
      localObject2 = b;
      at.u localu = a;
      int j = b;
      int k = c;
      int m = d;
      int i = e;
      Object localObject3 = a;
      j = m - j;
      k = i - k;
      if (j != 0)
      {
        localObject1 = w.s((View)localObject3);
        ((ae)localObject1).b(0.0F);
      }
      if (k != 0)
      {
        localObject1 = w.s((View)localObject3);
        ((ae)localObject1).c(0.0F);
      }
      ae localae = w.s((View)localObject3);
      e.add(localu);
      long l = k;
      localObject3 = localae.a(l);
      localObject1 = new android/support/v7/widget/af$6;
      ((af.6)localObject1).<init>((af)localObject2, localu, j, k, localae);
      localObject1 = ((ae)localObject3).a((ai)localObject1);
      ((ae)localObject1).b();
    }
    a.clear();
    localObject1 = b.b;
    Object localObject2 = a;
    ((ArrayList)localObject1).remove(localObject2);
  }
}


/* Location:              android/support/v7/widget/af$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */