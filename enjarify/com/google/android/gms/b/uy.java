package com.google.android.gms.b;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.w;
import java.lang.ref.WeakReference;

final class uy
  extends va
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private final WeakReference a;
  
  public uy(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    super(paramView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramOnGlobalLayoutListener);
    a = localWeakReference;
  }
  
  protected final void a(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnGlobalLayoutListener(this);
  }
  
  protected final void b(ViewTreeObserver paramViewTreeObserver)
  {
    w.g().a(paramViewTreeObserver, this);
  }
  
  public final void onGlobalLayout()
  {
    ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener)a.get();
    if (localOnGlobalLayoutListener != null) {
      localOnGlobalLayoutListener.onGlobalLayout();
    }
    for (;;)
    {
      return;
      b();
    }
  }
}


/* Location:              com/google/android/gms/b/uy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */