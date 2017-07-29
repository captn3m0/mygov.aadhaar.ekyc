package com.google.android.gms.b;

import org.json.JSONException;
import org.json.JSONObject;

@qi
public class oy
{
  private final String a;
  final vc t;
  
  public oy(vc paramvc)
  {
    this(paramvc, "");
  }
  
  public oy(vc paramvc, String paramString)
  {
    t = paramvc;
    a = paramString;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("width", paramInt1).put("height", paramInt2).put("maxSizeWidth", paramInt3).put("maxSizeHeight", paramInt4).put("density", paramFloat).put("rotation", paramInt5);
      t.b("onScreenInfoChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      tp.b("Error occured while obtaining screen information.", localJSONException);
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      paramString = new JSONObject().put("message", paramString).put("action", a);
      t.b("onError", paramString);
      return;
    }
    catch (JSONException paramString)
    {
      tp.b("Error occurred while dispatching error event.", paramString);
    }
  }
  
  public final void b(String paramString)
  {
    try
    {
      paramString = new JSONObject().put("state", paramString);
      t.b("onStateChanged", paramString);
      return;
    }
    catch (JSONException paramString)
    {
      tp.b("Error occured while dispatching state change.", paramString);
    }
  }
}


/* Location:              com/google/android/gms/b/oy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */