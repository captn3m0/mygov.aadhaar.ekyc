package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bu$a$a
  implements bu
{
  private IBinder a;
  
  bu$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final bs a(bq parambq)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.gass.internal.IGassService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (parambq != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          parambq.writeToParcel(localParcel1, 0);
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
          localObject1 = bs.CREATOR;
          localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
          localObject1 = (bs)localObject1;
          return (bs)localObject1;
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


/* Location:              com/google/android/gms/b/bu$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */