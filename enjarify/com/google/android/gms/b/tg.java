package com.google.android.gms.b;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class tg
{
  public final long A;
  public final long B;
  public final String C;
  public final String D;
  public final lc.a E;
  public boolean F = false;
  public boolean G = false;
  public boolean H = false;
  public final List I;
  public final ih a;
  public final vc b;
  public final List c;
  public final int d;
  public final List e;
  public final List f;
  public final int g;
  public final long h;
  public final String i;
  public final JSONObject j;
  public final boolean k;
  public final qt l;
  public boolean m;
  public final boolean n;
  public final nr o;
  public final od p;
  public final String q;
  public final ns r;
  public final nu s;
  public final long t;
  public final String u;
  public final il v;
  public final long w;
  public final ss x;
  public final List y;
  public final List z;
  
  public tg(ih paramih, vc paramvc, List paramList1, int paramInt1, List paramList2, List paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean1, nr paramnr, od paramod, String paramString2, ns paramns, nu paramnu, long paramLong2, il paramil, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject, lc.a parama, ss paramss, List paramList4, List paramList5, boolean paramBoolean2, qt paramqt, String paramString4, List paramList6, String paramString5)
  {
    a = paramih;
    b = paramvc;
    List localList = a(paramList1);
    c = localList;
    d = paramInt1;
    localList = a(paramList2);
    e = localList;
    localList = a(paramList3);
    f = localList;
    g = paramInt2;
    h = paramLong1;
    i = paramString1;
    n = paramBoolean1;
    o = paramnr;
    p = paramod;
    q = paramString2;
    r = paramns;
    s = paramnu;
    t = paramLong2;
    v = paramil;
    w = paramLong3;
    A = paramLong4;
    B = paramLong5;
    C = paramString3;
    j = paramJSONObject;
    E = parama;
    x = paramss;
    localList = a(paramList4);
    y = localList;
    localList = a(paramList5);
    z = localList;
    k = paramBoolean2;
    l = paramqt;
    u = paramString4;
    localList = a(paramList6);
    I = localList;
    D = paramString5;
  }
  
  public tg(tg.a parama)
  {
    this(localih, null, localList1, i1, localList2, localList3, i2, l1, str1, bool1, null, null, null, localns, null, l2, localil, l3, l4, l5, str2, localJSONObject, null, localss, localList4, localList5, bool2, localqt, null, localList6, (String)localObject);
  }
  
  private static List a(List paramList)
  {
    if (paramList == null) {}
    for (List localList = null;; localList = Collections.unmodifiableList(paramList)) {
      return localList;
    }
  }
  
  public final boolean a()
  {
    Object localObject = b;
    boolean bool;
    if (localObject != null)
    {
      localObject = b.l();
      if (localObject != null) {}
    }
    else
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = b.l();
      bool = ((vd)localObject).a();
    }
  }
}


/* Location:              com/google/android/gms/b/tg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */