package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public final class sw
  implements Parcelable.Creator
{
  static void a(sv paramsv, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    Object localObject = a;
    c.a(paramParcel, 2, (String)localObject);
    localObject = b;
    c.a(paramParcel, 3, (String)localObject);
    boolean bool = c;
    c.a(paramParcel, 4, bool);
    bool = d;
    c.a(paramParcel, 5, bool);
    localObject = e;
    c.a(paramParcel, 6, (List)localObject);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/sw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */