package com.google.android.gms.dynamite;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class b$a
  extends Binder
  implements b
{
  public static b a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (b)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
      if (localObject != null)
      {
        boolean bool = localObject instanceof b;
        if (bool)
        {
          localObject = (b)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/dynamite/b$a$a;
      ((b.a.a)localObject).<init>(paramIBinder);
    }
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
        localObject = "com.google.android.gms.dynamite.IDynamiteLoaderV2";
        paramParcel2.writeString((String)localObject);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
    Object localObject = a.a.a(paramParcel1.readStrongBinder());
    String str = paramParcel1.readString();
    byte[] arrayOfByte = paramParcel1.createByteArray();
    localObject = a((a)localObject, str, arrayOfByte);
    paramParcel2.writeNoException();
    if (localObject != null) {}
    for (localObject = ((a)localObject).asBinder();; localObject = null)
    {
      paramParcel2.writeStrongBinder((IBinder)localObject);
      bool2 = bool1;
      break;
      bool2 = false;
    }
  }
}


/* Location:              com/google/android/gms/dynamite/b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */