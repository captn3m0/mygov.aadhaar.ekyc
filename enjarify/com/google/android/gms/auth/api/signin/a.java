package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public final class a
  implements Parcelable.Creator
{
  static void a(GoogleSignInAccount paramGoogleSignInAccount, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = b;
    c.b(paramParcel, 1, j);
    Object localObject = c;
    c.a(paramParcel, 2, (String)localObject);
    localObject = d;
    c.a(paramParcel, 3, (String)localObject);
    localObject = e;
    c.a(paramParcel, 4, (String)localObject);
    localObject = f;
    c.a(paramParcel, 5, (String)localObject);
    localObject = g;
    c.a(paramParcel, 6, (Parcelable)localObject, paramInt);
    localObject = h;
    c.a(paramParcel, 7, (String)localObject);
    long l = paramGoogleSignInAccount.i;
    c.a(paramParcel, 8, l);
    localObject = paramGoogleSignInAccount.j;
    c.a(paramParcel, 9, (String)localObject);
    localObject = k;
    c.b(paramParcel, 10, (List)localObject);
    localObject = paramGoogleSignInAccount.l;
    c.a(paramParcel, 11, (String)localObject);
    localObject = m;
    c.a(paramParcel, 12, (String)localObject);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */