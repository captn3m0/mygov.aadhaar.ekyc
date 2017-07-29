package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class hc$1
  implements hc.a
{
  hc$1(Activity paramActivity, Bundle paramBundle) {}
  
  public final void a(Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    Activity localActivity = a;
    Bundle localBundle = b;
    paramActivityLifecycleCallbacks.onActivityCreated(localActivity, localBundle);
  }
}


/* Location:              com/google/android/gms/b/hc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */