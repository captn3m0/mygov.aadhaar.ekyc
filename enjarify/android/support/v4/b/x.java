package android.support.v4.b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.v4.c.b;

public final class x
{
  private static final x.a a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/b/x$c;
      ((x.c)localObject).<init>();
    }
    for (a = (x.a)localObject;; a = (x.a)localObject)
    {
      return;
      localObject = new android/support/v4/b/x$b;
      ((x.b)localObject).<init>();
    }
  }
  
  public static Intent a(Activity paramActivity)
  {
    return a.a(paramActivity);
  }
  
  public static Intent a(Context paramContext, ComponentName paramComponentName)
  {
    Object localObject = b(paramContext, paramComponentName);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (Intent)localObject;
      ComponentName localComponentName = new android/content/ComponentName;
      String str = paramComponentName.getPackageName();
      localComponentName.<init>(str, (String)localObject);
      localObject = b(paramContext, localComponentName);
      if (localObject == null)
      {
        localObject = b.a(localComponentName);
      }
      else
      {
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>();
        localObject = ((Intent)localObject).setComponent(localComponentName);
      }
    }
  }
  
  public static boolean a(Activity paramActivity, Intent paramIntent)
  {
    return a.a(paramActivity, paramIntent);
  }
  
  public static String b(Activity paramActivity)
  {
    try
    {
      ComponentName localComponentName = paramActivity.getComponentName();
      return b(paramActivity, localComponentName);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(localNameNotFoundException);
      throw localIllegalArgumentException;
    }
  }
  
  public static String b(Context paramContext, ComponentName paramComponentName)
  {
    ActivityInfo localActivityInfo = paramContext.getPackageManager().getActivityInfo(paramComponentName, 128);
    return a.a(paramContext, localActivityInfo);
  }
  
  public static void b(Activity paramActivity, Intent paramIntent)
  {
    a.b(paramActivity, paramIntent);
  }
}


/* Location:              android/support/v4/b/x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */