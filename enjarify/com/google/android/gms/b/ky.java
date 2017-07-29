package com.google.android.gms.b;

import android.content.Context;
import android.support.v4.g.k;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.util.Arrays;
import java.util.List;

public final class ky
  extends lp.a
  implements lc.a
{
  private final kt a;
  private final String b;
  private final k c;
  private final k d;
  private jf e;
  private View f;
  private final Object g;
  private lc h;
  
  public ky(String paramString, k paramk1, k paramk2, kt paramkt, jf paramjf, View paramView)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    g = localObject;
    b = paramString;
    c = paramk1;
    d = paramk2;
    a = paramkt;
    e = paramjf;
    f = paramView;
  }
  
  public final String a(String paramString)
  {
    return (String)d.get(paramString);
  }
  
  public final List a()
  {
    int i = 0;
    Object localObject = c;
    int j = ((k)localObject).size();
    int k = d.size();
    j += k;
    String[] arrayOfString = new String[j];
    k = 0;
    int m = 0;
    for (;;)
    {
      localObject = c;
      j = ((k)localObject).size();
      if (k >= j) {
        break;
      }
      localObject = (String)c.b(k);
      arrayOfString[m] = localObject;
      j = k + 1;
      m += 1;
      k = j;
    }
    for (;;)
    {
      localObject = d;
      j = ((k)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (String)d.b(i);
      arrayOfString[m] = localObject;
      i += 1;
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
    boolean bool = false;
    FrameLayout localFrameLayout = null;
    Object localObject = h;
    if (localObject == null)
    {
      localObject = "Attempt to call renderVideoInMediaView before ad initialized.";
      ul.c((String)localObject);
    }
    for (;;)
    {
      return bool;
      localObject = f;
      if (localObject != null)
      {
        localObject = new com/google/android/gms/b/ky$1;
        ((ky.1)localObject).<init>(this);
        localFrameLayout = (FrameLayout)b.a(parama);
        lc locallc = h;
        locallc.a(localFrameLayout, (kz)localObject);
        bool = true;
      }
    }
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
      Object localObject2 = h;
      if (localObject2 == null)
      {
        localObject2 = "Attempt to perform recordImpression before ad initialized.";
        ul.c((String)localObject2);
        return;
      }
      localObject2 = h;
      ((lc)localObject2).a(null, null);
    }
  }
  
  public final void c(String paramString)
  {
    synchronized (g)
    {
      Object localObject2 = h;
      if (localObject2 == null)
      {
        localObject2 = "Attempt to call performClick before ad initialized.";
        ul.c((String)localObject2);
        return;
      }
      localObject2 = h;
      ((lc)localObject2).a(null, paramString, null, null, null);
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */