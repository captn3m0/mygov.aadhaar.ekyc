package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ry$a
  extends Binder
  implements ry
{
  public ry$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
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
      String str = "com.google.android.gms.ads.internal.reward.client.IRewardItem";
      paramParcel2.writeString(str);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
      str = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.reward.client.IRewardItem";
      paramParcel1.enforceInterface(str);
      int i = b();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
    }
  }
}


/* Location:              com/google/android/gms/b/ry$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */