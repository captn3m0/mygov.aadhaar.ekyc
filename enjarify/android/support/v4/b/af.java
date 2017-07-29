package android.support.v4.b;

import java.lang.reflect.Method;

public final class af
{
  private static Method a;
  
  /* Error */
  public static android.app.Notification a(android.app.Notification paramNotification, android.content.Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2, android.app.PendingIntent paramPendingIntent1, android.app.PendingIntent paramPendingIntent2)
  {
    // Byte code:
    //   0: getstatic 8	android/support/v4/b/af:a	Ljava/lang/reflect/Method;
    //   3: astore 6
    //   5: aload 6
    //   7: ifnonnull +92 -> 99
    //   10: ldc 10
    //   12: astore 6
    //   14: ldc 12
    //   16: astore 7
    //   18: iconst_4
    //   19: istore 8
    //   21: iload 8
    //   23: anewarray 15	java/lang/Class
    //   26: astore 9
    //   28: iconst_0
    //   29: istore 10
    //   31: ldc 17
    //   33: astore 11
    //   35: aload 9
    //   37: iconst_0
    //   38: aload 11
    //   40: aastore
    //   41: iconst_1
    //   42: istore 10
    //   44: ldc 20
    //   46: astore 11
    //   48: aload 9
    //   50: iload 10
    //   52: aload 11
    //   54: aastore
    //   55: iconst_2
    //   56: istore 10
    //   58: ldc 20
    //   60: astore 11
    //   62: aload 9
    //   64: iload 10
    //   66: aload 11
    //   68: aastore
    //   69: iconst_3
    //   70: istore 10
    //   72: ldc 24
    //   74: astore 11
    //   76: aload 9
    //   78: iload 10
    //   80: aload 11
    //   82: aastore
    //   83: aload 6
    //   85: aload 7
    //   87: aload 9
    //   89: invokevirtual 28	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   92: astore 6
    //   94: aload 6
    //   96: putstatic 8	android/support/v4/b/af:a	Ljava/lang/reflect/Method;
    //   99: getstatic 8	android/support/v4/b/af:a	Ljava/lang/reflect/Method;
    //   102: astore 6
    //   104: iconst_4
    //   105: istore 12
    //   107: iload 12
    //   109: anewarray 4	java/lang/Object
    //   112: astore 7
    //   114: iconst_0
    //   115: istore 8
    //   117: aconst_null
    //   118: astore 9
    //   120: aload 7
    //   122: iconst_0
    //   123: aload_1
    //   124: aastore
    //   125: iconst_1
    //   126: istore 8
    //   128: aload 7
    //   130: iload 8
    //   132: aload_2
    //   133: aastore
    //   134: iconst_2
    //   135: istore 8
    //   137: aload 7
    //   139: iload 8
    //   141: aload_3
    //   142: aastore
    //   143: iconst_3
    //   144: istore 8
    //   146: aload 7
    //   148: iload 8
    //   150: aload 4
    //   152: aastore
    //   153: aload 6
    //   155: aload_0
    //   156: aload 7
    //   158: invokevirtual 34	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: aload_0
    //   163: aload 5
    //   165: putfield 38	android/app/Notification:fullScreenIntent	Landroid/app/PendingIntent;
    //   168: aload_0
    //   169: areturn
    //   170: astore 6
    //   172: new 40	java/lang/RuntimeException
    //   175: astore 7
    //   177: aload 7
    //   179: aload 6
    //   181: invokespecial 44	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   184: aload 7
    //   186: athrow
    //   187: astore 6
    //   189: new 40	java/lang/RuntimeException
    //   192: astore 7
    //   194: aload 7
    //   196: aload 6
    //   198: invokespecial 44	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   201: aload 7
    //   203: athrow
    //   204: astore 6
    //   206: goto -17 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	paramNotification	android.app.Notification
    //   0	209	1	paramContext	android.content.Context
    //   0	209	2	paramCharSequence1	CharSequence
    //   0	209	3	paramCharSequence2	CharSequence
    //   0	209	4	paramPendingIntent1	android.app.PendingIntent
    //   0	209	5	paramPendingIntent2	android.app.PendingIntent
    //   3	151	6	localObject1	Object
    //   170	10	6	localNoSuchMethodException	NoSuchMethodException
    //   187	10	6	localIllegalAccessException	IllegalAccessException
    //   204	1	6	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   16	186	7	localObject2	Object
    //   19	130	8	i	int
    //   26	93	9	arrayOfClass	Class[]
    //   29	50	10	j	int
    //   33	48	11	localClass	Class
    //   105	3	12	k	int
    // Exception table:
    //   from	to	target	type
    //   21	26	170	java/lang/NoSuchMethodException
    //   38	41	170	java/lang/NoSuchMethodException
    //   52	55	170	java/lang/NoSuchMethodException
    //   66	69	170	java/lang/NoSuchMethodException
    //   80	83	170	java/lang/NoSuchMethodException
    //   87	92	170	java/lang/NoSuchMethodException
    //   94	99	170	java/lang/NoSuchMethodException
    //   99	102	187	java/lang/IllegalAccessException
    //   107	112	187	java/lang/IllegalAccessException
    //   123	125	187	java/lang/IllegalAccessException
    //   132	134	187	java/lang/IllegalAccessException
    //   141	143	187	java/lang/IllegalAccessException
    //   150	153	187	java/lang/IllegalAccessException
    //   156	162	187	java/lang/IllegalAccessException
    //   99	102	204	java/lang/reflect/InvocationTargetException
    //   107	112	204	java/lang/reflect/InvocationTargetException
    //   123	125	204	java/lang/reflect/InvocationTargetException
    //   132	134	204	java/lang/reflect/InvocationTargetException
    //   141	143	204	java/lang/reflect/InvocationTargetException
    //   150	153	204	java/lang/reflect/InvocationTargetException
    //   156	162	204	java/lang/reflect/InvocationTargetException
  }
}


/* Location:              android/support/v4/b/af.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */