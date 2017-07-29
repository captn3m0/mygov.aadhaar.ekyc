package android.support.v4.b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.c.b;
import android.util.Log;

class x$b
  implements x.a
{
  public Intent a(Activity paramActivity)
  {
    Intent localIntent = null;
    Object localObject1 = x.b(paramActivity);
    if (localObject1 == null) {}
    for (;;)
    {
      return localIntent;
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramActivity, (String)localObject1);
      try
      {
        localObject2 = x.b(paramActivity, localComponentName);
        if (localObject2 == null)
        {
          localIntent = b.a(localComponentName);
        }
        else
        {
          localObject2 = new android/content/Intent;
          ((Intent)localObject2).<init>();
          localIntent = ((Intent)localObject2).setComponent(localComponentName);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        String str1 = "NavUtils";
        Object localObject2 = new java/lang/StringBuilder;
        String str2 = "getParentActivityIntent: bad parentActivityName '";
        ((StringBuilder)localObject2).<init>(str2);
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = "' in manifest";
        localObject1 = (String)localObject2;
        Log.e(str1, (String)localObject1);
      }
    }
  }
  
  public String a(Context paramContext, ActivityInfo paramActivityInfo)
  {
    int i = 0;
    StringBuilder localStringBuilder = null;
    Object localObject = metaData;
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = metaData;
      String str = "android.support.PARENT_ACTIVITY";
      localObject = ((Bundle)localObject).getString(str);
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        localStringBuilder = null;
        i = ((String)localObject).charAt(0);
        int j = 46;
        if (i == j)
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          str = paramContext.getPackageName();
          localStringBuilder = localStringBuilder.append(str);
          localObject = (String)localObject;
        }
      }
    }
  }
  
  public boolean a(Activity paramActivity, Intent paramIntent)
  {
    String str1 = paramActivity.getIntent().getAction();
    boolean bool;
    if (str1 != null)
    {
      String str2 = "android.intent.action.MAIN";
      bool = str1.equals(str2);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public void b(Activity paramActivity, Intent paramIntent)
  {
    paramIntent.addFlags(67108864);
    paramActivity.startActivity(paramIntent);
    paramActivity.finish();
  }
}


/* Location:              android/support/v4/b/x$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */