package com.google.android.gms.b;

import android.content.Context;

public final class ba
{
  private static Context a;
  private static Boolean b;
  
  /* Error */
  public static boolean a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual 17	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   7: astore_2
    //   8: getstatic 19	com/google/android/gms/b/ba:a	Landroid/content/Context;
    //   11: ifnull +28 -> 39
    //   14: getstatic 21	com/google/android/gms/b/ba:b	Ljava/lang/Boolean;
    //   17: ifnull +22 -> 39
    //   20: getstatic 19	com/google/android/gms/b/ba:a	Landroid/content/Context;
    //   23: aload_2
    //   24: if_acmpne +15 -> 39
    //   27: getstatic 21	com/google/android/gms/b/ba:b	Ljava/lang/Boolean;
    //   30: invokevirtual 27	java/lang/Boolean:booleanValue	()Z
    //   33: istore_1
    //   34: ldc 2
    //   36: monitorexit
    //   37: iload_1
    //   38: ireturn
    //   39: aconst_null
    //   40: putstatic 21	com/google/android/gms/b/ba:b	Ljava/lang/Boolean;
    //   43: aload_0
    //   44: invokevirtual 31	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   47: ldc 33
    //   49: invokevirtual 39	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   52: pop
    //   53: iconst_1
    //   54: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   57: putstatic 21	com/google/android/gms/b/ba:b	Ljava/lang/Boolean;
    //   60: aload_2
    //   61: putstatic 19	com/google/android/gms/b/ba:a	Landroid/content/Context;
    //   64: getstatic 21	com/google/android/gms/b/ba:b	Ljava/lang/Boolean;
    //   67: invokevirtual 27	java/lang/Boolean:booleanValue	()Z
    //   70: istore_1
    //   71: goto -37 -> 34
    //   74: astore_0
    //   75: iconst_0
    //   76: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   79: putstatic 21	com/google/android/gms/b/ba:b	Ljava/lang/Boolean;
    //   82: goto -22 -> 60
    //   85: astore_0
    //   86: ldc 2
    //   88: monitorexit
    //   89: aload_0
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	paramContext	Context
    //   33	38	1	bool	boolean
    //   7	54	2	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   43	60	74	java/lang/ClassNotFoundException
    //   3	34	85	finally
    //   39	43	85	finally
    //   43	60	85	finally
    //   60	71	85	finally
    //   75	82	85	finally
  }
}


/* Location:              com/google/android/gms/b/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */