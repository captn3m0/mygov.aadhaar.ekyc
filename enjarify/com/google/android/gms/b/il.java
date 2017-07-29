package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.k;
import com.google.android.gms.common.internal.safeparcel.a;

public class il
  extends a
{
  public static final Parcelable.Creator CREATOR;
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
  
  static
  {
    im localim = new com/google/android/gms/b/im;
    localim.<init>();
    CREATOR = localim;
  }
  
  public il()
  {
    this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  public il(Context paramContext, d paramd)
  {
    this(paramContext, arrayOfd);
  }
  
  public il(Context paramContext, d[] paramArrayOfd)
  {
    d locald = paramArrayOfd[0];
    d = false;
    int m = k;
    int i1 = -3;
    int n;
    label104:
    label123:
    label148:
    Object localObject2;
    DisplayMetrics localDisplayMetrics;
    int i3;
    label226:
    label297:
    label309:
    Object localObject3;
    if (m == i1)
    {
      m = l;
      i1 = -4;
      if (m == i1)
      {
        m = k;
        i = m;
        boolean bool1 = i;
        if (!bool1) {
          break label483;
        }
        n = ak;
        e = n;
        localObject1 = d.a;
        n = l;
        b = n;
        n = e;
        i1 = -1;
        if (n != i1) {
          break label512;
        }
        n = k;
        i1 = b;
        int i2 = -2;
        float f1 = 0.0F / 0.0F;
        if (i1 != i2) {
          break label521;
        }
        i1 = k;
        localObject2 = paramContext.getResources();
        localDisplayMetrics = ((Resources)localObject2).getDisplayMetrics();
        if (n == 0) {
          break label546;
        }
        ip.a();
        boolean bool3 = uk.e(paramContext);
        if (!bool3) {
          break label530;
        }
        ip.a();
        bool3 = uk.f(paramContext);
        if (!bool3) {
          break label530;
        }
        i3 = widthPixels;
        ip.a();
        int i4 = uk.g(paramContext);
        i3 -= i4;
        f = i3;
        f1 = f;
        float f2 = density;
        f1 /= f2;
        double d1 = f1;
        i3 = (int)d1;
        double d2 = (int)d1;
        d1 -= d2;
        d2 = 0.01D;
        int i5 = d1 < d2;
        if (i5 >= 0) {
          i3 += 1;
        }
        i5 = i3;
        if (i1 == 0) {
          break label584;
        }
        i3 = c(localDisplayMetrics);
        ip.a();
        int i7 = uk.a(localDisplayMetrics, i3);
        c = i7;
        if ((n == 0) && (i1 == 0)) {
          break label593;
        }
        n = 26;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(n);
        localObject1 = ((StringBuilder)localObject3).append(i5).append("x").append(i3);
        localObject3 = "_as";
        localObject1 = (String)localObject3;
        a = ((String)localObject1);
      }
    }
    for (;;)
    {
      n = paramArrayOfd.length;
      if (n <= k) {
        break label633;
      }
      localObject1 = new il[paramArrayOfd.length];
      g = ((il[])localObject1);
      n = 0;
      localObject1 = null;
      for (;;)
      {
        k = paramArrayOfd.length;
        if (n >= k) {
          break;
        }
        il[] arrayOfil = g;
        localObject3 = new com/google/android/gms/b/il;
        localObject2 = paramArrayOfd[n];
        ((il)localObject3).<init>(paramContext, (d)localObject2);
        arrayOfil[n] = localObject3;
        n += 1;
      }
      n = 0;
      localObject1 = null;
      break;
      label483:
      n = k;
      e = n;
      n = l;
      b = n;
      break label104;
      label512:
      n = 0;
      localObject1 = null;
      break label123;
      label521:
      i1 = 0;
      localObject3 = null;
      break label148;
      label530:
      i3 = widthPixels;
      f = i3;
      break label226;
      label546:
      i3 = e;
      ip.a();
      int i6 = e;
      i6 = uk.a(localDisplayMetrics, i6);
      f = i6;
      i6 = i3;
      break label297;
      label584:
      i3 = b;
      break label309;
      label593:
      bool2 = i;
      if (bool2)
      {
        localObject1 = "320x50_mb";
        a = ((String)localObject1);
      }
      else
      {
        localObject1 = locald.toString();
        a = ((String)localObject1);
      }
    }
    label633:
    boolean bool2 = false;
    Object localObject1 = null;
    g = null;
    h = false;
    j = false;
  }
  
  public il(il paramil, il[] paramArrayOfil)
  {
    this(str, k, m, bool1, n, i1, paramArrayOfil, bool2, bool3, bool4);
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
    il localil = new com/google/android/gms/b/il;
    localil.<init>("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    return localil;
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    float f1 = c(paramDisplayMetrics);
    float f2 = density;
    return (int)(f1 * f2);
  }
  
  public static il b()
  {
    il localil = new com/google/android/gms/b/il;
    localil.<init>("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    return localil;
  }
  
  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    float f1 = heightPixels;
    float f2 = density;
    f1 /= f2;
    int k = (int)f1;
    int m = 400;
    f2 = 5.6E-43F;
    if (k <= m)
    {
      k = 32;
      f1 = 4.5E-44F;
    }
    for (;;)
    {
      return k;
      m = 720;
      f2 = 1.009E-42F;
      if (k <= m)
      {
        k = 50;
        f1 = 7.0E-44F;
      }
      else
      {
        k = 90;
        f1 = 1.26E-43F;
      }
    }
  }
  
  public final d c()
  {
    int k = e;
    int m = b;
    String str = a;
    return k.a(k, m, str);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    im.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/il.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */