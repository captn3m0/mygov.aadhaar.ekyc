package com.google.android.gms.b;

import java.util.Map;

final class rj$3
  implements md
{
  rj$3(rj paramrj) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = a;
    for (;;)
    {
      synchronized (a)
      {
        localObject1 = a;
        localObject1 = d;
        boolean bool1 = ((up)localObject1).isDone();
        if (bool1) {
          return;
        }
        localObject1 = new com/google/android/gms/b/rm;
        int i = -2;
        ((rm)localObject1).<init>(i, paramMap);
        localObject4 = a;
        localObject4 = b;
        String str = f;
        boolean bool2 = ((String)localObject4).equals(str);
        if (bool2) {}
      }
      Object localObject4 = a;
      localObject4 = d;
      ((up)localObject4).b(localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/rj$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */