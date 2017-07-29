package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Collections;
import java.util.List;

@qi
public final class qr
  extends a
{
  public static final Parcelable.Creator<qr> CREATOR = new qs();
  public final boolean A;
  public final boolean B;
  public final ss C;
  public final List<String> D;
  public final List<String> E;
  public final boolean F;
  public final qt G;
  public final boolean H;
  public String I;
  public final List<String> J;
  public final boolean K;
  public final String L;
  public final sv M;
  public final String N;
  public final boolean O;
  public final boolean P;
  private qo Q;
  public final int a;
  public final String b;
  public String c;
  public final List<String> d;
  public final int e;
  public final List<String> f;
  public final long g;
  public final boolean h;
  public final long i;
  public final List<String> j;
  public final long k;
  public final int l;
  public final String m;
  public final long n;
  public final String o;
  public final boolean p;
  public final String q;
  public final String r;
  public final boolean s;
  public final boolean t;
  public final boolean u;
  public final boolean v;
  public final boolean w;
  public qz x;
  public String y;
  public final String z;
  
  public qr(int paramInt)
  {
    this(19, null, null, null, paramInt, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false);
  }
  
  public qr(int paramInt, long paramLong)
  {
    this(19, null, null, null, paramInt, null, -1L, false, -1L, null, paramLong, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false);
  }
  
  qr(int paramInt1, String paramString1, String paramString2, List<String> paramList1, int paramInt2, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt3, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, qz paramqz, String paramString7, String paramString8, boolean paramBoolean8, boolean paramBoolean9, ss paramss, List<String> paramList4, List<String> paramList5, boolean paramBoolean10, qt paramqt, boolean paramBoolean11, String paramString9, List<String> paramList6, boolean paramBoolean12, String paramString10, sv paramsv, String paramString11, boolean paramBoolean13, boolean paramBoolean14)
  {
    a = paramInt1;
    b = paramString1;
    c = paramString2;
    if (paramList1 != null)
    {
      paramString1 = Collections.unmodifiableList(paramList1);
      d = paramString1;
      e = paramInt2;
      if (paramList2 == null) {
        break label339;
      }
      paramString1 = Collections.unmodifiableList(paramList2);
      label52:
      f = paramString1;
      g = paramLong1;
      h = paramBoolean1;
      i = paramLong2;
      if (paramList3 == null) {
        break label344;
      }
    }
    label339:
    label344:
    for (paramString1 = Collections.unmodifiableList(paramList3);; paramString1 = null)
    {
      j = paramString1;
      k = paramLong3;
      l = paramInt3;
      m = paramString3;
      n = paramLong4;
      o = paramString4;
      p = paramBoolean2;
      q = paramString5;
      r = paramString6;
      s = paramBoolean3;
      t = paramBoolean4;
      u = paramBoolean5;
      v = paramBoolean6;
      O = paramBoolean13;
      w = paramBoolean7;
      x = paramqz;
      y = paramString7;
      z = paramString8;
      if ((c == null) && (x != null))
      {
        paramString1 = (rc)x.a(rc.CREATOR);
        if ((paramString1 != null) && (!TextUtils.isEmpty(a))) {
          c = a;
        }
      }
      A = paramBoolean8;
      B = paramBoolean9;
      C = paramss;
      D = paramList4;
      E = paramList5;
      F = paramBoolean10;
      G = paramqt;
      H = paramBoolean11;
      I = paramString9;
      J = paramList6;
      K = paramBoolean12;
      L = paramString10;
      M = paramsv;
      N = paramString11;
      P = paramBoolean14;
      return;
      paramString1 = null;
      break;
      paramString1 = null;
      break label52;
    }
  }
  
  public qr(qo paramqo, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, String paramString7, boolean paramBoolean8, boolean paramBoolean9, ss paramss, List<String> paramList4, List<String> paramList5, boolean paramBoolean10, qt paramqt, boolean paramBoolean11, String paramString8, List<String> paramList6, boolean paramBoolean12, String paramString9, sv paramsv, String paramString10, boolean paramBoolean13, boolean paramBoolean14)
  {
    this(19, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt, paramString3, paramLong4, paramString4, paramBoolean2, paramString5, paramString6, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, null, null, paramString7, paramBoolean8, paramBoolean9, paramss, paramList4, paramList5, paramBoolean10, paramqt, paramBoolean11, paramString8, paramList6, paramBoolean12, paramString9, paramsv, paramString10, paramBoolean13, paramBoolean14);
    Q = paramqo;
  }
  
  public qr(qo paramqo, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean1, List<String> paramList3, long paramLong2, int paramInt, String paramString3, long paramLong3, String paramString4, String paramString5, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, String paramString6, boolean paramBoolean6, boolean paramBoolean7, ss paramss, List<String> paramList4, List<String> paramList5, boolean paramBoolean8, qt paramqt, boolean paramBoolean9, String paramString7, List<String> paramList6, boolean paramBoolean10, String paramString8, sv paramsv, String paramString9, boolean paramBoolean11, boolean paramBoolean12)
  {
    this(19, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, -1L, paramList3, paramLong2, paramInt, paramString3, paramLong3, paramString4, false, null, paramString5, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, false, null, null, paramString6, paramBoolean6, paramBoolean7, paramss, paramList4, paramList5, paramBoolean8, paramqt, paramBoolean9, paramString7, paramList6, paramBoolean10, paramString8, paramsv, paramString9, paramBoolean11, paramBoolean12);
    Q = paramqo;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if ((Q != null) && (Q.a >= 9) && (!TextUtils.isEmpty(c)))
    {
      x = new qz(new rc(c));
      c = null;
    }
    qs.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/qr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */