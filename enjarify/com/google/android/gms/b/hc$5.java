package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class hc$5
  implements hc.a
{
  hc$5(Activity paramActivity) {}
  
  public final void a(Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    Activity localActivity = a;
    paramActivityLifecycleCallbacks.onActivityStopped(localActivity);
  }
}


/* Location:              com/google/android/gms/b/hc$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */