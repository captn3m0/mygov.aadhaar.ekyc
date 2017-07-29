package com.google.android.gms.b;

import java.util.Map;

final class mc$12
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    String str1 = (String)paramMap.get("action");
    String str2 = "pause";
    boolean bool1 = str2.equals(str1);
    if (bool1) {
      paramvc.H();
    }
    for (;;)
    {
      return;
      str2 = "resume";
      boolean bool2 = str2.equals(str1);
      if (bool2) {
        paramvc.I();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mc$12.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */