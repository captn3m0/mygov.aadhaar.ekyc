package com.google.android.gms.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ml$a
{
  final vc a;
  
  public ml$a(vc paramvc)
  {
    a = paramvc;
  }
  
  private static Intent a(Intent paramIntent, ResolveInfo paramResolveInfo)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramIntent);
    String str1 = activityInfo.packageName;
    String str2 = activityInfo.name;
    localIntent.setClassName(str1, str2);
    return localIntent;
  }
  
  private static Intent a(Uri paramUri)
  {
    Intent localIntent;
    if (paramUri == null) {
      localIntent = null;
    }
    for (;;)
    {
      return localIntent;
      localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW");
      int i = 268435456;
      localIntent.addFlags(i);
      localIntent.setData(paramUri);
      String str = "android.intent.action.VIEW";
      localIntent.setAction(str);
    }
  }
  
  private static ResolveInfo a(Context paramContext, Intent paramIntent)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    return a(paramContext, paramIntent, localArrayList);
  }
  
  private static ResolveInfo a(Context paramContext, Intent paramIntent, ArrayList paramArrayList)
  {
    Object localObject1 = null;
    int i = 65536;
    Object localObject2 = paramContext.getPackageManager();
    if (localObject2 == null) {
      return (ResolveInfo)localObject1;
    }
    List localList = ((PackageManager)localObject2).queryIntentActivities(paramIntent, i);
    ResolveInfo localResolveInfo = ((PackageManager)localObject2).resolveActivity(paramIntent, i);
    if ((localList != null) && (localResolveInfo != null))
    {
      int j = 0;
      localObject2 = null;
      i = 0;
      label58:
      j = localList.size();
      if (i < j)
      {
        localObject2 = (ResolveInfo)localList.get(i);
        if (localResolveInfo != null)
        {
          String str = activityInfo.name;
          localObject2 = activityInfo.name;
          boolean bool = str.equals(localObject2);
          if (!bool) {}
        }
      }
    }
    for (localObject2 = localResolveInfo;; localObject2 = null)
    {
      paramArrayList.addAll(localList);
      localObject1 = localObject2;
      break;
      int k = i + 1;
      i = k;
      break label58;
      k = 0;
    }
  }
  
  public final Intent a(Context paramContext, Map paramMap)
  {
    Object localObject1 = null;
    Object localObject2 = (ActivityManager)paramContext.getSystemService("activity");
    Object localObject3 = (String)paramMap.get("u");
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject3);
    if (bool1) {
      return (Intent)localObject1;
    }
    Object localObject4 = a;
    if (localObject4 != null)
    {
      w.e();
      localObject4 = a;
      localObject3 = tt.a((vc)localObject4, (String)localObject3);
    }
    localObject4 = Uri.parse((String)localObject3);
    boolean bool2 = Boolean.parseBoolean((String)paramMap.get("use_first_package"));
    boolean bool3 = Boolean.parseBoolean((String)paramMap.get("use_running_process"));
    localObject3 = "http";
    Object localObject5 = ((Uri)localObject4).getScheme();
    boolean bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject5);
    if (bool4)
    {
      localObject3 = ((Uri)localObject4).buildUpon();
      localObject1 = "https";
      localObject3 = ((Uri.Builder)localObject3).scheme((String)localObject1).build();
    }
    for (;;)
    {
      localObject5 = new java/util/ArrayList;
      ((ArrayList)localObject5).<init>();
      localObject4 = a((Uri)localObject4);
      localObject3 = a((Uri)localObject3);
      localObject1 = a(paramContext, (Intent)localObject4, (ArrayList)localObject5);
      if (localObject1 != null)
      {
        localObject1 = a((Intent)localObject4, (ResolveInfo)localObject1);
        break;
        localObject3 = "https";
        localObject5 = ((Uri)localObject4).getScheme();
        bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject5);
        if (!bool4) {
          break label476;
        }
        localObject3 = ((Uri)localObject4).buildUpon();
        localObject1 = "http";
        localObject3 = ((Uri.Builder)localObject3).scheme((String)localObject1).build();
        continue;
      }
      if (localObject3 != null)
      {
        localObject3 = a(paramContext, (Intent)localObject3);
        if (localObject3 != null)
        {
          localObject1 = a((Intent)localObject4, (ResolveInfo)localObject3);
          localObject3 = a(paramContext, (Intent)localObject1);
          if (localObject3 != null) {
            break;
          }
        }
      }
      int i = ((ArrayList)localObject5).size();
      if (i == 0)
      {
        localObject1 = localObject4;
        break;
      }
      boolean bool5;
      if ((bool3) && (localObject2 != null))
      {
        localObject1 = ((ActivityManager)localObject2).getRunningAppProcesses();
        if (localObject1 != null)
        {
          Iterator localIterator1 = ((ArrayList)localObject5).iterator();
          bool5 = localIterator1.hasNext();
          if (bool5)
          {
            localObject2 = localIterator1.next();
            localObject3 = localObject2;
            localObject3 = (ResolveInfo)localObject2;
            Iterator localIterator2 = ((List)localObject1).iterator();
            do
            {
              bool5 = localIterator2.hasNext();
              if (!bool5) {
                break;
              }
              localObject2 = nextprocessName;
              String str = activityInfo.packageName;
              bool5 = ((String)localObject2).equals(str);
            } while (!bool5);
            localObject1 = a((Intent)localObject4, (ResolveInfo)localObject3);
            break;
          }
        }
      }
      if (bool2)
      {
        bool5 = false;
        localObject2 = (ResolveInfo)((ArrayList)localObject5).get(0);
        localObject1 = a((Intent)localObject4, (ResolveInfo)localObject2);
        break;
      }
      localObject1 = localObject4;
      break;
      label476:
      i = 0;
      localObject3 = null;
    }
  }
}


/* Location:              com/google/android/gms/b/ml$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */