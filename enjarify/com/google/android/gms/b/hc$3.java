package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class hc$3
  implements hc.a
{
  hc$3(Activity paramActivity) {}
  
  public final void a(Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    Activity localActivity = a;
    paramActivityLifecycleCallbacks.onActivityResumed(localActivity);
  }
}


/* Location:              com/google/android/gms/b/hc$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */