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
  public static final Parcelable.Creator CREATOR;
  final int a;
  public final String b;
  
  static
  {
    o localo = new com/google/android/gms/common/api/o;
    localo.<init>();
    CREATOR = localo;
  }
  
  Scope(int paramInt, String paramString)
  {
    String str = "scopeUri must not be null or empty";
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      str = String.valueOf(str);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
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
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof Scope;
      String str1;
      if (!bool)
      {
        bool = false;
        str1 = null;
      }
      else
      {
        str1 = b;
        paramObject = (Scope)paramObject;
        String str2 = b;
        bool = str1.equals(str2);
      }
    }
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */