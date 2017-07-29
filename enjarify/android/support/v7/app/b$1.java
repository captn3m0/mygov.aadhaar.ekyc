package android.support.v7.app;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb) {}
  
  public final void onClick(View paramView)
  {
    int i = 8388611;
    Object localObject1 = a;
    boolean bool = d;
    Object localObject2;
    int k;
    int j;
    if (bool)
    {
      localObject2 = a;
      k = b.a(i);
      localObject1 = b.b(i);
      if (localObject1 != null)
      {
        bool = DrawerLayout.g((View)localObject1);
        if (!bool) {
          break label90;
        }
        j = 2;
        if (k == j) {
          break label90;
        }
        localObject1 = b;
        ((DrawerLayout)localObject1).a();
      }
    }
    for (;;)
    {
      return;
      j = 0;
      localObject1 = null;
      break;
      label90:
      j = 1;
      if (k != j)
      {
        localObject1 = b;
        localObject2 = ((DrawerLayout)localObject1).b(i);
        if (localObject2 == null)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("No drawer view found with gravity ");
          String str = DrawerLayout.c(i);
          localObject2 = str;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        ((DrawerLayout)localObject1).e((View)localObject2);
        continue;
        localObject1 = a.g;
        if (localObject1 != null)
        {
          localObject1 = a.g;
          ((View.OnClickListener)localObject1).onClick(paramView);
        }
      }
    }
  }
}


/* Location:              android/support/v7/app/b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */