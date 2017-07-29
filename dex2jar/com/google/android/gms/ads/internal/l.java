package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.b.it;
import com.google.android.gms.b.iu;
import com.google.android.gms.b.iv.a;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.le;
import com.google.android.gms.b.lq;
import com.google.android.gms.b.lr;
import com.google.android.gms.b.ls;
import com.google.android.gms.b.lt;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.un;

@qi
public final class l
  extends iv.a
{
  private it a;
  private lq b;
  private lr c;
  private android.support.v4.g.k<String, ls> d;
  private android.support.v4.g.k<String, lt> e;
  private le f;
  private jb g;
  private final Context h;
  private final oc i;
  private final String j;
  private final un k;
  private final e l;
  
  public l(Context paramContext, String paramString, oc paramoc, un paramun, e parame)
  {
    h = paramContext;
    j = paramString;
    i = paramoc;
    k = paramun;
    e = new android.support.v4.g.k();
    d = new android.support.v4.g.k();
    l = parame;
  }
  
  public final iu a()
  {
    return new k(h, j, i, k, a, b, c, e, d, f, g, l);
  }
  
  public final void a(it paramit)
  {
    a = paramit;
  }
  
  public final void a(jb paramjb)
  {
    g = paramjb;
  }
  
  public final void a(le paramle)
  {
    f = paramle;
  }
  
  public final void a(lq paramlq)
  {
    b = paramlq;
  }
  
  public final void a(lr paramlr)
  {
    c = paramlr;
  }
  
  public final void a(String paramString, lt paramlt, ls paramls)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }
    e.put(paramString, paramlt);
    d.put(paramString, paramls);
  }
}


/* Location:              com/google/android/gms/ads/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */