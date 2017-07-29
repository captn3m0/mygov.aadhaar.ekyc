package com.google.android.gms.b;

import java.util.concurrent.Callable;

final class ny$1
  implements Callable
{
  ny$1(ny paramny, nv paramnv) {}
  
  private nw a()
  {
    Object localObject1 = b;
    synchronized (c)
    {
      localObject1 = b;
      boolean bool = d;
      if (bool)
      {
        bool = false;
        localObject1 = null;
        return (nw)localObject1;
      }
      localObject1 = a;
      long l1 = b.a;
      ??? = b;
      long l2 = b;
      localObject1 = ((nv)localObject1).a(l1, l2);
    }
  }
}


/* Location:              com/google/android/gms/b/ny$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */