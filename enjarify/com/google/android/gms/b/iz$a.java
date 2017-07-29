package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class iz$a
  extends Binder
  implements iz
{
  public iz$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
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
      String str1 = "com.google.android.gms.ads.internal.client.IAppEventListener";
      paramParcel2.writeString(str1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
      str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      a(str1, str2);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/iz$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */