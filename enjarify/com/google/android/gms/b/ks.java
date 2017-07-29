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

public final class ks
  implements gk
{
  CustomTabsSession a;
  CustomTabsClient b;
  ks.a c;
  private CustomTabsServiceConnection d;
  
  public static boolean a(Context paramContext)
  {
    boolean bool1 = false;
    Object localObject1 = paramContext.getPackageManager();
    if (localObject1 == null) {}
    Object localObject3;
    ResolveInfo localResolveInfo;
    do
    {
      return bool1;
      localObject2 = new android/content/Intent;
      localObject3 = Uri.parse("http://www.example.com");
      ((Intent)localObject2).<init>("android.intent.action.VIEW", (Uri)localObject3);
      localResolveInfo = ((PackageManager)localObject1).resolveActivity((Intent)localObject2, 0);
      int i = 65536;
      localObject3 = ((PackageManager)localObject1).queryIntentActivities((Intent)localObject2, i);
    } while ((localObject3 == null) || (localResolveInfo == null));
    int j = 0;
    Object localObject2 = null;
    for (;;)
    {
      int k = ((List)localObject3).size();
      if (j >= k) {
        break;
      }
      localObject1 = (ResolveInfo)((List)localObject3).get(j);
      String str = activityInfo.name;
      localObject1 = activityInfo.name;
      boolean bool2 = str.equals(localObject1);
      if (bool2)
      {
        localObject1 = activityInfo.packageName;
        localObject2 = gi.a(paramContext);
        bool1 = ((String)localObject1).equals(localObject2);
        break;
      }
      int m = j + 1;
      j = m;
    }
  }
  
  public final void a(Activity paramActivity)
  {
    CustomTabsServiceConnection localCustomTabsServiceConnection = d;
    if (localCustomTabsServiceConnection == null) {}
    for (;;)
    {
      return;
      localCustomTabsServiceConnection = d;
      paramActivity.unbindService(localCustomTabsServiceConnection);
      b = null;
      a = null;
      d = null;
    }
  }
  
  public final void b(Activity paramActivity)
  {
    Object localObject1 = b;
    if (localObject1 != null) {}
    for (;;)
    {
      return;
      localObject1 = gi.a(paramActivity);
      if (localObject1 != null)
      {
        Object localObject2 = new com/google/android/gms/b/gj;
        ((gj)localObject2).<init>(this);
        d = ((CustomTabsServiceConnection)localObject2);
        localObject2 = d;
        CustomTabsClient.bindCustomTabsService(paramActivity, (String)localObject1, (CustomTabsServiceConnection)localObject2);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */