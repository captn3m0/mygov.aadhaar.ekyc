package com.google.android.gms.iid;

import android.os.Binder;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class a$a
  extends Binder
  implements a
{
  public static a a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (a)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
      if (localObject != null)
      {
        boolean bool = localObject instanceof a;
        if (bool)
        {
          localObject = (a)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/iid/a$a$a;
      ((a.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.iid.IMessengerCompat";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.iid.IMessengerCompat";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Message)Message.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      a((Message)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              com/google/android/gms/iid/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */