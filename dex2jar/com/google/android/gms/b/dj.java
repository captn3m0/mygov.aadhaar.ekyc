package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;
import com.google.android.gms.common.m;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class dj
  extends df
{
  final a a;
  cq b;
  private Boolean c;
  private final ch d;
  private final dm e;
  private final List<Runnable> f = new ArrayList();
  private final ch g;
  
  protected dj(dc paramdc)
  {
    super(paramdc);
    e = new dm(i);
    a = new a();
    d = new ch(paramdc)
    {
      public final void a()
      {
        dj.b(dj.this);
      }
    };
    g = new ch(paramdc)
    {
      public final void a()
      {
        u().c.a("Tasks have been queued for a long time");
      }
    };
  }
  
  private void C()
  {
    super.e();
    e.a();
    d.a(cf.S());
  }
  
  private void D()
  {
    super.e();
    ug.a("Processing queued up service tasks", Integer.valueOf(f.size()));
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext())
    {
      Runnable localRunnable = (Runnable)localIterator.next();
      super.t().a(localRunnable);
    }
    f.clear();
    g.c();
  }
  
  private void a(Runnable paramRunnable)
  {
    super.e();
    if (x())
    {
      paramRunnable.run();
      return;
    }
    if (f.size() >= cf.ad())
    {
      ua.a("Discarding data. Max runnable queue size reached");
      return;
    }
    f.add(paramRunnable);
    g.a(60000L);
    A();
  }
  
  final void A()
  {
    int i = 1;
    super.e();
    J();
    if (x()) {
      return;
    }
    if (c == null)
    {
      c = super.v().D();
      if (c == null)
      {
        ug.a("State of service unknown");
        super.e();
        J();
        cf.W();
        ug.a("Checking service availability");
        switch (m.b().a(super.n()))
        {
        }
      }
    }
    for (;;)
    {
      boolean bool = false;
      for (;;)
      {
        c = Boolean.valueOf(bool);
        super.v().a(c.booleanValue());
        if (!c.booleanValue()) {
          break label427;
        }
        ug.a("Using measurement service");
        localObject1 = a;
        c.e();
        Context localContext1 = c.n();
        try
        {
          if (!a) {
            break label352;
          }
          c.u().g.a("Connection attempt already in progress");
          return;
        }
        finally {}
        ug.a("Service available");
        bool = true;
        continue;
        ug.a("Service missing");
        break;
        uc.a("Service updating");
        bool = true;
        continue;
        uf.a("Service container out of date");
        bool = true;
      }
      uc.a("Service disabled");
      continue;
      uc.a("Service invalid");
    }
    label352:
    if (b != null)
    {
      c.u().g.a("Already awaiting connection attempt");
      return;
    }
    b = new ct(localContext2, Looper.getMainLooper(), (o.b)localObject1, (o.c)localObject1);
    c.u().g.a("Connecting to remote service");
    a = true;
    b.f_();
    return;
    label427:
    cf.W();
    Object localObject1 = super.n().getPackageManager().queryIntentServices(new Intent().setClassName(super.n(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
    if ((localObject1 != null) && (((List)localObject1).size() > 0)) {}
    while (i != 0)
    {
      ug.a("Using local app measurement service");
      localObject1 = new Intent("com.google.android.gms.measurement.START");
      Object localObject2 = super.n();
      cf.W();
      ((Intent)localObject1).setComponent(new ComponentName((Context)localObject2, "com.google.android.gms.measurement.AppMeasurementService"));
      localObject2 = a;
      c.e();
      Context localContext3 = c.n();
      com.google.android.gms.common.a.a.a();
      try
      {
        if (!a) {
          break label601;
        }
        c.u().g.a("Connection attempt already in progress");
        return;
      }
      finally {}
      i = 0;
      continue;
      label601:
      a = true;
      com.google.android.gms.common.a.a.b(localContext3, localIntent, c.a, 129);
      return;
    }
    ua.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
  }
  
  public final void B()
  {
    super.e();
    J();
    try
    {
      com.google.android.gms.common.a.a.a();
      com.google.android.gms.common.a.a.a(super.n(), a);
      b = null;
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  protected final void a() {}
  
  protected final void a(final cd paramcd)
  {
    c.a(paramcd);
    super.e();
    J();
    cf.W();
    if (super.o().a(paramcd)) {}
    for (final boolean bool = true;; bool = false)
    {
      a(new Runnable()
      {
        public final void run()
        {
          cq localcq = b;
          if (localcq == null)
          {
            u().a.a("Discarding data. Failed to send conditional user property to service");
            return;
          }
          Object localObject;
          if (a)
          {
            dj localdj = dj.this;
            if (bool)
            {
              localObject = null;
              localdj.a(localcq, (com.google.android.gms.common.internal.safeparcel.a)localObject);
            }
          }
          for (;;)
          {
            dj.c(dj.this);
            return;
            localObject = c;
            break;
            try
            {
              if (!TextUtils.isEmpty(paramcdb)) {
                break label137;
              }
              localcq.a(c, i().a(u().x()));
            }
            catch (RemoteException localRemoteException)
            {
              u().a.a("Failed to send conditional user property to the service", localRemoteException);
            }
            continue;
            label137:
            localcq.a(c);
          }
        }
      });
      return;
    }
  }
  
  protected final void a(final cn paramcn, final String paramString)
  {
    c.a(paramcn);
    super.e();
    J();
    int i = Build.VERSION.SDK_INT;
    cf.W();
    if (super.o().a(paramcn)) {}
    for (final boolean bool = true;; bool = false)
    {
      a(new Runnable()
      {
        public final void run()
        {
          cq localcq = b;
          if (localcq == null)
          {
            u().a.a("Discarding data. Failed to send event to service");
            return;
          }
          Object localObject;
          if (a)
          {
            dj localdj = dj.this;
            if (bool)
            {
              localObject = null;
              localdj.a(localcq, (com.google.android.gms.common.internal.safeparcel.a)localObject);
            }
          }
          for (;;)
          {
            dj.c(dj.this);
            return;
            localObject = paramcn;
            break;
            try
            {
              if (!TextUtils.isEmpty(paramString)) {
                break label134;
              }
              localcq.a(paramcn, i().a(u().x()));
            }
            catch (RemoteException localRemoteException)
            {
              u().a.a("Failed to send event to the service", localRemoteException);
            }
            continue;
            label134:
            localcq.a(paramcn, paramString, u().x());
          }
        }
      });
      return;
    }
  }
  
  protected final void a(cq paramcq)
  {
    super.e();
    c.a(paramcq);
    b = paramcq;
    C();
    D();
  }
  
  final void a(cq paramcq, com.google.android.gms.common.internal.safeparcel.a parama)
  {
    super.e();
    super.c();
    J();
    int i = Build.VERSION.SDK_INT;
    cf.W();
    ArrayList localArrayList = new ArrayList();
    cf.ah();
    int j = 0;
    i = 100;
    Object localObject;
    if ((j < 1001) && (i == 100))
    {
      localObject = super.o().x();
      if (localObject == null) {
        break label329;
      }
      localArrayList.addAll((Collection)localObject);
    }
    label329:
    for (i = ((List)localObject).size();; i = 0)
    {
      if ((parama != null) && (i < 100)) {
        localArrayList.add(parama);
      }
      localObject = localArrayList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.google.android.gms.common.internal.safeparcel.a locala = (com.google.android.gms.common.internal.safeparcel.a)((Iterator)localObject).next();
        if ((locala instanceof cn)) {
          try
          {
            paramcq.a((cn)locala, super.i().a(super.u().x()));
          }
          catch (RemoteException localRemoteException1)
          {
            ua.a("Failed to send event to the service", localRemoteException1);
          }
        } else if ((localRemoteException1 instanceof do)) {
          try
          {
            paramcq.a((do)localRemoteException1, super.i().a(super.u().x()));
          }
          catch (RemoteException localRemoteException2)
          {
            ua.a("Failed to send attribute to the service", localRemoteException2);
          }
        } else if ((localRemoteException2 instanceof cd)) {
          try
          {
            paramcq.a((cd)localRemoteException2, super.i().a(super.u().x()));
          }
          catch (RemoteException localRemoteException3)
          {
            ua.a("Failed to send conditional property to the service", localRemoteException3);
          }
        } else {
          ua.a("Discarding data. Unrecognized parcel type.");
        }
      }
      j += 1;
      break;
      return;
    }
  }
  
  protected final void a(final do paramdo)
  {
    super.e();
    J();
    int i = Build.VERSION.SDK_INT;
    cf.W();
    if (super.o().a(paramdo)) {}
    for (final boolean bool = true;; bool = false)
    {
      a(new Runnable()
      {
        public final void run()
        {
          cq localcq = b;
          if (localcq == null)
          {
            u().a.a("Discarding data. Failed to set user attribute");
            return;
          }
          dj localdj = dj.this;
          if (bool) {}
          for (Object localObject = null;; localObject = paramdo)
          {
            localdj.a(localcq, (com.google.android.gms.common.internal.safeparcel.a)localObject);
            dj.c(dj.this);
            return;
          }
        }
      });
      return;
    }
  }
  
  protected final void a(final AppMeasurement.f paramf)
  {
    super.e();
    J();
    a(new Runnable()
    {
      public final void run()
      {
        cq localcq = b;
        if (localcq == null)
        {
          u().a.a("Failed to send current screen to service");
          return;
        }
        for (;;)
        {
          try
          {
            if (paramf == null)
            {
              localcq.a(0L, null, null, n().getPackageName());
              dj.c(dj.this);
              return;
            }
          }
          catch (RemoteException localRemoteException)
          {
            u().a.a("Failed to send current screen to the service", localRemoteException);
            return;
          }
          localRemoteException.a(paramfd, paramfb, paramfc, n().getPackageName());
        }
      }
    });
  }
  
  public final void a(final AtomicReference<String> paramAtomicReference)
  {
    super.e();
    J();
    a(new Runnable()
    {
      public final void run()
      {
        localAtomicReference = paramAtomicReference;
        for (;;)
        {
          try
          {
            localcq = b;
            if (localcq == null) {
              u().a.a("Failed to get app instance id");
            }
          }
          catch (RemoteException localRemoteException)
          {
            cq localcq;
            u().a.a("Failed to get app instance id", localRemoteException);
            paramAtomicReference.notify();
            continue;
          }
          finally
          {
            paramAtomicReference.notify();
          }
          try
          {
            paramAtomicReference.notify();
            return;
          }
          finally {}
        }
        paramAtomicReference.set(localcq.c(i().a(null)));
        dj.c(dj.this);
        paramAtomicReference.notify();
      }
    });
  }
  
  protected final void a(final AtomicReference<List<cd>> paramAtomicReference, final String paramString1, final String paramString2, final String paramString3)
  {
    super.e();
    J();
    a(new Runnable()
    {
      public final void run()
      {
        AtomicReference localAtomicReference = paramAtomicReference;
        for (;;)
        {
          try
          {
            localcq = b;
            if (localcq == null)
            {
              u().a.a("Failed to get conditional properties", cu.a(paramString1), paramString2, paramString3);
              paramAtomicReference.set(Collections.emptyList());
            }
          }
          catch (RemoteException localRemoteException)
          {
            cq localcq;
            u().a.a("Failed to get conditional properties", cu.a(paramString1), paramString2, localRemoteException);
            paramAtomicReference.set(Collections.emptyList());
            paramAtomicReference.notify();
            continue;
          }
          finally
          {
            paramAtomicReference.notify();
          }
          try
          {
            paramAtomicReference.notify();
            return;
          }
          finally {}
        }
        if (TextUtils.isEmpty(paramString1)) {
          paramAtomicReference.set(localcq.a(paramString2, paramString3, i().a(u().x())));
        }
        for (;;)
        {
          dj.c(dj.this);
          paramAtomicReference.notify();
          return;
          paramAtomicReference.set(((cq)localObject1).a(paramString1, paramString2, paramString3));
        }
      }
    });
  }
  
  protected final void a(final AtomicReference<List<do>> paramAtomicReference, final String paramString1, final String paramString2, final String paramString3, final boolean paramBoolean)
  {
    super.e();
    J();
    a(new Runnable()
    {
      public final void run()
      {
        AtomicReference localAtomicReference = paramAtomicReference;
        for (;;)
        {
          try
          {
            localcq = b;
            if (localcq == null)
            {
              u().a.a("Failed to get user properties", cu.a(paramString1), paramString2, paramString3);
              paramAtomicReference.set(Collections.emptyList());
            }
          }
          catch (RemoteException localRemoteException)
          {
            cq localcq;
            u().a.a("Failed to get user properties", cu.a(paramString1), paramString2, localRemoteException);
            paramAtomicReference.set(Collections.emptyList());
            paramAtomicReference.notify();
            continue;
          }
          finally
          {
            paramAtomicReference.notify();
          }
          try
          {
            paramAtomicReference.notify();
            return;
          }
          finally {}
        }
        if (TextUtils.isEmpty(paramString1)) {
          paramAtomicReference.set(localcq.a(paramString2, paramString3, paramBoolean, i().a(u().x())));
        }
        for (;;)
        {
          dj.c(dj.this);
          paramAtomicReference.notify();
          return;
          paramAtomicReference.set(((cq)localObject1).a(paramString1, paramString2, paramString3, paramBoolean));
        }
      }
    });
  }
  
  protected final void a(final AtomicReference<List<do>> paramAtomicReference, final boolean paramBoolean)
  {
    super.e();
    J();
    a(new Runnable()
    {
      public final void run()
      {
        localAtomicReference = paramAtomicReference;
        for (;;)
        {
          try
          {
            localcq = b;
            if (localcq == null) {
              u().a.a("Failed to get user properties");
            }
          }
          catch (RemoteException localRemoteException)
          {
            cq localcq;
            u().a.a("Failed to get user properties", localRemoteException);
            paramAtomicReference.notify();
            continue;
          }
          finally
          {
            paramAtomicReference.notify();
          }
          try
          {
            paramAtomicReference.notify();
            return;
          }
          finally {}
        }
        paramAtomicReference.set(localcq.a(i().a(null), paramBoolean));
        dj.c(dj.this);
        paramAtomicReference.notify();
      }
    });
  }
  
  public final boolean x()
  {
    super.e();
    J();
    return b != null;
  }
  
  protected final void y()
  {
    super.e();
    J();
    a(new Runnable()
    {
      public final void run()
      {
        cq localcq = b;
        if (localcq == null)
        {
          u().a.a("Failed to send measurementEnabled to service");
          return;
        }
        try
        {
          localcq.b(i().a(u().x()));
          dj.c(dj.this);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          u().a.a("Failed to send measurementEnabled to the service", localRemoteException);
        }
      }
    });
  }
  
  protected final void z()
  {
    super.e();
    J();
    a(new Runnable()
    {
      public final void run()
      {
        cq localcq = b;
        if (localcq == null)
        {
          u().a.a("Discarding data. Failed to send app launch");
          return;
        }
        try
        {
          localcq.a(i().a(u().x()));
          a(localcq, null);
          dj.c(dj.this);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          u().a.a("Failed to send app launch to the service", localRemoteException);
        }
      }
    });
  }
  
  protected final class a
    implements ServiceConnection, o.b, o.c
  {
    volatile boolean a;
    volatile ct b;
    
    protected a() {}
    
    /* Error */
    public final void a()
    {
      // Byte code:
      //   0: ldc 45
      //   2: invokestatic 50	com/google/android/gms/common/internal/c:b	(Ljava/lang/String;)V
      //   5: aload_0
      //   6: monitorenter
      //   7: aload_0
      //   8: getfield 52	com/google/android/gms/b/dj$a:b	Lcom/google/android/gms/b/ct;
      //   11: invokevirtual 58	com/google/android/gms/b/ct:l	()Landroid/os/IInterface;
      //   14: checkcast 60	com/google/android/gms/b/cq
      //   17: astore_1
      //   18: aload_0
      //   19: aconst_null
      //   20: putfield 52	com/google/android/gms/b/dj$a:b	Lcom/google/android/gms/b/ct;
      //   23: aload_0
      //   24: getfield 32	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
      //   27: invokevirtual 64	com/google/android/gms/b/dj:t	()Lcom/google/android/gms/b/db;
      //   30: new 19	com/google/android/gms/b/dj$a$3
      //   33: dup
      //   34: aload_0
      //   35: aload_1
      //   36: invokespecial 67	com/google/android/gms/b/dj$a$3:<init>	(Lcom/google/android/gms/b/dj$a;Lcom/google/android/gms/b/cq;)V
      //   39: invokevirtual 72	com/google/android/gms/b/db:a	(Ljava/lang/Runnable;)V
      //   42: aload_0
      //   43: monitorexit
      //   44: return
      //   45: aload_0
      //   46: aconst_null
      //   47: putfield 52	com/google/android/gms/b/dj$a:b	Lcom/google/android/gms/b/ct;
      //   50: aload_0
      //   51: iconst_0
      //   52: putfield 39	com/google/android/gms/b/dj$a:a	Z
      //   55: goto -13 -> 42
      //   58: astore_1
      //   59: aload_0
      //   60: monitorexit
      //   61: aload_1
      //   62: athrow
      //   63: astore_1
      //   64: goto -19 -> 45
      //   67: astore_1
      //   68: goto -23 -> 45
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	71	0	this	a
      //   17	19	1	localcq	cq
      //   58	4	1	localObject	Object
      //   63	1	1	localDeadObjectException	android.os.DeadObjectException
      //   67	1	1	localIllegalStateException	IllegalStateException
      // Exception table:
      //   from	to	target	type
      //   7	42	58	finally
      //   42	44	58	finally
      //   45	55	58	finally
      //   59	61	58	finally
      //   7	42	63	android/os/DeadObjectException
      //   7	42	67	java/lang/IllegalStateException
    }
    
    public final void a(int paramInt)
    {
      c.b("MeasurementServiceConnection.onConnectionSuspended");
      u().f.a("Service connection suspended");
      t().a(new Runnable()
      {
        public final void run()
        {
          dj localdj = dj.this;
          Context localContext = n();
          cf.W();
          dj.a(localdj, new ComponentName(localContext, "com.google.android.gms.measurement.AppMeasurementService"));
        }
      });
    }
    
    public final void a(com.google.android.gms.common.a parama)
    {
      Object localObject2 = null;
      c.b("MeasurementServiceConnection.onConnectionFailed");
      dc localdc = q;
      Object localObject1 = localObject2;
      if (c != null)
      {
        localObject1 = localObject2;
        if (c.I()) {
          localObject1 = c;
        }
      }
      if (localObject1 != null) {
        c.a("Service connection failed", parama);
      }
      try
      {
        a = false;
        b = null;
        t().a(new Runnable()
        {
          public final void run()
          {
            b = null;
            dj.a(dj.this);
          }
        });
        return;
      }
      finally {}
    }
    
    /* Error */
    public final void onServiceConnected(final ComponentName paramComponentName, android.os.IBinder paramIBinder)
    {
      // Byte code:
      //   0: ldc 126
      //   2: invokestatic 50	com/google/android/gms/common/internal/c:b	(Ljava/lang/String;)V
      //   5: aload_0
      //   6: monitorenter
      //   7: aload_2
      //   8: ifnonnull +26 -> 34
      //   11: aload_0
      //   12: iconst_0
      //   13: putfield 39	com/google/android/gms/b/dj$a:a	Z
      //   16: aload_0
      //   17: getfield 32	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
      //   20: invokevirtual 79	com/google/android/gms/b/dj:u	()Lcom/google/android/gms/b/cu;
      //   23: getfield 128	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
      //   26: ldc -126
      //   28: invokevirtual 91	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
      //   31: aload_0
      //   32: monitorexit
      //   33: return
      //   34: aconst_null
      //   35: astore 4
      //   37: aconst_null
      //   38: astore_3
      //   39: aload 4
      //   41: astore_1
      //   42: aload_2
      //   43: invokeinterface 136 1 0
      //   48: astore 5
      //   50: aload 4
      //   52: astore_1
      //   53: ldc -118
      //   55: aload 5
      //   57: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   60: ifeq +68 -> 128
      //   63: aload 4
      //   65: astore_1
      //   66: aload_2
      //   67: invokestatic 149	com/google/android/gms/b/cq$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/cq;
      //   70: astore_2
      //   71: aload_2
      //   72: astore_1
      //   73: aload_0
      //   74: getfield 32	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
      //   77: invokevirtual 79	com/google/android/gms/b/dj:u	()Lcom/google/android/gms/b/cu;
      //   80: getfield 152	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
      //   83: ldc -102
      //   85: invokevirtual 91	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
      //   88: aload_2
      //   89: astore_1
      //   90: aload_1
      //   91: ifnonnull +81 -> 172
      //   94: aload_0
      //   95: iconst_0
      //   96: putfield 39	com/google/android/gms/b/dj$a:a	Z
      //   99: invokestatic 159	com/google/android/gms/common/a/a:a	()Lcom/google/android/gms/common/a/a;
      //   102: pop
      //   103: aload_0
      //   104: getfield 32	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
      //   107: invokevirtual 163	com/google/android/gms/b/dj:n	()Landroid/content/Context;
      //   110: aload_0
      //   111: getfield 32	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
      //   114: getfield 166	com/google/android/gms/b/dj:a	Lcom/google/android/gms/b/dj$a;
      //   117: invokestatic 169	com/google/android/gms/common/a/a:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
      //   120: aload_0
      //   121: monitorexit
      //   122: return
      //   123: astore_1
      //   124: aload_0
      //   125: monitorexit
      //   126: aload_1
      //   127: athrow
      //   128: aload 4
      //   130: astore_1
      //   131: aload_0
      //   132: getfield 32	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
      //   135: invokevirtual 79	com/google/android/gms/b/dj:u	()Lcom/google/android/gms/b/cu;
      //   138: getfield 128	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
      //   141: ldc -85
      //   143: aload 5
      //   145: invokevirtual 117	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
      //   148: aload_3
      //   149: astore_1
      //   150: goto -60 -> 90
      //   153: astore_2
      //   154: aload_0
      //   155: getfield 32	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
      //   158: invokevirtual 79	com/google/android/gms/b/dj:u	()Lcom/google/android/gms/b/cu;
      //   161: getfield 128	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
      //   164: ldc -83
      //   166: invokevirtual 91	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
      //   169: goto -79 -> 90
      //   172: aload_0
      //   173: getfield 32	com/google/android/gms/b/dj$a:c	Lcom/google/android/gms/b/dj;
      //   176: invokevirtual 64	com/google/android/gms/b/dj:t	()Lcom/google/android/gms/b/db;
      //   179: new 15	com/google/android/gms/b/dj$a$1
      //   182: dup
      //   183: aload_0
      //   184: aload_1
      //   185: invokespecial 174	com/google/android/gms/b/dj$a$1:<init>	(Lcom/google/android/gms/b/dj$a;Lcom/google/android/gms/b/cq;)V
      //   188: invokevirtual 72	com/google/android/gms/b/db:a	(Ljava/lang/Runnable;)V
      //   191: goto -71 -> 120
      //   194: astore_1
      //   195: goto -75 -> 120
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	198	0	this	a
      //   0	198	1	paramComponentName	ComponentName
      //   0	198	2	paramIBinder	android.os.IBinder
      //   38	111	3	localObject1	Object
      //   35	94	4	localObject2	Object
      //   48	96	5	str	String
      // Exception table:
      //   from	to	target	type
      //   11	33	123	finally
      //   42	50	123	finally
      //   53	63	123	finally
      //   66	71	123	finally
      //   73	88	123	finally
      //   94	99	123	finally
      //   99	120	123	finally
      //   120	122	123	finally
      //   124	126	123	finally
      //   131	148	123	finally
      //   154	169	123	finally
      //   172	191	123	finally
      //   42	50	153	android/os/RemoteException
      //   53	63	153	android/os/RemoteException
      //   66	71	153	android/os/RemoteException
      //   73	88	153	android/os/RemoteException
      //   131	148	153	android/os/RemoteException
      //   99	120	194	java/lang/IllegalArgumentException
    }
    
    public final void onServiceDisconnected(final ComponentName paramComponentName)
    {
      c.b("MeasurementServiceConnection.onServiceDisconnected");
      u().f.a("Service disconnected");
      t().a(new Runnable()
      {
        public final void run()
        {
          dj.a(dj.this, paramComponentName);
        }
      });
    }
  }
}


/* Location:              com/google/android/gms/b/dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */