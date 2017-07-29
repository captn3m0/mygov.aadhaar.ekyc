package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public final class b
  implements Parcelable.Creator
{
  static void a(GoogleSignInOptions paramGoogleSignInOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    int j = g;
    c.b(paramParcel, 1, j);
    Object localObject = paramGoogleSignInOptions.a();
    c.b(paramParcel, 2, (List)localObject);
    localObject = h;
    c.a(paramParcel, 3, (Parcelable)localObject, paramInt);
    boolean bool = paramGoogleSignInOptions.i;
    c.a(paramParcel, 4, bool);
    bool = paramGoogleSignInOptions.j;
    c.a(paramParcel, 5, bool);
    bool = k;
    c.a(paramParcel, 6, bool);
    localObject = l;
    c.a(paramParcel, 7, (String)localObject);
    localObject = m;
    c.a(paramParcel, 8, (String)localObject);
    localObject = n;
    c.b(paramParcel, 9, (List)localObject);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */