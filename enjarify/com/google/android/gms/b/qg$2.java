package com.google.android.gms.b;

final class qg$2
  implements Thread.UncaughtExceptionHandler
{
  qg$2(qg paramqg, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  /* Error */
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/google/android/gms/b/qg$2:b	Lcom/google/android/gms/b/qg;
    //   4: astore_3
    //   5: aload_3
    //   6: aload_2
    //   7: invokevirtual 23	com/google/android/gms/b/qg:a	(Ljava/lang/Throwable;)V
    //   10: aload_0
    //   11: getfield 14	com/google/android/gms/b/qg$2:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnull +16 -> 32
    //   19: aload_0
    //   20: getfield 14	com/google/android/gms/b/qg$2:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   23: astore_3
    //   24: aload_3
    //   25: aload_1
    //   26: aload_2
    //   27: invokeinterface 27 3 0
    //   32: return
    //   33: astore_3
    //   34: ldc 29
    //   36: astore_3
    //   37: aload_3
    //   38: invokestatic 35	com/google/android/gms/b/tp:c	(Ljava/lang/String;)V
    //   41: aload_0
    //   42: getfield 14	com/google/android/gms/b/qg$2:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   45: astore_3
    //   46: aload_3
    //   47: ifnull -15 -> 32
    //   50: aload_0
    //   51: getfield 14	com/google/android/gms/b/qg$2:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   54: astore_3
    //   55: aload_3
    //   56: aload_1
    //   57: aload_2
    //   58: invokeinterface 27 3 0
    //   63: goto -31 -> 32
    //   66: astore_3
    //   67: aload_0
    //   68: getfield 14	com/google/android/gms/b/qg$2:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   71: astore 4
    //   73: aload 4
    //   75: ifnull +18 -> 93
    //   78: aload_0
    //   79: getfield 14	com/google/android/gms/b/qg$2:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   82: astore 4
    //   84: aload 4
    //   86: aload_1
    //   87: aload_2
    //   88: invokeinterface 27 3 0
    //   93: aload_3
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	2
    //   0	95	1	paramThread	Thread
    //   0	95	2	paramThrowable	Throwable
    //   4	21	3	localObject1	Object
    //   33	1	3	localObject2	Object
    //   36	20	3	localObject3	Object
    //   66	28	3	localObject4	Object
    //   71	14	4	localUncaughtExceptionHandler	Thread.UncaughtExceptionHandler
    // Exception table:
    //   from	to	target	type
    //   0	4	33	finally
    //   6	10	33	finally
    //   37	41	66	finally
  }
}


/* Location:              com/google/android/gms/b/qg$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */