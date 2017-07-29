package com.google.android.gms.b;

import org.json.JSONException;
import org.json.JSONObject;

public final class ow
{
  private final boolean a;
  private final boolean b;
  private final boolean c;
  private final boolean d;
  private final boolean e;
  
  private ow(ow.a parama)
  {
    boolean bool = a;
    a = bool;
    bool = b;
    b = bool;
    bool = c;
    c = bool;
    bool = d;
    d = bool;
    bool = e;
    e = bool;
  }
  
  public final JSONObject a()
  {
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      str = "sms";
      boolean bool = a;
      localJSONObject = localJSONObject.put(str, bool);
      str = "tel";
      bool = b;
      localJSONObject = localJSONObject.put(str, bool);
      str = "calendar";
      bool = c;
      localJSONObject = localJSONObject.put(str, bool);
      str = "storePicture";
      bool = d;
      localJSONObject = localJSONObject.put(str, bool);
      str = "inlineVideo";
      bool = e;
      localJSONObject = localJSONObject.put(str, bool);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        String str = "Error occured while obtaining the MRAID capabilities.";
        tp.b(str, localJSONException);
        Object localObject = null;
      }
    }
    return localJSONObject;
  }
}


/* Location:              com/google/android/gms/b/ow.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */