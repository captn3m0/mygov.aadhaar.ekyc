package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

public final class dj$a
  implements ServiceConnection, o.b, o.c
{
  volatile boolean a;
  volatile ct b;
  
  protected dj$a(dj paramdj) {}
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: ldc 26
    //   2: astore_1
    //   3: aload_1
    //   4: invokestatic 31	com/google/android/gms/common/internal/c:b	(Ljava/lang/String;)V
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 33	com/google/android/gms/b/dj$a:b	Lcom/google/android/gms/b/ct;
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 39	com/google/android/gms/b/ct:l	()Landroid/os/IInterface;
    //   18: astore_1
    //   19: aload_1
    //   20: checkcast 41	com/google/android/gms/b/cq
    //   23: astore_1
    //   24: aconst_null
    //   25: astore_2
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield 33	com/google/android/gms/b/dj$a:b	Lcom/google/android/gms/b/ct;
    //   31: aload_0
    //   32: getfield 18	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
    //   35: astore_2
    //   36: aload_2
    //   37: invokevirtual 47	com/google/android/gms/b/dj:t	()Lcom/google/android/gms/b/db;
    //   40: astore_2
    //   41: new 49	com/google/android/gms/b/dj$a$3
    //   44: astore_3
    //   45: aload_3
    //   46: aload_0
    //   47: aload_1
    //   48: invokespecial 52	com/google/android/gms/b/dj$a$3:<init>	(Lcom/google/android/gms/b/dj$a;Lcom/google/android/gms/b/cq;)V
    //   51: aload_2
    //   52: aload_3
    //   53: invokevirtual 57	com/google/android/gms/b/db:a	(Ljava/lang/Runnable;)V
    //   56: aload_0
    //   57: monitorexit
    //   58: return
    //   59: astore_1
    //   60: aconst_null
    //   61: astore_1
    //   62: aload_0
    //   63: aconst_null
    //   64: putfield 33	com/google/android/gms/b/dj$a:b	Lcom/google/android/gms/b/ct;
    //   67: aconst_null
    //   68: astore_1
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield 24	com/google/android/gms/b/dj$a:a	Z
    //   74: goto -18 -> 56
    //   77: astore_1
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_1
    //   81: athrow
    //   82: astore_1
    //   83: goto -23 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	a
    //   2	46	1	localObject1	Object
    //   59	1	1	localIllegalStateException	IllegalStateException
    //   61	8	1	localObject2	Object
    //   77	4	1	localObject3	Object
    //   82	1	1	localDeadObjectException	android.os.DeadObjectException
    //   25	27	2	localObject4	Object
    //   44	9	3	local3	dj.a.3
    // Exception table:
    //   from	to	target	type
    //   9	13	59	java/lang/IllegalStateException
    //   14	18	59	java/lang/IllegalStateException
    //   19	23	59	java/lang/IllegalStateException
    //   27	31	59	java/lang/IllegalStateException
    //   31	35	59	java/lang/IllegalStateException
    //   36	40	59	java/lang/IllegalStateException
    //   41	44	59	java/lang/IllegalStateException
    //   47	51	59	java/lang/IllegalStateException
    //   52	56	59	java/lang/IllegalStateException
    //   9	13	77	finally
    //   14	18	77	finally
    //   19	23	77	finally
    //   27	31	77	finally
    //   31	35	77	finally
    //   36	40	77	finally
    //   41	44	77	finally
    //   47	51	77	finally
    //   52	56	77	finally
    //   56	58	77	finally
    //   63	67	77	finally
    //   70	74	77	finally
    //   78	80	77	finally
    //   9	13	82	android/os/DeadObjectException
    //   14	18	82	android/os/DeadObjectException
    //   19	23	82	android/os/DeadObjectException
    //   27	31	82	android/os/DeadObjectException
    //   31	35	82	android/os/DeadObjectException
    //   36	40	82	android/os/DeadObjectException
    //   41	44	82	android/os/DeadObjectException
    //   47	51	82	android/os/DeadObjectException
    //   52	56	82	android/os/DeadObjectException
  }
  
  public final void a(int paramInt)
  {
    c.b("MeasurementServiceConnection.onConnectionSuspended");
    c.u().f.a("Service connection suspended");
    db localdb = c.t();
    dj.a.4 local4 = new com/google/android/gms/b/dj$a$4;
    local4.<init>(this);
    localdb.a(local4);
  }
  
  public final void a(a parama)
  {
    Object localObject1 = null;
    c.b("MeasurementServiceConnection.onConnectionFailed");
    Object localObject3 = c.q;
    cu localcu = c;
    if (localcu != null)
    {
      localcu = c;
      boolean bool = localcu.I();
      if (bool) {
        localObject1 = c;
      }
    }
    if (localObject1 != null)
    {
      localObject1 = c;
      localObject3 = "Service connection failed";
      ((cu.a)localObject1).a((String)localObject3, parama);
    }
    localObject1 = null;
    try
    {
      a = false;
      localObject1 = null;
      b = null;
      localObject1 = c.t();
      localObject3 = new com/google/android/gms/b/dj$a$5;
      ((dj.a.5)localObject3).<init>(this);
      ((db)localObject1).a((Runnable)localObject3);
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: ldc 111
    //   2: astore_3
    //   3: aload_3
    //   4: invokestatic 31	com/google/android/gms/common/internal/c:b	(Ljava/lang/String;)V
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_2
    //   10: ifnonnull +38 -> 48
    //   13: aconst_null
    //   14: astore_3
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield 24	com/google/android/gms/b/dj$a:a	Z
    //   20: aload_0
    //   21: getfield 18	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
    //   24: astore_3
    //   25: aload_3
    //   26: invokevirtual 67	com/google/android/gms/b/dj:u	()Lcom/google/android/gms/b/cu;
    //   29: astore_3
    //   30: aload_3
    //   31: getfield 113	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   34: astore_3
    //   35: ldc 115
    //   37: astore 4
    //   39: aload_3
    //   40: aload 4
    //   42: invokevirtual 79	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: aconst_null
    //   49: astore_3
    //   50: aload_2
    //   51: invokeinterface 121 1 0
    //   56: astore 4
    //   58: ldc 123
    //   60: astore 5
    //   62: aload 5
    //   64: aload 4
    //   66: invokevirtual 129	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: istore 6
    //   71: iload 6
    //   73: ifeq +93 -> 166
    //   76: aload_2
    //   77: invokestatic 134	com/google/android/gms/b/cq$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/cq;
    //   80: astore_3
    //   81: aload_0
    //   82: getfield 18	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
    //   85: astore 4
    //   87: aload 4
    //   89: invokevirtual 67	com/google/android/gms/b/dj:u	()Lcom/google/android/gms/b/cu;
    //   92: astore 4
    //   94: aload 4
    //   96: getfield 137	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
    //   99: astore 4
    //   101: ldc -117
    //   103: astore 5
    //   105: aload 4
    //   107: aload 5
    //   109: invokevirtual 79	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   112: aload_3
    //   113: ifnonnull +125 -> 238
    //   116: aconst_null
    //   117: astore_3
    //   118: aload_0
    //   119: iconst_0
    //   120: putfield 24	com/google/android/gms/b/dj$a:a	Z
    //   123: invokestatic 144	com/google/android/gms/common/a/a:a	()Lcom/google/android/gms/common/a/a;
    //   126: pop
    //   127: aload_0
    //   128: getfield 18	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
    //   131: astore_3
    //   132: aload_3
    //   133: invokevirtual 148	com/google/android/gms/b/dj:n	()Landroid/content/Context;
    //   136: astore_3
    //   137: aload_0
    //   138: getfield 18	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
    //   141: astore 4
    //   143: aload 4
    //   145: getfield 151	com/google/android/gms/b/dj:a	Lcom/google/android/gms/b/dj$a;
    //   148: astore 4
    //   150: aload_3
    //   151: aload 4
    //   153: invokestatic 154	com/google/android/gms/common/a/a:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   156: aload_0
    //   157: monitorexit
    //   158: goto -111 -> 47
    //   161: astore_3
    //   162: aload_0
    //   163: monitorexit
    //   164: aload_3
    //   165: athrow
    //   166: aload_0
    //   167: getfield 18	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
    //   170: astore 5
    //   172: aload 5
    //   174: invokevirtual 67	com/google/android/gms/b/dj:u	()Lcom/google/android/gms/b/cu;
    //   177: astore 5
    //   179: aload 5
    //   181: getfield 113	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   184: astore 5
    //   186: ldc -100
    //   188: astore 7
    //   190: aload 5
    //   192: aload 7
    //   194: aload 4
    //   196: invokevirtual 106	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   199: goto -87 -> 112
    //   202: astore 4
    //   204: aload_0
    //   205: getfield 18	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
    //   208: astore 4
    //   210: aload 4
    //   212: invokevirtual 67	com/google/android/gms/b/dj:u	()Lcom/google/android/gms/b/cu;
    //   215: astore 4
    //   217: aload 4
    //   219: getfield 113	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   222: astore 4
    //   224: ldc -98
    //   226: astore 5
    //   228: aload 4
    //   230: aload 5
    //   232: invokevirtual 79	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   235: goto -123 -> 112
    //   238: aload_0
    //   239: getfield 18	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
    //   242: astore 4
    //   244: aload 4
    //   246: invokevirtual 47	com/google/android/gms/b/dj:t	()Lcom/google/android/gms/b/db;
    //   249: astore 4
    //   251: new 160	com/google/android/gms/b/dj$a$1
    //   254: astore 5
    //   256: aload 5
    //   258: aload_0
    //   259: aload_3
    //   260: invokespecial 161	com/google/android/gms/b/dj$a$1:<init>	(Lcom/google/android/gms/b/dj$a;Lcom/google/android/gms/b/cq;)V
    //   263: aload 4
    //   265: aload 5
    //   267: invokevirtual 57	com/google/android/gms/b/db:a	(Ljava/lang/Runnable;)V
    //   270: goto -114 -> 156
    //   273: astore_3
    //   274: goto -118 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	277	0	this	a
    //   0	277	1	paramComponentName	ComponentName
    //   0	277	2	paramIBinder	android.os.IBinder
    //   2	149	3	localObject1	Object
    //   161	99	3	localcq	cq
    //   273	1	3	localIllegalArgumentException	IllegalArgumentException
    //   37	158	4	localObject2	Object
    //   202	1	4	localRemoteException	android.os.RemoteException
    //   208	56	4	localObject3	Object
    //   60	206	5	localObject4	Object
    //   69	3	6	bool	boolean
    //   188	5	7	str	String
    // Exception table:
    //   from	to	target	type
    //   16	20	161	finally
    //   20	24	161	finally
    //   25	29	161	finally
    //   30	34	161	finally
    //   40	45	161	finally
    //   45	47	161	finally
    //   50	56	161	finally
    //   64	69	161	finally
    //   76	80	161	finally
    //   81	85	161	finally
    //   87	92	161	finally
    //   94	99	161	finally
    //   107	112	161	finally
    //   119	123	161	finally
    //   123	127	161	finally
    //   127	131	161	finally
    //   132	136	161	finally
    //   137	141	161	finally
    //   143	148	161	finally
    //   151	156	161	finally
    //   156	158	161	finally
    //   162	164	161	finally
    //   166	170	161	finally
    //   172	177	161	finally
    //   179	184	161	finally
    //   194	199	161	finally
    //   204	208	161	finally
    //   210	215	161	finally
    //   217	222	161	finally
    //   230	235	161	finally
    //   238	242	161	finally
    //   244	249	161	finally
    //   251	254	161	finally
    //   259	263	161	finally
    //   265	270	161	finally
    //   50	56	202	android/os/RemoteException
    //   64	69	202	android/os/RemoteException
    //   76	80	202	android/os/RemoteException
    //   81	85	202	android/os/RemoteException
    //   87	92	202	android/os/RemoteException
    //   94	99	202	android/os/RemoteException
    //   107	112	202	android/os/RemoteException
    //   166	170	202	android/os/RemoteException
    //   172	177	202	android/os/RemoteException
    //   179	184	202	android/os/RemoteException
    //   194	199	202	android/os/RemoteException
    //   123	127	273	java/lang/IllegalArgumentException
    //   127	131	273	java/lang/IllegalArgumentException
    //   132	136	273	java/lang/IllegalArgumentException
    //   137	141	273	java/lang/IllegalArgumentException
    //   143	148	273	java/lang/IllegalArgumentException
    //   151	156	273	java/lang/IllegalArgumentException
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    c.b("MeasurementServiceConnection.onServiceDisconnected");
    c.u().f.a("Service disconnected");
    db localdb = c.t();
    dj.a.2 local2 = new com/google/android/gms/b/dj$a$2;
    local2.<init>(this, paramComponentName);
    localdb.a(local2);
  }
}


/* Location:              com/google/android/gms/b/dj$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */