package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

final class lh$a$a
  implements lh
{
  private IBinder a;
  
  lh$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final a a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
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
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  /* Error */
  public final android.net.Uri b()
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: ldc 22
    //   10: astore_3
    //   11: aload_1
    //   12: aload_3
    //   13: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 14	com/google/android/gms/b/lh$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: iconst_2
    //   22: istore 4
    //   24: aload_3
    //   25: iload 4
    //   27: aload_1
    //   28: aload_2
    //   29: iconst_0
    //   30: invokeinterface 33 5 0
    //   35: pop
    //   36: aload_2
    //   37: invokevirtual 36	android/os/Parcel:readException	()V
    //   40: aload_2
    //   41: invokevirtual 53	android/os/Parcel:readInt	()I
    //   44: istore 5
    //   46: iload 5
    //   48: ifeq +30 -> 78
    //   51: getstatic 59	android/net/Uri:CREATOR	Landroid/os/Parcelable$Creator;
    //   54: astore_3
    //   55: aload_3
    //   56: aload_2
    //   57: invokeinterface 65 2 0
    //   62: astore_3
    //   63: aload_3
    //   64: checkcast 55	android/net/Uri
    //   67: astore_3
    //   68: aload_2
    //   69: invokevirtual 48	android/os/Parcel:recycle	()V
    //   72: aload_1
    //   73: invokevirtual 48	android/os/Parcel:recycle	()V
    //   76: aload_3
    //   77: areturn
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore_3
    //   83: goto -15 -> 68
    //   86: astore_3
    //   87: aload_2
    //   88: invokevirtual 48	android/os/Parcel:recycle	()V
    //   91: aload_1
    //   92: invokevirtual 48	android/os/Parcel:recycle	()V
    //   95: aload_3
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	a
    //   3	89	1	localParcel1	Parcel
    //   7	81	2	localParcel2	Parcel
    //   10	73	3	localObject1	Object
    //   86	10	3	localObject2	Object
    //   22	4	4	i	int
    //   44	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	86	finally
    //   16	20	86	finally
    //   29	36	86	finally
    //   36	40	86	finally
    //   40	44	86	finally
    //   51	54	86	finally
    //   56	62	86	finally
    //   63	67	86	finally
  }
  
  public final double c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 3;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      double d = localParcel2.readDouble();
      return d;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              com/google/android/gms/b/lh$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */