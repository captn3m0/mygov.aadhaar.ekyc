package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

final class lp$a$a
  implements lp
{
  private IBinder a;
  
  lp$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final String a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
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
  
  public final List a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 3;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.createStringArrayList();
      return (List)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final boolean a(a parama)
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
    //   26: ifnull +74 -> 100
    //   29: aload_1
    //   30: invokeinterface 57 1 0
    //   35: astore 6
    //   37: aload 4
    //   39: aload 6
    //   41: invokevirtual 61	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   44: aload_0
    //   45: getfield 14	com/google/android/gms/b/lp$a$a:a	Landroid/os/IBinder;
    //   48: astore 6
    //   50: bipush 10
    //   52: istore 7
    //   54: aload 6
    //   56: iload 7
    //   58: aload 4
    //   60: aload 5
    //   62: iconst_0
    //   63: invokeinterface 36 5 0
    //   68: pop
    //   69: aload 5
    //   71: invokevirtual 39	android/os/Parcel:readException	()V
    //   74: aload 5
    //   76: invokevirtual 66	android/os/Parcel:readInt	()I
    //   79: istore 8
    //   81: iload 8
    //   83: ifeq +5 -> 88
    //   86: iconst_1
    //   87: istore_2
    //   88: aload 5
    //   90: invokevirtual 46	android/os/Parcel:recycle	()V
    //   93: aload 4
    //   95: invokevirtual 46	android/os/Parcel:recycle	()V
    //   98: iload_2
    //   99: ireturn
    //   100: iconst_0
    //   101: istore 8
    //   103: aconst_null
    //   104: astore 6
    //   106: goto -69 -> 37
    //   109: astore_3
    //   110: aload 5
    //   112: invokevirtual 46	android/os/Parcel:recycle	()V
    //   115: aload 4
    //   117: invokevirtual 46	android/os/Parcel:recycle	()V
    //   120: aload_3
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	a
    //   0	122	1	parama	a
    //   1	98	2	bool	boolean
    //   3	1	3	localObject1	Object
    //   109	12	3	localObject2	Object
    //   7	109	4	localParcel1	Parcel
    //   12	99	5	localParcel2	Parcel
    //   16	89	6	localObject3	Object
    //   52	5	7	i	int
    //   79	23	8	j	int
    // Exception table:
    //   from	to	target	type
    //   20	25	109	finally
    //   29	35	109	finally
    //   39	44	109	finally
    //   44	48	109	finally
    //   62	69	109	finally
    //   69	74	109	finally
    //   74	79	109	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final jf b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 7;
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
  
  public final lh b(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = a;
      int i = 2;
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
  
  public final void c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 6;
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
  
  public final void c(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
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
  
  public final a d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 9;
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
  
  public final void e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 8;
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
  
  public final String l()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 4;
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
}


/* Location:              com/google/android/gms/b/lp$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */