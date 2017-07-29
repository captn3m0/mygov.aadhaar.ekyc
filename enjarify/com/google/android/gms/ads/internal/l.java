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
import com.google.android.gms.b.un;

public final class l
  extends iv.a
{
  private it a;
  private lq b;
  private lr c;
  private android.support.v4.g.k d;
  private android.support.v4.g.k e;
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
    android.support.v4.g.k localk = new android/support/v4/g/k;
    localk.<init>();
    e = localk;
    localk = new android/support/v4/g/k;
    localk.<init>();
    d = localk;
    l = parame;
  }
  
  public final iu a()
  {
    k localk = new com/google/android/gms/ads/internal/k;
    Context localContext = h;
    String str = j;
    oc localoc = i;
    un localun = k;
    it localit = a;
    lq locallq = b;
    lr locallr = c;
    android.support.v4.g.k localk1 = e;
    android.support.v4.g.k localk2 = d;
    le localle = f;
    jb localjb = g;
    e locale = l;
    localk.<init>(localContext, str, localoc, localun, localit, locallq, locallr, localk1, localk2, localle, localjb, locale);
    return localk;
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
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
      throw localIllegalArgumentException;
    }
    e.put(paramString, paramlt);
    d.put(paramString, paramls);
  }
}


/* Location:              com/google/android/gms/ads/internal/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */