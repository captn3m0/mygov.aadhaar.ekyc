package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class mm
  implements md
{
  private final Object a;
  private final Map b;
  
  public mm()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    b = ((Map)localObject);
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    String str1 = (String)paramMap.get("id");
    String str2 = (String)paramMap.get("fail");
    paramMap.get("fail_reason");
    String str3 = (String)paramMap.get("result");
    for (;;)
    {
      synchronized (a)
      {
        Object localObject3 = b;
        localObject3 = ((Map)localObject3).remove(str1);
        localObject3 = (mm.a)localObject3;
        if (localObject3 == null)
        {
          str2 = "Received result for unexpected method invocation: ";
          str1 = String.valueOf(str1);
          int i = str1.length();
          if (i != 0)
          {
            str1 = str2.concat(str1);
            tp.e(str1);
            return;
          }
          str1 = new java/lang/String;
          str1.<init>(str2);
        }
      }
      boolean bool = TextUtils.isEmpty(str2);
      if (!bool) {}
      if (str3 == null) {}
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str3);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          localJSONException.getMessage();
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */