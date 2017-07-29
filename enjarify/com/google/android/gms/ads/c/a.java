package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.b.gt;
import com.google.android.gms.b.gt.a;
import com.google.android.gms.common.d;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.m;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class a
{
  i a;
  gt b;
  boolean c;
  Object d;
  a.b e;
  final long f;
  private final Context g;
  
  public a(Context paramContext)
  {
    this(paramContext, 30000L, false);
  }
  
  private a(Context paramContext, long paramLong, boolean paramBoolean)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    c.a(paramContext);
    if (paramBoolean)
    {
      localObject = paramContext.getApplicationContext();
      if (localObject != null) {}
    }
    for (g = paramContext;; g = paramContext)
    {
      c = false;
      f = paramLong;
      return;
      paramContext = (Context)localObject;
      break;
    }
  }
  
  /* Error */
  public static a.a a(Context paramContext)
  {
    // Byte code:
    //   0: fconst_0
    //   1: fstore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aload_0
    //   7: invokestatic 53	com/google/android/gms/common/o:f	(Landroid/content/Context;)Landroid/content/Context;
    //   10: astore 4
    //   12: aload 4
    //   14: ifnull +63 -> 77
    //   17: ldc 55
    //   19: astore 5
    //   21: iconst_1
    //   22: istore 6
    //   24: aload 4
    //   26: aload 5
    //   28: iload 6
    //   30: invokevirtual 60	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   33: astore 4
    //   35: ldc 62
    //   37: astore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: aconst_null
    //   43: astore 7
    //   45: aload 4
    //   47: aload 5
    //   49: iconst_0
    //   50: invokeinterface 68 3 0
    //   55: istore_3
    //   56: ldc 70
    //   58: astore 5
    //   60: iconst_0
    //   61: istore 6
    //   63: aconst_null
    //   64: astore 7
    //   66: aload 4
    //   68: aload 5
    //   70: fconst_0
    //   71: invokeinterface 74 3 0
    //   76: fstore_1
    //   77: new 2	com/google/android/gms/ads/c/a
    //   80: astore 5
    //   82: iconst_m1
    //   83: i2l
    //   84: lstore 8
    //   86: aload 5
    //   88: aload_0
    //   89: lload 8
    //   91: iload_3
    //   92: invokespecial 26	com/google/android/gms/ads/c/a:<init>	(Landroid/content/Context;JZ)V
    //   95: aconst_null
    //   96: astore 4
    //   98: aload 5
    //   100: iconst_0
    //   101: invokevirtual 77	com/google/android/gms/ads/c/a:a	(Z)V
    //   104: aload 5
    //   106: invokevirtual 80	com/google/android/gms/ads/c/a:a	()Lcom/google/android/gms/ads/c/a$a;
    //   109: astore 4
    //   111: iconst_0
    //   112: istore 6
    //   114: aconst_null
    //   115: astore 7
    //   117: aload 4
    //   119: iload_3
    //   120: fload_1
    //   121: aconst_null
    //   122: invokestatic 83	com/google/android/gms/ads/c/a:a	(Lcom/google/android/gms/ads/c/a$a;ZFLjava/lang/Throwable;)V
    //   125: aload 5
    //   127: invokevirtual 85	com/google/android/gms/ads/c/a:b	()V
    //   130: aload 4
    //   132: astore_2
    //   133: aload_2
    //   134: areturn
    //   135: astore 4
    //   137: ldc 87
    //   139: astore 5
    //   141: ldc 89
    //   143: astore 7
    //   145: aload 5
    //   147: aload 7
    //   149: aload 4
    //   151: invokestatic 95	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   154: pop
    //   155: goto -78 -> 77
    //   158: astore 4
    //   160: iconst_0
    //   161: istore 6
    //   163: aconst_null
    //   164: astore 7
    //   166: aconst_null
    //   167: iload_3
    //   168: fload_1
    //   169: aload 4
    //   171: invokestatic 83	com/google/android/gms/ads/c/a:a	(Lcom/google/android/gms/ads/c/a$a;ZFLjava/lang/Throwable;)V
    //   174: aload 5
    //   176: invokevirtual 85	com/google/android/gms/ads/c/a:b	()V
    //   179: aconst_null
    //   180: astore_2
    //   181: fconst_0
    //   182: fstore_1
    //   183: goto -50 -> 133
    //   186: astore_2
    //   187: aload 5
    //   189: invokevirtual 85	com/google/android/gms/ads/c/a:b	()V
    //   192: aload_2
    //   193: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	paramContext	Context
    //   1	182	1	f1	float
    //   3	178	2	localObject1	Object
    //   186	7	2	localObject2	Object
    //   5	163	3	bool	boolean
    //   10	121	4	localObject3	Object
    //   135	15	4	localException	Exception
    //   158	12	4	localThrowable	Throwable
    //   19	169	5	localObject4	Object
    //   22	140	6	i	int
    //   43	122	7	str	String
    //   84	6	8	l	long
    // Exception table:
    //   from	to	target	type
    //   6	10	135	java/lang/Exception
    //   28	33	135	java/lang/Exception
    //   49	55	135	java/lang/Exception
    //   70	76	135	java/lang/Exception
    //   100	104	158	finally
    //   104	109	158	finally
    //   121	125	158	finally
    //   169	174	186	finally
  }
  
  private static gt a(i parami)
  {
    Object localObject3;
    try
    {
      Object localObject1 = TimeUnit.MILLISECONDS;
      localObject3 = "BlockingServiceConnection.getServiceWithTimeout() called on main thread";
      c.c((String)localObject3);
      bool = a;
      if (bool)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject3 = "Cannot call get on this connection more than once";
        ((IllegalStateException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      Object localObject2 = new java/io/IOException;
      ((IOException)localObject2).<init>("Interrupted exception");
      throw ((Throwable)localObject2);
      boolean bool = true;
      a = bool;
      localObject3 = b;
      long l = 10000L;
      localObject2 = ((BlockingQueue)localObject3).poll(l, (TimeUnit)localObject2);
      localObject2 = (IBinder)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new java/util/concurrent/TimeoutException;
        localObject3 = "Timed out waiting for the service connection";
        ((TimeoutException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
      }
    }
    finally
    {
      localObject3 = new java/io/IOException;
      ((IOException)localObject3).<init>(localThrowable);
    }
    return gt.a.a(localThrowable);
  }
  
  private static void a(a.a parama, boolean paramBoolean, float paramFloat, Throwable paramThrowable)
  {
    double d1 = Math.random();
    double d2 = paramFloat;
    boolean bool = d1 < d2;
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      Object localObject2 = "app_context";
      if (paramBoolean)
      {
        localObject3 = "1";
        ((Bundle)localObject1).putString((String)localObject2, (String)localObject3);
        if (parama != null)
        {
          localObject2 = "limit_ad_tracking";
          bool = b;
          if (!bool) {
            break label236;
          }
        }
      }
      label236:
      for (Object localObject3 = "1";; localObject3 = "0")
      {
        ((Bundle)localObject1).putString((String)localObject2, (String)localObject3);
        if (parama != null)
        {
          localObject3 = a;
          if (localObject3 != null)
          {
            localObject3 = "ad_id_size";
            int i = a.length();
            localObject2 = Integer.toString(i);
            ((Bundle)localObject1).putString((String)localObject3, (String)localObject2);
          }
        }
        if (paramThrowable != null)
        {
          localObject3 = "error";
          localObject2 = paramThrowable.getClass().getName();
          ((Bundle)localObject1).putString((String)localObject3, (String)localObject2);
        }
        localObject2 = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        localObject3 = ((Bundle)localObject1).keySet();
        Iterator localIterator = ((Set)localObject3).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject3 = (String)localIterator.next();
          String str = ((Bundle)localObject1).getString((String)localObject3);
          ((Uri.Builder)localObject2).appendQueryParameter((String)localObject3, str);
        }
        localObject3 = "0";
        break;
      }
      localObject3 = ((Uri.Builder)localObject2).build().toString();
      localObject1 = new com/google/android/gms/ads/c/a$1;
      ((a.1)localObject1).<init>((String)localObject3);
      ((a.1)localObject1).start();
    }
  }
  
  private static i b(Context paramContext)
  {
    int i;
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      localObject3 = "com.android.vending";
      i = 0;
      str = null;
      ((PackageManager)localObject1).getPackageInfo((String)localObject3, 0);
      localObject1 = m.b();
      int j = ((m)localObject1).a(paramContext);
      switch (j)
      {
      default: 
        localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("Google Play services not available");
        throw ((Throwable)localObject1);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject2 = new com/google/android/gms/common/d;
      ((d)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
    Object localObject2 = new com/google/android/gms/common/i;
    ((i)localObject2).<init>();
    Object localObject3 = new android/content/Intent;
    ((Intent)localObject3).<init>("com.google.android.gms.ads.identifier.service.START");
    String str = "com.google.android.gms";
    ((Intent)localObject3).setPackage(str);
    try
    {
      com.google.android.gms.common.a.a.a();
      i = 1;
      boolean bool = com.google.android.gms.common.a.a.b(paramContext, (Intent)localObject3, (ServiceConnection)localObject2, i);
      if (bool) {
        return (i)localObject2;
      }
    }
    finally
    {
      localObject3 = new java/io/IOException;
      ((IOException)localObject3).<init>(localThrowable);
    }
    IOException localIOException = new java/io/IOException;
    localIOException.<init>("Connection failure");
    throw localIOException;
  }
  
  private void c()
  {
    synchronized (d)
    {
      Object localObject2 = e;
      if (localObject2 != null)
      {
        localObject2 = e;
        localObject2 = a;
        ((CountDownLatch)localObject2).countDown();
      }
      try
      {
        localObject2 = e;
        ((a.b)localObject2).join();
      }
      catch (InterruptedException localInterruptedException)
      {
        long l1;
        long l2;
        boolean bool;
        for (;;) {}
      }
      l1 = f;
      l2 = 0L;
      bool = l1 < l2;
      if (bool)
      {
        localObject2 = new com/google/android/gms/ads/c/a$b;
        l1 = f;
        ((a.b)localObject2).<init>(this, l1);
        e = ((a.b)localObject2);
      }
      return;
    }
  }
  
  public final a.a a()
  {
    Object localObject1 = "Calling this from your main thread can lead to deadlock";
    c.c((String)localObject1);
    Object localObject6;
    try
    {
      bool1 = c;
      if (bool1) {
        break label130;
      }
      synchronized (d)
      {
        localObject1 = e;
        if (localObject1 != null)
        {
          localObject1 = e;
          bool1 = b;
          if (bool1) {}
        }
        else
        {
          localObject1 = new java/io/IOException;
          localObject6 = "AdvertisingIdClient is not connected.";
          ((IOException)localObject1).<init>((String)localObject6);
          throw ((Throwable)localObject1);
        }
      }
    }
    finally {}
    boolean bool1 = false;
    IOException localIOException1 = null;
    try
    {
      a(false);
      bool1 = c;
      if (!bool1)
      {
        localIOException1 = new java/io/IOException;
        ??? = "AdvertisingIdClient cannot reconnect.";
        localIOException1.<init>((String)???);
        throw localIOException1;
      }
    }
    catch (Exception localException)
    {
      ??? = new java/io/IOException;
      localObject6 = "AdvertisingIdClient cannot reconnect.";
      ((IOException)???).<init>((String)localObject6, localException);
      throw ((Throwable)???);
    }
    label130:
    Object localObject4 = a;
    c.a(localObject4);
    localObject4 = b;
    c.a(localObject4);
    try
    {
      localObject4 = new com/google/android/gms/ads/c/a$a;
      ??? = b;
      ??? = ((gt)???).a();
      localObject6 = b;
      boolean bool2 = true;
      boolean bool3 = ((gt)localObject6).a(bool2);
      ((a.a)localObject4).<init>((String)???, bool3);
      c();
      return (a.a)localObject4;
    }
    catch (RemoteException localRemoteException)
    {
      ??? = "AdvertisingIdClient";
      localObject6 = "GMS remote exception ";
      Log.i((String)???, (String)localObject6, localRemoteException);
      IOException localIOException2 = new java/io/IOException;
      ??? = "Remote exception";
      localIOException2.<init>((String)???);
      throw localIOException2;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject1 = "Calling this from your main thread can lead to deadlock";
    c.c((String)localObject1);
    try
    {
      boolean bool = c;
      if (bool) {
        b();
      }
      localObject1 = g;
      localObject1 = b((Context)localObject1);
      a = ((i)localObject1);
      localObject1 = a;
      localObject1 = a((i)localObject1);
      b = ((gt)localObject1);
      bool = true;
      c = bool;
      if (paramBoolean) {
        c();
      }
      return;
    }
    finally {}
  }
  
  public final void b()
  {
    Object localObject1 = "Calling this from your main thread can lead to deadlock";
    c.c((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = g;
        if (localObject1 != null)
        {
          localObject1 = a;
          if (localObject1 != null) {}
        }
        else
        {
          return;
        }
      }
      finally {}
      try
      {
        bool = c;
        if (bool)
        {
          com.google.android.gms.common.a.a.a();
          localObject1 = g;
          localObject3 = a;
          com.google.android.gms.common.a.a.a((Context)localObject1, (ServiceConnection)localObject3);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException) {}finally
      {
        localObject3 = "AdvertisingIdClient";
        String str = "AdvertisingIdClient unbindService failed.";
        Log.i((String)localObject3, str, localThrowable);
        continue;
      }
      boolean bool = false;
      localObject1 = null;
      c = false;
      bool = false;
      localObject1 = null;
      b = null;
      bool = false;
      localObject1 = null;
      a = null;
    }
  }
  
  protected final void finalize()
  {
    b();
    super.finalize();
  }
}


/* Location:              com/google/android/gms/ads/c/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */