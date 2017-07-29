package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class hc
  implements Application.ActivityLifecycleCallbacks
{
  private final Application a;
  private final WeakReference<Application.ActivityLifecycleCallbacks> b;
  private boolean c = false;
  
  public hc(Application paramApplication, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    b = new WeakReference(paramActivityLifecycleCallbacks);
    a = paramApplication;
  }
  
  private void a(a parama)
  {
    try
    {
      Application.ActivityLifecycleCallbacks localActivityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)b.get();
      if (localActivityLifecycleCallbacks != null)
      {
        parama.a(localActivityLifecycleCallbacks);
        return;
      }
      if (!c)
      {
        a.unregisterActivityLifecycleCallbacks(this);
        c = true;
        return;
      }
    }
    catch (Exception parama)
    {
      tp.b("Error while dispatching lifecycle callback.", parama);
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, final Bundle paramBundle)
  {
    a(new a()
    {
      public final void a(Application.ActivityLifecycleCallbacks paramAnonymousActivityLifecycleCallbacks)
      {
        paramAnonymousActivityLifecycleCallbacks.onActivityCreated(hc.this, paramBundle);
      }
    });
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a(new a()
    {
      public final void a(Application.ActivityLifecycleCallbacks paramAnonymousActivityLifecycleCallbacks)
      {
        paramAnonymousActivityLifecycleCallbacks.onActivityDestroyed(hc.this);
      }
    });
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(new a()
    {
      public final void a(Application.ActivityLifecycleCallbacks paramAnonymousActivityLifecycleCallbacks)
      {
        paramAnonymousActivityLifecycleCallbacks.onActivityPaused(hc.this);
      }
    });
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(new a()
    {
      public final void a(Application.ActivityLifecycleCallbacks paramAnonymousActivityLifecycleCallbacks)
      {
        paramAnonymousActivityLifecycleCallbacks.onActivityResumed(hc.this);
      }
    });
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, final Bundle paramBundle)
  {
    a(new a()
    {
      public final void a(Application.ActivityLifecycleCallbacks paramAnonymousActivityLifecycleCallbacks)
      {
        paramAnonymousActivityLifecycleCallbacks.onActivitySaveInstanceState(hc.this, paramBundle);
      }
    });
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(new a()
    {
      public final void a(Application.ActivityLifecycleCallbacks paramAnonymousActivityLifecycleCallbacks)
      {
        paramAnonymousActivityLifecycleCallbacks.onActivityStarted(hc.this);
      }
    });
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a(new a()
    {
      public final void a(Application.ActivityLifecycleCallbacks paramAnonymousActivityLifecycleCallbacks)
      {
        paramAnonymousActivityLifecycleCallbacks.onActivityStopped(hc.this);
      }
    });
  }
  
  public static abstract interface a
  {
    public abstract void a(Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks);
  }
}


/* Location:              com/google/android/gms/b/hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */