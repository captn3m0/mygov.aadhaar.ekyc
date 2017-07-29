package android.support.v7.widget;

import android.support.v4.h.ae;
import android.support.v4.h.w;
import java.util.ArrayList;
import java.util.Iterator;

final class af$3
  implements Runnable
{
  af$3(af paramaf, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Object localObject1 = a;
    Object localObject2 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (at.u)((Iterator)localObject2).next();
      af localaf = b;
      ae localae1 = w.s(a);
      d.add(localObject1);
      float f = 1.0F;
      ae localae2 = localae1.a(f);
      long l = i;
      localae2 = localae2.a(l);
      af.5 local5 = new android/support/v7/widget/af$5;
      local5.<init>(localaf, (at.u)localObject1, localae1);
      localObject1 = localae2.a(local5);
      ((ae)localObject1).b();
    }
    a.clear();
    localObject1 = b.a;
    localObject2 = a;
    ((ArrayList)localObject1).remove(localObject2);
  }
}


/* Location:              android/support/v7/widget/af$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */