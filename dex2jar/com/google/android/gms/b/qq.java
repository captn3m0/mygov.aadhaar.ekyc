package com.google.android.gms.b;

import java.lang.ref.WeakReference;

@qi
public final class qq
  extends qy.a
{
  private final WeakReference<ql.a> a;
  
  public qq(ql.a parama)
  {
    a = new WeakReference(parama);
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */