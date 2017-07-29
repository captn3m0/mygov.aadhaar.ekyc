package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class iv$a
  extends Binder
  implements iv
{
  public iv$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  public static iv a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (iv)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if (localObject != null)
      {
        boolean bool = localObject instanceof iv;
        if (bool)
        {
          localObject = (iv)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/iv$a$a;
      ((iv.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = 1;
    boolean bool2;
    switch (paramInt1)
    {
    default: 
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool2;
      Object localObject2 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder";
      paramParcel2.writeString((String)localObject2);
      bool2 = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject2 = a();
      paramParcel2.writeNoException();
      if (localObject2 != null) {}
      for (localObject2 = ((iu)localObject2).asBinder();; localObject2 = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject2);
        bool2 = i;
        break;
        bool2 = false;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject2 = it.a.a(paramParcel1.readStrongBinder());
      a((it)localObject2);
      paramParcel2.writeNoException();
      bool2 = i;
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder";
      paramParcel1.enforceInterface((String)localObject2);
      Object localObject3 = paramParcel1.readStrongBinder();
      if (localObject3 == null) {}
      for (;;)
      {
        a((lq)localObject1);
        paramParcel2.writeNoException();
        bool2 = i;
        break;
        localObject2 = ((IBinder)localObject3).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (localObject2 != null)
        {
          bool1 = localObject2 instanceof lq;
          if (bool1)
          {
            localObject2 = (lq)localObject2;
            localObject1 = localObject2;
            continue;
          }
        }
        localObject1 = new com/google/android/gms/b/lq$a$a;
        ((lq.a.a)localObject1).<init>((IBinder)localObject3);
      }
      localObject2 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder";
      paramParcel1.enforceInterface((String)localObject2);
      localObject3 = paramParcel1.readStrongBinder();
      if (localObject3 == null) {}
      for (;;)
      {
        a((lr)localObject1);
        paramParcel2.writeNoException();
        bool2 = i;
        break;
        localObject2 = ((IBinder)localObject3).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (localObject2 != null)
        {
          bool1 = localObject2 instanceof lr;
          if (bool1)
          {
            localObject2 = (lr)localObject2;
            localObject1 = localObject2;
            continue;
          }
        }
        localObject1 = new com/google/android/gms/b/lr$a$a;
        ((lr.a.a)localObject1).<init>((IBinder)localObject3);
      }
      localObject2 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder";
      paramParcel1.enforceInterface((String)localObject2);
      String str = paramParcel1.readString();
      localObject3 = paramParcel1.readStrongBinder();
      label419:
      IBinder localIBinder;
      if (localObject3 == null)
      {
        localObject3 = null;
        localIBinder = paramParcel1.readStrongBinder();
        if (localIBinder != null) {
          break label512;
        }
      }
      for (;;)
      {
        a(str, (lt)localObject3, (ls)localObject1);
        paramParcel2.writeNoException();
        bool2 = i;
        break;
        localObject2 = ((IBinder)localObject3).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        if (localObject2 != null)
        {
          boolean bool3 = localObject2 instanceof lt;
          if (bool3)
          {
            localObject2 = (lt)localObject2;
            localObject3 = localObject2;
            break label419;
          }
        }
        localObject2 = new com/google/android/gms/b/lt$a$a;
        ((lt.a.a)localObject2).<init>((IBinder)localObject3);
        localObject3 = localObject2;
        break label419;
        label512:
        localObject2 = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (localObject2 != null)
        {
          bool1 = localObject2 instanceof ls;
          if (bool1)
          {
            localObject2 = (ls)localObject2;
            localObject1 = localObject2;
            continue;
          }
        }
        localObject1 = new com/google/android/gms/b/ls$a$a;
        ((ls.a.a)localObject1).<init>(localIBinder);
      }
      localObject2 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder";
      paramParcel1.enforceInterface((String)localObject2);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (le)le.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((le)localObject2);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject2 = jb.a.a(paramParcel1.readStrongBinder());
      a((jb)localObject2);
      paramParcel2.writeNoException();
      j = i;
    }
  }
}


/* Location:              com/google/android/gms/b/iv$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */