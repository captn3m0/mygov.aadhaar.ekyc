package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class bs
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final int a;
  bf.a b;
  byte[] c;
  
  static
  {
    bt localbt = new com/google/android/gms/b/bt;
    localbt.<init>();
    CREATOR = localbt;
  }
  
  bs(int paramInt, byte[] paramArrayOfByte)
  {
    a = paramInt;
    b = null;
    c = paramArrayOfByte;
    a();
  }
  
  final void a()
  {
    Object localObject = b;
    if (localObject == null)
    {
      localObject = c;
      if (localObject == null) {}
    }
    do
    {
      return;
      localObject = b;
      if (localObject == null) {
        break;
      }
      localObject = c;
    } while (localObject == null);
    localObject = b;
    if (localObject != null)
    {
      localObject = c;
      if (localObject != null)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Invalid internal representation - full");
        throw ((Throwable)localObject);
      }
    }
    localObject = b;
    if (localObject == null)
    {
      localObject = c;
      if (localObject == null)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Invalid internal representation - empty");
        throw ((Throwable)localObject);
      }
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Impossible");
    throw ((Throwable)localObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bt.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/bs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */