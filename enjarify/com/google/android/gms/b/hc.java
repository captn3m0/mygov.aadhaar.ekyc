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
  private final WeakReference b;
  private boolean c = false;
  
  public hc(Application paramApplication, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramActivityLifecycleCallbacks);
    b = localWeakReference;
    a = paramApplication;
  }
  
  private void a(hc.a parama)
  {
    for (;;)
    {
      try
      {
        localObject = b;
        localObject = ((WeakReference)localObject).get();
        localObject = (Application.ActivityLifecycleCallbacks)localObject;
        if (localObject != null)
        {
          parama.a((Application.ActivityLifecycleCallbacks)localObject);
          return;
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        boolean bool;
        String str = "Error while dispatching lifecycle callback.";
        tp.b(str, localException);
        continue;
      }
      bool = c;
      if (!bool)
      {
        localObject = a;
        ((Application)localObject).unregisterActivityLifecycleCallbacks(this);
        bool = true;
        c = bool;
      }
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    hc.1 local1 = new com/google/android/gms/b/hc$1;
    local1.<init>(paramActivity, paramBundle);
    a(local1);
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    hc.7 local7 = new com/google/android/gms/b/hc$7;
    local7.<init>(paramActivity);
    a(local7);
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    hc.4 local4 = new com/google/android/gms/b/hc$4;
    local4.<init>(paramActivity);
    a(local4);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    hc.3 local3 = new com/google/android/gms/b/hc$3;
    local3.<init>(paramActivity);
    a(local3);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    hc.6 local6 = new com/google/android/gms/b/hc$6;
    local6.<init>(paramActivity, paramBundle);
    a(local6);
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    hc.2 local2 = new com/google/android/gms/b/hc$2;
    local2.<init>(paramActivity);
    a(local2);
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    hc.5 local5 = new com/google/android/gms/b/hc$5;
    local5.<init>(paramActivity);
    a(local5);
  }
}


/* Location:              com/google/android/gms/b/hc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */