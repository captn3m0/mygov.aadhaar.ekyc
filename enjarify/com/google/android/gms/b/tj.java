package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.purchase.i.1;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import com.google.android.gms.dynamite.DynamiteModule.b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class tj
  implements hh.b, tr.b
{
  private boolean A;
  private String B;
  private long C;
  private long D;
  private long E;
  private int F;
  public final Object a;
  public final String b;
  public gv c;
  public final HashSet d;
  public final HashMap e;
  Boolean f;
  public boolean g;
  public boolean h;
  final AtomicInteger i;
  private final tk j;
  private BigInteger k;
  private boolean l;
  private boolean m;
  private int n;
  private boolean o;
  private Context p;
  private un q;
  private kg r;
  private boolean s;
  private boolean t;
  private hi u;
  private hg v;
  private String w;
  private String x;
  private String y;
  private boolean z;
  
  public tj()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = BigInteger.ONE;
    k = ((BigInteger)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    d = ((HashSet)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    e = ((HashMap)localObject);
    l = false;
    m = bool;
    n = 0;
    o = false;
    r = null;
    s = bool;
    t = bool;
    u = null;
    v = null;
    f = null;
    g = false;
    z = false;
    A = false;
    h = false;
    B = "";
    C = l1;
    D = l1;
    E = l1;
    F = -1;
    localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>(0);
    i = ((AtomicInteger)localObject);
    localObject = tt.b();
    b = ((String)localObject);
    localObject = new com/google/android/gms/b/tk;
    String str = b;
    ((tk)localObject).<init>(str);
    j = ((tk)localObject);
  }
  
  private Future a(int paramInt)
  {
    synchronized (a)
    {
      F = paramInt;
      Object localObject2 = p;
      tr.18 local18 = new com/google/android/gms/b/tr$18;
      local18.<init>((Context)localObject2, paramInt);
      localObject2 = local18.c();
      localObject2 = (Future)localObject2;
      return (Future)localObject2;
    }
  }
  
  private Future b(long paramLong)
  {
    synchronized (a)
    {
      D = paramLong;
      Object localObject2 = p;
      tr.16 local16 = new com/google/android/gms/b/tr$16;
      local16.<init>((Context)localObject2, paramLong);
      localObject2 = local16.c();
      localObject2 = (Future)localObject2;
      return (Future)localObject2;
    }
  }
  
  public final Bundle a(Context paramContext, tl paramtl, String paramString)
  {
    Bundle localBundle;
    boolean bool;
    synchronized (a)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      Object localObject2 = "app";
      localObject5 = j;
      localObject5 = ((tk)localObject5).a(paramContext, paramString);
      localBundle.putBundle((String)localObject2, (Bundle)localObject5);
      localObject6 = new android/os/Bundle;
      ((Bundle)localObject6).<init>();
      localObject2 = e;
      localObject2 = ((HashMap)localObject2).keySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = localIterator.next();
        localObject2 = (String)localObject2;
        localObject5 = e;
        localObject5 = ((HashMap)localObject5).get(localObject2);
        localObject5 = (tm)localObject5;
        localObject5 = ((tm)localObject5).a();
        ((Bundle)localObject6).putBundle((String)localObject2, (Bundle)localObject5);
      }
    }
    Object localObject4 = "slots";
    localBundle.putBundle((String)localObject4, (Bundle)localObject6);
    Object localObject5 = new java/util/ArrayList;
    ((ArrayList)localObject5).<init>();
    localObject4 = d;
    Object localObject6 = ((HashSet)localObject4).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject6).hasNext();
      if (!bool) {
        break;
      }
      localObject4 = ((Iterator)localObject6).next();
      localObject4 = (th)localObject4;
      localObject4 = ((th)localObject4).a();
      ((ArrayList)localObject5).add(localObject4);
    }
    localObject4 = "ads";
    localBundle.putParcelableArrayList((String)localObject4, (ArrayList)localObject5);
    localObject4 = d;
    paramtl.a((HashSet)localObject4);
    localObject4 = d;
    ((HashSet)localObject4).clear();
    return localBundle;
  }
  
  public final hi a(Context paramContext)
  {
    hg localhg = null;
    Object localObject1 = ke.W;
    ??? = w.q();
    localObject1 = (Boolean)((kd)???).a((jz)localObject1);
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (!bool1)
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (hi)localObject1;
      int i1 = Build.VERSION.SDK_INT;
      localObject1 = ke.ae;
      ??? = w.q();
      localObject1 = (Boolean)((kd)???).a((jz)localObject1);
      boolean bool2 = ((Boolean)localObject1).booleanValue();
      if (!bool2)
      {
        localObject1 = ke.ac;
        ??? = w.q();
        localObject1 = (Boolean)((kd)???).a((jz)localObject1);
        bool2 = ((Boolean)localObject1).booleanValue();
        if (!bool2)
        {
          bool2 = false;
          localObject1 = null;
          continue;
        }
      }
      bool2 = a();
      if (bool2)
      {
        bool2 = b();
        if (bool2)
        {
          bool2 = false;
          localObject1 = null;
          continue;
        }
      }
      synchronized (a)
      {
        localObject1 = Looper.getMainLooper();
        if ((localObject1 == null) || (paramContext == null))
        {
          bool2 = false;
          localObject1 = null;
          continue;
        }
        localObject1 = v;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/b/hg;
          ((hg)localObject1).<init>();
          v = ((hg)localObject1);
        }
        localObject1 = u;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/b/hi;
          localhg = v;
          Object localObject4 = p;
          un localun = q;
          localObject4 = qg.a((Context)localObject4, localun);
          ((hi)localObject1).<init>(localhg, (qh)localObject4);
          u = ((hi)localObject1);
        }
        localObject1 = u;
        ((hi)localObject1).a();
        localObject1 = u;
      }
    }
  }
  
  public final Future a(long paramLong)
  {
    synchronized (a)
    {
      E = paramLong;
      Object localObject2 = p;
      tr.4 local4 = new com/google/android/gms/b/tr$4;
      local4.<init>((Context)localObject2, paramLong);
      localObject2 = local4.c();
      localObject2 = (Future)localObject2;
      return (Future)localObject2;
    }
  }
  
  /* Error */
  public final Future a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: invokestatic 295	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   3: astore_3
    //   4: aload_3
    //   5: invokeinterface 300 1 0
    //   10: lstore 4
    //   12: aload_0
    //   13: lload 4
    //   15: putfield 115	com/google/android/gms/b/tj:C	J
    //   18: aload_0
    //   19: getfield 64	com/google/android/gms/b/tj:a	Ljava/lang/Object;
    //   22: astore 6
    //   24: aload 6
    //   26: monitorenter
    //   27: aload_2
    //   28: ifnull +58 -> 86
    //   31: aload_0
    //   32: getfield 113	com/google/android/gms/b/tj:B	Ljava/lang/String;
    //   35: astore_3
    //   36: aload_2
    //   37: aload_3
    //   38: invokevirtual 303	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   41: istore 7
    //   43: iload 7
    //   45: ifne +41 -> 86
    //   48: aload_0
    //   49: aload_2
    //   50: putfield 113	com/google/android/gms/b/tj:B	Ljava/lang/String;
    //   53: aload_0
    //   54: getfield 115	com/google/android/gms/b/tj:C	J
    //   57: lstore 8
    //   59: new 305	com/google/android/gms/b/tr$14
    //   62: astore_3
    //   63: aload_3
    //   64: aload_1
    //   65: aload_2
    //   66: lload 8
    //   68: invokespecial 308	com/google/android/gms/b/tr$14:<init>	(Landroid/content/Context;Ljava/lang/String;J)V
    //   71: aload_3
    //   72: invokevirtual 154	com/google/android/gms/b/to:c	()Ljava/lang/Object;
    //   75: astore_3
    //   76: aload_3
    //   77: checkcast 156	java/util/concurrent/Future
    //   80: astore_3
    //   81: aload 6
    //   83: monitorexit
    //   84: aload_3
    //   85: areturn
    //   86: iconst_0
    //   87: istore 7
    //   89: aconst_null
    //   90: astore_3
    //   91: aload 6
    //   93: monitorexit
    //   94: goto -10 -> 84
    //   97: astore_3
    //   98: aload 6
    //   100: monitorexit
    //   101: aload_3
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	tj
    //   0	103	1	paramContext	Context
    //   0	103	2	paramString	String
    //   3	88	3	localObject1	Object
    //   97	5	3	localObject2	Object
    //   10	4	4	l1	long
    //   22	77	6	localObject3	Object
    //   41	47	7	bool	boolean
    //   57	10	8	l2	long
    // Exception table:
    //   from	to	target	type
    //   31	35	97	finally
    //   37	41	97	finally
    //   49	53	97	finally
    //   53	57	97	finally
    //   59	62	97	finally
    //   66	71	97	finally
    //   71	75	97	finally
    //   76	80	97	finally
    //   81	84	97	finally
    //   91	94	97	finally
    //   98	101	97	finally
  }
  
  public final Future a(Context paramContext, boolean paramBoolean)
  {
    synchronized (a)
    {
      boolean bool = m;
      if (paramBoolean != bool)
      {
        m = paramBoolean;
        localObject2 = new com/google/android/gms/b/tr$1;
        ((tr.1)localObject2).<init>(paramContext, paramBoolean);
        localObject2 = ((to)localObject2).c();
        localObject2 = (Future)localObject2;
        return (Future)localObject2;
      }
      bool = false;
      Object localObject2 = null;
    }
  }
  
  /* Error */
  public final Future a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	com/google/android/gms/b/tj:a	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_1
    //   8: ifnull +57 -> 65
    //   11: aload_0
    //   12: getfield 315	com/google/android/gms/b/tj:w	Ljava/lang/String;
    //   15: astore_3
    //   16: aload_1
    //   17: aload_3
    //   18: invokevirtual 303	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   21: istore 4
    //   23: iload 4
    //   25: ifne +40 -> 65
    //   28: aload_0
    //   29: aload_1
    //   30: putfield 315	com/google/android/gms/b/tj:w	Ljava/lang/String;
    //   33: aload_0
    //   34: getfield 144	com/google/android/gms/b/tj:p	Landroid/content/Context;
    //   37: astore_3
    //   38: new 317	com/google/android/gms/b/tr$9
    //   41: astore 5
    //   43: aload 5
    //   45: aload_3
    //   46: aload_1
    //   47: invokespecial 320	com/google/android/gms/b/tr$9:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   50: aload 5
    //   52: invokevirtual 154	com/google/android/gms/b/to:c	()Ljava/lang/Object;
    //   55: astore_3
    //   56: aload_3
    //   57: checkcast 156	java/util/concurrent/Future
    //   60: astore_3
    //   61: aload_2
    //   62: monitorexit
    //   63: aload_3
    //   64: areturn
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: monitorexit
    //   72: goto -9 -> 63
    //   75: astore_3
    //   76: aload_2
    //   77: monitorexit
    //   78: aload_3
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	tj
    //   0	80	1	paramString	String
    //   4	73	2	localObject1	Object
    //   15	55	3	localObject2	Object
    //   75	4	3	localObject3	Object
    //   21	46	4	bool	boolean
    //   41	10	5	local9	tr.9
    // Exception table:
    //   from	to	target	type
    //   11	15	75	finally
    //   17	21	75	finally
    //   29	33	75	finally
    //   33	37	75	finally
    //   38	41	75	finally
    //   46	50	75	finally
    //   50	55	75	finally
    //   56	60	75	finally
    //   61	63	75	finally
    //   70	72	75	finally
    //   76	78	75	finally
  }
  
  public final void a(Context paramContext, un paramun)
  {
    boolean bool1 = true;
    for (;;)
    {
      synchronized (a)
      {
        boolean bool2 = o;
        if (!bool2)
        {
          localObject2 = paramContext.getApplicationContext();
          p = ((Context)localObject2);
          q = paramun;
          localObject2 = w.h();
          ((hh)localObject2).a(this);
          localObject2 = new com/google/android/gms/b/tr$2;
          ((tr.2)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = new com/google/android/gms/b/tr$6;
          ((tr.6)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = new com/google/android/gms/b/tr$8;
          ((tr.8)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = new com/google/android/gms/b/tr$10;
          ((tr.10)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = new com/google/android/gms/b/tr$13;
          ((tr.13)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = new com/google/android/gms/b/tr$15;
          ((tr.15)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = new com/google/android/gms/b/tr$17;
          ((tr.17)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = new com/google/android/gms/b/tr$3;
          ((tr.3)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = new com/google/android/gms/b/tr$5;
          ((tr.5)localObject2).<init>(paramContext, this);
          ((to)localObject2).c();
          localObject2 = p;
          localObject3 = q;
          qg.a((Context)localObject2, (un)localObject3);
          localObject2 = w.e();
          localObject3 = a;
          localObject2 = ((tt)localObject2).a(paramContext, (String)localObject3);
          y = ((String)localObject2);
          int i1 = Build.VERSION.SDK_INT;
          int i2 = 23;
          if (i1 < i2) {
            continue;
          }
          if (bool1)
          {
            localObject4 = NetworkSecurityPolicy.getInstance();
            bool1 = ((NetworkSecurityPolicy)localObject4).isCleartextTrafficPermitted();
            if (!bool1)
            {
              bool1 = true;
              z = bool1;
            }
          }
          localObject4 = new com/google/android/gms/b/gv;
          localObject2 = paramContext.getApplicationContext();
          localObject3 = q;
          localObject7 = w.e();
          localObject7 = ((tt)localObject7).a(paramContext, paramun);
          ((gv)localObject4).<init>((Context)localObject2, (un)localObject3, (nj)localObject7);
          c = ((gv)localObject4);
          localObject2 = new com/google/android/gms/b/kf;
          localObject4 = p;
          localObject3 = q;
          localObject3 = a;
          ((kf)localObject2).<init>((Context)localObject4, (String)localObject3);
        }
        try
        {
          w.l();
          bool1 = a;
          if (bool1) {
            continue;
          }
          localObject4 = "CsiReporterFactory: CSI is not enabled. No CSI reporter created.";
          tp.a((String)localObject4);
          bool1 = false;
          localObject4 = null;
          r = ((kg)localObject4);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          localObject2 = "Cannot initialize CSI reporter.";
          tp.c((String)localObject2, localIllegalArgumentException);
          continue;
        }
        w.s();
        Object localObject4 = p;
        localObject2 = new com/google/android/gms/ads/internal/purchase/i$1;
        ((i.1)localObject2).<init>((Context)localObject4);
        tt.b((Runnable)localObject2);
        bool1 = true;
        o = bool1;
        return;
        bool1 = false;
        localObject4 = null;
        continue;
        localObject4 = d;
        if (localObject4 == null)
        {
          localObject4 = new java/lang/IllegalArgumentException;
          localObject2 = "Context can't be null. Please set up context in CsiConfiguration.";
          ((IllegalArgumentException)localObject4).<init>((String)localObject2);
          throw ((Throwable)localObject4);
        }
      }
      Object localObject6 = e;
      bool1 = TextUtils.isEmpty((CharSequence)localObject6);
      if (bool1)
      {
        localObject6 = new java/lang/IllegalArgumentException;
        localObject2 = "AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.";
        ((IllegalArgumentException)localObject6).<init>((String)localObject2);
        throw ((Throwable)localObject6);
      }
      localObject6 = new com/google/android/gms/b/kg;
      Object localObject3 = d;
      Object localObject7 = e;
      String str = b;
      Object localObject2 = c;
      ((kg)localObject6).<init>((Context)localObject3, (String)localObject7, str, (Map)localObject2);
    }
  }
  
  /* Error */
  public final void a(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	com/google/android/gms/b/tj:a	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: ldc_w 453
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 85	com/google/android/gms/b/tj:m	Z
    //   15: istore 4
    //   17: aload_1
    //   18: aload_3
    //   19: iload 4
    //   21: invokevirtual 457	android/os/Bundle:getBoolean	(Ljava/lang/String;Z)Z
    //   24: istore 5
    //   26: aload_0
    //   27: iload 5
    //   29: putfield 85	com/google/android/gms/b/tj:m	Z
    //   32: ldc_w 459
    //   35: astore_3
    //   36: aload_0
    //   37: getfield 87	com/google/android/gms/b/tj:n	I
    //   40: istore 4
    //   42: aload_1
    //   43: aload_3
    //   44: iload 4
    //   46: invokevirtual 463	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   49: istore 5
    //   51: aload_0
    //   52: iload 5
    //   54: putfield 87	com/google/android/gms/b/tj:n	I
    //   57: ldc_w 465
    //   60: astore_3
    //   61: aload_1
    //   62: aload_3
    //   63: invokevirtual 469	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   66: istore 5
    //   68: iload 5
    //   70: ifeq +20 -> 90
    //   73: ldc_w 465
    //   76: astore_3
    //   77: aload_1
    //   78: aload_3
    //   79: invokevirtual 471	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   82: istore 5
    //   84: aload_0
    //   85: iload 5
    //   87: invokevirtual 474	com/google/android/gms/b/tj:b	(Z)V
    //   90: ldc_w 476
    //   93: astore_3
    //   94: aload_1
    //   95: aload_3
    //   96: invokevirtual 469	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   99: istore 5
    //   101: iload 5
    //   103: ifeq +18 -> 121
    //   106: ldc_w 476
    //   109: astore_3
    //   110: aload_1
    //   111: aload_3
    //   112: invokevirtual 480	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   115: astore_3
    //   116: aload_0
    //   117: aload_3
    //   118: putfield 315	com/google/android/gms/b/tj:w	Ljava/lang/String;
    //   121: ldc_w 482
    //   124: astore_3
    //   125: aload_0
    //   126: getfield 107	com/google/android/gms/b/tj:A	Z
    //   129: istore 4
    //   131: aload_1
    //   132: aload_3
    //   133: iload 4
    //   135: invokevirtual 457	android/os/Bundle:getBoolean	(Ljava/lang/String;Z)Z
    //   138: istore 5
    //   140: aload_0
    //   141: iload 5
    //   143: putfield 107	com/google/android/gms/b/tj:A	Z
    //   146: ldc_w 484
    //   149: astore_3
    //   150: aload_1
    //   151: aload_3
    //   152: invokevirtual 469	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   155: istore 5
    //   157: iload 5
    //   159: ifeq +20 -> 179
    //   162: ldc_w 484
    //   165: astore_3
    //   166: aload_1
    //   167: aload_3
    //   168: invokevirtual 471	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   171: istore 5
    //   173: aload_0
    //   174: iload 5
    //   176: invokevirtual 486	com/google/android/gms/b/tj:c	(Z)V
    //   179: ldc_w 488
    //   182: astore_3
    //   183: aload_1
    //   184: aload_3
    //   185: invokevirtual 469	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   188: istore 5
    //   190: iload 5
    //   192: ifeq +18 -> 210
    //   195: ldc_w 488
    //   198: astore_3
    //   199: aload_1
    //   200: aload_3
    //   201: invokevirtual 480	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   204: astore_3
    //   205: aload_0
    //   206: aload_3
    //   207: putfield 490	com/google/android/gms/b/tj:x	Ljava/lang/String;
    //   210: ldc_w 492
    //   213: astore_3
    //   214: aload_1
    //   215: aload_3
    //   216: invokevirtual 469	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   219: istore 5
    //   221: iload 5
    //   223: ifeq +121 -> 344
    //   226: ldc_w 492
    //   229: astore_3
    //   230: aload_1
    //   231: aload_3
    //   232: invokevirtual 480	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   235: astore_3
    //   236: aload_0
    //   237: aload_3
    //   238: putfield 113	com/google/android/gms/b/tj:B	Ljava/lang/String;
    //   241: ldc_w 494
    //   244: astore_3
    //   245: aload_0
    //   246: getfield 115	com/google/android/gms/b/tj:C	J
    //   249: lstore 6
    //   251: aload_1
    //   252: aload_3
    //   253: lload 6
    //   255: invokevirtual 498	android/os/Bundle:getLong	(Ljava/lang/String;J)J
    //   258: lstore 6
    //   260: aload_0
    //   261: lload 6
    //   263: putfield 115	com/google/android/gms/b/tj:C	J
    //   266: ldc_w 500
    //   269: astore_3
    //   270: aload_0
    //   271: getfield 117	com/google/android/gms/b/tj:D	J
    //   274: lstore 6
    //   276: aload_1
    //   277: aload_3
    //   278: lload 6
    //   280: invokevirtual 498	android/os/Bundle:getLong	(Ljava/lang/String;J)J
    //   283: lstore 6
    //   285: aload_0
    //   286: lload 6
    //   288: putfield 117	com/google/android/gms/b/tj:D	J
    //   291: ldc_w 502
    //   294: astore_3
    //   295: aload_0
    //   296: getfield 121	com/google/android/gms/b/tj:F	I
    //   299: istore 4
    //   301: aload_1
    //   302: aload_3
    //   303: iload 4
    //   305: invokevirtual 463	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   308: istore 5
    //   310: aload_0
    //   311: iload 5
    //   313: putfield 121	com/google/android/gms/b/tj:F	I
    //   316: ldc_w 504
    //   319: astore_3
    //   320: aload_0
    //   321: getfield 119	com/google/android/gms/b/tj:E	J
    //   324: lstore 6
    //   326: aload_1
    //   327: aload_3
    //   328: lload 6
    //   330: invokevirtual 498	android/os/Bundle:getLong	(Ljava/lang/String;J)J
    //   333: lstore 6
    //   335: aload_0
    //   336: lload 6
    //   338: putfield 119	com/google/android/gms/b/tj:E	J
    //   341: aload_2
    //   342: monitorexit
    //   343: return
    //   344: aload_0
    //   345: getfield 113	com/google/android/gms/b/tj:B	Ljava/lang/String;
    //   348: astore_3
    //   349: goto -113 -> 236
    //   352: astore_3
    //   353: aload_2
    //   354: monitorexit
    //   355: aload_3
    //   356: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	357	0	this	tj
    //   0	357	1	paramBundle	Bundle
    //   4	350	2	localObject1	Object
    //   10	339	3	str	String
    //   352	4	3	localObject2	Object
    //   15	5	4	bool1	boolean
    //   40	5	4	i1	int
    //   129	5	4	bool2	boolean
    //   299	5	4	i2	int
    //   24	4	5	bool3	boolean
    //   49	4	5	i3	int
    //   66	156	5	bool4	boolean
    //   308	4	5	i4	int
    //   249	88	6	l1	long
    // Exception table:
    //   from	to	target	type
    //   11	15	352	finally
    //   19	24	352	finally
    //   27	32	352	finally
    //   36	40	352	finally
    //   44	49	352	finally
    //   52	57	352	finally
    //   62	66	352	finally
    //   78	82	352	finally
    //   85	90	352	finally
    //   95	99	352	finally
    //   111	115	352	finally
    //   117	121	352	finally
    //   125	129	352	finally
    //   133	138	352	finally
    //   141	146	352	finally
    //   151	155	352	finally
    //   167	171	352	finally
    //   174	179	352	finally
    //   184	188	352	finally
    //   200	204	352	finally
    //   206	210	352	finally
    //   215	219	352	finally
    //   231	235	352	finally
    //   237	241	352	finally
    //   245	249	352	finally
    //   253	258	352	finally
    //   261	266	352	finally
    //   270	274	352	finally
    //   278	283	352	finally
    //   286	291	352	finally
    //   295	299	352	finally
    //   303	308	352	finally
    //   311	316	352	finally
    //   320	324	352	finally
    //   328	333	352	finally
    //   336	341	352	finally
    //   341	343	352	finally
    //   344	348	352	finally
    //   353	355	352	finally
  }
  
  public final void a(th paramth)
  {
    synchronized (a)
    {
      HashSet localHashSet = d;
      localHashSet.add(paramth);
      return;
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString)
  {
    Context localContext = p;
    un localun = q;
    qg.a(localContext, localun).a(paramThrowable, paramString);
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject = w.k();
    long l1 = ((c)localObject).a();
    int i2;
    if (paramBoolean)
    {
      long l2 = D;
      l2 = l1 - l2;
      localObject = ke.aL;
      kd localkd = w.q();
      localObject = (Long)localkd.a((jz)localObject);
      l1 = ((Long)localObject).longValue();
      boolean bool = l2 < l1;
      if (bool)
      {
        localObject = j;
        i2 = -1;
        d = i2;
      }
    }
    for (;;)
    {
      return;
      localObject = j;
      i2 = F;
      d = i2;
      continue;
      b(l1);
      localObject = j;
      int i1 = d;
      a(i1);
    }
  }
  
  public final boolean a()
  {
    synchronized (a)
    {
      boolean bool = s;
      return bool;
    }
  }
  
  public final Future b(Context paramContext, boolean paramBoolean)
  {
    synchronized (a)
    {
      boolean bool = A;
      if (paramBoolean != bool)
      {
        A = paramBoolean;
        localObject2 = new com/google/android/gms/b/tr$12;
        ((tr.12)localObject2).<init>(paramContext, paramBoolean);
        localObject2 = ((to)localObject2).c();
        localObject2 = (Future)localObject2;
        return (Future)localObject2;
      }
      bool = false;
      Object localObject2 = null;
    }
  }
  
  /* Error */
  public final Future b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	com/google/android/gms/b/tj:a	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_1
    //   8: ifnull +57 -> 65
    //   11: aload_0
    //   12: getfield 490	com/google/android/gms/b/tj:x	Ljava/lang/String;
    //   15: astore_3
    //   16: aload_1
    //   17: aload_3
    //   18: invokevirtual 303	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   21: istore 4
    //   23: iload 4
    //   25: ifne +40 -> 65
    //   28: aload_0
    //   29: aload_1
    //   30: putfield 490	com/google/android/gms/b/tj:x	Ljava/lang/String;
    //   33: aload_0
    //   34: getfield 144	com/google/android/gms/b/tj:p	Landroid/content/Context;
    //   37: astore_3
    //   38: new 531	com/google/android/gms/b/tr$11
    //   41: astore 5
    //   43: aload 5
    //   45: aload_3
    //   46: aload_1
    //   47: invokespecial 532	com/google/android/gms/b/tr$11:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   50: aload 5
    //   52: invokevirtual 154	com/google/android/gms/b/to:c	()Ljava/lang/Object;
    //   55: astore_3
    //   56: aload_3
    //   57: checkcast 156	java/util/concurrent/Future
    //   60: astore_3
    //   61: aload_2
    //   62: monitorexit
    //   63: aload_3
    //   64: areturn
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: monitorexit
    //   72: goto -9 -> 63
    //   75: astore_3
    //   76: aload_2
    //   77: monitorexit
    //   78: aload_3
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	tj
    //   0	80	1	paramString	String
    //   4	73	2	localObject1	Object
    //   15	55	3	localObject2	Object
    //   75	4	3	localObject3	Object
    //   21	46	4	bool	boolean
    //   41	10	5	local11	tr.11
    // Exception table:
    //   from	to	target	type
    //   11	15	75	finally
    //   17	21	75	finally
    //   29	33	75	finally
    //   33	37	75	finally
    //   38	41	75	finally
    //   46	50	75	finally
    //   50	55	75	finally
    //   56	60	75	finally
    //   61	63	75	finally
    //   70	72	75	finally
    //   76	78	75	finally
  }
  
  public final void b(boolean paramBoolean)
  {
    synchronized (a)
    {
      boolean bool1 = s;
      if (bool1 != paramBoolean)
      {
        localObject2 = p;
        tr.a((Context)localObject2, paramBoolean);
      }
      s = paramBoolean;
      Object localObject2 = p;
      localObject2 = a((Context)localObject2);
      if (localObject2 != null)
      {
        boolean bool2 = ((hi)localObject2).isAlive();
        if (!bool2)
        {
          String str = "start fetching content...";
          tp.d(str);
          ((hi)localObject2).a();
        }
      }
      return;
    }
  }
  
  public final boolean b()
  {
    synchronized (a)
    {
      boolean bool = t;
      return bool;
    }
  }
  
  public final String c()
  {
    synchronized (a)
    {
      Object localObject2 = k;
      localObject2 = ((BigInteger)localObject2).toString();
      BigInteger localBigInteger1 = k;
      BigInteger localBigInteger2 = BigInteger.ONE;
      localBigInteger1 = localBigInteger1.add(localBigInteger2);
      k = localBigInteger1;
      return (String)localObject2;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    synchronized (a)
    {
      boolean bool1 = t;
      if (bool1 != paramBoolean)
      {
        localObject2 = p;
        tr.a((Context)localObject2, paramBoolean);
      }
      Object localObject2 = p;
      tr.a((Context)localObject2, paramBoolean);
      t = paramBoolean;
      localObject2 = p;
      localObject2 = a((Context)localObject2);
      if (localObject2 != null)
      {
        boolean bool2 = ((hi)localObject2).isAlive();
        if (!bool2)
        {
          String str = "start fetching content...";
          tp.d(str);
          ((hi)localObject2).a();
        }
      }
      return;
    }
  }
  
  public final tk d()
  {
    synchronized (a)
    {
      tk localtk = j;
      return localtk;
    }
  }
  
  public final kg e()
  {
    synchronized (a)
    {
      kg localkg = r;
      return localkg;
    }
  }
  
  public final boolean f()
  {
    synchronized (a)
    {
      boolean bool1 = l;
      boolean bool2 = true;
      l = bool2;
      return bool1;
    }
  }
  
  public final boolean g()
  {
    synchronized (a)
    {
      boolean bool = m;
      if (!bool)
      {
        bool = z;
        if (!bool) {}
      }
      else
      {
        bool = true;
        return bool;
      }
      bool = false;
      Object localObject2 = null;
    }
  }
  
  public final String h()
  {
    synchronized (a)
    {
      String str = y;
      return str;
    }
  }
  
  public final String i()
  {
    synchronized (a)
    {
      String str = w;
      return str;
    }
  }
  
  public final String j()
  {
    synchronized (a)
    {
      String str = x;
      return str;
    }
  }
  
  public final Boolean k()
  {
    synchronized (a)
    {
      Boolean localBoolean = f;
      return localBoolean;
    }
  }
  
  public final boolean l()
  {
    synchronized (a)
    {
      boolean bool = A;
      return bool;
    }
  }
  
  public final long m()
  {
    synchronized (a)
    {
      long l1 = D;
      return l1;
    }
  }
  
  public final long n()
  {
    synchronized (a)
    {
      long l1 = E;
      return l1;
    }
  }
  
  public final int o()
  {
    synchronized (a)
    {
      int i1 = F;
      return i1;
    }
  }
  
  public final ti p()
  {
    synchronized (a)
    {
      ti localti = new com/google/android/gms/b/ti;
      String str = B;
      long l1 = C;
      localti.<init>(str, l1);
      return localti;
    }
  }
  
  public final Resources q()
  {
    Resources localResources = null;
    Object localObject1 = q;
    boolean bool = d;
    if (bool) {
      localResources = p.getResources();
    }
    for (;;)
    {
      return localResources;
      try
      {
        localObject1 = p;
        localObject2 = DynamiteModule.a;
        String str = "com.google.android.gms.ads.dynamite";
        localObject1 = DynamiteModule.a((Context)localObject1, (DynamiteModule.b)localObject2, str);
        if (localObject1 != null)
        {
          localObject1 = f;
          localResources = ((Context)localObject1).getResources();
        }
      }
      catch (DynamiteModule.a locala)
      {
        Object localObject2 = "Cannot load resource from dynamite apk or local jar";
        tp.c((String)localObject2, locala);
      }
    }
  }
  
  public final boolean r()
  {
    synchronized (a)
    {
      boolean bool = g;
      return bool;
    }
  }
  
  public final void s()
  {
    i.incrementAndGet();
  }
}


/* Location:              com/google/android/gms/b/tj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */