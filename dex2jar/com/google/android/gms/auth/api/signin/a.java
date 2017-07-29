package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<GoogleSignInAccount>
{
  static void a(GoogleSignInAccount paramGoogleSignInAccount, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, b);
    c.a(paramParcel, 2, c);
    c.a(paramParcel, 3, d);
    c.a(paramParcel, 4, e);
    c.a(paramParcel, 5, f);
    c.a(paramParcel, 6, g, paramInt);
    c.a(paramParcel, 7, h);
    c.a(paramParcel, 8, paramGoogleSignInAccount.i);
    c.a(paramParcel, 9, j);
    c.b(paramParcel, 10, k);
    c.a(paramParcel, 11, l);
    c.a(paramParcel, 12, m);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */