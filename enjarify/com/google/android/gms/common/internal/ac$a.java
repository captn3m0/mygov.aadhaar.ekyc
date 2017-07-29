package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class ac$a
  extends Binder
  implements ac
{
  public ac$a()
  {
    attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.common.internal.IGmsCallbacks";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.common.internal.IGmsCallbacks";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      IBinder localIBinder = paramParcel1.readStrongBinder();
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(i, localIBinder, (Bundle)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.common.internal.IGmsCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      int k = paramParcel1.readInt();
      if (k != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(i, (Bundle)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/ac$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */