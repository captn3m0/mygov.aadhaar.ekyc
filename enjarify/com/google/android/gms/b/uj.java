package com.google.android.gms.b;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.w;

public final class uj
{
  Activity a;
  private final View b;
  private boolean c;
  private boolean d;
  private boolean e;
  private ViewTreeObserver.OnGlobalLayoutListener f;
  private ViewTreeObserver.OnScrollChangedListener g;
  
  public uj(Activity paramActivity, View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    a = paramActivity;
    b = paramView;
    f = paramOnGlobalLayoutListener;
    g = paramOnScrollChangedListener;
  }
  
  private void e()
  {
    boolean bool = c;
    if (!bool)
    {
      Object localObject1 = f;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = a;
        if (localObject1 != null)
        {
          w.e();
          localObject1 = a;
          localObject2 = f;
          tt.a((Activity)localObject1, (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
        }
        w.C();
        localObject1 = b;
        localObject2 = f;
        ux.a((View)localObject1, (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
      }
      localObject1 = g;
      if (localObject1 != null)
      {
        localObject1 = a;
        if (localObject1 != null)
        {
          w.e();
          localObject1 = a;
          localObject2 = g;
          tt.a((Activity)localObject1, (ViewTreeObserver.OnScrollChangedListener)localObject2);
        }
        w.C();
        localObject1 = b;
        localObject2 = g;
        ux.a((View)localObject1, (ViewTreeObserver.OnScrollChangedListener)localObject2);
      }
      bool = true;
      c = bool;
    }
  }
  
  private void f()
  {
    Object localObject1 = a;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      boolean bool = c;
      if (bool)
      {
        localObject1 = f;
        Object localObject2;
        if (localObject1 != null)
        {
          localObject1 = a;
          if (localObject1 != null)
          {
            localObject1 = w.g();
            localObject2 = a;
            ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = f;
            ((tu)localObject1).a((Activity)localObject2, localOnGlobalLayoutListener);
          }
        }
        localObject1 = g;
        if (localObject1 != null)
        {
          localObject1 = a;
          if (localObject1 != null)
          {
            w.e();
            localObject1 = a;
            localObject2 = g;
            tt.b((Activity)localObject1, (ViewTreeObserver.OnScrollChangedListener)localObject2);
          }
        }
        bool = false;
        localObject1 = null;
        c = false;
      }
    }
  }
  
  public final void a()
  {
    e = true;
    boolean bool = d;
    if (bool) {
      e();
    }
  }
  
  public final void b()
  {
    e = false;
    f();
  }
  
  public final void c()
  {
    d = true;
    boolean bool = e;
    if (bool) {
      e();
    }
  }
  
  public final void d()
  {
    d = false;
    f();
  }
}


/* Location:              com/google/android/gms/b/uj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */