package android.support.v7.widget;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.view.View;

final class d$c
  implements Runnable
{
  private d.e b;
  
  public d$c(d paramd, d.e parame)
  {
    b = parame;
  }
  
  public final void run()
  {
    Object localObject1 = d.d(a);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = d.e(a);
      localObject2 = b;
      if (localObject2 != null)
      {
        localObject2 = b;
        ((h.a)localObject2).a((h)localObject1);
      }
    }
    localObject1 = (View)d.f(a);
    if (localObject1 != null)
    {
      localObject1 = ((View)localObject1).getWindowToken();
      if (localObject1 != null)
      {
        localObject1 = b;
        boolean bool = ((d.e)localObject1).b();
        if (bool)
        {
          localObject1 = a;
          localObject2 = b;
          m = ((d.e)localObject2);
        }
      }
    }
    a.o = null;
  }
}


/* Location:              android/support/v7/widget/d$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */