package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class n$c
  extends n.a
{
  private static final WeakReference b;
  private WeakReference a;
  
  static
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(null);
    b = localWeakReference;
  }
  
  n$c(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
    WeakReference localWeakReference = b;
    a = localWeakReference;
  }
  
  final byte[] c()
  {
    try
    {
      Object localObject1 = a;
      localObject1 = ((WeakReference)localObject1).get();
      localObject1 = (byte[])localObject1;
      if (localObject1 == null)
      {
        localObject1 = d();
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(localObject1);
        a = localWeakReference;
      }
      return (byte[])localObject1;
    }
    finally {}
  }
  
  protected abstract byte[] d();
}


/* Location:              com/google/android/gms/common/n$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */