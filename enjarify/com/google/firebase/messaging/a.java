package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;

public final class a
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator CREATOR;
  public Bundle a;
  public Map b;
  
  static
  {
    g localg = new com/google/firebase/messaging/g;
    localg.<init>();
    CREATOR = localg;
  }
  
  a(Bundle paramBundle)
  {
    a = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel);
  }
}


/* Location:              com/google/firebase/messaging/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */