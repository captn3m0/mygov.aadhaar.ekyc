package com.google.android.gms.b;

import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.w;
import java.util.Map;
import org.json.JSONObject;

final class mc$5
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = "checkSupport";
    Object localObject2 = paramMap.get("action");
    boolean bool = ((String)localObject1).equals(localObject2);
    String str;
    if (bool)
    {
      tp.d("Received support message, responding.");
      localObject1 = paramvc.h();
      if (localObject1 != null)
      {
        localObject1 = c;
        if (localObject1 != null) {
          paramvc.getContext();
        }
      }
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      localObject2 = "event";
      str = "checkSupport";
    }
    for (;;)
    {
      try
      {
        ((JSONObject)localObject1).put((String)localObject2, str);
        localObject2 = "supports";
        str = null;
        ((JSONObject)localObject1).put((String)localObject2, false);
        localObject2 = "appStreaming";
        paramvc.b((String)localObject2, (JSONObject)localObject1);
        return;
      }
      finally
      {
        localObject2 = w.i();
        str = "DefaultGmsgHandlers.processCheckSupportsMessage";
        ((tj)localObject2).a(localThrowable, str);
        continue;
      }
      g localg = paramvc.i();
      if (localg != null) {
        g.o();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mc$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */