package com.google.android.gms.b;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class fh
  implements Callable
{
  private final eu a;
  private final bf.a b;
  
  public fh(eu parameu, bf.a parama)
  {
    a = parameu;
    b = parama;
  }
  
  private Void a()
  {
    if (a.h != null) {
      a.h.get();
    }
    Object localObject2 = a.g;
    if (localObject2 != null) {
      try
      {
        synchronized (b)
        {
          bf.a locala2 = b;
          localObject2 = gb.a((gb)localObject2);
          gb.a(locala2, (byte[])localObject2, localObject2.length);
        }
        return null;
      }
      catch (ga localga) {}
    }
  }
}


/* Location:              com/google/android/gms/b/fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */