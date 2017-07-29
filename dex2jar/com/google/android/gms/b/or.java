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
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.f;

@qi
public final class or
  implements com.google.android.gms.ads.mediation.e
{
  private Activity a;
  private ks b;
  private f c;
  private Uri d;
  
  public final void onDestroy()
  {
    ul.b("Destroying AdMobCustomTabsAdapter adapter.");
    try
    {
      b.a(a);
      return;
    }
    catch (Exception localException)
    {
      ul.b("Exception while unbinding from CustomTabsService.", localException);
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
    if (c == null)
    {
      ul.e("Listener not set for mediation. Returning.");
      return;
    }
    if (!(paramContext instanceof Activity))
    {
      ul.e("AdMobCustomTabs can only work with Activity context. Bailing out.");
      c.b(0);
      return;
    }
    if (!ks.a(paramContext))
    {
      ul.e("Default browser does not support custom tabs. Bailing out.");
      c.b(0);
      return;
    }
    paramf = paramBundle1.getString("tab_url");
    if (TextUtils.isEmpty(paramf))
    {
      ul.e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
      c.b(0);
      return;
    }
    a = ((Activity)paramContext);
    d = Uri.parse(paramf);
    b = new ks();
    paramContext = new ks.a() {};
    b.c = paramContext;
    b.b(a);
    c.f();
  }
  
  public final void showInterstitial()
  {
    final Object localObject = b;
    if (b == null) {
      a = null;
    }
    for (;;)
    {
      localObject = new CustomTabsIntent.Builder(a).build();
      intent.setData(d);
      localObject = new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.e(intent), null, new j()
      {
        public final void a()
        {
          ul.b("AdMobCustomTabsAdapter overlay is closed.");
          or.a(or.this).h();
          try
          {
            or.c(or.this).a(or.b(or.this));
            return;
          }
          catch (Exception localException)
          {
            ul.b("Exception while unbinding from CustomTabsService.", localException);
          }
        }
        
        public final void b()
        {
          ul.b("AdMobCustomTabsAdapter overlay is paused.");
        }
        
        public final void c()
        {
          ul.b("AdMobCustomTabsAdapter overlay is resumed.");
        }
        
        public final void d()
        {
          ul.b("Opening AdMobCustomTabsAdapter overlay.");
          or.a(or.this).g();
        }
      }, null, new un(0, 0, false));
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          w.c();
          h.a(or.b(or.this), localObject, true);
        }
      });
      ih = false;
      return;
      if (a == null) {
        a = b.newSession(null);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/or.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */