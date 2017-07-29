package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class nr
{
  public final String a;
  public final String b;
  public final List c;
  public final String d;
  public final String e;
  public final List f;
  public final List g;
  public final List h;
  public final String i;
  public final List j;
  public final List k;
  public final String l;
  public final String m;
  public final String n;
  public final List o;
  public final String p;
  
  public nr(String paramString1, List paramList1, List paramList2, List paramList3, String paramString2, List paramList4, List paramList5, List paramList6)
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
    Object localObject1 = paramJSONObject.optString("id");
    b = ((String)localObject1);
    Object localObject2 = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new java/util/ArrayList;
    int i1 = ((JSONArray)localObject2).length();
    localArrayList.<init>(i1);
    i1 = 0;
    localObject1 = null;
    for (;;)
    {
      int i2 = ((JSONArray)localObject2).length();
      if (i1 >= i2) {
        break;
      }
      String str2 = ((JSONArray)localObject2).getString(i1);
      localArrayList.add(str2);
      i1 += 1;
    }
    localObject1 = Collections.unmodifiableList(localArrayList);
    c = ((List)localObject1);
    localObject1 = paramJSONObject.optString("allocation_id", null);
    d = ((String)localObject1);
    w.x();
    localObject1 = nx.a(paramJSONObject, "clickurl");
    f = ((List)localObject1);
    w.x();
    localObject1 = nx.a(paramJSONObject, "imp_urls");
    g = ((List)localObject1);
    w.x();
    localObject1 = nx.a(paramJSONObject, "fill_urls");
    h = ((List)localObject1);
    w.x();
    localObject1 = nx.a(paramJSONObject, "video_start_urls");
    j = ((List)localObject1);
    w.x();
    localObject1 = nx.a(paramJSONObject, "video_complete_urls");
    k = ((List)localObject1);
    localObject1 = paramJSONObject.optJSONObject("ad");
    if (localObject1 != null)
    {
      localObject1 = ((JSONObject)localObject1).toString();
      a = ((String)localObject1);
      localObject1 = "data";
      localObject2 = paramJSONObject.optJSONObject((String)localObject1);
      if (localObject2 == null) {
        break label354;
      }
      localObject1 = ((JSONObject)localObject2).toString();
      label238:
      i = ((String)localObject1);
      if (localObject2 == null) {
        break label362;
      }
      localObject1 = ((JSONObject)localObject2).optString("class_name");
      label256:
      e = ((String)localObject1);
      localObject1 = paramJSONObject.optString("html_template", null);
      l = ((String)localObject1);
      localObject1 = paramJSONObject.optString("ad_base_url", null);
      m = ((String)localObject1);
      localObject1 = paramJSONObject.optJSONObject("assets");
      if (localObject1 == null) {
        break label370;
      }
    }
    for (localObject1 = ((JSONObject)localObject1).toString();; localObject1 = null)
    {
      n = ((String)localObject1);
      w.x();
      localObject1 = nx.a(paramJSONObject, "template_ids");
      o = ((List)localObject1);
      localObject1 = paramJSONObject.optJSONObject("ad_loader_options");
      if (localObject1 != null) {
        str1 = ((JSONObject)localObject1).toString();
      }
      p = str1;
      return;
      i1 = 0;
      localObject1 = null;
      break;
      label354:
      i1 = 0;
      localObject1 = null;
      break label238;
      label362:
      i1 = 0;
      localObject1 = null;
      break label256;
      label370:
      i1 = 0;
    }
  }
}


/* Location:              com/google/android/gms/b/nr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */