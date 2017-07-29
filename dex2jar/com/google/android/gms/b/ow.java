package com.google.android.gms.b;

import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class ow
{
  private final boolean a;
  private final boolean b;
  private final boolean c;
  private final boolean d;
  private final boolean e;
  
  private ow(a parama)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
  }
  
  public final JSONObject a()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("sms", a).put("tel", b).put("calendar", c).put("storePicture", d).put("inlineVideo", e);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      tp.b("Error occured while obtaining the MRAID capabilities.", localJSONException);
    }
    return null;
  }
  
  public static final class a
  {
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
  }
}


/* Location:              com/google/android/gms/b/ow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */