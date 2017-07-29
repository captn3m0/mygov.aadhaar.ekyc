package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Iterator;

public final class cl
  extends a
  implements Iterable
{
  public static final Parcelable.Creator CREATOR;
  final Bundle a;
  
  static
  {
    cm localcm = new com/google/android/gms/b/cm;
    localcm.<init>();
    CREATOR = localcm;
  }
  
  cl(Bundle paramBundle)
  {
    a = paramBundle;
  }
  
  public final Bundle a()
  {
    Bundle localBundle1 = new android/os/Bundle;
    Bundle localBundle2 = a;
    localBundle1.<init>(localBundle2);
    return localBundle1;
  }
  
  final Object a(String paramString)
  {
    return a.get(paramString);
  }
  
  public final Iterator iterator()
  {
    cl.1 local1 = new com/google/android/gms/b/cl$1;
    local1.<init>(this);
    return local1;
  }
  
  public final String toString()
  {
    return a.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cm.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/cl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */