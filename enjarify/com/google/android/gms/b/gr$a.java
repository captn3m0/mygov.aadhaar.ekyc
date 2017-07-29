package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class gr$a
  extends Binder
  implements gr
{
  public gr$a()
  {
    attachInterface(this, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
  }
  
  public static gr a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (gr)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if (localObject != null)
      {
        boolean bool = localObject instanceof gr;
        if (bool)
        {
          localObject = (gr)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/gr$a$a;
      ((gr.a.a)localObject).<init>(paramIBinder);
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
      localObject2 = "com.google.android.gms.ads.adshield.internal.IAdShieldClient";
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      a((String)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject1 = a.a.a(paramParcel1.readStrongBinder());
      bool1 = a((a)localObject1);
      paramParcel2.writeNoException();
      if (bool1) {
        j = k;
      }
      paramParcel2.writeInt(j);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject1 = a.a.a(paramParcel1.readStrongBinder());
      bool1 = b((a)localObject1);
      paramParcel2.writeNoException();
      if (bool1) {
        j = k;
      }
      paramParcel2.writeInt(j);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = paramParcel1.readString();
      a((String)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = a.a.a(paramParcel1.readStrongBinder());
      Object localObject3 = a.a.a(paramParcel1.readStrongBinder());
      localObject2 = a((a)localObject2, (a)localObject3);
      paramParcel2.writeNoException();
      if (localObject2 != null) {}
      for (localObject2 = ((a)localObject2).asBinder();; localObject2 = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject2);
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = a.a.a(paramParcel1.readStrongBinder());
      localObject2 = c((a)localObject2);
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = a.a.a(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      localObject2 = a((a)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = a.a.a(paramParcel1.readStrongBinder());
      d((a)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = a.a.a(paramParcel1.readStrongBinder());
      localObject3 = a.a.a(paramParcel1.readStrongBinder());
      localObject2 = b((a)localObject2, (a)localObject3);
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((a)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      continue;
      localObject1 = "com.google.android.gms.ads.adshield.internal.IAdShieldClient";
      paramParcel1.enforceInterface((String)localObject1);
      localObject3 = paramParcel1.readString();
      int i = paramParcel1.readInt();
      if (i != 0) {
        i = k;
      }
      for (;;)
      {
        boolean bool2 = a((String)localObject3, i);
        paramParcel2.writeNoException();
        if (bool2) {
          j = k;
        }
        paramParcel2.writeInt(j);
        break;
        bool2 = false;
        localObject1 = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localObject2 = a.a.a(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.createByteArray();
      localObject2 = a((a)localObject2, (byte[])localObject1);
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/gr$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */