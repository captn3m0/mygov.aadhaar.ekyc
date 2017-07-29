package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.a;
import java.util.concurrent.locks.Lock;

final class k$b
  implements ac.a
{
  private k$b(k paramk) {}
  
  /* Error */
  public final void a(int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   4: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   7: astore_3
    //   8: aload_3
    //   9: invokeinterface 28 1 0
    //   14: aload_0
    //   15: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   18: astore_3
    //   19: aload_3
    //   20: getfield 32	com/google/android/gms/b/k:f	Z
    //   23: istore 4
    //   25: iload 4
    //   27: ifeq +42 -> 69
    //   30: aload_0
    //   31: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   34: astore_3
    //   35: iconst_0
    //   36: istore 5
    //   38: aload_3
    //   39: iconst_0
    //   40: putfield 32	com/google/android/gms/b/k:f	Z
    //   43: aload_0
    //   44: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   47: astore_3
    //   48: aload_3
    //   49: iload_1
    //   50: iload_2
    //   51: invokestatic 35	com/google/android/gms/b/k:a	(Lcom/google/android/gms/b/k;IZ)V
    //   54: aload_0
    //   55: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   58: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   61: astore_3
    //   62: aload_3
    //   63: invokeinterface 38 1 0
    //   68: return
    //   69: aload_0
    //   70: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   73: astore_3
    //   74: iconst_1
    //   75: istore 5
    //   77: aload_3
    //   78: iload 5
    //   80: putfield 32	com/google/android/gms/b/k:f	Z
    //   83: aload_0
    //   84: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   87: astore_3
    //   88: aload_3
    //   89: getfield 42	com/google/android/gms/b/k:a	Lcom/google/android/gms/b/v;
    //   92: astore_3
    //   93: aload_3
    //   94: iload_1
    //   95: invokevirtual 47	com/google/android/gms/b/v:a	(I)V
    //   98: aload_0
    //   99: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   102: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 38 1 0
    //   112: goto -44 -> 68
    //   115: astore_3
    //   116: aload_0
    //   117: getfield 10	com/google/android/gms/b/k$b:a	Lcom/google/android/gms/b/k;
    //   120: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   123: invokeinterface 38 1 0
    //   128: aload_3
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	b
    //   0	130	1	paramInt	int
    //   0	130	2	paramBoolean	boolean
    //   7	100	3	localObject1	Object
    //   115	14	3	localObject2	Object
    //   23	3	4	bool1	boolean
    //   36	43	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   14	18	115	finally
    //   19	23	115	finally
    //   30	34	115	finally
    //   39	43	115	finally
    //   43	47	115	finally
    //   50	54	115	finally
    //   69	73	115	finally
    //   78	83	115	finally
    //   83	87	115	finally
    //   88	92	115	finally
    //   94	98	115	finally
  }
  
  public final void a(Bundle paramBundle)
  {
    Object localObject1 = a.g;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = a;
      a locala = a.a;
      e = locala;
      localObject1 = a;
      k.a((k)localObject1);
      return;
    }
    finally
    {
      a.g.unlock();
    }
  }
  
  public final void a(a parama)
  {
    Object localObject1 = a.g;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = a;
      e = parama;
      localObject1 = a;
      k.a((k)localObject1);
      return;
    }
    finally
    {
      a.g.unlock();
    }
  }
}


/* Location:              com/google/android/gms/b/k$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */