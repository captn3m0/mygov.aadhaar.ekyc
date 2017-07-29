package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface bu
  extends IInterface
{
  public abstract bs a(bq parambq);
  
  public static abstract class a
    extends Binder
    implements bu
  {
    public static bu a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
      if ((localIInterface != null) && ((localIInterface instanceof bu))) {
        return (bu)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.gass.internal.IGassService");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.gass.internal.IGassService");
      if (paramParcel1.readInt() != 0)
      {
        paramParcel1 = (bq)bq.CREATOR.createFromParcel(paramParcel1);
        paramParcel1 = a(paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label104;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel1 = null;
        break;
        label104:
        paramParcel2.writeInt(0);
      }
    }
    
    private static final class a
      implements bu
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final bs a(bq parambq)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.gass.internal.IGassService");
            if (parambq != null)
            {
              localParcel1.writeInt(1);
              parambq.writeToParcel(localParcel1, 0);
              a.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                parambq = (bs)bs.CREATOR.createFromParcel(localParcel2);
                return parambq;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            parambq = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */