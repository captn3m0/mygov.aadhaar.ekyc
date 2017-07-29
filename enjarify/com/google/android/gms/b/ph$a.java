package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ph$a
  extends Binder
  implements ph
{
  public ph$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool2 = bool1)
      {
        return bool2;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener";
    paramParcel1.enforceInterface((String)localObject);
    IBinder localIBinder = paramParcel1.readStrongBinder();
    if (localIBinder == null)
    {
      bool2 = false;
      localObject = null;
    }
    for (;;)
    {
      a((pg)localObject);
      paramParcel2.writeNoException();
      bool2 = bool1;
      break;
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      if (localObject != null)
      {
        boolean bool3 = localObject instanceof pg;
        if (bool3)
        {
          localObject = (pg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/pg$a$a;
      ((pg.a.a)localObject).<init>(localIBinder);
    }
  }
}


/* Location:              com/google/android/gms/b/ph$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */