package com.google.android.gms.b;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@qi
abstract class va
{
  private final WeakReference<View> a;
  
  public va(View paramView)
  {
    a = new WeakReference(paramView);
  }
  
  private ViewTreeObserver c()
  {
    Object localObject = (View)a.get();
    if (localObject == null) {
      localObject = null;
    }
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return (ViewTreeObserver)localObject;
      localViewTreeObserver = ((View)localObject).getViewTreeObserver();
      if (localViewTreeObserver == null) {
        break;
      }
      localObject = localViewTreeObserver;
    } while (localViewTreeObserver.isAlive());
    return null;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */