package android.support.v4.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

final class x$c
  extends x.b
{
  public final Intent a(Activity paramActivity)
  {
    Intent localIntent = paramActivity.getParentActivityIntent();
    if (localIntent == null) {
      localIntent = super.a(paramActivity);
    }
    return localIntent;
  }
  
  public final String a(Context paramContext, ActivityInfo paramActivityInfo)
  {
    String str = parentActivityName;
    if (str == null) {
      str = super.a(paramContext, paramActivityInfo);
    }
    return str;
  }
  
  public final boolean a(Activity paramActivity, Intent paramIntent)
  {
    return paramActivity.shouldUpRecreateTask(paramIntent);
  }
  
  public final void b(Activity paramActivity, Intent paramIntent)
  {
    paramActivity.navigateUpTo(paramIntent);
  }
}


/* Location:              android/support/v4/b/x$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */