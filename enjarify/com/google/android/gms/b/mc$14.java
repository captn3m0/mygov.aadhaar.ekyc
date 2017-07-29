package com.google.android.gms.b;

import java.util.Map;
import java.util.Set;

final class mc$14
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    Set localSet = paramMap.keySet();
    String str = "start";
    boolean bool = localSet.contains(str);
    if (bool)
    {
      bool = true;
      paramvc.d(bool);
    }
    localSet = paramMap.keySet();
    str = "stop";
    bool = localSet.contains(str);
    if (bool)
    {
      bool = false;
      localSet = null;
      paramvc.d(false);
    }
  }
}


/* Location:              com/google/android/gms/b/mc$14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */