package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class of$a$a
  implements of
{
  private IBinder a;
  
  of$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final int a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
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


/* Location:              com/google/android/gms/b/of$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */