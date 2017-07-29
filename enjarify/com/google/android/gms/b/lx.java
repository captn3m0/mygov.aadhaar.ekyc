package com.google.android.gms.b;

import java.util.Map;

public final class lx
  implements md
{
  private final ly a;
  
  public lx(ly paramly)
  {
    a = paramly;
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    String str1 = (String)paramMap.get("name");
    if (str1 == null)
    {
      str1 = "App event with no name parameter.";
      tp.e(str1);
    }
    for (;;)
    {
      return;
      ly locally = a;
      String str2 = (String)paramMap.get("info");
      locally.a(str1, str2);
    }
  }
}


/* Location:              com/google/android/gms/b/lx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */