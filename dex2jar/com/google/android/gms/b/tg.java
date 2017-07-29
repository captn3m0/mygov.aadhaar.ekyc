package com.google.android.gms.b;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@qi
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
  public final List<String> I;
  public final ih a;
  public final vc b;
  public final List<String> c;
  public final int d;
  public final List<String> e;
  public final List<String> f;
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
  public final List<String> y;
  public final List<String> z;
  
  public tg(ih paramih, vc paramvc, List<String> paramList1, int paramInt1, List<String> paramList2, List<String> paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean1, nr paramnr, od paramod, String paramString2, ns paramns, nu paramnu, long paramLong2, il paramil, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject, lc.a parama, ss paramss, List<String> paramList4, List<String> paramList5, boolean paramBoolean2, qt paramqt, String paramString4, List<String> paramList6, String paramString5)
  {
    a = paramih;
    b = paramvc;
    c = a(paramList1);
    d = paramInt1;
    e = a(paramList2);
    f = a(paramList3);
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
    y = a(paramList4);
    z = a(paramList5);
    k = paramBoolean2;
    l = paramqt;
    u = paramString4;
    I = a(paramList6);
    D = paramString5;
  }
  
  public tg(a parama)
  {
    this(a.c, null, b.d, e, b.f, b.j, b.l, b.k, a.i, b.h, null, null, null, c, null, b.i, d, b.g, f, g, b.o, h, null, b.C, b.D, b.D, b.F, b.G, null, b.J, b.N);
  }
  
  private static <T> List<T> a(List<T> paramList)
  {
    if (paramList == null) {
      return null;
    }
    return Collections.unmodifiableList(paramList);
  }
  
  public final boolean a()
  {
    if ((b == null) || (b.l() == null)) {
      return false;
    }
    return b.l().a();
  }
  
  @qi
  public static final class a
  {
    public final qo a;
    public final qr b;
    public final ns c;
    public final il d;
    public final int e;
    public final long f;
    public final long g;
    public final JSONObject h;
    
    public a(qo paramqo, qr paramqr, ns paramns, il paramil, int paramInt, long paramLong1, long paramLong2, JSONObject paramJSONObject)
    {
      a = paramqo;
      b = paramqr;
      c = paramns;
      d = paramil;
      e = paramInt;
      f = paramLong1;
      g = paramLong2;
      h = paramJSONObject;
    }
  }
}


/* Location:              com/google/android/gms/b/tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */