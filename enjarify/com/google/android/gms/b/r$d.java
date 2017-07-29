package com.google.android.gms.b;

import java.lang.ref.WeakReference;

final class r$d
  extends eg
{
  private final WeakReference a;
  
  r$d(r paramr)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramr);
    a = localWeakReference;
  }
  
  public final void a(eq parameq)
  {
    r localr = (r)a.get();
    if (localr == null) {}
    for (;;)
    {
      return;
      v localv = a;
      r.d.1 local1 = new com/google/android/gms/b/r$d$1;
      local1.<init>(localr, localr, parameq);
      localv.a(local1);
    }
  }
}


/* Location:              com/google/android/gms/b/r$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */