package com.google.android.gms.b;

import java.util.Map;

@qi
public final class rj
{
  final Object a = new Object();
  String b;
  String c;
  up<rm> d = new up();
  nj.c e;
  public final md f = new md()
  {
    public final void a(vc arg1, Map<String, String> paramAnonymousMap)
    {
      synchronized (a)
      {
        if (d.isDone()) {
          return;
        }
        if (!b.equals(paramAnonymousMap.get("request_id"))) {
          return;
        }
      }
      paramAnonymousMap = new rm(1, paramAnonymousMap);
      String str1 = String.valueOf(d);
      String str2 = String.valueOf(a);
      tp.e(String.valueOf(str1).length() + 24 + String.valueOf(str2).length() + "Invalid " + str1 + " request error: " + str2);
      d.b(paramAnonymousMap);
    }
  };
  public final md g = new md()
  {
    public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
    {
      rm localrm;
      synchronized (a)
      {
        if (d.isDone()) {
          return;
        }
        localrm = new rm(-2, paramAnonymousMap);
        if (!b.equals(f)) {
          return;
        }
      }
      String str = h;
      if (str == null)
      {
        tp.e("URL missing in loadAdUrl GMSG.");
        return;
      }
      if (str.contains("%40mediation_adapters%40"))
      {
        paramAnonymousvc = str.replaceAll("%40mediation_adapters%40", tn.a(paramAnonymousvc.getContext(), (String)paramAnonymousMap.get("check_adapters"), c));
        h = paramAnonymousvc;
        paramAnonymousvc = String.valueOf(paramAnonymousvc);
        if (paramAnonymousvc.length() == 0) {
          break label173;
        }
      }
      label173:
      for (paramAnonymousvc = "Ad request URL modified to ".concat(paramAnonymousvc);; paramAnonymousvc = new String("Ad request URL modified to "))
      {
        tp.a(paramAnonymousvc);
        d.b(localrm);
        return;
      }
    }
  };
  public final md h = new md()
  {
    public final void a(vc arg1, Map<String, String> paramAnonymousMap)
    {
      synchronized (a)
      {
        if (d.isDone()) {
          return;
        }
        paramAnonymousMap = new rm(-2, paramAnonymousMap);
        if (!b.equals(f)) {
          return;
        }
      }
      d.b(paramAnonymousMap);
    }
  };
  
  public rj(String paramString1, String paramString2)
  {
    c = paramString2;
    b = paramString1;
  }
}


/* Location:              com/google/android/gms/b/rj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */