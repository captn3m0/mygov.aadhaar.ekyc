package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;
import com.google.android.gms.common.m;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class dj
  extends df
{
  final dj.a a;
  cq b;
  private Boolean c;
  private final ch d;
  private final dm e;
  private final List f;
  private final ch g;
  
  protected dj(dc paramdc)
  {
    super(paramdc);
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    f = ((List)localObject);
    localObject = new com/google/android/gms/b/dm;
    com.google.android.gms.common.util.c localc = i;
    ((dm)localObject).<init>(localc);
    e = ((dm)localObject);
    localObject = new com/google/android/gms/b/dj$a;
    ((dj.a)localObject).<init>(this);
    a = ((dj.a)localObject);
    localObject = new com/google/android/gms/b/dj$1;
    ((dj.1)localObject).<init>(this, paramdc);
    d = ((ch)localObject);
    localObject = new com/google/android/gms/b/dj$8;
    ((dj.8)localObject).<init>(this, paramdc);
    g = ((ch)localObject);
  }
  
  private void C()
  {
    super.e();
    e.a();
    ch localch = d;
    long l = cf.S();
    localch.a(l);
  }
  
  private void D()
  {
    super.e();
    Object localObject1 = ug;
    int i = f.size();
    Object localObject2 = Integer.valueOf(i);
    ((cu.a)localObject1).a("Processing queued up service tasks", localObject2);
    localObject1 = f;
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Runnable)localIterator.next();
      localObject2 = super.t();
      ((db)localObject2).a((Runnable)localObject1);
    }
    f.clear();
    g.c();
  }
  
  private void a(Runnable paramRunnable)
  {
    super.e();
    boolean bool = x();
    if (bool) {
      paramRunnable.run();
    }
    for (;;)
    {
      return;
      Object localObject = f;
      long l1 = ((List)localObject).size();
      long l2 = cf.ad();
      bool = l1 < l2;
      if (!bool)
      {
        localObject = ua;
        String str = "Discarding data. Max runnable queue size reached";
        ((cu.a)localObject).a(str);
      }
      else
      {
        f.add(paramRunnable);
        localObject = g;
        l2 = 60000L;
        ((ch)localObject).a(l2);
        A();
      }
    }
  }
  
  final void A()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    super.e();
    J();
    boolean bool3 = x();
    if (bool3) {}
    for (;;)
    {
      return;
      Object localObject2 = c;
      Object localObject5;
      int i;
      if (localObject2 == null)
      {
        localObject2 = super.v().D();
        c = ((Boolean)localObject2);
        localObject2 = c;
        if (localObject2 == null)
        {
          ug.a("State of service unknown");
          super.e();
          J();
          cf.W();
          ug.a("Checking service availability");
          localObject2 = m.b();
          localObject5 = super.n();
          i = ((m)localObject2).a((Context)localObject5);
          switch (i)
          {
          }
        }
      }
      label180:
      boolean bool5;
      boolean bool4;
      Object localObject6;
      Object localObject4;
      for (;;)
      {
        i = 0;
        localObject2 = null;
        for (;;)
        {
          localObject2 = Boolean.valueOf(i);
          c = ((Boolean)localObject2);
          localObject2 = super.v();
          localObject5 = c;
          bool5 = ((Boolean)localObject5).booleanValue();
          ((cy)localObject2).a(bool5);
          localObject2 = c;
          bool4 = ((Boolean)localObject2).booleanValue();
          if (!bool4) {
            break label615;
          }
          ug.a("Using measurement service");
          localObject6 = a;
          c.e();
          localObject2 = c.n();
          try
          {
            bool1 = a;
            if (!bool1) {
              break label483;
            }
            localObject2 = c;
            localObject2 = ((df)localObject2).u();
            localObject2 = g;
            localObject1 = "Connection attempt already in progress";
            ((cu.a)localObject2).a((String)localObject1);
            break;
          }
          finally {}
          localObject4 = ug;
          localObject5 = "Service available";
          ((cu.a)localObject4).a((String)localObject5);
          bool4 = bool2;
          continue;
          localObject4 = ug;
          localObject5 = "Service missing";
          ((cu.a)localObject4).a((String)localObject5);
          break label180;
          localObject4 = uc;
          localObject5 = "Service updating";
          ((cu.a)localObject4).a((String)localObject5);
          bool4 = bool2;
          continue;
          localObject4 = uf;
          localObject5 = "Service container out of date";
          ((cu.a)localObject4).a((String)localObject5);
          bool4 = bool2;
        }
        localObject4 = uc;
        localObject5 = "Service disabled";
        ((cu.a)localObject4).a((String)localObject5);
        continue;
        localObject4 = uc;
        localObject5 = "Service invalid";
        ((cu.a)localObject4).a((String)localObject5);
      }
      label483:
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject4 = c;
        localObject4 = ((df)localObject4).u();
        localObject4 = g;
        localObject1 = "Already awaiting connection attempt";
        ((cu.a)localObject4).a((String)localObject1);
      }
      else
      {
        localObject1 = new com/google/android/gms/b/ct;
        localObject5 = Looper.getMainLooper();
        ((ct)localObject1).<init>((Context)localObject4, (Looper)localObject5, (o.b)localObject6, (o.c)localObject6);
        b = ((ct)localObject1);
        localObject4 = c;
        localObject4 = ((df)localObject4).u();
        localObject4 = g;
        localObject1 = "Connecting to remote service";
        ((cu.a)localObject4).a((String)localObject1);
        bool4 = true;
        a = bool4;
        localObject4 = b;
        ((ct)localObject4).f_();
        continue;
        label615:
        cf.W();
        localObject4 = super.n().getPackageManager();
        localObject5 = new android/content/Intent;
        ((Intent)localObject5).<init>();
        Context localContext = super.n();
        String str = "com.google.android.gms.measurement.AppMeasurementService";
        localObject5 = ((Intent)localObject5).setClassName(localContext, str);
        int k = 65536;
        localObject4 = ((PackageManager)localObject4).queryIntentServices((Intent)localObject5, k);
        if (localObject4 != null)
        {
          int j = ((List)localObject4).size();
          if (j <= 0) {}
        }
        for (;;)
        {
          if (bool2)
          {
            ug.a("Using local app measurement service");
            localObject4 = new android/content/Intent;
            ((Intent)localObject4).<init>("com.google.android.gms.measurement.START");
            localObject6 = new android/content/ComponentName;
            localObject1 = super.n();
            cf.W();
            localObject5 = "com.google.android.gms.measurement.AppMeasurementService";
            ((ComponentName)localObject6).<init>((Context)localObject1, (String)localObject5);
            ((Intent)localObject4).setComponent((ComponentName)localObject6);
            localObject6 = a;
            c.e();
            localObject1 = c.n();
            com.google.android.gms.common.a.a.a();
            try
            {
              bool5 = a;
              if (!bool5) {
                break label854;
              }
              localObject4 = c;
              localObject4 = ((df)localObject4).u();
              localObject4 = g;
              localObject1 = "Connection attempt already in progress";
              ((cu.a)localObject4).a((String)localObject1);
              break;
            }
            finally {}
            bool2 = false;
            localObject6 = null;
            continue;
            label854:
            bool5 = true;
            a = bool5;
            localObject5 = c;
            localObject5 = a;
            k = 129;
            com.google.android.gms.common.a.a.b((Context)localObject1, localIntent, (ServiceConnection)localObject5, k);
            break;
          }
        }
        cu.a locala = ua;
        localObject6 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest";
        locala.a((String)localObject6);
      }
    }
  }
  
  public final void B()
  {
    super.e();
    J();
    try
    {
      com.google.android.gms.common.a.a.a();
      Context localContext = super.n();
      dj.a locala = a;
      com.google.android.gms.common.a.a.a(localContext, locala);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    b = null;
  }
  
  protected final void a() {}
  
  protected final void a(cd paramcd)
  {
    com.google.android.gms.common.internal.c.a(paramcd);
    super.e();
    J();
    cf.W();
    cs localcs = super.o();
    boolean bool = localcs.a(paramcd);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      cd localcd = new com/google/android/gms/b/cd;
      localcd.<init>(paramcd);
      dj.11 local11 = new com/google/android/gms/b/dj$11;
      local11.<init>(this, bool, localcd, paramcd);
      a(local11);
      return;
      bool = false;
      localcs = null;
    }
  }
  
  protected final void a(cn paramcn, String paramString)
  {
    com.google.android.gms.common.internal.c.a(paramcn);
    super.e();
    J();
    int i = Build.VERSION.SDK_INT;
    cf.W();
    cs localcs = super.o();
    boolean bool = localcs.a(paramcn);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      dj.10 local10 = new com/google/android/gms/b/dj$10;
      local10.<init>(this, bool, paramcn, paramString);
      a(local10);
      return;
      bool = false;
      localcs = null;
    }
  }
  
  protected final void a(cq paramcq)
  {
    super.e();
    com.google.android.gms.common.internal.c.a(paramcq);
    b = paramcq;
    C();
    D();
  }
  
  final void a(cq paramcq, com.google.android.gms.common.internal.safeparcel.a parama)
  {
    int i = 100;
    super.e();
    super.c();
    J();
    int j = Build.VERSION.SDK_INT;
    cf.W();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    cf.ah();
    int m = 0;
    int n = i;
    j = 1001;
    Object localObject1;
    if ((m < j) && (n == i))
    {
      localObject1 = super.o().x();
      if (localObject1 == null) {
        break label455;
      }
      localArrayList.addAll((Collection)localObject1);
      j = ((List)localObject1).size();
    }
    label455:
    for (n = j;; n = 0)
    {
      if ((parama != null) && (n < i)) {
        localArrayList.add(parama);
      }
      Iterator localIterator = localArrayList.iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (com.google.android.gms.common.internal.safeparcel.a)localIterator.next();
        boolean bool2 = localObject1 instanceof cn;
        Object localObject2;
        Object localObject3;
        if (bool2)
        {
          try
          {
            localObject1 = (cn)localObject1;
            localObject2 = super.i();
            localObject3 = super.u();
            localObject3 = ((cu)localObject3).x();
            localObject2 = ((cr)localObject2).a((String)localObject3);
            paramcq.a((cn)localObject1, (ca)localObject2);
          }
          catch (RemoteException localRemoteException1)
          {
            localObject2 = ua;
            localObject3 = "Failed to send event to the service";
            ((cu.a)localObject2).a((String)localObject3, localRemoteException1);
          }
        }
        else
        {
          bool2 = localRemoteException1 instanceof do;
          if (bool2)
          {
            try
            {
              do localdo = (do)localRemoteException1;
              localObject2 = super.i();
              localObject3 = super.u();
              localObject3 = ((cu)localObject3).x();
              localObject2 = ((cr)localObject2).a((String)localObject3);
              paramcq.a(localdo, (ca)localObject2);
            }
            catch (RemoteException localRemoteException2)
            {
              localObject2 = ua;
              localObject3 = "Failed to send attribute to the service";
              ((cu.a)localObject2).a((String)localObject3, localRemoteException2);
            }
          }
          else
          {
            bool2 = localRemoteException2 instanceof cd;
            if (bool2)
            {
              try
              {
                cd localcd = (cd)localRemoteException2;
                localObject2 = super.i();
                localObject3 = super.u();
                localObject3 = ((cu)localObject3).x();
                localObject2 = ((cr)localObject2).a((String)localObject3);
                paramcq.a(localcd, (ca)localObject2);
              }
              catch (RemoteException localRemoteException3)
              {
                localObject2 = ua;
                localObject3 = "Failed to send conditional property to the service";
                ((cu.a)localObject2).a((String)localObject3, localRemoteException3);
              }
            }
            else
            {
              cu.a locala = ua;
              localObject2 = "Discarding data. Unrecognized parcel type.";
              locala.a((String)localObject2);
            }
          }
        }
      }
      int k = m + 1;
      m = k;
      break;
      return;
    }
  }
  
  protected final void a(do paramdo)
  {
    super.e();
    J();
    int i = Build.VERSION.SDK_INT;
    cf.W();
    cs localcs = super.o();
    boolean bool = localcs.a(paramdo);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      dj.3 local3 = new com/google/android/gms/b/dj$3;
      local3.<init>(this, bool, paramdo);
      a(local3);
      return;
      bool = false;
      localcs = null;
    }
  }
  
  protected final void a(AppMeasurement.f paramf)
  {
    super.e();
    J();
    dj.7 local7 = new com/google/android/gms/b/dj$7;
    local7.<init>(this, paramf);
    a(local7);
  }
  
  public final void a(AtomicReference paramAtomicReference)
  {
    super.e();
    J();
    dj.5 local5 = new com/google/android/gms/b/dj$5;
    local5.<init>(this, paramAtomicReference);
    a(local5);
  }
  
  protected final void a(AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3)
  {
    super.e();
    J();
    dj.12 local12 = new com/google/android/gms/b/dj$12;
    local12.<init>(this, paramAtomicReference, paramString1, paramString2, paramString3);
    a(local12);
  }
  
  protected final void a(AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    super.e();
    J();
    dj.2 local2 = new com/google/android/gms/b/dj$2;
    local2.<init>(this, paramAtomicReference, paramString1, paramString2, paramString3, paramBoolean);
    a(local2);
  }
  
  protected final void a(AtomicReference paramAtomicReference, boolean paramBoolean)
  {
    super.e();
    J();
    dj.4 local4 = new com/google/android/gms/b/dj$4;
    local4.<init>(this, paramAtomicReference, paramBoolean);
    a(local4);
  }
  
  public final boolean x()
  {
    super.e();
    J();
    cq localcq = b;
    boolean bool;
    if (localcq != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localcq = null;
    }
  }
  
  protected final void y()
  {
    super.e();
    J();
    dj.9 local9 = new com/google/android/gms/b/dj$9;
    local9.<init>(this);
    a(local9);
  }
  
  protected final void z()
  {
    super.e();
    J();
    dj.6 local6 = new com/google/android/gms/b/dj$6;
    local6.<init>(this);
    a(local6);
  }
}


/* Location:              com/google/android/gms/b/dj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */