package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class oc$a$a
  implements oc
{
  private IBinder a;
  
  oc$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final od a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = a;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = od.a.a((IBinder)localObject1);
      return (od)localObject1;
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
  
  public final boolean b(String paramString)
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localParcel1.writeString(paramString);
      localObject3 = a;
      int i = 2;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              com/google/android/gms/b/oc$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */