package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@qi
public final class nr
{
  public final String a;
  public final String b;
  public final List<String> c;
  public final String d;
  public final String e;
  public final List<String> f;
  public final List<String> g;
  public final List<String> h;
  public final String i;
  public final List<String> j;
  public final List<String> k;
  public final String l;
  public final String m;
  public final String n;
  public final List<String> o;
  public final String p;
  
  public nr(String paramString1, List<String> paramList1, List<String> paramList2, List<String> paramList3, String paramString2, List<String> paramList4, List<String> paramList5, List<String> paramList6)
  {
    a = paramString1;
    b = null;
    c = paramList1;
    d = null;
    e = null;
    f = paramList2;
    g = paramList3;
    i = paramString2;
    j = paramList4;
    k = paramList5;
    l = null;
    m = null;
    n = null;
    o = null;
    p = null;
    h = paramList6;
  }
  
  public nr(JSONObject paramJSONObject)
  {
    b = paramJSONObject.optString("id");
    Object localObject1 = paramJSONObject.getJSONArray("adapters");
    Object localObject3 = new ArrayList(((JSONArray)localObject1).length());
    int i1 = 0;
    while (i1 < ((JSONArray)localObject1).length())
    {
      ((List)localObject3).add(((JSONArray)localObject1).getString(i1));
      i1 += 1;
    }
    c = Collections.unmodifiableList((List)localObject3);
    d = paramJSONObject.optString("allocation_id", null);
    w.x();
    f = nx.a(paramJSONObject, "clickurl");
    w.x();
    g = nx.a(paramJSONObject, "imp_urls");
    w.x();
    h = nx.a(paramJSONObject, "fill_urls");
    w.x();
    j = nx.a(paramJSONObject, "video_start_urls");
    w.x();
    k = nx.a(paramJSONObject, "video_complete_urls");
    localObject1 = paramJSONObject.optJSONObject("ad");
    if (localObject1 != null)
    {
      localObject1 = ((JSONObject)localObject1).toString();
      a = ((String)localObject1);
      localObject3 = paramJSONObject.optJSONObject("data");
      if (localObject3 == null) {
        break label307;
      }
      localObject1 = ((JSONObject)localObject3).toString();
      label197:
      i = ((String)localObject1);
      if (localObject3 == null) {
        break label312;
      }
      localObject1 = ((JSONObject)localObject3).optString("class_name");
      label215:
      e = ((String)localObject1);
      l = paramJSONObject.optString("html_template", null);
      m = paramJSONObject.optString("ad_base_url", null);
      localObject1 = paramJSONObject.optJSONObject("assets");
      if (localObject1 == null) {
        break label317;
      }
    }
    label307:
    label312:
    label317:
    for (localObject1 = ((JSONObject)localObject1).toString();; localObject1 = null)
    {
      n = ((String)localObject1);
      w.x();
      o = nx.a(paramJSONObject, "template_ids");
      localObject1 = paramJSONObject.optJSONObject("ad_loader_options");
      paramJSONObject = (JSONObject)localObject2;
      if (localObject1 != null) {
        paramJSONObject = ((JSONObject)localObject1).toString();
      }
      p = paramJSONObject;
      return;
      localObject1 = null;
      break;
      localObject1 = null;
      break label197;
      localObject1 = null;
      break label215;
    }
  }
}


/* Location:              com/google/android/gms/b/nr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */