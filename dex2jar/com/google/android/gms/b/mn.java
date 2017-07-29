package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.Map;

@qi
public final class mn
  implements md
{
  private final a a;
  
  public mn(a parama)
  {
    a = parama;
  }
  
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    paramvc = (String)paramMap.get("action");
    if ("grant".equals(paramvc)) {}
    while (!"video_start".equals(paramvc)) {
      try
      {
        int i = Integer.parseInt((String)paramMap.get("amount"));
        paramvc = (String)paramMap.get("type");
        if (!TextUtils.isEmpty(paramvc))
        {
          paramvc = new ss(paramvc, i);
          a.b(paramvc);
          return;
        }
      }
      catch (NumberFormatException paramvc)
      {
        for (;;)
        {
          tp.c("Unable to parse reward amount.", paramvc);
          paramvc = null;
        }
      }
    }
    a.P();
  }
  
  public static abstract interface a
  {
    public abstract void P();
    
    public abstract void b(ss paramss);
  }
}


/* Location:              com/google/android/gms/b/mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */