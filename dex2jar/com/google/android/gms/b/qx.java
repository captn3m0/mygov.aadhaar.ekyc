package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface qx
  extends IInterface
{
  public abstract qr a(qo paramqo);
  
  public abstract void a(qo paramqo, qy paramqy);
  
  public static abstract class a
    extends Binder
    implements qx
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }
    
    public static qx a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      if ((localIInterface != null) && ((localIInterface instanceof qx))) {
        return (qx)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      IInterface localIInterface = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (paramParcel1.readInt() != 0)
        {
          paramParcel1 = (qo)qo.CREATOR.createFromParcel(paramParcel1);
          paramParcel1 = a(paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label116;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          return true;
          paramParcel1 = null;
          break;
          label116:
          paramParcel2.writeInt(0);
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      qo localqo;
      if (paramParcel1.readInt() != 0)
      {
        localqo = (qo)qo.CREATOR.createFromParcel(paramParcel1);
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 != null) {
          break label182;
        }
        paramParcel1 = localIInterface;
      }
      for (;;)
      {
        a(localqo, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localqo = null;
        break;
        label182:
        localIInterface = paramParcel1.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
        if ((localIInterface != null) && ((localIInterface instanceof qy))) {
          paramParcel1 = (qy)localIInterface;
        } else {
          paramParcel1 = new qy.a.a(paramParcel1);
        }
      }
    }
    
    private static final class a
      implements qx
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final qr a(qo paramqo)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (paramqo != null)
            {
              localParcel1.writeInt(1);
              paramqo.writeToParcel(localParcel1, 0);
              a.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramqo = (qr)qr.CREATOR.createFromParcel(localParcel2);
                return paramqo;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramqo = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public final void a(qo paramqo, qy paramqy)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (paramqo != null)
            {
              localParcel1.writeInt(1);
              paramqo.writeToParcel(localParcel1, 0);
              if (paramqy != null)
              {
                paramqo = paramqy.asBinder();
                localParcel1.writeStrongBinder(paramqo);
                a.transact(2, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramqo = null;
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


/* Location:              com/google/android/gms/b/qx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */