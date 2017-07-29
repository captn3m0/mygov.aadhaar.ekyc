package android.support.v7.widget;

import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class af$2
  implements Runnable
{
  af$2(af paramaf, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Object localObject1 = a;
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    boolean bool = localIterator.hasNext();
    if (bool)
    {
      localObject1 = (af.a)localIterator.next();
      af localaf = b;
      localObject2 = a;
      if (localObject2 == null)
      {
        localObject2 = null;
        label51:
        localObject3 = b;
        if (localObject3 == null) {
          break label335;
        }
      }
      label335:
      for (Object localObject3 = a;; localObject3 = null)
      {
        if (localObject2 != null)
        {
          localObject2 = w.s((View)localObject2);
          long l1 = l;
          localObject2 = ((ae)localObject2).a(l1);
          localObject4 = g;
          localObject5 = a;
          ((ArrayList)localObject4).add(localObject5);
          int i = e;
          j = c;
          float f1 = i - j;
          ((ae)localObject2).b(f1);
          i = f;
          j = d;
          i -= j;
          f1 = i;
          ((ae)localObject2).c(f1);
          localObject4 = ((ae)localObject2).a(0.0F);
          localObject5 = new android/support/v7/widget/af$7;
          ((af.7)localObject5).<init>(localaf, (af.a)localObject1, (ae)localObject2);
          localObject2 = ((ae)localObject4).a((ai)localObject5);
          ((ae)localObject2).b();
        }
        if (localObject3 == null) {
          break;
        }
        localObject2 = w.s((View)localObject3);
        Object localObject4 = g;
        Object localObject5 = b;
        ((ArrayList)localObject4).add(localObject5);
        localObject4 = ((ae)localObject2).b(0.0F).c(0.0F);
        long l2 = l;
        localObject4 = ((ae)localObject4).a(l2);
        int j = 1065353216;
        float f2 = 1.0F;
        localObject4 = ((ae)localObject4).a(f2);
        localObject5 = new android/support/v7/widget/af$8;
        ((af.8)localObject5).<init>(localaf, (af.a)localObject1, (ae)localObject2, (View)localObject3);
        localObject1 = ((ae)localObject4).a((ai)localObject5);
        ((ae)localObject1).b();
        break;
        localObject2 = a;
        break label51;
      }
    }
    a.clear();
    localObject1 = b.c;
    Object localObject2 = a;
    ((ArrayList)localObject1).remove(localObject2);
  }
}


/* Location:              android/support/v7/widget/af$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */