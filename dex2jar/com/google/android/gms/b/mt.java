package com.google.android.gms.b;

import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.l;
import java.util.Map;

@qi
public final class mt
  implements md
{
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    w.B();
    if (paramMap.containsKey("abort"))
    {
      if (!mr.a(paramvc)) {
        tp.e("Precache abort but no preload task running.");
      }
      return;
    }
    String str = (String)paramMap.get("src");
    if (str == null)
    {
      tp.e("Precache video action is missing the src parameter.");
      return;
    }
    try
    {
      Integer.parseInt((String)paramMap.get("player"));
      if (paramMap.containsKey("mimetype")) {
        paramMap.get("mimetype");
      }
      if (mr.b(paramvc) != null) {}
      for (int i = 1; i != 0; i = 0)
      {
        tp.e("Precache task already running.");
        return;
      }
      l.a(paramvc.h());
      new mq(paramvc, ha.a(paramvc), str).c();
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/b/mt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */