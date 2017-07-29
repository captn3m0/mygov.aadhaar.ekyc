package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract interface sa
  extends IInterface
{
  public abstract IBinder a(a parama, oc paramoc, int paramInt);
  
  public static abstract class a
    extends Binder
    implements sa
  {
    public static sa a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
      if ((localIInterface != null) && ((localIInterface instanceof sa))) {
        return (sa)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
      paramParcel1 = a(a.a.a(paramParcel1.readStrongBinder()), oc.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    
    private static final class a
      implements sa
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      /* Error */
      public final IBinder a(a parama, oc paramoc, int paramInt)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 4
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +81 -> 102
        //   24: aload_1
        //   25: invokeinterface 37 1 0
        //   30: astore_1
        //   31: aload 5
        //   33: aload_1
        //   34: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 4
        //   39: astore_1
        //   40: aload_2
        //   41: ifnull +10 -> 51
        //   44: aload_2
        //   45: invokeinterface 43 1 0
        //   50: astore_1
        //   51: aload 5
        //   53: aload_1
        //   54: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   57: aload 5
        //   59: iload_3
        //   60: invokevirtual 47	android/os/Parcel:writeInt	(I)V
        //   63: aload_0
        //   64: getfield 17	com/google/android/gms/b/sa$a$a:a	Landroid/os/IBinder;
        //   67: iconst_1
        //   68: aload 5
        //   70: aload 6
        //   72: iconst_0
        //   73: invokeinterface 53 5 0
        //   78: pop
        //   79: aload 6
        //   81: invokevirtual 56	android/os/Parcel:readException	()V
        //   84: aload 6
        //   86: invokevirtual 59	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   89: astore_1
        //   90: aload 6
        //   92: invokevirtual 62	android/os/Parcel:recycle	()V
        //   95: aload 5
        //   97: invokevirtual 62	android/os/Parcel:recycle	()V
        //   100: aload_1
        //   101: areturn
        //   102: aconst_null
        //   103: astore_1
        //   104: goto -73 -> 31
        //   107: astore_1
        //   108: aload 6
        //   110: invokevirtual 62	android/os/Parcel:recycle	()V
        //   113: aload 5
        //   115: invokevirtual 62	android/os/Parcel:recycle	()V
        //   118: aload_1
        //   119: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	120	0	this	a
        //   0	120	1	parama	a
        //   0	120	2	paramoc	oc
        //   0	120	3	paramInt	int
        //   1	37	4	localObject	Object
        //   6	108	5	localParcel1	Parcel
        //   11	98	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	107	finally
        //   24	31	107	finally
        //   31	37	107	finally
        //   44	51	107	finally
        //   51	90	107	finally
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/sa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */