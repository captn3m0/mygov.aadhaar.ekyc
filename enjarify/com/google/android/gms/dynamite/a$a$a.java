package com.google.android.gms.dynamite;

import android.os.IBinder;

final class a$a$a
  implements a
{
  private IBinder a;
  
  a$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  /* Error */
  public final int a(com.google.android.gms.a.a parama, String paramString)
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
    //   19: aload_1
    //   20: ifnull +69 -> 89
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_3
    //   38: aload_2
    //   39: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/dynamite/a$a$a:a	Landroid/os/IBinder;
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
    //   72: invokevirtual 53	android/os/Parcel:readInt	()I
    //   75: istore 7
    //   77: aload 4
    //   79: invokevirtual 56	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 56	android/os/Parcel:recycle	()V
    //   86: iload 7
    //   88: ireturn
    //   89: iconst_0
    //   90: istore 7
    //   92: aconst_null
    //   93: astore 5
    //   95: goto -64 -> 31
    //   98: astore 5
    //   100: aload 4
    //   102: invokevirtual 56	android/os/Parcel:recycle	()V
    //   105: aload_3
    //   106: invokevirtual 56	android/os/Parcel:recycle	()V
    //   109: aload 5
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	a
    //   0	112	1	parama	com.google.android.gms.a.a
    //   0	112	2	paramString	String
    //   3	103	3	localParcel1	android.os.Parcel
    //   7	94	4	localParcel2	android.os.Parcel
    //   11	83	5	localObject1	Object
    //   98	12	5	localObject2	Object
    //   49	5	6	i	int
    //   75	16	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	98	finally
    //   23	29	98	finally
    //   32	37	98	finally
    //   38	42	98	finally
    //   42	46	98	finally
    //   58	65	98	finally
    //   65	70	98	finally
    //   70	75	98	finally
  }
  
  /* Error */
  public final int a(com.google.android.gms.a.a parama, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 6
    //   11: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   14: astore 7
    //   16: ldc 22
    //   18: astore 8
    //   20: aload 6
    //   22: aload 8
    //   24: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   27: aload_1
    //   28: ifnull +87 -> 115
    //   31: aload_1
    //   32: invokeinterface 32 1 0
    //   37: astore 8
    //   39: aload 6
    //   41: aload 8
    //   43: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   46: aload 6
    //   48: aload_2
    //   49: invokevirtual 39	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   52: iload_3
    //   53: ifeq +6 -> 59
    //   56: iconst_1
    //   57: istore 4
    //   59: aload 6
    //   61: iload 4
    //   63: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   66: aload_0
    //   67: getfield 14	com/google/android/gms/dynamite/a$a$a:a	Landroid/os/IBinder;
    //   70: astore 5
    //   72: iconst_3
    //   73: istore 9
    //   75: aload 5
    //   77: iload 9
    //   79: aload 6
    //   81: aload 7
    //   83: iconst_0
    //   84: invokeinterface 46 5 0
    //   89: pop
    //   90: aload 7
    //   92: invokevirtual 49	android/os/Parcel:readException	()V
    //   95: aload 7
    //   97: invokevirtual 53	android/os/Parcel:readInt	()I
    //   100: istore 4
    //   102: aload 7
    //   104: invokevirtual 56	android/os/Parcel:recycle	()V
    //   107: aload 6
    //   109: invokevirtual 56	android/os/Parcel:recycle	()V
    //   112: iload 4
    //   114: ireturn
    //   115: iconst_0
    //   116: istore 9
    //   118: aconst_null
    //   119: astore 8
    //   121: goto -82 -> 39
    //   124: astore 5
    //   126: aload 7
    //   128: invokevirtual 56	android/os/Parcel:recycle	()V
    //   131: aload 6
    //   133: invokevirtual 56	android/os/Parcel:recycle	()V
    //   136: aload 5
    //   138: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	a
    //   0	139	1	parama	com.google.android.gms.a.a
    //   0	139	2	paramString	String
    //   0	139	3	paramBoolean	boolean
    //   1	112	4	i	int
    //   4	72	5	localIBinder	IBinder
    //   124	13	5	localObject1	Object
    //   9	123	6	localParcel1	android.os.Parcel
    //   14	113	7	localParcel2	android.os.Parcel
    //   18	102	8	localObject2	Object
    //   73	44	9	j	int
    // Exception table:
    //   from	to	target	type
    //   22	27	124	finally
    //   31	37	124	finally
    //   41	46	124	finally
    //   48	52	124	finally
    //   61	66	124	finally
    //   66	70	124	finally
    //   83	90	124	finally
    //   90	95	124	finally
    //   95	100	124	finally
  }
  
  /* Error */
  public final com.google.android.gms.a.a a(com.google.android.gms.a.a parama, String paramString, int paramInt)
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
    //   48: iload_3
    //   49: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   52: aload_0
    //   53: getfield 14	com/google/android/gms/dynamite/a$a$a:a	Landroid/os/IBinder;
    //   56: astore 6
    //   58: iconst_2
    //   59: istore 7
    //   61: aload 6
    //   63: iload 7
    //   65: aload 4
    //   67: aload 5
    //   69: iconst_0
    //   70: invokeinterface 46 5 0
    //   75: pop
    //   76: aload 5
    //   78: invokevirtual 49	android/os/Parcel:readException	()V
    //   81: aload 5
    //   83: invokevirtual 65	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   86: astore 6
    //   88: aload 6
    //   90: invokestatic 70	com/google/android/gms/a/a$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/a/a;
    //   93: astore 6
    //   95: aload 5
    //   97: invokevirtual 56	android/os/Parcel:recycle	()V
    //   100: aload 4
    //   102: invokevirtual 56	android/os/Parcel:recycle	()V
    //   105: aload 6
    //   107: areturn
    //   108: aconst_null
    //   109: astore 6
    //   111: goto -78 -> 33
    //   114: astore 6
    //   116: aload 5
    //   118: invokevirtual 56	android/os/Parcel:recycle	()V
    //   121: aload 4
    //   123: invokevirtual 56	android/os/Parcel:recycle	()V
    //   126: aload 6
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	a
    //   0	129	1	parama	com.google.android.gms.a.a
    //   0	129	2	paramString	String
    //   0	129	3	paramInt	int
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


/* Location:              com/google/android/gms/dynamite/a$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */