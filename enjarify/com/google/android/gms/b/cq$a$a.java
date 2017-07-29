package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class cq$a$a
  implements cq
{
  private IBinder a;
  
  cq$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final List a(ca paramca, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.measurement.internal.IMeasurementService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken(str);
        int k;
        if (paramca != null)
        {
          k = 1;
          localParcel1.writeInt(k);
          k = 0;
          str = null;
          paramca.writeToParcel(localParcel1, 0);
          if (paramBoolean)
          {
            localParcel1.writeInt(i);
            Object localObject1 = a;
            j = 7;
            k = 0;
            str = null;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
            localObject1 = do.CREATOR;
            localObject1 = localParcel2.createTypedArrayList((Parcelable.Creator)localObject1);
            return (List)localObject1;
          }
        }
        else
        {
          k = 0;
          str = null;
          localParcel1.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
    }
  }
  
  /* Error */
  public final List a(String paramString1, String paramString2, ca paramca)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: ldc 23
    //   12: astore 6
    //   14: aload 4
    //   16: aload 6
    //   18: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload 4
    //   23: aload_1
    //   24: invokevirtual 63	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   27: aload 4
    //   29: aload_2
    //   30: invokevirtual 63	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   33: aload_3
    //   34: ifnull +83 -> 117
    //   37: iconst_1
    //   38: istore 7
    //   40: aload 4
    //   42: iload 7
    //   44: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   47: iconst_0
    //   48: istore 7
    //   50: aconst_null
    //   51: astore 6
    //   53: aload_3
    //   54: aload 4
    //   56: iconst_0
    //   57: invokevirtual 37	com/google/android/gms/b/ca:writeToParcel	(Landroid/os/Parcel;I)V
    //   60: aload_0
    //   61: getfield 14	com/google/android/gms/b/cq$a$a:a	Landroid/os/IBinder;
    //   64: astore 6
    //   66: bipush 16
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
    //   90: getstatic 67	com/google/android/gms/b/cd:CREATOR	Landroid/os/Parcelable$Creator;
    //   93: astore 6
    //   95: aload 5
    //   97: aload 6
    //   99: invokevirtual 57	android/os/Parcel:createTypedArrayList	(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   102: astore 6
    //   104: aload 5
    //   106: invokevirtual 60	android/os/Parcel:recycle	()V
    //   109: aload 4
    //   111: invokevirtual 60	android/os/Parcel:recycle	()V
    //   114: aload 6
    //   116: areturn
    //   117: iconst_0
    //   118: istore 7
    //   120: aconst_null
    //   121: astore 6
    //   123: aload 4
    //   125: iconst_0
    //   126: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   129: goto -69 -> 60
    //   132: astore 6
    //   134: aload 5
    //   136: invokevirtual 60	android/os/Parcel:recycle	()V
    //   139: aload 4
    //   141: invokevirtual 60	android/os/Parcel:recycle	()V
    //   144: aload 6
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	a
    //   0	147	1	paramString1	String
    //   0	147	2	paramString2	String
    //   0	147	3	paramca	ca
    //   3	137	4	localParcel1	Parcel
    //   8	127	5	localParcel2	Parcel
    //   12	110	6	localObject1	Object
    //   132	13	6	localObject2	Object
    //   38	81	7	i	int
    //   68	5	8	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	132	finally
    //   23	27	132	finally
    //   29	33	132	finally
    //   42	47	132	finally
    //   56	60	132	finally
    //   60	64	132	finally
    //   78	85	132	finally
    //   85	90	132	finally
    //   90	93	132	finally
    //   97	102	132	finally
    //   125	129	132	finally
  }
  
  public final List a(String paramString1, String paramString2, String paramString3)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.measurement.internal.IMeasurementService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      localObject1 = a;
      int i = 17;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = cd.CREATOR;
      localObject1 = localParcel2.createTypedArrayList((Parcelable.Creator)localObject1);
      return (List)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final List a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.measurement.internal.IMeasurementService";
    try
    {
      localParcel1.writeInterfaceToken(str);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localObject1 = a;
      int j = 15;
      ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = do.CREATOR;
      localObject1 = localParcel2.createTypedArrayList((Parcelable.Creator)localObject1);
      return (List)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final List a(String paramString1, String paramString2, boolean paramBoolean, ca paramca)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: iconst_0
    //   4: istore 6
    //   6: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 7
    //   11: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   14: astore 8
    //   16: ldc 23
    //   18: astore 9
    //   20: aload 7
    //   22: aload 9
    //   24: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   27: aload 7
    //   29: aload_1
    //   30: invokevirtual 63	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   33: aload 7
    //   35: aload_2
    //   36: invokevirtual 63	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   39: iload_3
    //   40: ifeq +99 -> 139
    //   43: aload 7
    //   45: iload 5
    //   47: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   50: aload 4
    //   52: ifnull +96 -> 148
    //   55: iconst_1
    //   56: istore 5
    //   58: aload 7
    //   60: iload 5
    //   62: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   65: iconst_0
    //   66: istore 5
    //   68: aconst_null
    //   69: astore 10
    //   71: aload 4
    //   73: aload 7
    //   75: iconst_0
    //   76: invokevirtual 37	com/google/android/gms/b/ca:writeToParcel	(Landroid/os/Parcel;I)V
    //   79: aload_0
    //   80: getfield 14	com/google/android/gms/b/cq$a$a:a	Landroid/os/IBinder;
    //   83: astore 10
    //   85: bipush 14
    //   87: istore 6
    //   89: aconst_null
    //   90: astore 9
    //   92: aload 10
    //   94: iload 6
    //   96: aload 7
    //   98: aload 8
    //   100: iconst_0
    //   101: invokeinterface 44 5 0
    //   106: pop
    //   107: aload 8
    //   109: invokevirtual 47	android/os/Parcel:readException	()V
    //   112: getstatic 53	com/google/android/gms/b/do:CREATOR	Landroid/os/Parcelable$Creator;
    //   115: astore 10
    //   117: aload 8
    //   119: aload 10
    //   121: invokevirtual 57	android/os/Parcel:createTypedArrayList	(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   124: astore 10
    //   126: aload 8
    //   128: invokevirtual 60	android/os/Parcel:recycle	()V
    //   131: aload 7
    //   133: invokevirtual 60	android/os/Parcel:recycle	()V
    //   136: aload 10
    //   138: areturn
    //   139: iconst_0
    //   140: istore 5
    //   142: aconst_null
    //   143: astore 10
    //   145: goto -102 -> 43
    //   148: iconst_0
    //   149: istore 5
    //   151: aconst_null
    //   152: astore 10
    //   154: aload 7
    //   156: iconst_0
    //   157: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   160: goto -81 -> 79
    //   163: astore 10
    //   165: aload 8
    //   167: invokevirtual 60	android/os/Parcel:recycle	()V
    //   170: aload 7
    //   172: invokevirtual 60	android/os/Parcel:recycle	()V
    //   175: aload 10
    //   177: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	a
    //   0	178	1	paramString1	String
    //   0	178	2	paramString2	String
    //   0	178	3	paramBoolean	boolean
    //   0	178	4	paramca	ca
    //   1	149	5	i	int
    //   4	91	6	j	int
    //   9	162	7	localParcel1	Parcel
    //   14	152	8	localParcel2	Parcel
    //   18	73	9	str	String
    //   69	84	10	localObject1	Object
    //   163	13	10	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   22	27	163	finally
    //   29	33	163	finally
    //   35	39	163	finally
    //   45	50	163	finally
    //   60	65	163	finally
    //   75	79	163	finally
    //   79	83	163	finally
    //   100	107	163	finally
    //   107	112	163	finally
    //   112	115	163	finally
    //   119	124	163	finally
    //   156	160	163	finally
  }
  
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.measurement.internal.IMeasurementService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeLong(paramLong);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
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
  
  /* Error */
  public final void a(ca paramca)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 23
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +59 -> 78
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/b/ca:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/b/cq$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_4
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
    //   70: invokevirtual 60	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 60	android/os/Parcel:recycle	()V
    //   77: return
    //   78: iconst_0
    //   79: istore 5
    //   81: aconst_null
    //   82: astore 4
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   89: goto -46 -> 43
    //   92: astore 4
    //   94: aload_3
    //   95: invokevirtual 60	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 60	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	a
    //   0	105	1	paramca	ca
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
  public final void a(cd paramcd)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 23
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +60 -> 79
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 77	com/google/android/gms/b/cd:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/b/cq$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 13
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
    //   71: invokevirtual 60	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 60	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 60	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 60	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	a
    //   0	106	1	paramcd	cd
    //   3	97	2	localParcel1	Parcel
    //   7	89	3	localParcel2	Parcel
    //   10	74	4	localObject1	Object
    //   93	11	4	localObject2	Object
    //   23	58	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	93	finally
    //   26	31	93	finally
    //   39	43	93	finally
    //   43	47	93	finally
    //   59	66	93	finally
    //   66	70	93	finally
    //   86	90	93	finally
  }
  
  public final void a(cd paramcd, ca paramca)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.measurement.internal.IMeasurementService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramcd != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramcd.writeToParcel(localParcel1, 0);
          if (paramca != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramca.writeToParcel(localParcel1, 0);
            localObject1 = a;
            int j = 12;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  public final void a(cn paramcn, ca paramca)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.measurement.internal.IMeasurementService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramcn != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramcn.writeToParcel(localParcel1, 0);
          if (paramca != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramca.writeToParcel(localParcel1, 0);
            localObject1 = a;
            int j = 1;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  /* Error */
  public final void a(cn paramcn, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: ldc 23
    //   12: astore 6
    //   14: aload 4
    //   16: aload 6
    //   18: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +78 -> 100
    //   25: iconst_1
    //   26: istore 7
    //   28: aload 4
    //   30: iload 7
    //   32: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   35: iconst_0
    //   36: istore 7
    //   38: aconst_null
    //   39: astore 6
    //   41: aload_1
    //   42: aload 4
    //   44: iconst_0
    //   45: invokevirtual 82	com/google/android/gms/b/cn:writeToParcel	(Landroid/os/Parcel;I)V
    //   48: aload 4
    //   50: aload_2
    //   51: invokevirtual 63	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   54: aload 4
    //   56: aload_3
    //   57: invokevirtual 63	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield 14	com/google/android/gms/b/cq$a$a:a	Landroid/os/IBinder;
    //   64: astore 6
    //   66: iconst_5
    //   67: istore 8
    //   69: aload 6
    //   71: iload 8
    //   73: aload 4
    //   75: aload 5
    //   77: iconst_0
    //   78: invokeinterface 44 5 0
    //   83: pop
    //   84: aload 5
    //   86: invokevirtual 47	android/os/Parcel:readException	()V
    //   89: aload 5
    //   91: invokevirtual 60	android/os/Parcel:recycle	()V
    //   94: aload 4
    //   96: invokevirtual 60	android/os/Parcel:recycle	()V
    //   99: return
    //   100: iconst_0
    //   101: istore 7
    //   103: aconst_null
    //   104: astore 6
    //   106: aload 4
    //   108: iconst_0
    //   109: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   112: goto -64 -> 48
    //   115: astore 6
    //   117: aload 5
    //   119: invokevirtual 60	android/os/Parcel:recycle	()V
    //   122: aload 4
    //   124: invokevirtual 60	android/os/Parcel:recycle	()V
    //   127: aload 6
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	a
    //   0	130	1	paramcn	cn
    //   0	130	2	paramString1	String
    //   0	130	3	paramString2	String
    //   3	120	4	localParcel1	Parcel
    //   8	110	5	localParcel2	Parcel
    //   12	93	6	localObject1	Object
    //   115	13	6	localObject2	Object
    //   26	76	7	i	int
    //   67	5	8	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	115	finally
    //   30	35	115	finally
    //   44	48	115	finally
    //   50	54	115	finally
    //   56	60	115	finally
    //   60	64	115	finally
    //   77	84	115	finally
    //   84	89	115	finally
    //   108	112	115	finally
  }
  
  public final void a(do paramdo, ca paramca)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.measurement.internal.IMeasurementService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramdo != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramdo.writeToParcel(localParcel1, 0);
          if (paramca != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramca.writeToParcel(localParcel1, 0);
            localObject1 = a;
            int j = 2;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
  
  /* Error */
  public final byte[] a(cn paramcn, String paramString)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: ldc 23
    //   11: astore 5
    //   13: aload_3
    //   14: aload 5
    //   16: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnull +77 -> 97
    //   23: iconst_1
    //   24: istore 6
    //   26: aload_3
    //   27: iload 6
    //   29: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 6
    //   35: aconst_null
    //   36: astore 5
    //   38: aload_1
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 82	com/google/android/gms/b/cn:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_3
    //   45: aload_2
    //   46: invokevirtual 63	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/b/cq$a$a:a	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 9
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 44 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 47	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 90	android/os/Parcel:createByteArray	()[B
    //   83: astore 5
    //   85: aload 4
    //   87: invokevirtual 60	android/os/Parcel:recycle	()V
    //   90: aload_3
    //   91: invokevirtual 60	android/os/Parcel:recycle	()V
    //   94: aload 5
    //   96: areturn
    //   97: iconst_0
    //   98: istore 6
    //   100: aconst_null
    //   101: astore 5
    //   103: aload_3
    //   104: iconst_0
    //   105: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   108: goto -64 -> 44
    //   111: astore 5
    //   113: aload 4
    //   115: invokevirtual 60	android/os/Parcel:recycle	()V
    //   118: aload_3
    //   119: invokevirtual 60	android/os/Parcel:recycle	()V
    //   122: aload 5
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	a
    //   0	125	1	paramcn	cn
    //   0	125	2	paramString	String
    //   3	116	3	localParcel1	Parcel
    //   7	107	4	localParcel2	Parcel
    //   11	91	5	localObject1	Object
    //   111	12	5	localObject2	Object
    //   24	75	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	111	finally
    //   27	32	111	finally
    //   40	44	111	finally
    //   45	49	111	finally
    //   49	53	111	finally
    //   66	73	111	finally
    //   73	78	111	finally
    //   78	83	111	finally
    //   104	108	111	finally
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  /* Error */
  public final void b(ca paramca)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 23
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +60 -> 79
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/b/ca:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/b/cq$a$a:a	Landroid/os/IBinder;
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
    //   71: invokevirtual 60	android/os/Parcel:recycle	()V
    //   74: aload_2
    //   75: invokevirtual 60	android/os/Parcel:recycle	()V
    //   78: return
    //   79: iconst_0
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: aload_2
    //   86: iconst_0
    //   87: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   90: goto -47 -> 43
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 60	android/os/Parcel:recycle	()V
    //   99: aload_2
    //   100: invokevirtual 60	android/os/Parcel:recycle	()V
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	a
    //   0	106	1	paramca	ca
    //   3	97	2	localParcel1	Parcel
    //   7	89	3	localParcel2	Parcel
    //   10	74	4	localObject1	Object
    //   93	11	4	localObject2	Object
    //   23	58	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	93	finally
    //   26	31	93	finally
    //   39	43	93	finally
    //   43	47	93	finally
    //   59	66	93	finally
    //   66	70	93	finally
    //   86	90	93	finally
  }
  
  /* Error */
  public final String c(ca paramca)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 23
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +68 -> 87
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/b/ca:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/b/cq$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 11
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
    //   71: invokevirtual 96	android/os/Parcel:readString	()Ljava/lang/String;
    //   74: astore 4
    //   76: aload_3
    //   77: invokevirtual 60	android/os/Parcel:recycle	()V
    //   80: aload_2
    //   81: invokevirtual 60	android/os/Parcel:recycle	()V
    //   84: aload 4
    //   86: areturn
    //   87: iconst_0
    //   88: istore 5
    //   90: aconst_null
    //   91: astore 4
    //   93: aload_2
    //   94: iconst_0
    //   95: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   98: goto -55 -> 43
    //   101: astore 4
    //   103: aload_3
    //   104: invokevirtual 60	android/os/Parcel:recycle	()V
    //   107: aload_2
    //   108: invokevirtual 60	android/os/Parcel:recycle	()V
    //   111: aload 4
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	a
    //   0	114	1	paramca	ca
    //   3	105	2	localParcel1	Parcel
    //   7	97	3	localParcel2	Parcel
    //   10	82	4	localObject1	Object
    //   101	11	4	localObject2	Object
    //   23	66	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	101	finally
    //   26	31	101	finally
    //   39	43	101	finally
    //   43	47	101	finally
    //   59	66	101	finally
    //   66	70	101	finally
    //   70	74	101	finally
    //   94	98	101	finally
  }
}


/* Location:              com/google/android/gms/b/cq$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */