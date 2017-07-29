package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class gt$a
  extends Binder
  implements gt
{
  public static gt a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (gt)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof gt;
        if (bool)
        {
          localObject = (gt)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/gt$a$a;
      ((gt.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      String str = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      str = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
      paramParcel1.enforceInterface(str);
      int k = paramParcel1.readInt();
      if (k != 0) {
        k = j;
      }
      for (;;)
      {
        boolean bool = a(k);
        paramParcel2.writeNoException();
        if (bool) {
          i = j;
        }
        paramParcel2.writeInt(i);
        break;
        bool = false;
        str = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      str = paramParcel1.readString();
      str = a(str);
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      str = paramParcel1.readString();
      int m = paramParcel1.readInt();
      if (m != 0) {
        i = j;
      }
      a(str, i);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/gt$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */