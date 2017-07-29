package com.google.android.gms.b;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class pk$a
  extends Binder
  implements pk
{
  public pk$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    String str = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult";
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
      str = b();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
      Object localObject = c();
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(j);
        ((Intent)localObject).writeToParcel(paramParcel2, j);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult";
        paramParcel1.enforceInterface(str);
        i = d();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
        continue;
        localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult";
        paramParcel1.enforceInterface((String)localObject);
        boolean bool = a();
        paramParcel2.writeNoException();
        if (bool) {
          i = j;
        }
        paramParcel2.writeInt(i);
        continue;
        str = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult";
        paramParcel1.enforceInterface(str);
        e();
        paramParcel2.writeNoException();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/pk$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */