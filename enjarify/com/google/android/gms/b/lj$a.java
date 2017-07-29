package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class lj$a
  extends Binder
  implements lj
{
  public lj$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  public static lj a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (lj)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof lj;
        if (bool)
        {
          localObject = (lj)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/lj$a$a;
      ((lj.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default: 
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool2;
      Object localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate";
      paramParcel2.writeString((String)localObject);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      localObject = paramParcel1.readString();
      a locala = a.a.a(paramParcel1.readStrongBinder());
      a((String)localObject, locala);
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      localObject = paramParcel1.readString();
      localObject = a((String)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((a)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        bool2 = bool1;
        break;
        bool2 = false;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      a((a)localObject);
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate";
      paramParcel1.enforceInterface((String)localObject);
      a();
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      a((a)localObject, i);
      paramParcel2.writeNoException();
      bool2 = bool1;
    }
  }
}


/* Location:              com/google/android/gms/b/lj$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */