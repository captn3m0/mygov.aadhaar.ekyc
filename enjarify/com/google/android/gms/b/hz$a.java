package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class hz$a
  extends Binder
  implements hz
{
  public static hz a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (hz)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof hz;
        if (bool)
        {
          localObject = (hz)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/hz$a$a;
      ((hz.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.ads.internal.cache.ICacheService";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.cache.ICacheService";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0)
    {
      localObject = (hw)hw.CREATOR.createFromParcel(paramParcel1);
      label98:
      localObject = a((hw)localObject);
      paramParcel2.writeNoException();
      if (localObject == null) {
        break label145;
      }
      paramParcel2.writeInt(i);
      ((ht)localObject).writeToParcel(paramParcel2, i);
    }
    for (;;)
    {
      j = i;
      break;
      j = 0;
      localObject = null;
      break label98;
      label145:
      j = 0;
      localObject = null;
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:              com/google/android/gms/b/hz$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */