package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class jc$a
  extends Binder
  implements jc
{
  public jc$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  public static jc a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (jc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      if (localObject != null)
      {
        boolean bool = localObject instanceof jc;
        if (bool)
        {
          localObject = (jc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/jc$a$a;
      ((jc.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i;
      Object localObject1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
      paramParcel1.enforceInterface((String)localObject1);
      b();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
      paramParcel1.enforceInterface((String)localObject1);
      float f2 = paramParcel1.readFloat();
      a(f2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      localObject1 = paramParcel1.readString();
      a((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
      paramParcel1.enforceInterface((String)localObject1);
      int j = paramParcel1.readInt();
      if (j != 0)
      {
        j = i;
        f2 = f1;
      }
      for (;;)
      {
        a(j);
        paramParcel2.writeNoException();
        break;
        int k = 0;
        f2 = 0.0F;
        localObject1 = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      localObject1 = a.a.a(paramParcel1.readStrongBinder());
      Object localObject2 = paramParcel1.readString();
      a((a)localObject1, (String)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      localObject1 = paramParcel1.readString();
      localObject2 = a.a.a(paramParcel1.readStrongBinder());
      a((String)localObject1, (a)localObject2);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/jc$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */