package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.Map;

@qi
public final class mj
  implements md
{
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    if (!w.D().a()) {}
    ta localta;
    do
    {
      return;
      int i = -1;
      try
      {
        int j = Integer.parseInt((String)paramMap.get("eventType"));
        i = j;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          tp.b("Parse Scion log event type error", localException);
        }
        w.D().b(paramvc.getContext(), paramMap);
        return;
      }
      paramMap = (String)paramMap.get("eventId");
      switch (i)
      {
      default: 
        return;
      case 0: 
        w.D().a(paramvc.getContext(), paramMap);
        return;
      }
      localta = w.D();
      paramvc = paramvc.getContext();
    } while (!localta.a());
    localta.a(paramvc, "_aa", ta.a(paramMap));
  }
}


/* Location:              com/google/android/gms/b/mj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */