package com.a.a.a;

import com.a.a.b.a;
import com.a.a.k;
import com.a.a.n;
import com.a.a.n.a;
import com.a.a.n.b;
import com.a.a.s;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class i
  extends j
{
  public i(String paramString, JSONObject paramJSONObject, n.b paramb, n.a parama) {}
  
  protected final n a(com.a.a.i parami)
  {
    try
    {
      localObject1 = new java/lang/String;
      localObject2 = b;
      Object localObject3 = c;
      String str = "utf-8";
      localObject3 = e.a((Map)localObject3, str);
      ((String)localObject1).<init>((byte[])localObject2, (String)localObject3);
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>((String)localObject1);
      localObject3 = e.a(parami);
      localObject1 = new com/a/a/n;
      ((n)localObject1).<init>(localObject2, (b.a)localObject3);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        Object localObject1;
        localObject2 = new com/a/a/k;
        ((k)localObject2).<init>(localUnsupportedEncodingException);
        n localn1 = n.a((s)localObject2);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = new com/a/a/k;
        ((k)localObject2).<init>(localJSONException);
        n localn2 = n.a((s)localObject2);
      }
    }
    return (n)localObject1;
  }
}


/* Location:              com/a/a/a/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */