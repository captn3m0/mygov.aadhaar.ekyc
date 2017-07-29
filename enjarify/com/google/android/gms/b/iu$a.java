package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class iu$a
  extends Binder
  implements iu
{
  public iu$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
  }
  
  public static iu a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (iu)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
      if (localObject != null)
      {
        boolean bool = localObject instanceof iu;
        if (bool)
        {
          localObject = (iu)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/iu$a$a;
      ((iu.a.a)localObject).<init>(paramIBinder);
    }
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
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
      for (;;)
      {
        return i;
        localObject = "com.google.android.gms.ads.internal.client.IAdLoader";
        paramParcel2.writeString((String)localObject);
        continue;
        localObject = "com.google.android.gms.ads.internal.client.IAdLoader";
        paramParcel1.enforceInterface((String)localObject);
        int j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject = (ih)ih.CREATOR.createFromParcel(paramParcel1);; localObject = null)
        {
          a((ih)localObject);
          paramParcel2.writeNoException();
          break;
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
        localObject = a();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.client.IAdLoader";
    paramParcel1.enforceInterface((String)localObject);
    int k = b();
    paramParcel2.writeNoException();
    if (k != 0) {
      k = i;
    }
    for (;;)
    {
      paramParcel2.writeInt(k);
      break;
      int m = 0;
      localObject = null;
    }
  }
}


/* Location:              com/google/android/gms/b/iu$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */