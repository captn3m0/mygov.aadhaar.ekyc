package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class mm
  implements md
{
  private final Object a = new Object();
  private final Map<String, a> b = new HashMap();
  
  public final void a(vc paramvc, Map<String, String> arg2)
  {
    paramvc = (String)???.get("id");
    String str1 = (String)???.get("fail");
    ???.get("fail_reason");
    String str2 = (String)???.get("result");
    synchronized (a)
    {
      if ((a)b.remove(paramvc) == null)
      {
        paramvc = String.valueOf(paramvc);
        if (paramvc.length() != 0)
        {
          paramvc = "Received result for unexpected method invocation: ".concat(paramvc);
          tp.e(paramvc);
          return;
        }
        paramvc = new String("Received result for unexpected method invocation: ");
      }
    }
    if (!TextUtils.isEmpty(str1)) {
      return;
    }
    if (str2 == null) {
      return;
    }
    try
    {
      new JSONObject(str2);
      return;
    }
    catch (JSONException paramvc)
    {
      for (;;)
      {
        paramvc.getMessage();
      }
    }
  }
  
  public static abstract interface a {}
}


/* Location:              com/google/android/gms/b/mm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */