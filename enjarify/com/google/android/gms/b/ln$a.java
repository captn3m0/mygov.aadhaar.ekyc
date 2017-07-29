package com.google.android.gms.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class ln$a
  extends Binder
  implements ln
{
  public ln$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeContentAd";
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      Object localObject2 = h();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((a)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      localObject1 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      localObject1 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList((List)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      localObject1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      localObject2 = d();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((lh)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      localObject1 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      localObject1 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      localObject1 = i();
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(i);
        ((Bundle)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        bool = false;
        localObject1 = null;
        paramParcel2.writeInt(0);
      }
      localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeContentAd";
      paramParcel1.enforceInterface((String)localObject1);
      j();
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      localObject2 = g();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((jf)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool = i;
    }
  }
}


/* Location:              com/google/android/gms/b/ln$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */