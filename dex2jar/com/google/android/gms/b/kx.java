package com.google.android.gms.b;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.util.List;

@qi
public final class kx
  extends ln.a
  implements lc.b
{
  private String a;
  private List<kv> b;
  private String c;
  private lh d;
  private String e;
  private String f;
  private kt g;
  private Bundle h;
  private jf i;
  private View j;
  private Object k = new Object();
  private lc l;
  
  public kx(String paramString1, List paramList, String paramString2, lh paramlh, String paramString3, String paramString4, kt paramkt, Bundle paramBundle, jf paramjf, View paramView)
  {
    a = paramString1;
    b = paramList;
    c = paramString2;
    d = paramlh;
    e = paramString3;
    f = paramString4;
    g = paramkt;
    h = paramBundle;
    i = paramjf;
    j = paramView;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final void a(lc paramlc)
  {
    synchronized (k)
    {
      l = paramlc;
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
  
  public final String f()
  {
    return f;
  }
  
  public final jf g()
  {
    return i;
  }
  
  public final a h()
  {
    return b.a(l);
  }
  
  public final Bundle i()
  {
    return h;
  }
  
  public final void j()
  {
    a = null;
    b = null;
    c = null;
    d = null;
    e = null;
    f = null;
    g = null;
    h = null;
    k = null;
    l = null;
    i = null;
    j = null;
  }
  
  public final String k()
  {
    return "1";
  }
  
  public final String l()
  {
    return "";
  }
  
  public final kt m()
  {
    return g;
  }
  
  public final View o()
  {
    return j;
  }
}


/* Location:              com/google/android/gms/b/kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */