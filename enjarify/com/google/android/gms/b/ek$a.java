package com.google.android.gms.b;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.af;
import com.google.android.gms.common.internal.af.a.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.common.internal.z.a;

public abstract class ek$a
  extends Binder
  implements ek
{
  public static ek a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ek)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ek;
        if (bool)
        {
          localObject = (ek)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/ek$a$a;
      ((ek.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int m = 0;
    Object localObject2 = null;
    int i1 = 1;
    switch (paramInt1)
    {
    default: 
      i1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i1;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = (m)m.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject2 = ej.a.a(paramParcel1.readStrongBinder());
        a((m)localObject1, (ej)localObject2);
        paramParcel2.writeNoException();
        break;
        i = 0;
      }
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = (eh)eh.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        a((eh)localObject1);
        paramParcel2.writeNoException();
        break;
        i = 0;
      }
      localObject2 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        i = i1;
      }
      a(i);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      int j = paramParcel1.readInt();
      Object localObject3;
      label353:
      IBinder localIBinder;
      if (j != 0)
      {
        localObject1 = (d)d.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject1;
        localIBinder = paramParcel1.readStrongBinder();
        if (localIBinder != null) {
          break label388;
        }
      }
      for (;;)
      {
        a((d)localObject3, (af)localObject2);
        paramParcel2.writeNoException();
        break;
        i2 = 0;
        localObject3 = null;
        break label353;
        label388:
        localObject1 = localIBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        if (localObject1 != null)
        {
          boolean bool = localObject1 instanceof af;
          if (bool)
          {
            localObject1 = (af)localObject1;
            localObject2 = localObject1;
            continue;
          }
        }
        localObject2 = new com/google/android/gms/common/internal/af$a$a;
        ((af.a.a)localObject2).<init>(localIBinder);
      }
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      a(j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      int i2 = paramParcel1.readInt();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject2 = ej.a.a(paramParcel1.readStrongBinder());
        a(i2, (Account)localObject1, (ej)localObject2);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      localObject2 = z.a.a(paramParcel1.readStrongBinder());
      i2 = paramParcel1.readInt();
      int i3 = paramParcel1.readInt();
      if (i3 != 0) {
        j = i1;
      }
      a((z)localObject2, i2, j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      int k = paramParcel1.readInt();
      if (k != 0) {}
      for (localObject1 = (el)el.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject2 = ej.a.a(paramParcel1.readStrongBinder());
        a((el)localObject1, (ej)localObject2);
        paramParcel2.writeNoException();
        break;
        k = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      localObject1 = ej.a.a(paramParcel1.readStrongBinder());
      a((ej)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject1);
      k = paramParcel1.readInt();
      if (k != 0) {}
      for (localObject1 = (eo)eo.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject2 = ej.a.a(paramParcel1.readStrongBinder());
        a((eo)localObject1, (ej)localObject2);
        paramParcel2.writeNoException();
        break;
        k = 0;
      }
      localObject2 = "com.google.android.gms.signin.internal.ISignInService";
      paramParcel1.enforceInterface((String)localObject2);
      int n = paramParcel1.readInt();
      if (n != 0) {
        k = i1;
      }
      b(k);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              com/google/android/gms/b/ek$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */