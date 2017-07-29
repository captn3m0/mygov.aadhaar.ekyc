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
  private static final e c = new e();
  final AtomicBoolean a = new AtomicBoolean();
  final AtomicBoolean b = new AtomicBoolean();
  private final ArrayList<a> d = new ArrayList();
  private boolean e = false;
  
  public static e a()
  {
    return c;
  }
  
  public static void a(Application paramApplication)
  {
    synchronized (c)
    {
      if (!ce)
      {
        paramApplication.registerActivityLifecycleCallbacks(c);
        paramApplication.registerComponentCallbacks(c);
        ce = true;
      }
      return;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    synchronized (c)
    {
      Iterator localIterator = d.iterator();
      if (localIterator.hasNext()) {
        ((a)localIterator.next()).a(paramBoolean);
      }
    }
  }
  
  public final void a(a parama)
  {
    synchronized (c)
    {
      d.add(parama);
      return;
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    boolean bool = a.compareAndSet(true, false);
    b.set(true);
    if (bool) {
      a(false);
    }
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity)
  {
    boolean bool = a.compareAndSet(true, false);
    b.set(true);
    if (bool) {
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
    if ((paramInt == 20) && (a.compareAndSet(false, true)))
    {
      b.set(true);
      a(true);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}


/* Location:              com/google/android/gms/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */