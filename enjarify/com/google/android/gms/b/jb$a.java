package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class jb$a
  extends Binder
  implements jb
{
  public static jb a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (jb)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
      if (localObject != null)
      {
        boolean bool = localObject instanceof jb;
        if (bool)
        {
          localObject = (jb)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/jb$a$a;
      ((jb.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
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
      String str = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider";
      paramParcel1.enforceInterface(str);
      long l = a();
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
    }
  }
}


/* Location:              com/google/android/gms/b/jb$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */