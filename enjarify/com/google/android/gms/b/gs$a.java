package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class gs$a
  extends Binder
  implements gs
{
  public static gs a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (gs)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof gs;
        if (bool)
        {
          localObject = (gs)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/gs$a$a;
      ((gs.a.a)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.ads.adshield.internal.IAdShieldCreator";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
      localObject = paramParcel1.readString();
      a locala = a.a.a(paramParcel1.readStrongBinder());
      localObject = a((String)localObject, locala);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
      localObject = paramParcel1.readString();
      locala = a.a.a(paramParcel1.readStrongBinder());
      localObject = b((String)localObject, locala);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/gs$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */