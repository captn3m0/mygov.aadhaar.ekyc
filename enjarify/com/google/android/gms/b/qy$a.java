package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class qy$a
  extends Binder
  implements qy
{
  public qy$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
  }
  
  public IBinder asBinder()
  {
    return this;
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
        localObject = "com.google.android.gms.ads.internal.request.IAdResponseListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.request.IAdResponseListener";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (qr)qr.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      a((qr)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              com/google/android/gms/b/qy$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */