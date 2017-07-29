package com.google.android.gms.b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class qo
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final long A;
  public final qv B;
  public final String C;
  public final float D;
  public final int E;
  public final int F;
  public final boolean G;
  public final boolean H;
  public final String I;
  public final boolean J;
  public final String K;
  public final boolean L;
  public final int M;
  public final Bundle N;
  public final String O;
  public final jh P;
  public final boolean Q;
  public final Bundle R;
  public final String S;
  public final String T;
  public final String U;
  public final boolean V;
  public final int a;
  public final Bundle b;
  public final ih c;
  public final il d;
  public final String e;
  public final ApplicationInfo f;
  public final PackageInfo g;
  public final String h;
  public final String i;
  public final String j;
  public final un k;
  public final Bundle l;
  public final int m;
  public final List n;
  public final Bundle o;
  public final boolean p;
  public final int q;
  public final int r;
  public final float s;
  public final String t;
  public final long u;
  public final String v;
  public final List w;
  public final String x;
  public final le y;
  public final List z;
  
  static
  {
    qp localqp = new com/google/android/gms/b/qp;
    localqp.<init>();
    CREATOR = localqp;
  }
  
  qo(int paramInt1, Bundle paramBundle1, ih paramih, il paramil, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, un paramun, Bundle paramBundle2, int paramInt2, List paramList1, Bundle paramBundle3, boolean paramBoolean1, int paramInt3, int paramInt4, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList2, String paramString7, le paramle, List paramList3, long paramLong2, qv paramqv, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt5, int paramInt6, boolean paramBoolean3, boolean paramBoolean4, String paramString9, String paramString10, boolean paramBoolean5, int paramInt7, Bundle paramBundle4, String paramString11, jh paramjh, boolean paramBoolean6, Bundle paramBundle5, String paramString12, String paramString13, String paramString14, boolean paramBoolean7)
  {
    a = paramInt1;
    b = paramBundle1;
    c = paramih;
    d = paramil;
    e = paramString1;
    f = paramApplicationInfo;
    g = paramPackageInfo;
    h = paramString2;
    i = paramString3;
    j = paramString4;
    k = paramun;
    l = paramBundle2;
    m = paramInt2;
    n = paramList1;
    if (paramList3 == null)
    {
      localList = Collections.emptyList();
      z = localList;
      o = paramBundle3;
      p = paramBoolean1;
      q = paramInt3;
      r = paramInt4;
      s = paramFloat1;
      t = paramString5;
      u = paramLong1;
      v = paramString6;
      if (paramList2 != null) {
        break label320;
      }
    }
    label320:
    for (List localList = Collections.emptyList();; localList = Collections.unmodifiableList(paramList2))
    {
      w = localList;
      x = paramString7;
      y = paramle;
      A = paramLong2;
      B = paramqv;
      C = paramString8;
      D = paramFloat2;
      J = paramBoolean2;
      E = paramInt5;
      F = paramInt6;
      G = paramBoolean3;
      H = paramBoolean4;
      I = paramString9;
      K = paramString10;
      L = paramBoolean5;
      M = paramInt7;
      N = paramBundle4;
      O = paramString11;
      P = paramjh;
      Q = paramBoolean6;
      R = paramBundle5;
      S = paramString12;
      T = paramString13;
      U = paramString14;
      V = paramBoolean7;
      return;
      localList = Collections.unmodifiableList(paramList3);
      break;
    }
  }
  
  private qo(Bundle paramBundle1, ih paramih, il paramil, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, un paramun, Bundle paramBundle2, int paramInt1, List paramList1, List paramList2, Bundle paramBundle3, boolean paramBoolean1, int paramInt2, int paramInt3, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList3, String paramString7, le paramle, long paramLong2, qv paramqv, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt4, int paramInt5, boolean paramBoolean3, boolean paramBoolean4, String paramString9, String paramString10, boolean paramBoolean5, int paramInt6, Bundle paramBundle4, String paramString11, jh paramjh, boolean paramBoolean6, Bundle paramBundle5, String paramString12, String paramString13, String paramString14, boolean paramBoolean7)
  {
    this(22, paramBundle1, paramih, paramil, paramString1, paramApplicationInfo, paramPackageInfo, paramString2, paramString3, paramString4, paramun, paramBundle2, paramInt1, paramList1, paramBundle3, paramBoolean1, paramInt2, paramInt3, paramFloat1, paramString5, paramLong1, paramString6, paramList3, paramString7, paramle, paramList2, paramLong2, paramqv, paramString8, paramFloat2, paramBoolean2, paramInt4, paramInt5, paramBoolean3, paramBoolean4, paramString9, paramString10, paramBoolean5, paramInt6, paramBundle4, paramString11, paramjh, paramBoolean6, paramBundle5, paramString12, paramString13, paramString14, paramBoolean7);
  }
  
  public qo(qo.a parama, long paramLong, String paramString1, String paramString2, String paramString3) {}
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    qp.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/qo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */