package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class pg$a
  extends Binder
  implements pg
{
  public pg$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
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
      String str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase";
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      str = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      a(i);
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      b(i);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/pg$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */