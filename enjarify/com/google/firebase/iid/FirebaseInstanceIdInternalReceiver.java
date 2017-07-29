package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.support.v4.c.e;
import android.util.Log;
import com.google.android.gms.common.util.i;

public final class FirebaseInstanceIdInternalReceiver
  extends e
{
  private static boolean a = false;
  private static b.c b;
  private static b.c c;
  
  /* Error */
  static b.c a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: astore_2
    //   3: aload_2
    //   4: monitorenter
    //   5: ldc 17
    //   7: astore_3
    //   8: aload_3
    //   9: aload_1
    //   10: invokevirtual 23	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   13: istore 4
    //   15: iload 4
    //   17: ifeq +33 -> 50
    //   20: getstatic 25	com/google/firebase/iid/FirebaseInstanceIdInternalReceiver:c	Lcom/google/firebase/iid/b$c;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull +17 -> 42
    //   28: new 27	com/google/firebase/iid/b$c
    //   31: astore_3
    //   32: aload_3
    //   33: aload_0
    //   34: aload_1
    //   35: invokespecial 30	com/google/firebase/iid/b$c:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   38: aload_3
    //   39: putstatic 25	com/google/firebase/iid/FirebaseInstanceIdInternalReceiver:c	Lcom/google/firebase/iid/b$c;
    //   42: getstatic 25	com/google/firebase/iid/FirebaseInstanceIdInternalReceiver:c	Lcom/google/firebase/iid/b$c;
    //   45: astore_3
    //   46: aload_2
    //   47: monitorexit
    //   48: aload_3
    //   49: areturn
    //   50: getstatic 32	com/google/firebase/iid/FirebaseInstanceIdInternalReceiver:b	Lcom/google/firebase/iid/b$c;
    //   53: astore_3
    //   54: aload_3
    //   55: ifnonnull +17 -> 72
    //   58: new 27	com/google/firebase/iid/b$c
    //   61: astore_3
    //   62: aload_3
    //   63: aload_0
    //   64: aload_1
    //   65: invokespecial 30	com/google/firebase/iid/b$c:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   68: aload_3
    //   69: putstatic 32	com/google/firebase/iid/FirebaseInstanceIdInternalReceiver:b	Lcom/google/firebase/iid/b$c;
    //   72: getstatic 32	com/google/firebase/iid/FirebaseInstanceIdInternalReceiver:b	Lcom/google/firebase/iid/b$c;
    //   75: astore_3
    //   76: goto -30 -> 46
    //   79: astore_3
    //   80: aload_2
    //   81: monitorexit
    //   82: aload_3
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	paramContext	Context
    //   0	84	1	paramString	String
    //   2	79	2	localClass	Class
    //   7	69	3	localObject1	Object
    //   79	4	3	localObject2	Object
    //   13	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	13	79	finally
    //   20	23	79	finally
    //   28	31	79	finally
    //   34	38	79	finally
    //   38	42	79	finally
    //   42	45	79	finally
    //   50	53	79	finally
    //   58	61	79	finally
    //   64	68	79	finally
    //   68	72	79	finally
    //   72	75	79	finally
  }
  
  static boolean a(Context paramContext)
  {
    boolean bool1 = false;
    boolean bool2 = i.g();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
      int i = targetSdkVersion;
      int j = 25;
      if (i > j) {
        bool1 = true;
      }
    }
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (;;)
    {
      return;
      Object localObject1 = paramIntent.getParcelableExtra("wrapped_intent");
      boolean bool = localObject1 instanceof Intent;
      Object localObject2;
      if (!bool)
      {
        localObject1 = "FirebaseInstanceId";
        localObject2 = "Missing or invalid wrapped intent";
        Log.e((String)localObject1, (String)localObject2);
      }
      else
      {
        localObject1 = (Intent)localObject1;
        bool = a(paramContext);
        Object localObject3;
        if (bool)
        {
          localObject2 = paramIntent.getAction();
          localObject2 = a(paramContext, (String)localObject2);
          localObject3 = goAsync();
          ((b.c)localObject2).a((Intent)localObject1, (BroadcastReceiver.PendingResult)localObject3);
        }
        else
        {
          localObject2 = g.a();
          localObject3 = paramIntent.getAction();
          ((g)localObject2).a(paramContext, (String)localObject3, (Intent)localObject1);
        }
      }
    }
  }
}


/* Location:              com/google/firebase/iid/FirebaseInstanceIdInternalReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */