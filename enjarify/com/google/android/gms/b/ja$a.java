package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class ja$a
  extends Binder
  implements ja
{
  public ja$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  public static ja asInterface(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ja)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ja;
        if (bool)
        {
          localObject = (ja)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/ja$a$a;
      ((ja.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    IBinder localIBinder = null;
    boolean bool;
    Object localObject3;
    int n;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
      for (;;)
      {
        return bool;
        localObject1 = "com.google.android.gms.ads.internal.client.IClientApi";
        paramParcel2.writeString((String)localObject1);
        bool = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = paramParcel1.readStrongBinder();
        localObject2 = a.a.a((IBinder)localObject1);
        j = paramParcel1.readInt();
        if (j != 0) {
          localObject1 = (il)il.CREATOR.createFromParcel(paramParcel1);
        }
        String str;
        oc localoc;
        int k;
        for (localObject3 = localObject1;; localObject3 = null)
        {
          str = paramParcel1.readString();
          localoc = oc.a.a(paramParcel1.readStrongBinder());
          k = paramParcel1.readInt();
          localObject1 = this;
          localObject1 = createBannerAdManager((a)localObject2, (il)localObject3, str, localoc, k);
          paramParcel2.writeNoException();
          if (localObject1 != null) {
            localIBinder = ((ix)localObject1).asBinder();
          }
          paramParcel2.writeStrongBinder(localIBinder);
          j = i;
          break;
          m = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = paramParcel1.readStrongBinder();
        localObject2 = a.a.a((IBinder)localObject1);
        j = paramParcel1.readInt();
        if (j != 0) {
          localObject1 = (il)il.CREATOR.createFromParcel(paramParcel1);
        }
        for (localObject3 = localObject1;; localObject3 = null)
        {
          str = paramParcel1.readString();
          localoc = oc.a.a(paramParcel1.readStrongBinder());
          k = paramParcel1.readInt();
          localObject1 = this;
          localObject1 = createInterstitialAdManager((a)localObject2, (il)localObject3, str, localoc, k);
          paramParcel2.writeNoException();
          if (localObject1 != null) {
            localIBinder = ((ix)localObject1).asBinder();
          }
          paramParcel2.writeStrongBinder(localIBinder);
          j = i;
          break;
          m = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject3 = oc.a.a(paramParcel1.readStrongBinder());
        n = paramParcel1.readInt();
        localObject1 = createAdLoaderBuilder((a)localObject1, (String)localObject2, (oc)localObject3, n);
        paramParcel2.writeNoException();
        if (localObject1 != null) {
          localIBinder = ((iv)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        localObject1 = getMobileAdsSettingsManager((a)localObject1);
        paramParcel2.writeNoException();
        if (localObject1 != null) {
          localIBinder = ((jc)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        localObject2 = a.a.a(paramParcel1.readStrongBinder());
        localObject1 = createNativeAdViewDelegate((a)localObject1, (a)localObject2);
        paramParcel2.writeNoException();
        if (localObject1 != null) {
          localIBinder = ((lj)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        localObject2 = oc.a.a(paramParcel1.readStrongBinder());
        int m = paramParcel1.readInt();
        localObject1 = createRewardedVideoAd((a)localObject1, (oc)localObject2, m);
        paramParcel2.writeNoException();
        if (localObject1 != null) {
          localIBinder = ((rz)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        localObject1 = createInAppPurchaseManager((a)localObject1);
        paramParcel2.writeNoException();
        if (localObject1 != null) {
          localIBinder = ((pi)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        localObject1 = createAdOverlay((a)localObject1);
        paramParcel2.writeNoException();
        if (localObject1 != null) {
          localIBinder = ((pb)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        int i1 = paramParcel1.readInt();
        localObject1 = getMobileAdsSettingsManagerWithClientJarVersion((a)localObject1, i1);
        paramParcel2.writeNoException();
        if (localObject1 != null) {
          localIBinder = ((jc)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        j = i;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
    Object localObject1 = paramParcel1.readStrongBinder();
    Object localObject2 = a.a.a((IBinder)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject1 = (il)il.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      localObject3 = paramParcel1.readString();
      n = paramParcel1.readInt();
      localObject1 = createSearchAdManager((a)localObject2, (il)localObject1, (String)localObject3, n);
      paramParcel2.writeNoException();
      if (localObject1 != null) {
        localIBinder = ((ix)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              com/google/android/gms/b/ja$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */