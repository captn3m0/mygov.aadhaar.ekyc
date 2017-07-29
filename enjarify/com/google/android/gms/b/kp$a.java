package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class kp$a
  extends Binder
  implements kp
{
  public kp$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
  }
  
  public IBinder asBinder()
  {
    return this;
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
      Object localObject = "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      localObject = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      localObject = b();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      a((a)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd";
      paramParcel1.enforceInterface((String)localObject);
      c();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd";
      paramParcel1.enforceInterface((String)localObject);
      d();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/kp$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */