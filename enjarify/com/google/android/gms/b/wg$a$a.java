package com.google.android.gms.b;

import android.os.IBinder;

final class wg$a$a
  implements wg
{
  private IBinder a;
  
  wg$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.api.Status paramStatus)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +52 -> 65
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 37	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
    //   40: astore_3
    //   41: iconst_1
    //   42: istore 5
    //   44: iconst_1
    //   45: istore 6
    //   47: aload_3
    //   48: iload 5
    //   50: aload_2
    //   51: aconst_null
    //   52: iload 6
    //   54: invokeinterface 43 5 0
    //   59: pop
    //   60: aload_2
    //   61: invokevirtual 46	android/os/Parcel:recycle	()V
    //   64: return
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: iconst_0
    //   72: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   75: goto -39 -> 36
    //   78: astore_3
    //   79: aload_2
    //   80: invokevirtual 46	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	a
    //   0	85	1	paramStatus	com.google.android.gms.common.api.Status
    //   3	77	2	localParcel	android.os.Parcel
    //   6	64	3	localObject1	Object
    //   78	6	3	localObject2	Object
    //   17	50	4	i	int
    //   42	7	5	j	int
    //   45	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	78	finally
    //   20	25	78	finally
    //   32	36	78	finally
    //   36	40	78	finally
    //   52	60	78	finally
    //   71	75	78	finally
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.api.Status paramStatus, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: ldc 22
    //   7: astore 5
    //   9: aload 4
    //   11: aload 5
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_1
    //   17: ifnull +65 -> 82
    //   20: iconst_1
    //   21: istore 6
    //   23: aload 4
    //   25: iload 6
    //   27: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   30: iconst_0
    //   31: istore 6
    //   33: aconst_null
    //   34: astore 5
    //   36: aload_1
    //   37: aload 4
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload 4
    //   45: lload_2
    //   46: invokevirtual 50	android/os/Parcel:writeLong	(J)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: iconst_3
    //   56: istore 7
    //   58: iconst_1
    //   59: istore 8
    //   61: aload 5
    //   63: iload 7
    //   65: aload 4
    //   67: aconst_null
    //   68: iload 8
    //   70: invokeinterface 43 5 0
    //   75: pop
    //   76: aload 4
    //   78: invokevirtual 46	android/os/Parcel:recycle	()V
    //   81: return
    //   82: iconst_0
    //   83: istore 6
    //   85: aconst_null
    //   86: astore 5
    //   88: aload 4
    //   90: iconst_0
    //   91: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   94: goto -51 -> 43
    //   97: astore 5
    //   99: aload 4
    //   101: invokevirtual 46	android/os/Parcel:recycle	()V
    //   104: aload 5
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	a
    //   0	107	1	paramStatus	com.google.android.gms.common.api.Status
    //   0	107	2	paramLong	long
    //   3	97	4	localParcel	android.os.Parcel
    //   7	80	5	localObject1	Object
    //   97	8	5	localObject2	Object
    //   21	63	6	i	int
    //   56	8	7	j	int
    //   59	10	8	k	int
    // Exception table:
    //   from	to	target	type
    //   11	16	97	finally
    //   25	30	97	finally
    //   39	43	97	finally
    //   45	49	97	finally
    //   49	53	97	finally
    //   68	76	97	finally
    //   90	94	97	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  /* Error */
  public final void b(com.google.android.gms.common.api.Status paramStatus)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +52 -> 65
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 37	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
    //   40: astore_3
    //   41: iconst_2
    //   42: istore 5
    //   44: iconst_1
    //   45: istore 6
    //   47: aload_3
    //   48: iload 5
    //   50: aload_2
    //   51: aconst_null
    //   52: iload 6
    //   54: invokeinterface 43 5 0
    //   59: pop
    //   60: aload_2
    //   61: invokevirtual 46	android/os/Parcel:recycle	()V
    //   64: return
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: iconst_0
    //   72: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   75: goto -39 -> 36
    //   78: astore_3
    //   79: aload_2
    //   80: invokevirtual 46	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	a
    //   0	85	1	paramStatus	com.google.android.gms.common.api.Status
    //   3	77	2	localParcel	android.os.Parcel
    //   6	64	3	localObject1	Object
    //   78	6	3	localObject2	Object
    //   17	50	4	i	int
    //   42	7	5	j	int
    //   45	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	78	finally
    //   20	25	78	finally
    //   32	36	78	finally
    //   36	40	78	finally
    //   52	60	78	finally
    //   71	75	78	finally
  }
  
  /* Error */
  public final void b(com.google.android.gms.common.api.Status paramStatus, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: ldc 22
    //   7: astore 5
    //   9: aload 4
    //   11: aload 5
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_1
    //   17: ifnull +65 -> 82
    //   20: iconst_1
    //   21: istore 6
    //   23: aload 4
    //   25: iload 6
    //   27: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   30: iconst_0
    //   31: istore 6
    //   33: aconst_null
    //   34: astore 5
    //   36: aload_1
    //   37: aload 4
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload 4
    //   45: lload_2
    //   46: invokevirtual 50	android/os/Parcel:writeLong	(J)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: iconst_5
    //   56: istore 7
    //   58: iconst_1
    //   59: istore 8
    //   61: aload 5
    //   63: iload 7
    //   65: aload 4
    //   67: aconst_null
    //   68: iload 8
    //   70: invokeinterface 43 5 0
    //   75: pop
    //   76: aload 4
    //   78: invokevirtual 46	android/os/Parcel:recycle	()V
    //   81: return
    //   82: iconst_0
    //   83: istore 6
    //   85: aconst_null
    //   86: astore 5
    //   88: aload 4
    //   90: iconst_0
    //   91: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   94: goto -51 -> 43
    //   97: astore 5
    //   99: aload 4
    //   101: invokevirtual 46	android/os/Parcel:recycle	()V
    //   104: aload 5
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	a
    //   0	107	1	paramStatus	com.google.android.gms.common.api.Status
    //   0	107	2	paramLong	long
    //   3	97	4	localParcel	android.os.Parcel
    //   7	80	5	localObject1	Object
    //   97	8	5	localObject2	Object
    //   21	63	6	i	int
    //   56	8	7	j	int
    //   59	10	8	k	int
    // Exception table:
    //   from	to	target	type
    //   11	16	97	finally
    //   25	30	97	finally
    //   39	43	97	finally
    //   45	49	97	finally
    //   49	53	97	finally
    //   68	76	97	finally
    //   90	94	97	finally
  }
  
  /* Error */
  public final void c(com.google.android.gms.common.api.Status paramStatus)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: ldc 22
    //   6: astore_3
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnull +52 -> 65
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_2
    //   20: iload 4
    //   22: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 37	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
    //   40: astore_3
    //   41: iconst_4
    //   42: istore 5
    //   44: iconst_1
    //   45: istore 6
    //   47: aload_3
    //   48: iload 5
    //   50: aload_2
    //   51: aconst_null
    //   52: iload 6
    //   54: invokeinterface 43 5 0
    //   59: pop
    //   60: aload_2
    //   61: invokevirtual 46	android/os/Parcel:recycle	()V
    //   64: return
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: iconst_0
    //   72: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   75: goto -39 -> 36
    //   78: astore_3
    //   79: aload_2
    //   80: invokevirtual 46	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	a
    //   0	85	1	paramStatus	com.google.android.gms.common.api.Status
    //   3	77	2	localParcel	android.os.Parcel
    //   6	64	3	localObject1	Object
    //   78	6	3	localObject2	Object
    //   17	50	4	i	int
    //   42	7	5	j	int
    //   45	8	6	k	int
    // Exception table:
    //   from	to	target	type
    //   8	12	78	finally
    //   20	25	78	finally
    //   32	36	78	finally
    //   36	40	78	finally
    //   52	60	78	finally
    //   71	75	78	finally
  }
}


/* Location:              com/google/android/gms/b/wg$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */