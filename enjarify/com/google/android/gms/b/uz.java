package com.google.android.gms.b;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

final class uz
  extends va
  implements ViewTreeObserver.OnScrollChangedListener
{
  private final WeakReference a;
  
  public uz(View paramView, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramOnScrollChangedListener);
    a = localWeakReference;
  }
  
  protected final void a(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnScrollChangedListener(this);
  }
  
  protected final void b(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.removeOnScrollChangedListener(this);
  }
  
  public final void onScrollChanged()
  {
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener)a.get();
    if (localOnScrollChangedListener != null) {
      localOnScrollChangedListener.onScrollChanged();
    }
    for (;;)
    {
      return;
      b();
    }
  }
}


/* Location:              com/google/android/gms/b/uz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */