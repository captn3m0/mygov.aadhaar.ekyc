package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class pl$a
  extends Binder
  implements pl
{
  public pl$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    int k;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      for (;;)
      {
        return i;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener";
        paramParcel2.writeString((String)localObject);
      }
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      localObject = paramParcel1.readString();
      int j = a((String)localObject);
      paramParcel2.writeNoException();
      if (j != 0) {
        j = i;
      }
      for (;;)
      {
        paramParcel2.writeInt(j);
        break;
        k = 0;
        localObject = null;
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener";
    paramParcel1.enforceInterface((String)localObject);
    IBinder localIBinder = paramParcel1.readStrongBinder();
    if (localIBinder == null)
    {
      k = 0;
      localObject = null;
    }
    for (;;)
    {
      a((pk)localObject);
      paramParcel2.writeNoException();
      break;
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
      if (localObject != null)
      {
        boolean bool = localObject instanceof pk;
        if (bool)
        {
          localObject = (pk)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/pk$a$a;
      ((pk.a.a)localObject).<init>(localIBinder);
    }
  }
}


/* Location:              com/google/android/gms/b/pl$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */