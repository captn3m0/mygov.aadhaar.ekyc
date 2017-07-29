package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class jb$a$a
  implements jb
{
  private IBinder a;
  
  jb$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final long a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      long l = localParcel2.readLong();
      return l;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/jb$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */