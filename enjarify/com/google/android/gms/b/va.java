package com.google.android.gms.b;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class va
{
  private final WeakReference a;
  
  public va(View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    a = localWeakReference;
  }
  
  private ViewTreeObserver c()
  {
    Object localObject = (View)a.get();
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ViewTreeObserver)localObject;
      localObject = ((View)localObject).getViewTreeObserver();
      if (localObject != null)
      {
        boolean bool = ((ViewTreeObserver)localObject).isAlive();
        if (bool) {}
      }
      else
      {
        localObject = null;
      }
    }
  }
  
  public final void a()
  {
    ViewTreeObserver localViewTreeObserver = c();
    if (localViewTreeObserver != null) {
      a(localViewTreeObserver);
    }
  }
  
  protected abstract void a(ViewTreeObserver paramViewTreeObserver);
  
  public final void b()
  {
    ViewTreeObserver localViewTreeObserver = c();
    if (localViewTreeObserver != null) {
      b(localViewTreeObserver);
    }
  }
  
  protected abstract void b(ViewTreeObserver paramViewTreeObserver);
}


/* Location:              com/google/android/gms/b/va.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */