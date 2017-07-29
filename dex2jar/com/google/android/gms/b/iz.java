package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface iz
  extends IInterface
{
  public abstract void a(String paramString1, String paramString2);
  
  public static abstract class a
    extends Binder
    implements iz
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
      a(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    }
    
    private static final class a
      implements iz
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final void a(String paramString1, String paramString2)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */