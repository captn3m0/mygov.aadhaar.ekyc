package com.google.android.gms.b;

import java.util.concurrent.atomic.AtomicReference;

public final class fm
{
  private static final AtomicReference<fm> a = new AtomicReference();
  
  public static fm a()
  {
    a.compareAndSet(null, new fm());
    return (fm)a.get();
  }
  
  public static void b() {}
}


/* Location:              com/google/android/gms/b/fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */