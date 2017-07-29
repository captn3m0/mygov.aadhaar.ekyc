package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.w;
import java.util.Map;

public final class mj
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = w.D();
    boolean bool1 = ((ta)localObject1).a();
    if (!bool1) {}
    for (;;)
    {
      return;
      int j = -1;
      localObject1 = "eventType";
      Object localObject2;
      try
      {
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        int i = Integer.parseInt((String)localObject1);
        j = i;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localObject2 = "Parse Scion log event type error";
          tp.b((String)localObject2, localException);
        }
        localta = w.D();
        localObject2 = paramvc.getContext();
        localta.b((Context)localObject2, localException);
      }
      localObject1 = (String)paramMap.get("eventId");
      ta localta;
      switch (j)
      {
      default: 
        break;
      case 0: 
        localta = w.D();
        localObject2 = paramvc.getContext();
        localta.a((Context)localObject2, (String)localObject1);
        break;
      case 1: 
        break;
      case 2: 
        localta = w.D();
        localObject2 = paramvc.getContext();
        boolean bool2 = localta.a();
        if (bool2)
        {
          String str = "_aa";
          Bundle localBundle = ta.a(localException);
          localta.a((Context)localObject2, str, localBundle);
        }
        break;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */