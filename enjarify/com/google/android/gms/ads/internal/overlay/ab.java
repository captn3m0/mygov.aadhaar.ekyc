package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.kk;
import com.google.android.gms.b.km;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tz;
import com.google.android.gms.b.tz.b;
import com.google.android.gms.b.un;

public final class ab
{
  final Context a;
  final String b;
  final un c;
  final kk d;
  final km e;
  final tz f;
  final long[] g;
  final String[] h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  l n;
  boolean o;
  boolean p;
  long q;
  
  public ab(Context paramContext, un paramun, String paramString, km paramkm, kk paramkk)
  {
    Object localObject1 = new com/google/android/gms/b/tz$b;
    ((tz.b)localObject1).<init>();
    localObject1 = ((tz.b)localObject1).a("min_1", Double.MIN_VALUE, 1.0D).a("1_5", 1.0D, 5.0D).a("5_10", 5.0D, 10.0D).a("10_20", 10.0D, 20.0D).a("20_30", 20.0D, 30.0D);
    double d1 = 30.0D;
    l1 = 9218868437227405311L;
    d2 = Double.MAX_VALUE;
    localObject1 = ((tz.b)localObject1).a("30_max", d1, d2);
    Object localObject2 = new com/google/android/gms/b/tz;
    String[] arrayOfString = null;
    ((tz)localObject2).<init>((tz.b)localObject1, (byte)0);
    f = ((tz)localObject2);
    i = false;
    j = false;
    k = false;
    i1 = 0;
    l = false;
    long l2 = -1;
    q = l2;
    a = paramContext;
    c = paramun;
    b = paramString;
    e = paramkm;
    d = paramkk;
    localObject1 = ke.y;
    localObject2 = w.q();
    localObject1 = (String)((kd)localObject2).a((jz)localObject1);
    if (localObject1 == null)
    {
      localObject1 = new String[0];
      h = ((String[])localObject1);
      i1 = 0;
      localObject1 = new long[0];
      g = ((long[])localObject1);
      return;
    }
    localObject2 = ",";
    arrayOfString = TextUtils.split((String)localObject1, (String)localObject2);
    localObject1 = new String[arrayOfString.length];
    h = ((String[])localObject1);
    localObject1 = new long[arrayOfString.length];
    g = ((long[])localObject1);
    i1 = 0;
    localObject1 = null;
    for (;;)
    {
      int i2 = arrayOfString.length;
      if (i1 >= i2) {
        break;
      }
      try
      {
        localObject2 = g;
        str = arrayOfString[i1];
        l1 = Long.parseLong(str);
        localObject2[i1] = l1;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          String str = "Unable to parse frame hash target time number.";
          tp.c(str, localNumberFormatException);
          long[] arrayOfLong = g;
          l1 = -1;
          d2 = 0.0D / 0.0D;
          arrayOfLong[i1] = l1;
        }
      }
      i1 += 1;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */