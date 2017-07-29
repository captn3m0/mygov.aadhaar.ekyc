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
  public static final Parcelable.Creator CREATOR;
  public static final Status a;
  public static final Status b;
  public static final Status c;
  public static final Status d;
  public static final Status e;
  public static final Status f;
  public static final Status g;
  final int h;
  public final int i;
  public final String j;
  final PendingIntent k;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(0);
    a = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(14);
    b = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(8);
    c = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(15);
    d = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(16);
    e = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(17);
    f = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(18);
    g = (Status)localObject;
    localObject = new com/google/android/gms/common/api/p;
    ((p)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
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
    int m = i;
    if (m <= 0) {}
    int n;
    for (m = 1;; n = 0) {
      return m;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof Status;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (Status)paramObject;
      int m = h;
      int n = h;
      if (m == n)
      {
        m = i;
        n = i;
        if (m == n)
        {
          Object localObject1 = j;
          Object localObject2 = j;
          boolean bool3 = com.google.android.gms.common.internal.b.a(localObject1, localObject2);
          if (bool3)
          {
            localObject1 = k;
            localObject2 = k;
            bool3 = com.google.android.gms.common.internal.b.a(localObject1, localObject2);
            if (bool3) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = Integer.valueOf(h);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(i);
    arrayOfObject[1] = localObject;
    localObject = j;
    arrayOfObject[2] = localObject;
    localObject = k;
    arrayOfObject[3] = localObject;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    b.a locala = com.google.android.gms.common.internal.b.a(this);
    Object localObject1 = "statusCode";
    Object localObject2 = j;
    if (localObject2 != null) {}
    int m;
    for (localObject2 = j;; localObject2 = b.a(m))
    {
      localObject2 = locala.a((String)localObject1, localObject2);
      localObject1 = k;
      return ((b.a)localObject2).a("resolution", localObject1).toString();
      m = i;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    p.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/common/api/Status.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */