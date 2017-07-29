package com.google.android.gms.b;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.o;
import com.google.android.gms.common.p;
import com.google.android.gms.common.util.m;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class dd
  extends cq.a
{
  private final dc a;
  private Boolean b;
  private String c;
  
  public dd(dc paramdc)
  {
    this(paramdc, (byte)0);
  }
  
  private dd(dc paramdc, byte paramByte)
  {
    com.google.android.gms.common.internal.c.a(paramdc);
    a = paramdc;
    c = null;
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    if (TextUtils.isEmpty(paramString))
    {
      a.e().a.a("Measurement Service called without app package");
      throw new SecurityException("Measurement Service called without app package");
    }
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        if (b == null)
        {
          if (("com.google.android.gms".equals(c)) || (m.a(a.a, Binder.getCallingUid()))) {
            break label216;
          }
          p localp = p.a(a.a);
          a.a.getPackageManager();
          paramBoolean = bool;
          if (localp.a(Binder.getCallingUid())) {
            break label216;
          }
          b = Boolean.valueOf(paramBoolean);
        }
        if (!b.booleanValue())
        {
          if ((c == null) && (o.a(a.a, Binder.getCallingUid(), paramString))) {
            c = paramString;
          }
          if (!paramString.equals(c)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[] { paramString }));
          }
        }
      }
      catch (SecurityException localSecurityException)
      {
        a.e().a.a("Measurement Service called with invalid calling package. appId", cu.a(paramString));
        throw localSecurityException;
      }
      return;
      label216:
      paramBoolean = true;
    }
  }
  
  private void d(ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramca);
    a(a, false);
    a.i().f(b);
  }
  
  /* Error */
  public final List<do> a(final ca paramca, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 188	com/google/android/gms/b/dd:d	(Lcom/google/android/gms/b/ca;)V
    //   5: aload_0
    //   6: getfield 60	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   9: invokevirtual 191	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   12: new 34	com/google/android/gms/b/dd$7
    //   15: dup
    //   16: aload_0
    //   17: aload_1
    //   18: invokespecial 194	com/google/android/gms/b/dd$7:<init>	(Lcom/google/android/gms/b/dd;Lcom/google/android/gms/b/ca;)V
    //   21: invokevirtual 199	com/google/android/gms/b/db:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   24: astore_3
    //   25: aload_3
    //   26: invokeinterface 205 1 0
    //   31: checkcast 207	java/util/List
    //   34: astore 4
    //   36: new 209	java/util/ArrayList
    //   39: dup
    //   40: aload 4
    //   42: invokeinterface 212 1 0
    //   47: invokespecial 215	java/util/ArrayList:<init>	(I)V
    //   50: astore_3
    //   51: aload 4
    //   53: invokeinterface 219 1 0
    //   58: astore 4
    //   60: aload 4
    //   62: invokeinterface 224 1 0
    //   67: ifeq +75 -> 142
    //   70: aload 4
    //   72: invokeinterface 227 1 0
    //   77: checkcast 229	com/google/android/gms/b/dq
    //   80: astore 5
    //   82: iload_2
    //   83: ifne +14 -> 97
    //   86: aload 5
    //   88: getfield 230	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   91: invokestatic 232	com/google/android/gms/b/dr:i	(Ljava/lang/String;)Z
    //   94: ifne -34 -> 60
    //   97: aload_3
    //   98: new 234	com/google/android/gms/b/do
    //   101: dup
    //   102: aload 5
    //   104: invokespecial 237	com/google/android/gms/b/do:<init>	(Lcom/google/android/gms/b/dq;)V
    //   107: invokeinterface 240 2 0
    //   112: pop
    //   113: goto -53 -> 60
    //   116: astore_3
    //   117: aload_0
    //   118: getfield 60	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   121: invokevirtual 78	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   124: getfield 83	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   127: ldc -14
    //   129: aload_1
    //   130: getfield 167	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   133: invokestatic 158	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   136: aload_3
    //   137: invokevirtual 245	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   140: aconst_null
    //   141: areturn
    //   142: aload_3
    //   143: areturn
    //   144: astore_3
    //   145: goto -28 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	dd
    //   0	148	1	paramca	ca
    //   0	148	2	paramBoolean	boolean
    //   24	74	3	localObject1	Object
    //   116	27	3	localInterruptedException	InterruptedException
    //   144	1	3	localExecutionException	ExecutionException
    //   34	37	4	localObject2	Object
    //   80	23	5	localdq	dq
    // Exception table:
    //   from	to	target	type
    //   25	60	116	java/lang/InterruptedException
    //   60	82	116	java/lang/InterruptedException
    //   86	97	116	java/lang/InterruptedException
    //   97	113	116	java/lang/InterruptedException
    //   25	60	144	java/util/concurrent/ExecutionException
    //   60	82	144	java/util/concurrent/ExecutionException
    //   86	97	144	java/util/concurrent/ExecutionException
    //   97	113	144	java/util/concurrent/ExecutionException
  }
  
  public final List<cd> a(final String paramString1, final String paramString2, final ca paramca)
  {
    d(paramca);
    paramString1 = a.f().a(new Callable() {});
    try
    {
      paramString1 = (List)paramString1.get();
      return paramString1;
    }
    catch (InterruptedException paramString1)
    {
      a.e().a.a("Failed to get conditional user properties", paramString1);
      return Collections.emptyList();
    }
    catch (ExecutionException paramString1)
    {
      for (;;) {}
    }
  }
  
  public final List<cd> a(final String paramString1, final String paramString2, final String paramString3)
  {
    a(paramString1, true);
    paramString1 = a.f().a(new Callable() {});
    try
    {
      paramString1 = (List)paramString1.get();
      return paramString1;
    }
    catch (InterruptedException paramString1)
    {
      a.e().a.a("Failed to get conditional user properties", paramString1);
      return Collections.emptyList();
    }
    catch (ExecutionException paramString1)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final List<do> a(final String paramString1, final String paramString2, final String paramString3, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: invokespecial 169	com/google/android/gms/b/dd:a	(Ljava/lang/String;Z)V
    //   6: aload_0
    //   7: getfield 60	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   10: invokevirtual 191	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   13: new 18	com/google/android/gms/b/dd$15
    //   16: dup
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: aload_3
    //   21: invokespecial 267	com/google/android/gms/b/dd$15:<init>	(Lcom/google/android/gms/b/dd;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   24: invokevirtual 199	com/google/android/gms/b/db:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   27: astore_2
    //   28: aload_2
    //   29: invokeinterface 205 1 0
    //   34: checkcast 207	java/util/List
    //   37: astore_3
    //   38: new 209	java/util/ArrayList
    //   41: dup
    //   42: aload_3
    //   43: invokeinterface 212 1 0
    //   48: invokespecial 215	java/util/ArrayList:<init>	(I)V
    //   51: astore_2
    //   52: aload_3
    //   53: invokeinterface 219 1 0
    //   58: astore_3
    //   59: aload_3
    //   60: invokeinterface 224 1 0
    //   65: ifeq +74 -> 139
    //   68: aload_3
    //   69: invokeinterface 227 1 0
    //   74: checkcast 229	com/google/android/gms/b/dq
    //   77: astore 5
    //   79: iload 4
    //   81: ifne +14 -> 95
    //   84: aload 5
    //   86: getfield 230	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   89: invokestatic 232	com/google/android/gms/b/dr:i	(Ljava/lang/String;)Z
    //   92: ifne -33 -> 59
    //   95: aload_2
    //   96: new 234	com/google/android/gms/b/do
    //   99: dup
    //   100: aload 5
    //   102: invokespecial 237	com/google/android/gms/b/do:<init>	(Lcom/google/android/gms/b/dq;)V
    //   105: invokeinterface 240 2 0
    //   110: pop
    //   111: goto -52 -> 59
    //   114: astore_2
    //   115: aload_0
    //   116: getfield 60	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   119: invokevirtual 78	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   122: getfield 83	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   125: ldc -14
    //   127: aload_1
    //   128: invokestatic 158	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   131: aload_2
    //   132: invokevirtual 245	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   135: invokestatic 259	java/util/Collections:emptyList	()Ljava/util/List;
    //   138: areturn
    //   139: aload_2
    //   140: areturn
    //   141: astore_2
    //   142: goto -27 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	dd
    //   0	145	1	paramString1	String
    //   0	145	2	paramString2	String
    //   0	145	3	paramString3	String
    //   0	145	4	paramBoolean	boolean
    //   77	24	5	localdq	dq
    // Exception table:
    //   from	to	target	type
    //   28	59	114	java/lang/InterruptedException
    //   59	79	114	java/lang/InterruptedException
    //   84	95	114	java/lang/InterruptedException
    //   95	111	114	java/lang/InterruptedException
    //   28	59	141	java/util/concurrent/ExecutionException
    //   59	79	141	java/util/concurrent/ExecutionException
    //   84	95	141	java/util/concurrent/ExecutionException
    //   95	111	141	java/util/concurrent/ExecutionException
  }
  
  /* Error */
  public final List<do> a(final String paramString1, final String paramString2, boolean paramBoolean, final ca paramca)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload 4
    //   3: invokespecial 188	com/google/android/gms/b/dd:d	(Lcom/google/android/gms/b/ca;)V
    //   6: aload_0
    //   7: getfield 60	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   10: invokevirtual 191	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   13: new 16	com/google/android/gms/b/dd$14
    //   16: dup
    //   17: aload_0
    //   18: aload 4
    //   20: aload_1
    //   21: aload_2
    //   22: invokespecial 270	com/google/android/gms/b/dd$14:<init>	(Lcom/google/android/gms/b/dd;Lcom/google/android/gms/b/ca;Ljava/lang/String;Ljava/lang/String;)V
    //   25: invokevirtual 199	com/google/android/gms/b/db:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 205 1 0
    //   35: checkcast 207	java/util/List
    //   38: astore_2
    //   39: new 209	java/util/ArrayList
    //   42: dup
    //   43: aload_2
    //   44: invokeinterface 212 1 0
    //   49: invokespecial 215	java/util/ArrayList:<init>	(I)V
    //   52: astore_1
    //   53: aload_2
    //   54: invokeinterface 219 1 0
    //   59: astore_2
    //   60: aload_2
    //   61: invokeinterface 224 1 0
    //   66: ifeq +77 -> 143
    //   69: aload_2
    //   70: invokeinterface 227 1 0
    //   75: checkcast 229	com/google/android/gms/b/dq
    //   78: astore 5
    //   80: iload_3
    //   81: ifne +14 -> 95
    //   84: aload 5
    //   86: getfield 230	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   89: invokestatic 232	com/google/android/gms/b/dr:i	(Ljava/lang/String;)Z
    //   92: ifne -32 -> 60
    //   95: aload_1
    //   96: new 234	com/google/android/gms/b/do
    //   99: dup
    //   100: aload 5
    //   102: invokespecial 237	com/google/android/gms/b/do:<init>	(Lcom/google/android/gms/b/dq;)V
    //   105: invokeinterface 240 2 0
    //   110: pop
    //   111: goto -51 -> 60
    //   114: astore_1
    //   115: aload_0
    //   116: getfield 60	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   119: invokevirtual 78	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   122: getfield 83	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   125: ldc -14
    //   127: aload 4
    //   129: getfield 167	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   132: invokestatic 158	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   135: aload_1
    //   136: invokevirtual 245	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   139: invokestatic 259	java/util/Collections:emptyList	()Ljava/util/List;
    //   142: areturn
    //   143: aload_1
    //   144: areturn
    //   145: astore_1
    //   146: goto -31 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	dd
    //   0	149	1	paramString1	String
    //   0	149	2	paramString2	String
    //   0	149	3	paramBoolean	boolean
    //   0	149	4	paramca	ca
    //   78	23	5	localdq	dq
    // Exception table:
    //   from	to	target	type
    //   29	60	114	java/lang/InterruptedException
    //   60	80	114	java/lang/InterruptedException
    //   84	95	114	java/lang/InterruptedException
    //   95	111	114	java/lang/InterruptedException
    //   29	60	145	java/util/concurrent/ExecutionException
    //   60	80	145	java/util/concurrent/ExecutionException
    //   84	95	145	java/util/concurrent/ExecutionException
    //   95	111	145	java/util/concurrent/ExecutionException
  }
  
  public final void a(final long paramLong, final String paramString1, final String paramString2, final String paramString3)
  {
    a.f().a(new Runnable()
    {
      public final void run()
      {
        if (paramString2 == null)
        {
          dd.a(dd.this).l().a(paramString3, null);
          return;
        }
        AppMeasurement.f localf = new AppMeasurement.f();
        b = paramString1;
        c = paramString2;
        d = paramLong;
        dd.a(dd.this).l().a(paramString3, localf);
      }
    });
  }
  
  public final void a(final ca paramca)
  {
    d(paramca);
    a.f().a(new Runnable()
    {
      public final void run()
      {
        dd.a(dd.this).v();
        dd.a(dd.this).a(paramca);
      }
    });
  }
  
  public final void a(cd paramcd)
  {
    com.google.android.gms.common.internal.c.a(paramcd);
    com.google.android.gms.common.internal.c.a(d);
    a(b, true);
    final cd localcd = new cd(paramcd);
    if (d.a() == null)
    {
      a.f().a(new Runnable()
      {
        public final void run()
        {
          dd.a(dd.this).v();
          dd.a(dd.this).b(localcd);
        }
      });
      return;
    }
    a.f().a(new Runnable()
    {
      public final void run()
      {
        dd.a(dd.this).v();
        dd.a(dd.this).a(localcd);
      }
    });
  }
  
  public final void a(cd paramcd, final ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramcd);
    com.google.android.gms.common.internal.c.a(d);
    d(paramca);
    final cd localcd = new cd(paramcd);
    b = a;
    if (d.a() == null)
    {
      a.f().a(new Runnable()
      {
        public final void run()
        {
          dd.a(dd.this).v();
          dd.a(dd.this).b(localcd, paramca);
        }
      });
      return;
    }
    a.f().a(new Runnable()
    {
      public final void run()
      {
        dd.a(dd.this).v();
        dd.a(dd.this).a(localcd, paramca);
      }
    });
  }
  
  public final void a(final cn paramcn, final ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramcn);
    d(paramca);
    a.f().a(new Runnable()
    {
      public final void run()
      {
        dd.a(dd.this).v();
        dd.a(dd.this).a(paramcn, paramca);
      }
    });
  }
  
  public final void a(final cn paramcn, final String paramString1, String paramString2)
  {
    com.google.android.gms.common.internal.c.a(paramcn);
    com.google.android.gms.common.internal.c.a(paramString1);
    a(paramString1, true);
    a.f().a(new Runnable()
    {
      public final void run()
      {
        dd.a(dd.this).v();
        dd.a(dd.this).a(paramcn, paramString1);
      }
    });
  }
  
  public final void a(final do paramdo, final ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramdo);
    d(paramca);
    if (paramdo.a() == null)
    {
      a.f().a(new Runnable()
      {
        public final void run()
        {
          dd.a(dd.this).v();
          dc localdc = dd.a(dd.this);
          do localdo = paramdo;
          ca localca = paramca;
          localdc.f().e();
          localdc.a();
          if (!TextUtils.isEmpty(b))
          {
            if (!h) {
              localdc.b(localca);
            }
          }
          else {
            return;
          }
          ef.a("Removing user property", b);
          localdc.j().x();
          try
          {
            localdc.b(localca);
            localdc.j().b(a, b);
            localdc.j().y();
            ef.a("User property removed", b);
            return;
          }
          finally
          {
            localdc.j().z();
          }
        }
      });
      return;
    }
    a.f().a(new Runnable()
    {
      public final void run()
      {
        dd.a(dd.this).v();
        dd.a(dd.this).a(paramdo, paramca);
      }
    });
  }
  
  public final byte[] a(final cn paramcn, final String paramString)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    com.google.android.gms.common.internal.c.a(paramcn);
    a(paramString, true);
    a.e().f.a("Log and bundle. event", a);
    long l1 = a.i.c() / 1000000L;
    Object localObject = a.f().b(new Callable() {});
    try
    {
      byte[] arrayOfByte = (byte[])((Future)localObject).get();
      localObject = arrayOfByte;
      if (arrayOfByte == null)
      {
        a.e().a.a("Log and bundle returned null. appId", cu.a(paramString));
        localObject = new byte[0];
      }
      long l2 = a.i.c() / 1000000L;
      a.e().f.a("Log and bundle processed. event, size, time_ms", a, Integer.valueOf(localObject.length), Long.valueOf(l2 - l1));
      return (byte[])localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      a.e().a.a("Failed to log and bundle. appId, event, error", cu.a(paramString), a, localInterruptedException);
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
  }
  
  public final void b(final ca paramca)
  {
    d(paramca);
    a.f().a(new Runnable()
    {
      public final void run()
      {
        dd.a(dd.this).v();
        dc localdc = dd.a(dd.this);
        ca localca = paramca;
        localdc.f().e();
        localdc.a();
        com.google.android.gms.common.internal.c.a(a);
        localdc.b(localca);
      }
    });
  }
  
  public final String c(ca paramca)
  {
    d(paramca);
    return a.a(a);
  }
}


/* Location:              com/google/android/gms/b/dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */