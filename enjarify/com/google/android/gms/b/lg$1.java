package com.google.android.gms.b;

import android.view.View;
import android.widget.FrameLayout;

final class lg$1
  implements Runnable
{
  lg$1(lg paramlg, ld paramld) {}
  
  public final void run()
  {
    Object localObject1 = a.d();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = b.b;
      if (localObject2 != null)
      {
        localObject2 = b.b;
        localObject1 = ((vc)localObject1).b();
        ((FrameLayout)localObject2).addView((View)localObject1);
      }
    }
    localObject1 = a;
    boolean bool = localObject1 instanceof la;
    if (!bool)
    {
      localObject1 = b;
      localObject2 = a;
      lg.a((lg)localObject1, (ld)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/lg$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */