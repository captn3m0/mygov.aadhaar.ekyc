package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@qi
public final class ns
{
  public final List<nr> a;
  public final long b;
  public final List<String> c;
  public final List<String> d;
  public final List<String> e;
  public final List<String> f;
  public final boolean g;
  public final String h;
  public final long i;
  public final String j;
  public final int k;
  public final int l;
  public final long m;
  public final boolean n;
  public final boolean o;
  public int p;
  public int q;
  
  public ns(String paramString)
  {
    this(new JSONObject(paramString));
  }
  
  public ns(List<nr> paramList, long paramLong, List<String> paramList1, List<String> paramList2, List<String> paramList3, List<String> paramList4, boolean paramBoolean, String paramString)
  {
    a = paramList;
    b = paramLong;
    c = paramList1;
    d = paramList2;
    e = paramList3;
    f = paramList4;
    g = paramBoolean;
    h = paramString;
    i = -1L;
    p = 0;
    q = 1;
    j = null;
    k = 0;
    l = -1;
    m = -1L;
    n = false;
    o = false;
  }
  
  public ns(JSONObject paramJSONObject)
  {
    if (tp.a(2))
    {
      localObject = String.valueOf(paramJSONObject.toString(2));
      if (((String)localObject).length() == 0) {
        break label134;
      }
    }
    ArrayList localArrayList;
    int i2;
    label134:
    for (Object localObject = "Mediation Response JSON: ".concat((String)localObject);; localObject = new String("Mediation Response JSON: "))
    {
      tp.a((String)localObject);
      localObject = paramJSONObject.getJSONArray("ad_networks");
      localArrayList = new ArrayList(((JSONArray)localObject).length());
      int i1 = 0;
      int i3;
      for (i2 = -1; i1 < ((JSONArray)localObject).length(); i2 = i3)
      {
        nr localnr = new nr(((JSONArray)localObject).getJSONObject(i1));
        localArrayList.add(localnr);
        i3 = i2;
        if (i2 < 0)
        {
          i3 = i2;
          if (a(localnr)) {
            i3 = i1;
          }
        }
        i1 += 1;
      }
    }
    p = i2;
    q = ((JSONArray)localObject).length();
    a = Collections.unmodifiableList(localArrayList);
    h = paramJSONObject.optString("qdata");
    l = paramJSONObject.optInt("fs_model_type", -1);
    m = paramJSONObject.optLong("timeout_ms", -1L);
    paramJSONObject = paramJSONObject.optJSONObject("settings");
    if (paramJSONObject != null)
    {
      b = paramJSONObject.optLong("ad_network_timeout_millis", -1L);
      w.x();
      c = nx.a(paramJSONObject, "click_urls");
      w.x();
      d = nx.a(paramJSONObject, "imp_urls");
      w.x();
      e = nx.a(paramJSONObject, "nofill_urls");
      w.x();
      f = nx.a(paramJSONObject, "remote_ping_urls");
      g = paramJSONObject.optBoolean("render_in_browser", false);
      long l1 = paramJSONObject.optLong("refresh", -1L);
      if (l1 > 0L)
      {
        l1 *= 1000L;
        i = l1;
        localObject = ss.a(paramJSONObject.optJSONArray("rewards"));
        if (localObject != null) {
          break label385;
        }
        j = null;
      }
      for (k = 0;; k = b)
      {
        n = paramJSONObject.optBoolean("use_displayed_impression", false);
        o = paramJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        return;
        l1 = -1L;
        break;
        label385:
        j = a;
      }
    }
    b = -1L;
    c = null;
    d = null;
    e = null;
    f = null;
    i = -1L;
    j = null;
    k = 0;
    n = false;
    g = false;
    o = false;
  }
  
  private static boolean a(nr paramnr)
  {
    paramnr = c.iterator();
    while (paramnr.hasNext()) {
      if (((String)paramnr.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              com/google/android/gms/b/ns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */