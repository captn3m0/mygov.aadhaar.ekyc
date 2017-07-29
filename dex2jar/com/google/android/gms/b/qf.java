package com.google.android.gms.b;

import android.support.v4.g.k;
import java.util.concurrent.Future;

@qi
public final class qf
  implements qa.a<ky>
{
  private final boolean a;
  
  public qf(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  private static <K, V> k<K, V> a(k<K, Future<V>> paramk)
  {
    k localk = new k();
    int i = 0;
    while (i < paramk.size())
    {
      localk.put(paramk.b(i), ((Future)paramk.c(i)).get());
      i += 1;
    }
    return localk;
  }
}


/* Location:              com/google/android/gms/b/qf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */