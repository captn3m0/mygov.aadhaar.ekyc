package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e
  implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2
{
  private static final e c;
  final AtomicBoolean a;
  final AtomicBoolean b;
  private final ArrayList d;
  private boolean e;
  
  static
  {
    e locale = new com/google/android/gms/b/e;
    locale.<init>();
    c = locale;
  }
  
  private e()
  {
    Object localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    a = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    b = ((AtomicBoolean)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    d = ((ArrayList)localObject);
    e = false;
  }
  
  public static e a()
  {
    return c;
  }
  
  public static void a(Application paramApplication)
  {
    synchronized (c)
    {
      e locale2 = c;
      boolean bool1 = e;
      if (!bool1)
      {
        locale2 = c;
        paramApplication.registerActivityLifecycleCallbacks(locale2);
        locale2 = c;
        paramApplication.registerComponentCallbacks(locale2);
        locale2 = c;
        boolean bool2 = true;
        e = bool2;
      }
      return;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    synchronized (c)
    {
      Object localObject1 = d;
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (e.a)localObject1;
        ((e.a)localObject1).a(paramBoolean);
      }
    }
  }
  
  public final void a(e.a parama)
  {
    synchronized (c)
    {
      ArrayList localArrayList = d;
      localArrayList.add(parama);
      return;
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    boolean bool1 = true;
    AtomicBoolean localAtomicBoolean1 = a;
    boolean bool2 = localAtomicBoolean1.compareAndSet(bool1, false);
    AtomicBoolean localAtomicBoolean2 = b;
    localAtomicBoolean2.set(bool1);
    if (bool2) {
      a(false);
    }
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity)
  {
    boolean bool1 = true;
    AtomicBoolean localAtomicBoolean1 = a;
    boolean bool2 = localAtomicBoolean1.compareAndSet(bool1, false);
    AtomicBoolean localAtomicBoolean2 = b;
    localAtomicBoolean2.set(bool1);
    if (bool2) {
      a(false);
    }
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt)
  {
    boolean bool1 = true;
    int i = 20;
    if (paramInt == i)
    {
      AtomicBoolean localAtomicBoolean = a;
      boolean bool2 = localAtomicBoolean.compareAndSet(false, bool1);
      if (bool2)
      {
        localAtomicBoolean = b;
        localAtomicBoolean.set(bool1);
        a(bool1);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */