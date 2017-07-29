package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gi
{
  private static String a;
  
  public static String a(Context paramContext)
  {
    int i = 0;
    Object localObject1 = a;
    if (localObject1 != null)
    {
      localObject1 = a;
      return (String)localObject1;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new android/content/Intent;
    Object localObject2 = Uri.parse("http://www.example.com");
    localIntent.<init>("android.intent.action.VIEW", (Uri)localObject2);
    localObject1 = localPackageManager.resolveActivity(localIntent, 0);
    if (localObject1 != null) {
      localObject1 = activityInfo.packageName;
    }
    for (localObject2 = localObject1;; localObject2 = null)
    {
      localObject1 = localPackageManager.queryIntentActivities(localIntent, 0);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (ResolveInfo)localIterator.next();
        Object localObject3 = new android/content/Intent;
        ((Intent)localObject3).<init>();
        ((Intent)localObject3).setAction("android.support.customtabs.action.CustomTabsService");
        String str = activityInfo.packageName;
        ((Intent)localObject3).setPackage(str);
        localObject3 = localPackageManager.resolveService((Intent)localObject3, 0);
        if (localObject3 != null)
        {
          localObject1 = activityInfo.packageName;
          localArrayList.add(localObject1);
        }
      }
      boolean bool1 = localArrayList.isEmpty();
      if (bool1) {
        a = null;
      }
      for (;;)
      {
        localObject1 = a;
        break;
        int j = localArrayList.size();
        i = 1;
        if (j == i)
        {
          localObject1 = (String)localArrayList.get(0);
          a = (String)localObject1;
        }
        else
        {
          boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
          if (!bool2)
          {
            bool2 = a(paramContext, localIntent);
            if (!bool2)
            {
              bool2 = localArrayList.contains(localObject2);
              if (bool2)
              {
                a = (String)localObject2;
                continue;
              }
            }
          }
          localObject1 = "com.android.chrome";
          bool2 = localArrayList.contains(localObject1);
          if (bool2)
          {
            localObject1 = "com.android.chrome";
            a = (String)localObject1;
          }
          else
          {
            localObject1 = "com.chrome.beta";
            bool2 = localArrayList.contains(localObject1);
            if (bool2)
            {
              localObject1 = "com.chrome.beta";
              a = (String)localObject1;
            }
            else
            {
              localObject1 = "com.chrome.dev";
              bool2 = localArrayList.contains(localObject1);
              if (bool2)
              {
                localObject1 = "com.chrome.dev";
                a = (String)localObject1;
              }
              else
              {
                localObject1 = "com.google.android.apps.chrome";
                bool2 = localArrayList.contains(localObject1);
                if (bool2)
                {
                  localObject1 = "com.google.android.apps.chrome";
                  a = (String)localObject1;
                }
              }
            }
          }
        }
      }
    }
  }
  
  private static boolean a(Context paramContext, Intent paramIntent)
  {
    for (;;)
    {
      try
      {
        localObject1 = paramContext.getPackageManager();
        int i = 64;
        localObject1 = ((PackageManager)localObject1).queryIntentActivities(paramIntent, i);
        if (localObject1 != null)
        {
          i = ((List)localObject1).size();
          if (i != 0) {
            continue;
          }
        }
        bool = false;
        localObject1 = null;
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject1;
        IntentFilter localIntentFilter;
        int j;
        int k;
        String str = "CustomTabsHelper";
        Object localObject2 = "Runtime exception while getting specialized handlers";
        Log.e(str, (String)localObject2);
        boolean bool = false;
        str = null;
        continue;
      }
      return bool;
      localObject2 = ((List)localObject1).iterator();
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        continue;
      }
      localObject1 = ((Iterator)localObject2).next();
      localObject1 = (ResolveInfo)localObject1;
      localIntentFilter = filter;
      if (localIntentFilter != null)
      {
        j = localIntentFilter.countDataAuthorities();
        if (j != 0)
        {
          k = localIntentFilter.countDataPaths();
          if (k != 0)
          {
            localObject1 = activityInfo;
            if (localObject1 != null) {
              bool = true;
            }
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/gi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */