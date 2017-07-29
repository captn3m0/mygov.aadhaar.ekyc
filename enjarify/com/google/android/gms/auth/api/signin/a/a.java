package com.google.android.gms.auth.api.signin.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator
{
  static void a(b paramb, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    int j = a;
    c.b(paramParcel, 1, j);
    j = b;
    c.b(paramParcel, 2, j);
    Bundle localBundle = c;
    c.a(paramParcel, 3, localBundle);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */