package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class iy$a
  extends Binder
  implements iy
{
  public static iy a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (iy)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof iy;
        if (bool)
        {
          localObject = (iy)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/iy$a$a;
      ((iy.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject2 = "com.google.android.gms.ads.internal.client.IAdManagerCreator";
      paramParcel2.writeString((String)localObject2);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      localObject2 = paramParcel1.readStrongBinder();
      a locala = a.a.a((IBinder)localObject2);
      int j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (il)il.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
      }
      String str = paramParcel1.readString();
      oc localoc = oc.a.a(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      localObject2 = this;
      localObject2 = a(locala, (il)localObject1, str, localoc, k);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      localObject2 = paramParcel1.readStrongBinder();
      locala = a.a.a((IBinder)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (il)il.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
      }
      str = paramParcel1.readString();
      localoc = oc.a.a(paramParcel1.readStrongBinder());
      k = paramParcel1.readInt();
      int m = paramParcel1.readInt();
      localObject2 = this;
      localObject2 = a(locala, (il)localObject1, str, localoc, k, m);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      j = i;
    }
  }
}


/* Location:              com/google/android/gms/b/iy$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */