package com.google.android.gms.b;

import java.util.Map;

public final class rb$c
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    String str1 = (String)paramMap.get("request_id");
    String str2 = (String)paramMap.get("errors");
    String str3 = "Invalid request: ";
    str2 = String.valueOf(str2);
    int i = str2.length();
    if (i != 0) {
      str2 = str3.concat(str2);
    }
    for (;;)
    {
      tp.e(str2);
      rb.d().a(str1);
      return;
      str2 = new java/lang/String;
      str2.<init>(str3);
    }
  }
}


/* Location:              com/google/android/gms/b/rb$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */