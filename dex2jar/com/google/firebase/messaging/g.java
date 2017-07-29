package com.google.firebase.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class g
  implements Parcelable.Creator<a>
{
  static void a(a parama, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 2, a);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/firebase/messaging/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */