package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class hc$2
  implements hc.a
{
  hc$2(Activity paramActivity) {}
  
  public final void a(Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    Activity localActivity = a;
    paramActivityLifecycleCallbacks.onActivityStarted(localActivity);
  }
}


/* Location:              com/google/android/gms/b/hc$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */