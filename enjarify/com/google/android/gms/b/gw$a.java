package com.google.android.gms.b;

import android.view.View;
import java.lang.ref.WeakReference;

public final class gw$a
  implements he
{
  private WeakReference a;
  
  public gw$a(lc paramlc)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramlc);
    a = localWeakReference;
  }
  
  public final View a()
  {
    Object localObject = (lc)a.get();
    if (localObject != null) {}
    for (localObject = ((lc)localObject).e();; localObject = null) {
      return (View)localObject;
    }
  }
  
  public final boolean b()
  {
    Object localObject = a.get();
    boolean bool;
    if (localObject == null) {
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
    gw.b localb = new com/google/android/gms/b/gw$b;
    lc locallc = (lc)a.get();
    localb.<init>(locallc);
    return localb;
  }
}


/* Location:              com/google/android/gms/b/gw$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */