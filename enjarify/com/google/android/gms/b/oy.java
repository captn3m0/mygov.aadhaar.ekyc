package com.google.android.gms.b;

import org.json.JSONException;
import org.json.JSONObject;

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
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "width";
      localJSONObject = localJSONObject.put((String)localObject, paramInt1);
      localObject = "height";
      localJSONObject = localJSONObject.put((String)localObject, paramInt2);
      localObject = "maxSizeWidth";
      localJSONObject = localJSONObject.put((String)localObject, paramInt3);
      localObject = "maxSizeHeight";
      localJSONObject = localJSONObject.put((String)localObject, paramInt4);
      localObject = "density";
      double d = paramFloat;
      localJSONObject = localJSONObject.put((String)localObject, d);
      localObject = "rotation";
      localJSONObject = localJSONObject.put((String)localObject, paramInt5);
      localObject = t;
      String str = "onScreenInfoChanged";
      ((vc)localObject).b(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occured while obtaining screen information.";
        tp.b((String)localObject, localJSONException);
      }
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "message";
      localJSONObject = localJSONObject.put((String)localObject, paramString);
      localObject = "action";
      String str = a;
      localJSONObject = localJSONObject.put((String)localObject, str);
      localObject = t;
      str = "onError";
      ((vc)localObject).b(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occurred while dispatching error event.";
        tp.b((String)localObject, localJSONException);
      }
    }
  }
  
  public final void b(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "state";
      localJSONObject = localJSONObject.put((String)localObject, paramString);
      localObject = t;
      String str = "onStateChanged";
      ((vc)localObject).b(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occured while dispatching state change.";
        tp.b((String)localObject, localJSONException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/oy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */