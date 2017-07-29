package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class gr$a$a
  implements gr
{
  private IBinder a;
  
  gr$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  /* Error */
  public final com.google.android.gms.a.a a(com.google.android.gms.a.a parama1, com.google.android.gms.a.a parama2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore 4
    //   7: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   10: astore 5
    //   12: ldc 22
    //   14: astore 6
    //   16: aload 4
    //   18: aload 6
    //   20: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   23: aload_1
    //   24: ifnull +86 -> 110
    //   27: aload_1
    //   28: invokeinterface 32 1 0
    //   33: astore 6
    //   35: aload 4
    //   37: aload 6
    //   39: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   42: aload_2
    //   43: ifnull +10 -> 53
    //   46: aload_2
    //   47: invokeinterface 32 1 0
    //   52: astore_3
    //   53: aload 4
    //   55: aload_3
    //   56: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   59: aload_0
    //   60: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   63: astore_3
    //   64: bipush 6
    //   66: istore 7
    //   68: aload_3
    //   69: iload 7
    //   71: aload 4
    //   73: aload 5
    //   75: iconst_0
    //   76: invokeinterface 43 5 0
    //   81: pop
    //   82: aload 5
    //   84: invokevirtual 46	android/os/Parcel:readException	()V
    //   87: aload 5
    //   89: invokevirtual 49	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   92: astore_3
    //   93: aload_3
    //   94: invokestatic 54	com/google/android/gms/a/a$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/a/a;
    //   97: astore_3
    //   98: aload 5
    //   100: invokevirtual 57	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: invokevirtual 57	android/os/Parcel:recycle	()V
    //   108: aload_3
    //   109: areturn
    //   110: iconst_0
    //   111: istore 7
    //   113: aconst_null
    //   114: astore 6
    //   116: goto -81 -> 35
    //   119: astore_3
    //   120: aload 5
    //   122: invokevirtual 57	android/os/Parcel:recycle	()V
    //   125: aload 4
    //   127: invokevirtual 57	android/os/Parcel:recycle	()V
    //   130: aload_3
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	a
    //   0	132	1	parama1	com.google.android.gms.a.a
    //   0	132	2	parama2	com.google.android.gms.a.a
    //   1	108	3	localObject1	Object
    //   119	12	3	localObject2	Object
    //   5	121	4	localParcel1	Parcel
    //   10	111	5	localParcel2	Parcel
    //   14	101	6	localObject3	Object
    //   66	46	7	i	int
    // Exception table:
    //   from	to	target	type
    //   18	23	119	finally
    //   27	33	119	finally
    //   37	42	119	finally
    //   46	52	119	finally
    //   55	59	119	finally
    //   59	63	119	finally
    //   75	82	119	finally
    //   82	87	119	finally
    //   87	92	119	finally
    //   93	97	119	finally
  }
  
  public final String a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.adshield.internal.IAdShieldClient";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readString();
      return (String)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final String a(com.google.android.gms.a.a parama, String paramString)
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
    //   20: ifnull +70 -> 90
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_3
    //   38: aload_2
    //   39: invokevirtual 65	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   46: astore 5
    //   48: bipush 8
    //   50: istore 6
    //   52: aload 5
    //   54: iload 6
    //   56: aload_3
    //   57: aload 4
    //   59: iconst_0
    //   60: invokeinterface 43 5 0
    //   65: pop
    //   66: aload 4
    //   68: invokevirtual 46	android/os/Parcel:readException	()V
    //   71: aload 4
    //   73: invokevirtual 62	android/os/Parcel:readString	()Ljava/lang/String;
    //   76: astore 5
    //   78: aload 4
    //   80: invokevirtual 57	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 57	android/os/Parcel:recycle	()V
    //   87: aload 5
    //   89: areturn
    //   90: aconst_null
    //   91: astore 5
    //   93: goto -62 -> 31
    //   96: astore 5
    //   98: aload 4
    //   100: invokevirtual 57	android/os/Parcel:recycle	()V
    //   103: aload_3
    //   104: invokevirtual 57	android/os/Parcel:recycle	()V
    //   107: aload 5
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	a
    //   0	110	1	parama	com.google.android.gms.a.a
    //   0	110	2	paramString	String
    //   3	101	3	localParcel1	Parcel
    //   7	92	4	localParcel2	Parcel
    //   11	81	5	localObject1	Object
    //   96	12	5	localObject2	Object
    //   50	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	96	finally
    //   23	29	96	finally
    //   32	37	96	finally
    //   38	42	96	finally
    //   42	46	96	finally
    //   59	66	96	finally
    //   66	71	96	finally
    //   71	76	96	finally
  }
  
  /* Error */
  public final String a(com.google.android.gms.a.a parama, byte[] paramArrayOfByte)
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
    //   20: ifnull +70 -> 90
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_3
    //   38: aload_2
    //   39: invokevirtual 70	android/os/Parcel:writeByteArray	([B)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   46: astore 5
    //   48: bipush 12
    //   50: istore 6
    //   52: aload 5
    //   54: iload 6
    //   56: aload_3
    //   57: aload 4
    //   59: iconst_0
    //   60: invokeinterface 43 5 0
    //   65: pop
    //   66: aload 4
    //   68: invokevirtual 46	android/os/Parcel:readException	()V
    //   71: aload 4
    //   73: invokevirtual 62	android/os/Parcel:readString	()Ljava/lang/String;
    //   76: astore 5
    //   78: aload 4
    //   80: invokevirtual 57	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 57	android/os/Parcel:recycle	()V
    //   87: aload 5
    //   89: areturn
    //   90: aconst_null
    //   91: astore 5
    //   93: goto -62 -> 31
    //   96: astore 5
    //   98: aload 4
    //   100: invokevirtual 57	android/os/Parcel:recycle	()V
    //   103: aload_3
    //   104: invokevirtual 57	android/os/Parcel:recycle	()V
    //   107: aload 5
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	a
    //   0	110	1	parama	com.google.android.gms.a.a
    //   0	110	2	paramArrayOfByte	byte[]
    //   3	101	3	localParcel1	Parcel
    //   7	92	4	localParcel2	Parcel
    //   11	81	5	localObject1	Object
    //   96	12	5	localObject2	Object
    //   50	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	96	finally
    //   23	29	96	finally
    //   32	37	96	finally
    //   38	42	96	finally
    //   42	46	96	finally
    //   59	66	96	finally
    //   66	71	96	finally
    //   71	76	96	finally
  }
  
  public final void a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.adshield.internal.IAdShieldClient";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = a;
      int i = 5;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.adshield.internal.IAdShieldClient";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localObject1 = a;
      int i = 2;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final boolean a(com.google.android.gms.a.a parama)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   12: astore 5
    //   14: ldc 22
    //   16: astore 6
    //   18: aload 4
    //   20: aload 6
    //   22: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: ifnull +73 -> 99
    //   29: aload_1
    //   30: invokeinterface 32 1 0
    //   35: astore 6
    //   37: aload 4
    //   39: aload 6
    //   41: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   44: aload_0
    //   45: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   48: astore 6
    //   50: iconst_3
    //   51: istore 7
    //   53: aload 6
    //   55: iload 7
    //   57: aload 4
    //   59: aload 5
    //   61: iconst_0
    //   62: invokeinterface 43 5 0
    //   67: pop
    //   68: aload 5
    //   70: invokevirtual 46	android/os/Parcel:readException	()V
    //   73: aload 5
    //   75: invokevirtual 78	android/os/Parcel:readInt	()I
    //   78: istore 8
    //   80: iload 8
    //   82: ifeq +5 -> 87
    //   85: iconst_1
    //   86: istore_2
    //   87: aload 5
    //   89: invokevirtual 57	android/os/Parcel:recycle	()V
    //   92: aload 4
    //   94: invokevirtual 57	android/os/Parcel:recycle	()V
    //   97: iload_2
    //   98: ireturn
    //   99: iconst_0
    //   100: istore 8
    //   102: aconst_null
    //   103: astore 6
    //   105: goto -68 -> 37
    //   108: astore_3
    //   109: aload 5
    //   111: invokevirtual 57	android/os/Parcel:recycle	()V
    //   114: aload 4
    //   116: invokevirtual 57	android/os/Parcel:recycle	()V
    //   119: aload_3
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	a
    //   0	121	1	parama	com.google.android.gms.a.a
    //   1	97	2	bool	boolean
    //   3	1	3	localObject1	Object
    //   108	12	3	localObject2	Object
    //   7	108	4	localParcel1	Parcel
    //   12	98	5	localParcel2	Parcel
    //   16	88	6	localObject3	Object
    //   51	5	7	i	int
    //   78	23	8	j	int
    // Exception table:
    //   from	to	target	type
    //   20	25	108	finally
    //   29	35	108	finally
    //   39	44	108	finally
    //   44	48	108	finally
    //   61	68	108	finally
    //   68	73	108	finally
    //   73	78	108	finally
  }
  
  /* Error */
  public final boolean a(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore 4
    //   7: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   10: astore 5
    //   12: ldc 22
    //   14: astore 6
    //   16: aload 4
    //   18: aload 6
    //   20: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   23: aload 4
    //   25: aload_1
    //   26: invokevirtual 65	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   29: iload_2
    //   30: ifeq +67 -> 97
    //   33: iload_3
    //   34: istore 7
    //   36: aload 4
    //   38: iload 7
    //   40: invokevirtual 82	android/os/Parcel:writeInt	(I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   47: astore 6
    //   49: bipush 11
    //   51: istore 8
    //   53: aload 6
    //   55: iload 8
    //   57: aload 4
    //   59: aload 5
    //   61: iconst_0
    //   62: invokeinterface 43 5 0
    //   67: pop
    //   68: aload 5
    //   70: invokevirtual 46	android/os/Parcel:readException	()V
    //   73: aload 5
    //   75: invokevirtual 78	android/os/Parcel:readInt	()I
    //   78: istore 7
    //   80: iload 7
    //   82: ifeq +24 -> 106
    //   85: aload 5
    //   87: invokevirtual 57	android/os/Parcel:recycle	()V
    //   90: aload 4
    //   92: invokevirtual 57	android/os/Parcel:recycle	()V
    //   95: iload_3
    //   96: ireturn
    //   97: iconst_0
    //   98: istore 7
    //   100: aconst_null
    //   101: astore 6
    //   103: goto -67 -> 36
    //   106: iconst_0
    //   107: istore_3
    //   108: aconst_null
    //   109: astore 9
    //   111: goto -26 -> 85
    //   114: astore 9
    //   116: aload 5
    //   118: invokevirtual 57	android/os/Parcel:recycle	()V
    //   121: aload 4
    //   123: invokevirtual 57	android/os/Parcel:recycle	()V
    //   126: aload 9
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	a
    //   0	129	1	paramString	String
    //   0	129	2	paramBoolean	boolean
    //   1	107	3	i	int
    //   5	117	4	localParcel1	Parcel
    //   10	107	5	localParcel2	Parcel
    //   14	88	6	localObject1	Object
    //   34	5	7	j	int
    //   78	21	7	k	int
    //   51	5	8	m	int
    //   109	1	9	localObject2	Object
    //   114	13	9	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   18	23	114	finally
    //   25	29	114	finally
    //   38	43	114	finally
    //   43	47	114	finally
    //   61	68	114	finally
    //   68	73	114	finally
    //   73	78	114	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  /* Error */
  public final com.google.android.gms.a.a b(com.google.android.gms.a.a parama1, com.google.android.gms.a.a parama2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore 4
    //   7: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   10: astore 5
    //   12: ldc 22
    //   14: astore 6
    //   16: aload 4
    //   18: aload 6
    //   20: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   23: aload_1
    //   24: ifnull +86 -> 110
    //   27: aload_1
    //   28: invokeinterface 32 1 0
    //   33: astore 6
    //   35: aload 4
    //   37: aload 6
    //   39: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   42: aload_2
    //   43: ifnull +10 -> 53
    //   46: aload_2
    //   47: invokeinterface 32 1 0
    //   52: astore_3
    //   53: aload 4
    //   55: aload_3
    //   56: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   59: aload_0
    //   60: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   63: astore_3
    //   64: bipush 10
    //   66: istore 7
    //   68: aload_3
    //   69: iload 7
    //   71: aload 4
    //   73: aload 5
    //   75: iconst_0
    //   76: invokeinterface 43 5 0
    //   81: pop
    //   82: aload 5
    //   84: invokevirtual 46	android/os/Parcel:readException	()V
    //   87: aload 5
    //   89: invokevirtual 49	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   92: astore_3
    //   93: aload_3
    //   94: invokestatic 54	com/google/android/gms/a/a$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/a/a;
    //   97: astore_3
    //   98: aload 5
    //   100: invokevirtual 57	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: invokevirtual 57	android/os/Parcel:recycle	()V
    //   108: aload_3
    //   109: areturn
    //   110: iconst_0
    //   111: istore 7
    //   113: aconst_null
    //   114: astore 6
    //   116: goto -81 -> 35
    //   119: astore_3
    //   120: aload 5
    //   122: invokevirtual 57	android/os/Parcel:recycle	()V
    //   125: aload 4
    //   127: invokevirtual 57	android/os/Parcel:recycle	()V
    //   130: aload_3
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	a
    //   0	132	1	parama1	com.google.android.gms.a.a
    //   0	132	2	parama2	com.google.android.gms.a.a
    //   1	108	3	localObject1	Object
    //   119	12	3	localObject2	Object
    //   5	121	4	localParcel1	Parcel
    //   10	111	5	localParcel2	Parcel
    //   14	101	6	localObject3	Object
    //   66	46	7	i	int
    // Exception table:
    //   from	to	target	type
    //   18	23	119	finally
    //   27	33	119	finally
    //   37	42	119	finally
    //   46	52	119	finally
    //   55	59	119	finally
    //   59	63	119	finally
    //   75	82	119	finally
    //   82	87	119	finally
    //   87	92	119	finally
    //   93	97	119	finally
  }
  
  /* Error */
  public final boolean b(com.google.android.gms.a.a parama)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   12: astore 5
    //   14: ldc 22
    //   16: astore 6
    //   18: aload 4
    //   20: aload 6
    //   22: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: ifnull +73 -> 99
    //   29: aload_1
    //   30: invokeinterface 32 1 0
    //   35: astore 6
    //   37: aload 4
    //   39: aload 6
    //   41: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   44: aload_0
    //   45: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   48: astore 6
    //   50: iconst_4
    //   51: istore 7
    //   53: aload 6
    //   55: iload 7
    //   57: aload 4
    //   59: aload 5
    //   61: iconst_0
    //   62: invokeinterface 43 5 0
    //   67: pop
    //   68: aload 5
    //   70: invokevirtual 46	android/os/Parcel:readException	()V
    //   73: aload 5
    //   75: invokevirtual 78	android/os/Parcel:readInt	()I
    //   78: istore 8
    //   80: iload 8
    //   82: ifeq +5 -> 87
    //   85: iconst_1
    //   86: istore_2
    //   87: aload 5
    //   89: invokevirtual 57	android/os/Parcel:recycle	()V
    //   92: aload 4
    //   94: invokevirtual 57	android/os/Parcel:recycle	()V
    //   97: iload_2
    //   98: ireturn
    //   99: iconst_0
    //   100: istore 8
    //   102: aconst_null
    //   103: astore 6
    //   105: goto -68 -> 37
    //   108: astore_3
    //   109: aload 5
    //   111: invokevirtual 57	android/os/Parcel:recycle	()V
    //   114: aload 4
    //   116: invokevirtual 57	android/os/Parcel:recycle	()V
    //   119: aload_3
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	a
    //   0	121	1	parama	com.google.android.gms.a.a
    //   1	97	2	bool	boolean
    //   3	1	3	localObject1	Object
    //   108	12	3	localObject2	Object
    //   7	108	4	localParcel1	Parcel
    //   12	98	5	localParcel2	Parcel
    //   16	88	6	localObject3	Object
    //   51	5	7	i	int
    //   78	23	8	j	int
    // Exception table:
    //   from	to	target	type
    //   20	25	108	finally
    //   29	35	108	finally
    //   39	44	108	finally
    //   44	48	108	finally
    //   61	68	108	finally
    //   68	73	108	finally
    //   73	78	108	finally
  }
  
  /* Error */
  public final String c(com.google.android.gms.a.a parama)
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
    //   19: ifnull +61 -> 80
    //   22: aload_1
    //   23: invokeinterface 32 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   40: astore 4
    //   42: bipush 7
    //   44: istore 5
    //   46: aload 4
    //   48: iload 5
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: invokeinterface 43 5 0
    //   58: pop
    //   59: aload_3
    //   60: invokevirtual 46	android/os/Parcel:readException	()V
    //   63: aload_3
    //   64: invokevirtual 62	android/os/Parcel:readString	()Ljava/lang/String;
    //   67: astore 4
    //   69: aload_3
    //   70: invokevirtual 57	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 57	android/os/Parcel:recycle	()V
    //   77: aload 4
    //   79: areturn
    //   80: aconst_null
    //   81: astore 4
    //   83: goto -53 -> 30
    //   86: astore 4
    //   88: aload_3
    //   89: invokevirtual 57	android/os/Parcel:recycle	()V
    //   92: aload_2
    //   93: invokevirtual 57	android/os/Parcel:recycle	()V
    //   96: aload 4
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	a
    //   0	99	1	parama	com.google.android.gms.a.a
    //   3	90	2	localParcel1	Parcel
    //   7	82	3	localParcel2	Parcel
    //   10	72	4	localObject1	Object
    //   86	11	4	localObject2	Object
    //   44	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   13	18	86	finally
    //   22	28	86	finally
    //   31	36	86	finally
    //   36	40	86	finally
    //   52	59	86	finally
    //   59	63	86	finally
    //   63	67	86	finally
  }
  
  /* Error */
  public final void d(com.google.android.gms.a.a parama)
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
    //   19: ifnull +53 -> 72
    //   22: aload_1
    //   23: invokeinterface 32 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/gr$a$a:a	Landroid/os/IBinder;
    //   40: astore 4
    //   42: bipush 9
    //   44: istore 5
    //   46: aload 4
    //   48: iload 5
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: invokeinterface 43 5 0
    //   58: pop
    //   59: aload_3
    //   60: invokevirtual 46	android/os/Parcel:readException	()V
    //   63: aload_3
    //   64: invokevirtual 57	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 57	android/os/Parcel:recycle	()V
    //   71: return
    //   72: aconst_null
    //   73: astore 4
    //   75: goto -45 -> 30
    //   78: astore 4
    //   80: aload_3
    //   81: invokevirtual 57	android/os/Parcel:recycle	()V
    //   84: aload_2
    //   85: invokevirtual 57	android/os/Parcel:recycle	()V
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	a
    //   0	91	1	parama	com.google.android.gms.a.a
    //   3	82	2	localParcel1	Parcel
    //   7	74	3	localParcel2	Parcel
    //   10	64	4	localObject1	Object
    //   78	11	4	localObject2	Object
    //   44	5	5	i	int
    // Exception table:
    //   from	to	target	type
    //   13	18	78	finally
    //   22	28	78	finally
    //   31	36	78	finally
    //   36	40	78	finally
    //   52	59	78	finally
    //   59	63	78	finally
  }
}


/* Location:              com/google/android/gms/b/gr$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */