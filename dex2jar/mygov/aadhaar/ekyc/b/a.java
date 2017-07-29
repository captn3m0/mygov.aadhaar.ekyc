package mygov.aadhaar.ekyc.b;

import com.a.a.a.i;
import com.a.a.n.a;
import com.a.a.n.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends i
{
  public static String l = "https://aadhaar-api.appspot.com/ekyc/authbyname/";
  public static String m = "https://aadhaar-api.appspot.com/ekyc/generateOTP/";
  public static String n = "https://aadhaar-api.appspot.com/ekyc/authbyOTP/";
  
  public a(String paramString, JSONObject paramJSONObject, n.b<JSONObject> paramb, n.a parama)
  {
    super(paramString, paramJSONObject, paramb, parama);
  }
  
  public final Map<String, String> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("Version", mygov.aadhaar.ekyc.a.c);
    return localHashMap;
  }
}


/* Location:              mygov/aadhaar/ekyc/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */