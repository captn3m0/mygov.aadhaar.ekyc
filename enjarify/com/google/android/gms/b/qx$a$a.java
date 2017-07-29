package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class qx$a$a
  implements qx
{
  private IBinder a;
  
  qx$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final qr a(qo paramqo)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.ads.internal.request.IAdRequestService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramqo != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramqo.writeToParcel(localParcel1, 0);
        }
        for (;;)
        {
          localObject1 = a;
          int j = 1;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i == 0) {
            break;
          }
          localObject1 = qr.CREATOR;
          localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
          localObject1 = (qr)localObject1;
          return (qr)localObject1;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final void a(qo paramqo, qy paramqy)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.ads.internal.request.IAdRequestService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramqo != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramqo.writeToParcel(localParcel1, 0);
        }
        while (paramqy != null)
        {
          localObject1 = paramqy.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = a;
          int j = 2;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/qx$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */