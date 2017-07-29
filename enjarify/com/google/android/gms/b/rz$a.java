package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class rz$a
  extends Binder
  implements rz
{
  public rz$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
  }
  
  public static rz a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (rz)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      if (localObject != null)
      {
        boolean bool = localObject instanceof rz;
        if (bool)
        {
          localObject = (rz)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/rz$a$a;
      ((rz.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i;
      Object localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel2.writeString((String)localObject);
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = (sg)sg.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        a((sg)localObject);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      a();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      localObject = sb.a.a(paramParcel1.readStrongBinder());
      a((sb)localObject);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      localObject = paramParcel1.readString();
      a((String)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      int k = b();
      paramParcel2.writeNoException();
      if (k != 0) {
        k = i;
      }
      for (;;)
      {
        paramParcel2.writeInt(k);
        break;
        int m = 0;
        localObject = null;
      }
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      c();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      d();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd";
      paramParcel1.enforceInterface((String)localObject);
      e();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      a((a)localObject);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      b((a)localObject);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      c((a)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/rz$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */