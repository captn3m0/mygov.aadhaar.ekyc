package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.b.gt;
import com.google.android.gms.b.gt.a;
import com.google.android.gms.common.d;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.m;
import com.google.android.gms.common.o;
import java.io.IOException;
import java.lang.ref.WeakReference;
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
  Object d = new Object();
  b e;
  final long f;
  private final Context g;
  
  public a(Context paramContext)
  {
    this(paramContext, 30000L, false);
  }
  
  private a(Context paramContext, long paramLong, boolean paramBoolean)
  {
    c.a(paramContext);
    Context localContext;
    if (paramBoolean)
    {
      localContext = paramContext.getApplicationContext();
      if (localContext != null) {}
    }
    for (g = paramContext;; g = paramContext)
    {
      c = false;
      f = paramLong;
      return;
      paramContext = localContext;
      break;
    }
  }
  
  public static a a(Context paramContext)
  {
    f2 = 0.0F;
    boolean bool2 = false;
    boolean bool3 = false;
    bool1 = bool2;
    try
    {
      localObject1 = o.f(paramContext);
      f1 = f2;
      bool1 = bool3;
      if (localObject1 != null)
      {
        bool1 = bool2;
        localObject1 = ((Context)localObject1).getSharedPreferences("google_ads_flags", 1);
        bool1 = bool2;
        bool2 = ((SharedPreferences)localObject1).getBoolean("gads:ad_id_app_context:enabled", false);
        bool1 = bool2;
        f1 = ((SharedPreferences)localObject1).getFloat("gads:ad_id_app_context:ping_ratio", 0.0F);
        bool1 = bool2;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          paramContext.a(false);
          Object localObject1 = paramContext.a();
          a((a)localObject1, bool1, f1, null);
          return (a)localObject1;
        }
        catch (Throwable localThrowable)
        {
          float f1;
          a(null, bool1, f1, localThrowable);
          return null;
        }
        finally
        {
          paramContext.b();
        }
        localException = localException;
        Log.w("AdvertisingIdClient", "Error while reading from SharedPreferences ", localException);
        f1 = f2;
      }
    }
    paramContext = new a(paramContext, -1L, bool1);
  }
  
  private static gt a(i parami)
  {
    try
    {
      localTimeUnit = TimeUnit.MILLISECONDS;
      c.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
      if (a) {
        throw new IllegalStateException("Cannot call get on this connection more than once");
      }
    }
    catch (InterruptedException parami)
    {
      TimeUnit localTimeUnit;
      throw new IOException("Interrupted exception");
      a = true;
      parami = (IBinder)b.poll(10000L, localTimeUnit);
      if (parami == null) {
        throw new TimeoutException("Timed out waiting for the service connection");
      }
    }
    catch (Throwable parami)
    {
      throw new IOException(parami);
    }
    parami = gt.a.a(parami);
    return parami;
  }
  
  private static void a(a parama, boolean paramBoolean, float paramFloat, Throwable paramThrowable)
  {
    if (Math.random() > paramFloat) {
      return;
    }
    Bundle localBundle = new Bundle();
    if (paramBoolean)
    {
      str = "1";
      localBundle.putString("app_context", str);
      if (parama != null) {
        if (!b) {
          break label171;
        }
      }
    }
    label171:
    for (String str = "1";; str = "0")
    {
      localBundle.putString("limit_ad_tracking", str);
      if ((parama != null) && (a != null)) {
        localBundle.putString("ad_id_size", Integer.toString(a.length()));
      }
      if (paramThrowable != null) {
        localBundle.putString("error", paramThrowable.getClass().getName());
      }
      parama = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
      paramThrowable = localBundle.keySet().iterator();
      while (paramThrowable.hasNext())
      {
        str = (String)paramThrowable.next();
        parama.appendQueryParameter(str, localBundle.getString(str));
      }
      str = "0";
      break;
    }
    new Thread()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: new 27	com/google/android/gms/ads/c/b
        //   3: dup
        //   4: invokespecial 28	com/google/android/gms/ads/c/b:<init>	()V
        //   7: pop
        //   8: aload_0
        //   9: getfield 14	com/google/android/gms/ads/c/a$1:a	Ljava/lang/String;
        //   12: astore_3
        //   13: new 30	java/net/URL
        //   16: dup
        //   17: aload_3
        //   18: invokespecial 32	java/net/URL:<init>	(Ljava/lang/String;)V
        //   21: invokevirtual 36	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   24: checkcast 38	java/net/HttpURLConnection
        //   27: astore_2
        //   28: aload_2
        //   29: invokevirtual 42	java/net/HttpURLConnection:getResponseCode	()I
        //   32: istore_1
        //   33: iload_1
        //   34: sipush 200
        //   37: if_icmplt +10 -> 47
        //   40: iload_1
        //   41: sipush 300
        //   44: if_icmplt +47 -> 91
        //   47: ldc 44
        //   49: new 46	java/lang/StringBuilder
        //   52: dup
        //   53: aload_3
        //   54: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
        //   57: invokevirtual 55	java/lang/String:length	()I
        //   60: bipush 65
        //   62: iadd
        //   63: invokespecial 58	java/lang/StringBuilder:<init>	(I)V
        //   66: ldc 60
        //   68: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   71: iload_1
        //   72: invokevirtual 67	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   75: ldc 69
        //   77: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   80: aload_3
        //   81: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   84: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   87: invokestatic 79	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
        //   90: pop
        //   91: aload_2
        //   92: invokevirtual 82	java/net/HttpURLConnection:disconnect	()V
        //   95: return
        //   96: astore 4
        //   98: aload_2
        //   99: invokevirtual 82	java/net/HttpURLConnection:disconnect	()V
        //   102: aload 4
        //   104: athrow
        //   105: astore_2
        //   106: aload_2
        //   107: invokevirtual 85	java/lang/IndexOutOfBoundsException:getMessage	()Ljava/lang/String;
        //   110: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
        //   113: astore 4
        //   115: ldc 44
        //   117: new 46	java/lang/StringBuilder
        //   120: dup
        //   121: aload_3
        //   122: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
        //   125: invokevirtual 55	java/lang/String:length	()I
        //   128: bipush 32
        //   130: iadd
        //   131: aload 4
        //   133: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
        //   136: invokevirtual 55	java/lang/String:length	()I
        //   139: iadd
        //   140: invokespecial 58	java/lang/StringBuilder:<init>	(I)V
        //   143: ldc 87
        //   145: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   148: aload_3
        //   149: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: ldc 89
        //   154: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   157: aload 4
        //   159: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   165: aload_2
        //   166: invokestatic 92	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   169: pop
        //   170: return
        //   171: astore_2
        //   172: aload_2
        //   173: invokevirtual 95	java/lang/Exception:getMessage	()Ljava/lang/String;
        //   176: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
        //   179: astore 4
        //   181: ldc 44
        //   183: new 46	java/lang/StringBuilder
        //   186: dup
        //   187: aload_3
        //   188: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
        //   191: invokevirtual 55	java/lang/String:length	()I
        //   194: bipush 27
        //   196: iadd
        //   197: aload 4
        //   199: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
        //   202: invokevirtual 55	java/lang/String:length	()I
        //   205: iadd
        //   206: invokespecial 58	java/lang/StringBuilder:<init>	(I)V
        //   209: ldc 97
        //   211: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: aload_3
        //   215: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   218: ldc 89
        //   220: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: aload 4
        //   225: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   228: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   231: aload_2
        //   232: invokestatic 92	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   235: pop
        //   236: return
        //   237: astore_2
        //   238: goto -66 -> 172
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	241	0	this	1
        //   32	40	1	i	int
        //   27	72	2	localHttpURLConnection	java.net.HttpURLConnection
        //   105	61	2	localIndexOutOfBoundsException	IndexOutOfBoundsException
        //   171	61	2	localRuntimeException	RuntimeException
        //   237	1	2	localIOException	IOException
        //   12	203	3	str1	String
        //   96	7	4	localObject	Object
        //   113	111	4	str2	String
        // Exception table:
        //   from	to	target	type
        //   28	33	96	finally
        //   47	91	96	finally
        //   13	28	105	java/lang/IndexOutOfBoundsException
        //   91	95	105	java/lang/IndexOutOfBoundsException
        //   98	105	105	java/lang/IndexOutOfBoundsException
        //   13	28	171	java/lang/RuntimeException
        //   91	95	171	java/lang/RuntimeException
        //   98	105	171	java/lang/RuntimeException
        //   13	28	237	java/io/IOException
        //   91	95	237	java/io/IOException
        //   98	105	237	java/io/IOException
      }
    }.start();
  }
  
  private static i b(Context paramContext)
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      switch (m.b().a(paramContext))
      {
      case 1: 
      default: 
        throw new IOException("Google Play services not available");
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new d();
    }
    i locali = new i();
    Intent localIntent = new Intent("com.google.android.gms.ads.identifier.service.START");
    localIntent.setPackage("com.google.android.gms");
    try
    {
      com.google.android.gms.common.a.a.a();
      boolean bool = com.google.android.gms.common.a.a.b(paramContext, localIntent, locali, 1);
      if (bool) {
        return locali;
      }
    }
    catch (Throwable paramContext)
    {
      throw new IOException(paramContext);
    }
    throw new IOException("Connection failure");
  }
  
  private void c()
  {
    synchronized (d)
    {
      if (e != null) {
        e.a.countDown();
      }
    }
    try
    {
      e.join();
      if (f > 0L) {
        e = new b(this, f);
      }
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final a a()
  {
    // Byte code:
    //   0: ldc_w 336
    //   3: invokestatic 121	com/google/android/gms/common/internal/c:c	(Ljava/lang/String;)V
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield 52	com/google/android/gms/ads/c/a:c	Z
    //   12: ifne +86 -> 98
    //   15: aload_0
    //   16: getfield 37	com/google/android/gms/ads/c/a:d	Ljava/lang/Object;
    //   19: astore_1
    //   20: aload_1
    //   21: monitorenter
    //   22: aload_0
    //   23: getfield 318	com/google/android/gms/ads/c/a:e	Lcom/google/android/gms/ads/c/a$b;
    //   26: ifnull +13 -> 39
    //   29: aload_0
    //   30: getfield 318	com/google/android/gms/ads/c/a:e	Lcom/google/android/gms/ads/c/a$b;
    //   33: getfield 337	com/google/android/gms/ads/c/a$b:b	Z
    //   36: ifne +24 -> 60
    //   39: new 133	java/io/IOException
    //   42: dup
    //   43: ldc_w 339
    //   46: invokespecial 136	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   49: athrow
    //   50: astore_2
    //   51: aload_1
    //   52: monitorexit
    //   53: aload_2
    //   54: athrow
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    //   60: aload_1
    //   61: monitorexit
    //   62: aload_0
    //   63: iconst_0
    //   64: invokevirtual 89	com/google/android/gms/ads/c/a:a	(Z)V
    //   67: aload_0
    //   68: getfield 52	com/google/android/gms/ads/c/a:c	Z
    //   71: ifne +27 -> 98
    //   74: new 133	java/io/IOException
    //   77: dup
    //   78: ldc_w 341
    //   81: invokespecial 136	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   84: athrow
    //   85: astore_1
    //   86: new 133	java/io/IOException
    //   89: dup
    //   90: ldc_w 341
    //   93: aload_1
    //   94: invokespecial 344	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   97: athrow
    //   98: aload_0
    //   99: getfield 346	com/google/android/gms/ads/c/a:a	Lcom/google/android/gms/common/i;
    //   102: invokestatic 42	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   105: pop
    //   106: aload_0
    //   107: getfield 348	com/google/android/gms/ads/c/a:b	Lcom/google/android/gms/b/gt;
    //   110: invokestatic 42	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   113: pop
    //   114: new 8	com/google/android/gms/ads/c/a$a
    //   117: dup
    //   118: aload_0
    //   119: getfield 348	com/google/android/gms/ads/c/a:b	Lcom/google/android/gms/b/gt;
    //   122: invokeinterface 352 1 0
    //   127: aload_0
    //   128: getfield 348	com/google/android/gms/ads/c/a:b	Lcom/google/android/gms/b/gt;
    //   131: iconst_1
    //   132: invokeinterface 355 2 0
    //   137: invokespecial 358	com/google/android/gms/ads/c/a$a:<init>	(Ljava/lang/String;Z)V
    //   140: astore_1
    //   141: aload_0
    //   142: monitorexit
    //   143: aload_0
    //   144: invokespecial 360	com/google/android/gms/ads/c/a:c	()V
    //   147: aload_1
    //   148: areturn
    //   149: astore_1
    //   150: ldc 99
    //   152: ldc_w 362
    //   155: aload_1
    //   156: invokestatic 365	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   159: pop
    //   160: new 133	java/io/IOException
    //   163: dup
    //   164: ldc_w 367
    //   167: invokespecial 136	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   170: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	a
    //   55	6	1	localObject2	Object
    //   85	9	1	localException	Exception
    //   140	8	1	locala	a
    //   149	7	1	localRemoteException	android.os.RemoteException
    //   50	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   22	39	50	finally
    //   39	50	50	finally
    //   51	53	50	finally
    //   60	62	50	finally
    //   8	22	55	finally
    //   53	55	55	finally
    //   56	58	55	finally
    //   62	67	55	finally
    //   67	85	55	finally
    //   86	98	55	finally
    //   98	114	55	finally
    //   114	141	55	finally
    //   141	143	55	finally
    //   150	171	55	finally
    //   62	67	85	java/lang/Exception
    //   114	141	149	android/os/RemoteException
  }
  
  public final void a(boolean paramBoolean)
  {
    c.c("Calling this from your main thread can lead to deadlock");
    try
    {
      if (c) {
        b();
      }
      a = b(g);
      b = a(a);
      c = true;
      if (paramBoolean) {
        c();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: ldc_w 336
    //   3: invokestatic 121	com/google/android/gms/common/internal/c:c	(Ljava/lang/String;)V
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield 50	com/google/android/gms/ads/c/a:g	Landroid/content/Context;
    //   12: ifnull +10 -> 22
    //   15: aload_0
    //   16: getfield 346	com/google/android/gms/ads/c/a:a	Lcom/google/android/gms/common/i;
    //   19: ifnonnull +6 -> 25
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload_0
    //   26: getfield 52	com/google/android/gms/ads/c/a:c	Z
    //   29: ifeq +18 -> 47
    //   32: invokestatic 311	com/google/android/gms/common/a/a:a	()Lcom/google/android/gms/common/a/a;
    //   35: pop
    //   36: aload_0
    //   37: getfield 50	com/google/android/gms/ads/c/a:g	Landroid/content/Context;
    //   40: aload_0
    //   41: getfield 346	com/google/android/gms/ads/c/a:a	Lcom/google/android/gms/common/i;
    //   44: invokestatic 376	com/google/android/gms/common/a/a:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield 52	com/google/android/gms/ads/c/a:c	Z
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 348	com/google/android/gms/ads/c/a:b	Lcom/google/android/gms/b/gt;
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield 346	com/google/android/gms/ads/c/a:a	Lcom/google/android/gms/common/i;
    //   62: aload_0
    //   63: monitorexit
    //   64: return
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    //   70: astore_1
    //   71: ldc 99
    //   73: ldc_w 378
    //   76: aload_1
    //   77: invokestatic 365	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   80: pop
    //   81: goto -34 -> 47
    //   84: astore_1
    //   85: ldc 99
    //   87: ldc_w 378
    //   90: aload_1
    //   91: invokestatic 365	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   94: pop
    //   95: goto -48 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   65	4	1	localObject	Object
    //   70	7	1	localIllegalArgumentException	IllegalArgumentException
    //   84	7	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   8	22	65	finally
    //   22	24	65	finally
    //   25	47	65	finally
    //   47	64	65	finally
    //   66	68	65	finally
    //   71	81	65	finally
    //   85	95	65	finally
    //   25	47	70	java/lang/IllegalArgumentException
    //   25	47	84	java/lang/Throwable
  }
  
  protected final void finalize()
  {
    b();
    super.finalize();
  }
  
  public static final class a
  {
    public final String a;
    public final boolean b;
    
    public a(String paramString, boolean paramBoolean)
    {
      a = paramString;
      b = paramBoolean;
    }
    
    public final String toString()
    {
      String str = a;
      boolean bool = b;
      return String.valueOf(str).length() + 7 + "{" + str + "}" + bool;
    }
  }
  
  static final class b
    extends Thread
  {
    CountDownLatch a;
    boolean b;
    private WeakReference<a> c;
    private long d;
    
    public b(a parama, long paramLong)
    {
      c = new WeakReference(parama);
      d = paramLong;
      a = new CountDownLatch(1);
      b = false;
      start();
    }
    
    private void a()
    {
      a locala = (a)c.get();
      if (locala != null)
      {
        locala.b();
        b = true;
      }
    }
    
    public final void run()
    {
      try
      {
        if (!a.await(d, TimeUnit.MILLISECONDS)) {
          a();
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        a();
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */