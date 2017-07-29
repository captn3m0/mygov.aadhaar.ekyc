package com.google.android.gms.b;

import java.lang.ref.WeakReference;

public final class qq
  extends qy.a
{
  private final WeakReference a;
  
  public qq(ql.a parama)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(parama);
    a = localWeakReference;
  }
  
  public final void a(qr paramqr)
  {
    ql.a locala = (ql.a)a.get();
    if (locala != null) {
      locala.a(paramqr);
    }
  }
}


/* Location:              com/google/android/gms/b/qq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */