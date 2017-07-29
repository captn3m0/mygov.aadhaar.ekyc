package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public abstract class wg$a
  extends Binder
  implements wg
{
  public wg$a()
  {
    attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
  }
  
  public static wg a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (wg)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof wg;
        if (bool)
        {
          localObject = (wg)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/wg$a$a;
      ((wg.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      a((Status)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      b((Status)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      long l = paramParcel1.readLong();
      a((Status)localObject, l);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      c((Status)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      l = paramParcel1.readLong();
      b((Status)localObject, l);
      bool1 = bool2;
    }
  }
}


/* Location:              com/google/android/gms/b/wg$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */