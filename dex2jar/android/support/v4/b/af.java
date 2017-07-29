package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.os.Bundle;
import java.lang.reflect.Method;

@TargetApi(9)
public final class af
{
  private static Method a;
  
  /* Error */
  public static android.app.Notification a(android.app.Notification paramNotification, android.content.Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2)
  {
    // Byte code:
    //   0: getstatic 22	android/support/v4/b/af:a	Ljava/lang/reflect/Method;
    //   3: ifnonnull +37 -> 40
    //   6: ldc 24
    //   8: ldc 26
    //   10: iconst_4
    //   11: anewarray 28	java/lang/Class
    //   14: dup
    //   15: iconst_0
    //   16: ldc 30
    //   18: aastore
    //   19: dup
    //   20: iconst_1
    //   21: ldc 32
    //   23: aastore
    //   24: dup
    //   25: iconst_2
    //   26: ldc 32
    //   28: aastore
    //   29: dup
    //   30: iconst_3
    //   31: ldc 34
    //   33: aastore
    //   34: invokevirtual 38	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   37: putstatic 22	android/support/v4/b/af:a	Ljava/lang/reflect/Method;
    //   40: getstatic 22	android/support/v4/b/af:a	Ljava/lang/reflect/Method;
    //   43: aload_0
    //   44: iconst_4
    //   45: anewarray 4	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_1
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: aload_2
    //   55: aastore
    //   56: dup
    //   57: iconst_2
    //   58: aload_3
    //   59: aastore
    //   60: dup
    //   61: iconst_3
    //   62: aload 4
    //   64: aastore
    //   65: invokevirtual 44	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   68: pop
    //   69: aload_0
    //   70: aload 5
    //   72: putfield 48	android/app/Notification:fullScreenIntent	Landroid/app/PendingIntent;
    //   75: aload_0
    //   76: areturn
    //   77: astore_0
    //   78: new 50	java/lang/RuntimeException
    //   81: dup
    //   82: aload_0
    //   83: invokespecial 54	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   86: athrow
    //   87: astore_0
    //   88: new 50	java/lang/RuntimeException
    //   91: dup
    //   92: aload_0
    //   93: invokespecial 54	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   96: athrow
    //   97: astore_0
    //   98: goto -10 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	paramNotification	android.app.Notification
    //   0	101	1	paramContext	android.content.Context
    //   0	101	2	paramCharSequence1	CharSequence
    //   0	101	3	paramCharSequence2	CharSequence
    //   0	101	4	paramPendingIntent1	PendingIntent
    //   0	101	5	paramPendingIntent2	PendingIntent
    // Exception table:
    //   from	to	target	type
    //   6	40	77	java/lang/NoSuchMethodException
    //   40	69	87	java/lang/IllegalAccessException
    //   40	69	97	java/lang/reflect/InvocationTargetException
  }
  
  public static abstract class a
  {
    public abstract int a();
    
    public abstract CharSequence b();
    
    public abstract PendingIntent c();
    
    public abstract Bundle d();
    
    public abstract boolean e();
    
    public abstract am.a[] f();
    
    public static abstract interface a {}
  }
}


/* Location:              android/support/v4/b/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */