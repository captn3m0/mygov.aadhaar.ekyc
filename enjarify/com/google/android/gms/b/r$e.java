package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;

final class r$e
  implements c.b, c.c
{
  private r$e(r paramr) {}
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle)
  {
    ec localec = a.e;
    r.d locald = new com/google/android/gms/b/r$d;
    r localr = a;
    locald.<init>(localr);
    localec.a(locald);
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
    //   4: getfield 37	com/google/android/gms/b/r:b	Ljava/util/concurrent/locks/Lock;
    //   7: astore_2
    //   8: aload_2
    //   9: invokeinterface 42 1 0
    //   14: aload_0
    //   15: getfield 12	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
    //   18: astore_2
    //   19: aload_2
    //   20: aload_1
    //   21: invokevirtual 45	com/google/android/gms/b/r:a	(Lcom/google/android/gms/common/a;)Z
    //   24: istore_3
    //   25: iload_3
    //   26: ifeq +34 -> 60
    //   29: aload_0
    //   30: getfield 12	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
    //   33: astore_2
    //   34: aload_2
    //   35: invokevirtual 48	com/google/android/gms/b/r:f	()V
    //   38: aload_0
    //   39: getfield 12	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
    //   42: astore_2
    //   43: aload_2
    //   44: invokevirtual 50	com/google/android/gms/b/r:e	()V
    //   47: aload_0
    //   48: getfield 12	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
    //   51: getfield 37	com/google/android/gms/b/r:b	Ljava/util/concurrent/locks/Lock;
    //   54: invokeinterface 53 1 0
    //   59: return
    //   60: aload_0
    //   61: getfield 12	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
    //   64: astore_2
    //   65: aload_2
    //   66: aload_1
    //   67: invokevirtual 56	com/google/android/gms/b/r:b	(Lcom/google/android/gms/common/a;)V
    //   70: goto -23 -> 47
    //   73: astore_2
    //   74: aload_0
    //   75: getfield 12	com/google/android/gms/b/r$e:a	Lcom/google/android/gms/b/r;
    //   78: getfield 37	com/google/android/gms/b/r:b	Ljava/util/concurrent/locks/Lock;
    //   81: invokeinterface 53 1 0
    //   86: aload_2
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	e
    //   0	88	1	parama	com.google.android.gms.common.a
    //   7	59	2	localObject1	Object
    //   73	14	2	localObject2	Object
    //   24	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	18	73	finally
    //   20	24	73	finally
    //   29	33	73	finally
    //   34	38	73	finally
    //   38	42	73	finally
    //   43	47	73	finally
    //   60	64	73	finally
    //   66	70	73	finally
  }
}


/* Location:              com/google/android/gms/b/r$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */