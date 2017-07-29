package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class f
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator CREATOR;
  final int a;
  public IBinder b;
  public com.google.android.gms.common.a c;
  public boolean d;
  public boolean e;
  
  static
  {
    g localg = new com/google/android/gms/common/internal/g;
    localg.<init>();
    CREATOR = localg;
  }
  
  f(int paramInt, IBinder paramIBinder, com.google.android.gms.common.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramInt;
    b = paramIBinder;
    c = parama;
    d = paramBoolean1;
    e = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof f;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (f)paramObject;
        Object localObject1 = c;
        Object localObject2 = c;
        bool2 = ((com.google.android.gms.common.a)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = z.a.a(b);
          localObject2 = z.a.a(b);
          bool2 = localObject1.equals(localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/common/internal/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */