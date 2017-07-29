package com.google.android.gms.b;

import java.util.Map;

final class mc$10
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    String str1 = (String)paramMap.get("tx");
    String str3 = (String)paramMap.get("ty");
    String str4 = (String)paramMap.get("td");
    try
    {
      int i = Integer.parseInt(str1);
      int j = Integer.parseInt(str3);
      int k = Integer.parseInt(str4);
      Object localObject = paramvc.n();
      if (localObject != null)
      {
        localObject = e;
        ((bv)localObject).a(i, j, k);
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str2 = "Could not parse touch parameters from gmsg.";
        tp.e(str2);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mc$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */