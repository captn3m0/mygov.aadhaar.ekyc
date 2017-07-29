package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public abstract class cq$a
  extends Binder
  implements cq
{
  public cq$a()
  {
    attachInterface(this, "com.google.android.gms.measurement.internal.IMeasurementService");
  }
  
  public static cq a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (cq)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof cq;
        if (bool)
        {
          localObject = (cq)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/cq$a$a;
      ((cq.a.a)localObject).<init>(paramIBinder);
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
    int i = 0;
    String str1 = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool2;
      Object localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel2.writeString((String)localObject2);
      continue;
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      int j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (cn)cn.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
        label222:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label271;
        }
      }
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((cn)localObject1, (ca)localObject2);
        paramParcel2.writeNoException();
        break;
        bool1 = false;
        localObject1 = null;
        break label222;
        label271:
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (do)do.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
        label319:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label368;
        }
      }
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((do)localObject1, (ca)localObject2);
        paramParcel2.writeNoException();
        break;
        bool1 = false;
        localObject1 = null;
        break label319;
        label368:
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((ca)localObject2);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (cn)cn.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = paramParcel1.readString();
        str1 = paramParcel1.readString();
        a((cn)localObject2, (String)localObject1, str1);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        b((ca)localObject2);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        i = paramParcel1.readInt();
        if (i != 0) {
          bool1 = bool2;
        }
        localObject2 = a((ca)localObject2, bool1);
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList((List)localObject2);
        break;
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (cn)cn.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = paramParcel1.readString();
        localObject2 = a((cn)localObject2, (String)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray((byte[])localObject2);
        break;
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      long l = paramParcel1.readLong();
      String str2 = paramParcel1.readString();
      String str3 = paramParcel1.readString();
      String str4 = paramParcel1.readString();
      localObject1 = this;
      a(l, str2, str3, str4);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject2 = c((ca)localObject2);
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        break;
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (cd)cd.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
        label879:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label928;
        }
      }
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((cd)localObject1, (ca)localObject2);
        paramParcel2.writeNoException();
        break;
        bool1 = false;
        localObject1 = null;
        break label879;
        label928:
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (cd)cd.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((cd)localObject2);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      String str5 = paramParcel1.readString();
      str2 = paramParcel1.readString();
      j = paramParcel1.readInt();
      if (j != 0) {
        bool1 = bool2;
      }
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject2 = a(str5, str2, bool1, (ca)localObject2);
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList((List)localObject2);
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
      localObject2 = paramParcel1.readString();
      str1 = paramParcel1.readString();
      str5 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      if (k != 0) {
        bool1 = bool2;
      }
      localObject2 = a((String)localObject2, str1, str5, bool1);
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList((List)localObject2);
      continue;
      localObject2 = "com.google.android.gms.measurement.internal.IMeasurementService";
      paramParcel1.enforceInterface((String)localObject2);
      localObject1 = paramParcel1.readString();
      str5 = paramParcel1.readString();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (ca)ca.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject2 = a((String)localObject1, str5, (ca)localObject2);
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList((List)localObject2);
        break;
        j = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      str1 = paramParcel1.readString();
      localObject2 = a((String)localObject2, (String)localObject1, str1);
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList((List)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/cq$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */