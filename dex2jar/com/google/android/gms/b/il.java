package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.k;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public class il
  extends a
{
  public static final Parcelable.Creator<il> CREATOR = new im();
  public final String a;
  public final int b;
  public final int c;
  public final boolean d;
  public final int e;
  public final int f;
  public final il[] g;
  public final boolean h;
  public final boolean i;
  public boolean j;
  
  public il()
  {
    this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  public il(Context paramContext, d paramd)
  {
    this(paramContext, new d[] { paramd });
  }
  
  public il(Context paramContext, d[] paramArrayOfd)
  {
    d locald = paramArrayOfd[0];
    d = false;
    boolean bool;
    label70:
    int m;
    label81:
    int n;
    label93:
    DisplayMetrics localDisplayMetrics;
    int k;
    label151:
    int i1;
    if ((k == -3) && (l == -4))
    {
      bool = true;
      i = bool;
      if (!i) {
        break label322;
      }
      e = ak;
      b = al;
      if (e != -1) {
        break label343;
      }
      m = 1;
      if (b != -2) {
        break label349;
      }
      n = 1;
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (m == 0) {
        break label367;
      }
      ip.a();
      if (!uk.e(paramContext)) {
        break label355;
      }
      ip.a();
      if (!uk.f(paramContext)) {
        break label355;
      }
      k = widthPixels;
      ip.a();
      f = (k - uk.g(paramContext));
      double d1 = f / density;
      i1 = (int)d1;
      k = i1;
      if (d1 - (int)d1 >= 0.01D) {
        k = i1 + 1;
      }
      label190:
      if (n == 0) {
        break label393;
      }
      i1 = c(localDisplayMetrics);
      label202:
      ip.a();
      c = uk.a(localDisplayMetrics, i1);
      if ((m == 0) && (n == 0)) {
        break label402;
      }
      a = (26 + k + "x" + i1 + "_as");
    }
    for (;;)
    {
      if (paramArrayOfd.length <= 1) {
        break label430;
      }
      g = new il[paramArrayOfd.length];
      k = 0;
      while (k < paramArrayOfd.length)
      {
        g[k] = new il(paramContext, paramArrayOfd[k]);
        k += 1;
      }
      bool = false;
      break;
      label322:
      e = k;
      b = l;
      break label70;
      label343:
      m = 0;
      break label81;
      label349:
      n = 0;
      break label93;
      label355:
      f = widthPixels;
      break label151;
      label367:
      k = e;
      ip.a();
      f = uk.a(localDisplayMetrics, e);
      break label190;
      label393:
      i1 = b;
      break label202;
      label402:
      if (i) {
        a = "320x50_mb";
      } else {
        a = locald.toString();
      }
    }
    label430:
    g = null;
    h = false;
    j = false;
  }
  
  public il(il paramil, il[] paramArrayOfil)
  {
    this(a, b, c, d, e, f, paramArrayOfil, h, i, j);
  }
  
  il(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, int paramInt4, il[] paramArrayOfil, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
    d = paramBoolean1;
    e = paramInt3;
    f = paramInt4;
    g = paramArrayOfil;
    h = paramBoolean2;
    i = paramBoolean3;
    j = paramBoolean4;
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics)
  {
    return widthPixels;
  }
  
  public static il a()
  {
    return new il("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(c(paramDisplayMetrics) * density);
  }
  
  public static il b()
  {
    return new il("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    int k = (int)(heightPixels / density);
    if (k <= 400) {
      return 32;
    }
    if (k <= 720) {
      return 50;
    }
    return 90;
  }
  
  public final d c()
  {
    return k.a(e, b, a);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    im.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/il.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */