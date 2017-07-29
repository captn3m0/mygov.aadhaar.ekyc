package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.support.customtabs.CustomTabsSession;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.f;

public final class or
  implements com.google.android.gms.ads.mediation.e
{
  private Activity a;
  private ks b;
  private f c;
  private Uri d;
  
  public final void onDestroy()
  {
    Object localObject1 = "Destroying AdMobCustomTabsAdapter adapter.";
    ul.b((String)localObject1);
    try
    {
      localObject1 = b;
      localObject2 = a;
      ((ks)localObject1).a((Activity)localObject2);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = "Exception while unbinding from CustomTabsService.";
        ul.b((String)localObject2, localException);
      }
    }
  }
  
  public final void onPause()
  {
    ul.b("Pausing AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onResume()
  {
    ul.b("Resuming AdMobCustomTabsAdapter adapter.");
  }
  
  public final void requestInterstitialAd(Context paramContext, f paramf, Bundle paramBundle1, a parama, Bundle paramBundle2)
  {
    c = paramf;
    Object localObject = c;
    if (localObject == null)
    {
      localObject = "Listener not set for mediation. Returning.";
      ul.e((String)localObject);
    }
    for (;;)
    {
      return;
      boolean bool1 = paramContext instanceof Activity;
      if (!bool1)
      {
        ul.e("AdMobCustomTabs can only work with Activity context. Bailing out.");
        localObject = c;
        ((f)localObject).b(0);
      }
      else
      {
        bool1 = ks.a((Context)paramContext);
        if (!bool1)
        {
          ul.e("Default browser does not support custom tabs. Bailing out.");
          localObject = c;
          ((f)localObject).b(0);
        }
        else
        {
          localObject = paramBundle1.getString("tab_url");
          boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
          if (bool2)
          {
            ul.e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            localObject = c;
            ((f)localObject).b(0);
          }
          else
          {
            paramContext = (Activity)paramContext;
            a = paramContext;
            localObject = Uri.parse((String)localObject);
            d = ((Uri)localObject);
            localObject = new com/google/android/gms/b/ks;
            ((ks)localObject).<init>();
            b = ((ks)localObject);
            localObject = new com/google/android/gms/b/or$1;
            ((or.1)localObject).<init>();
            b.c = ((ks.a)localObject);
            localObject = b;
            Activity localActivity = a;
            ((ks)localObject).b(localActivity);
            localObject = c;
            ((f)localObject).f();
          }
        }
      }
    }
  }
  
  public final void showInterstitial()
  {
    or.3 local3 = null;
    Object localObject1 = new android/support/customtabs/CustomTabsIntent$Builder;
    Object localObject2 = b;
    Object localObject3 = b;
    if (localObject3 == null) {
      a = null;
    }
    for (;;)
    {
      localObject2 = a;
      ((CustomTabsIntent.Builder)localObject1).<init>((CustomTabsSession)localObject2);
      localObject1 = ((CustomTabsIntent.Builder)localObject1).build();
      localObject2 = intent;
      localObject3 = d;
      ((Intent)localObject2).setData((Uri)localObject3);
      localObject2 = new com/google/android/gms/ads/internal/overlay/e;
      localObject1 = intent;
      ((com.google.android.gms.ads.internal.overlay.e)localObject2).<init>((Intent)localObject1);
      localObject1 = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
      localObject3 = new com/google/android/gms/b/or$2;
      ((or.2)localObject3).<init>(this);
      un localun = new com/google/android/gms/b/un;
      localun.<init>(0, 0, false);
      ((AdOverlayInfoParcel)localObject1).<init>((com.google.android.gms.ads.internal.overlay.e)localObject2, null, (j)localObject3, null, localun);
      localObject2 = tt.a;
      local3 = new com/google/android/gms/b/or$3;
      local3.<init>(this, (AdOverlayInfoParcel)localObject1);
      ((Handler)localObject2).post(local3);
      ih = false;
      return;
      localObject3 = a;
      if (localObject3 == null)
      {
        localObject3 = b.newSession(null);
        a = ((CustomTabsSession)localObject3);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/or.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */