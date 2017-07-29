package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.Map;

public final class mn
  implements md
{
  private final mn.a a;
  
  public mn(mn.a parama)
  {
    a = parama;
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = (String)paramMap.get("action");
    Object localObject3 = "grant";
    boolean bool1 = ((String)localObject3).equals(localObject1);
    if (bool1)
    {
      localObject1 = "amount";
      try
      {
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        int i = Integer.parseInt((String)localObject1);
        localObject1 = "type";
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        bool1 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool1) {
          break label120;
        }
        localObject3 = new com/google/android/gms/b/ss;
        ((ss)localObject3).<init>((String)localObject1, i);
        localObject1 = localObject3;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          localObject3 = "Unable to parse reward amount.";
          tp.c((String)localObject3, localNumberFormatException);
          bool2 = false;
          localObject2 = null;
        }
      }
      localObject3 = a;
      ((mn.a)localObject3).b((ss)localObject1);
    }
    for (;;)
    {
      return;
      label120:
      Object localObject2;
      localObject3 = "video_start";
      boolean bool2 = ((String)localObject3).equals(localObject2);
      if (bool2)
      {
        localObject2 = a;
        ((mn.a)localObject2).P();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */