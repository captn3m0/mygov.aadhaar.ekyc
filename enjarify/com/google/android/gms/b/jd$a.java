package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class jd$a
  extends Binder
  implements jd
{
  public static jd a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (jd)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof jd;
        if (bool)
        {
          localObject = (jd)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/jd$a$a;
      ((jd.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      localObject = a((a)localObject, i);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/jd$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */