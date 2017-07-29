package com.google.android.gms.b;

import java.util.concurrent.atomic.AtomicReference;

public final class fm
{
  private static final AtomicReference a;
  
  static
  {
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    a = localAtomicReference;
  }
  
  public static fm a()
  {
    AtomicReference localAtomicReference = a;
    fm localfm = new com/google/android/gms/b/fm;
    localfm.<init>();
    localAtomicReference.compareAndSet(null, localfm);
    return (fm)a.get();
  }
  
  public static void b() {}
}


/* Location:              com/google/android/gms/b/fm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */