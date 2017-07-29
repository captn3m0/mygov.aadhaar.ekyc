package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.kk;
import com.google.android.gms.b.km;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tz;
import com.google.android.gms.b.tz.b;
import com.google.android.gms.b.un;

@qi
public final class ab
{
  final Context a;
  final String b;
  final un c;
  final kk d;
  final km e;
  final tz f = new tz(new tz.b().a("min_1", Double.MIN_VALUE, 1.0D).a("1_5", 1.0D, 5.0D).a("5_10", 5.0D, 10.0D).a("10_20", 10.0D, 20.0D).a("20_30", 20.0D, 30.0D).a("30_max", 30.0D, Double.MAX_VALUE), (byte)0);
  final long[] g;
  final String[] h;
  boolean i = false;
  boolean j = false;
  boolean k = false;
  boolean l = false;
  boolean m;
  l n;
  boolean o;
  boolean p;
  long q = -1L;
  
  public ab(Context paramContext, un paramun, String paramString, km paramkm, kk paramkk)
  {
    a = paramContext;
    c = paramun;
    b = paramString;
    e = paramkm;
    d = paramkk;
    paramContext = ke.y;
    paramContext = (String)w.q().a(paramContext);
    if (paramContext == null)
    {
      h = new String[0];
      g = new long[0];
      return;
    }
    paramContext = TextUtils.split(paramContext, ",");
    h = new String[paramContext.length];
    g = new long[paramContext.length];
    int i1 = 0;
    while (i1 < paramContext.length) {
      try
      {
        g[i1] = Long.parseLong(paramContext[i1]);
        i1 += 1;
      }
      catch (NumberFormatException paramun)
      {
        for (;;)
        {
          tp.c("Unable to parse frame hash target time number.", paramun);
          g[i1] = -1L;
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */