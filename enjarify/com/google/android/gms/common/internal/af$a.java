package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class af$a
  extends Binder
  implements af
{
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
        localObject = "com.google.android.gms.common.internal.IResolveAccountCallbacks";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.common.internal.IResolveAccountCallbacks";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (f)f.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      a((f)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/af$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */