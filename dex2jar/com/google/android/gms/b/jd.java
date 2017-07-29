package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract interface jd
  extends IInterface
{
  public abstract IBinder a(a parama, int paramInt);
  
  public static abstract class a
    extends Binder
    implements jd
  {
    public static jd a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
      if ((localIInterface != null) && ((localIInterface instanceof jd))) {
        return (jd)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
      paramParcel1 = a(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    
    private static final class a
      implements jd
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      /* Error */
      public final IBinder a(a parama, int paramInt)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +57 -> 73
        //   19: aload_1
        //   20: invokeinterface 37 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: iload_2
        //   33: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   36: aload_0
        //   37: getfield 17	com/google/android/gms/b/jd$a$a:a	Landroid/os/IBinder;
        //   40: iconst_1
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 50 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 53	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 56	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   61: astore_1
        //   62: aload 4
        //   64: invokevirtual 59	android/os/Parcel:recycle	()V
        //   67: aload_3
        //   68: invokevirtual 59	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: areturn
        //   73: aconst_null
        //   74: astore_1
        //   75: goto -49 -> 26
        //   78: astore_1
        //   79: aload 4
        //   81: invokevirtual 59	android/os/Parcel:recycle	()V
        //   84: aload_3
        //   85: invokevirtual 59	android/os/Parcel:recycle	()V
        //   88: aload_1
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parama	a
        //   0	90	2	paramInt	int
        //   3	82	3	localParcel1	Parcel
        //   7	73	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	78	finally
        //   19	26	78	finally
        //   26	62	78	finally
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */