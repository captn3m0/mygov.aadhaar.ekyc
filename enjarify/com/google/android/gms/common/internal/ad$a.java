package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class ad$a
  extends Binder
  implements ad
{
  public static ad a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ad)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ad;
        if (bool)
        {
          localObject = (ad)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/common/internal/ad$a$a;
      ((ad.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 16777215;
    if (paramInt1 > i)
    {
      boolean bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      return bool1;
    }
    Object localObject1 = "com.google.android.gms.common.internal.IGmsServiceBroker";
    paramParcel1.enforceInterface((String)localObject1);
    Object localObject2 = paramParcel1.readStrongBinder();
    label48:
    int j;
    if (localObject2 == null)
    {
      localObject2 = null;
      j = 46;
      if (paramInt1 != j) {
        break label162;
      }
      j = paramParcel1.readInt();
      if (j == 0) {
        break label645;
      }
    }
    for (localObject1 = (s)s.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      a((ac)localObject2, (s)localObject1);
      paramParcel2.writeNoException();
      j = 1;
      break;
      localObject1 = ((IBinder)localObject2).queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
      if (localObject1 != null)
      {
        boolean bool2 = localObject1 instanceof ac;
        if (bool2)
        {
          localObject1 = (ac)localObject1;
          localObject2 = localObject1;
          break label48;
        }
      }
      localObject1 = new com/google/android/gms/common/internal/ac$a$a;
      ((ac.a.a)localObject1).<init>((IBinder)localObject2);
      localObject2 = localObject1;
      break label48;
      label162:
      j = 47;
      if (paramInt1 == j)
      {
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject1 = j.CREATOR;
          ((Parcelable.Creator)localObject1).createFromParcel(paramParcel1);
        }
        localObject1 = new java/lang/UnsupportedOperationException;
        ((UnsupportedOperationException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
      paramParcel1.readInt();
      j = 4;
      if (paramInt1 != j) {
        paramParcel1.readString();
      }
      switch (paramInt1)
      {
      }
      for (;;)
      {
        localObject1 = new java/lang/UnsupportedOperationException;
        ((UnsupportedOperationException)localObject1).<init>();
        throw ((Throwable)localObject1);
        paramParcel1.readStrongBinder();
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject1 = Bundle.CREATOR;
          ((Parcelable.Creator)localObject1).createFromParcel(paramParcel1);
          continue;
          paramParcel1.readString();
          paramParcel1.createStringArray();
          paramParcel1.readString();
          j = paramParcel1.readInt();
          if (j != 0)
          {
            localObject1 = Bundle.CREATOR;
            ((Parcelable.Creator)localObject1).createFromParcel(paramParcel1);
            continue;
            paramParcel1.readString();
            paramParcel1.createStringArray();
            paramParcel1.readString();
            paramParcel1.readStrongBinder();
            paramParcel1.readString();
            j = paramParcel1.readInt();
            if (j != 0)
            {
              localObject1 = Bundle.CREATOR;
              ((Parcelable.Creator)localObject1).createFromParcel(paramParcel1);
              continue;
              paramParcel1.createStringArray();
              paramParcel1.readString();
              j = paramParcel1.readInt();
              if (j != 0)
              {
                localObject1 = Bundle.CREATOR;
                ((Parcelable.Creator)localObject1).createFromParcel(paramParcel1);
                continue;
                paramParcel1.readString();
                paramParcel1.createStringArray();
                continue;
                paramParcel1.readString();
                continue;
                j = paramParcel1.readInt();
                if (j != 0)
                {
                  localObject1 = Bundle.CREATOR;
                  ((Parcelable.Creator)localObject1).createFromParcel(paramParcel1);
                }
              }
            }
          }
        }
      }
      label645:
      j = 0;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/ad$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */