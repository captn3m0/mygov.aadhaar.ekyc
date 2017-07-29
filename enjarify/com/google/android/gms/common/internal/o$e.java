package com.google.android.gms.common.internal;

import java.util.ArrayList;

public abstract class o$e
{
  private Object a;
  private boolean b;
  
  public o$e(o paramo, Object paramObject)
  {
    a = paramObject;
    b = false;
  }
  
  protected abstract void a(Object paramObject);
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 18	com/google/android/gms/common/internal/o$e:a	Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_0
    //   8: getfield 20	com/google/android/gms/common/internal/o$e:b	Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +90 -> 103
    //   16: ldc 22
    //   18: astore_3
    //   19: aload_0
    //   20: invokestatic 28	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   23: astore 4
    //   25: aload 4
    //   27: invokestatic 28	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   30: astore 5
    //   32: aload 5
    //   34: invokevirtual 32	java/lang/String:length	()I
    //   37: bipush 47
    //   39: iadd
    //   40: istore 6
    //   42: new 34	java/lang/StringBuilder
    //   45: astore 7
    //   47: aload 7
    //   49: iload 6
    //   51: invokespecial 37	java/lang/StringBuilder:<init>	(I)V
    //   54: ldc 39
    //   56: astore 5
    //   58: aload 7
    //   60: aload 5
    //   62: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: astore 5
    //   67: aload 5
    //   69: aload 4
    //   71: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: astore 4
    //   76: ldc 45
    //   78: astore 5
    //   80: aload 4
    //   82: aload 5
    //   84: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: astore 4
    //   89: aload 4
    //   91: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: astore 4
    //   96: aload_3
    //   97: aload 4
    //   99: invokestatic 55	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   102: pop
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: ifnull +8 -> 114
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual 58	com/google/android/gms/common/internal/o$e:a	(Ljava/lang/Object;)V
    //   114: aload_0
    //   115: monitorenter
    //   116: iconst_1
    //   117: istore 8
    //   119: aload_0
    //   120: iload 8
    //   122: putfield 20	com/google/android/gms/common/internal/o$e:b	Z
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_0
    //   128: invokevirtual 62	com/google/android/gms/common/internal/o$e:c	()V
    //   131: return
    //   132: astore_1
    //   133: aload_0
    //   134: monitorexit
    //   135: aload_1
    //   136: athrow
    //   137: athrow
    //   138: astore_1
    //   139: aload_0
    //   140: monitorexit
    //   141: aload_1
    //   142: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	e
    //   6	105	1	localObject1	Object
    //   132	4	1	localObject2	Object
    //   138	4	1	localObject3	Object
    //   11	2	2	bool1	boolean
    //   18	79	3	str	String
    //   23	75	4	localObject4	Object
    //   30	53	5	localObject5	Object
    //   40	10	6	i	int
    //   45	14	7	localStringBuilder	StringBuilder
    //   117	4	8	bool2	boolean
    //   137	1	11	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   2	6	132	finally
    //   7	11	132	finally
    //   19	23	132	finally
    //   25	30	132	finally
    //   32	37	132	finally
    //   42	45	132	finally
    //   49	54	132	finally
    //   60	65	132	finally
    //   69	74	132	finally
    //   82	87	132	finally
    //   89	94	132	finally
    //   97	103	132	finally
    //   103	105	132	finally
    //   133	135	132	finally
    //   110	114	137	java/lang/RuntimeException
    //   120	125	138	finally
    //   125	127	138	finally
    //   139	141	138	finally
  }
  
  public final void c()
  {
    d();
    Object localObject1 = d;
    synchronized (o.c((o)localObject1))
    {
      localObject1 = d;
      localObject1 = o.c((o)localObject1);
      ((ArrayList)localObject1).remove(this);
      return;
    }
  }
  
  public final void d()
  {
    Object localObject1 = null;
    try
    {
      a = null;
      return;
    }
    finally {}
  }
}


/* Location:              com/google/android/gms/common/internal/o$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */