package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract interface iw
  extends IInterface
{
  public abstract IBinder a(a parama, String paramString, oc paramoc, int paramInt);
  
  public static abstract class a
    extends Binder
    implements iw
  {
    public static iw a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      if ((localIInterface != null) && ((localIInterface instanceof iw))) {
        return (iw)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      paramParcel1 = a(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), oc.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    
    private static final class a
      implements iw
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      /* Error */
      public final IBinder a(a parama, String paramString, oc paramoc, int paramInt)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 5
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +88 -> 109
        //   24: aload_1
        //   25: invokeinterface 37 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: aload_2
        //   40: invokevirtual 43	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 5
        //   45: astore_1
        //   46: aload_3
        //   47: ifnull +10 -> 57
        //   50: aload_3
        //   51: invokeinterface 46 1 0
        //   56: astore_1
        //   57: aload 6
        //   59: aload_1
        //   60: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   63: aload 6
        //   65: iload 4
        //   67: invokevirtual 50	android/os/Parcel:writeInt	(I)V
        //   70: aload_0
        //   71: getfield 17	com/google/android/gms/b/iw$a$a:a	Landroid/os/IBinder;
        //   74: iconst_1
        //   75: aload 6
        //   77: aload 7
        //   79: iconst_0
        //   80: invokeinterface 56 5 0
        //   85: pop
        //   86: aload 7
        //   88: invokevirtual 59	android/os/Parcel:readException	()V
        //   91: aload 7
        //   93: invokevirtual 62	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   96: astore_1
        //   97: aload 7
        //   99: invokevirtual 65	android/os/Parcel:recycle	()V
        //   102: aload 6
        //   104: invokevirtual 65	android/os/Parcel:recycle	()V
        //   107: aload_1
        //   108: areturn
        //   109: aconst_null
        //   110: astore_1
        //   111: goto -80 -> 31
        //   114: astore_1
        //   115: aload 7
        //   117: invokevirtual 65	android/os/Parcel:recycle	()V
        //   120: aload 6
        //   122: invokevirtual 65	android/os/Parcel:recycle	()V
        //   125: aload_1
        //   126: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	127	0	this	a
        //   0	127	1	parama	a
        //   0	127	2	paramString	String
        //   0	127	3	paramoc	oc
        //   0	127	4	paramInt	int
        //   1	43	5	localObject	Object
        //   6	115	6	localParcel1	Parcel
        //   11	105	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	114	finally
        //   24	31	114	finally
        //   31	43	114	finally
        //   50	57	114	finally
        //   57	97	114	finally
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/iw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */