package com.google.android.gms.auth.api.signin.a;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<b>
{
  static void a(b paramb, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, a);
    c.b(paramParcel, 2, b);
    c.a(paramParcel, 3, c);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */