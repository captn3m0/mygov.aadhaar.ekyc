package com.google.android.gms.common.internal;

import android.os.IBinder;

final class ad$a$a
  implements ad
{
  private final IBinder a;
  
  ad$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  /* Error */
  public final void a(ac paramac, s params)
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
    //   20: ifnull +81 -> 101
    //   23: aload_1
    //   24: invokeinterface 32 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 36	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +72 -> 110
    //   41: iconst_1
    //   42: istore 6
    //   44: aload_3
    //   45: iload 6
    //   47: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 47	com/google/android/gms/common/internal/s:writeToParcel	(Landroid/os/Parcel;I)V
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/common/internal/ad$a$a:a	Landroid/os/IBinder;
    //   66: astore 5
    //   68: bipush 46
    //   70: istore 7
    //   72: aload 5
    //   74: iload 7
    //   76: aload_3
    //   77: aload 4
    //   79: iconst_0
    //   80: invokeinterface 54 5 0
    //   85: pop
    //   86: aload 4
    //   88: invokevirtual 57	android/os/Parcel:readException	()V
    //   91: aload 4
    //   93: invokevirtual 60	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: invokevirtual 60	android/os/Parcel:recycle	()V
    //   100: return
    //   101: iconst_0
    //   102: istore 6
    //   104: aconst_null
    //   105: astore 5
    //   107: goto -76 -> 31
    //   110: iconst_0
    //   111: istore 6
    //   113: aconst_null
    //   114: astore 5
    //   116: aload_3
    //   117: iconst_0
    //   118: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   121: goto -59 -> 62
    //   124: astore 5
    //   126: aload 4
    //   128: invokevirtual 60	android/os/Parcel:recycle	()V
    //   131: aload_3
    //   132: invokevirtual 60	android/os/Parcel:recycle	()V
    //   135: aload 5
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	a
    //   0	138	1	paramac	ac
    //   0	138	2	params	s
    //   3	129	3	localParcel1	android.os.Parcel
    //   7	120	4	localParcel2	android.os.Parcel
    //   11	104	5	localObject1	Object
    //   124	12	5	localObject2	Object
    //   42	70	6	i	int
    //   70	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	124	finally
    //   23	29	124	finally
    //   32	37	124	finally
    //   45	50	124	finally
    //   58	62	124	finally
    //   62	66	124	finally
    //   79	86	124	finally
    //   86	91	124	finally
    //   117	121	124	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/common/internal/ad$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */