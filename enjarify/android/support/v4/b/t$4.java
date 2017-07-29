package android.support.v4.b;

import android.graphics.Rect;
import android.support.v4.g.a;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;

final class t$4
  implements Runnable
{
  t$4(a parama, Object paramObject1, t.a parama1, ArrayList paramArrayList1, View paramView, i parami1, i parami2, boolean paramBoolean, ArrayList paramArrayList2, Object paramObject2, Rect paramRect) {}
  
  public final void run()
  {
    Object localObject1 = a;
    Object localObject2 = b;
    Object localObject3 = c;
    localObject1 = t.a((a)localObject1, localObject2, (t.a)localObject3);
    if (localObject1 != null)
    {
      localObject2 = d;
      localObject3 = ((a)localObject1).values();
      ((ArrayList)localObject2).addAll((Collection)localObject3);
      localObject2 = d;
      localObject3 = e;
      ((ArrayList)localObject2).add(localObject3);
    }
    localObject2 = f;
    localObject3 = g;
    boolean bool = h;
    t.a((i)localObject2, (i)localObject3, bool, (a)localObject1);
    localObject2 = b;
    if (localObject2 != null)
    {
      localObject2 = b;
      localObject3 = i;
      ArrayList localArrayList = d;
      u.a(localObject2, (ArrayList)localObject3, localArrayList);
      localObject2 = c;
      localObject3 = j;
      bool = h;
      localObject1 = t.a((a)localObject1, (t.a)localObject2, localObject3, bool);
      if (localObject1 != null)
      {
        localObject2 = k;
        u.a((View)localObject1, (Rect)localObject2);
      }
    }
  }
}


/* Location:              android/support/v4/b/t$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */