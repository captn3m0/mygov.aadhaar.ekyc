package com.google.android.gms.b;

import android.view.View;
import java.lang.ref.WeakReference;

public final class gw$d
  implements he
{
  private final WeakReference a;
  private final WeakReference b;
  
  public gw$d(View paramView, tg paramtg)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    a = localWeakReference;
    localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramtg);
    b = localWeakReference;
  }
  
  public final View a()
  {
    return (View)a.get();
  }
  
  public final boolean b()
  {
    Object localObject = a.get();
    boolean bool;
    if (localObject != null)
    {
      localObject = b.get();
      if (localObject != null) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final he c()
  {
    gw.c localc = new com/google/android/gms/b/gw$c;
    View localView = (View)a.get();
    tg localtg = (tg)b.get();
    localc.<init>(localView, localtg);
    return localc;
  }
}


/* Location:              com/google/android/gms/b/gw$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */