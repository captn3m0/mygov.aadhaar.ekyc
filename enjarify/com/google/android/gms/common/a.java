package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.b.a;
import java.util.Arrays;

public final class a
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator CREATOR;
  public static final a a;
  final int b;
  public final int c;
  public final PendingIntent d;
  public final String e;
  
  static
  {
    Object localObject = new com/google/android/gms/common/a;
    ((a)localObject).<init>(0);
    a = (a)localObject;
    localObject = new com/google/android/gms/common/j;
    ((j)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  public a(int paramInt)
  {
    this(paramInt, null, (byte)0);
  }
  
  a(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    b = paramInt1;
    c = paramInt2;
    d = paramPendingIntent;
    e = paramString;
  }
  
  public a(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, (byte)0);
  }
  
  private a(int paramInt, PendingIntent paramPendingIntent, byte paramByte)
  {
    this(1, paramInt, paramPendingIntent, null);
  }
  
  static String a(int paramInt)
  {
    Object localObject2;
    switch (paramInt)
    {
    default: 
      int i = 31;
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(i);
      localObject2 = ((StringBuilder)localObject1).append("UNKNOWN_ERROR_CODE(").append(paramInt);
      localObject1 = ")";
      localObject2 = (String)localObject1;
    }
    for (;;)
    {
      return (String)localObject2;
      localObject2 = "SUCCESS";
      continue;
      localObject2 = "SERVICE_MISSING";
      continue;
      localObject2 = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      localObject2 = "SERVICE_DISABLED";
      continue;
      localObject2 = "SIGN_IN_REQUIRED";
      continue;
      localObject2 = "INVALID_ACCOUNT";
      continue;
      localObject2 = "RESOLUTION_REQUIRED";
      continue;
      localObject2 = "NETWORK_ERROR";
      continue;
      localObject2 = "INTERNAL_ERROR";
      continue;
      localObject2 = "SERVICE_INVALID";
      continue;
      localObject2 = "DEVELOPER_ERROR";
      continue;
      localObject2 = "LICENSE_CHECK_FAILED";
      continue;
      localObject2 = "CANCELED";
      continue;
      localObject2 = "TIMEOUT";
      continue;
      localObject2 = "INTERRUPTED";
      continue;
      localObject2 = "API_UNAVAILABLE";
      continue;
      localObject2 = "SIGN_IN_FAILED";
      continue;
      localObject2 = "SERVICE_UPDATING";
      continue;
      localObject2 = "SERVICE_MISSING_PERMISSION";
      continue;
      localObject2 = "RESTRICTED_PROFILE";
      continue;
      localObject2 = "API_VERSION_UPDATE_REQUIRED";
      continue;
      localObject2 = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
      continue;
      localObject2 = "UNFINISHED";
      continue;
      localObject2 = "UNKNOWN";
    }
  }
  
  public final boolean a()
  {
    int i = c;
    PendingIntent localPendingIntent;
    if (i != 0)
    {
      localPendingIntent = d;
      if (localPendingIntent != null) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localPendingIntent = null;
    }
  }
  
  public final boolean b()
  {
    int i = c;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof a;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (a)paramObject;
        int i = c;
        int j = c;
        if (i == j)
        {
          Object localObject1 = d;
          Object localObject2 = d;
          boolean bool3 = b.a(localObject1, localObject2);
          if (bool3)
          {
            localObject1 = e;
            localObject2 = e;
            bool3 = b.a(localObject1, localObject2);
            if (bool3) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(c);
    arrayOfObject[0] = localObject;
    localObject = d;
    arrayOfObject[1] = localObject;
    localObject = e;
    arrayOfObject[2] = localObject;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    b.a locala = b.a(this);
    Object localObject = a(c);
    locala = locala.a("statusCode", localObject);
    localObject = d;
    locala = locala.a("resolution", localObject);
    localObject = e;
    return locala.a("message", localObject).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/common/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */