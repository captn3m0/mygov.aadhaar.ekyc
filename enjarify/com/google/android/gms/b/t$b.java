package com.google.android.gms.b;

import java.lang.ref.WeakReference;

final class t$b
  extends z.a
{
  private WeakReference a;
  
  t$b(t paramt)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramt);
    a = localWeakReference;
  }
  
  public final void a()
  {
    t localt = (t)a.get();
    if (localt == null) {}
    for (;;)
    {
      return;
      t.a(localt);
    }
  }
}


/* Location:              com/google/android/gms/b/t$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */