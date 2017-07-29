package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class Scope
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Scope> CREATOR = new o();
  final int a;
  public final String b;
  
  Scope(int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException(String.valueOf("scopeUri must not be null or empty"));
    }
    a = paramInt;
    b = paramString;
  }
  
  public Scope(String paramString)
  {
    this(1, paramString);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Scope)) {
      return false;
    }
    return b.equals(b);
  }
  
  public final int hashCode()
  {
    return b.hashCode();
  }
  
  public final String toString()
  {
    return b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/common/api/Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */