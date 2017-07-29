package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

final class ll$a$a
  implements ll
{
  private IBinder a;
  
  ll$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final String a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 3;
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
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final List b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 4;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = getClass();
      localObject1 = ((Class)localObject1).getClassLoader();
      localObject1 = localParcel2.readArrayList((ClassLoader)localObject1);
      return (List)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final String c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 5;
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
  
  public final lh d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 6;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = lh.a.a((IBinder)localObject1);
      return (lh)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final String e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 7;
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
  
  public final double f()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 8;
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
  
  public final String g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 9;
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
  
  public final String h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 10;
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
  
  public final jf i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 13;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = jf.a.a((IBinder)localObject1);
      return (jf)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final a j()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
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
  public final android.os.Bundle n()
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
    //   17: getfield 14	com/google/android/gms/b/ll$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 11
    //   23: istore 4
    //   25: aload_3
    //   26: iload 4
    //   28: aload_1
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 33 5 0
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 36	android/os/Parcel:readException	()V
    //   41: aload_2
    //   42: invokevirtual 94	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 100	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 106 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 96	android/os/Bundle
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 43	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 43	android/os/Parcel:recycle	()V
    //   96: aload_3
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   3	90	1	localParcel1	Parcel
    //   7	82	2	localParcel2	Parcel
    //   10	74	3	localObject1	Object
    //   87	10	3	localObject2	Object
    //   23	4	4	i	int
    //   45	36	5	j	int
    // Exception table:
    //   from	to	target	type
    //   12	16	87	finally
    //   16	20	87	finally
    //   30	37	87	finally
    //   37	41	87	finally
    //   41	45	87	finally
    //   52	55	87	finally
    //   57	63	87	finally
    //   64	68	87	finally
  }
  
  public final void p()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 12;
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
}


/* Location:              com/google/android/gms/b/ll$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */