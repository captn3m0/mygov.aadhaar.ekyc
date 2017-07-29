package com.google.android.gms.b;

import android.support.v4.g.k;
import java.util.concurrent.Future;

public final class qf
  implements qa.a
{
  private final boolean a;
  
  public qf(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  private static k a(k paramk)
  {
    k localk = new android/support/v4/g/k;
    localk.<init>();
    int i = 0;
    Object localObject1 = null;
    for (int j = 0;; j = i)
    {
      i = paramk.size();
      if (j >= i) {
        break;
      }
      Object localObject2 = paramk.b(j);
      localObject1 = ((Future)paramk.c(j)).get();
      localk.put(localObject2, localObject1);
      i = j + 1;
    }
    return localk;
  }
}


/* Location:              com/google/android/gms/b/qf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */