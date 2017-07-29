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
  
  public a(String paramString, JSONObject paramJSONObject, n.b paramb, n.a parama)
  {
    super(paramString, paramJSONObject, paramb, parama);
  }
  
  public final Map a()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str = mygov.aadhaar.ekyc.a.c;
    localHashMap.put("Version", str);
    return localHashMap;
  }
}


/* Location:              mygov/aadhaar/ekyc/b/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */