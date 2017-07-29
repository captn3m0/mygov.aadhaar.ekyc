package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class bm$a
  extends Binder
  implements bm
{
  public bm$a()
  {
    attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
  }
  
  public static bm asInterface(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (bm)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
      if (localObject != null)
      {
        boolean bool = localObject instanceof bm;
        if (bool)
        {
          localObject = (bm)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/bm$a$a;
      ((bm.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    String str1 = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      Object localObject = "com.google.android.gms.flags.IFlagProvider";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      localObject = a.a.a(paramParcel1.readStrongBinder());
      init((a)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.flags.IFlagProvider";
      paramParcel1.enforceInterface((String)localObject);
      String str2 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      if (k != 0) {
        k = j;
      }
      for (;;)
      {
        n = paramParcel1.readInt();
        boolean bool = getBooleanFlagValue(str2, k, n);
        paramParcel2.writeNoException();
        if (bool) {
          i = j;
        }
        paramParcel2.writeInt(i);
        break;
        bool = false;
        localObject = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      localObject = paramParcel1.readString();
      i = paramParcel1.readInt();
      int i1 = paramParcel1.readInt();
      int m = getIntFlagValue((String)localObject, i, i1);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(m);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      localObject = paramParcel1.readString();
      long l = paramParcel1.readLong();
      int n = paramParcel1.readInt();
      l = getLongFlagValue((String)localObject, l, n);
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      localObject = paramParcel1.readString();
      str1 = paramParcel1.readString();
      i1 = paramParcel1.readInt();
      localObject = getStringFlagValue((String)localObject, str1, i1);
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/bm$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */