package com.google.android.gms.b;

import java.util.Map;

final class mc$8
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    String str1 = "Received log message: ";
    String str2 = String.valueOf((String)paramMap.get("string"));
    int i = str2.length();
    if (i != 0) {
      str2 = str1.concat(str2);
    }
    for (;;)
    {
      tp.d(str2);
      return;
      str2 = new java/lang/String;
      str2.<init>(str1);
    }
  }
}


/* Location:              com/google/android/gms/b/mc$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */