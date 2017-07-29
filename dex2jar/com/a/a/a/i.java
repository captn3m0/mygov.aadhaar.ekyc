package com.a.a.a;

import com.a.a.k;
import com.a.a.n;
import com.a.a.n.a;
import com.a.a.n.b;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class i
  extends j<JSONObject>
{
  public i(String paramString, JSONObject paramJSONObject, n.b<JSONObject> paramb, n.a parama) {}
  
  protected final n<JSONObject> a(com.a.a.i parami)
  {
    try
    {
      parami = new n(new JSONObject(new String(b, e.a(c, "utf-8"))), e.a(parami));
      return parami;
    }
    catch (UnsupportedEncodingException parami)
    {
      return n.a(new k(parami));
    }
    catch (JSONException parami) {}
    return n.a(new k(parami));
  }
}


/* Location:              com/a/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */