package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import java.util.concurrent.Callable;

@qi
public final class kd
{
  final Object a = new Object();
  final ConditionVariable b = new ConditionVariable();
  volatile boolean c = false;
  SharedPreferences d = null;
  
  public final <T> T a(final jz<T> paramjz)
  {
    if (!b.block(5000L)) {
      throw new IllegalStateException("Flags.initialize() was not called!");
    }
    if (!c) {}
    synchronized (a)
    {
      if (!c)
      {
        paramjz = b;
        return paramjz;
      }
      (T)uh.a(new Callable()
      {
        public final T call()
        {
          return (T)paramjz.a(d);
        }
      });
    }
  }
}


/* Location:              com/google/android/gms/b/kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */