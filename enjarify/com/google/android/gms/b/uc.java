package com.google.android.gms.b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class uc
{
  public Map a;
  public AtomicInteger b;
  
  public uc()
  {
    Object localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    a = ((Map)localObject);
    localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>(0);
    b = ((AtomicInteger)localObject);
  }
}


/* Location:              com/google/android/gms/b/uc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */