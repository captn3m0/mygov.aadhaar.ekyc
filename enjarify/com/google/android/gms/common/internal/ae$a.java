package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class ae$a
  extends Binder
  implements ae
{
  public static ae a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ae)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ae;
        if (bool)
        {
          localObject = (ae)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/common/internal/ae$a$a;
      ((ae.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject = null;
    int j = 0;
    a locala1 = null;
    int k = 1;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return k;
      localObject = "com.google.android.gms.common.internal.IGoogleCertificatesApi";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      locala1 = a();
      paramParcel2.writeNoException();
      if (locala1 != null) {
        localObject = locala1.asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      locala1 = b();
      paramParcel2.writeNoException();
      if (locala1 != null) {
        localObject = locala1.asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      localObject = paramParcel1.readString();
      a locala2 = a.a.a(paramParcel1.readStrongBinder());
      i = a((String)localObject, locala2);
      paramParcel2.writeNoException();
      if (i != 0) {
        i = k;
      }
      for (;;)
      {
        paramParcel2.writeInt(i);
        break;
        bool = false;
        localObject = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      localObject = paramParcel1.readString();
      locala2 = a.a.a(paramParcel1.readStrongBinder());
      boolean bool = b((String)localObject, locala2);
      paramParcel2.writeNoException();
      if (bool) {
        j = k;
      }
      paramParcel2.writeInt(j);
    }
  }
}


/* Location:              com/google/android/gms/common/internal/ae$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */