package com.google.android.gms.b;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.w;

@qi
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
    if (!c)
    {
      if (f != null)
      {
        if (a != null)
        {
          w.e();
          tt.a(a, f);
        }
        w.C();
        ux.a(b, f);
      }
      if (g != null)
      {
        if (a != null)
        {
          w.e();
          tt.a(a, g);
        }
        w.C();
        ux.a(b, g);
      }
      c = true;
    }
  }
  
  private void f()
  {
    if (a == null) {}
    while (!c) {
      return;
    }
    if ((f != null) && (a != null)) {
      w.g().a(a, f);
    }
    if ((g != null) && (a != null))
    {
      w.e();
      tt.b(a, g);
    }
    c = false;
  }
  
  public final void a()
  {
    e = true;
    if (d) {
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
    if (e) {
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */