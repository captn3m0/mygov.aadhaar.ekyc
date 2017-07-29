package com.google.android.gms.b;

import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.l;
import java.util.Map;

public final class mt
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    w.B();
    String str = "abort";
    boolean bool1 = paramMap.containsKey(str);
    if (bool1)
    {
      bool1 = mr.a(paramvc);
      if (!bool1)
      {
        str = "Precache abort but no preload task running.";
        tp.e(str);
      }
    }
    for (;;)
    {
      return;
      str = (String)paramMap.get("src");
      if (str == null)
      {
        str = "Precache video action is missing the src parameter.";
        tp.e(str);
      }
      else
      {
        localObject = "player";
      }
      try
      {
        localObject = paramMap.get(localObject);
        localObject = (String)localObject;
        Integer.parseInt((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        boolean bool2;
        mq localmq;
        for (;;) {}
      }
      Object localObject = "mimetype";
      bool2 = paramMap.containsKey(localObject);
      if (bool2)
      {
        localObject = "mimetype";
        paramMap.get(localObject);
      }
      localObject = mr.b(paramvc);
      if (localObject != null) {
        bool2 = true;
      }
      for (;;)
      {
        if (!bool2) {
          break label163;
        }
        str = "Precache task already running.";
        tp.e(str);
        break;
        bool2 = false;
        localObject = null;
      }
      label163:
      l.a(paramvc.h());
      localObject = ha.a(paramvc);
      localmq = new com/google/android/gms/b/mq;
      localmq.<init>(paramvc, (ms)localObject, str);
      localmq.c();
    }
  }
}


/* Location:              com/google/android/gms/b/mt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */