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

public final class rk
{
  boolean A;
  String B;
  List C;
  boolean D;
  String E;
  sv F;
  boolean G;
  final qo H;
  private final long I;
  String a;
  String b;
  String c;
  List d;
  String e;
  String f;
  String g;
  List h;
  long i;
  boolean j;
  List k;
  long l;
  int m;
  boolean n;
  boolean o;
  boolean p;
  boolean q;
  boolean r;
  String s;
  boolean t;
  boolean u;
  ss v;
  List w;
  List x;
  boolean y;
  qt z;
  
  public rk(qo paramqo, String paramString)
  {
    i = l1;
    j = false;
    I = l1;
    l = l1;
    m = -1;
    n = false;
    o = false;
    p = false;
    q = bool;
    r = bool;
    s = "";
    t = false;
    u = false;
    y = false;
    A = false;
    b = paramString;
    H = paramqo;
  }
  
  private static String a(Map paramMap, String paramString)
  {
    Object localObject = (List)paramMap.get(paramString);
    if (localObject != null)
    {
      boolean bool = ((List)localObject).isEmpty();
      if (!bool) {
        bool = false;
      }
    }
    for (localObject = (String)((List)localObject).get(0);; localObject = null) {
      return (String)localObject;
    }
  }
  
  private static long b(Map paramMap, String paramString)
  {
    Object localObject1 = (List)paramMap.get(paramString);
    float f1;
    if (localObject1 != null)
    {
      boolean bool = ((List)localObject1).isEmpty();
      if (!bool)
      {
        bool = false;
        f1 = 0.0F;
        Object localObject2 = null;
        localObject1 = (String)((List)localObject1).get(0);
      }
    }
    for (;;)
    {
      try
      {
        float f2 = Float.parseFloat((String)localObject1);
        i1 = 1148846080;
        f1 = 1000.0F;
        f2 *= f1;
        l1 = f2;
        return l1;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        int i1 = String.valueOf(paramString).length() + 36;
        int i2 = String.valueOf(localObject1).length();
        i1 += i2;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(i1);
        StringBuilder localStringBuilder = ((StringBuilder)localObject3).append("Could not parse float from ").append(paramString);
        localObject3 = " header: ";
        localStringBuilder = localStringBuilder.append((String)localObject3);
        localObject1 = (String)localObject1;
        tp.e((String)localObject1);
      }
      long l1 = -1;
    }
  }
  
  private static List c(Map paramMap, String paramString)
  {
    Object localObject = (List)paramMap.get(paramString);
    String str;
    if (localObject != null)
    {
      boolean bool = ((List)localObject).isEmpty();
      if (!bool)
      {
        bool = false;
        str = null;
        localObject = (String)((List)localObject).get(0);
        if (localObject != null)
        {
          localObject = ((String)localObject).trim();
          str = "\\s+";
        }
      }
    }
    for (localObject = Arrays.asList(((String)localObject).split(str));; localObject = null) {
      return (List)localObject;
    }
  }
  
  private static boolean d(Map paramMap, String paramString)
  {
    Object localObject = (List)paramMap.get(paramString);
    boolean bool2;
    if (localObject != null)
    {
      boolean bool1 = ((List)localObject).isEmpty();
      if (!bool1)
      {
        localObject = Boolean.valueOf((String)((List)localObject).get(0));
        bool2 = ((Boolean)localObject).booleanValue();
        if (bool2) {
          bool2 = true;
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  public final void a(Map paramMap)
  {
    long l1 = -1;
    boolean bool1 = true;
    Object localObject1 = a(paramMap, "X-Afma-Ad-Size");
    a = ((String)localObject1);
    localObject1 = a(paramMap, "X-Afma-Ad-Slot-Size");
    E = ((String)localObject1);
    localObject1 = c(paramMap, "X-Afma-Click-Tracking-Urls");
    if (localObject1 != null) {
      d = ((List)localObject1);
    }
    localObject1 = a(paramMap, "X-Afma-Debug-Signals");
    e = ((String)localObject1);
    localObject1 = (List)paramMap.get("X-Afma-Debug-Dialog");
    if (localObject1 != null)
    {
      bool2 = ((List)localObject1).isEmpty();
      if (!bool2)
      {
        localObject1 = (String)((List)localObject1).get(0);
        f = ((String)localObject1);
      }
    }
    localObject1 = c(paramMap, "X-Afma-Tracking-Urls");
    if (localObject1 != null) {
      h = ((List)localObject1);
    }
    localObject1 = "X-Afma-Interstitial-Timeout";
    long l2 = b(paramMap, (String)localObject1);
    boolean bool3 = l2 < l1;
    if (bool3) {
      i = l2;
    }
    boolean bool4 = j;
    localObject2 = "X-Afma-Mediation";
    boolean bool2 = d(paramMap, (String)localObject2);
    bool4 |= bool2;
    j = bool4;
    localObject1 = c(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (localObject1 != null) {
      k = ((List)localObject1);
    }
    localObject1 = "X-Afma-Refresh-Rate";
    l2 = b(paramMap, (String)localObject1);
    bool3 = l2 < l1;
    if (bool3) {
      l = l2;
    }
    localObject1 = (List)paramMap.get("X-Afma-Orientation");
    if (localObject1 != null)
    {
      bool2 = ((List)localObject1).isEmpty();
      if (!bool2)
      {
        localObject1 = (String)((List)localObject1).get(0);
        localObject2 = "portrait";
        bool2 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
        if (!bool2) {
          break label1253;
        }
        localObject1 = w.g();
        int i1 = ((tu)localObject1).b();
        m = i1;
      }
    }
    localObject1 = a(paramMap, "X-Afma-ActiveView");
    g = ((String)localObject1);
    localObject1 = (List)paramMap.get("X-Afma-Use-HTTPS");
    if (localObject1 != null)
    {
      bool2 = ((List)localObject1).isEmpty();
      if (!bool2)
      {
        localObject1 = Boolean.valueOf((String)((List)localObject1).get(0));
        bool5 = ((Boolean)localObject1).booleanValue();
        p = bool5;
      }
    }
    boolean bool5 = n;
    bool2 = d(paramMap, "X-Afma-Custom-Rendering-Allowed");
    bool5 |= bool2;
    n = bool5;
    localObject1 = a(paramMap, "X-Afma-Ad-Format");
    localObject2 = "native";
    bool5 = ((String)localObject2).equals(localObject1);
    o = bool5;
    localObject1 = (List)paramMap.get("X-Afma-Content-Url-Opted-Out");
    if (localObject1 != null)
    {
      bool2 = ((List)localObject1).isEmpty();
      if (!bool2)
      {
        localObject1 = Boolean.valueOf((String)((List)localObject1).get(0));
        bool5 = ((Boolean)localObject1).booleanValue();
        q = bool5;
      }
    }
    localObject1 = (List)paramMap.get("X-Afma-Content-Vertical-Opted-Out");
    if (localObject1 != null)
    {
      bool2 = ((List)localObject1).isEmpty();
      if (!bool2)
      {
        localObject1 = Boolean.valueOf((String)((List)localObject1).get(0));
        bool5 = ((Boolean)localObject1).booleanValue();
        r = bool5;
      }
    }
    localObject1 = (List)paramMap.get("X-Afma-Gws-Query-Id");
    if (localObject1 != null)
    {
      bool2 = ((List)localObject1).isEmpty();
      if (!bool2)
      {
        localObject1 = (String)((List)localObject1).get(0);
        s = ((String)localObject1);
      }
    }
    localObject1 = a(paramMap, "X-Afma-Fluid");
    if (localObject1 != null)
    {
      localObject2 = "height";
      bool5 = ((String)localObject1).equals(localObject2);
      if (bool5) {
        t = bool1;
      }
    }
    localObject1 = a(paramMap, "X-Afma-Ad-Format");
    localObject2 = "native_express";
    bool5 = ((String)localObject2).equals(localObject1);
    u = bool5;
    localObject1 = ss.a(a(paramMap, "X-Afma-Rewards"));
    v = ((ss)localObject1);
    localObject1 = w;
    if (localObject1 == null)
    {
      localObject1 = c(paramMap, "X-Afma-Reward-Video-Start-Urls");
      w = ((List)localObject1);
    }
    localObject1 = x;
    if (localObject1 == null)
    {
      localObject1 = c(paramMap, "X-Afma-Reward-Video-Complete-Urls");
      x = ((List)localObject1);
    }
    bool5 = y;
    bool2 = d(paramMap, "X-Afma-Use-Displayed-Impression");
    bool5 |= bool2;
    y = bool5;
    bool5 = A;
    localObject2 = "X-Afma-Auto-Collect-Location";
    bool2 = d(paramMap, (String)localObject2);
    bool5 |= bool2;
    A = bool5;
    localObject1 = a(paramMap, "Set-Cookie");
    B = ((String)localObject1);
    localObject1 = a(paramMap, "X-Afma-Auto-Protection-Configuration");
    if (localObject1 != null)
    {
      bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2) {}
    }
    else
    {
      localObject2 = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
      Object localObject3 = "gmob-apps-blocked-navigation";
      ((Uri.Builder)localObject2).appendQueryParameter("id", (String)localObject3);
      localObject1 = f;
      bool5 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool5)
      {
        localObject1 = "debugDialog";
        localObject3 = f;
        ((Uri.Builder)localObject2).appendQueryParameter((String)localObject1, (String)localObject3);
      }
      localObject3 = new com/google/android/gms/b/qt;
      localObject1 = ke.j;
      localObject1 = (Boolean)w.q().a((jz)localObject1);
      bool5 = ((Boolean)localObject1).booleanValue();
      String[] arrayOfString = new String[bool1];
      localObject2 = String.valueOf(((Uri.Builder)localObject2).toString());
      String str1 = String.valueOf("navigationURL");
      int i3 = String.valueOf(localObject2).length() + 18;
      int i4 = String.valueOf(str1).length();
      i3 += i4;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i3);
      localObject2 = localStringBuilder.append((String)localObject2);
      String str2 = "&";
      localObject2 = ((StringBuilder)localObject2).append(str2).append(str1);
      str1 = "={NAVIGATION_URL}";
      localObject2 = str1;
      arrayOfString[0] = localObject2;
      localObject2 = Arrays.asList(arrayOfString);
      ((qt)localObject3).<init>(bool5, (List)localObject2);
      z = ((qt)localObject3);
    }
    for (;;)
    {
      localObject1 = c(paramMap, "X-Afma-Remote-Ping-Urls");
      if (localObject1 != null) {
        C = ((List)localObject1);
      }
      localObject1 = a(paramMap, "X-Afma-Safe-Browsing");
      bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2) {}
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        localObject1 = sv.a((JSONObject)localObject2);
        F = ((sv)localObject1);
      }
      catch (JSONException localJSONException2)
      {
        for (;;)
        {
          localObject2 = "Error parsing safe browsing header";
          tp.c((String)localObject2, localJSONException2);
        }
      }
      bool5 = D;
      localObject2 = "X-Afma-Render-In-Browser";
      bool2 = d(paramMap, (String)localObject2);
      bool5 |= bool2;
      D = bool5;
      localObject1 = a(paramMap, "X-Afma-Pool");
      bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2) {}
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        localObject1 = "never_pool";
        bool5 = ((JSONObject)localObject2).getBoolean((String)localObject1);
        G = bool5;
        return;
      }
      catch (JSONException localJSONException3)
      {
        for (;;)
        {
          label1253:
          int i2;
          localObject2 = "Error parsing interstitial pool header";
          tp.c((String)localObject2, localJSONException3);
        }
      }
      localObject2 = "landscape";
      bool5 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
      if (!bool5) {
        break;
      }
      localObject1 = w.g();
      i2 = ((tu)localObject1).a();
      m = i2;
      break;
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        localObject1 = qt.a((JSONObject)localObject2);
        z = ((qt)localObject1);
      }
      catch (JSONException localJSONException1)
      {
        localObject2 = "Error parsing configuration JSON";
        tp.c((String)localObject2, localJSONException1);
        qt localqt = new com/google/android/gms/b/qt;
        localqt.<init>();
        z = localqt;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/rk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */