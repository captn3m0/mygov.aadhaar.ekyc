package com.google.android.gms.b;

import java.util.Map;
import java.util.Set;

final class mc$13
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    boolean bool1 = true;
    Object localObject1 = paramMap.keySet();
    Object localObject4 = "start";
    boolean bool2 = ((Set)localObject1).contains(localObject4);
    if (bool2)
    {
      localObject1 = paramvc.l();
      localObject4 = b;
      bool1 = true;
    }
    for (;;)
    {
      int i;
      try
      {
        h = bool1;
        i = n + 1;
        n = i;
        ((vd)localObject1).h();
        return;
      }
      finally {}
      Object localObject3 = paramMap.keySet();
      localObject4 = "stop";
      bool2 = ((Set)localObject3).contains(localObject4);
      if (bool2)
      {
        localObject3 = paramvc.l();
        i = n + -1;
        n = i;
        ((vd)localObject3).h();
      }
      else
      {
        localObject3 = paramMap.keySet();
        localObject4 = "cancel";
        bool2 = ((Set)localObject3).contains(localObject4);
        if (bool2)
        {
          localObject3 = paramvc.l();
          m = bool1;
          ((vd)localObject3).h();
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mc$13.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */