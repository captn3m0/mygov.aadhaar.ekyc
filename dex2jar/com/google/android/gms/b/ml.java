package com.google.android.gms.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.ads.internal.overlay.e;
import com.google.android.gms.ads.internal.w;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@qi
public final class ml
  implements md
{
  private final mf a;
  private final f b;
  private final ot c;
  
  public ml(mf parammf, f paramf, ot paramot)
  {
    a = parammf;
    b = paramf;
    c = paramot;
  }
  
  private void a(boolean paramBoolean)
  {
    if (c != null) {
      c.a(paramBoolean);
    }
  }
  
  private static boolean a(Map<String, String> paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }
  
  private static int b(Map<String, String> paramMap)
  {
    paramMap = (String)paramMap.get("o");
    if (paramMap != null)
    {
      if ("p".equalsIgnoreCase(paramMap)) {
        return w.g().b();
      }
      if ("l".equalsIgnoreCase(paramMap)) {
        return w.g().a();
      }
      if ("c".equalsIgnoreCase(paramMap)) {
        return w.g().c();
      }
    }
    return -1;
  }
  
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    Object localObject1 = (String)paramMap.get("a");
    if (localObject1 == null) {
      tp.e("Action missing from an open GMSG.");
    }
    vd localvd;
    do
    {
      return;
      if ((b != null) && (!b.a()))
      {
        b.a((String)paramMap.get("u"));
        return;
      }
      localvd = paramvc.l();
      if ("expand".equalsIgnoreCase((String)localObject1))
      {
        if (paramvc.p())
        {
          tp.e("Cannot expand WebView that is already expanded.");
          return;
        }
        a(false);
        localvd.a(a(paramMap), b(paramMap));
        return;
      }
      if ("webapp".equalsIgnoreCase((String)localObject1))
      {
        paramvc = (String)paramMap.get("u");
        a(false);
        if (paramvc != null)
        {
          localvd.a(a(paramMap), b(paramMap), paramvc);
          return;
        }
        localvd.a(a(paramMap), b(paramMap), (String)paramMap.get("html"), (String)paramMap.get("baseurl"));
        return;
      }
      if (!"in_app_purchase".equalsIgnoreCase((String)localObject1)) {
        break;
      }
      paramvc = (String)paramMap.get("product_id");
      paramMap = (String)paramMap.get("report_urls");
    } while (a == null);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = paramMap.split(" ");
      a.a(paramvc, new ArrayList(Arrays.asList(paramMap)));
      return;
    }
    a.a(paramvc, new ArrayList());
    return;
    Object localObject2;
    if (("app".equalsIgnoreCase((String)localObject1)) && ("true".equalsIgnoreCase((String)paramMap.get("system_browser"))))
    {
      a(true);
      localObject2 = paramvc.getContext();
      if (TextUtils.isEmpty((String)paramMap.get("u")))
      {
        tp.e("Destination url cannot be empty.");
        return;
      }
      localObject1 = paramvc.l();
      paramvc = new a(paramvc).a((Context)localObject2, paramMap);
      try
      {
        ((vd)localObject1).a(new e(paramvc));
        return;
      }
      catch (ActivityNotFoundException paramvc)
      {
        tp.e(paramvc.getMessage());
        return;
      }
    }
    a(true);
    Object localObject4 = (String)paramMap.get("intent_url");
    String str1 = (String)paramMap.get("u");
    if (!TextUtils.isEmpty((CharSequence)localObject4)) {
      try
      {
        localObject1 = Intent.parseUri((String)localObject4, 0);
        if ((localObject1 != null) && (((Intent)localObject1).getData() != null))
        {
          localObject4 = ((Intent)localObject1).getData();
          localObject2 = ((Uri)localObject4).toString();
          if (TextUtils.isEmpty((CharSequence)localObject2)) {
            break label598;
          }
          w.e();
          str2 = tt.a(paramvc, (String)localObject2);
        }
        localObject1 = "Error parsing the url: ".concat((String)localObject1);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        try
        {
          localObject2 = Uri.parse(str2);
          ((Intent)localObject1).setData((Uri)localObject2);
          if (localObject1 == null) {
            break label620;
          }
          localvd.a(new e((Intent)localObject1));
          return;
        }
        catch (Exception localException)
        {
          String str2;
          localObject3 = String.valueOf(str2);
          if (((String)localObject3).length() == 0) {
            break label605;
          }
        }
        localURISyntaxException = localURISyntaxException;
        localObject1 = String.valueOf(localObject4);
        if (((String)localObject1).length() == 0) {}
      }
    } else {
      for (;;)
      {
        tp.b((String)localObject1, localURISyntaxException);
        localObject1 = null;
        break;
        localObject1 = new String("Error parsing the url: ");
      }
    }
    label598:
    label605:
    for (Object localObject3 = "Error parsing the uri: ".concat((String)localObject3);; localObject3 = new String("Error parsing the uri: "))
    {
      tp.b((String)localObject3, localException);
      localObject3 = localObject4;
      break;
    }
    label620:
    if (!TextUtils.isEmpty(str1)) {
      w.e();
    }
    for (paramvc = tt.a(paramvc, str1);; paramvc = str1)
    {
      localvd.a(new e((String)paramMap.get("i"), paramvc, (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e")));
      return;
    }
  }
  
  public static final class a
  {
    final vc a;
    
    public a(vc paramvc)
    {
      a = paramvc;
    }
    
    private static Intent a(Intent paramIntent, ResolveInfo paramResolveInfo)
    {
      paramIntent = new Intent(paramIntent);
      paramIntent.setClassName(activityInfo.packageName, activityInfo.name);
      return paramIntent;
    }
    
    private static Intent a(Uri paramUri)
    {
      if (paramUri == null) {
        return null;
      }
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(268435456);
      localIntent.setData(paramUri);
      localIntent.setAction("android.intent.action.VIEW");
      return localIntent;
    }
    
    private static ResolveInfo a(Context paramContext, Intent paramIntent)
    {
      return a(paramContext, paramIntent, new ArrayList());
    }
    
    private static ResolveInfo a(Context paramContext, Intent paramIntent, ArrayList<ResolveInfo> paramArrayList)
    {
      paramContext = paramContext.getPackageManager();
      if (paramContext == null) {
        return null;
      }
      List localList = paramContext.queryIntentActivities(paramIntent, 65536);
      paramContext = paramContext.resolveActivity(paramIntent, 65536);
      int i;
      if ((localList != null) && (paramContext != null))
      {
        i = 0;
        if (i < localList.size())
        {
          paramIntent = (ResolveInfo)localList.get(i);
          if ((paramContext == null) || (!activityInfo.name.equals(activityInfo.name))) {}
        }
      }
      for (;;)
      {
        paramArrayList.addAll(localList);
        return paramContext;
        i += 1;
        break;
        paramContext = null;
      }
    }
    
    public final Intent a(Context paramContext, Map<String, String> paramMap)
    {
      Object localObject1 = null;
      Object localObject3 = (ActivityManager)paramContext.getSystemService("activity");
      Object localObject2 = (String)paramMap.get("u");
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        paramMap = (Map<String, String>)localObject1;
        return paramMap;
      }
      localObject1 = localObject2;
      if (a != null)
      {
        w.e();
        localObject1 = tt.a(a, (String)localObject2);
      }
      localObject1 = Uri.parse((String)localObject1);
      boolean bool1 = Boolean.parseBoolean((String)paramMap.get("use_first_package"));
      boolean bool2 = Boolean.parseBoolean((String)paramMap.get("use_running_process"));
      if ("http".equalsIgnoreCase(((Uri)localObject1).getScheme())) {
        paramMap = ((Uri)localObject1).buildUpon().scheme("https").build();
      }
      for (;;)
      {
        localObject2 = new ArrayList();
        Intent localIntent = a((Uri)localObject1);
        paramMap = a(paramMap);
        localObject1 = a(paramContext, localIntent, (ArrayList)localObject2);
        if (localObject1 != null)
        {
          return a(localIntent, (ResolveInfo)localObject1);
          if ("https".equalsIgnoreCase(((Uri)localObject1).getScheme())) {
            paramMap = ((Uri)localObject1).buildUpon().scheme("http").build();
          }
        }
        else
        {
          if (paramMap != null)
          {
            paramMap = a(paramContext, paramMap);
            if (paramMap != null)
            {
              localObject1 = a(localIntent, paramMap);
              paramMap = (Map<String, String>)localObject1;
              if (a(paramContext, (Intent)localObject1) != null) {
                break;
              }
            }
          }
          if (((ArrayList)localObject2).size() == 0) {
            return localIntent;
          }
          if ((bool2) && (localObject3 != null))
          {
            paramContext = ((ActivityManager)localObject3).getRunningAppProcesses();
            if (paramContext != null)
            {
              do
              {
                paramMap = ((ArrayList)localObject2).iterator();
                while (!((Iterator)localObject3).hasNext())
                {
                  if (!paramMap.hasNext()) {
                    break;
                  }
                  localObject1 = (ResolveInfo)paramMap.next();
                  localObject3 = paramContext.iterator();
                }
              } while (!nextprocessName.equals(activityInfo.packageName));
              return a(localIntent, (ResolveInfo)localObject1);
            }
          }
          if (bool1) {
            return a(localIntent, (ResolveInfo)((ArrayList)localObject2).get(0));
          }
          return localIntent;
        }
        paramMap = null;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */