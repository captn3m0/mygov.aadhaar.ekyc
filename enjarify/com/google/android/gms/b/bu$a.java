package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class bu$a
  extends Binder
  implements bu
{
  public static bu a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (bu)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof bu;
        if (bool)
        {
          localObject = (bu)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/bu$a$a;
      ((bu.a.a)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.gass.internal.IGassService";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.gass.internal.IGassService";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0)
    {
      localObject = (bq)bq.CREATOR.createFromParcel(paramParcel1);
      label98:
      localObject = a((bq)localObject);
      paramParcel2.writeNoException();
      if (localObject == null) {
        break label145;
      }
      paramParcel2.writeInt(i);
      ((bs)localObject).writeToParcel(paramParcel2, i);
    }
    for (;;)
    {
      j = i;
      break;
      j = 0;
      localObject = null;
      break label98;
      label145:
      j = 0;
      localObject = null;
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:              com/google/android/gms/b/bu$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */