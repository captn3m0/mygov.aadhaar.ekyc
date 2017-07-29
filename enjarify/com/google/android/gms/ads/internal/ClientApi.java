package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.b.il;
import com.google.android.gms.b.iv;
import com.google.android.gms.b.ix;
import com.google.android.gms.b.ja.a;
import com.google.android.gms.b.jc;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.lg;
import com.google.android.gms.b.lj;
import com.google.android.gms.b.ne;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.pb;
import com.google.android.gms.b.pi;
import com.google.android.gms.b.rw;
import com.google.android.gms.b.rz;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;

public class ClientApi
  extends ja.a
{
  public iv createAdLoaderBuilder(a parama, String paramString, oc paramoc, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    un localun = new com/google/android/gms/b/un;
    w.e();
    boolean bool = tt.j(localContext);
    localun.<init>(paramInt, bool);
    l locall = new com/google/android/gms/ads/internal/l;
    e locale = e.a();
    locall.<init>(localContext, paramString, paramoc, localun, locale);
    return locall;
  }
  
  public pb createAdOverlay(a parama)
  {
    Activity localActivity = (Activity)b.a(parama);
    com.google.android.gms.ads.internal.overlay.g localg = new com/google/android/gms/ads/internal/overlay/g;
    localg.<init>(localActivity);
    return localg;
  }
  
  public ix createBannerAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    un localun = new com/google/android/gms/b/un;
    w.e();
    boolean bool = tt.j(localContext);
    localun.<init>(paramInt, bool);
    g localg = new com/google/android/gms/ads/internal/g;
    e locale = e.a();
    localg.<init>(localContext, paramil, paramString, paramoc, localun, locale);
    return localg;
  }
  
  public pi createInAppPurchaseManager(a parama)
  {
    Activity localActivity = (Activity)b.a(parama);
    com.google.android.gms.ads.internal.purchase.e locale = new com/google/android/gms/ads/internal/purchase/e;
    locale.<init>(localActivity);
    return locale;
  }
  
  public ix createInterstitialAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    ke.a(localContext);
    un localun = new com/google/android/gms/b/un;
    w.e();
    boolean bool1 = tt.j(localContext);
    localun.<init>(paramInt, bool1);
    Object localObject1 = "reward_mb";
    Object localObject2 = a;
    boolean bool2 = ((String)localObject1).equals(localObject2);
    Object localObject3;
    if (!bool2)
    {
      localObject1 = ke.aW;
      localObject3 = w.q();
      localObject1 = (Boolean)((kd)localObject3).a((jz)localObject1);
      bool1 = ((Boolean)localObject1).booleanValue();
      if (bool1) {}
    }
    else
    {
      if (!bool2) {
        break label178;
      }
      localObject1 = ke.aX;
      localObject2 = w.q();
      localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
      bool1 = ((Boolean)localObject1).booleanValue();
      if (!bool1) {
        break label178;
      }
    }
    bool1 = true;
    Object localObject4;
    if (bool1)
    {
      localObject1 = new com/google/android/gms/b/ne;
      localObject4 = e.a();
      localObject2 = paramString;
      localObject3 = paramoc;
      ((ne)localObject1).<init>(localContext, paramString, paramoc, localun, (e)localObject4);
    }
    for (;;)
    {
      return (ix)localObject1;
      label178:
      bool1 = false;
      localObject1 = null;
      break;
      localObject4 = new com/google/android/gms/ads/internal/m;
      e locale = e.a();
      ((m)localObject4).<init>(localContext, paramil, paramString, paramoc, localun, locale);
      localObject1 = localObject4;
    }
  }
  
  public lj createNativeAdViewDelegate(a parama1, a parama2)
  {
    FrameLayout localFrameLayout1 = (FrameLayout)b.a(parama1);
    FrameLayout localFrameLayout2 = (FrameLayout)b.a(parama2);
    lg locallg = new com/google/android/gms/b/lg;
    locallg.<init>(localFrameLayout1, localFrameLayout2);
    return locallg;
  }
  
  public rz createRewardedVideoAd(a parama, oc paramoc, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    un localun = new com/google/android/gms/b/un;
    w.e();
    boolean bool = tt.j(localContext);
    localun.<init>(paramInt, bool);
    rw localrw = new com/google/android/gms/b/rw;
    e locale = e.a();
    localrw.<init>(localContext, locale, paramoc, localun);
    return localrw;
  }
  
  public ix createSearchAdManager(a parama, il paramil, String paramString, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    un localun = new com/google/android/gms/b/un;
    w.e();
    boolean bool = tt.j(localContext);
    localun.<init>(paramInt, bool);
    v localv = new com/google/android/gms/ads/internal/v;
    localv.<init>(localContext, paramil, paramString, localun);
    return localv;
  }
  
  public jc getMobileAdsSettingsManager(a parama)
  {
    return null;
  }
  
  public jc getMobileAdsSettingsManagerWithClientJarVersion(a parama, int paramInt)
  {
    Context localContext = (Context)b.a(parama);
    un localun = new com/google/android/gms/b/un;
    w.e();
    boolean bool = tt.j(localContext);
    localun.<init>(paramInt, bool);
    return q.a(localContext, localun);
  }
}


/* Location:              com/google/android/gms/ads/internal/ClientApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */