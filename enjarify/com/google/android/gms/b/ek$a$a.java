package com.google.android.gms.b;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.af;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.m;

final class ek$a$a
  implements ek
{
  private IBinder a;
  
  ek$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
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
  
  public final void a(int paramInt, Account paramAccount, ej paramej)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeInt(paramInt);
        if (paramAccount != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramAccount.writeToParcel(localParcel1, 0);
        }
        while (paramej != null)
        {
          localObject1 = paramej.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = a;
          int j = 8;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public final void a(eh parameh)
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
    //   40: invokevirtual 64	com/google/android/gms/b/eh:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/b/ek$a$a:a	Landroid/os/IBinder;
    //   47: astore 4
    //   49: iconst_3
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 37 5 0
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 40	android/os/Parcel:readException	()V
    //   69: aload_3
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
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
    //   95: invokevirtual 43	android/os/Parcel:recycle	()V
    //   98: aload_2
    //   99: invokevirtual 43	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	a
    //   0	105	1	parameh	eh
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
  public final void a(ej paramej)
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
    //   23: invokeinterface 56 1 0
    //   28: astore 4
    //   30: aload_2
    //   31: aload 4
    //   33: invokevirtual 60	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 14	com/google/android/gms/b/ek$a$a:a	Landroid/os/IBinder;
    //   40: astore 4
    //   42: bipush 11
    //   44: istore 5
    //   46: aload 4
    //   48: iload 5
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: invokeinterface 37 5 0
    //   58: pop
    //   59: aload_3
    //   60: invokevirtual 40	android/os/Parcel:readException	()V
    //   63: aload_3
    //   64: invokevirtual 43	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 43	android/os/Parcel:recycle	()V
    //   71: return
    //   72: aconst_null
    //   73: astore 4
    //   75: goto -45 -> 30
    //   78: astore 4
    //   80: aload_3
    //   81: invokevirtual 43	android/os/Parcel:recycle	()V
    //   84: aload_2
    //   85: invokevirtual 43	android/os/Parcel:recycle	()V
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	a
    //   0	91	1	paramej	ej
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
  
  public final void a(el paramel, ej paramej)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramel != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramel.writeToParcel(localParcel1, 0);
        }
        while (paramej != null)
        {
          localObject1 = paramej.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = a;
          int j = 10;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final void a(eo parameo, ej paramej)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (parameo != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          parameo.writeToParcel(localParcel1, 0);
        }
        while (paramej != null)
        {
          localObject1 = paramej.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = a;
          int j = 12;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final void a(d paramd, af paramaf)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramd != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramd.writeToParcel(localParcel1, 0);
        }
        while (paramaf != null)
        {
          localObject1 = paramaf.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = a;
          int j = 5;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final void a(m paramm, ej paramej)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.signin.internal.ISignInService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramm != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramm.writeToParcel(localParcel1, 0);
        }
        while (paramej != null)
        {
          localObject1 = paramej.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = a;
          int j = 2;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.internal.z paramz, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 6
    //   11: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   14: astore 7
    //   16: ldc 22
    //   18: astore 8
    //   20: aload 6
    //   22: aload 8
    //   24: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   27: aload_1
    //   28: ifnull +79 -> 107
    //   31: aload_1
    //   32: invokeinterface 88 1 0
    //   37: astore 8
    //   39: aload 6
    //   41: aload 8
    //   43: invokevirtual 60	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   46: aload 6
    //   48: iload_2
    //   49: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   52: iload_3
    //   53: ifeq +6 -> 59
    //   56: iconst_1
    //   57: istore 4
    //   59: aload 6
    //   61: iload 4
    //   63: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   66: aload_0
    //   67: getfield 14	com/google/android/gms/b/ek$a$a:a	Landroid/os/IBinder;
    //   70: astore 5
    //   72: bipush 9
    //   74: istore 9
    //   76: aload 5
    //   78: iload 9
    //   80: aload 6
    //   82: aload 7
    //   84: iconst_0
    //   85: invokeinterface 37 5 0
    //   90: pop
    //   91: aload 7
    //   93: invokevirtual 40	android/os/Parcel:readException	()V
    //   96: aload 7
    //   98: invokevirtual 43	android/os/Parcel:recycle	()V
    //   101: aload 6
    //   103: invokevirtual 43	android/os/Parcel:recycle	()V
    //   106: return
    //   107: iconst_0
    //   108: istore 9
    //   110: aconst_null
    //   111: astore 8
    //   113: goto -74 -> 39
    //   116: astore 5
    //   118: aload 7
    //   120: invokevirtual 43	android/os/Parcel:recycle	()V
    //   123: aload 6
    //   125: invokevirtual 43	android/os/Parcel:recycle	()V
    //   128: aload 5
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	a
    //   0	131	1	paramz	com.google.android.gms.common.internal.z
    //   0	131	2	paramInt	int
    //   0	131	3	paramBoolean	boolean
    //   1	61	4	i	int
    //   4	73	5	localIBinder	IBinder
    //   116	13	5	localObject1	Object
    //   9	115	6	localParcel1	Parcel
    //   14	105	7	localParcel2	Parcel
    //   18	94	8	localObject2	Object
    //   74	35	9	j	int
    // Exception table:
    //   from	to	target	type
    //   22	27	116	finally
    //   31	37	116	finally
    //   41	46	116	finally
    //   48	52	116	finally
    //   61	66	116	finally
    //   66	70	116	finally
    //   84	91	116	finally
    //   91	96	116	finally
  }
  
  public final void a(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.signin.internal.ISignInService";
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
  
  public final void b(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.signin.internal.ISignInService";
    try
    {
      localParcel1.writeInterfaceToken(str);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = a;
      int j = 13;
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
}


/* Location:              com/google/android/gms/b/ek$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */