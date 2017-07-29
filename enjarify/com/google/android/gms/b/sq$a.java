package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class sq$a
  extends Binder
  implements sq
{
  public sq$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
  }
  
  public static sq a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (sq)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof sq;
        if (bool)
        {
          localObject = (sq)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/sq$a$a;
      ((sq.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
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
      Object localObject = "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      a((a)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      a((a)localObject, k);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      b((a)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      c((a)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      d((a)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      e((a)localObject);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = paramParcel1.readStrongBinder();
      a locala = a.a.a((IBinder)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = (ss)ss.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        a(locala, (ss)localObject);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      f((a)localObject);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      k = paramParcel1.readInt();
      b((a)localObject, k);
      paramParcel2.writeNoException();
      j = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      g((a)localObject);
      paramParcel2.writeNoException();
      j = i;
    }
  }
}


/* Location:              com/google/android/gms/b/sq$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */