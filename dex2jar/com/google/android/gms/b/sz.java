package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.w;

@qi
public final class sz
  implements hb.b
{
  boolean a;
  private final Context b;
  private final String c;
  private final Object d;
  
  public sz(Context paramContext, String paramString)
  {
    b = paramContext;
    c = paramString;
    a = false;
    d = new Object();
  }
  
  public final void a(hb.a parama)
  {
    a(m);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!w.D().a()) {
      return;
    }
    synchronized (d)
    {
      if (a == paramBoolean) {
        return;
      }
    }
    a = paramBoolean;
    ta localta;
    Context localContext;
    String str;
    if (a)
    {
      localta = w.D();
      localContext = b;
      str = c;
      if (localta.a()) {
        localta.a(localContext, str, "beginAdUnitExposure");
      }
    }
    for (;;)
    {
      return;
      localta = w.D();
      localContext = b;
      str = c;
      if (localta.a()) {
        localta.a(localContext, str, "endAdUnitExposure");
      }
    }
  }
}


/* Location:              com/google/android/gms/b/sz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */