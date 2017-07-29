package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class wh$a
  extends Binder
  implements wh
{
  public static wh a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (wh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof wh;
        if (bool)
        {
          localObject = (wh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/wh$a$a;
      ((wh.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
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
      Object localObject = "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      localObject = paramParcel1.readStrongBinder();
      wg localwg = wg.a.a((IBinder)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = (wb)wb.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        a(localwg, (wb)localObject);
        j = i;
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      localObject = wg.a.a(paramParcel1.readStrongBinder());
      a((wg)localObject);
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      localObject = wg.a.a(paramParcel1.readStrongBinder());
      b((wg)localObject);
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      localObject = wg.a.a(paramParcel1.readStrongBinder());
      c((wg)localObject);
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      localObject = wg.a.a(paramParcel1.readStrongBinder());
      d((wg)localObject);
      j = i;
    }
  }
}


/* Location:              com/google/android/gms/b/wh$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */