package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class pb$a$a
  implements pb
{
  private IBinder a;
  
  pb$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  /* Error */
  public final void a(int paramInt1, int paramInt2, android.content.Intent paramIntent)
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
    //   21: aload 4
    //   23: iload_1
    //   24: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   27: aload 4
    //   29: iload_2
    //   30: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   33: aload_3
    //   34: ifnull +67 -> 101
    //   37: iconst_1
    //   38: istore 7
    //   40: aload 4
    //   42: iload 7
    //   44: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   47: iconst_0
    //   48: istore 7
    //   50: aconst_null
    //   51: astore 6
    //   53: aload_3
    //   54: aload 4
    //   56: iconst_0
    //   57: invokevirtual 37	android/content/Intent:writeToParcel	(Landroid/os/Parcel;I)V
    //   60: aload_0
    //   61: getfield 14	com/google/android/gms/b/pb$a$a:a	Landroid/os/IBinder;
    //   64: astore 6
    //   66: bipush 12
    //   68: istore 8
    //   70: aload 6
    //   72: iload 8
    //   74: aload 4
    //   76: aload 5
    //   78: iconst_0
    //   79: invokeinterface 44 5 0
    //   84: pop
    //   85: aload 5
    //   87: invokevirtual 47	android/os/Parcel:readException	()V
    //   90: aload 5
    //   92: invokevirtual 50	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: invokevirtual 50	android/os/Parcel:recycle	()V
    //   100: return
    //   101: iconst_0
    //   102: istore 7
    //   104: aconst_null
    //   105: astore 6
    //   107: aload 4
    //   109: iconst_0
    //   110: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   113: goto -53 -> 60
    //   116: astore 6
    //   118: aload 5
    //   120: invokevirtual 50	android/os/Parcel:recycle	()V
    //   123: aload 4
    //   125: invokevirtual 50	android/os/Parcel:recycle	()V
    //   128: aload 6
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	a
    //   0	131	1	paramInt1	int
    //   0	131	2	paramInt2	int
    //   0	131	3	paramIntent	android.content.Intent
    //   3	121	4	localParcel1	Parcel
    //   8	111	5	localParcel2	Parcel
    //   12	94	6	localObject1	Object
    //   116	13	6	localObject2	Object
    //   38	65	7	i	int
    //   68	5	8	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	116	finally
    //   23	27	116	finally
    //   29	33	116	finally
    //   42	47	116	finally
    //   56	60	116	finally
    //   60	64	116	finally
    //   78	85	116	finally
    //   85	90	116	finally
    //   109	113	116	finally
  }
  
  /* Error */
  public final void a(android.os.Bundle paramBundle)
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
    //   19: ifnull +59 -> 78
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 53	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/b/pb$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_1
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 44 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 47	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 50	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 50	android/os/Parcel:recycle	()V
    //   77: return
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 4
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   89: goto -46 -> 43
    //   92: astore 4
    //   94: aload_3
    //   95: invokevirtual 50	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 50	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	a
    //   0	105	1	paramBundle	android.os.Bundle
    //   3	96	2	localParcel1	Parcel
    //   7	88	3	localParcel2	Parcel
    //   10	73	4	localObject1	Object
    //   92	11	4	localObject2	Object
    //   23	57	5	i	int
    //   50	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	92	finally
    //   26	31	92	finally
    //   39	43	92	finally
    //   43	47	92	finally
    //   58	65	92	finally
    //   65	69	92	finally
    //   85	89	92	finally
  }
  
  /* Error */
  public final void a(com.google.android.gms.a.a parama)
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
    //   23: invokeinterface 59 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/pb$a$a:a	Landroid/os/IBinder;
    //   40: astore 4
    //   42: bipush 13
    //   44: istore 5
    //   46: aload 4
    //   48: iload 5
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: invokeinterface 44 5 0
    //   58: pop
    //   59: aload_3
    //   60: invokevirtual 47	android/os/Parcel:readException	()V
    //   63: aload_3
    //   64: invokevirtual 50	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 50	android/os/Parcel:recycle	()V
    //   71: return
    //   72: aconst_null
    //   73: astore 4
    //   75: goto -45 -> 30
    //   78: astore 4
    //   80: aload_3
    //   81: invokevirtual 50	android/os/Parcel:recycle	()V
    //   84: aload_2
    //   85: invokevirtual 50	android/os/Parcel:recycle	()V
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
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  /* Error */
  public final void b(android.os.Bundle paramBundle)
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
    //   19: ifnull +76 -> 95
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 53	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/b/pb$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 6
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 44 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 47	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 69	android/os/Parcel:readInt	()I
    //   74: istore 5
    //   76: iload 5
    //   78: ifeq +8 -> 86
    //   81: aload_1
    //   82: aload_3
    //   83: invokevirtual 73	android/os/Bundle:readFromParcel	(Landroid/os/Parcel;)V
    //   86: aload_3
    //   87: invokevirtual 50	android/os/Parcel:recycle	()V
    //   90: aload_2
    //   91: invokevirtual 50	android/os/Parcel:recycle	()V
    //   94: return
    //   95: iconst_0
    //   96: istore 5
    //   98: aconst_null
    //   99: astore 4
    //   101: aload_2
    //   102: iconst_0
    //   103: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   106: goto -63 -> 43
    //   109: astore 4
    //   111: aload_3
    //   112: invokevirtual 50	android/os/Parcel:recycle	()V
    //   115: aload_2
    //   116: invokevirtual 50	android/os/Parcel:recycle	()V
    //   119: aload 4
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	a
    //   0	122	1	paramBundle	android.os.Bundle
    //   3	113	2	localParcel1	Parcel
    //   7	105	3	localParcel2	Parcel
    //   10	90	4	localObject1	Object
    //   109	11	4	localObject2	Object
    //   23	74	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	109	finally
    //   26	31	109	finally
    //   39	43	109	finally
    //   43	47	109	finally
    //   59	66	109	finally
    //   66	70	109	finally
    //   70	74	109	finally
    //   82	86	109	finally
    //   102	106	109	finally
  }
  
  public final void d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 10;
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
  
  public final boolean e()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = a;
      int i = 11;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void f()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
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
  
  public final void g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
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
  
  public final void h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 4;
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
  
  public final void i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
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
  
  public final void j()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 7;
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
  
  public final void k()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
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
  
  public final void l()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 9;
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


/* Location:              com/google/android/gms/b/pb$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */