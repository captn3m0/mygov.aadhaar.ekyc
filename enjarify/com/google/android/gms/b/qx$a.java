package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class qx$a
  extends Binder
  implements qx
{
  public qx$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
  }
  
  public static qx a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (qx)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof qx;
        if (bool)
        {
          localObject = (qx)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/qx$a$a;
      ((qx.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool2 = i)
      {
        return bool2;
        localObject2 = "com.google.android.gms.ads.internal.request.IAdRequestService";
        paramParcel2.writeString((String)localObject2);
      }
    case 1: 
      localObject2 = "com.google.android.gms.ads.internal.request.IAdRequestService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (qo)qo.CREATOR.createFromParcel(paramParcel1);
        label110:
        localObject2 = a((qo)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 == null) {
          break label157;
        }
        paramParcel2.writeInt(i);
        ((qr)localObject2).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        j = i;
        break;
        j = 0;
        localObject2 = null;
        break label110;
        label157:
        j = 0;
        localObject2 = null;
        paramParcel2.writeInt(0);
      }
    }
    Object localObject2 = "com.google.android.gms.ads.internal.request.IAdRequestService";
    paramParcel1.enforceInterface((String)localObject2);
    int j = paramParcel1.readInt();
    Object localObject3;
    label210:
    IBinder localIBinder;
    if (j != 0)
    {
      localObject2 = (qo)qo.CREATOR.createFromParcel(paramParcel1);
      localObject3 = localObject2;
      localIBinder = paramParcel1.readStrongBinder();
      if (localIBinder != null) {
        break label246;
      }
    }
    for (;;)
    {
      a((qo)localObject3, (qy)localObject1);
      paramParcel2.writeNoException();
      j = i;
      break;
      localObject3 = null;
      break label210;
      label246:
      localObject2 = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
      if (localObject2 != null)
      {
        bool1 = localObject2 instanceof qy;
        if (bool1)
        {
          localObject2 = (qy)localObject2;
          localObject1 = localObject2;
          continue;
        }
      }
      localObject1 = new com/google/android/gms/b/qy$a$a;
      ((qy.a.a)localObject1).<init>(localIBinder);
    }
  }
}


/* Location:              com/google/android/gms/b/qx$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */