package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import java.util.concurrent.Callable;

public final class kd
{
  final Object a;
  final ConditionVariable b;
  volatile boolean c;
  SharedPreferences d;
  
  public kd()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new android/os/ConditionVariable;
    ((ConditionVariable)localObject).<init>();
    b = ((ConditionVariable)localObject);
    c = false;
    d = null;
  }
  
  public final Object a(jz paramjz)
  {
    Object localObject1 = b;
    long l = 5000L;
    boolean bool = ((ConditionVariable)localObject1).block(l);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Flags.initialize() was not called!");
      throw ((Throwable)localObject1);
    }
    bool = c;
    if (!bool) {}
    synchronized (a)
    {
      bool = c;
      if (!bool)
      {
        localObject1 = b;
        return localObject1;
      }
      localObject1 = new com/google/android/gms/b/kd$1;
      ((kd.1)localObject1).<init>(this, paramjz);
      localObject1 = uh.a((Callable)localObject1);
    }
  }
}


/* Location:              com/google/android/gms/b/kd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */