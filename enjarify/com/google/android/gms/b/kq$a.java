package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class kq$a
  extends Binder
  implements kq
{
  public kq$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
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
    case 1598968902: 
      for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool2 = bool1)
      {
        return bool2;
        localObject = "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener";
    paramParcel1.enforceInterface((String)localObject);
    IBinder localIBinder = paramParcel1.readStrongBinder();
    if (localIBinder == null)
    {
      bool2 = false;
      localObject = null;
    }
    for (;;)
    {
      a((kp)localObject);
      paramParcel2.writeNoException();
      bool2 = bool1;
      break;
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      if (localObject != null)
      {
        boolean bool3 = localObject instanceof kp;
        if (bool3)
        {
          localObject = (kp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/kp$a$a;
      ((kp.a.a)localObject).<init>(localIBinder);
    }
  }
}


/* Location:              com/google/android/gms/b/kq$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */