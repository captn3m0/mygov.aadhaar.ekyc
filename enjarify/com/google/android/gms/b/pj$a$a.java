package com.google.android.gms.b;

import android.os.IBinder;

final class pj$a$a
  implements pj
{
  private IBinder a;
  
  pj$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  /* Error */
  public final IBinder a(com.google.android.gms.a.a parama)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 22
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +60 -> 79
    //   22: aload_1
    //   23: invokeinterface 32 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/pj$a$a:a	Landroid/os/IBinder;
    //   40: astore 4
    //   42: iconst_1
    //   43: istore 5
    //   45: aload 4
    //   47: iload 5
    //   49: aload_2
    //   50: aload_3
    //   51: iconst_0
    //   52: invokeinterface 43 5 0
    //   57: pop
    //   58: aload_3
    //   59: invokevirtual 46	android/os/Parcel:readException	()V
    //   62: aload_3
    //   63: invokevirtual 49	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 52	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 52	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: areturn
    //   79: aconst_null
    //   80: astore 4
    //   82: goto -52 -> 30
    //   85: astore 4
    //   87: aload_3
    //   88: invokevirtual 52	android/os/Parcel:recycle	()V
    //   91: aload_2
    //   92: invokevirtual 52	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   0	98	1	parama	com.google.android.gms.a.a
    //   3	89	2	localParcel1	android.os.Parcel
    //   7	81	3	localParcel2	android.os.Parcel
    //   10	71	4	localObject1	Object
    //   85	11	4	localObject2	Object
    //   43	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   13	18	85	finally
    //   22	28	85	finally
    //   31	36	85	finally
    //   36	40	85	finally
    //   51	58	85	finally
    //   58	62	85	finally
    //   62	66	85	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/pj$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */