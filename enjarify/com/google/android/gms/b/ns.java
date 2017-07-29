package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ns
{
  public final List a;
  public final long b;
  public final List c;
  public final List d;
  public final List e;
  public final List f;
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
    this(localJSONObject);
  }
  
  public ns(List paramList1, long paramLong, List paramList2, List paramList3, List paramList4, List paramList5, boolean paramBoolean, String paramString)
  {
    a = paramList1;
    b = paramLong;
    c = paramList2;
    d = paramList3;
    e = paramList4;
    f = paramList5;
    g = paramBoolean;
    h = paramString;
    i = l1;
    p = 0;
    q = 1;
    j = null;
    k = 0;
    l = -1;
    m = l1;
    n = false;
    o = false;
  }
  
  public ns(JSONObject paramJSONObject)
  {
    boolean bool2 = tp.a(i1);
    Object localObject1;
    if (bool2)
    {
      localObject1 = "Mediation Response JSON: ";
      localObject2 = String.valueOf(paramJSONObject.toString(i1));
      i1 = ((String)localObject2).length();
      if (i1 == 0) {
        break label172;
      }
      localObject2 = ((String)localObject1).concat((String)localObject2);
    }
    JSONArray localJSONArray;
    ArrayList localArrayList;
    int i4;
    for (;;)
    {
      tp.a((String)localObject2);
      localJSONArray = paramJSONObject.getJSONArray("ad_networks");
      localArrayList = new java/util/ArrayList;
      i3 = localJSONArray.length();
      localArrayList.<init>(i3);
      i3 = 0;
      localObject2 = null;
      i4 = i2;
      for (;;)
      {
        int i6 = localJSONArray.length();
        if (i3 >= i6) {
          break;
        }
        nr localnr = new com/google/android/gms/b/nr;
        JSONObject localJSONObject = localJSONArray.getJSONObject(i3);
        localnr.<init>(localJSONObject);
        localArrayList.add(localnr);
        if (i4 < 0)
        {
          boolean bool5 = a(localnr);
          if (bool5) {
            i4 = i3;
          }
        }
        i3 += 1;
      }
      label172:
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>((String)localObject1);
    }
    p = i4;
    int i3 = localJSONArray.length();
    q = i3;
    Object localObject2 = Collections.unmodifiableList(localArrayList);
    a = ((List)localObject2);
    localObject2 = paramJSONObject.optString("qdata");
    h = ((String)localObject2);
    i3 = paramJSONObject.optInt("fs_model_type", i2);
    l = i3;
    long l2 = paramJSONObject.optLong("timeout_ms", l1);
    m = l2;
    localObject2 = paramJSONObject.optJSONObject("settings");
    label459:
    boolean bool3;
    if (localObject2 != null)
    {
      l2 = ((JSONObject)localObject2).optLong("ad_network_timeout_millis", l1);
      b = l2;
      w.x();
      localObject1 = nx.a((JSONObject)localObject2, "click_urls");
      c = ((List)localObject1);
      w.x();
      localObject1 = nx.a((JSONObject)localObject2, "imp_urls");
      d = ((List)localObject1);
      w.x();
      localObject1 = nx.a((JSONObject)localObject2, "nofill_urls");
      e = ((List)localObject1);
      w.x();
      localObject1 = nx.a((JSONObject)localObject2, "remote_ping_urls");
      f = ((List)localObject1);
      boolean bool4 = ((JSONObject)localObject2).optBoolean("render_in_browser", false);
      g = bool4;
      localObject1 = "refresh";
      l2 = ((JSONObject)localObject2).optLong((String)localObject1, l1);
      long l3 = 0L;
      boolean bool1 = l2 < l3;
      if (bool1)
      {
        l1 = 1000L;
        l2 *= l1;
        i = l2;
        localObject1 = ss.a(((JSONObject)localObject2).optJSONArray("rewards"));
        if (localObject1 != null) {
          break label503;
        }
        j = null;
        k = 0;
        bool4 = ((JSONObject)localObject2).optBoolean("use_displayed_impression", false);
        n = bool4;
        localObject1 = "allow_pub_rendered_attribution";
        bool3 = ((JSONObject)localObject2).optBoolean((String)localObject1, false);
      }
    }
    for (o = bool3;; o = false)
    {
      return;
      l2 = l1;
      break;
      label503:
      String str = a;
      j = str;
      int i5 = b;
      k = i5;
      break label459;
      b = l1;
      c = null;
      d = null;
      e = null;
      f = null;
      i = l1;
      j = null;
      k = 0;
      n = false;
      g = false;
    }
  }
  
  private static boolean a(nr paramnr)
  {
    Object localObject = c;
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = "com.google.ads.mediation.admob.AdMobAdapter";
      bool = ((String)localObject).equals(str);
    } while (!bool);
    boolean bool = true;
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              com/google/android/gms/b/ns.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */