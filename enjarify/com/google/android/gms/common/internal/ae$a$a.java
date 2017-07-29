package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

final class ae$a$a
  implements ae
{
  private IBinder a;
  
  ae$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final a a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.common.internal.IGoogleCertificatesApi";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = a.a.a((IBinder)localObject1);
      return (a)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final boolean a(String paramString, a parama)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   13: astore 6
    //   15: ldc 22
    //   17: astore 7
    //   19: aload 5
    //   21: aload 7
    //   23: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   26: aload 5
    //   28: aload_1
    //   29: invokevirtual 51	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   32: aload_2
    //   33: ifnull +73 -> 106
    //   36: aload_2
    //   37: invokeinterface 56 1 0
    //   42: astore 7
    //   44: aload 5
    //   46: aload 7
    //   48: invokevirtual 60	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   51: aload_0
    //   52: getfield 14	com/google/android/gms/common/internal/ae$a$a:a	Landroid/os/IBinder;
    //   55: astore 7
    //   57: iconst_3
    //   58: istore 8
    //   60: aload 7
    //   62: iload 8
    //   64: aload 5
    //   66: aload 6
    //   68: iconst_0
    //   69: invokeinterface 33 5 0
    //   74: pop
    //   75: aload 6
    //   77: invokevirtual 36	android/os/Parcel:readException	()V
    //   80: aload 6
    //   82: invokevirtual 65	android/os/Parcel:readInt	()I
    //   85: istore 9
    //   87: iload 9
    //   89: ifeq +5 -> 94
    //   92: iconst_1
    //   93: istore_3
    //   94: aload 6
    //   96: invokevirtual 48	android/os/Parcel:recycle	()V
    //   99: aload 5
    //   101: invokevirtual 48	android/os/Parcel:recycle	()V
    //   104: iload_3
    //   105: ireturn
    //   106: iconst_0
    //   107: istore 9
    //   109: aconst_null
    //   110: astore 7
    //   112: goto -68 -> 44
    //   115: astore 4
    //   117: aload 6
    //   119: invokevirtual 48	android/os/Parcel:recycle	()V
    //   122: aload 5
    //   124: invokevirtual 48	android/os/Parcel:recycle	()V
    //   127: aload 4
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	a
    //   0	130	1	paramString	String
    //   0	130	2	parama	a
    //   1	104	3	bool	boolean
    //   3	1	4	localObject1	Object
    //   115	13	4	localObject2	Object
    //   8	115	5	localParcel1	Parcel
    //   13	105	6	localParcel2	Parcel
    //   17	94	7	localObject3	Object
    //   58	5	8	i	int
    //   85	23	9	j	int
    // Exception table:
    //   from	to	target	type
    //   21	26	115	finally
    //   28	32	115	finally
    //   36	42	115	finally
    //   46	51	115	finally
    //   51	55	115	finally
    //   68	75	115	finally
    //   75	80	115	finally
    //   80	85	115	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final a b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.common.internal.IGoogleCertificatesApi";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 2;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = a.a.a((IBinder)localObject1);
      return (a)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final boolean b(String paramString, a parama)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   13: astore 6
    //   15: ldc 22
    //   17: astore 7
    //   19: aload 5
    //   21: aload 7
    //   23: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   26: aload 5
    //   28: aload_1
    //   29: invokevirtual 51	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   32: aload_2
    //   33: ifnull +73 -> 106
    //   36: aload_2
    //   37: invokeinterface 56 1 0
    //   42: astore 7
    //   44: aload 5
    //   46: aload 7
    //   48: invokevirtual 60	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   51: aload_0
    //   52: getfield 14	com/google/android/gms/common/internal/ae$a$a:a	Landroid/os/IBinder;
    //   55: astore 7
    //   57: iconst_4
    //   58: istore 8
    //   60: aload 7
    //   62: iload 8
    //   64: aload 5
    //   66: aload 6
    //   68: iconst_0
    //   69: invokeinterface 33 5 0
    //   74: pop
    //   75: aload 6
    //   77: invokevirtual 36	android/os/Parcel:readException	()V
    //   80: aload 6
    //   82: invokevirtual 65	android/os/Parcel:readInt	()I
    //   85: istore 9
    //   87: iload 9
    //   89: ifeq +5 -> 94
    //   92: iconst_1
    //   93: istore_3
    //   94: aload 6
    //   96: invokevirtual 48	android/os/Parcel:recycle	()V
    //   99: aload 5
    //   101: invokevirtual 48	android/os/Parcel:recycle	()V
    //   104: iload_3
    //   105: ireturn
    //   106: iconst_0
    //   107: istore 9
    //   109: aconst_null
    //   110: astore 7
    //   112: goto -68 -> 44
    //   115: astore 4
    //   117: aload 6
    //   119: invokevirtual 48	android/os/Parcel:recycle	()V
    //   122: aload 5
    //   124: invokevirtual 48	android/os/Parcel:recycle	()V
    //   127: aload 4
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	a
    //   0	130	1	paramString	String
    //   0	130	2	parama	a
    //   1	104	3	bool	boolean
    //   3	1	4	localObject1	Object
    //   115	13	4	localObject2	Object
    //   8	115	5	localParcel1	Parcel
    //   13	105	6	localParcel2	Parcel
    //   17	94	7	localObject3	Object
    //   58	5	8	i	int
    //   85	23	9	j	int
    // Exception table:
    //   from	to	target	type
    //   21	26	115	finally
    //   28	32	115	finally
    //   36	42	115	finally
    //   46	51	115	finally
    //   51	55	115	finally
    //   68	75	115	finally
    //   75	80	115	finally
    //   80	85	115	finally
  }
}


/* Location:              com/google/android/gms/common/internal/ae$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */