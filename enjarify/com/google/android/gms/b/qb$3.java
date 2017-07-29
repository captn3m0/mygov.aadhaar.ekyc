package com.google.android.gms.b;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

final class qb$3
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  qb$3(qb paramqb, WeakReference paramWeakReference) {}
  
  public final void onGlobalLayout()
  {
    qb localqb = b;
    WeakReference localWeakReference = a;
    qb.a(localqb, localWeakReference, false);
  }
}


/* Location:              com/google/android/gms/b/qb$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */