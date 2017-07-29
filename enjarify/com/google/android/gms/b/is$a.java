package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class is$a
  extends Binder
  implements is
{
  public is$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      String str = "com.google.android.gms.ads.internal.client.IAdClickListener";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.client.IAdClickListener";
      paramParcel1.enforceInterface(str);
      a();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/is$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */