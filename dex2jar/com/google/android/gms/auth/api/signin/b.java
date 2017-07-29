package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class b
  implements Parcelable.Creator<GoogleSignInOptions>
{
  static void a(GoogleSignInOptions paramGoogleSignInOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, g);
    c.b(paramParcel, 2, paramGoogleSignInOptions.a());
    c.a(paramParcel, 3, h, paramInt);
    c.a(paramParcel, 4, paramGoogleSignInOptions.i);
    c.a(paramParcel, 5, j);
    c.a(paramParcel, 6, k);
    c.a(paramParcel, 7, l);
    c.a(paramParcel, 8, m);
    c.b(paramParcel, 9, n);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */