package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.c;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.Map;

final class dh$a
  implements Application.ActivityLifecycleCallbacks
{
  private dh$a(dh paramdh) {}
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    label364:
    label518:
    label526:
    label595:
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      try
      {
        localObject2 = a;
        localObject2 = ((dh)localObject2).u();
        localObject2 = g;
        localObject3 = "onActivityCreated";
        ((cu.a)localObject2).a((String)localObject3);
        localObject2 = paramActivity.getIntent();
        if (localObject2 != null)
        {
          localObject3 = ((Intent)localObject2).getData();
          if (localObject3 != null)
          {
            boolean bool2 = ((Uri)localObject3).isHierarchical();
            if (bool2)
            {
              boolean bool4;
              if (paramBundle == null)
              {
                Object localObject4 = a;
                localObject4 = ((dh)localObject4).q();
                localObject4 = ((dr)localObject4).a((Uri)localObject3);
                Object localObject5 = a;
                ((dh)localObject5).q();
                localObject5 = "android.intent.extra.REFERRER_NAME";
                localObject2 = ((Intent)localObject2).getStringExtra((String)localObject5);
                localObject5 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com";
                boolean bool3 = ((String)localObject5).equals(localObject2);
                if (!bool3)
                {
                  localObject5 = "https://www.google.com";
                  bool3 = ((String)localObject5).equals(localObject2);
                  if (!bool3)
                  {
                    localObject5 = "android-app://com.google.appcrawler";
                    bool4 = ((String)localObject5).equals(localObject2);
                    if (!bool4) {
                      continue;
                    }
                  }
                }
                bool4 = bool1;
                if (!bool4) {
                  continue;
                }
                localObject2 = "gs";
                if (localObject4 != null)
                {
                  localObject5 = a;
                  String str = "_cmp";
                  ((dh)localObject5).b((String)localObject2, str, (Bundle)localObject4);
                }
              }
              localObject2 = "referrer";
              localObject2 = ((Uri)localObject3).getQueryParameter((String)localObject2);
              boolean bool5 = TextUtils.isEmpty((CharSequence)localObject2);
              if (bool5)
              {
                return;
                bool4 = false;
                localObject2 = null;
                continue;
                localObject2 = "auto";
                continue;
              }
              localObject3 = "gclid";
              bool5 = ((String)localObject2).contains((CharSequence)localObject3);
              if (!bool5) {
                break label518;
              }
              localObject3 = "utm_campaign";
              bool5 = ((String)localObject2).contains((CharSequence)localObject3);
              if (!bool5)
              {
                localObject3 = "utm_source";
                bool5 = ((String)localObject2).contains((CharSequence)localObject3);
                if (!bool5)
                {
                  localObject3 = "utm_medium";
                  bool5 = ((String)localObject2).contains((CharSequence)localObject3);
                  if (!bool5)
                  {
                    localObject3 = "utm_term";
                    bool5 = ((String)localObject2).contains((CharSequence)localObject3);
                    if (!bool5)
                    {
                      localObject3 = "utm_content";
                      bool5 = ((String)localObject2).contains((CharSequence)localObject3);
                      if (!bool5) {
                        break label518;
                      }
                    }
                  }
                }
              }
              if (bool1) {
                break label526;
              }
              Object localObject6 = a;
              localObject6 = ((dh)localObject6).u();
              localObject6 = f;
              localObject1 = "Activity created with data 'referrer' param without gclid and at least one utm field";
              ((cu.a)localObject6).a((String)localObject1);
              continue;
            }
          }
        }
        localObject8 = a.l();
      }
      finally
      {
        localObject1 = a.u().a;
        localObject2 = "Throwable caught in onActivityCreated";
        ((cu.a)localObject1).a((String)localObject2, localObject7);
      }
      for (;;)
      {
        if (paramBundle == null) {
          break label595;
        }
        localObject1 = paramBundle.getBundle("com.google.firebase.analytics.screen_service");
        if (localObject1 == null) {
          break;
        }
        Object localObject8 = ((di)localObject8).a(paramActivity);
        long l = ((Bundle)localObject1).getLong("id");
        d = l;
        localObject2 = ((Bundle)localObject1).getString("name");
        b = ((String)localObject2);
        localObject2 = "referrer_name";
        localObject1 = ((Bundle)localObject1).getString((String)localObject2);
        c = ((String)localObject1);
        break;
        bool1 = false;
        localObject8 = null;
        break label364;
        localObject8 = a;
        localObject8 = ((dh)localObject8).u();
        localObject8 = f;
        localObject1 = "Activity created with referrer";
        ((cu.a)localObject8).a((String)localObject1, localObject2);
        bool1 = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool1)
        {
          localObject8 = a;
          localObject1 = "auto";
          localObject3 = "_ldl";
          ((dh)localObject8).a((String)localObject1, (String)localObject3, localObject2);
        }
      }
    }
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a.l().e.remove(paramActivity);
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    Object localObject1 = a.l();
    Object localObject2 = ((di)localObject1).a(paramActivity);
    Object localObject3 = b;
    c = ((AppMeasurement.f)localObject3);
    long l = ((di)localObject1).m().b();
    d = l;
    b = null;
    localObject3 = ((di)localObject1).t();
    di.2 local2 = new com/google/android/gms/b/di$2;
    local2.<init>((di)localObject1, (di.a)localObject2);
    ((db)localObject3).a(local2);
    localObject1 = a.s();
    l = ((dl)localObject1).m().b();
    localObject2 = ((dl)localObject1).t();
    dl.4 local4 = new com/google/android/gms/b/dl$4;
    local4.<init>((dl)localObject1, l);
    ((db)localObject2).a(local4);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    Object localObject1 = a.l();
    Object localObject2 = ((di)localObject1).a(paramActivity);
    ((di)localObject1).a(paramActivity, (di.a)localObject2, false);
    ((di)localObject1).f().a();
    localObject1 = a.s();
    long l = ((dl)localObject1).m().b();
    localObject2 = ((dl)localObject1).t();
    dl.3 local3 = new com/google/android/gms/b/dl$3;
    local3.<init>((dl)localObject1, l);
    ((db)localObject2).a(local3);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    Object localObject = a.l();
    if (paramBundle != null)
    {
      localObject = (di.a)e.get(paramActivity);
      if (localObject != null)
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        long l = d;
        localBundle.putLong("id", l);
        String str1 = b;
        localBundle.putString("name", str1);
        String str2 = "referrer_name";
        localObject = c;
        localBundle.putString(str2, (String)localObject);
        localObject = "com.google.firebase.analytics.screen_service";
        paramBundle.putBundle((String)localObject, localBundle);
      }
    }
  }
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              com/google/android/gms/b/dh$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */