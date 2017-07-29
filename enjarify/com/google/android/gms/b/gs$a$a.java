package com.google.android.gms.b;

import android.os.IBinder;

final class gs$a$a
  implements gs
{
  private IBinder a;
  
  gs$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  /* Error */
  public final IBinder a(String paramString, com.google.android.gms.a.a parama)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: ldc 22
    //   11: astore 5
    //   13: aload_3
    //   14: aload 5
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 29	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +64 -> 89
    //   28: aload_2
    //   29: invokeinterface 35 1 0
    //   34: astore 5
    //   36: aload_3
    //   37: aload 5
    //   39: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/b/gs$a$a:a	Landroid/os/IBinder;
    //   46: astore 5
    //   48: iconst_1
    //   49: istore 6
    //   51: aload 5
    //   53: iload 6
    //   55: aload_3
    //   56: aload 4
    //   58: iconst_0
    //   59: invokeinterface 46 5 0
    //   64: pop
    //   65: aload 4
    //   67: invokevirtual 49	android/os/Parcel:readException	()V
    //   70: aload 4
    //   72: invokevirtual 52	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   75: astore 5
    //   77: aload 4
    //   79: invokevirtual 55	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload 5
    //   88: areturn
    //   89: aconst_null
    //   90: astore 5
    //   92: goto -56 -> 36
    //   95: astore 5
    //   97: aload 4
    //   99: invokevirtual 55	android/os/Parcel:recycle	()V
    //   102: aload_3
    //   103: invokevirtual 55	android/os/Parcel:recycle	()V
    //   106: aload 5
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	a
    //   0	109	1	paramString	String
    //   0	109	2	parama	com.google.android.gms.a.a
    //   3	100	3	localParcel1	android.os.Parcel
    //   7	91	4	localParcel2	android.os.Parcel
    //   11	80	5	localObject1	Object
    //   95	12	5	localObject2	Object
    //   49	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	95	finally
    //   20	24	95	finally
    //   28	34	95	finally
    //   37	42	95	finally
    //   42	46	95	finally
    //   58	65	95	finally
    //   65	70	95	finally
    //   70	75	95	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  /* Error */
  public final IBinder b(String paramString, com.google.android.gms.a.a parama)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: ldc 22
    //   11: astore 5
    //   13: aload_3
    //   14: aload 5
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 29	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +64 -> 89
    //   28: aload_2
    //   29: invokeinterface 35 1 0
    //   34: astore 5
    //   36: aload_3
    //   37: aload 5
    //   39: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/b/gs$a$a:a	Landroid/os/IBinder;
    //   46: astore 5
    //   48: iconst_2
    //   49: istore 6
    //   51: aload 5
    //   53: iload 6
    //   55: aload_3
    //   56: aload 4
    //   58: iconst_0
    //   59: invokeinterface 46 5 0
    //   64: pop
    //   65: aload 4
    //   67: invokevirtual 49	android/os/Parcel:readException	()V
    //   70: aload 4
    //   72: invokevirtual 52	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   75: astore 5
    //   77: aload 4
    //   79: invokevirtual 55	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload 5
    //   88: areturn
    //   89: aconst_null
    //   90: astore 5
    //   92: goto -56 -> 36
    //   95: astore 5
    //   97: aload 4
    //   99: invokevirtual 55	android/os/Parcel:recycle	()V
    //   102: aload_3
    //   103: invokevirtual 55	android/os/Parcel:recycle	()V
    //   106: aload 5
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	a
    //   0	109	1	paramString	String
    //   0	109	2	parama	com.google.android.gms.a.a
    //   3	100	3	localParcel1	android.os.Parcel
    //   7	91	4	localParcel2	android.os.Parcel
    //   11	80	5	localObject1	Object
    //   95	12	5	localObject2	Object
    //   49	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	95	finally
    //   20	24	95	finally
    //   28	34	95	finally
    //   37	42	95	finally
    //   42	46	95	finally
    //   58	65	95	finally
    //   65	70	95	finally
    //   70	75	95	finally
  }
}


/* Location:              com/google/android/gms/b/gs$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */