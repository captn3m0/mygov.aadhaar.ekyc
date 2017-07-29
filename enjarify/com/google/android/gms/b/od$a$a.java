package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

final class od$a$a
  implements od
{
  private IBinder a;
  
  od$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final a a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
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
  public final void a(a parama)
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
    //   23: invokeinterface 53 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   40: astore 4
    //   42: bipush 21
    //   44: istore 5
    //   46: aload 4
    //   48: iload 5
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: invokeinterface 33 5 0
    //   58: pop
    //   59: aload_3
    //   60: invokevirtual 36	android/os/Parcel:readException	()V
    //   63: aload_3
    //   64: invokevirtual 48	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 48	android/os/Parcel:recycle	()V
    //   71: return
    //   72: aconst_null
    //   73: astore 4
    //   75: goto -45 -> 30
    //   78: astore 4
    //   80: aload_3
    //   81: invokevirtual 48	android/os/Parcel:recycle	()V
    //   84: aload_2
    //   85: invokevirtual 48	android/os/Parcel:recycle	()V
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	a
    //   0	91	1	parama	a
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
  
  /* Error */
  public final void a(a parama, ih paramih, String paramString, oe paramoe)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 6
    //   8: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 7
    //   13: ldc 22
    //   15: astore 8
    //   17: aload 6
    //   19: aload 8
    //   21: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: ifnull +112 -> 137
    //   28: aload_1
    //   29: invokeinterface 53 1 0
    //   34: astore 8
    //   36: aload 6
    //   38: aload 8
    //   40: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   43: aload_2
    //   44: ifnull +102 -> 146
    //   47: iconst_1
    //   48: istore 9
    //   50: aload 6
    //   52: iload 9
    //   54: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   57: iconst_0
    //   58: istore 9
    //   60: aconst_null
    //   61: astore 8
    //   63: aload_2
    //   64: aload 6
    //   66: iconst_0
    //   67: invokevirtual 69	com/google/android/gms/b/ih:writeToParcel	(Landroid/os/Parcel;I)V
    //   70: aload 6
    //   72: aload_3
    //   73: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   76: aload 4
    //   78: ifnull +12 -> 90
    //   81: aload 4
    //   83: invokeinterface 75 1 0
    //   88: astore 5
    //   90: aload 6
    //   92: aload 5
    //   94: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   97: aload_0
    //   98: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   101: astore 5
    //   103: iconst_3
    //   104: istore 9
    //   106: aload 5
    //   108: iload 9
    //   110: aload 6
    //   112: aload 7
    //   114: iconst_0
    //   115: invokeinterface 33 5 0
    //   120: pop
    //   121: aload 7
    //   123: invokevirtual 36	android/os/Parcel:readException	()V
    //   126: aload 7
    //   128: invokevirtual 48	android/os/Parcel:recycle	()V
    //   131: aload 6
    //   133: invokevirtual 48	android/os/Parcel:recycle	()V
    //   136: return
    //   137: iconst_0
    //   138: istore 9
    //   140: aconst_null
    //   141: astore 8
    //   143: goto -107 -> 36
    //   146: iconst_0
    //   147: istore 9
    //   149: aconst_null
    //   150: astore 8
    //   152: aload 6
    //   154: iconst_0
    //   155: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   158: goto -88 -> 70
    //   161: astore 5
    //   163: aload 7
    //   165: invokevirtual 48	android/os/Parcel:recycle	()V
    //   168: aload 6
    //   170: invokevirtual 48	android/os/Parcel:recycle	()V
    //   173: aload 5
    //   175: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	a
    //   0	176	1	parama	a
    //   0	176	2	paramih	ih
    //   0	176	3	paramString	String
    //   0	176	4	paramoe	oe
    //   1	106	5	localIBinder	IBinder
    //   161	13	5	localObject1	Object
    //   6	163	6	localParcel1	Parcel
    //   11	153	7	localParcel2	Parcel
    //   15	136	8	localObject2	Object
    //   48	100	9	i	int
    // Exception table:
    //   from	to	target	type
    //   19	24	161	finally
    //   28	34	161	finally
    //   38	43	161	finally
    //   52	57	161	finally
    //   66	70	161	finally
    //   72	76	161	finally
    //   81	88	161	finally
    //   92	97	161	finally
    //   97	101	161	finally
    //   114	121	161	finally
    //   121	126	161	finally
    //   154	158	161	finally
  }
  
  /* Error */
  public final void a(a parama, ih paramih, String paramString1, sq paramsq, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 7
    //   8: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 8
    //   13: ldc 22
    //   15: astore 9
    //   17: aload 7
    //   19: aload 9
    //   21: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: ifnull +120 -> 145
    //   28: aload_1
    //   29: invokeinterface 53 1 0
    //   34: astore 9
    //   36: aload 7
    //   38: aload 9
    //   40: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   43: aload_2
    //   44: ifnull +110 -> 154
    //   47: iconst_1
    //   48: istore 10
    //   50: aload 7
    //   52: iload 10
    //   54: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   57: iconst_0
    //   58: istore 10
    //   60: aconst_null
    //   61: astore 9
    //   63: aload_2
    //   64: aload 7
    //   66: iconst_0
    //   67: invokevirtual 69	com/google/android/gms/b/ih:writeToParcel	(Landroid/os/Parcel;I)V
    //   70: aload 7
    //   72: aload_3
    //   73: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   76: aload 4
    //   78: ifnull +12 -> 90
    //   81: aload 4
    //   83: invokeinterface 79 1 0
    //   88: astore 6
    //   90: aload 7
    //   92: aload 6
    //   94: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   97: aload 7
    //   99: aload 5
    //   101: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   104: aload_0
    //   105: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   108: astore 6
    //   110: bipush 10
    //   112: istore 10
    //   114: aload 6
    //   116: iload 10
    //   118: aload 7
    //   120: aload 8
    //   122: iconst_0
    //   123: invokeinterface 33 5 0
    //   128: pop
    //   129: aload 8
    //   131: invokevirtual 36	android/os/Parcel:readException	()V
    //   134: aload 8
    //   136: invokevirtual 48	android/os/Parcel:recycle	()V
    //   139: aload 7
    //   141: invokevirtual 48	android/os/Parcel:recycle	()V
    //   144: return
    //   145: iconst_0
    //   146: istore 10
    //   148: aconst_null
    //   149: astore 9
    //   151: goto -115 -> 36
    //   154: iconst_0
    //   155: istore 10
    //   157: aconst_null
    //   158: astore 9
    //   160: aload 7
    //   162: iconst_0
    //   163: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   166: goto -96 -> 70
    //   169: astore 6
    //   171: aload 8
    //   173: invokevirtual 48	android/os/Parcel:recycle	()V
    //   176: aload 7
    //   178: invokevirtual 48	android/os/Parcel:recycle	()V
    //   181: aload 6
    //   183: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	a
    //   0	184	1	parama	a
    //   0	184	2	paramih	ih
    //   0	184	3	paramString1	String
    //   0	184	4	paramsq	sq
    //   0	184	5	paramString2	String
    //   1	114	6	localIBinder	IBinder
    //   169	13	6	localObject1	Object
    //   6	171	7	localParcel1	Parcel
    //   11	161	8	localParcel2	Parcel
    //   15	144	9	localObject2	Object
    //   48	108	10	i	int
    // Exception table:
    //   from	to	target	type
    //   19	24	169	finally
    //   28	34	169	finally
    //   38	43	169	finally
    //   52	57	169	finally
    //   66	70	169	finally
    //   72	76	169	finally
    //   81	88	169	finally
    //   92	97	169	finally
    //   99	104	169	finally
    //   104	108	169	finally
    //   122	129	169	finally
    //   129	134	169	finally
    //   162	166	169	finally
  }
  
  /* Error */
  public final void a(a parama, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 7
    //   8: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 8
    //   13: ldc 22
    //   15: astore 9
    //   17: aload 7
    //   19: aload 9
    //   21: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: ifnull +120 -> 145
    //   28: aload_1
    //   29: invokeinterface 53 1 0
    //   34: astore 9
    //   36: aload 7
    //   38: aload 9
    //   40: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   43: aload_2
    //   44: ifnull +110 -> 154
    //   47: iconst_1
    //   48: istore 10
    //   50: aload 7
    //   52: iload 10
    //   54: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   57: iconst_0
    //   58: istore 10
    //   60: aconst_null
    //   61: astore 9
    //   63: aload_2
    //   64: aload 7
    //   66: iconst_0
    //   67: invokevirtual 69	com/google/android/gms/b/ih:writeToParcel	(Landroid/os/Parcel;I)V
    //   70: aload 7
    //   72: aload_3
    //   73: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   76: aload 7
    //   78: aload 4
    //   80: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   83: aload 5
    //   85: ifnull +12 -> 97
    //   88: aload 5
    //   90: invokeinterface 75 1 0
    //   95: astore 6
    //   97: aload 7
    //   99: aload 6
    //   101: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   104: aload_0
    //   105: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   108: astore 6
    //   110: bipush 7
    //   112: istore 10
    //   114: aload 6
    //   116: iload 10
    //   118: aload 7
    //   120: aload 8
    //   122: iconst_0
    //   123: invokeinterface 33 5 0
    //   128: pop
    //   129: aload 8
    //   131: invokevirtual 36	android/os/Parcel:readException	()V
    //   134: aload 8
    //   136: invokevirtual 48	android/os/Parcel:recycle	()V
    //   139: aload 7
    //   141: invokevirtual 48	android/os/Parcel:recycle	()V
    //   144: return
    //   145: iconst_0
    //   146: istore 10
    //   148: aconst_null
    //   149: astore 9
    //   151: goto -115 -> 36
    //   154: iconst_0
    //   155: istore 10
    //   157: aconst_null
    //   158: astore 9
    //   160: aload 7
    //   162: iconst_0
    //   163: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   166: goto -96 -> 70
    //   169: astore 6
    //   171: aload 8
    //   173: invokevirtual 48	android/os/Parcel:recycle	()V
    //   176: aload 7
    //   178: invokevirtual 48	android/os/Parcel:recycle	()V
    //   181: aload 6
    //   183: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	a
    //   0	184	1	parama	a
    //   0	184	2	paramih	ih
    //   0	184	3	paramString1	String
    //   0	184	4	paramString2	String
    //   0	184	5	paramoe	oe
    //   1	114	6	localIBinder	IBinder
    //   169	13	6	localObject1	Object
    //   6	171	7	localParcel1	Parcel
    //   11	161	8	localParcel2	Parcel
    //   15	144	9	localObject2	Object
    //   48	108	10	i	int
    // Exception table:
    //   from	to	target	type
    //   19	24	169	finally
    //   28	34	169	finally
    //   38	43	169	finally
    //   52	57	169	finally
    //   66	70	169	finally
    //   72	76	169	finally
    //   78	83	169	finally
    //   88	95	169	finally
    //   99	104	169	finally
    //   104	108	169	finally
    //   122	129	169	finally
    //   129	134	169	finally
    //   162	166	169	finally
  }
  
  public final void a(a parama, ih paramih, String paramString1, String paramString2, oe paramoe, le paramle, List paramList)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject3);
        if (parama != null)
        {
          localObject3 = parama.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject3);
          if (paramih != null)
          {
            j = 1;
            localParcel1.writeInt(j);
            j = 0;
            localObject3 = null;
            paramih.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            if (paramoe != null) {
              localIBinder = paramoe.asBinder();
            }
            localParcel1.writeStrongBinder(localIBinder);
            if (paramle == null) {
              break label223;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localIBinder = null;
            paramle.writeToParcel(localParcel1, 0);
            localParcel1.writeStringList(paramList);
            localIBinder = a;
            j = 14;
            localIBinder.transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          j = 0;
          localObject3 = null;
          continue;
        }
        int j = 0;
        localObject3 = null;
        localParcel1.writeInt(0);
        continue;
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label223:
      Object localObject2 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public final void a(a parama, il paramil, ih paramih, String paramString, oe paramoe)
  {
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject2);
        if (parama != null)
        {
          localObject2 = parama.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject2);
          if (paramil != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject2 = null;
            paramil.writeToParcel(localParcel1, 0);
            if (paramih == null) {
              break label204;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject2 = null;
            paramih.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString);
            if (paramoe != null) {
              localIBinder = paramoe.asBinder();
            }
            localParcel1.writeStrongBinder(localIBinder);
            localIBinder = a;
            i = 1;
            localIBinder.transact(i, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject2 = null;
          continue;
        }
        int i = 0;
        localObject2 = null;
        localParcel1.writeInt(0);
        continue;
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label204:
      localObject2 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public final void a(a parama, il paramil, ih paramih, String paramString1, String paramString2, oe paramoe)
  {
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject2);
        if (parama != null)
        {
          localObject2 = parama.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject2);
          if (paramil != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject2 = null;
            paramil.writeToParcel(localParcel1, 0);
            if (paramih == null) {
              break label212;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject2 = null;
            paramih.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            if (paramoe != null) {
              localIBinder = paramoe.asBinder();
            }
            localParcel1.writeStrongBinder(localIBinder);
            localIBinder = a;
            i = 6;
            localIBinder.transact(i, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject2 = null;
          continue;
        }
        int i = 0;
        localObject2 = null;
        localParcel1.writeInt(0);
        continue;
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label212:
      localObject2 = null;
      localParcel1.writeInt(0);
    }
  }
  
  /* Error */
  public final void a(a parama, sq paramsq, List paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 5
    //   8: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 6
    //   13: ldc 22
    //   15: astore 7
    //   17: aload 5
    //   19: aload 7
    //   21: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: ifnull +84 -> 109
    //   28: aload_1
    //   29: invokeinterface 53 1 0
    //   34: astore 7
    //   36: aload 5
    //   38: aload 7
    //   40: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   43: aload_2
    //   44: ifnull +11 -> 55
    //   47: aload_2
    //   48: invokeinterface 79 1 0
    //   53: astore 4
    //   55: aload 5
    //   57: aload 4
    //   59: invokevirtual 57	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   62: aload 5
    //   64: aload_3
    //   65: invokevirtual 88	android/os/Parcel:writeStringList	(Ljava/util/List;)V
    //   68: aload_0
    //   69: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   72: astore 4
    //   74: bipush 23
    //   76: istore 8
    //   78: aload 4
    //   80: iload 8
    //   82: aload 5
    //   84: aload 6
    //   86: iconst_0
    //   87: invokeinterface 33 5 0
    //   92: pop
    //   93: aload 6
    //   95: invokevirtual 36	android/os/Parcel:readException	()V
    //   98: aload 6
    //   100: invokevirtual 48	android/os/Parcel:recycle	()V
    //   103: aload 5
    //   105: invokevirtual 48	android/os/Parcel:recycle	()V
    //   108: return
    //   109: iconst_0
    //   110: istore 8
    //   112: aconst_null
    //   113: astore 7
    //   115: goto -79 -> 36
    //   118: astore 4
    //   120: aload 6
    //   122: invokevirtual 48	android/os/Parcel:recycle	()V
    //   125: aload 5
    //   127: invokevirtual 48	android/os/Parcel:recycle	()V
    //   130: aload 4
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	a
    //   0	133	1	parama	a
    //   0	133	2	paramsq	sq
    //   0	133	3	paramList	List
    //   1	78	4	localIBinder	IBinder
    //   118	13	4	localObject1	Object
    //   6	120	5	localParcel1	Parcel
    //   11	110	6	localParcel2	Parcel
    //   15	99	7	localObject2	Object
    //   76	35	8	i	int
    // Exception table:
    //   from	to	target	type
    //   19	24	118	finally
    //   28	34	118	finally
    //   38	43	118	finally
    //   47	53	118	finally
    //   57	62	118	finally
    //   64	68	118	finally
    //   68	72	118	finally
    //   86	93	118	finally
    //   93	98	118	finally
  }
  
  /* Error */
  public final void a(ih paramih, String paramString)
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
    //   20: ifnull +68 -> 88
    //   23: iconst_1
    //   24: istore 6
    //   26: aload_3
    //   27: iload 6
    //   29: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 6
    //   35: aconst_null
    //   36: astore 5
    //   38: aload_1
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 69	com/google/android/gms/b/ih:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_3
    //   45: aload_2
    //   46: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 11
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 33 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 36	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 48	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 48	android/os/Parcel:recycle	()V
    //   87: return
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   99: goto -55 -> 44
    //   102: astore 5
    //   104: aload 4
    //   106: invokevirtual 48	android/os/Parcel:recycle	()V
    //   109: aload_3
    //   110: invokevirtual 48	android/os/Parcel:recycle	()V
    //   113: aload 5
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	a
    //   0	116	1	paramih	ih
    //   0	116	2	paramString	String
    //   3	107	3	localParcel1	Parcel
    //   7	98	4	localParcel2	Parcel
    //   11	82	5	localObject1	Object
    //   102	12	5	localObject2	Object
    //   24	66	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	102	finally
    //   27	32	102	finally
    //   40	44	102	finally
    //   45	49	102	finally
    //   49	53	102	finally
    //   66	73	102	finally
    //   73	78	102	finally
    //   95	99	102	finally
  }
  
  /* Error */
  public final void a(ih paramih, String paramString1, String paramString2)
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
    //   22: ifnull +79 -> 101
    //   25: iconst_1
    //   26: istore 7
    //   28: aload 4
    //   30: iload 7
    //   32: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   35: iconst_0
    //   36: istore 7
    //   38: aconst_null
    //   39: astore 6
    //   41: aload_1
    //   42: aload 4
    //   44: iconst_0
    //   45: invokevirtual 69	com/google/android/gms/b/ih:writeToParcel	(Landroid/os/Parcel;I)V
    //   48: aload 4
    //   50: aload_2
    //   51: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   54: aload 4
    //   56: aload_3
    //   57: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   64: astore 6
    //   66: bipush 20
    //   68: istore 8
    //   70: aload 6
    //   72: iload 8
    //   74: aload 4
    //   76: aload 5
    //   78: iconst_0
    //   79: invokeinterface 33 5 0
    //   84: pop
    //   85: aload 5
    //   87: invokevirtual 36	android/os/Parcel:readException	()V
    //   90: aload 5
    //   92: invokevirtual 48	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: invokevirtual 48	android/os/Parcel:recycle	()V
    //   100: return
    //   101: iconst_0
    //   102: istore 7
    //   104: aconst_null
    //   105: astore 6
    //   107: aload 4
    //   109: iconst_0
    //   110: invokevirtual 63	android/os/Parcel:writeInt	(I)V
    //   113: goto -65 -> 48
    //   116: astore 6
    //   118: aload 5
    //   120: invokevirtual 48	android/os/Parcel:recycle	()V
    //   123: aload 4
    //   125: invokevirtual 48	android/os/Parcel:recycle	()V
    //   128: aload 6
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	a
    //   0	131	1	paramih	ih
    //   0	131	2	paramString1	String
    //   0	131	3	paramString2	String
    //   3	121	4	localParcel1	Parcel
    //   8	111	5	localParcel2	Parcel
    //   12	94	6	localObject1	Object
    //   116	13	6	localObject2	Object
    //   26	77	7	i	int
    //   68	5	8	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	116	finally
    //   30	35	116	finally
    //   44	48	116	finally
    //   50	54	116	finally
    //   56	60	116	finally
    //   60	64	116	finally
    //   78	85	116	finally
    //   85	90	116	finally
    //   109	113	116	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final void b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
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
  
  public final void c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
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
  
  public final void d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
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
  
  public final void e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
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
  
  public final void f()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
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
  
  public final boolean g()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = a;
      int i = 13;
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
  
  public final og h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 15;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = og.a.a((IBinder)localObject1);
      return (og)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final oh i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = a;
      int i = 16;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = oh.a.a((IBinder)localObject1);
      return (oh)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final android.os.Bundle j()
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
    //   17: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 17
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
    //   42: invokevirtual 106	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 125	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 131 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 121	android/os/Bundle
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 48	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 48	android/os/Parcel:recycle	()V
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
  
  /* Error */
  public final android.os.Bundle k()
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
    //   17: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 18
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
    //   42: invokevirtual 106	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 125	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 131 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 121	android/os/Bundle
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 48	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 48	android/os/Parcel:recycle	()V
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
  
  /* Error */
  public final android.os.Bundle l()
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
    //   17: getfield 14	com/google/android/gms/b/od$a$a:a	Landroid/os/IBinder;
    //   20: astore_3
    //   21: bipush 19
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
    //   42: invokevirtual 106	android/os/Parcel:readInt	()I
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq +30 -> 79
    //   52: getstatic 125	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   55: astore_3
    //   56: aload_3
    //   57: aload_2
    //   58: invokeinterface 131 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: checkcast 121	android/os/Bundle
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: areturn
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore_3
    //   84: goto -15 -> 69
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 48	android/os/Parcel:recycle	()V
    //   92: aload_1
    //   93: invokevirtual 48	android/os/Parcel:recycle	()V
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
  
  public final boolean m()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = a;
      int i = 22;
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
}


/* Location:              com/google/android/gms/b/od$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */