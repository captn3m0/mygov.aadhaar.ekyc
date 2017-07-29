package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public final class ij
  implements Parcelable.Creator
{
  static void a(ih paramih, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    long l = b;
    c.a(paramParcel, 2, l);
    Object localObject = c;
    c.a(paramParcel, 3, (Bundle)localObject);
    j = d;
    c.b(paramParcel, 4, j);
    localObject = e;
    c.a(paramParcel, 5, (List)localObject);
    boolean bool1 = f;
    c.a(paramParcel, 6, bool1);
    int k = g;
    c.b(paramParcel, 7, k);
    boolean bool2 = h;
    c.a(paramParcel, 8, bool2);
    localObject = paramih.i;
    c.a(paramParcel, 9, (String)localObject);
    localObject = paramih.j;
    c.a(paramParcel, 10, (Parcelable)localObject, paramInt);
    localObject = paramih.k;
    c.a(paramParcel, 11, (Parcelable)localObject, paramInt);
    localObject = paramih.l;
    c.a(paramParcel, 12, (String)localObject);
    localObject = m;
    c.a(paramParcel, 13, (Bundle)localObject);
    localObject = n;
    c.a(paramParcel, 14, (Bundle)localObject);
    localObject = o;
    c.a(paramParcel, 15, (List)localObject);
    localObject = p;
    c.a(paramParcel, 16, (String)localObject);
    localObject = q;
    c.a(paramParcel, 17, (String)localObject);
    bool2 = r;
    c.a(paramParcel, 18, bool2);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ij.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */