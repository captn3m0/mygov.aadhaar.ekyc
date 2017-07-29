package com.google.android.gms.b;

import com.google.android.gms.common.a;
import java.util.concurrent.locks.Lock;

final class k$a
  implements ac.a
{
  private k$a(k paramk) {}
  
  /* Error */
  public final void a(int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   4: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   7: astore_3
    //   8: aload_3
    //   9: invokeinterface 28 1 0
    //   14: aload_0
    //   15: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   18: astore_3
    //   19: aload_3
    //   20: getfield 32	com/google/android/gms/b/k:f	Z
    //   23: istore 4
    //   25: iload 4
    //   27: ifne +38 -> 65
    //   30: aload_0
    //   31: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   34: astore_3
    //   35: aload_3
    //   36: getfield 36	com/google/android/gms/b/k:e	Lcom/google/android/gms/common/a;
    //   39: astore_3
    //   40: aload_3
    //   41: ifnull +24 -> 65
    //   44: aload_0
    //   45: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   48: astore_3
    //   49: aload_3
    //   50: getfield 36	com/google/android/gms/b/k:e	Lcom/google/android/gms/common/a;
    //   53: astore_3
    //   54: aload_3
    //   55: invokevirtual 42	com/google/android/gms/common/a:b	()Z
    //   58: istore 4
    //   60: iload 4
    //   62: ifne +42 -> 104
    //   65: aload_0
    //   66: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   69: astore_3
    //   70: iconst_0
    //   71: istore 5
    //   73: aload_3
    //   74: iconst_0
    //   75: putfield 32	com/google/android/gms/b/k:f	Z
    //   78: aload_0
    //   79: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   82: astore_3
    //   83: aload_3
    //   84: iload_1
    //   85: iload_2
    //   86: invokestatic 45	com/google/android/gms/b/k:a	(Lcom/google/android/gms/b/k;IZ)V
    //   89: aload_0
    //   90: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   93: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   96: astore_3
    //   97: aload_3
    //   98: invokeinterface 48 1 0
    //   103: return
    //   104: aload_0
    //   105: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   108: astore_3
    //   109: iconst_1
    //   110: istore 5
    //   112: aload_3
    //   113: iload 5
    //   115: putfield 32	com/google/android/gms/b/k:f	Z
    //   118: aload_0
    //   119: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   122: astore_3
    //   123: aload_3
    //   124: getfield 52	com/google/android/gms/b/k:b	Lcom/google/android/gms/b/v;
    //   127: astore_3
    //   128: aload_3
    //   129: iload_1
    //   130: invokevirtual 57	com/google/android/gms/b/v:a	(I)V
    //   133: aload_0
    //   134: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   137: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   140: astore_3
    //   141: aload_3
    //   142: invokeinterface 48 1 0
    //   147: goto -44 -> 103
    //   150: astore_3
    //   151: aload_0
    //   152: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   155: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   158: invokeinterface 48 1 0
    //   163: aload_3
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	a
    //   0	165	1	paramInt	int
    //   0	165	2	paramBoolean	boolean
    //   7	135	3	localObject1	Object
    //   150	14	3	localObject2	Object
    //   23	38	4	bool1	boolean
    //   71	43	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   14	18	150	finally
    //   19	23	150	finally
    //   30	34	150	finally
    //   35	39	150	finally
    //   44	48	150	finally
    //   49	53	150	finally
    //   54	58	150	finally
    //   65	69	150	finally
    //   74	78	150	finally
    //   78	82	150	finally
    //   85	89	150	finally
    //   104	108	150	finally
    //   113	118	150	finally
    //   118	122	150	finally
    //   123	127	150	finally
    //   129	133	150	finally
  }
  
  /* Error */
  public final void a(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   4: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   7: astore_2
    //   8: aload_2
    //   9: invokeinterface 28 1 0
    //   14: aload_0
    //   15: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   18: astore_2
    //   19: aload_2
    //   20: getfield 61	com/google/android/gms/b/k:c	Landroid/os/Bundle;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull +44 -> 69
    //   28: aload_2
    //   29: aload_1
    //   30: putfield 61	com/google/android/gms/b/k:c	Landroid/os/Bundle;
    //   33: aload_0
    //   34: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   37: astore_2
    //   38: getstatic 63	com/google/android/gms/common/a:a	Lcom/google/android/gms/common/a;
    //   41: astore_3
    //   42: aload_2
    //   43: aload_3
    //   44: putfield 66	com/google/android/gms/b/k:d	Lcom/google/android/gms/common/a;
    //   47: aload_0
    //   48: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   51: astore_2
    //   52: aload_2
    //   53: invokestatic 68	com/google/android/gms/b/k:a	(Lcom/google/android/gms/b/k;)V
    //   56: aload_0
    //   57: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   60: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   63: invokeinterface 48 1 0
    //   68: return
    //   69: aload_1
    //   70: ifnull -37 -> 33
    //   73: aload_2
    //   74: getfield 61	com/google/android/gms/b/k:c	Landroid/os/Bundle;
    //   77: astore_2
    //   78: aload_2
    //   79: aload_1
    //   80: invokevirtual 74	android/os/Bundle:putAll	(Landroid/os/Bundle;)V
    //   83: goto -50 -> 33
    //   86: astore_2
    //   87: aload_0
    //   88: getfield 10	com/google/android/gms/b/k$a:a	Lcom/google/android/gms/b/k;
    //   91: getfield 23	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   94: invokeinterface 48 1 0
    //   99: aload_2
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	a
    //   0	101	1	paramBundle	android.os.Bundle
    //   7	72	2	localObject1	Object
    //   86	14	2	localObject2	Object
    //   23	21	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   14	18	86	finally
    //   19	23	86	finally
    //   29	33	86	finally
    //   33	37	86	finally
    //   38	41	86	finally
    //   43	47	86	finally
    //   47	51	86	finally
    //   52	56	86	finally
    //   73	77	86	finally
    //   79	83	86	finally
  }
  
  public final void a(a parama)
  {
    Object localObject1 = a.g;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = a;
      d = parama;
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


/* Location:              com/google/android/gms/b/k$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */