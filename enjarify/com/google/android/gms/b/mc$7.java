package com.google.android.gms.b;

import android.content.Context;
import java.util.Map;

final class mc$7
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    String str1 = (String)paramMap.get("u");
    if (str1 == null)
    {
      str1 = "URL missing from httpTrack GMSG.";
      tp.e(str1);
    }
    for (;;)
    {
      return;
      ud localud = new com/google/android/gms/b/ud;
      Context localContext = paramvc.getContext();
      String str2 = oa;
      localud.<init>(localContext, str2, str1);
      localud.c();
    }
  }
}


/* Location:              com/google/android/gms/b/mc$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */