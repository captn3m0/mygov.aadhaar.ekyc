package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public final class ei
  implements Parcelable.Creator
{
  static void a(eh parameh, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    boolean bool = b;
    c.a(paramParcel, 2, bool);
    List localList = c;
    c.b(paramParcel, 3, localList);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/b/ei.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */