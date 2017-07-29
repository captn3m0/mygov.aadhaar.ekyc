package com.google.android.gms.b;

import java.util.concurrent.Callable;

public final class fh
  implements Callable
{
  private final eu a;
  private final bf.a b;
  
  public fh(eu parameu, bf.a parama)
  {
    a = parameu;
    b = parama;
  }
  
  /* Error */
  private Void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/google/android/gms/b/fh:a	Lcom/google/android/gms/b/eu;
    //   4: getfield 24	com/google/android/gms/b/eu:h	Ljava/util/concurrent/Future;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnull +18 -> 27
    //   12: aload_0
    //   13: getfield 16	com/google/android/gms/b/fh:a	Lcom/google/android/gms/b/eu;
    //   16: getfield 24	com/google/android/gms/b/eu:h	Ljava/util/concurrent/Future;
    //   19: astore_1
    //   20: aload_1
    //   21: invokeinterface 30 1 0
    //   26: pop
    //   27: aload_0
    //   28: getfield 16	com/google/android/gms/b/fh:a	Lcom/google/android/gms/b/eu;
    //   31: getfield 33	com/google/android/gms/b/eu:g	Lcom/google/android/gms/b/bf$a;
    //   34: astore_1
    //   35: aload_1
    //   36: ifnull +34 -> 70
    //   39: aload_0
    //   40: getfield 18	com/google/android/gms/b/fh:b	Lcom/google/android/gms/b/bf$a;
    //   43: astore_2
    //   44: aload_2
    //   45: monitorenter
    //   46: aload_0
    //   47: getfield 18	com/google/android/gms/b/fh:b	Lcom/google/android/gms/b/bf$a;
    //   50: astore_3
    //   51: aload_1
    //   52: invokestatic 38	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;)[B
    //   55: astore_1
    //   56: aload_1
    //   57: arraylength
    //   58: istore 4
    //   60: aload_3
    //   61: aload_1
    //   62: iload 4
    //   64: invokestatic 41	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;[BI)Lcom/google/android/gms/b/gb;
    //   67: pop
    //   68: aload_2
    //   69: monitorexit
    //   70: aconst_null
    //   71: areturn
    //   72: astore_1
    //   73: aload_2
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    //   77: astore_1
    //   78: goto -8 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	fh
    //   7	55	1	localObject1	Object
    //   72	4	1	localObject2	Object
    //   77	1	1	localga	ga
    //   50	11	3	locala2	bf.a
    //   58	5	4	i	int
    // Exception table:
    //   from	to	target	type
    //   46	50	72	finally
    //   51	55	72	finally
    //   56	58	72	finally
    //   62	68	72	finally
    //   68	70	72	finally
    //   73	75	72	finally
    //   39	43	77	com/google/android/gms/b/ga
    //   44	46	77	com/google/android/gms/b/ga
    //   75	77	77	com/google/android/gms/b/ga
  }
}


/* Location:              com/google/android/gms/b/fh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */