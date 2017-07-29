package com.google.android.gms.b;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class ld$a$4
  implements md
{
  ld$a$4(ld.a parama, nk paramnk) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    Object localObject4;
    try
    {
      Object localObject2 = paramMap.keySet();
      localObject4 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject4).next();
        localObject2 = (String)localObject2;
        Object localObject5 = paramMap.get(localObject2);
        ((JSONObject)localObject1).put((String)localObject2, localObject5);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      localObject1 = "Unable to dispatch sendMessageToNativeJs event";
      tp.b((String)localObject1, localJSONException);
    }
    for (;;)
    {
      Object localObject3 = "id";
      localObject4 = b;
      localObject4 = b;
      ((JSONObject)localObject1).put((String)localObject3, localObject4);
      localObject3 = a;
      localObject4 = "sendMessageToNativeJs";
      ((nk)localObject3).b((String)localObject4, (JSONObject)localObject1);
    }
  }
}


/* Location:              com/google/android/gms/b/ld$a$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */