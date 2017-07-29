package com.google.android.gms.b;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.g.a;
import android.text.TextUtils;
import com.google.android.gms.c.b;
import com.google.android.gms.c.d.1;
import com.google.android.gms.c.h;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.android.gms.measurement.AppMeasurement.b;
import com.google.android.gms.measurement.AppMeasurement.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class dh
  extends df
{
  protected dh.a a;
  private AppMeasurement.b b;
  private final Set c;
  private boolean d;
  private String e;
  private String f;
  
  protected dh(dc paramdc)
  {
    super(paramdc);
    CopyOnWriteArraySet localCopyOnWriteArraySet = new java/util/concurrent/CopyOnWriteArraySet;
    localCopyOnWriteArraySet.<init>();
    c = localCopyOnWriteArraySet;
    e = null;
    f = null;
  }
  
  private void a(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBundle == null)
    {
      localBundle1 = new android/os/Bundle;
      localBundle1.<init>();
      db localdb = super.t();
      localObject1 = new com/google/android/gms/b/dh$11;
      localObject2 = this;
      localObject3 = paramString1;
      localObject4 = paramString2;
      ((dh.11)localObject1).<init>(this, paramString1, paramString2, paramLong, localBundle1, paramBoolean1, paramBoolean2, paramBoolean3);
      localdb.a((Runnable)localObject1);
      return;
    }
    Bundle localBundle1 = new android/os/Bundle;
    localBundle1.<init>(paramBundle);
    Object localObject1 = localBundle1.keySet();
    Object localObject4 = ((Set)localObject1).iterator();
    label166:
    Bundle localBundle2;
    do
    {
      int m;
      for (;;)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)((Iterator)localObject4).next();
        localObject2 = localBundle1.get((String)localObject1);
        m = localObject2 instanceof Bundle;
        if (m == 0) {
          break label166;
        }
        localObject3 = new android/os/Bundle;
        localObject2 = (Bundle)localObject2;
        ((Bundle)localObject3).<init>((Bundle)localObject2);
        localBundle1.putBundle((String)localObject1, (Bundle)localObject3);
      }
      boolean bool1 = localObject2 instanceof Parcelable[];
      if (bool1)
      {
        localObject2 = (Parcelable[])localObject2;
        bool1 = false;
        localObject1 = null;
        m = 0;
        localObject3 = null;
        for (;;)
        {
          int i = localObject2.length;
          if (m >= i) {
            break;
          }
          localObject1 = localObject2[m];
          boolean bool2 = localObject1 instanceof Bundle;
          if (bool2)
          {
            localBundle2 = new android/os/Bundle;
            localObject1 = (Bundle)localObject2[m];
            localBundle2.<init>((Bundle)localObject1);
            localObject2[m] = localBundle2;
          }
          int j = m + 1;
          m = j;
        }
      }
      bool3 = localObject2 instanceof ArrayList;
    } while (!bool3);
    Object localObject2 = (ArrayList)localObject2;
    boolean bool3 = false;
    localObject1 = null;
    int n = 0;
    Object localObject3 = null;
    for (;;)
    {
      int k = ((ArrayList)localObject2).size();
      if (n >= k) {
        break;
      }
      localObject1 = ((ArrayList)localObject2).get(n);
      boolean bool4 = localObject1 instanceof Bundle;
      if (bool4)
      {
        localBundle2 = new android/os/Bundle;
        localObject1 = (Bundle)localObject1;
        localBundle2.<init>((Bundle)localObject1);
        ((ArrayList)localObject2).set(n, localBundle2);
      }
      k = n + 1;
      n = k;
    }
  }
  
  private void a(String paramString1, String paramString2, long paramLong, Object paramObject)
  {
    db localdb = super.t();
    dh.12 local12 = new com/google/android/gms/b/dh$12;
    local12.<init>(this, paramString1, paramString2, paramObject, paramLong);
    localdb.a(local12);
  }
  
  private void a(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2)
  {
    long l = super.m().a();
    a(paramString1, paramString2, l, paramBundle, true, paramBoolean1, paramBoolean2);
  }
  
  private List b(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject1).<init>();
    for (;;)
    {
      Object localObject5;
      Object localObject6;
      Object localObject7;
      try
      {
        Object localObject2 = q;
        db localdb = ((dc)localObject2).f();
        localObject2 = new com/google/android/gms/b/dh$7;
        localObject5 = this;
        localObject6 = paramString1;
        localObject7 = paramString2;
        ((dh.7)localObject2).<init>(this, (AtomicReference)localObject1, paramString1, paramString2, paramString3);
        localdb.a((Runnable)localObject2);
        long l1 = 5000L;
        try
        {
          localObject1.wait(l1);
          localObject2 = (List)((AtomicReference)localObject1).get();
          if (localObject2 == null)
          {
            localObject2 = uc;
            localObject5 = "Timed out waiting for get conditional user properties";
            ((cu.a)localObject2).a((String)localObject5, paramString1);
            localObject2 = Collections.emptyList();
            return (List)localObject2;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localObject5 = super.u();
          localObject5 = c;
          localObject6 = "Interrupted waiting for get conditional user properties";
          ((cu.a)localObject5).a((String)localObject6, paramString1, localInterruptedException);
          continue;
        }
        localObject5 = new java/util/ArrayList;
      }
      finally {}
      int i = ((List)localObject3).size();
      ((ArrayList)localObject5).<init>(i);
      localObject1 = ((List)localObject3).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject4 = (cd)((Iterator)localObject1).next();
        localObject6 = new com/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;
        ((AppMeasurement.ConditionalUserProperty)localObject6).<init>();
        mAppId = paramString1;
        mOrigin = paramString2;
        long l2 = e;
        mCreationTimestamp = l2;
        localObject7 = d.b;
        mName = ((String)localObject7);
        localObject7 = d.a();
        mValue = localObject7;
        boolean bool2 = f;
        mActive = bool2;
        localObject7 = g;
        mTriggerEventName = ((String)localObject7);
        localObject7 = h;
        if (localObject7 != null)
        {
          localObject7 = h.a;
          mTimedOutEventName = ((String)localObject7);
          localObject7 = h.b;
          if (localObject7 != null)
          {
            localObject7 = h.b.a();
            mTimedOutEventParams = ((Bundle)localObject7);
          }
        }
        l2 = i;
        mTriggerTimeout = l2;
        localObject7 = j;
        if (localObject7 != null)
        {
          localObject7 = j.a;
          mTriggeredEventName = ((String)localObject7);
          localObject7 = j.b;
          if (localObject7 != null)
          {
            localObject7 = j.b.a();
            mTriggeredEventParams = ((Bundle)localObject7);
          }
        }
        l2 = d.c;
        mTriggeredTimestamp = l2;
        l2 = k;
        mTimeToLive = l2;
        localObject7 = l;
        if (localObject7 != null)
        {
          localObject7 = l.a;
          mExpiredEventName = ((String)localObject7);
          localObject7 = l.b;
          if (localObject7 != null)
          {
            localObject4 = l.b.a();
            mExpiredEventParams = ((Bundle)localObject4);
          }
        }
        ((List)localObject5).add(localObject6);
      }
      Object localObject4 = localObject5;
    }
  }
  
  private Map b(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    Object localObject1 = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject1).<init>();
    for (;;)
    {
      Object localObject5;
      String str;
      try
      {
        Object localObject2 = q;
        db localdb = ((dc)localObject2).f();
        localObject2 = new com/google/android/gms/b/dh$8;
        localObject5 = this;
        str = paramString1;
        ((dh.8)localObject2).<init>(this, (AtomicReference)localObject1, paramString1, paramString2, paramString3, paramBoolean);
        localdb.a((Runnable)localObject2);
        long l = 5000L;
        try
        {
          localObject1.wait(l);
          localObject2 = (List)((AtomicReference)localObject1).get();
          if (localObject2 == null)
          {
            localObject2 = uc;
            localObject5 = "Timed out waiting for get user properties";
            ((cu.a)localObject2).a((String)localObject5);
            localObject2 = Collections.emptyMap();
            return (Map)localObject2;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localObject5 = super.u();
          localObject5 = c;
          str = "Interrupted waiting for get user properties";
          ((cu.a)localObject5).a(str, localInterruptedException);
          continue;
        }
        localObject5 = new android/support/v4/g/a;
      }
      finally {}
      int i = ((List)localObject3).size();
      ((a)localObject5).<init>(i);
      localObject1 = ((List)localObject3).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        localObject4 = (do)((Iterator)localObject1).next();
        str = b;
        localObject4 = ((do)localObject4).a();
        ((Map)localObject5).put(str, localObject4);
      }
      Object localObject4 = localObject5;
    }
  }
  
  private void b(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    Object localObject = super.m();
    long l = ((com.google.android.gms.common.util.c)localObject).a();
    com.google.android.gms.common.internal.c.a(paramString2);
    AppMeasurement.ConditionalUserProperty localConditionalUserProperty = new com/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;
    localConditionalUserProperty.<init>();
    mAppId = paramString1;
    mName = paramString2;
    mCreationTimestamp = l;
    if (paramString3 != null)
    {
      mExpiredEventName = paramString3;
      mExpiredEventParams = paramBundle;
    }
    localObject = super.t();
    dh.6 local6 = new com/google/android/gms/b/dh$6;
    local6.<init>(this, localConditionalUserProperty);
    ((db)localObject).a(local6);
  }
  
  private void c(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    long l1 = 1L;
    long l2 = super.m().a();
    com.google.android.gms.common.internal.c.a(paramConditionalUserProperty);
    com.google.android.gms.common.internal.c.a(mName);
    com.google.android.gms.common.internal.c.a(mOrigin);
    com.google.android.gms.common.internal.c.a(mValue);
    mCreationTimestamp = l2;
    Object localObject1 = mName;
    Object localObject2 = mValue;
    Object localObject3 = super.q();
    int i = ((dr)localObject3).e((String)localObject1);
    if (i != 0)
    {
      localObject2 = ua;
      localObject3 = "Invalid conditional user property name";
      ((cu.a)localObject2).a((String)localObject3, localObject1);
    }
    for (;;)
    {
      return;
      localObject3 = super.q();
      i = ((dr)localObject3).b((String)localObject1, localObject2);
      String str1;
      if (i != 0)
      {
        localObject3 = ua;
        str1 = "Invalid conditional user property value";
        ((cu.a)localObject3).a(str1, localObject1, localObject2);
      }
      else
      {
        super.q();
        localObject3 = dr.c((String)localObject1, localObject2);
        if (localObject3 == null)
        {
          localObject3 = ua;
          str1 = "Unable to normalize conditional user property value";
          ((cu.a)localObject3).a(str1, localObject1, localObject2);
        }
        else
        {
          mValue = localObject3;
          long l3 = mTriggerTimeout;
          long l4 = cf.N();
          boolean bool = l3 < l4;
          String str2;
          if (!bool)
          {
            bool = l3 < l1;
            if (!bool) {}
          }
          else
          {
            localObject2 = ua;
            str2 = "Invalid conditional user property timeout";
            localObject3 = Long.valueOf(l3);
            ((cu.a)localObject2).a(str2, localObject1, localObject3);
            continue;
          }
          l3 = mTimeToLive;
          l4 = cf.O();
          bool = l3 < l4;
          if (!bool)
          {
            bool = l3 < l1;
            if (!bool) {}
          }
          else
          {
            localObject2 = ua;
            str2 = "Invalid conditional user property time to live";
            localObject3 = Long.valueOf(l3);
            ((cu.a)localObject2).a(str2, localObject1, localObject3);
            continue;
          }
          localObject1 = super.t();
          localObject2 = new com/google/android/gms/b/dh$5;
          ((dh.5)localObject2).<init>(this, paramConditionalUserProperty);
          ((db)localObject1).a((Runnable)localObject2);
        }
      }
    }
  }
  
  private String d(long paramLong)
  {
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    Object localObject4;
    try
    {
      Object localObject1 = super.t();
      localObject4 = new com/google/android/gms/b/dh$4;
      ((dh.4)localObject4).<init>(this, localAtomicReference);
      ((db)localObject1).a((Runnable)localObject4);
      try
      {
        localAtomicReference.wait(paramLong);
        localObject1 = (String)localAtomicReference.get();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Object localObject2 = super.u();
          localObject2 = c;
          localObject4 = "Interrupted waiting for app instance id";
          ((cu.a)localObject2).a((String)localObject4);
          localObject2 = null;
        }
      }
      return (String)localObject1;
    }
    finally {}
  }
  
  public final void A()
  {
    super.e();
    super.c();
    J();
    Object localObject1 = q;
    boolean bool1 = ((dc)localObject1).b();
    if (!bool1) {}
    for (;;)
    {
      return;
      super.k().z();
      localObject1 = super.v().F();
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2)
      {
        Object localObject2 = super.j().y();
        bool2 = ((String)localObject1).equals(localObject2);
        if (!bool2)
        {
          localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          ((Bundle)localObject2).putString("_po", (String)localObject1);
          localObject1 = "auto";
          String str = "_ou";
          b((String)localObject1, str, (Bundle)localObject2);
        }
      }
    }
  }
  
  public final List a(String paramString1, String paramString2)
  {
    super.c();
    return b(null, paramString1, paramString2);
  }
  
  public final List a(String paramString1, String paramString2, String paramString3)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    super.b();
    return b(paramString1, paramString2, paramString3);
  }
  
  public final Map a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    super.b();
    return b(paramString1, paramString2, paramString3, paramBoolean);
  }
  
  public final Map a(String paramString1, String paramString2, boolean paramBoolean)
  {
    super.c();
    return b(null, paramString1, paramString2, paramBoolean);
  }
  
  protected final void a() {}
  
  public final void a(long paramLong)
  {
    super.c();
    db localdb = super.t();
    dh.9 local9 = new com/google/android/gms/b/dh$9;
    local9.<init>(this, paramLong);
    localdb.a(local9);
  }
  
  public final void a(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    com.google.android.gms.common.internal.c.a(paramConditionalUserProperty);
    super.c();
    AppMeasurement.ConditionalUserProperty localConditionalUserProperty = new com/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;
    localConditionalUserProperty.<init>(paramConditionalUserProperty);
    Object localObject = mAppId;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool)
    {
      localObject = uc;
      String str = "Package name should be null when calling setConditionalUserProperty";
      ((cu.a)localObject).a(str);
    }
    mAppId = null;
    c(localConditionalUserProperty);
  }
  
  public final void a(AppMeasurement.b paramb)
  {
    super.e();
    super.c();
    J();
    AppMeasurement.b localb;
    boolean bool;
    if (paramb != null)
    {
      localb = b;
      if (paramb != localb)
      {
        localb = b;
        if (localb != null) {
          break label54;
        }
        bool = true;
      }
    }
    for (;;)
    {
      String str = "EventInterceptor already set.";
      com.google.android.gms.common.internal.c.a(bool, str);
      b = paramb;
      return;
      label54:
      bool = false;
      localb = null;
    }
  }
  
  public final void a(AppMeasurement.c paramc)
  {
    super.c();
    J();
    com.google.android.gms.common.internal.c.a(paramc);
    Object localObject = c;
    boolean bool = ((Set)localObject).add(paramc);
    if (!bool)
    {
      localObject = uc;
      String str = "OnEventListener already registered";
      ((cu.a)localObject).a(str);
    }
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    boolean bool1 = true;
    super.c();
    Object localObject = b;
    if (localObject != null)
    {
      boolean bool2 = dr.i(paramString2);
      if (!bool2) {
        break label48;
      }
    }
    label48:
    for (boolean bool3 = bool1;; bool3 = false)
    {
      localObject = this;
      a(paramString1, paramString2, paramBundle, bool3, bool1);
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    boolean bool = true;
    super.c();
    a(paramString1, paramString2, paramLong, paramBundle, false, bool, bool);
  }
  
  public final void a(String paramString1, String paramString2, Object paramObject)
  {
    boolean bool = true;
    int i = 0;
    String str1 = null;
    com.google.android.gms.common.internal.c.a(paramString1);
    long l = super.m().a();
    Object localObject1 = super.q();
    int j = ((dr)localObject1).e(paramString2);
    int k;
    String str2;
    Object localObject2;
    String str3;
    if (j != 0)
    {
      super.q();
      k = cf.z();
      str2 = dr.a(paramString2, k, bool);
      if (paramString2 != null) {
        i = paramString2.length();
      }
      localObject2 = q.i();
      str3 = "_ev";
      ((dr)localObject2).a(j, str3, str2, i);
    }
    for (;;)
    {
      return;
      Object localObject3;
      if (paramObject != null)
      {
        localObject1 = super.q();
        j = ((dr)localObject1).b(paramString2, paramObject);
        if (j != 0)
        {
          super.q();
          k = cf.z();
          str2 = dr.a(paramString2, k, bool);
          bool = paramObject instanceof String;
          if (!bool)
          {
            bool = paramObject instanceof CharSequence;
            if (!bool) {}
          }
          else
          {
            str1 = String.valueOf(paramObject);
            i = str1.length();
          }
          localObject2 = q.i();
          str3 = "_ev";
          ((dr)localObject2).a(j, str3, str2, i);
        }
        else
        {
          super.q();
          localObject3 = dr.c(paramString2, paramObject);
          if (localObject3 != null)
          {
            localObject1 = this;
            str2 = paramString1;
            localObject2 = paramString2;
            a(paramString1, paramString2, l, localObject3);
          }
        }
      }
      else
      {
        localObject3 = null;
        localObject1 = this;
        str2 = paramString1;
        localObject2 = paramString2;
        a(paramString1, paramString2, l, null);
      }
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    super.b();
    b(paramString1, paramString2, paramString3, paramBundle);
  }
  
  public final void a(boolean paramBoolean)
  {
    J();
    super.c();
    db localdb = super.t();
    dh.1 local1 = new com/google/android/gms/b/dh$1;
    local1.<init>(this, paramBoolean);
    localdb.a(local1);
  }
  
  /* Error */
  public final List b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 398	com/google/android/gms/b/df:c	()V
    //   4: aload_0
    //   5: invokevirtual 35	com/google/android/gms/b/dh:J	()V
    //   8: aload_0
    //   9: invokespecial 69	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   12: getfield 74	com/google/android/gms/b/cu:f	Lcom/google/android/gms/b/cu$a;
    //   15: astore_2
    //   16: aload_2
    //   17: ldc_w 685
    //   20: invokevirtual 81	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   23: new 460	java/util/concurrent/atomic/AtomicReference
    //   26: astore_3
    //   27: aload_3
    //   28: invokespecial 461	java/util/concurrent/atomic/AtomicReference:<init>	()V
    //   31: aload_3
    //   32: monitorenter
    //   33: aload_0
    //   34: getfield 59	com/google/android/gms/b/dh:q	Lcom/google/android/gms/b/dc;
    //   37: astore_2
    //   38: aload_2
    //   39: invokevirtual 463	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   42: astore_2
    //   43: new 687	com/google/android/gms/b/dh$2
    //   46: astore 4
    //   48: aload 4
    //   50: aload_0
    //   51: aload_3
    //   52: iload_1
    //   53: invokespecial 690	com/google/android/gms/b/dh$2:<init>	(Lcom/google/android/gms/b/dh;Ljava/util/concurrent/atomic/AtomicReference;Z)V
    //   56: aload_2
    //   57: aload 4
    //   59: invokevirtual 433	com/google/android/gms/b/db:a	(Ljava/lang/Runnable;)V
    //   62: ldc2_w 469
    //   65: lstore 5
    //   67: aload_3
    //   68: lload 5
    //   70: invokevirtual 476	java/lang/Object:wait	(J)V
    //   73: aload_3
    //   74: monitorexit
    //   75: aload_3
    //   76: invokevirtual 478	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   79: checkcast 250	java/util/List
    //   82: astore_2
    //   83: aload_2
    //   84: ifnonnull +24 -> 108
    //   87: aload_0
    //   88: invokespecial 69	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   91: getfield 201	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   94: astore_2
    //   95: ldc_w 540
    //   98: astore_3
    //   99: aload_2
    //   100: aload_3
    //   101: invokevirtual 81	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   104: invokestatic 484	java/util/Collections:emptyList	()Ljava/util/List;
    //   107: astore_2
    //   108: aload_2
    //   109: areturn
    //   110: astore_2
    //   111: aload_0
    //   112: invokespecial 69	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   115: astore 4
    //   117: aload 4
    //   119: getfield 201	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   122: astore 4
    //   124: ldc_w 546
    //   127: astore 7
    //   129: aload 4
    //   131: aload 7
    //   133: aload_2
    //   134: invokevirtual 206	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   137: goto -64 -> 73
    //   140: astore_2
    //   141: aload_3
    //   142: monitorexit
    //   143: aload_2
    //   144: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	dh
    //   0	145	1	paramBoolean	boolean
    //   15	94	2	localObject1	Object
    //   110	24	2	localInterruptedException	InterruptedException
    //   140	4	2	localObject2	Object
    //   26	116	3	localObject3	Object
    //   46	84	4	localObject4	Object
    //   65	4	5	l	long
    //   127	5	7	str	String
    // Exception table:
    //   from	to	target	type
    //   68	73	110	java/lang/InterruptedException
    //   33	37	140	finally
    //   38	42	140	finally
    //   43	46	140	finally
    //   52	56	140	finally
    //   57	62	140	finally
    //   68	73	140	finally
    //   73	75	140	finally
    //   111	115	140	finally
    //   117	122	140	finally
    //   133	137	140	finally
    //   141	143	140	finally
  }
  
  public final void b(long paramLong)
  {
    super.c();
    db localdb = super.t();
    dh.10 local10 = new com/google/android/gms/b/dh$10;
    local10.<init>(this, paramLong);
    localdb.a(local10);
  }
  
  public final void b(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    com.google.android.gms.common.internal.c.a(paramConditionalUserProperty);
    com.google.android.gms.common.internal.c.a(mAppId);
    super.b();
    AppMeasurement.ConditionalUserProperty localConditionalUserProperty = new com/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;
    localConditionalUserProperty.<init>(paramConditionalUserProperty);
    c(localConditionalUserProperty);
  }
  
  public final void b(String paramString1, String paramString2, Bundle paramBundle)
  {
    super.c();
    Object localObject = b;
    if (localObject != null)
    {
      boolean bool1 = dr.i(paramString2);
      if (!bool1) {
        break label43;
      }
    }
    label43:
    for (boolean bool2 = true;; bool2 = false)
    {
      localObject = this;
      a(paramString1, paramString2, paramBundle, bool2, false);
      return;
    }
  }
  
  final String c(long paramLong)
  {
    String str = null;
    Object localObject1 = super.t();
    Object localObject2 = Thread.currentThread();
    localObject1 = a;
    boolean bool;
    if (localObject2 == localObject1)
    {
      bool = true;
      if (!bool) {
        break label67;
      }
      localObject1 = ua;
      localObject2 = "Cannot retrieve app instance id from analytics worker thread";
      ((cu.a)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      return str;
      bool = false;
      localObject1 = null;
      break;
      label67:
      super.t();
      bool = db.x();
      if (bool)
      {
        localObject1 = ua;
        localObject2 = "Cannot retrieve app instance id from main thread";
        ((cu.a)localObject1).a((String)localObject2);
      }
      else
      {
        long l1 = super.m().b();
        str = d(paramLong);
        localObject1 = super.m();
        long l2 = ((com.google.android.gms.common.util.c)localObject1).b();
        l1 = l2 - l1;
        if (str == null)
        {
          bool = l1 < paramLong;
          if (bool)
          {
            long l3 = paramLong - l1;
            str = d(l3);
          }
        }
      }
    }
  }
  
  public final void c(String paramString1, String paramString2, Bundle paramBundle)
  {
    super.c();
    b(null, paramString1, paramString2, paramBundle);
  }
  
  public final void x()
  {
    Object localObject1 = super.n().getApplicationContext();
    boolean bool = localObject1 instanceof Application;
    if (bool)
    {
      localObject1 = (Application)super.n().getApplicationContext();
      Object localObject2 = a;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/b/dh$a;
        ((dh.a)localObject2).<init>(this, (byte)0);
        a = ((dh.a)localObject2);
      }
      localObject2 = a;
      ((Application)localObject1).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
      localObject2 = a;
      ((Application)localObject1).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
      localObject1 = ug;
      localObject2 = "Registered activity lifecycle callback";
      ((cu.a)localObject1).a((String)localObject2);
    }
  }
  
  public final b y()
  {
    for (;;)
    {
      try
      {
        localObject1 = super.v();
        localObject2 = ((cy)localObject1).C();
        if (localObject2 == null) {
          continue;
        }
        localObject1 = new com/google/android/gms/c/h;
        ((h)localObject1).<init>();
        ((h)localObject1).a(localObject2);
      }
      catch (Exception localException)
      {
        Object localObject2;
        d.1 local1;
        Object localObject1 = uc;
        Object localObject3 = "Failed to schedule task for getAppInstanceId";
        ((cu.a)localObject1).a((String)localObject3);
        localObject1 = new com/google/android/gms/c/h;
        ((h)localObject1).<init>();
        ((h)localObject1).a(localException);
        continue;
      }
      return (b)localObject1;
      localObject1 = super.t();
      localObject2 = ((db)localObject1).y();
      localObject3 = new com/google/android/gms/b/dh$3;
      ((dh.3)localObject3).<init>(this);
      localObject1 = "Executor must not be null";
      com.google.android.gms.common.internal.c.a(localObject2, localObject1);
      localObject1 = "Callback must not be null";
      com.google.android.gms.common.internal.c.a(localObject3, localObject1);
      localObject1 = new com/google/android/gms/c/h;
      ((h)localObject1).<init>();
      local1 = new com/google/android/gms/c/d$1;
      local1.<init>((h)localObject1, (Callable)localObject3);
      ((Executor)localObject2).execute(local1);
    }
  }
  
  /* Error */
  public final String z()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: invokevirtual 35	com/google/android/gms/b/dh:J	()V
    //   8: aload_0
    //   9: invokespecial 398	com/google/android/gms/b/df:c	()V
    //   12: ldc2_w 808
    //   15: lstore_2
    //   16: aload_0
    //   17: lload_2
    //   18: invokevirtual 813	com/google/android/gms/b/dh:c	(J)Ljava/lang/String;
    //   21: astore 4
    //   23: aload 4
    //   25: ifnonnull +7 -> 32
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: areturn
    //   32: aconst_null
    //   33: astore_1
    //   34: aload_0
    //   35: aconst_null
    //   36: putfield 30	com/google/android/gms/b/dh:f	Ljava/lang/String;
    //   39: aload_0
    //   40: aload 4
    //   42: putfield 28	com/google/android/gms/b/dh:e	Ljava/lang/String;
    //   45: aload_0
    //   46: getfield 28	com/google/android/gms/b/dh:e	Ljava/lang/String;
    //   49: astore_1
    //   50: goto -22 -> 28
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	dh
    //   1	49	1	str1	String
    //   53	4	1	localObject	Object
    //   15	3	2	l	long
    //   21	20	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   4	8	53	finally
    //   8	12	53	finally
    //   17	21	53	finally
    //   35	39	53	finally
    //   40	45	53	finally
    //   45	49	53	finally
  }
}


/* Location:              com/google/android/gms/b/dh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */