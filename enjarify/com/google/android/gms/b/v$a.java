package com.google.android.gms.b;

abstract class v$a
{
  private final u a;
  
  protected v$a(u paramu)
  {
    a = paramu;
  }
  
  protected abstract void a();
  
  /* Error */
  public final void a(v paramv)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 17	com/google/android/gms/b/v:a	Ljava/util/concurrent/locks/Lock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokeinterface 22 1 0
    //   11: aload_1
    //   12: getfield 25	com/google/android/gms/b/v:k	Lcom/google/android/gms/b/u;
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 12	com/google/android/gms/b/v$a:a	Lcom/google/android/gms/b/u;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: if_acmpeq +15 -> 38
    //   26: aload_1
    //   27: getfield 17	com/google/android/gms/b/v:a	Ljava/util/concurrent/locks/Lock;
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface 28 1 0
    //   37: return
    //   38: aload_0
    //   39: invokevirtual 30	com/google/android/gms/b/v$a:a	()V
    //   42: aload_1
    //   43: getfield 17	com/google/android/gms/b/v:a	Ljava/util/concurrent/locks/Lock;
    //   46: astore_2
    //   47: aload_2
    //   48: invokeinterface 28 1 0
    //   53: goto -16 -> 37
    //   56: astore_2
    //   57: aload_1
    //   58: getfield 17	com/google/android/gms/b/v:a	Ljava/util/concurrent/locks/Lock;
    //   61: invokeinterface 28 1 0
    //   66: aload_2
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	a
    //   0	68	1	paramv	v
    //   4	44	2	localObject1	Object
    //   56	11	2	localObject2	Object
    //   20	3	3	localu	u
    // Exception table:
    //   from	to	target	type
    //   11	15	56	finally
    //   16	20	56	finally
    //   38	42	56	finally
  }
}


/* Location:              com/google/android/gms/b/v$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */