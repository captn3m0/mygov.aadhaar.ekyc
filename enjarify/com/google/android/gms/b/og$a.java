package com.google.android.gms.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

public abstract class og$a
  extends Binder
  implements og
{
  public og$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
  }
  
  public static og a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (og)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      if (localObject != null)
      {
        boolean bool = localObject instanceof og;
        if (bool)
        {
          localObject = (og)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/og$a$a;
      ((og.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int k = 1;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return k;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList((List)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject2 = d();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((lh)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper";
      paramParcel1.enforceInterface((String)localObject1);
      double d = f();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = g();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = h();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper";
      paramParcel1.enforceInterface((String)localObject1);
      i();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = a.a.a(paramParcel1.readStrongBinder());
      a((a)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = a.a.a(paramParcel1.readStrongBinder());
      b((a)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper";
      paramParcel1.enforceInterface((String)localObject1);
      i = j();
      paramParcel2.writeNoException();
      if (i != 0) {
        i = k;
      }
      for (;;)
      {
        paramParcel2.writeInt(i);
        break;
        bool = false;
        localObject1 = null;
      }
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper";
      paramParcel1.enforceInterface((String)localObject1);
      boolean bool = k();
      paramParcel2.writeNoException();
      if (bool) {
        j = k;
      }
      paramParcel2.writeInt(j);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      localObject1 = l();
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(k);
        ((Bundle)localObject1).writeToParcel(paramParcel2, k);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        c((a)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject2 = m();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((jf)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject2 = n();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((a)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/og$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */