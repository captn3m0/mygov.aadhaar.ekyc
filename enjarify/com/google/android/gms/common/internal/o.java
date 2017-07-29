package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.k;
import com.google.android.gms.common.m;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class o
{
  public static final String[] h;
  private long a;
  int b;
  long c;
  protected final Context d;
  final Handler e;
  protected o.f f;
  protected AtomicInteger g;
  private int i;
  private long j;
  private final Looper k;
  private final w l;
  private final m m;
  private final Object n;
  private final Object o;
  private ad p;
  private IInterface q;
  private final ArrayList r;
  private o.h s;
  private int t;
  private final o.b u;
  private final o.c v;
  private final int w;
  private final String x;
  
  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "service_esmobile";
    arrayOfString[1] = "service_googleme";
    h = arrayOfString;
  }
  
  protected o(Context paramContext, Looper paramLooper, int paramInt, o.b paramb, o.c paramc)
  {
    this(paramContext, paramLooper, localw, localm, paramInt, localb, localc, null);
  }
  
  protected o(Context paramContext, Looper paramLooper, w paramw, m paramm, int paramInt, o.b paramb, o.c paramc, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    n = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    o = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    r = ((ArrayList)localObject);
    t = 1;
    localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>(0);
    g = ((AtomicInteger)localObject);
    localObject = (Context)c.a(paramContext, "Context must not be null");
    d = ((Context)localObject);
    localObject = (Looper)c.a(paramLooper, "Looper must not be null");
    k = ((Looper)localObject);
    localObject = (w)c.a(paramw, "Supervisor must not be null");
    l = ((w)localObject);
    localObject = (m)c.a(paramm, "API availability must not be null");
    m = ((m)localObject);
    localObject = new com/google/android/gms/common/internal/o$d;
    ((o.d)localObject).<init>(this, paramLooper);
    e = ((Handler)localObject);
    w = paramInt;
    u = paramb;
    v = paramc;
    x = paramString;
  }
  
  private void a(int paramInt, IInterface paramIInterface)
  {
    int i1 = 1;
    ??? = null;
    int i3 = 3;
    int i4;
    if (paramInt == i3)
    {
      i4 = i1;
      if (paramIInterface == null) {
        break label93;
      }
      i3 = i1;
      label24:
      if (i4 != i3) {
        break label102;
      }
      c.b(i1);
    }
    for (;;)
    {
      String str;
      label93:
      Object localObject2;
      label102:
      Object localObject6;
      int i2;
      synchronized (n)
      {
        t = paramInt;
        q = paramIInterface;
        Object localObject3;
        switch (paramInt)
        {
        default: 
          return;
          i4 = 0;
          str = null;
          break;
          i3 = 0;
          localObject2 = null;
          break label24;
          i1 = 0;
          localObject3 = null;
          break;
        case 2: 
          localObject3 = s;
          if (localObject3 != null)
          {
            localObject3 = "GmsClient";
            localObject2 = f();
            localObject2 = String.valueOf(localObject2);
            str = "com.google.android.gms";
            str = String.valueOf(str);
            localObject6 = String.valueOf(localObject2);
            i5 = ((String)localObject6).length() + 70;
            localObject7 = String.valueOf(str);
            i6 = ((String)localObject7).length();
            i5 += i6;
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>(i5);
            localObject6 = "Calling connect() while still connected, missing disconnect() for ";
            localObject6 = ((StringBuilder)localObject7).append((String)localObject6);
            localObject2 = ((StringBuilder)localObject6).append((String)localObject2);
            localObject6 = " on ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
            localObject2 = ((StringBuilder)localObject2).append(str);
            localObject2 = ((StringBuilder)localObject2).toString();
            Log.e((String)localObject3, (String)localObject2);
            localObject3 = l;
            localObject2 = f();
            str = "com.google.android.gms";
            localObject6 = s;
            n();
            ((w)localObject3).b((String)localObject2, str, (ServiceConnection)localObject6);
            localObject3 = g;
            ((AtomicInteger)localObject3).incrementAndGet();
          }
          localObject3 = new com/google/android/gms/common/internal/o$h;
          localObject2 = g;
          i3 = ((AtomicInteger)localObject2).get();
          ((o.h)localObject3).<init>(this, i3);
          s = ((o.h)localObject3);
          localObject3 = l;
          localObject2 = f();
          str = "com.google.android.gms";
          localObject6 = s;
          n();
          i1 = ((w)localObject3).a((String)localObject2, str, (ServiceConnection)localObject6);
          if (i1 != 0) {
            continue;
          }
          localObject3 = "GmsClient";
          localObject2 = f();
          localObject2 = String.valueOf(localObject2);
          str = "com.google.android.gms";
          str = String.valueOf(str);
          localObject6 = String.valueOf(localObject2);
          int i5 = ((String)localObject6).length() + 34;
          Object localObject7 = String.valueOf(str);
          int i6 = ((String)localObject7).length();
          i5 += i6;
          localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>(i5);
          localObject6 = "unable to connect to service: ";
          localObject6 = ((StringBuilder)localObject7).append((String)localObject6);
          localObject2 = ((StringBuilder)localObject6).append((String)localObject2);
          localObject6 = " on ";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
          localObject2 = ((StringBuilder)localObject2).append(str);
          localObject2 = ((StringBuilder)localObject2).toString();
          Log.e((String)localObject3, (String)localObject2);
          i2 = 16;
          localObject2 = g;
          i3 = ((AtomicInteger)localObject2).get();
          a(i2, i3);
        }
      }
      long l1 = System.currentTimeMillis();
      a = l1;
      continue;
      Object localObject5 = s;
      if (localObject5 != null)
      {
        localObject5 = l;
        localObject2 = f();
        str = "com.google.android.gms";
        localObject6 = s;
        n();
        ((w)localObject5).b((String)localObject2, str, (ServiceConnection)localObject6);
        i2 = 0;
        localObject5 = null;
        s = null;
      }
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, IInterface paramIInterface)
  {
    synchronized (n)
    {
      int i1 = t;
      if (i1 != paramInt1)
      {
        i1 = 0;
        Object localObject2 = null;
        return i1;
      }
      a(paramInt2, paramIInterface);
      i1 = 1;
    }
  }
  
  private String n()
  {
    String str = x;
    if (str == null) {}
    for (str = d.getClass().getName();; str = x) {
      return str;
    }
  }
  
  public abstract IInterface a(IBinder paramIBinder);
  
  public final void a()
  {
    Object localObject1 = g;
    ((AtomicInteger)localObject1).incrementAndGet();
    synchronized (r)
    {
      localObject1 = r;
      int i1 = ((ArrayList)localObject1).size();
      int i2 = 0;
      localObject1 = null;
      int i3 = 0;
      localObject4 = null;
      while (i3 < i1)
      {
        localObject1 = r;
        localObject1 = ((ArrayList)localObject1).get(i3);
        localObject1 = (o.e)localObject1;
        ((o.e)localObject1).d();
        i2 = i3 + 1;
        i3 = i2;
      }
      localObject1 = r;
      ((ArrayList)localObject1).clear();
      localObject4 = o;
      i2 = 0;
      localObject1 = null;
    }
  }
  
  protected final void a(int paramInt1, int paramInt2)
  {
    Handler localHandler = e;
    Object localObject = e;
    o.k localk = new com/google/android/gms/common/internal/o$k;
    localk.<init>(this, paramInt1);
    localObject = ((Handler)localObject).obtainMessage(5, paramInt2, -1, localk);
    localHandler.sendMessage((Message)localObject);
  }
  
  protected final void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    Handler localHandler = e;
    Object localObject = e;
    o.j localj = new com/google/android/gms/common/internal/o$j;
    localj.<init>(this, paramInt1, paramIBinder, paramBundle);
    localObject = ((Handler)localObject).obtainMessage(1, paramInt2, -1, localj);
    localHandler.sendMessage((Message)localObject);
  }
  
  protected final void a(a parama)
  {
    int i1 = c;
    i = i1;
    long l1 = System.currentTimeMillis();
    j = l1;
  }
  
  public final void a(o.f paramf)
  {
    o.f localf = (o.f)c.a(paramf, "Connection progress callbacks cannot be null.");
    f = localf;
    a(2, null);
  }
  
  /* Error */
  public final void a(z paramz, Set paramSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 279	com/google/android/gms/common/internal/o:k	()Landroid/os/Bundle;
    //   4: astore_3
    //   5: new 281	com/google/android/gms/common/internal/s
    //   8: astore 4
    //   10: aload_0
    //   11: getfield 132	com/google/android/gms/common/internal/o:w	I
    //   14: istore 5
    //   16: aload 4
    //   18: iload 5
    //   20: invokespecial 282	com/google/android/gms/common/internal/s:<init>	(I)V
    //   23: aload_0
    //   24: getfield 109	com/google/android/gms/common/internal/o:d	Landroid/content/Context;
    //   27: invokevirtual 285	android/content/Context:getPackageName	()Ljava/lang/String;
    //   30: astore 6
    //   32: aload 4
    //   34: aload 6
    //   36: putfield 287	com/google/android/gms/common/internal/s:d	Ljava/lang/String;
    //   39: aload 4
    //   41: aload_3
    //   42: putfield 290	com/google/android/gms/common/internal/s:g	Landroid/os/Bundle;
    //   45: aload_2
    //   46: ifnull +34 -> 80
    //   49: aload_2
    //   50: invokeinterface 293 1 0
    //   55: istore 7
    //   57: iload 7
    //   59: anewarray 295	com/google/android/gms/common/api/Scope
    //   62: astore_3
    //   63: aload_2
    //   64: aload_3
    //   65: invokeinterface 299 2 0
    //   70: checkcast 301	[Lcom/google/android/gms/common/api/Scope;
    //   73: astore_3
    //   74: aload 4
    //   76: aload_3
    //   77: putfield 303	com/google/android/gms/common/internal/s:f	[Lcom/google/android/gms/common/api/Scope;
    //   80: aload_0
    //   81: invokevirtual 306	com/google/android/gms/common/internal/o:d	()Z
    //   84: istore 7
    //   86: iload 7
    //   88: ifeq +40 -> 128
    //   91: aload_0
    //   92: invokevirtual 310	com/google/android/gms/common/internal/o:e_	()Landroid/accounts/Account;
    //   95: astore_3
    //   96: aload_3
    //   97: ifnull +105 -> 202
    //   100: aload_0
    //   101: invokevirtual 310	com/google/android/gms/common/internal/o:e_	()Landroid/accounts/Account;
    //   104: astore_3
    //   105: aload 4
    //   107: aload_3
    //   108: putfield 313	com/google/android/gms/common/internal/s:h	Landroid/accounts/Account;
    //   111: aload_1
    //   112: ifnull +16 -> 128
    //   115: aload_1
    //   116: invokeinterface 319 1 0
    //   121: astore_3
    //   122: aload 4
    //   124: aload_3
    //   125: putfield 322	com/google/android/gms/common/internal/s:e	Landroid/os/IBinder;
    //   128: aload_0
    //   129: invokevirtual 325	com/google/android/gms/common/internal/o:j	()[Lcom/google/android/gms/common/k;
    //   132: astore_3
    //   133: aload 4
    //   135: aload_3
    //   136: putfield 328	com/google/android/gms/common/internal/s:i	[Lcom/google/android/gms/common/k;
    //   139: aload_0
    //   140: getfield 86	com/google/android/gms/common/internal/o:o	Ljava/lang/Object;
    //   143: astore 6
    //   145: aload 6
    //   147: monitorenter
    //   148: aload_0
    //   149: getfield 140	com/google/android/gms/common/internal/o:p	Lcom/google/android/gms/common/internal/ad;
    //   152: astore_3
    //   153: aload_3
    //   154: ifnull +73 -> 227
    //   157: aload_0
    //   158: getfield 140	com/google/android/gms/common/internal/o:p	Lcom/google/android/gms/common/internal/ad;
    //   161: astore_3
    //   162: new 330	com/google/android/gms/common/internal/o$g
    //   165: astore 8
    //   167: aload_0
    //   168: getfield 100	com/google/android/gms/common/internal/o:g	Ljava/util/concurrent/atomic/AtomicInteger;
    //   171: astore 9
    //   173: aload 9
    //   175: invokevirtual 195	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   178: istore 10
    //   180: aload 8
    //   182: aload_0
    //   183: iload 10
    //   185: invokespecial 331	com/google/android/gms/common/internal/o$g:<init>	(Lcom/google/android/gms/common/internal/o;I)V
    //   188: aload_3
    //   189: aload 8
    //   191: aload 4
    //   193: invokeinterface 336 3 0
    //   198: aload 6
    //   200: monitorexit
    //   201: return
    //   202: new 338	android/accounts/Account
    //   205: astore_3
    //   206: ldc_w 340
    //   209: astore 6
    //   211: ldc_w 342
    //   214: astore 8
    //   216: aload_3
    //   217: aload 6
    //   219: aload 8
    //   221: invokespecial 345	android/accounts/Account:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   224: goto -119 -> 105
    //   227: ldc -106
    //   229: astore_3
    //   230: ldc_w 347
    //   233: astore 4
    //   235: aload_3
    //   236: aload 4
    //   238: invokestatic 349	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   241: pop
    //   242: goto -44 -> 198
    //   245: astore_3
    //   246: aload 6
    //   248: monitorexit
    //   249: aload_3
    //   250: athrow
    //   251: astore_3
    //   252: ldc_w 351
    //   255: astore 6
    //   257: ldc -106
    //   259: aload 6
    //   261: aload_3
    //   262: invokestatic 354	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   265: pop
    //   266: aload_0
    //   267: getfield 130	com/google/android/gms/common/internal/o:e	Landroid/os/Handler;
    //   270: astore_3
    //   271: aload_0
    //   272: getfield 130	com/google/android/gms/common/internal/o:e	Landroid/os/Handler;
    //   275: astore 4
    //   277: iconst_4
    //   278: istore 5
    //   280: aload_0
    //   281: getfield 100	com/google/android/gms/common/internal/o:g	Ljava/util/concurrent/atomic/AtomicInteger;
    //   284: astore 8
    //   286: aload 8
    //   288: invokevirtual 195	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   291: istore 11
    //   293: iconst_1
    //   294: istore 10
    //   296: aload 4
    //   298: iload 5
    //   300: iload 11
    //   302: iload 10
    //   304: invokevirtual 358	android/os/Handler:obtainMessage	(III)Landroid/os/Message;
    //   307: astore 4
    //   309: aload_3
    //   310: aload 4
    //   312: invokevirtual 257	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   315: pop
    //   316: goto -115 -> 201
    //   319: athrow
    //   320: astore_3
    //   321: ldc_w 351
    //   324: astore 6
    //   326: ldc -106
    //   328: aload 6
    //   330: aload_3
    //   331: invokestatic 354	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   334: pop
    //   335: bipush 8
    //   337: istore 7
    //   339: aload_0
    //   340: getfield 100	com/google/android/gms/common/internal/o:g	Ljava/util/concurrent/atomic/AtomicInteger;
    //   343: astore 4
    //   345: aload 4
    //   347: invokevirtual 195	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   350: istore 12
    //   352: aload_0
    //   353: iload 7
    //   355: aconst_null
    //   356: aconst_null
    //   357: iload 12
    //   359: invokevirtual 362	com/google/android/gms/common/internal/o:a	(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    //   362: goto -161 -> 201
    //   365: astore_3
    //   366: goto -45 -> 321
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	369	0	this	o
    //   0	369	1	paramz	z
    //   0	369	2	paramSet	Set
    //   4	232	3	localObject1	Object
    //   245	5	3	localObject2	Object
    //   251	11	3	localDeadObjectException	DeadObjectException
    //   270	40	3	localHandler	Handler
    //   320	11	3	localRemoteException	android.os.RemoteException
    //   365	1	3	localRuntimeException	RuntimeException
    //   8	338	4	localObject3	Object
    //   14	285	5	i1	int
    //   55	3	7	i2	int
    //   84	3	7	bool	boolean
    //   337	17	7	i3	int
    //   165	122	8	localObject5	Object
    //   171	3	9	localAtomicInteger	AtomicInteger
    //   178	125	10	i4	int
    //   291	10	11	i5	int
    //   350	8	12	i6	int
    //   319	1	20	localSecurityException	SecurityException
    // Exception table:
    //   from	to	target	type
    //   148	152	245	finally
    //   157	161	245	finally
    //   162	165	245	finally
    //   167	171	245	finally
    //   173	178	245	finally
    //   183	188	245	finally
    //   191	198	245	finally
    //   198	201	245	finally
    //   236	242	245	finally
    //   246	249	245	finally
    //   139	143	251	android/os/DeadObjectException
    //   145	148	251	android/os/DeadObjectException
    //   249	251	251	android/os/DeadObjectException
    //   139	143	319	java/lang/SecurityException
    //   145	148	319	java/lang/SecurityException
    //   249	251	319	java/lang/SecurityException
    //   139	143	320	android/os/RemoteException
    //   145	148	320	android/os/RemoteException
    //   249	251	320	android/os/RemoteException
    //   139	143	365	java/lang/RuntimeException
    //   145	148	365	java/lang/RuntimeException
    //   249	251	365	java/lang/RuntimeException
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    long l1 = 0L;
    int i1;
    Object localObject2;
    synchronized (n)
    {
      i1 = t;
      localObject2 = q;
    }
    for (;;)
    {
      Object localObject3;
      synchronized (o)
      {
        localObject3 = p;
        ??? = paramPrintWriter.append(paramString);
        Object localObject4 = "mConnectState=";
        ((PrintWriter)???).append((CharSequence)localObject4);
        switch (i1)
        {
        default: 
          Object localObject5 = "UNKNOWN";
          paramPrintWriter.print((String)localObject5);
          localObject5 = " mService=";
          paramPrintWriter.append((CharSequence)localObject5);
          if (localObject2 != null) {
            break label760;
          }
          localObject5 = "null";
          paramPrintWriter.append((CharSequence)localObject5);
          localObject5 = " mServiceBroker=";
          paramPrintWriter.append((CharSequence)localObject5);
          if (localObject3 != null) {
            break label810;
          }
          localObject5 = "null";
          paramPrintWriter.println((String)localObject5);
          localObject5 = new java/text/SimpleDateFormat;
          ??? = "yyyy-MM-dd HH:mm:ss.SSS";
          localObject2 = Locale.US;
          ((SimpleDateFormat)localObject5).<init>((String)???, (Locale)localObject2);
          long l2 = a;
          boolean bool1 = l2 < l1;
          long l3;
          Object localObject9;
          int i4;
          StringBuilder localStringBuilder;
          if (bool1)
          {
            ??? = paramPrintWriter.append(paramString).append("lastConnectedTime=");
            l2 = a;
            localObject4 = new java/util/Date;
            l3 = a;
            ((Date)localObject4).<init>(l3);
            localObject4 = String.valueOf(((SimpleDateFormat)localObject5).format((Date)localObject4));
            localObject9 = String.valueOf(localObject4);
            i4 = ((String)localObject9).length() + 21;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i4);
            localObject2 = localStringBuilder.append(l2);
            localObject3 = " ";
            localObject2 = (String)localObject3 + (String)localObject4;
            ((PrintWriter)???).println((String)localObject2);
          }
          l2 = c;
          bool1 = l2 < l1;
          int i2;
          if (bool1)
          {
            ??? = paramPrintWriter.append(paramString);
            localObject2 = "lastSuspendedCause=";
            ((PrintWriter)???).append((CharSequence)localObject2);
            i2 = b;
          }
          switch (i2)
          {
          default: 
            i2 = b;
            ??? = String.valueOf(i2);
            paramPrintWriter.append((CharSequence)???);
            ??? = paramPrintWriter.append(" lastSuspendedTime=");
            l2 = c;
            localObject4 = new java/util/Date;
            l3 = c;
            ((Date)localObject4).<init>(l3);
            localObject4 = String.valueOf(((SimpleDateFormat)localObject5).format((Date)localObject4));
            localObject9 = String.valueOf(localObject4);
            i4 = ((String)localObject9).length() + 21;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i4);
            localObject2 = localStringBuilder.append(l2);
            localObject3 = " ";
            localObject2 = (String)localObject3 + (String)localObject4;
            ((PrintWriter)???).println((String)localObject2);
            l2 = j;
            boolean bool2 = l2 < l1;
            if (bool2)
            {
              ??? = paramPrintWriter.append(paramString).append("lastFailedStatus=");
              int i5 = i;
              localObject2 = b.a(i5);
              ((PrintWriter)???).append((CharSequence)localObject2);
              ??? = paramPrintWriter.append(" lastFailedTime=");
              l2 = j;
              localObject4 = new java/util/Date;
              l3 = j;
              ((Date)localObject4).<init>(l3);
              localObject5 = String.valueOf(((SimpleDateFormat)localObject5).format((Date)localObject4));
              localObject4 = String.valueOf(localObject5);
              int i6 = ((String)localObject4).length() + 21;
              localObject9 = new java/lang/StringBuilder;
              ((StringBuilder)localObject9).<init>(i6);
              localObject2 = ((StringBuilder)localObject9).append(l2);
              localObject3 = " ";
              localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
              localObject5 = (String)localObject5;
              ((PrintWriter)???).println((String)localObject5);
            }
            return;
            localObject6 = finally;
            throw ((Throwable)localObject6);
          }
          break;
        }
      }
      Object localObject8 = "CONNECTING";
      paramPrintWriter.print((String)localObject8);
      continue;
      localObject8 = "CONNECTED";
      paramPrintWriter.print((String)localObject8);
      continue;
      localObject8 = "DISCONNECTING";
      paramPrintWriter.print((String)localObject8);
      continue;
      localObject8 = "DISCONNECTED";
      paramPrintWriter.print((String)localObject8);
      continue;
      label760:
      localObject8 = g();
      localObject8 = paramPrintWriter.append((CharSequence)localObject8).append("@");
      int i3 = System.identityHashCode(((IInterface)localObject2).asBinder());
      ??? = Integer.toHexString(i3);
      ((PrintWriter)localObject8).append((CharSequence)???);
      continue;
      label810:
      localObject8 = paramPrintWriter.append("IGmsServiceBroker@");
      i3 = System.identityHashCode(((ad)localObject3).asBinder());
      ??? = Integer.toHexString(i3);
      ((PrintWriter)localObject8).println((String)???);
      continue;
      ??? = "CAUSE_SERVICE_DISCONNECTED";
      paramPrintWriter.append((CharSequence)???);
      continue;
      ??? = "CAUSE_NETWORK_LOST";
      paramPrintWriter.append((CharSequence)???);
    }
  }
  
  public final boolean b()
  {
    synchronized (n)
    {
      int i1 = t;
      int i3 = 3;
      if (i1 == i3)
      {
        i1 = 1;
        return i1;
      }
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public final boolean c()
  {
    synchronized (n)
    {
      int i1 = t;
      int i3 = 2;
      if (i1 == i3)
      {
        i1 = 1;
        return i1;
      }
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public boolean d()
  {
    return false;
  }
  
  public final Intent e()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Not a sign in API");
    throw localUnsupportedOperationException;
  }
  
  public Account e_()
  {
    return null;
  }
  
  public abstract String f();
  
  public final void f_()
  {
    Object localObject1 = m;
    Object localObject2 = d;
    int i1 = ((m)localObject1).a((Context)localObject2);
    if (i1 != 0)
    {
      int i2 = 1;
      a(i2, null);
      localObject1 = new com/google/android/gms/common/internal/o$i;
      ((o.i)localObject1).<init>(this);
      localObject1 = (o.f)c.a(localObject1, "Connection progress callbacks cannot be null.");
      f = ((o.f)localObject1);
      localObject1 = e;
      Handler localHandler = e;
      int i3 = 3;
      AtomicInteger localAtomicInteger = g;
      int i4 = localAtomicInteger.get();
      localObject2 = localHandler.obtainMessage(i3, i4, i1, null);
      ((Handler)localObject1).sendMessage((Message)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/common/internal/o$i;
      ((o.i)localObject1).<init>(this);
      a((o.f)localObject1);
    }
  }
  
  public abstract String g();
  
  public k[] j()
  {
    return new k[0];
  }
  
  public Bundle k()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
  
  public final IInterface l()
  {
    synchronized (n)
    {
      int i1 = t;
      int i2 = 4;
      if (i1 == i2)
      {
        DeadObjectException localDeadObjectException = new android/os/DeadObjectException;
        localDeadObjectException.<init>();
        throw localDeadObjectException;
      }
    }
    boolean bool = b();
    String str;
    if (!bool)
    {
      localObject3 = new java/lang/IllegalStateException;
      str = "Not connected. Call connect() and wait for onConnected() to be called.";
      ((IllegalStateException)localObject3).<init>(str);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = q;
    if (localObject3 != null) {
      bool = true;
    }
    for (;;)
    {
      str = "Client is connected but service is null";
      c.a(bool, str);
      localObject3 = q;
      return (IInterface)localObject3;
      bool = false;
      localObject3 = null;
    }
  }
  
  protected Set m()
  {
    return Collections.EMPTY_SET;
  }
}


/* Location:              com/google/android/gms/common/internal/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */