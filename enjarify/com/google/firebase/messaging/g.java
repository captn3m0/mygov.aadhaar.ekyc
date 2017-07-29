package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class g
  implements Parcelable.Creator
{
  static void a(a parama, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    Bundle localBundle = a;
    c.a(paramParcel, 2, localBundle);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/firebase/messaging/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */