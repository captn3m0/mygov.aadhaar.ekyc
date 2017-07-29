package com.google.android.gms.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class a$a
  extends Binder
  implements a
{
  public a$a()
  {
    attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
  }
  
  public static a a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (a)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
      if (localObject != null)
      {
        boolean bool = localObject instanceof a;
        if (bool)
        {
          localObject = (a)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/a/a$a$a;
      ((a.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    }
    for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = true)
    {
      return bool;
      String str = "com.google.android.gms.dynamic.IObjectWrapper";
      paramParcel2.writeString(str);
    }
  }
}


/* Location:              com/google/android/gms/a/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */