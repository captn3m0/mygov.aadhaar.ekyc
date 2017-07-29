package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.b.a;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class Status
  extends a
  implements g, ReflectedParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new p();
  public static final Status a = new Status(0);
  public static final Status b = new Status(14);
  public static final Status c = new Status(8);
  public static final Status d = new Status(15);
  public static final Status e = new Status(16);
  public static final Status f = new Status(17);
  public static final Status g = new Status(18);
  final int h;
  public final int i;
  public final String j;
  final PendingIntent k;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    h = paramInt1;
    i = paramInt2;
    j = paramString;
    k = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  public final Status a()
  {
    return this;
  }
  
  public final boolean b()
  {
    return i <= 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    do
    {
      return false;
      paramObject = (Status)paramObject;
    } while ((h != h) || (i != i) || (!com.google.android.gms.common.internal.b.a(j, j)) || (!com.google.android.gms.common.internal.b.a(k, k)));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(h), Integer.valueOf(i), j, k });
  }
  
  public final String toString()
  {
    b.a locala = com.google.android.gms.common.internal.b.a(this);
    if (j != null) {}
    for (String str = j;; str = b.a(i)) {
      return locala.a("statusCode", str).a("resolution", k).toString();
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    p.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/common/api/Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */