package android.support.v4.b;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;

final class t$2
  implements Runnable
{
  t$2(Object paramObject1, View paramView, i parami, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Object paramObject2) {}
  
  public final void run()
  {
    Object localObject1 = a;
    Object localObject2;
    ArrayList localArrayList;
    if (localObject1 != null)
    {
      localObject1 = a;
      localObject2 = b;
      if (localObject1 != null)
      {
        localObject1 = (Transition)localObject1;
        ((Transition)localObject1).removeTarget((View)localObject2);
      }
      localObject1 = a;
      localObject2 = c;
      localArrayList = d;
      View localView = b;
      localObject1 = t.a(localObject1, (i)localObject2, localArrayList, localView);
      localObject2 = e;
      ((ArrayList)localObject2).addAll((Collection)localObject1);
    }
    localObject1 = f;
    if (localObject1 != null)
    {
      localObject1 = g;
      if (localObject1 != null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject2 = b;
        ((ArrayList)localObject1).add(localObject2);
        localObject2 = g;
        localArrayList = f;
        u.b(localObject2, localArrayList, (ArrayList)localObject1);
      }
      f.clear();
      localObject1 = f;
      localObject2 = b;
      ((ArrayList)localObject1).add(localObject2);
    }
  }
}


/* Location:              android/support/v4/b/t$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */