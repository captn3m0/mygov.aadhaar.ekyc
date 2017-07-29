package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class iw$a
  extends Binder
  implements iw
{
  public static iw a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (iw)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof iw;
        if (bool)
        {
          localObject = (iw)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/iw$a$a;
      ((iw.a.a)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      String str = paramParcel1.readString();
      oc localoc = oc.a.a(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      localObject = a((a)localObject, str, localoc, i);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/iw$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */