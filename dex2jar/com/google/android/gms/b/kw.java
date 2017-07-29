package com.google.android.gms.b;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.util.List;

@qi
public final class kw
  extends ll.a
  implements lc.b
{
  private String a;
  private List<kv> b;
  private String c;
  private lh d;
  private String e;
  private double f;
  private String g;
  private String h;
  private kt i;
  private Bundle j;
  private jf k;
  private View l;
  private Object m = new Object();
  private lc n;
  
  public kw(String paramString1, List paramList, String paramString2, lh paramlh, String paramString3, double paramDouble, String paramString4, String paramString5, kt paramkt, Bundle paramBundle, jf paramjf, View paramView)
  {
    a = paramString1;
    b = paramList;
    c = paramString2;
    d = paramlh;
    e = paramString3;
    f = paramDouble;
    g = paramString4;
    h = paramString5;
    i = paramkt;
    j = paramBundle;
    k = paramjf;
    l = paramView;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final void a(lc paramlc)
  {
    synchronized (m)
    {
      n = paramlc;
      return;
    }
  }
  
  public final List b()
  {
    return b;
  }
  
  public final String c()
  {
    return c;
  }
  
  public final lh d()
  {
    return d;
  }
  
  public final String e()
  {
    return e;
  }
  
  public final double f()
  {
    return f;
  }
  
  public final String g()
  {
    return g;
  }
  
  public final String h()
  {
    return h;
  }
  
  public final jf i()
  {
    return k;
  }
  
  public final a j()
  {
    return b.a(n);
  }
  
  public final String k()
  {
    return "2";
  }
  
  public final String l()
  {
    return "";
  }
  
  public final kt m()
  {
    return i;
  }
  
  public final Bundle n()
  {
    return j;
  }
  
  public final View o()
  {
    return l;
  }
  
  public final void p()
  {
    a = null;
    b = null;
    c = null;
    d = null;
    e = null;
    f = 0.0D;
    g = null;
    h = null;
    i = null;
    j = null;
    m = null;
    n = null;
    k = null;
    l = null;
  }
}


/* Location:              com/google/android/gms/b/kw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */