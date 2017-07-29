package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Collections;
import java.util.List;

public final class qr
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final boolean A;
  public final boolean B;
  public final ss C;
  public final List D;
  public final List E;
  public final boolean F;
  public final qt G;
  public final boolean H;
  public String I;
  public final List J;
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
  public final List d;
  public final int e;
  public final List f;
  public final long g;
  public final boolean h;
  public final long i;
  public final List j;
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
  
  static
  {
    qs localqs = new com/google/android/gms/b/qs;
    localqs.<init>();
    CREATOR = localqs;
  }
  
  public qr(int paramInt)
  {
    this(19, null, null, null, paramInt, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false);
  }
  
  public qr(int paramInt, long paramLong)
  {
    this(19, null, null, null, paramInt, null, -1, false, -1, null, paramLong, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false);
  }
  
  qr(int paramInt1, String paramString1, String paramString2, List paramList1, int paramInt2, List paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List paramList3, long paramLong3, int paramInt3, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, qz paramqz, String paramString7, String paramString8, boolean paramBoolean8, boolean paramBoolean9, ss paramss, List paramList4, List paramList5, boolean paramBoolean10, qt paramqt, boolean paramBoolean11, String paramString9, List paramList6, boolean paramBoolean12, String paramString10, sv paramsv, String paramString11, boolean paramBoolean13, boolean paramBoolean14)
  {
    a = paramInt1;
    b = paramString1;
    c = paramString2;
    if (paramList1 != null)
    {
      localObject1 = Collections.unmodifiableList(paramList1);
      d = ((List)localObject1);
      e = paramInt2;
      if (paramList2 == null) {
        break label378;
      }
      localObject1 = Collections.unmodifiableList(paramList2);
      label55:
      f = ((List)localObject1);
      g = paramLong1;
      h = paramBoolean1;
      i = paramLong2;
      if (paramList3 == null) {
        break label384;
      }
    }
    label378:
    label384:
    for (Object localObject1 = Collections.unmodifiableList(paramList3);; localObject1 = null)
    {
      j = ((List)localObject1);
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
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = x;
        if (localObject1 != null)
        {
          localObject1 = x;
          Object localObject2 = rc.CREATOR;
          localObject1 = (rc)((qz)localObject1).a((Parcelable.Creator)localObject2);
          if (localObject1 != null)
          {
            localObject2 = a;
            boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
            if (!bool)
            {
              localObject1 = a;
              c = ((String)localObject1);
            }
          }
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
      localObject1 = null;
      break;
      localObject1 = null;
      break label55;
    }
  }
  
  public qr(qo paramqo, String paramString1, String paramString2, List paramList1, List paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List paramList3, long paramLong3, int paramInt, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, String paramString7, boolean paramBoolean8, boolean paramBoolean9, ss paramss, List paramList4, List paramList5, boolean paramBoolean10, qt paramqt, boolean paramBoolean11, String paramString8, List paramList6, boolean paramBoolean12, String paramString9, sv paramsv, String paramString10, boolean paramBoolean13, boolean paramBoolean14)
  {
    this(19, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt, paramString3, paramLong4, paramString4, paramBoolean2, paramString5, paramString6, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, null, null, paramString7, paramBoolean8, paramBoolean9, paramss, paramList4, paramList5, paramBoolean10, paramqt, paramBoolean11, paramString8, paramList6, paramBoolean12, paramString9, paramsv, paramString10, paramBoolean13, paramBoolean14);
    Q = paramqo;
  }
  
  public qr(qo paramqo, String paramString1, String paramString2, List paramList1, List paramList2, long paramLong1, boolean paramBoolean1, List paramList3, long paramLong2, int paramInt, String paramString3, long paramLong3, String paramString4, String paramString5, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, String paramString6, boolean paramBoolean6, boolean paramBoolean7, ss paramss, List paramList4, List paramList5, boolean paramBoolean8, qt paramqt, boolean paramBoolean9, String paramString7, List paramList6, boolean paramBoolean10, String paramString8, sv paramsv, String paramString9, boolean paramBoolean11, boolean paramBoolean12)
  {
    this(19, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, -1, paramList3, paramLong2, paramInt, paramString3, paramLong3, paramString4, false, null, paramString5, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, false, null, null, paramString6, paramBoolean6, paramBoolean7, paramss, paramList4, paramList5, paramBoolean8, paramqt, paramBoolean9, paramString7, paramList6, paramBoolean10, paramString8, paramsv, paramString9, paramBoolean11, paramBoolean12);
    Q = paramqo;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = Q;
    if (localObject != null)
    {
      localObject = Q;
      int i1 = a;
      int i2 = 9;
      if (i1 >= i2)
      {
        localObject = c;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject);
        if (!bool)
        {
          localObject = new com/google/android/gms/b/qz;
          rc localrc = new com/google/android/gms/b/rc;
          String str = c;
          localrc.<init>(str);
          ((qz)localObject).<init>(localrc);
          x = ((qz)localObject);
          bool = false;
          localObject = null;
          c = null;
        }
      }
    }
    qs.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/qr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */