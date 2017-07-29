package com.google.android.gms.b;

import android.os.Handler;
import java.util.Map;
import org.json.JSONObject;

final class me$1
  implements Runnable
{
  me$1(me paramme, Map paramMap, vc paramvc) {}
  
  public final void run()
  {
    tp.b("Received Http request.");
    Object localObject1 = (String)a.get("http_request");
    Object localObject2 = c;
    localObject1 = ((me)localObject2).a((String)localObject1);
    if (localObject1 == null)
    {
      localObject1 = "Response should not be null.";
      tp.c((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = tt.a;
      me.1.1 local1 = new com/google/android/gms/b/me$1$1;
      local1.<init>(this, (JSONObject)localObject1);
      ((Handler)localObject2).post(local1);
    }
  }
}


/* Location:              com/google/android/gms/b/me$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */