package com.google.android.gms.b;

import com.google.android.gms.common.a;
import com.google.android.gms.common.api.a.f;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

final class x$b$1
  implements Runnable
{
  x$b$1(x.b paramb, a parama) {}
  
  public final void run()
  {
    Object localObject1 = a;
    boolean bool1 = ((a)localObject1).b();
    boolean bool2;
    if (bool1)
    {
      localObject1 = b;
      bool2 = true;
      c = bool2;
      localObject1 = b.a;
      bool1 = ((a.f)localObject1).d();
      if (bool1)
      {
        localObject1 = b;
        ((x.b)localObject1).a();
      }
    }
    for (;;)
    {
      return;
      localObject1 = b.a;
      bool2 = false;
      Object localObject2 = null;
      Set localSet = Collections.emptySet();
      ((a.f)localObject1).a(null, localSet);
      continue;
      localObject1 = x.j(b.d);
      localObject2 = b.b;
      localObject1 = (x.a)((Map)localObject1).get(localObject2);
      localObject2 = a;
      ((x.a)localObject1).a((a)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/x$b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */