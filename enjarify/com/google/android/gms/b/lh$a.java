package com.google.android.gms.b;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public abstract class lh$a
  extends Binder
  implements lh
{
  public lh$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public static lh a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (lh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if (localObject != null)
      {
        boolean bool = localObject instanceof lh;
        if (bool)
        {
          localObject = (lh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/lh$a$a;
      ((lh.a.a)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      localObject = a();
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((a)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        bool = i;
        break;
        bool = false;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      localObject = b();
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(i);
        ((Uri)localObject).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        bool = false;
        localObject = null;
        paramParcel2.writeInt(0);
      }
      localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
      paramParcel1.enforceInterface((String)localObject);
      double d = c();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      bool = i;
    }
  }
}


/* Location:              com/google/android/gms/b/lh$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */