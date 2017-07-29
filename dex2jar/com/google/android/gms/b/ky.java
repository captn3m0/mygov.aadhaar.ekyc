package com.google.android.gms.b;

import android.content.Context;
import android.support.v4.g.k;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.util.Arrays;
import java.util.List;

@qi
public final class ky
  extends lp.a
  implements lc.a
{
  private final kt a;
  private final String b;
  private final k<String, kv> c;
  private final k<String, String> d;
  private jf e;
  private View f;
  private final Object g = new Object();
  private lc h;
  
  public ky(String paramString, k<String, kv> paramk, k<String, String> paramk1, kt paramkt, jf paramjf, View paramView)
  {
    b = paramString;
    c = paramk;
    d = paramk1;
    a = paramkt;
    e = paramjf;
    f = paramView;
  }
  
  public final String a(String paramString)
  {
    return (String)d.get(paramString);
  }
  
  public final List<String> a()
  {
    int n = 0;
    String[] arrayOfString = new String[c.size() + d.size()];
    int j = 0;
    int i = 0;
    int k;
    int m;
    for (;;)
    {
      k = n;
      m = i;
      if (j >= c.size()) {
        break;
      }
      arrayOfString[i] = ((String)c.b(j));
      i += 1;
      j += 1;
    }
    while (k < d.size())
    {
      arrayOfString[m] = ((String)d.b(k));
      k += 1;
      m += 1;
    }
    return Arrays.asList(arrayOfString);
  }
  
  public final void a(lc paramlc)
  {
    synchronized (g)
    {
      h = paramlc;
      return;
    }
  }
  
  public final boolean a(a parama)
  {
    if (h == null) {
      ul.c("Attempt to call renderVideoInMediaView before ad initialized.");
    }
    while (f == null) {
      return false;
    }
    kz local1 = new kz()
    {
      public final void a()
      {
        c("_videoMediaView");
      }
      
      public final void a(MotionEvent paramAnonymousMotionEvent) {}
    };
    parama = (FrameLayout)b.a(parama);
    h.a(parama, local1);
    return true;
  }
  
  public final jf b()
  {
    return e;
  }
  
  public final lh b(String paramString)
  {
    return (lh)c.get(paramString);
  }
  
  public final void c()
  {
    synchronized (g)
    {
      if (h == null)
      {
        ul.c("Attempt to perform recordImpression before ad initialized.");
        return;
      }
      h.a(null, null);
      return;
    }
  }
  
  public final void c(String paramString)
  {
    synchronized (g)
    {
      if (h == null)
      {
        ul.c("Attempt to call performClick before ad initialized.");
        return;
      }
      h.a(null, paramString, null, null, null);
      return;
    }
  }
  
  public final a d()
  {
    return b.a(h.f().getApplicationContext());
  }
  
  public final void e()
  {
    h = null;
    e = null;
    f = null;
  }
  
  public final String k()
  {
    return "3";
  }
  
  public final String l()
  {
    return b;
  }
  
  public final kt m()
  {
    return a;
  }
  
  public final View o()
  {
    return f;
  }
}


/* Location:              com/google/android/gms/b/ky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */