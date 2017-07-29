package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public abstract class ab$a
  extends Binder
  implements ab
{
  public ab$a()
  {
    attachInterface(this, "com.google.android.gms.common.internal.ICertData");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.common.internal.ICertData";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.ICertData");
      localObject = a();
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((a)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        bool = i;
        break;
        bool = false;
      }
      localObject = "com.google.android.gms.common.internal.ICertData";
      paramParcel1.enforceInterface((String)localObject);
      int j = b();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      j = i;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/ab$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */