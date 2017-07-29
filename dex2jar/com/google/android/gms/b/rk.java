package com.google.android.gms.b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class rk
{
  boolean A = false;
  String B;
  List<String> C;
  boolean D;
  String E;
  sv F;
  boolean G;
  final qo H;
  private final long I = -1L;
  String a;
  String b;
  String c;
  List<String> d;
  String e;
  String f;
  String g;
  List<String> h;
  long i = -1L;
  boolean j = false;
  List<String> k;
  long l = -1L;
  int m = -1;
  boolean n = false;
  boolean o = false;
  boolean p = false;
  boolean q = true;
  boolean r = true;
  String s = "";
  boolean t = false;
  boolean u = false;
  ss v;
  List<String> w;
  List<String> x;
  boolean y = false;
  qt z;
  
  public rk(qo paramqo, String paramString)
  {
    b = paramString;
    H = paramqo;
  }
  
  private static String a(Map<String, List<String>> paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      return (String)paramMap.get(0);
    }
    return null;
  }
  
  private static long b(Map<String, List<String>> paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = (String)paramMap.get(0);
      try
      {
        float f1 = Float.parseFloat(paramMap);
        return (f1 * 1000.0F);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        tp.e(String.valueOf(paramString).length() + 36 + String.valueOf(paramMap).length() + "Could not parse float from " + paramString + " header: " + paramMap);
      }
    }
    return -1L;
  }
  
  private static List<String> c(Map<String, List<String>> paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = (String)paramMap.get(0);
      if (paramMap != null) {
        return Arrays.asList(paramMap.trim().split("\\s+"));
      }
    }
    return null;
  }
  
  private static boolean d(Map<String, List<String>> paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    return (paramMap != null) && (!paramMap.isEmpty()) && (Boolean.valueOf((String)paramMap.get(0)).booleanValue());
  }
  
  public final void a(Map<String, List<String>> paramMap)
  {
    a = a(paramMap, "X-Afma-Ad-Size");
    E = a(paramMap, "X-Afma-Ad-Slot-Size");
    Object localObject1 = c(paramMap, "X-Afma-Click-Tracking-Urls");
    if (localObject1 != null) {
      d = ((List)localObject1);
    }
    e = a(paramMap, "X-Afma-Debug-Signals");
    localObject1 = (List)paramMap.get("X-Afma-Debug-Dialog");
    if ((localObject1 != null) && (!((List)localObject1).isEmpty())) {
      f = ((String)((List)localObject1).get(0));
    }
    localObject1 = c(paramMap, "X-Afma-Tracking-Urls");
    if (localObject1 != null) {
      h = ((List)localObject1);
    }
    long l1 = b(paramMap, "X-Afma-Interstitial-Timeout");
    if (l1 != -1L) {
      i = l1;
    }
    j |= d(paramMap, "X-Afma-Mediation");
    localObject1 = c(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (localObject1 != null) {
      k = ((List)localObject1);
    }
    l1 = b(paramMap, "X-Afma-Refresh-Rate");
    if (l1 != -1L) {
      l = l1;
    }
    localObject1 = (List)paramMap.get("X-Afma-Orientation");
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      localObject1 = (String)((List)localObject1).get(0);
      if (!"portrait".equalsIgnoreCase((String)localObject1)) {
        break label903;
      }
      m = w.g().b();
    }
    for (;;)
    {
      g = a(paramMap, "X-Afma-ActiveView");
      localObject1 = (List)paramMap.get("X-Afma-Use-HTTPS");
      if ((localObject1 != null) && (!((List)localObject1).isEmpty())) {
        p = Boolean.valueOf((String)((List)localObject1).get(0)).booleanValue();
      }
      n |= d(paramMap, "X-Afma-Custom-Rendering-Allowed");
      o = "native".equals(a(paramMap, "X-Afma-Ad-Format"));
      localObject1 = (List)paramMap.get("X-Afma-Content-Url-Opted-Out");
      if ((localObject1 != null) && (!((List)localObject1).isEmpty())) {
        q = Boolean.valueOf((String)((List)localObject1).get(0)).booleanValue();
      }
      localObject1 = (List)paramMap.get("X-Afma-Content-Vertical-Opted-Out");
      if ((localObject1 != null) && (!((List)localObject1).isEmpty())) {
        r = Boolean.valueOf((String)((List)localObject1).get(0)).booleanValue();
      }
      localObject1 = (List)paramMap.get("X-Afma-Gws-Query-Id");
      if ((localObject1 != null) && (!((List)localObject1).isEmpty())) {
        s = ((String)((List)localObject1).get(0));
      }
      localObject1 = a(paramMap, "X-Afma-Fluid");
      if ((localObject1 != null) && (((String)localObject1).equals("height"))) {
        t = true;
      }
      u = "native_express".equals(a(paramMap, "X-Afma-Ad-Format"));
      v = ss.a(a(paramMap, "X-Afma-Rewards"));
      if (w == null) {
        w = c(paramMap, "X-Afma-Reward-Video-Start-Urls");
      }
      if (x == null) {
        x = c(paramMap, "X-Afma-Reward-Video-Complete-Urls");
      }
      y |= d(paramMap, "X-Afma-Use-Displayed-Impression");
      A |= d(paramMap, "X-Afma-Auto-Collect-Location");
      B = a(paramMap, "Set-Cookie");
      localObject1 = a(paramMap, "X-Afma-Auto-Protection-Configuration");
      if ((localObject1 == null) || (TextUtils.isEmpty((CharSequence)localObject1)))
      {
        localObject1 = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        ((Uri.Builder)localObject1).appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(f)) {
          ((Uri.Builder)localObject1).appendQueryParameter("debugDialog", f);
        }
        Object localObject2 = ke.j;
        boolean bool = ((Boolean)w.q().a((jz)localObject2)).booleanValue();
        localObject1 = String.valueOf(((Uri.Builder)localObject1).toString());
        localObject2 = String.valueOf("navigationURL");
        z = new qt(bool, Arrays.asList(new String[] { String.valueOf(localObject1).length() + 18 + String.valueOf(localObject2).length() + (String)localObject1 + "&" + (String)localObject2 + "={NAVIGATION_URL}" }));
        localObject1 = c(paramMap, "X-Afma-Remote-Ping-Urls");
        if (localObject1 != null) {
          C = ((List)localObject1);
        }
        localObject1 = a(paramMap, "X-Afma-Safe-Browsing");
        if (TextUtils.isEmpty((CharSequence)localObject1)) {}
      }
      try
      {
        F = sv.a(new JSONObject((String)localObject1));
        D |= d(paramMap, "X-Afma-Render-In-Browser");
        paramMap = a(paramMap, "X-Afma-Pool");
        if (!TextUtils.isEmpty(paramMap)) {}
        try
        {
          G = new JSONObject(paramMap).getBoolean("never_pool");
          return;
        }
        catch (JSONException paramMap)
        {
          label903:
          tp.c("Error parsing interstitial pool header", paramMap);
        }
        if ("landscape".equalsIgnoreCase((String)localObject1))
        {
          m = w.g().a();
          continue;
          try
          {
            z = qt.a(new JSONObject((String)localObject1));
          }
          catch (JSONException localJSONException1)
          {
            tp.c("Error parsing configuration JSON", localJSONException1);
            z = new qt();
          }
        }
      }
      catch (JSONException localJSONException2)
      {
        for (;;)
        {
          tp.c("Error parsing safe browsing header", localJSONException2);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/rk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */