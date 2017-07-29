package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class jc$a$a
  implements jc
{
  private IBinder a;
  
  jc$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final void a(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeFloat(paramFloat);
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
  public final void a(com.google.android.gms.a.a parama, String paramString)
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
    //   20: ifnull +60 -> 80
    //   23: aload_1
    //   24: invokeinterface 49 1 0
    //   29: astore 5
    //   31: aload_3
    //   32: aload 5
    //   34: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_3
    //   38: aload_2
    //   39: invokevirtual 56	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/b/jc$a$a:a	Landroid/os/IBinder;
    //   46: astore 5
    //   48: iconst_5
    //   49: istore 6
    //   51: aload 5
    //   53: iload 6
    //   55: aload_3
    //   56: aload 4
    //   58: iconst_0
    //   59: invokeinterface 37 5 0
    //   64: pop
    //   65: aload 4
    //   67: invokevirtual 40	android/os/Parcel:readException	()V
    //   70: aload 4
    //   72: invokevirtual 43	android/os/Parcel:recycle	()V
    //   75: aload_3
    //   76: invokevirtual 43	android/os/Parcel:recycle	()V
    //   79: return
    //   80: aconst_null
    //   81: astore 5
    //   83: goto -52 -> 31
    //   86: astore 5
    //   88: aload 4
    //   90: invokevirtual 43	android/os/Parcel:recycle	()V
    //   93: aload_3
    //   94: invokevirtual 43	android/os/Parcel:recycle	()V
    //   97: aload 5
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	a
    //   0	100	1	parama	com.google.android.gms.a.a
    //   0	100	2	paramString	String
    //   3	91	3	localParcel1	Parcel
    //   7	82	4	localParcel2	Parcel
    //   11	71	5	localObject1	Object
    //   86	12	5	localObject2	Object
    //   49	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	86	finally
    //   23	29	86	finally
    //   32	37	86	finally
    //   38	42	86	finally
    //   42	46	86	finally
    //   58	65	86	finally
    //   65	70	86	finally
  }
  
  public final void a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString);
      localObject1 = a;
      int i = 3;
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
  public final void a(String paramString, com.google.android.gms.a.a parama)
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
    //   21: invokevirtual 56	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: ifnull +56 -> 81
    //   28: aload_2
    //   29: invokeinterface 49 1 0
    //   34: astore 5
    //   36: aload_3
    //   37: aload 5
    //   39: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   42: aload_0
    //   43: getfield 14	com/google/android/gms/b/jc$a$a:a	Landroid/os/IBinder;
    //   46: astore 5
    //   48: bipush 6
    //   50: istore 6
    //   52: aload 5
    //   54: iload 6
    //   56: aload_3
    //   57: aload 4
    //   59: iconst_0
    //   60: invokeinterface 37 5 0
    //   65: pop
    //   66: aload 4
    //   68: invokevirtual 40	android/os/Parcel:readException	()V
    //   71: aload 4
    //   73: invokevirtual 43	android/os/Parcel:recycle	()V
    //   76: aload_3
    //   77: invokevirtual 43	android/os/Parcel:recycle	()V
    //   80: return
    //   81: aconst_null
    //   82: astore 5
    //   84: goto -48 -> 36
    //   87: astore 5
    //   89: aload 4
    //   91: invokevirtual 43	android/os/Parcel:recycle	()V
    //   94: aload_3
    //   95: invokevirtual 43	android/os/Parcel:recycle	()V
    //   98: aload 5
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	a
    //   0	101	1	paramString	String
    //   0	101	2	parama	com.google.android.gms.a.a
    //   3	92	3	localParcel1	Parcel
    //   7	83	4	localParcel2	Parcel
    //   11	72	5	localObject1	Object
    //   87	12	5	localObject2	Object
    //   50	5	6	i	int
    // Exception table:
    //   from	to	target	type
    //   14	19	87	finally
    //   20	24	87	finally
    //   28	34	87	finally
    //   37	42	87	finally
    //   42	46	87	finally
    //   59	66	87	finally
    //   66	71	87	finally
  }
  
  public final void a(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
    try
    {
      localParcel1.writeInterfaceToken(str);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = a;
      int j = 4;
      localIBinder.transact(j, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
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
  
  public final void b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 1;
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


/* Location:              com/google/android/gms/b/jc$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */