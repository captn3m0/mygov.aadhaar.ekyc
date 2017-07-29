package com.google.android.gms.b;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

final class qb$4
  implements ViewTreeObserver.OnScrollChangedListener
{
  qb$4(qb paramqb, WeakReference paramWeakReference) {}
  
  public final void onScrollChanged()
  {
    qb localqb = b;
    WeakReference localWeakReference = a;
    qb.a(localqb, localWeakReference, true);
  }
}


/* Location:              com/google/android/gms/b/qb$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */