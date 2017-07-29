package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import java.util.List;

@qi
public final class ks
  implements gk
{
  CustomTabsSession a;
  CustomTabsClient b;
  a c;
  private CustomTabsServiceConnection d;
  
  public static boolean a(Context paramContext)
  {
    Object localObject1 = paramContext.getPackageManager();
    if (localObject1 == null) {}
    for (;;)
    {
      return false;
      Object localObject2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
      ResolveInfo localResolveInfo = ((PackageManager)localObject1).resolveActivity((Intent)localObject2, 0);
      localObject1 = ((PackageManager)localObject1).queryIntentActivities((Intent)localObject2, 65536);
      if ((localObject1 != null) && (localResolveInfo != null))
      {
        int i = 0;
        while (i < ((List)localObject1).size())
        {
          localObject2 = (ResolveInfo)((List)localObject1).get(i);
          if (activityInfo.name.equals(activityInfo.name)) {
            return activityInfo.packageName.equals(gi.a(paramContext));
          }
          i += 1;
        }
      }
    }
  }
  
  public final void a(Activity paramActivity)
  {
    if (d == null) {
      return;
    }
    paramActivity.unbindService(d);
    b = null;
    a = null;
    d = null;
  }
  
  public final void b(Activity paramActivity)
  {
    if (b != null) {}
    String str;
    do
    {
      return;
      str = gi.a(paramActivity);
    } while (str == null);
    d = new gj(this);
    CustomTabsClient.bindCustomTabsService(paramActivity, str, d);
  }
  
  public static abstract interface a {}
}


/* Location:              com/google/android/gms/b/ks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */