package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class dh
  extends df
{
  protected a a;
  private AppMeasurement.b b;
  private final Set<AppMeasurement.c> c = new CopyOnWriteArraySet();
  private boolean d;
  private String e = null;
  private String f = null;
  
  protected dh(dc paramdc)
  {
    super(paramdc);
  }
  
  private void a(final String paramString1, final String paramString2, final long paramLong, Bundle paramBundle, final boolean paramBoolean1, final boolean paramBoolean2, final boolean paramBoolean3)
  {
    if (paramBundle == null)
    {
      paramBundle = new Bundle();
      super.t().a(new Runnable()
      {
        public final void run()
        {
          dh.a(dh.this, paramString1, paramString2, paramLong, paramBoolean1, paramBoolean2, paramBoolean3, g, h);
        }
      });
      return;
    }
    Bundle localBundle = new Bundle(paramBundle);
    Iterator localIterator = localBundle.keySet().iterator();
    for (;;)
    {
      paramBundle = localBundle;
      if (!localIterator.hasNext()) {
        break;
      }
      paramBundle = (String)localIterator.next();
      Object localObject = localBundle.get(paramBundle);
      if ((localObject instanceof Bundle))
      {
        localBundle.putBundle(paramBundle, new Bundle((Bundle)localObject));
      }
      else
      {
        int i;
        if ((localObject instanceof Parcelable[]))
        {
          paramBundle = (Parcelable[])localObject;
          i = 0;
          while (i < paramBundle.length)
          {
            if ((paramBundle[i] instanceof Bundle)) {
              paramBundle[i] = new Bundle((Bundle)paramBundle[i]);
            }
            i += 1;
          }
        }
        else if ((localObject instanceof ArrayList))
        {
          paramBundle = (ArrayList)localObject;
          i = 0;
          while (i < paramBundle.size())
          {
            localObject = paramBundle.get(i);
            if ((localObject instanceof Bundle)) {
              paramBundle.set(i, new Bundle((Bundle)localObject));
            }
            i += 1;
          }
        }
      }
    }
  }
  
  private void a(final String paramString1, final String paramString2, final long paramLong, final Object paramObject)
  {
    super.t().a(new Runnable()
    {
      public final void run()
      {
        dh.a(dh.this, paramString1, paramString2, paramObject, paramLong);
      }
    });
  }
  
  private void a(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramString1, paramString2, super.m().a(), paramBundle, true, paramBoolean1, paramBoolean2);
  }
  
  private List<AppMeasurement.ConditionalUserProperty> b(final String paramString1, final String paramString2, final String paramString3)
  {
    synchronized (new AtomicReference())
    {
      q.f().a(new Runnable()
      {
        public final void run()
        {
          q.m().a(localObject, paramString1, paramString2, paramString3);
        }
      });
      try
      {
        ???.wait(5000L);
        ??? = (List)((AtomicReference)???).get();
        if (??? == null)
        {
          uc.a("Timed out waiting for get conditional user properties", paramString1);
          return Collections.emptyList();
        }
      }
      catch (InterruptedException paramString3)
      {
        for (;;)
        {
          uc.a("Interrupted waiting for get conditional user properties", paramString1, paramString3);
        }
      }
    }
    paramString3 = new ArrayList(((List)???).size());
    ??? = ((List)???).iterator();
    while (((Iterator)???).hasNext())
    {
      cd localcd = (cd)((Iterator)???).next();
      AppMeasurement.ConditionalUserProperty localConditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
      mAppId = paramString1;
      mOrigin = paramString2;
      mCreationTimestamp = e;
      mName = d.b;
      mValue = d.a();
      mActive = f;
      mTriggerEventName = g;
      if (h != null)
      {
        mTimedOutEventName = h.a;
        if (h.b != null) {
          mTimedOutEventParams = h.b.a();
        }
      }
      mTriggerTimeout = i;
      if (j != null)
      {
        mTriggeredEventName = j.a;
        if (j.b != null) {
          mTriggeredEventParams = j.b.a();
        }
      }
      mTriggeredTimestamp = d.c;
      mTimeToLive = k;
      if (l != null)
      {
        mExpiredEventName = l.a;
        if (l.b != null) {
          mExpiredEventParams = l.b.a();
        }
      }
      paramString3.add(localConditionalUserProperty);
    }
    return paramString3;
  }
  
  private Map<String, Object> b(final String paramString1, final String paramString2, final String paramString3, final boolean paramBoolean)
  {
    synchronized (new AtomicReference())
    {
      q.f().a(new Runnable()
      {
        public final void run()
        {
          q.m().a(localAtomicReference, paramString1, paramString2, paramString3, paramBoolean);
        }
      });
      try
      {
        ???.wait(5000L);
        paramString2 = (List)???.get();
        if (paramString2 == null)
        {
          uc.a("Timed out waiting for get user properties");
          return Collections.emptyMap();
        }
      }
      catch (InterruptedException paramString1)
      {
        for (;;)
        {
          uc.a("Interrupted waiting for get user properties", paramString1);
        }
      }
    }
    paramString1 = new a(paramString2.size());
    paramString2 = paramString2.iterator();
    while (paramString2.hasNext())
    {
      paramString3 = (do)paramString2.next();
      paramString1.put(b, paramString3.a());
    }
    return paramString1;
  }
  
  private void b(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    long l = super.m().a();
    com.google.android.gms.common.internal.c.a(paramString2);
    final AppMeasurement.ConditionalUserProperty localConditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
    mAppId = paramString1;
    mName = paramString2;
    mCreationTimestamp = l;
    if (paramString3 != null)
    {
      mExpiredEventName = paramString3;
      mExpiredEventParams = paramBundle;
    }
    super.t().a(new Runnable()
    {
      public final void run()
      {
        dh.b(dh.this, localConditionalUserProperty);
      }
    });
  }
  
  private void c(final AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    long l = super.m().a();
    com.google.android.gms.common.internal.c.a(paramConditionalUserProperty);
    com.google.android.gms.common.internal.c.a(mName);
    com.google.android.gms.common.internal.c.a(mOrigin);
    com.google.android.gms.common.internal.c.a(mValue);
    mCreationTimestamp = l;
    String str = mName;
    Object localObject1 = mValue;
    if (super.q().e(str) != 0)
    {
      ua.a("Invalid conditional user property name", str);
      return;
    }
    if (super.q().b(str, localObject1) != 0)
    {
      ua.a("Invalid conditional user property value", str, localObject1);
      return;
    }
    super.q();
    Object localObject2 = dr.c(str, localObject1);
    if (localObject2 == null)
    {
      ua.a("Unable to normalize conditional user property value", str, localObject1);
      return;
    }
    mValue = localObject2;
    l = mTriggerTimeout;
    if ((l > cf.N()) || (l < 1L))
    {
      ua.a("Invalid conditional user property timeout", str, Long.valueOf(l));
      return;
    }
    l = mTimeToLive;
    if ((l > cf.O()) || (l < 1L))
    {
      ua.a("Invalid conditional user property time to live", str, Long.valueOf(l));
      return;
    }
    super.t().a(new Runnable()
    {
      public final void run()
      {
        dh.a(dh.this, paramConditionalUserProperty);
      }
    });
  }
  
  private String d(long paramLong)
  {
    synchronized (new AtomicReference())
    {
      super.t().a(new Runnable()
      {
        public final void run()
        {
          k().a(localAtomicReference);
        }
      });
      try
      {
        ???.wait(paramLong);
        return (String)???.get();
      }
      catch (InterruptedException localInterruptedException)
      {
        uc.a("Interrupted waiting for app instance id");
        return null;
      }
    }
  }
  
  public final void A()
  {
    super.e();
    super.c();
    J();
    if (!q.b()) {}
    String str;
    do
    {
      return;
      super.k().z();
      str = super.v().F();
    } while ((TextUtils.isEmpty(str)) || (str.equals(super.j().y())));
    Bundle localBundle = new Bundle();
    localBundle.putString("_po", str);
    b("auto", "_ou", localBundle);
  }
  
  public final List<AppMeasurement.ConditionalUserProperty> a(String paramString1, String paramString2)
  {
    super.c();
    return b(null, paramString1, paramString2);
  }
  
  public final List<AppMeasurement.ConditionalUserProperty> a(String paramString1, String paramString2, String paramString3)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    super.b();
    return b(paramString1, paramString2, paramString3);
  }
  
  public final Map<String, Object> a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    super.b();
    return b(paramString1, paramString2, paramString3, paramBoolean);
  }
  
  public final Map<String, Object> a(String paramString1, String paramString2, boolean paramBoolean)
  {
    super.c();
    return b(null, paramString1, paramString2, paramBoolean);
  }
  
  protected final void a() {}
  
  public final void a(final long paramLong)
  {
    super.c();
    super.t().a(new Runnable()
    {
      public final void run()
      {
        v().k.a(paramLong);
        u().f.a("Minimum session duration set", Long.valueOf(paramLong));
      }
    });
  }
  
  public final void a(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    com.google.android.gms.common.internal.c.a(paramConditionalUserProperty);
    super.c();
    paramConditionalUserProperty = new AppMeasurement.ConditionalUserProperty(paramConditionalUserProperty);
    if (!TextUtils.isEmpty(mAppId)) {
      uc.a("Package name should be null when calling setConditionalUserProperty");
    }
    mAppId = null;
    c(paramConditionalUserProperty);
  }
  
  public final void a(AppMeasurement.b paramb)
  {
    super.e();
    super.c();
    J();
    if ((paramb != null) && (paramb != b)) {
      if (b != null) {
        break label46;
      }
    }
    label46:
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.c.a(bool, "EventInterceptor already set.");
      b = paramb;
      return;
    }
  }
  
  public final void a(AppMeasurement.c paramc)
  {
    super.c();
    J();
    com.google.android.gms.common.internal.c.a(paramc);
    if (!c.add(paramc)) {
      uc.a("OnEventListener already registered");
    }
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    super.c();
    if ((b == null) || (dr.i(paramString2))) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramString1, paramString2, paramBundle, bool, true);
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    super.c();
    a(paramString1, paramString2, paramLong, paramBundle, false, true, true);
  }
  
  public final void a(String paramString1, String paramString2, Object paramObject)
  {
    int i = 0;
    int j = 0;
    com.google.android.gms.common.internal.c.a(paramString1);
    long l = super.m().a();
    int k = super.q().e(paramString2);
    if (k != 0)
    {
      super.q();
      paramString1 = dr.a(paramString2, cf.z(), true);
      i = j;
      if (paramString2 != null) {
        i = paramString2.length();
      }
      q.i().a(k, "_ev", paramString1, i);
    }
    do
    {
      return;
      if (paramObject == null) {
        break;
      }
      j = super.q().b(paramString2, paramObject);
      if (j != 0)
      {
        super.q();
        paramString1 = dr.a(paramString2, cf.z(), true);
        if (((paramObject instanceof String)) || ((paramObject instanceof CharSequence))) {
          i = String.valueOf(paramObject).length();
        }
        q.i().a(j, "_ev", paramString1, i);
        return;
      }
      super.q();
      paramObject = dr.c(paramString2, paramObject);
    } while (paramObject == null);
    a(paramString1, paramString2, l, paramObject);
    return;
    a(paramString1, paramString2, l, null);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    super.b();
    b(paramString1, paramString2, paramString3, paramBundle);
  }
  
  public final void a(final boolean paramBoolean)
  {
    J();
    super.c();
    super.t().a(new Runnable()
    {
      public final void run()
      {
        dh.a(dh.this, paramBoolean);
      }
    });
  }
  
  public final List<do> b(final boolean paramBoolean)
  {
    super.c();
    J();
    uf.a("Fetching user attributes (FE)");
    synchronized (new AtomicReference())
    {
      q.f().a(new Runnable()
      {
        public final void run()
        {
          k().a(localObject1, paramBoolean);
        }
      });
      try
      {
        ???.wait(5000L);
        List localList = (List)((AtomicReference)???).get();
        ??? = localList;
        if (localList == null)
        {
          uc.a("Timed out waiting for get user properties");
          ??? = Collections.emptyList();
        }
        return (List<do>)???;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          uc.a("Interrupted waiting for get user properties", localInterruptedException);
        }
      }
    }
  }
  
  public final void b(final long paramLong)
  {
    super.c();
    super.t().a(new Runnable()
    {
      public final void run()
      {
        v().l.a(paramLong);
        u().f.a("Session timeout duration set", Long.valueOf(paramLong));
      }
    });
  }
  
  public final void b(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    com.google.android.gms.common.internal.c.a(paramConditionalUserProperty);
    com.google.android.gms.common.internal.c.a(mAppId);
    super.b();
    c(new AppMeasurement.ConditionalUserProperty(paramConditionalUserProperty));
  }
  
  public final void b(String paramString1, String paramString2, Bundle paramBundle)
  {
    super.c();
    if ((b == null) || (dr.i(paramString2))) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramString1, paramString2, paramBundle, bool, false);
      return;
    }
  }
  
  final String c(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = super.t();
    int i;
    if (Thread.currentThread() == a)
    {
      i = 1;
      if (i == 0) {
        break label47;
      }
      ua.a("Cannot retrieve app instance id from analytics worker thread");
    }
    label47:
    long l;
    do
    {
      do
      {
        return (String)localObject1;
        i = 0;
        break;
        super.t();
        if (db.x())
        {
          ua.a("Cannot retrieve app instance id from main thread");
          return null;
        }
        l = super.m().b();
        localObject2 = d(paramLong);
        l = super.m().b() - l;
        localObject1 = localObject2;
      } while (localObject2 != null);
      localObject1 = localObject2;
    } while (l >= paramLong);
    return d(paramLong - l);
  }
  
  public final void c(String paramString1, String paramString2, Bundle paramBundle)
  {
    super.c();
    b(null, paramString1, paramString2, paramBundle);
  }
  
  @TargetApi(14)
  public final void x()
  {
    if ((super.n().getApplicationContext() instanceof Application))
    {
      Application localApplication = (Application)super.n().getApplicationContext();
      if (a == null) {
        a = new a((byte)0);
      }
      localApplication.unregisterActivityLifecycleCallbacks(a);
      localApplication.registerActivityLifecycleCallbacks(a);
      ug.a("Registered activity lifecycle callback");
    }
  }
  
  public final b<String> y()
  {
    Object localObject2;
    try
    {
      Object localObject1 = super.v().C();
      if (localObject1 != null)
      {
        localObject2 = new h();
        ((h)localObject2).a(localObject1);
        return (b<String>)localObject2;
      }
      localObject1 = super.t().y();
      localObject2 = new Callable()
      {
        private String a()
        {
          ??? = v().C();
          if (??? != null) {
            return (String)???;
          }
          String str = h().c(120000L);
          if (str == null) {
            throw new TimeoutException();
          }
          cy localcy = v();
          synchronized (j)
          {
            h = str;
            i = localcy.m().b();
            return str;
          }
        }
      };
      com.google.android.gms.common.internal.c.a(localObject1, "Executor must not be null");
      com.google.android.gms.common.internal.c.a(localObject2, "Callback must not be null");
      h localh = new h();
      ((Executor)localObject1).execute(new d.1(localh, (Callable)localObject2));
      return localh;
    }
    catch (Exception localException)
    {
      uc.a("Failed to schedule task for getAppInstanceId");
      localObject2 = new h();
      ((h)localObject2).a(localException);
    }
    return (b<String>)localObject2;
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
    //   5: invokevirtual 66	com/google/android/gms/b/dh:J	()V
    //   8: aload_0
    //   9: invokespecial 428	com/google/android/gms/b/df:c	()V
    //   12: aload_0
    //   13: ldc2_w 826
    //   16: invokevirtual 829	com/google/android/gms/b/dh:c	(J)Ljava/lang/String;
    //   19: astore_2
    //   20: aload_2
    //   21: ifnonnull +7 -> 28
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: aload_0
    //   29: aconst_null
    //   30: putfield 57	com/google/android/gms/b/dh:f	Ljava/lang/String;
    //   33: aload_0
    //   34: aload_2
    //   35: putfield 55	com/google/android/gms/b/dh:e	Ljava/lang/String;
    //   38: aload_0
    //   39: getfield 55	com/google/android/gms/b/dh:e	Ljava/lang/String;
    //   42: astore_1
    //   43: goto -19 -> 24
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	dh
    //   1	42	1	str1	String
    //   46	4	1	localObject	Object
    //   19	16	2	str2	String
    // Exception table:
    //   from	to	target	type
    //   4	20	46	finally
    //   28	43	46	finally
  }
  
  @TargetApi(14)
  private final class a
    implements Application.ActivityLifecycleCallbacks
  {
    private a() {}
    
    public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      int j = 1;
      for (;;)
      {
        try
        {
          u().g.a("onActivityCreated");
          localObject1 = paramActivity.getIntent();
          if (localObject1 == null) {
            continue;
          }
          localUri = ((Intent)localObject1).getData();
          if ((localUri == null) || (!localUri.isHierarchical())) {
            continue;
          }
          if (paramBundle != null) {
            continue;
          }
          localBundle = q().a(localUri);
          q();
          localObject1 = ((Intent)localObject1).getStringExtra("android.intent.extra.REFERRER_NAME");
          if (("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(localObject1)) || ("https://www.google.com".equals(localObject1))) {
            continue;
          }
          if (!"android-app://com.google.appcrawler".equals(localObject1)) {
            break label389;
          }
        }
        catch (Throwable localThrowable)
        {
          Object localObject1;
          Uri localUri;
          Bundle localBundle;
          u().a.a("Throwable caught in onActivityCreated", localThrowable);
          localObject2 = l();
          if (paramBundle == null) {
            continue;
          }
          paramBundle = paramBundle.getBundle("com.google.firebase.analytics.screen_service");
          if (paramBundle == null) {
            continue;
          }
          paramActivity = ((di)localObject2).a(paramActivity);
          d = paramBundle.getLong("id");
          b = paramBundle.getString("name");
          c = paramBundle.getString("referrer_name");
          return;
          i = 0;
          continue;
          u().f.a("Activity created with referrer", localObject2);
          if (TextUtils.isEmpty((CharSequence)localObject2)) {
            continue;
          }
          a("auto", "_ldl", localObject2);
          continue;
          i = 1;
          if (i == 0) {
            break label394;
          }
          localObject2 = "gs";
          continue;
          return;
        }
        if (localBundle != null) {
          b((String)localObject1, "_cmp", localBundle);
        }
        localObject1 = localUri.getQueryParameter("referrer");
        if (TextUtils.isEmpty((CharSequence)localObject1)) {
          return;
        }
        if (((String)localObject1).contains("gclid"))
        {
          i = j;
          if (!((String)localObject1).contains("utm_campaign"))
          {
            i = j;
            if (!((String)localObject1).contains("utm_source"))
            {
              i = j;
              if (!((String)localObject1).contains("utm_medium"))
              {
                i = j;
                if (!((String)localObject1).contains("utm_term"))
                {
                  if (!((String)localObject1).contains("utm_content")) {
                    continue;
                  }
                  i = j;
                }
              }
            }
          }
          if (i != 0) {
            continue;
          }
          u().f.a("Activity created with data 'referrer' param without gclid and at least one utm field");
          return;
        }
        label389:
        int i = 0;
        continue;
        label394:
        Object localObject2 = "auto";
      }
    }
    
    public final void onActivityDestroyed(Activity paramActivity)
    {
      l().e.remove(paramActivity);
    }
    
    public final void onActivityPaused(Activity paramActivity)
    {
      di localdi = l();
      paramActivity = localdi.a(paramActivity);
      c = b;
      d = localdi.m().b();
      b = null;
      localdi.t().a(new di.2(localdi, paramActivity));
      paramActivity = s();
      long l = paramActivity.m().b();
      paramActivity.t().a(new dl.4(paramActivity, l));
    }
    
    public final void onActivityResumed(Activity paramActivity)
    {
      di localdi = l();
      localdi.a(paramActivity, localdi.a(paramActivity), false);
      localdi.f().a();
      paramActivity = s();
      long l = paramActivity.m().b();
      paramActivity.t().a(new dl.3(paramActivity, l));
    }
    
    public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
    {
      Object localObject = l();
      if (paramBundle != null)
      {
        paramActivity = (di.a)e.get(paramActivity);
        if (paramActivity != null)
        {
          localObject = new Bundle();
          ((Bundle)localObject).putLong("id", d);
          ((Bundle)localObject).putString("name", b);
          ((Bundle)localObject).putString("referrer_name", c);
          paramBundle.putBundle("com.google.firebase.analytics.screen_service", (Bundle)localObject);
        }
      }
    }
    
    public final void onActivityStarted(Activity paramActivity) {}
    
    public final void onActivityStopped(Activity paramActivity) {}
  }
}


/* Location:              com/google/android/gms/b/dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */