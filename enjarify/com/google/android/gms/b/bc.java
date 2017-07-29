package com.google.android.gms.b;

import android.content.Context;

public final class bc
{
  private static bc b;
  private bb a = null;
  
  static
  {
    bc localbc = new com/google/android/gms/b/bc;
    localbc.<init>();
    b = localbc;
  }
  
  public static bb a(Context paramContext)
  {
    return b.b(paramContext);
  }
  
  /* Error */
  private bb b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 17	com/google/android/gms/b/bc:a	Lcom/google/android/gms/b/bb;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +26 -> 34
    //   11: aload_1
    //   12: invokevirtual 26	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull +26 -> 43
    //   20: new 28	com/google/android/gms/b/bb
    //   23: astore_2
    //   24: aload_2
    //   25: aload_1
    //   26: invokespecial 31	com/google/android/gms/b/bb:<init>	(Landroid/content/Context;)V
    //   29: aload_0
    //   30: aload_2
    //   31: putfield 17	com/google/android/gms/b/bc:a	Lcom/google/android/gms/b/bb;
    //   34: aload_0
    //   35: getfield 17	com/google/android/gms/b/bc:a	Lcom/google/android/gms/b/bb;
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: areturn
    //   43: aload_1
    //   44: invokevirtual 26	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   47: astore_1
    //   48: goto -28 -> 20
    //   51: astore_2
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_2
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	bc
    //   0	56	1	paramContext	Context
    //   6	36	2	localObject1	Object
    //   51	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	51	finally
    //   11	15	51	finally
    //   20	23	51	finally
    //   25	29	51	finally
    //   30	34	51	finally
    //   34	38	51	finally
    //   43	47	51	finally
  }
}


/* Location:              com/google/android/gms/b/bc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */