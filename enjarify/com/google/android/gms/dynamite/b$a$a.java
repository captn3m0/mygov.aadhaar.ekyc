package com.google.android.gms.dynamite;

import android.os.IBinder;

final class b$a$a
  implements b
{
  private IBinder a;
  
  b$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  /* Error */
  public final com.google.android.gms.a.a a(com.google.android.gms.a.a parama, String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: ldc 22
    //   12: astore 6
    //   14: aload 4
    //   16: aload 6
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +86 -> 108
    //   25: aload_1
    //   26: invokeinterface 32 1 0
    //   31: astore 6
    //   33: aload 4
    //   35: aload 6
    //   37: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   40: aload 4
    //   42: aload_2
    //   43: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 4
    //   48: aload_3
    //   49: invokevirtual 43	android/os/Parcel:writeByteArray	([B)V
    //   52: aload_0
    //   53: getfield 14	com/google/android/gms/dynamite/b$a$a:a	Landroid/os/IBinder;
    //   56: astore 6
    //   58: iconst_1
    //   59: istore 7
    //   61: aload 6
    //   63: iload 7
    //   65: aload 4
    //   67: aload 5
    //   69: iconst_0
    //   70: invokeinterface 50 5 0
    //   75: pop
    //   76: aload 5
    //   78: invokevirtual 53	android/os/Parcel:readException	()V
    //   81: aload 5
    //   83: invokevirtual 56	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   86: astore 6
    //   88: aload 6
    //   90: invokestatic 61	com/google/android/gms/a/a$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/a/a;
    //   93: astore 6
    //   95: aload 5
    //   97: invokevirtual 64	android/os/Parcel:recycle	()V
    //   100: aload 4
    //   102: invokevirtual 64	android/os/Parcel:recycle	()V
    //   105: aload 6
    //   107: areturn
    //   108: aconst_null
    //   109: astore 6
    //   111: goto -78 -> 33
    //   114: astore 6
    //   116: aload 5
    //   118: invokevirtual 64	android/os/Parcel:recycle	()V
    //   121: aload 4
    //   123: invokevirtual 64	android/os/Parcel:recycle	()V
    //   126: aload 6
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	a
    //   0	129	1	parama	com.google.android.gms.a.a
    //   0	129	2	paramString	String
    //   0	129	3	paramArrayOfByte	byte[]
    //   3	119	4	localParcel1	android.os.Parcel
    //   8	109	5	localParcel2	android.os.Parcel
    //   12	98	6	localObject1	Object
    //   114	13	6	localObject2	Object
    //   59	5	7	i	int
    // Exception table:
    //   from	to	target	type
    //   16	21	114	finally
    //   25	31	114	finally
    //   35	40	114	finally
    //   42	46	114	finally
    //   48	52	114	finally
    //   52	56	114	finally
    //   69	76	114	finally
    //   76	81	114	finally
    //   81	86	114	finally
    //   88	93	114	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/dynamite/b$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */