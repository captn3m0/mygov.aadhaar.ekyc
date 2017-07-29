package com.google.android.gms.dynamite;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class a$a
  extends Binder
  implements a
{
  public static a a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (a)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
      if (localObject != null)
      {
        boolean bool = localObject instanceof a;
        if (bool)
        {
          localObject = (a)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/dynamite/a$a$a;
      ((a.a.a)localObject).<init>(paramIBinder);
    }
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
      for (;;)
      {
        return i;
        localObject1 = "com.google.android.gms.dynamite.IDynamiteLoader";
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
        localObject1 = com.google.android.gms.a.a.a.a(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        j = a((com.google.android.gms.a.a)localObject1, (String)localObject2);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(j);
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
      localObject1 = com.google.android.gms.a.a.a.a(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      localObject1 = a((com.google.android.gms.a.a)localObject1, (String)localObject2, m);
      paramParcel2.writeNoException();
      if (localObject1 != null) {}
      for (localObject1 = ((com.google.android.gms.a.a)localObject1).asBinder();; localObject1 = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        break;
        j = 0;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
    Object localObject1 = paramParcel1.readStrongBinder();
    Object localObject2 = com.google.android.gms.a.a.a.a((IBinder)localObject1);
    String str = paramParcel1.readString();
    int j = paramParcel1.readInt();
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      int k = a((com.google.android.gms.a.a)localObject2, str, j);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(k);
      break;
      k = 0;
      localObject1 = null;
    }
  }
}


/* Location:              com/google/android/gms/dynamite/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */