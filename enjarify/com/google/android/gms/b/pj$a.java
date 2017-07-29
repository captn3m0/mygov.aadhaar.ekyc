package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class pj$a
  extends Binder
  implements pj
{
  public static pj a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (pj)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof pj;
        if (bool)
        {
          localObject = (pj)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/pj$a$a;
      ((pj.a.a)localObject).<init>(paramIBinder);
    }
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
      Object localObject = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      localObject = a((a)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/pj$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */