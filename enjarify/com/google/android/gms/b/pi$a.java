package com.google.android.gms.b;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class pi$a
  extends Binder
  implements pi
{
  public pi$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
  }
  
  public static pi a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (pi)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
      if (localObject != null)
      {
        boolean bool = localObject instanceof pi;
        if (bool)
        {
          localObject = (pi)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/pi$a$a;
      ((pi.a.a)localObject).<init>(paramIBinder);
    }
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
    case 1598968902: 
    case 1: 
    case 2: 
      for (;;)
      {
        return bool;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager";
        paramParcel2.writeString((String)localObject);
        bool = i;
        continue;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager";
        paramParcel1.enforceInterface((String)localObject);
        a();
        paramParcel2.writeNoException();
        bool = i;
        continue;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager";
        paramParcel1.enforceInterface((String)localObject);
        b();
        paramParcel2.writeNoException();
        bool = i;
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager";
    paramParcel1.enforceInterface((String)localObject);
    int k = paramParcel1.readInt();
    int m = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      a(k, m, (Intent)localObject);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              com/google/android/gms/b/pi$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */