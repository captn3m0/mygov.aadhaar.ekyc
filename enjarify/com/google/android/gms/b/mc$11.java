package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.Map;

final class mc$11
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject = ke.bx;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (!bool) {
      return;
    }
    localObject = (String)paramMap.get("disabled");
    bool = Boolean.parseBoolean((String)localObject);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      paramvc.c(bool);
      break;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              com/google/android/gms/b/mc$11.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */