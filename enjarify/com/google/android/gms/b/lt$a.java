package com.google.android.gms.b;

import android.os.Binder;
import android.os.Parcel;

public abstract class lt$a
  extends Binder
  implements lt
{
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
      Object localObject = "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
      localObject = lp.a.a(paramParcel1.readStrongBinder());
      a((lp)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/lt$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */