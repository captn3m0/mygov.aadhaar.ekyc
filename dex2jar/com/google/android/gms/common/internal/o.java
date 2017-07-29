package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
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
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Scope;
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

public abstract class o<T extends IInterface>
{
  public static final String[] h = { "service_esmobile", "service_googleme" };
  private long a;
  int b;
  long c;
  protected final Context d;
  final Handler e;
  protected f f;
  protected AtomicInteger g = new AtomicInteger(0);
  private int i;
  private long j;
  private final Looper k;
  private final w l;
  private final m m;
  private final Object n = new Object();
  private final Object o = new Object();
  private ad p;
  private T q;
  private final ArrayList<e<?>> r = new ArrayList();
  private h s;
  private int t = 1;
  private final b u;
  private final c v;
  private final int w;
  private final String x;
  
  protected o(Context paramContext, Looper paramLooper, int paramInt, b paramb, c paramc)
  {
    this(paramContext, paramLooper, w.a(paramContext), m.b(), paramInt, (b)c.a(paramb), (c)c.a(paramc), null);
  }
  
  protected o(Context paramContext, Looper paramLooper, w paramw, m paramm, int paramInt, b paramb, c paramc, String paramString)
  {
    d = ((Context)c.a(paramContext, "Context must not be null"));
    k = ((Looper)c.a(paramLooper, "Looper must not be null"));
    l = ((w)c.a(paramw, "Supervisor must not be null"));
    m = ((m)c.a(paramm, "API availability must not be null"));
    e = new d(paramLooper);
    w = paramInt;
    u = paramb;
    v = paramc;
    x = paramString;
  }
  
  private void a(int paramInt, T paramT)
  {
    boolean bool = true;
    int i1;
    int i2;
    if (paramInt == 3)
    {
      i1 = 1;
      if (paramT == null) {
        break label406;
      }
      i2 = 1;
      label17:
      if (i1 != i2) {
        break label412;
      }
    }
    for (;;)
    {
      c.b(bool);
      for (;;)
      {
        String str;
        h localh;
        synchronized (n)
        {
          t = paramInt;
          q = paramT;
          switch (paramInt)
          {
          case 2: 
            return;
            if (s != null)
            {
              paramT = String.valueOf(f());
              str = String.valueOf("com.google.android.gms");
              Log.e("GmsClient", String.valueOf(paramT).length() + 70 + String.valueOf(str).length() + "Calling connect() while still connected, missing disconnect() for " + paramT + " on " + str);
              paramT = l;
              str = f();
              localh = s;
              n();
              paramT.b(str, "com.google.android.gms", localh);
              g.incrementAndGet();
            }
            s = new h(g.get());
            paramT = l;
            str = f();
            localh = s;
            n();
            if (paramT.a(str, "com.google.android.gms", localh)) {
              continue;
            }
            paramT = String.valueOf(f());
            str = String.valueOf("com.google.android.gms");
            Log.e("GmsClient", String.valueOf(paramT).length() + 34 + String.valueOf(str).length() + "unable to connect to service: " + paramT + " on " + str);
            a(16, g.get());
          }
        }
        a = System.currentTimeMillis();
        continue;
        if (s != null)
        {
          paramT = l;
          str = f();
          localh = s;
          n();
          paramT.b(str, "com.google.android.gms", localh);
          s = null;
        }
      }
      i1 = 0;
      break;
      label406:
      i2 = 0;
      break label17;
      label412:
      bool = false;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (n)
    {
      if (t != paramInt1) {
        return false;
      }
      a(paramInt2, paramT);
      return true;
    }
  }
  
  private String n()
  {
    if (x == null) {
      return d.getClass().getName();
    }
    return x;
  }
  
  public abstract T a(IBinder paramIBinder);
  
  public final void a()
  {
    g.incrementAndGet();
    synchronized (r)
    {
      int i2 = r.size();
      int i1 = 0;
      while (i1 < i2)
      {
        ((e)r.get(i1)).d();
        i1 += 1;
      }
      r.clear();
    }
    synchronized (o)
    {
      p = null;
      a(1, null);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  protected final void a(int paramInt1, int paramInt2)
  {
    e.sendMessage(e.obtainMessage(5, paramInt2, -1, new k(paramInt1)));
  }
  
  protected final void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    e.sendMessage(e.obtainMessage(1, paramInt2, -1, new j(paramInt1, paramIBinder, paramBundle)));
  }
  
  protected final void a(a parama)
  {
    i = c;
    j = System.currentTimeMillis();
  }
  
  public final void a(f paramf)
  {
    f = ((f)c.a(paramf, "Connection progress callbacks cannot be null."));
    a(2, null);
  }
  
  /* Error */
  public final void a(z arg1, Set<Scope> paramSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 308	com/google/android/gms/common/internal/o:k	()Landroid/os/Bundle;
    //   4: astore 4
    //   6: new 310	com/google/android/gms/common/internal/s
    //   9: dup
    //   10: aload_0
    //   11: getfield 152	com/google/android/gms/common/internal/o:w	I
    //   14: invokespecial 311	com/google/android/gms/common/internal/s:<init>	(I)V
    //   17: astore_3
    //   18: aload_3
    //   19: aload_0
    //   20: getfield 131	com/google/android/gms/common/internal/o:d	Landroid/content/Context;
    //   23: invokevirtual 314	android/content/Context:getPackageName	()Ljava/lang/String;
    //   26: putfield 316	com/google/android/gms/common/internal/s:d	Ljava/lang/String;
    //   29: aload_3
    //   30: aload 4
    //   32: putfield 319	com/google/android/gms/common/internal/s:g	Landroid/os/Bundle;
    //   35: aload_2
    //   36: ifnull +25 -> 61
    //   39: aload_3
    //   40: aload_2
    //   41: aload_2
    //   42: invokeinterface 322 1 0
    //   47: anewarray 324	com/google/android/gms/common/api/Scope
    //   50: invokeinterface 328 2 0
    //   55: checkcast 330	[Lcom/google/android/gms/common/api/Scope;
    //   58: putfield 332	com/google/android/gms/common/internal/s:f	[Lcom/google/android/gms/common/api/Scope;
    //   61: aload_0
    //   62: invokevirtual 335	com/google/android/gms/common/internal/o:d	()Z
    //   65: ifeq +34 -> 99
    //   68: aload_0
    //   69: invokevirtual 339	com/google/android/gms/common/internal/o:e_	()Landroid/accounts/Account;
    //   72: ifnull +77 -> 149
    //   75: aload_0
    //   76: invokevirtual 339	com/google/android/gms/common/internal/o:e_	()Landroid/accounts/Account;
    //   79: astore_2
    //   80: aload_3
    //   81: aload_2
    //   82: putfield 342	com/google/android/gms/common/internal/s:h	Landroid/accounts/Account;
    //   85: aload_1
    //   86: ifnull +13 -> 99
    //   89: aload_3
    //   90: aload_1
    //   91: invokeinterface 348 1 0
    //   96: putfield 351	com/google/android/gms/common/internal/s:e	Landroid/os/IBinder;
    //   99: aload_3
    //   100: aload_0
    //   101: invokevirtual 354	com/google/android/gms/common/internal/o:j	()[Lcom/google/android/gms/common/k;
    //   104: putfield 357	com/google/android/gms/common/internal/s:i	[Lcom/google/android/gms/common/k;
    //   107: aload_0
    //   108: getfield 108	com/google/android/gms/common/internal/o:o	Ljava/lang/Object;
    //   111: astore_1
    //   112: aload_1
    //   113: monitorenter
    //   114: aload_0
    //   115: getfield 161	com/google/android/gms/common/internal/o:p	Lcom/google/android/gms/common/internal/ad;
    //   118: ifnull +48 -> 166
    //   121: aload_0
    //   122: getfield 161	com/google/android/gms/common/internal/o:p	Lcom/google/android/gms/common/internal/ad;
    //   125: new 25	com/google/android/gms/common/internal/o$g
    //   128: dup
    //   129: aload_0
    //   130: aload_0
    //   131: getfield 122	com/google/android/gms/common/internal/o:g	Ljava/util/concurrent/atomic/AtomicInteger;
    //   134: invokevirtual 215	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   137: invokespecial 358	com/google/android/gms/common/internal/o$g:<init>	(Lcom/google/android/gms/common/internal/o;I)V
    //   140: aload_3
    //   141: invokeinterface 363 3 0
    //   146: aload_1
    //   147: monitorexit
    //   148: return
    //   149: new 365	android/accounts/Account
    //   152: dup
    //   153: ldc_w 367
    //   156: ldc_w 369
    //   159: invokespecial 372	android/accounts/Account:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: astore_2
    //   163: goto -83 -> 80
    //   166: ldc -75
    //   168: ldc_w 374
    //   171: invokestatic 376	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: goto -29 -> 146
    //   178: astore_2
    //   179: aload_1
    //   180: monitorexit
    //   181: aload_2
    //   182: athrow
    //   183: astore_1
    //   184: ldc -75
    //   186: ldc_w 378
    //   189: aload_1
    //   190: invokestatic 381	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   193: pop
    //   194: aload_0
    //   195: getfield 150	com/google/android/gms/common/internal/o:e	Landroid/os/Handler;
    //   198: aload_0
    //   199: getfield 150	com/google/android/gms/common/internal/o:e	Landroid/os/Handler;
    //   202: iconst_4
    //   203: aload_0
    //   204: getfield 122	com/google/android/gms/common/internal/o:g	Ljava/util/concurrent/atomic/AtomicInteger;
    //   207: invokevirtual 215	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   210: iconst_1
    //   211: invokevirtual 384	android/os/Handler:obtainMessage	(III)Landroid/os/Message;
    //   214: invokevirtual 278	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   217: pop
    //   218: return
    //   219: astore_1
    //   220: aload_1
    //   221: athrow
    //   222: astore_1
    //   223: ldc -75
    //   225: ldc_w 378
    //   228: aload_1
    //   229: invokestatic 381	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   232: pop
    //   233: aload_0
    //   234: bipush 8
    //   236: aconst_null
    //   237: aconst_null
    //   238: aload_0
    //   239: getfield 122	com/google/android/gms/common/internal/o:g	Ljava/util/concurrent/atomic/AtomicInteger;
    //   242: invokevirtual 215	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   245: invokevirtual 386	com/google/android/gms/common/internal/o:a	(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    //   248: return
    //   249: astore_1
    //   250: goto -27 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	this	o
    //   0	253	2	paramSet	Set<Scope>
    //   17	124	3	locals	s
    //   4	27	4	localBundle	Bundle
    // Exception table:
    //   from	to	target	type
    //   114	146	178	finally
    //   146	148	178	finally
    //   166	175	178	finally
    //   179	181	178	finally
    //   107	114	183	android/os/DeadObjectException
    //   181	183	183	android/os/DeadObjectException
    //   107	114	219	java/lang/SecurityException
    //   181	183	219	java/lang/SecurityException
    //   107	114	222	android/os/RemoteException
    //   181	183	222	android/os/RemoteException
    //   107	114	249	java/lang/RuntimeException
    //   181	183	249	java/lang/RuntimeException
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    int i1;
    Object localObject1;
    synchronized (n)
    {
      i1 = t;
      localObject1 = q;
    }
    for (;;)
    {
      Object localObject3;
      synchronized (o)
      {
        localObject3 = p;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i1)
        {
        default: 
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (localObject1 != null) {
            break label531;
          }
          paramPrintWriter.append("null");
          paramPrintWriter.append(" mServiceBroker=");
          if (localObject3 != null) {
            break label565;
          }
          paramPrintWriter.println("null");
          localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
          long l1;
          if (a > 0L)
          {
            ??? = paramPrintWriter.append(paramString).append("lastConnectedTime=");
            l1 = a;
            localObject3 = String.valueOf(((SimpleDateFormat)localObject1).format(new Date(a)));
            ((PrintWriter)???).println(String.valueOf(localObject3).length() + 21 + l1 + " " + (String)localObject3);
          }
          if (c > 0L) {
            paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          }
          switch (b)
          {
          default: 
            paramPrintWriter.append(String.valueOf(b));
            ??? = paramPrintWriter.append(" lastSuspendedTime=");
            l1 = c;
            localObject3 = String.valueOf(((SimpleDateFormat)localObject1).format(new Date(c)));
            ((PrintWriter)???).println(String.valueOf(localObject3).length() + 21 + l1 + " " + (String)localObject3);
            if (j > 0L)
            {
              paramPrintWriter.append(paramString).append("lastFailedStatus=").append(b.a(i));
              paramString = paramPrintWriter.append(" lastFailedTime=");
              l1 = j;
              paramPrintWriter = String.valueOf(((SimpleDateFormat)localObject1).format(new Date(j)));
              paramString.println(String.valueOf(paramPrintWriter).length() + 21 + l1 + " " + paramPrintWriter);
            }
            return;
            paramString = finally;
            throw paramString;
          }
          break;
        }
      }
      paramPrintWriter.print("CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
      continue;
      label531:
      paramPrintWriter.append(g()).append("@").append(Integer.toHexString(System.identityHashCode(((IInterface)localObject1).asBinder())));
      continue;
      label565:
      paramPrintWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((ad)localObject3).asBinder())));
      continue;
      paramPrintWriter.append("CAUSE_SERVICE_DISCONNECTED");
      continue;
      paramPrintWriter.append("CAUSE_NETWORK_LOST");
    }
  }
  
  public final boolean b()
  {
    for (;;)
    {
      synchronized (n)
      {
        if (t == 3)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final boolean c()
  {
    for (;;)
    {
      synchronized (n)
      {
        if (t == 2)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean d()
  {
    return false;
  }
  
  public final Intent e()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  public Account e_()
  {
    return null;
  }
  
  public abstract String f();
  
  public final void f_()
  {
    int i1 = m.a(d);
    if (i1 != 0)
    {
      a(1, null);
      f = ((f)c.a(new i(), "Connection progress callbacks cannot be null."));
      e.sendMessage(e.obtainMessage(3, g.get(), i1, null));
      return;
    }
    a(new i());
  }
  
  public abstract String g();
  
  public k[] j()
  {
    return new k[0];
  }
  
  public Bundle k()
  {
    return new Bundle();
  }
  
  public final T l()
  {
    synchronized (n)
    {
      if (t == 4) {
        throw new DeadObjectException();
      }
    }
    if (!b()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
    if (q != null) {}
    for (boolean bool = true;; bool = false)
    {
      c.a(bool, "Client is connected but service is null");
      IInterface localIInterface = q;
      return localIInterface;
    }
  }
  
  protected Set<Scope> m()
  {
    return Collections.EMPTY_SET;
  }
  
  private abstract class a
    extends o.e<Boolean>
  {
    public final int a;
    public final Bundle b;
    
    protected a(int paramInt, Bundle paramBundle)
    {
      super(Boolean.valueOf(true));
      a = paramInt;
      b = paramBundle;
    }
    
    protected abstract void a(a parama);
    
    protected abstract boolean a();
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract void a(int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract void a(a parama);
  }
  
  final class d
    extends Handler
  {
    public d(Looper paramLooper)
    {
      super();
    }
    
    private static void a(Message paramMessage)
    {
      ((o.e)obj).c();
    }
    
    private static boolean b(Message paramMessage)
    {
      return (what == 2) || (what == 1) || (what == 5);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      Object localObject = null;
      if (g.get() != arg1)
      {
        if (b(paramMessage)) {
          a(paramMessage);
        }
        return;
      }
      if (((what == 1) || (what == 5)) && (!c()))
      {
        a(paramMessage);
        return;
      }
      if (what == 3)
      {
        if ((obj instanceof PendingIntent)) {
          localObject = (PendingIntent)obj;
        }
        paramMessage = new a(arg2, (PendingIntent)localObject);
        f.a(paramMessage);
        a(paramMessage);
        return;
      }
      if (what == 4)
      {
        o.a(o.this, 4);
        if (o.b(o.this) != null) {
          o.b(o.this).a(arg2);
        }
        localObject = o.this;
        b = arg2;
        c = System.currentTimeMillis();
        o.a(o.this, 4, 1, null);
        return;
      }
      if ((what == 2) && (!b()))
      {
        a(paramMessage);
        return;
      }
      if (b(paramMessage))
      {
        ((o.e)obj).b();
        return;
      }
      int i = what;
      Log.wtf("GmsClient", 45 + "Don't know how to handle message: " + i, new Exception());
    }
  }
  
  protected abstract class e<TListener>
  {
    private TListener a;
    private boolean b;
    
    public e()
    {
      Object localObject;
      a = localObject;
      b = false;
    }
    
    protected abstract void a(TListener paramTListener);
    
    /* Error */
    public final void b()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 24	com/google/android/gms/common/internal/o$e:a	Ljava/lang/Object;
      //   6: astore_1
      //   7: aload_0
      //   8: getfield 26	com/google/android/gms/common/internal/o$e:b	Z
      //   11: ifeq +48 -> 59
      //   14: aload_0
      //   15: invokestatic 38	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   18: astore_2
      //   19: ldc 40
      //   21: new 42	java/lang/StringBuilder
      //   24: dup
      //   25: aload_2
      //   26: invokestatic 38	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   29: invokevirtual 46	java/lang/String:length	()I
      //   32: bipush 47
      //   34: iadd
      //   35: invokespecial 49	java/lang/StringBuilder:<init>	(I)V
      //   38: ldc 51
      //   40: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   43: aload_2
      //   44: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   47: ldc 57
      //   49: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   52: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   55: invokestatic 67	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   58: pop
      //   59: aload_0
      //   60: monitorexit
      //   61: aload_1
      //   62: ifnull +8 -> 70
      //   65: aload_0
      //   66: aload_1
      //   67: invokevirtual 69	com/google/android/gms/common/internal/o$e:a	(Ljava/lang/Object;)V
      //   70: aload_0
      //   71: monitorenter
      //   72: aload_0
      //   73: iconst_1
      //   74: putfield 26	com/google/android/gms/common/internal/o$e:b	Z
      //   77: aload_0
      //   78: monitorexit
      //   79: aload_0
      //   80: invokevirtual 72	com/google/android/gms/common/internal/o$e:c	()V
      //   83: return
      //   84: astore_1
      //   85: aload_0
      //   86: monitorexit
      //   87: aload_1
      //   88: athrow
      //   89: astore_1
      //   90: aload_1
      //   91: athrow
      //   92: astore_1
      //   93: aload_0
      //   94: monitorexit
      //   95: aload_1
      //   96: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	97	0	this	e
      //   6	61	1	localObject1	Object
      //   84	4	1	localObject2	Object
      //   89	2	1	localRuntimeException	RuntimeException
      //   92	4	1	localObject3	Object
      //   18	26	2	str	String
      // Exception table:
      //   from	to	target	type
      //   2	59	84	finally
      //   59	61	84	finally
      //   85	87	84	finally
      //   65	70	89	java/lang/RuntimeException
      //   72	79	92	finally
      //   93	95	92	finally
    }
    
    public final void c()
    {
      d();
      synchronized (o.c(o.this))
      {
        o.c(o.this).remove(this);
        return;
      }
    }
    
    public final void d()
    {
      try
      {
        a = null;
        return;
      }
      finally {}
    }
  }
  
  public static abstract interface f
  {
    public abstract void a(a parama);
  }
  
  public static final class g
    extends ac.a
  {
    private o a;
    private final int b;
    
    public g(o paramo, int paramInt)
    {
      a = paramo;
      b = paramInt;
    }
    
    public final void a(int paramInt, Bundle paramBundle)
    {
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
    
    public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      c.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
      a.a(paramInt, paramIBinder, paramBundle, b);
      a = null;
    }
  }
  
  public final class h
    implements ServiceConnection
  {
    private final int b;
    
    public h(int paramInt)
    {
      b = paramInt;
    }
    
    public final void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
    {
      if (paramIBinder == null)
      {
        a(8, b);
        return;
      }
      synchronized (o.a(o.this))
      {
        o.a(o.this, ad.a.a(paramIBinder));
        a(0, b);
        return;
      }
    }
    
    public final void onServiceDisconnected(ComponentName arg1)
    {
      synchronized (o.a(o.this))
      {
        o.a(o.this, null);
        e.sendMessage(e.obtainMessage(4, b, 1));
        return;
      }
    }
  }
  
  protected final class i
    implements o.f
  {
    public i() {}
    
    public final void a(a parama)
    {
      if (parama.b()) {
        a(null, m());
      }
      while (o.d(o.this) == null) {
        return;
      }
      o.d(o.this).a(parama);
    }
  }
  
  protected final class j
    extends o.a
  {
    public final IBinder e;
    
    public j(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      super(paramInt, paramBundle);
      e = paramIBinder;
    }
    
    protected final void a(a parama)
    {
      if (o.d(o.this) != null) {
        o.d(o.this).a(parama);
      }
      o.this.a(parama);
    }
    
    protected final boolean a()
    {
      IInterface localIInterface;
      do
      {
        try
        {
          String str1 = e.getInterfaceDescriptor();
          if (!g().equals(str1))
          {
            String str2 = String.valueOf(g());
            Log.e("GmsClient", String.valueOf(str2).length() + 34 + String.valueOf(str1).length() + "service descriptor mismatch: " + str2 + " vs. " + str1);
            return false;
          }
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("GmsClient", "service probably died");
          return false;
        }
        localIInterface = a(e);
      } while ((localIInterface == null) || (!o.a(o.this, 2, 3, localIInterface)));
      if (o.b(o.this) != null) {
        o.b(o.this).a();
      }
      return true;
    }
  }
  
  protected final class k
    extends o.a
  {
    public k(int paramInt)
    {
      super(paramInt, null);
    }
    
    protected final void a(a parama)
    {
      f.a(parama);
      o.this.a(parama);
    }
    
    protected final boolean a()
    {
      f.a(a.a);
      return true;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */