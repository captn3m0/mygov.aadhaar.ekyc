package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class oe$a
  extends Binder
  implements oe
{
  public oe$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public static oe a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (oe)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof oe;
        if (bool)
        {
          localObject = (oe)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/oe$a$a;
      ((oe.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool1;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      Object localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel2.writeString((String)localObject);
      bool1 = i;
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      a();
      paramParcel2.writeNoException();
      bool1 = i;
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      b();
      paramParcel2.writeNoException();
      bool1 = i;
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      int j = paramParcel1.readInt();
      a(j);
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      c();
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      d();
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      e();
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      IBinder localIBinder = paramParcel1.readStrongBinder();
      if (localIBinder == null)
      {
        j = 0;
        localObject = null;
      }
      for (;;)
      {
        a((of)localObject);
        paramParcel2.writeNoException();
        j = i;
        break;
        localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
        if (localObject != null)
        {
          boolean bool2 = localObject instanceof of;
          if (bool2)
          {
            localObject = (of)localObject;
            continue;
          }
        }
        localObject = new com/google/android/gms/b/of$a$a;
        ((of.a.a)localObject).<init>(localIBinder);
      }
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      f();
      paramParcel2.writeNoException();
      j = i;
    }
  }
}


/* Location:              com/google/android/gms/b/oe$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */