package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.google.android.gms.ads.c.a.a;
import com.google.android.gms.ads.internal.w;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ri
{
  private static final SimpleDateFormat a;
  
  static
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    Locale localLocale = Locale.US;
    localSimpleDateFormat.<init>("yyyyMMdd", localLocale);
    a = localSimpleDateFormat;
  }
  
  public static qr a(Context paramContext, qo paramqo, String paramString)
  {
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      localObject1 = "ad_base_url";
      i = 0;
      localObject3 = null;
      str1 = localJSONObject.optString((String)localObject1, null);
      localObject1 = "ad_url";
      i = 0;
      localObject3 = null;
      localObject4 = localJSONObject.optString((String)localObject1, null);
      localObject1 = "ad_size";
      i = 0;
      localObject3 = null;
      str2 = localJSONObject.optString((String)localObject1, null);
      localObject1 = "ad_slot_size";
      str3 = localJSONObject.optString((String)localObject1, str2);
      if (paramqo == null) {
        break label436;
      }
      int j = m;
      if (j == 0) {
        break label436;
      }
      bool3 = true;
      localObject1 = "ad_json";
      i = 0;
      localObject3 = null;
      localObject3 = localJSONObject.optString((String)localObject1, null);
      if (localObject3 == null)
      {
        localObject1 = "ad_html";
        i = 0;
        localObject3 = null;
        localObject3 = localJSONObject.optString((String)localObject1, null);
      }
      if (localObject3 == null)
      {
        localObject1 = "body";
        i = 0;
        localObject3 = null;
        localObject3 = localJSONObject.optString((String)localObject1, null);
      }
      l1 = -1;
      localObject1 = "debug_dialog";
      bool4 = false;
      localObject5 = null;
      str4 = localJSONObject.optString((String)localObject1, null);
      localObject1 = "debug_signals";
      bool4 = false;
      localObject5 = null;
      str5 = localJSONObject.optString((String)localObject1, null);
      localObject1 = "interstitial_timeout";
      bool2 = localJSONObject.has((String)localObject1);
      if (!bool2) {
        break label442;
      }
      localObject1 = "interstitial_timeout";
      double d1 = localJSONObject.getDouble((String)localObject1);
      l2 = 4652007308841189376L;
      double d2 = 1000.0D;
      d1 *= d2;
      l3 = d1;
      label258:
      localObject1 = "orientation";
      bool4 = false;
      localObject5 = null;
      localObject1 = localJSONObject.optString((String)localObject1, null);
      k = -1;
      localObject5 = "portrait";
      bool4 = ((String)localObject5).equals(localObject1);
      if (!bool4) {
        break label449;
      }
      localObject1 = w.g();
      k = ((tu)localObject1).b();
      label310:
      bool2 = false;
      localObject1 = null;
      bool4 = TextUtils.isEmpty((CharSequence)localObject3);
      if (!bool4) {
        break label1327;
      }
      bool4 = TextUtils.isEmpty((CharSequence)localObject4);
      if (bool4) {
        break label1327;
      }
      localObject1 = k;
      str1 = a;
      bool4 = false;
      localObject5 = null;
      localList1 = null;
      m = 0;
      localObject1 = paramqo;
      localObject3 = paramContext;
      localObject1 = rh.a(paramqo, paramContext, str1, (String)localObject4, null, null, null, null);
      str1 = b;
      localObject4 = c;
      long l4 = n;
      l1 = l4;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        Object localObject1;
        int i;
        String str1;
        String str2;
        String str3;
        boolean bool3;
        long l1;
        boolean bool4;
        Object localObject5;
        String str4;
        String str5;
        boolean bool2;
        long l3;
        int k;
        List localList1;
        int m;
        label436:
        label442:
        label449:
        label505:
        label539:
        List localList2;
        label573:
        boolean bool1;
        Object localObject3 = "Could not parse the inline ad response: ";
        Object localObject2 = String.valueOf(localJSONException.getMessage());
        int i1 = ((String)localObject2).length();
        if (i1 != 0) {
          localObject2 = ((String)localObject3).concat((String)localObject2);
        }
        for (;;)
        {
          tp.e((String)localObject2);
          localObject2 = new com/google/android/gms/b/qr;
          bool1 = false;
          localObject3 = null;
          ((qr)localObject2).<init>(0);
          break;
          label1275:
          localObject5 = d;
          break label505;
          label1285:
          localList1 = f;
          break label539;
          label1295:
          localList2 = j;
          break label573;
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>((String)localObject3);
        }
        label1320:
        long l2 = l3;
        continue;
        label1327:
        Object localObject4 = localObject3;
      }
    }
    if (localObject4 == null)
    {
      localObject1 = new com/google/android/gms/b/qr;
      i = 0;
      localObject3 = null;
      ((qr)localObject1).<init>(0);
    }
    for (;;)
    {
      return (qr)localObject1;
      bool3 = false;
      break;
      l3 = -1;
      break label258;
      localObject5 = "landscape";
      bool2 = ((String)localObject5).equals(localObject1);
      if (!bool2) {
        break label310;
      }
      localObject1 = w.g();
      k = ((tu)localObject1).a();
      break label310;
      localObject3 = "click_urls";
      localObject3 = localJSONObject.optJSONArray((String)localObject3);
      if (localObject1 != null) {
        break label1275;
      }
      bool4 = false;
      localObject5 = null;
      if (localObject3 != null) {
        localObject5 = a((JSONArray)localObject3, (List)localObject5);
      }
      localObject3 = "impression_urls";
      localObject3 = localJSONObject.optJSONArray((String)localObject3);
      if (localObject1 != null) {
        break label1285;
      }
      localList1 = null;
      if (localObject3 != null) {
        localList1 = a((JSONArray)localObject3, localList1);
      }
      localObject3 = "manual_impression_urls";
      localObject3 = localJSONObject.optJSONArray((String)localObject3);
      if (localObject1 != null) {
        break label1295;
      }
      localList2 = null;
      if (localObject3 != null) {
        localList2 = a((JSONArray)localObject3, localList2);
      }
      if (localObject1 == null) {
        break label1320;
      }
      i = l;
      m = -1;
      if (i != m)
      {
        int n = l;
        k = n;
      }
      l2 = g;
      long l5 = 0L;
      bool1 = l2 < l5;
      if (!bool1) {
        break label1320;
      }
      l2 = g;
      localObject1 = "active_view";
      String str6 = localJSONObject.optString((String)localObject1);
      String str7 = null;
      localObject1 = "ad_is_javascript";
      bool1 = false;
      localObject3 = null;
      boolean bool6 = localJSONObject.optBoolean((String)localObject1, false);
      if (bool6)
      {
        localObject1 = "ad_passback_url";
        bool1 = false;
        localObject3 = null;
        str7 = localJSONObject.optString((String)localObject1, null);
      }
      localObject1 = "mediation";
      bool1 = false;
      localObject3 = null;
      boolean bool7 = localJSONObject.optBoolean((String)localObject1, false);
      localObject1 = "custom_render_allowed";
      bool1 = false;
      localObject3 = null;
      boolean bool8 = localJSONObject.optBoolean((String)localObject1, false);
      localObject1 = "content_url_opted_out";
      bool1 = true;
      boolean bool9 = localJSONObject.optBoolean((String)localObject1, bool1);
      localObject1 = "content_vertical_opted_out";
      bool1 = true;
      boolean bool10 = localJSONObject.optBoolean((String)localObject1, bool1);
      localObject1 = "prefetch";
      bool1 = false;
      localObject3 = null;
      boolean bool11 = localJSONObject.optBoolean((String)localObject1, false);
      localObject1 = "refresh_interval_milliseconds";
      l5 = -1;
      l5 = localJSONObject.optLong((String)localObject1, l5);
      localObject1 = "mediation_config_cache_time_milliseconds";
      long l6 = -1;
      long l7 = localJSONObject.optLong((String)localObject1, l6);
      localObject1 = "gws_query_id";
      localObject3 = "";
      String str8 = localJSONObject.optString((String)localObject1, (String)localObject3);
      localObject1 = "height";
      localObject3 = "fluid";
      String str9 = "";
      localObject3 = localJSONObject.optString((String)localObject3, str9);
      boolean bool12 = ((String)localObject1).equals(localObject3);
      localObject1 = "native_express";
      bool1 = false;
      localObject3 = null;
      boolean bool13 = localJSONObject.optBoolean((String)localObject1, false);
      localObject1 = "video_start_urls";
      localObject1 = localJSONObject.optJSONArray((String)localObject1);
      bool1 = false;
      localObject3 = null;
      List localList3 = a((JSONArray)localObject1, null);
      localObject1 = "video_complete_urls";
      localObject1 = localJSONObject.optJSONArray((String)localObject1);
      bool1 = false;
      localObject3 = null;
      List localList4 = a((JSONArray)localObject1, null);
      localObject1 = "rewards";
      localObject1 = localJSONObject.optJSONArray((String)localObject1);
      ss localss = ss.a((JSONArray)localObject1);
      localObject1 = "use_displayed_impression";
      bool1 = false;
      localObject3 = null;
      boolean bool14 = localJSONObject.optBoolean((String)localObject1, false);
      localObject1 = "auto_protection_configuration";
      localObject1 = localJSONObject.optJSONObject((String)localObject1);
      qt localqt = qt.a((JSONObject)localObject1);
      localObject1 = "set_cookie";
      localObject3 = "";
      String str10 = localJSONObject.optString((String)localObject1, (String)localObject3);
      localObject1 = "remote_ping_urls";
      localObject1 = localJSONObject.optJSONArray((String)localObject1);
      bool1 = false;
      localObject3 = null;
      List localList5 = a((JSONArray)localObject1, null);
      localObject1 = "safe_browsing";
      localObject1 = localJSONObject.optJSONObject((String)localObject1);
      sv localsv = sv.a((JSONObject)localObject1);
      localObject1 = "render_in_browser";
      bool1 = L;
      boolean bool15 = localJSONObject.optBoolean((String)localObject1, bool1);
      localObject1 = new com/google/android/gms/b/qr;
      boolean bool5 = p;
      boolean bool16 = bool5;
      bool5 = H;
      boolean bool17 = bool5;
      bool5 = V;
      localObject3 = paramqo;
      ((qr)localObject1).<init>(paramqo, str1, (String)localObject4, (List)localObject5, localList1, l2, bool7, l7, localList2, l5, k, str2, l1, str4, bool6, str7, str6, bool8, bool3, bool16, bool9, bool11, str8, bool12, bool13, localss, localList3, localList4, bool14, localqt, bool17, str10, localList5, bool15, str3, localsv, str5, bool10, bool5);
    }
  }
  
  private static Integer a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return Integer.valueOf(i);
    }
  }
  
  private static String a(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(0xFFFFFF & paramInt);
    arrayOfObject[0] = localInteger;
    return String.format(localLocale, "#%06x", arrayOfObject);
  }
  
  private static List a(JSONArray paramJSONArray, List paramList)
  {
    if (paramJSONArray == null)
    {
      paramList = null;
      return paramList;
    }
    if (paramList == null)
    {
      paramList = new java/util/LinkedList;
      paramList.<init>();
    }
    int i = 0;
    for (;;)
    {
      int j = paramJSONArray.length();
      if (i >= j) {
        break;
      }
      String str = paramJSONArray.getString(i);
      paramList.add(str);
      i += 1;
    }
  }
  
  private static JSONArray a(List paramList)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      localJSONArray.put(str);
    }
    return localJSONArray;
  }
  
  public static JSONObject a(Context paramContext, rf paramrf)
  {
    qo localqo = i;
    Object localObject1 = d;
    Object localObject2 = j;
    Bundle localBundle = a;
    JSONObject localJSONObject = k;
    HashMap localHashMap;
    Object localObject5;
    Object localObject6;
    long l2;
    double d;
    Object localObject7;
    int i11;
    float f1;
    label953:
    label1551:
    int n;
    float f2;
    Object localObject8;
    label1718:
    String str2;
    int i15;
    int i25;
    Object localObject9;
    boolean bool29;
    boolean bool27;
    label1996:
    label1998:
    float f3;
    label2151:
    Object localObject4;
    try
    {
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      Object localObject3 = "extra_caps";
      localObject5 = ke.bY;
      localObject6 = w.q();
      localObject5 = ((kd)localObject6).a((jz)localObject5);
      localHashMap.put(localObject3, localObject5);
      localObject3 = c;
      int i = ((List)localObject3).size();
      if (i > 0)
      {
        localObject3 = "eid";
        localObject5 = ",";
        localObject6 = c;
        localObject5 = TextUtils.join((CharSequence)localObject5, (Iterable)localObject6);
        localHashMap.put(localObject3, localObject5);
      }
      localObject3 = b;
      if (localObject3 != null)
      {
        localObject3 = "ad_pos";
        localObject5 = b;
        localHashMap.put(localObject3, localObject5);
      }
      localObject5 = c;
      localObject3 = tn.a();
      if (localObject3 != null)
      {
        localObject6 = "abf";
        localHashMap.put(localObject6, localObject3);
      }
      long l1 = b;
      l2 = -1;
      d = 0.0D / 0.0D;
      boolean bool1 = l1 < l2;
      if (bool1)
      {
        localObject3 = "cust_age";
        localObject6 = a;
        localObject7 = new java/util/Date;
        l1 = b;
        ((Date)localObject7).<init>(l1);
        localObject6 = ((SimpleDateFormat)localObject6).format((Date)localObject7);
        localHashMap.put(localObject3, localObject6);
      }
      localObject3 = c;
      if (localObject3 != null)
      {
        localObject3 = "extras";
        localObject6 = c;
        localHashMap.put(localObject3, localObject6);
      }
      int j = d;
      i11 = -1;
      if (j != i11)
      {
        localObject3 = "cust_gender";
        i11 = d;
        localObject6 = Integer.valueOf(i11);
        localHashMap.put(localObject3, localObject6);
      }
      localObject3 = e;
      if (localObject3 != null)
      {
        localObject3 = "kw";
        localObject6 = e;
        localHashMap.put(localObject3, localObject6);
      }
      j = g;
      i11 = -1;
      if (j != i11)
      {
        localObject3 = "tag_for_child_directed_treatment";
        i11 = g;
        localObject6 = Integer.valueOf(i11);
        localHashMap.put(localObject3, localObject6);
      }
      boolean bool2 = f;
      if (bool2)
      {
        localObject3 = "adtest";
        localObject6 = "on";
        localHashMap.put(localObject3, localObject6);
      }
      int k = a;
      i11 = 2;
      int m;
      int i12;
      if (k >= i11)
      {
        boolean bool3 = h;
        if (bool3)
        {
          localObject3 = "d_imp_hdr";
          i11 = 1;
          localObject6 = Integer.valueOf(i11);
          localHashMap.put(localObject3, localObject6);
        }
        localObject3 = i;
        bool3 = TextUtils.isEmpty((CharSequence)localObject3);
        if (!bool3)
        {
          localObject3 = "ppid";
          localObject6 = i;
          localHashMap.put(localObject3, localObject6);
        }
        localObject3 = j;
        if (localObject3 != null)
        {
          localObject6 = j;
          m = a;
          m = Color.alpha(m);
          if (m != 0)
          {
            localObject3 = "acolor";
            i12 = a;
            localObject7 = a(i12);
            localHashMap.put(localObject3, localObject7);
          }
          m = b;
          m = Color.alpha(m);
          if (m != 0)
          {
            localObject3 = "bgcolor";
            i12 = b;
            localObject7 = a(i12);
            localHashMap.put(localObject3, localObject7);
          }
          m = c;
          m = Color.alpha(m);
          if (m != 0)
          {
            m = d;
            m = Color.alpha(m);
            if (m != 0)
            {
              localObject3 = "gradientto";
              i12 = c;
              localObject7 = a(i12);
              localHashMap.put(localObject3, localObject7);
              localObject3 = "gradientfrom";
              i12 = d;
              localObject7 = a(i12);
              localHashMap.put(localObject3, localObject7);
            }
          }
          m = e;
          m = Color.alpha(m);
          if (m != 0)
          {
            localObject3 = "bcolor";
            i12 = e;
            localObject7 = a(i12);
            localHashMap.put(localObject3, localObject7);
          }
          localObject3 = "bthick";
          i12 = f;
          localObject7 = Integer.toString(i12);
          localHashMap.put(localObject3, localObject7);
          m = g;
        }
      }
      switch (m)
      {
      default: 
        m = 0;
        f1 = 0.0F;
        localObject3 = null;
        if (localObject3 != null)
        {
          localObject7 = "btype";
          localHashMap.put(localObject7, localObject3);
        }
        m = h;
        switch (m)
        {
        default: 
          m = 0;
          f1 = 0.0F;
          localObject3 = null;
          if (localObject3 != null)
          {
            localObject7 = "callbuttoncolor";
            localHashMap.put(localObject7, localObject3);
          }
          localObject3 = i;
          if (localObject3 != null)
          {
            localObject3 = "channel";
            localObject7 = i;
            localHashMap.put(localObject3, localObject7);
          }
          m = j;
          m = Color.alpha(m);
          if (m != 0)
          {
            localObject3 = "dcolor";
            i12 = j;
            localObject7 = a(i12);
            localHashMap.put(localObject3, localObject7);
          }
          localObject3 = k;
          if (localObject3 != null)
          {
            localObject3 = "font";
            localObject7 = k;
            localHashMap.put(localObject3, localObject7);
          }
          m = l;
          m = Color.alpha(m);
          if (m != 0)
          {
            localObject3 = "hcolor";
            i12 = l;
            localObject7 = a(i12);
            localHashMap.put(localObject3, localObject7);
          }
          localObject3 = "headersize";
          i12 = m;
          localObject7 = Integer.toString(i12);
          localHashMap.put(localObject3, localObject7);
          localObject3 = n;
          if (localObject3 != null)
          {
            localObject3 = "q";
            localObject6 = n;
            localHashMap.put(localObject3, localObject6);
          }
          m = a;
          i11 = 3;
          if (m >= i11)
          {
            localObject3 = l;
            if (localObject3 != null)
            {
              localObject3 = "url";
              localObject6 = l;
              localHashMap.put(localObject3, localObject6);
            }
          }
          m = a;
          i11 = 5;
          if (m >= i11)
          {
            localObject3 = n;
            if (localObject3 != null)
            {
              localObject3 = "custom_targeting";
              localObject6 = n;
              localHashMap.put(localObject3, localObject6);
            }
            localObject3 = o;
            if (localObject3 != null)
            {
              localObject3 = "category_exclusions";
              localObject6 = o;
              localHashMap.put(localObject3, localObject6);
            }
            localObject3 = p;
            if (localObject3 != null)
            {
              localObject3 = "request_agent";
              localObject6 = p;
              localHashMap.put(localObject3, localObject6);
            }
          }
          m = a;
          i11 = 6;
          if (m >= i11)
          {
            localObject3 = q;
            if (localObject3 != null)
            {
              localObject3 = "request_pkg";
              localObject6 = q;
              localHashMap.put(localObject3, localObject6);
            }
          }
          m = a;
          i11 = 7;
          if (m >= i11)
          {
            localObject3 = "is_designed_for_families";
            boolean bool17 = r;
            localObject5 = Boolean.valueOf(bool17);
            localHashMap.put(localObject3, localObject5);
          }
          localObject3 = d;
          localObject3 = g;
          if (localObject3 == null)
          {
            localObject3 = "format";
            localObject5 = d;
            localObject5 = a;
            localHashMap.put(localObject3, localObject5);
            localObject3 = d;
            boolean bool4 = i;
            if (bool4)
            {
              localObject3 = "fluid";
              localObject5 = "height";
              localHashMap.put(localObject3, localObject5);
            }
            localObject3 = d;
            n = e;
            int i14 = -1;
            f2 = 0.0F / 0.0F;
            if (n == i14)
            {
              localObject3 = "smart_w";
              localObject5 = "full";
              localHashMap.put(localObject3, localObject5);
            }
            localObject3 = d;
            n = b;
            i14 = -2;
            f2 = 0.0F / 0.0F;
            if (n == i14)
            {
              localObject3 = "smart_h";
              localObject5 = "auto";
              localHashMap.put(localObject3, localObject5);
            }
            localObject3 = d;
            localObject3 = g;
            if (localObject3 == null) {
              break label2315;
            }
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            i14 = 0;
            f2 = 0.0F;
            localObject5 = null;
            localObject3 = d;
            localObject8 = g;
            int i24 = localObject8.length;
            i11 = 0;
            localObject6 = null;
            n = 0;
            localObject3 = null;
            f1 = 0.0F;
            if (i11 >= i24) {
              break label2237;
            }
            str2 = localObject8[i11];
            boolean bool18 = i;
            if (!bool18) {
              break label1998;
            }
            n = 1;
            f1 = Float.MIN_VALUE;
          }
          break;
        }
        break;
      }
      for (;;)
      {
        i15 = i11 + 1;
        i11 = i15;
        break label1718;
        localObject3 = "none";
        break;
        localObject3 = "dashed";
        break;
        localObject3 = "dotted";
        break;
        localObject3 = "solid";
        break;
        localObject3 = "dark";
        break label953;
        localObject3 = "light";
        break label953;
        localObject3 = "medium";
        break label953;
        i11 = 0;
        localObject6 = null;
        i15 = 0;
        f2 = 0.0F;
        localObject5 = null;
        localObject3 = d;
        localObject7 = g;
        i25 = localObject7.length;
        n = 0;
        localObject3 = null;
        f1 = 0.0F;
        i15 = 0;
        localObject5 = null;
        f2 = 0.0F;
        i11 = 0;
        localObject6 = null;
        for (;;)
        {
          if (i11 >= i25) {
            break label1996;
          }
          localObject9 = localObject7[i11];
          bool29 = i;
          if ((!bool29) && (i15 == 0))
          {
            localObject5 = "format";
            str2 = a;
            localHashMap.put(localObject5, str2);
            i15 = 1;
            f2 = Float.MIN_VALUE;
          }
          bool27 = i;
          if ((bool27) && (n == 0))
          {
            localObject3 = "fluid";
            localObject9 = "height";
            localHashMap.put(localObject3, localObject9);
            n = 1;
            f1 = Float.MIN_VALUE;
          }
          if ((i15 != 0) && (n != 0)) {
            break;
          }
          i11 += 1;
        }
        break label1551;
        i15 = ((StringBuilder)localObject7).length();
        if (i15 != 0)
        {
          localObject5 = "|";
          ((StringBuilder)localObject7).append((String)localObject5);
        }
        i15 = e;
        int i31 = -1;
        f3 = 0.0F / 0.0F;
        if (i15 != i31) {
          break label2217;
        }
        i15 = f;
        f2 = i15;
        f3 = r;
        f2 /= f3;
        i15 = (int)f2;
        ((StringBuilder)localObject7).append(i15);
        localObject5 = "x";
        ((StringBuilder)localObject7).append((String)localObject5);
        i15 = b;
        int i32 = -2;
        f3 = 0.0F / 0.0F;
        if (i15 != i32) {
          break label2227;
        }
        i15 = c;
        f2 = i15;
        float f4 = r;
        f2 /= f4;
        i15 = (int)f2;
        ((StringBuilder)localObject7).append(i15);
      }
      localObject4 = ((String)localObject5).concat((String)localObject4);
    }
    catch (JSONException localJSONException1)
    {
      localObject5 = "Problem serializing ad request to JSON: ";
      localObject4 = String.valueOf(localJSONException1.getMessage());
      i11 = ((String)localObject4).length();
      if (i11 == 0) {}
    }
    for (;;)
    {
      tp.e((String)localObject4);
      n = 0;
      f1 = 0.0F;
      localObject4 = null;
      return (JSONObject)localObject4;
      label2217:
      i15 = e;
      break;
      label2227:
      i15 = b;
      break label2151;
      label2237:
      if (n != 0)
      {
        n = ((StringBuilder)localObject7).length();
        if (n != 0)
        {
          n = 0;
          f1 = 0.0F;
          localObject4 = null;
          localObject5 = "|";
          ((StringBuilder)localObject7).insert(0, (String)localObject5);
        }
        n = 0;
        f1 = 0.0F;
        localObject4 = null;
        localObject5 = "320x50";
        ((StringBuilder)localObject7).insert(0, (String)localObject5);
      }
      localObject4 = "sz";
      localHashMap.put(localObject4, localObject7);
      label2315:
      n = m;
      label2398:
      label2429:
      label4370:
      label4435:
      int i3;
      int i17;
      if (n != 0)
      {
        localObject4 = "native_version";
        i15 = m;
        localObject5 = Integer.valueOf(i15);
        localHashMap.put(localObject4, localObject5);
        localObject4 = "native_templates";
        localObject5 = n;
        localHashMap.put(localObject4, localObject5);
        localObject5 = "native_image_orientation";
        localObject4 = y;
        if (localObject4 != null) {
          n = c;
        }
      }
      else
      {
        switch (n)
        {
        default: 
          localObject4 = "any";
          localHashMap.put(localObject5, localObject4);
          localObject4 = z;
          boolean bool5 = ((List)localObject4).isEmpty();
          if (!bool5)
          {
            localObject4 = "native_custom_templates";
            localObject5 = z;
            localHashMap.put(localObject4, localObject5);
          }
          localObject4 = d;
          bool5 = j;
          if (bool5)
          {
            localObject4 = "ene";
            i15 = 1;
            f2 = Float.MIN_VALUE;
            localObject5 = Boolean.valueOf(i15);
            localHashMap.put(localObject4, localObject5);
          }
          localObject4 = P;
          int i16;
          if (localObject4 != null)
          {
            localObject4 = "is_icon_ad";
            boolean bool19 = true;
            f2 = Float.MIN_VALUE;
            localObject5 = Boolean.valueOf(bool19);
            localHashMap.put(localObject4, localObject5);
            localObject4 = "icon_ad_expansion_behavior";
            localObject5 = P;
            i16 = a;
            localObject5 = Integer.valueOf(i16);
            localHashMap.put(localObject4, localObject5);
          }
          localObject4 = "slotname";
          localObject5 = e;
          localHashMap.put(localObject4, localObject5);
          localObject4 = "pn";
          localObject5 = f;
          localObject5 = packageName;
          localHashMap.put(localObject4, localObject5);
          localObject4 = g;
          if (localObject4 != null)
          {
            localObject4 = "vc";
            localObject5 = g;
            i16 = versionCode;
            localObject5 = Integer.valueOf(i16);
            localHashMap.put(localObject4, localObject5);
          }
          localObject4 = "ms";
          localObject5 = g;
          localHashMap.put(localObject4, localObject5);
          localObject4 = "seq_num";
          localObject5 = i;
          localHashMap.put(localObject4, localObject5);
          localObject4 = "session_id";
          localObject5 = j;
          localHashMap.put(localObject4, localObject5);
          localObject4 = "js";
          localObject5 = k;
          localObject5 = a;
          localHashMap.put(localObject4, localObject5);
          localObject4 = e;
          localObject5 = N;
          localObject6 = b;
          localObject7 = "am";
          i25 = a;
          localObject8 = Integer.valueOf(i25);
          localHashMap.put(localObject7, localObject8);
          localObject7 = "cog";
          int i26 = b;
          localObject8 = a(i26);
          localHashMap.put(localObject7, localObject8);
          localObject7 = "coh";
          i26 = c;
          localObject8 = a(i26);
          localHashMap.put(localObject7, localObject8);
          localObject7 = d;
          boolean bool15 = TextUtils.isEmpty((CharSequence)localObject7);
          if (!bool15)
          {
            localObject7 = "carrier";
            localObject8 = d;
            localHashMap.put(localObject7, localObject8);
          }
          localObject7 = "gl";
          localObject8 = e;
          localHashMap.put(localObject7, localObject8);
          bool15 = f;
          if (bool15)
          {
            localObject7 = "simulator";
            i26 = 1;
            localObject8 = Integer.valueOf(i26);
            localHashMap.put(localObject7, localObject8);
          }
          bool15 = g;
          if (bool15)
          {
            localObject7 = "is_sidewinder";
            int i27 = 1;
            localObject8 = Integer.valueOf(i27);
            localHashMap.put(localObject7, localObject8);
          }
          localObject7 = "ma";
          boolean bool28 = h;
          localObject8 = a(bool28);
          localHashMap.put(localObject7, localObject8);
          localObject7 = "sp";
          bool28 = i;
          localObject8 = a(bool28);
          localHashMap.put(localObject7, localObject8);
          localObject7 = "hl";
          localObject8 = j;
          localHashMap.put(localObject7, localObject8);
          localObject7 = k;
          bool15 = TextUtils.isEmpty((CharSequence)localObject7);
          if (!bool15)
          {
            localObject7 = "mv";
            localObject8 = k;
            localHashMap.put(localObject7, localObject8);
          }
          localObject7 = "muv";
          int i28 = l;
          localObject8 = Integer.valueOf(i28);
          localHashMap.put(localObject7, localObject8);
          int i13 = m;
          i28 = -2;
          if (i13 != i28)
          {
            localObject7 = "cnt";
            i28 = m;
            localObject8 = Integer.valueOf(i28);
            localHashMap.put(localObject7, localObject8);
          }
          localObject7 = "gnt";
          i28 = n;
          localObject8 = Integer.valueOf(i28);
          localHashMap.put(localObject7, localObject8);
          localObject7 = "pt";
          i28 = o;
          localObject8 = Integer.valueOf(i28);
          localHashMap.put(localObject7, localObject8);
          localObject7 = "rm";
          i28 = p;
          localObject8 = Integer.valueOf(i28);
          localHashMap.put(localObject7, localObject8);
          localObject7 = "riv";
          i28 = q;
          localObject8 = Integer.valueOf(i28);
          localHashMap.put(localObject7, localObject8);
          localObject7 = new android/os/Bundle;
          ((Bundle)localObject7).<init>();
          localObject8 = "build";
          localObject9 = y;
          ((Bundle)localObject7).putString((String)localObject8, (String)localObject9);
          localObject8 = new android/os/Bundle;
          ((Bundle)localObject8).<init>();
          localObject9 = "is_charging";
          bool29 = v;
          ((Bundle)localObject8).putBoolean((String)localObject9, bool29);
          localObject9 = "battery_level";
          d = u;
          ((Bundle)localObject8).putDouble((String)localObject9, d);
          localObject9 = "battery";
          ((Bundle)localObject7).putBundle((String)localObject9, (Bundle)localObject8);
          localObject8 = new android/os/Bundle;
          ((Bundle)localObject8).<init>();
          localObject9 = "active_network_state";
          int i29 = x;
          ((Bundle)localObject8).putInt((String)localObject9, i29);
          localObject9 = "active_network_metered";
          boolean bool30 = w;
          ((Bundle)localObject8).putBoolean((String)localObject9, bool30);
          int i33;
          long l3;
          long l4;
          if (localObject4 != null)
          {
            localObject9 = new android/os/Bundle;
            ((Bundle)localObject9).<init>();
            str2 = "predicted_latency_micros";
            i33 = a;
            ((Bundle)localObject9).putInt(str2, i33);
            str2 = "predicted_down_throughput_bps";
            l3 = b;
            l4 = l3;
            ((Bundle)localObject9).putLong(str2, l3);
            str2 = "predicted_up_throughput_bps";
            l3 = c;
            l4 = l3;
            ((Bundle)localObject9).putLong(str2, l3);
            localObject4 = "predictions";
            ((Bundle)localObject8).putBundle((String)localObject4, (Bundle)localObject9);
          }
          localObject4 = "network";
          ((Bundle)localObject7).putBundle((String)localObject4, (Bundle)localObject8);
          localObject4 = new android/os/Bundle;
          ((Bundle)localObject4).<init>();
          localObject8 = "is_browser_custom_tabs_capable";
          bool27 = z;
          ((Bundle)localObject4).putBoolean((String)localObject8, bool27);
          localObject8 = "browser";
          ((Bundle)localObject7).putBundle((String)localObject8, (Bundle)localObject4);
          if (localObject5 != null)
          {
            localObject8 = "android_mem_info";
            localObject9 = new android/os/Bundle;
            ((Bundle)localObject9).<init>();
            localObject4 = "runtime_free";
            str2 = "runtime_free_memory";
            l4 = -1;
            l3 = l4;
            l2 = ((Bundle)localObject5).getLong(str2, l4);
            str2 = Long.toString(l2);
            ((Bundle)localObject9).putString((String)localObject4, str2);
            localObject4 = "runtime_max";
            str2 = "runtime_max_memory";
            l4 = -1;
            l3 = l4;
            l2 = ((Bundle)localObject5).getLong(str2, l4);
            str2 = Long.toString(l2);
            ((Bundle)localObject9).putString((String)localObject4, str2);
            localObject4 = "runtime_total";
            str2 = "runtime_total_memory";
            l4 = -1;
            l3 = l4;
            l2 = ((Bundle)localObject5).getLong(str2, l4);
            str2 = Long.toString(l2);
            ((Bundle)localObject9).putString((String)localObject4, str2);
            localObject4 = "web_view_count";
            str2 = "web_view_count";
            i33 = 0;
            f3 = 0.0F;
            int i30 = ((Bundle)localObject5).getInt(str2, 0);
            str2 = Integer.toString(i30);
            ((Bundle)localObject9).putString((String)localObject4, str2);
            localObject4 = "debug_memory_info";
            localObject4 = ((Bundle)localObject5).getParcelable((String)localObject4);
            localObject4 = (Debug.MemoryInfo)localObject4;
            if (localObject4 != null)
            {
              localObject5 = "debug_info_dalvik_private_dirty";
              i30 = dalvikPrivateDirty;
              str2 = Integer.toString(i30);
              ((Bundle)localObject9).putString((String)localObject5, str2);
              localObject5 = "debug_info_dalvik_pss";
              i30 = dalvikPss;
              str2 = Integer.toString(i30);
              ((Bundle)localObject9).putString((String)localObject5, str2);
              localObject5 = "debug_info_dalvik_shared_dirty";
              i30 = dalvikSharedDirty;
              str2 = Integer.toString(i30);
              ((Bundle)localObject9).putString((String)localObject5, str2);
              localObject5 = "debug_info_native_private_dirty";
              i30 = nativePrivateDirty;
              str2 = Integer.toString(i30);
              ((Bundle)localObject9).putString((String)localObject5, str2);
              localObject5 = "debug_info_native_pss";
              i30 = nativePss;
              str2 = Integer.toString(i30);
              ((Bundle)localObject9).putString((String)localObject5, str2);
              localObject5 = "debug_info_native_shared_dirty";
              i30 = nativeSharedDirty;
              str2 = Integer.toString(i30);
              ((Bundle)localObject9).putString((String)localObject5, str2);
              localObject5 = "debug_info_other_private_dirty";
              i30 = otherPrivateDirty;
              str2 = Integer.toString(i30);
              ((Bundle)localObject9).putString((String)localObject5, str2);
              localObject5 = "debug_info_other_pss";
              i30 = otherPss;
              str2 = Integer.toString(i30);
              ((Bundle)localObject9).putString((String)localObject5, str2);
              localObject5 = "debug_info_other_shared_dirty";
              int i1 = otherSharedDirty;
              localObject4 = Integer.toString(i1);
              ((Bundle)localObject9).putString((String)localObject5, (String)localObject4);
            }
            ((Bundle)localObject7).putBundle((String)localObject8, (Bundle)localObject9);
          }
          localObject4 = new android/os/Bundle;
          ((Bundle)localObject4).<init>();
          localObject5 = "parental_controls";
          ((Bundle)localObject4).putBundle((String)localObject5, (Bundle)localObject6);
          localObject5 = "play_store";
          ((Bundle)localObject7).putBundle((String)localObject5, (Bundle)localObject4);
          localObject4 = "device";
          localHashMap.put(localObject4, localObject7);
          localObject6 = new android/os/Bundle;
          ((Bundle)localObject6).<init>();
          localObject4 = "doritos";
          localObject5 = f;
          ((Bundle)localObject6).putString((String)localObject4, (String)localObject5);
          localObject4 = ke.aM;
          localObject5 = w.q();
          localObject4 = ((kd)localObject5).a((jz)localObject4);
          localObject4 = (Boolean)localObject4;
          boolean bool6 = ((Boolean)localObject4).booleanValue();
          if (bool6)
          {
            i16 = 0;
            f2 = 0.0F;
            localObject5 = null;
            bool6 = false;
            f1 = 0.0F;
            localObject4 = null;
            localObject7 = h;
            if (localObject7 != null)
            {
              localObject4 = h;
              localObject5 = a;
              localObject4 = h;
              bool6 = b;
            }
            boolean bool16 = TextUtils.isEmpty((CharSequence)localObject5);
            if (!bool16)
            {
              localObject7 = "rdid";
              ((Bundle)localObject6).putString((String)localObject7, (String)localObject5);
              localObject5 = "is_lat";
              ((Bundle)localObject6).putBoolean((String)localObject5, bool6);
              localObject4 = "idtype";
              localObject5 = "adid";
              ((Bundle)localObject6).putString((String)localObject4, (String)localObject5);
            }
          }
          else
          {
            localObject4 = "pii";
            localHashMap.put(localObject4, localObject6);
            localObject4 = "platform";
            localObject5 = Build.MANUFACTURER;
            localHashMap.put(localObject4, localObject5);
            localObject4 = "submodel";
            localObject5 = Build.MODEL;
            localHashMap.put(localObject4, localObject5);
            if (localObject1 == null) {
              break label6181;
            }
            a(localHashMap, (Location)localObject1);
            int i2 = a;
            i16 = 2;
            f2 = 2.8E-45F;
            if (i2 >= i16)
            {
              localObject4 = "quality_signals";
              localObject5 = l;
              localHashMap.put(localObject4, localObject5);
            }
            i2 = a;
            i16 = 4;
            f2 = 5.6E-45F;
            if (i2 >= i16)
            {
              boolean bool7 = p;
              if (bool7)
              {
                localObject4 = "forceHttps";
                boolean bool20 = p;
                localObject5 = Boolean.valueOf(bool20);
                localHashMap.put(localObject4, localObject5);
              }
            }
            if (localBundle != null)
            {
              localObject4 = "content_info";
              localHashMap.put(localObject4, localBundle);
            }
            i3 = a;
            i17 = 5;
            f2 = 7.0E-45F;
            if (i3 < i17) {
              break label6250;
            }
            localObject4 = "u_sd";
            f2 = s;
            localObject5 = Float.valueOf(f2);
            localHashMap.put(localObject4, localObject5);
            localObject4 = "sh";
            i17 = r;
            localObject5 = Integer.valueOf(i17);
            localHashMap.put(localObject4, localObject5);
            localObject4 = "sw";
            i17 = q;
            localObject5 = Integer.valueOf(i17);
            localHashMap.put(localObject4, localObject5);
          }
          break;
        }
      }
      for (;;)
      {
        i3 = a;
        i17 = 6;
        f2 = 8.4E-45F;
        if (i3 >= i17)
        {
          localObject4 = t;
          boolean bool8 = TextUtils.isEmpty((CharSequence)localObject4);
          if (!bool8) {
            localObject4 = "view_hierarchy";
          }
        }
        try
        {
          localObject5 = new org/json/JSONObject;
          localObject6 = t;
          ((JSONObject)localObject5).<init>((String)localObject6);
          localHashMap.put(localObject4, localObject5);
        }
        catch (JSONException localJSONException2)
        {
          for (;;)
          {
            long l5;
            int i4;
            boolean bool31;
            boolean bool21;
            int i18;
            boolean bool9;
            int i5;
            boolean bool22;
            int i19;
            boolean bool23;
            int i20;
            boolean bool10;
            localObject5 = "Problem serializing view hierarchy to JSON";
            tp.c((String)localObject5, localJSONException2);
            continue;
            i10 = F;
          }
        }
        localObject4 = "correlation_id";
        l5 = u;
        localObject5 = Long.valueOf(l5);
        localHashMap.put(localObject4, localObject5);
        i4 = a;
        i17 = 7;
        f2 = 9.8E-45F;
        if (i4 >= i17)
        {
          localObject4 = "request_id";
          localObject5 = v;
          localHashMap.put(localObject4, localObject5);
        }
        i4 = a;
        i17 = 11;
        f2 = 1.5E-44F;
        if (i4 >= i17)
        {
          localObject4 = B;
          if (localObject4 != null)
          {
            localObject4 = "capability";
            localObject5 = B;
            localObject6 = new android/os/Bundle;
            ((Bundle)localObject6).<init>();
            localObject1 = "iap_supported";
            bool31 = a;
            ((Bundle)localObject6).putBoolean((String)localObject1, bool31);
            localObject1 = "default_iap_supported";
            bool31 = b;
            ((Bundle)localObject6).putBoolean((String)localObject1, bool31);
            localObject1 = "app_streaming_supported";
            bool21 = c;
            ((Bundle)localObject6).putBoolean((String)localObject1, bool21);
            localHashMap.put(localObject4, localObject6);
          }
        }
        i4 = a;
        i18 = 12;
        f2 = 1.7E-44F;
        if (i4 >= i18)
        {
          localObject4 = C;
          bool9 = TextUtils.isEmpty((CharSequence)localObject4);
          if (!bool9)
          {
            localObject4 = "anchor";
            localObject5 = C;
            localHashMap.put(localObject4, localObject5);
          }
        }
        i5 = a;
        i18 = 13;
        f2 = 1.8E-44F;
        if (i5 >= i18)
        {
          localObject4 = "android_app_volume";
          f2 = D;
          localObject5 = Float.valueOf(f2);
          localHashMap.put(localObject4, localObject5);
        }
        i5 = a;
        i18 = 18;
        f2 = 2.5E-44F;
        if (i5 >= i18)
        {
          localObject4 = "android_app_muted";
          bool22 = J;
          localObject5 = Boolean.valueOf(bool22);
          localHashMap.put(localObject4, localObject5);
        }
        i5 = a;
        i19 = 14;
        f2 = 2.0E-44F;
        if (i5 >= i19)
        {
          i5 = E;
          if (i5 > 0)
          {
            localObject4 = "target_api";
            i19 = E;
            localObject5 = Integer.valueOf(i19);
            localHashMap.put(localObject4, localObject5);
          }
        }
        i5 = a;
        i19 = 15;
        f2 = 2.1E-44F;
        if (i5 >= i19)
        {
          localObject5 = "scroll_index";
          i5 = F;
          i11 = -1;
          if (i5 != i11) {
            break label6357;
          }
          i5 = -1;
          f1 = 0.0F / 0.0F;
          localObject4 = Integer.valueOf(i5);
          localHashMap.put(localObject5, localObject4);
        }
        i5 = a;
        i19 = 16;
        f2 = 2.24E-44F;
        if (i5 >= i19)
        {
          localObject4 = "_activity_context";
          bool23 = G;
          localObject5 = Boolean.valueOf(bool23);
          localHashMap.put(localObject4, localObject5);
        }
        i5 = a;
        i20 = 18;
        f2 = 2.5E-44F;
        if (i5 >= i20)
        {
          localObject4 = K;
          bool10 = TextUtils.isEmpty((CharSequence)localObject4);
          if (!bool10) {
            localObject4 = "app_settings";
          }
        }
        try
        {
          localObject5 = new org/json/JSONObject;
          localObject6 = K;
          ((JSONObject)localObject5).<init>((String)localObject6);
          localHashMap.put(localObject4, localObject5);
        }
        catch (JSONException localJSONException3)
        {
          for (;;)
          {
            boolean bool24;
            int i6;
            int i21;
            boolean bool11;
            boolean bool32;
            boolean bool25;
            int i7;
            int i22;
            boolean bool12;
            boolean bool26;
            int i8;
            boolean bool13;
            int i9;
            boolean bool14;
            localObject5 = "Problem creating json from app settings";
            tp.c((String)localObject5, localJSONException3);
            continue;
            int i10 = 0;
            f1 = 0.0F;
            str1 = null;
            int i23 = 0;
            localObject5 = null;
            f2 = 0.0F;
            continue;
            i10 = 0;
            f1 = 0.0F;
            str1 = null;
            continue;
            str1 = new java/lang/String;
            str1.<init>((String)localObject5);
          }
        }
        localObject4 = "render_in_browser";
        bool24 = L;
        localObject5 = Boolean.valueOf(bool24);
        localHashMap.put(localObject4, localObject5);
        i6 = a;
        i21 = 18;
        f2 = 2.5E-44F;
        if (i6 >= i21)
        {
          localObject4 = "android_num_video_cache_tasks";
          i21 = M;
          localObject5 = Integer.valueOf(i21);
          localHashMap.put(localObject4, localObject5);
        }
        localObject5 = k;
        localObject6 = new android/os/Bundle;
        ((Bundle)localObject6).<init>();
        localObject4 = new android/os/Bundle;
        ((Bundle)localObject4).<init>();
        localObject1 = "cl";
        localObject2 = "155828604";
        ((Bundle)localObject4).putString((String)localObject1, (String)localObject2);
        localObject1 = "rapid_rc";
        localObject2 = "dev";
        ((Bundle)localObject4).putString((String)localObject1, (String)localObject2);
        localObject1 = "rapid_rollup";
        localObject2 = "HEAD";
        ((Bundle)localObject4).putString((String)localObject1, (String)localObject2);
        localObject1 = "build_meta";
        ((Bundle)localObject6).putBundle((String)localObject1, (Bundle)localObject4);
        localObject1 = "mf";
        localObject4 = ke.ca;
        localObject2 = w.q();
        localObject4 = ((kd)localObject2).a((jz)localObject4);
        localObject4 = (Boolean)localObject4;
        bool11 = ((Boolean)localObject4).booleanValue();
        localObject4 = Boolean.toString(bool11);
        ((Bundle)localObject6).putString((String)localObject1, (String)localObject4);
        localObject4 = "instant_app";
        localObject1 = bc.a(paramContext);
        bool32 = ((bb)localObject1).a();
        ((Bundle)localObject6).putBoolean((String)localObject4, bool32);
        localObject4 = "lite";
        bool25 = e;
        ((Bundle)localObject6).putBoolean((String)localObject4, bool25);
        localObject4 = "sdk_env";
        localHashMap.put(localObject4, localObject6);
        localObject4 = "cache_state";
        localHashMap.put(localObject4, localJSONObject);
        i7 = a;
        i22 = 19;
        f2 = 2.7E-44F;
        if (i7 >= i22)
        {
          localObject4 = "gct";
          localObject5 = O;
          localHashMap.put(localObject4, localObject5);
        }
        i7 = a;
        i22 = 21;
        f2 = 2.9E-44F;
        if (i7 >= i22)
        {
          bool12 = Q;
          if (bool12)
          {
            localObject4 = "de";
            localObject5 = "1";
            localHashMap.put(localObject4, localObject5);
          }
        }
        localObject4 = ke.aW;
        localObject5 = w.q();
        localObject4 = ((kd)localObject5).a((jz)localObject4);
        localObject4 = (Boolean)localObject4;
        bool12 = ((Boolean)localObject4).booleanValue();
        if (bool12)
        {
          localObject4 = d;
          localObject4 = a;
          localObject5 = "interstitial_mb";
          bool26 = ((String)localObject4).equals(localObject5);
          if (!bool26)
          {
            localObject5 = "reward_mb";
            bool12 = ((String)localObject4).equals(localObject5);
            if (!bool12) {
              break label6383;
            }
          }
          bool12 = true;
          f1 = Float.MIN_VALUE;
          bool26 = bool12;
          f2 = f1;
          localObject6 = R;
          if (localObject6 == null) {
            break label6404;
          }
          bool12 = true;
          f1 = Float.MIN_VALUE;
          if ((bool26) && (bool12))
          {
            localObject4 = new android/os/Bundle;
            ((Bundle)localObject4).<init>();
            localObject5 = "interstitial_pool";
            ((Bundle)localObject4).putBundle((String)localObject5, (Bundle)localObject6);
            localObject5 = "counters";
            localHashMap.put(localObject5, localObject4);
          }
        }
        i8 = a;
        i23 = 22;
        f2 = 3.1E-44F;
        if (i8 >= i23)
        {
          localObject4 = w.D();
          bool13 = ((ta)localObject4).a();
          if (bool13)
          {
            localObject4 = "gmp_app_id";
            localObject5 = S;
            localHashMap.put(localObject4, localObject5);
            localObject4 = "fbs_aiid";
            localObject5 = T;
            localHashMap.put(localObject4, localObject5);
            localObject4 = "fbs_aeid";
            localObject5 = U;
            localHashMap.put(localObject4, localObject5);
          }
        }
        i9 = 2;
        f1 = 2.8E-45F;
        bool14 = tp.a(i9);
        if (bool14)
        {
          localObject4 = w.e();
          localObject4 = ((tt)localObject4).a(localHashMap);
          i23 = 2;
          f2 = 2.8E-45F;
          localObject4 = ((JSONObject)localObject4).toString(i23);
          localObject5 = "Ad Request JSON: ";
          localObject4 = String.valueOf(localObject4);
          i11 = ((String)localObject4).length();
          if (i11 == 0) {
            break label6416;
          }
          localObject4 = ((String)localObject5).concat((String)localObject4);
          tp.a((String)localObject4);
        }
        localObject4 = w.e();
        localObject4 = ((tt)localObject4).a(localHashMap);
        break;
        bool14 = false;
        f1 = 0.0F;
        localObject4 = null;
        break label2398;
        localObject4 = "portrait";
        break label2429;
        localObject4 = "landscape";
        break label2429;
        ip.a();
        localObject4 = uk.b(paramContext);
        localObject5 = "pdid";
        ((Bundle)localObject6).putString((String)localObject5, (String)localObject4);
        localObject4 = "pdidtype";
        localObject5 = "ssaid";
        ((Bundle)localObject6).putString((String)localObject4, (String)localObject5);
        break label4370;
        label6181:
        localObject4 = c;
        i10 = a;
        i23 = 2;
        f2 = 2.8E-45F;
        if (i10 < i23) {
          break label4435;
        }
        localObject4 = c;
        localObject4 = k;
        if (localObject4 == null) {
          break label4435;
        }
        localObject4 = c;
        localObject4 = k;
        a(localHashMap, (Location)localObject4);
        break label4435;
        label6250:
        localObject4 = "u_sd";
        f2 = r;
        localObject5 = Float.valueOf(f2);
        localHashMap.put(localObject4, localObject5);
        localObject4 = "sh";
        i23 = t;
        localObject5 = Integer.valueOf(i23);
        localHashMap.put(localObject4, localObject5);
        localObject4 = "sw";
        i23 = s;
        localObject5 = Integer.valueOf(i23);
        localHashMap.put(localObject4, localObject5);
      }
      label6357:
      label6383:
      label6404:
      label6416:
      String str1 = new java/lang/String;
      str1.<init>((String)localObject5);
    }
  }
  
  public static JSONObject a(qr paramqr)
  {
    long l1 = -1;
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    Object localObject1 = b;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = "ad_base_url";
      localObject2 = b;
      localJSONObject1.put((String)localObject1, localObject2);
    }
    localObject1 = paramqr.m;
    if (localObject1 != null)
    {
      localObject1 = "ad_size";
      localObject2 = paramqr.m;
      localJSONObject1.put((String)localObject1, localObject2);
    }
    localObject1 = "native";
    boolean bool1 = t;
    localJSONObject1.put((String)localObject1, bool1);
    boolean bool4 = t;
    label276:
    boolean bool2;
    if (bool4)
    {
      localObject1 = "ad_json";
      localObject2 = c;
      localJSONObject1.put((String)localObject1, localObject2);
      localObject1 = o;
      if (localObject1 != null)
      {
        localObject1 = "debug_dialog";
        localObject2 = o;
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject1 = N;
      if (localObject1 != null)
      {
        localObject1 = "debug_signals";
        localObject2 = N;
        localJSONObject1.put((String)localObject1, localObject2);
      }
      long l2 = g;
      bool4 = l2 < l1;
      if (bool4)
      {
        localObject1 = "interstitial_timeout";
        l2 = g;
        double d1 = l2;
        double d2 = 1000.0D;
        d1 /= d2;
        localJSONObject1.put((String)localObject1, d1);
      }
      int m = l;
      localObject2 = w.g();
      int i = ((tu)localObject2).b();
      if (m != i) {
        break label914;
      }
      localObject1 = "orientation";
      localObject2 = "portrait";
      localJSONObject1.put((String)localObject1, localObject2);
      localObject1 = d;
      if (localObject1 != null)
      {
        localObject1 = "click_urls";
        localObject2 = a(d);
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject1 = f;
      if (localObject1 != null)
      {
        localObject1 = "impression_urls";
        localObject2 = a(f);
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject1 = paramqr.j;
      if (localObject1 != null)
      {
        localObject1 = "manual_impression_urls";
        localObject2 = a(paramqr.j);
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject1 = r;
      if (localObject1 != null)
      {
        localObject1 = "active_view";
        localObject2 = r;
        localJSONObject1.put((String)localObject1, localObject2);
      }
      bool2 = p;
      localJSONObject1.put("ad_is_javascript", bool2);
      localObject1 = q;
      if (localObject1 != null)
      {
        localObject1 = "ad_passback_url";
        localObject2 = q;
        localJSONObject1.put((String)localObject1, localObject2);
      }
      bool2 = h;
      localJSONObject1.put("mediation", bool2);
      bool2 = s;
      localJSONObject1.put("custom_render_allowed", bool2);
      bool2 = v;
      localJSONObject1.put("content_url_opted_out", bool2);
      bool2 = O;
      localJSONObject1.put("content_vertical_opted_out", bool2);
      localObject1 = "prefetch";
      bool2 = w;
      localJSONObject1.put((String)localObject1, bool2);
      l2 = paramqr.k;
      boolean bool5 = l2 < l1;
      if (bool5)
      {
        localObject1 = "refresh_interval_milliseconds";
        l2 = paramqr.k;
        localJSONObject1.put((String)localObject1, l2);
      }
      l2 = paramqr.i;
      bool5 = l2 < l1;
      if (bool5)
      {
        localObject1 = "mediation_config_cache_time_milliseconds";
        l2 = paramqr.i;
        localJSONObject1.put((String)localObject1, l2);
      }
      localObject1 = z;
      bool5 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool5)
      {
        localObject1 = "gws_query_id";
        localObject2 = z;
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject2 = "fluid";
      bool5 = A;
      if (!bool5) {
        break label959;
      }
    }
    label914:
    label959:
    for (localObject1 = "height";; localObject1 = "")
    {
      localJSONObject1.put((String)localObject2, localObject1);
      bool2 = B;
      localJSONObject1.put("native_express", bool2);
      localObject1 = D;
      if (localObject1 != null)
      {
        localObject1 = "video_start_urls";
        localObject2 = a(D);
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject1 = E;
      if (localObject1 != null)
      {
        localObject1 = "video_complete_urls";
        localObject2 = a(E);
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject1 = C;
      if (localObject1 != null)
      {
        localObject1 = "rewards";
        localObject2 = C;
        JSONObject localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        String str1 = a;
        localJSONObject2.put("rb_type", str1);
        String str2 = "rb_amount";
        int j = b;
        localJSONObject2.put(str2, j);
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>();
        ((JSONArray)localObject2).put(localJSONObject2);
        localJSONObject1.put((String)localObject1, localObject2);
      }
      boolean bool3 = F;
      localJSONObject1.put("use_displayed_impression", bool3);
      localObject2 = G;
      localJSONObject1.put("auto_protection_configuration", localObject2);
      bool3 = K;
      localJSONObject1.put("render_in_browser", bool3);
      return localJSONObject1;
      localObject1 = "ad_html";
      localObject2 = c;
      localJSONObject1.put((String)localObject1, localObject2);
      break;
      int n = l;
      localObject2 = w.g();
      int k = ((tu)localObject2).a();
      if (n != k) {
        break label276;
      }
      localObject1 = "orientation";
      localObject2 = "landscape";
      localJSONObject1.put((String)localObject1, localObject2);
      break label276;
    }
  }
  
  private static void a(HashMap paramHashMap, Location paramLocation)
  {
    double d = 1.0E7D;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Float localFloat = Float.valueOf(paramLocation.getAccuracy() * 1000.0F);
    Long localLong1 = Long.valueOf(paramLocation.getTime() * 1000L);
    Long localLong2 = Long.valueOf((paramLocation.getLatitude() * d));
    Long localLong3 = Long.valueOf((paramLocation.getLongitude() * d));
    localHashMap.put("radius", localFloat);
    localHashMap.put("lat", localLong2);
    localHashMap.put("long", localLong3);
    localHashMap.put("time", localLong1);
    paramHashMap.put("uule", localHashMap);
  }
}


/* Location:              com/google/android/gms/b/ri.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */