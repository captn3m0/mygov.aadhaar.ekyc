package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
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
import com.google.android.gms.b.qi;
import com.google.android.gms.b.rw;
import com.google.android.gms.b.rz;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import com.google.android.gms.common.util.DynamiteApi;

@qi
@Keep
@DynamiteApi
public class ClientApi
  extends ja.a
{
  public iv createAdLoaderBuilder(a parama, String paramString, oc paramoc, int paramInt)
  {
    parama = (Context)b.a(parama);
    w.e();
    return new l(parama, paramString, paramoc, new un(paramInt, tt.j(parama)), e.a());
  }
  
  public pb createAdOverlay(a parama)
  {
    return new com.google.android.gms.ads.internal.overlay.g((Activity)b.a(parama));
  }
  
  public ix createBannerAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt)
  {
    parama = (Context)b.a(parama);
    w.e();
    return new g(parama, paramil, paramString, paramoc, new un(paramInt, tt.j(parama)), e.a());
  }
  
  public pi createInAppPurchaseManager(a parama)
  {
    return new com.google.android.gms.ads.internal.purchase.e((Activity)b.a(parama));
  }
  
  public ix createInterstitialAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt)
  {
    parama = (Context)b.a(parama);
    ke.a(parama);
    w.e();
    un localun = new un(paramInt, tt.j(parama));
    boolean bool = "reward_mb".equals(a);
    jz localjz;
    if (!bool)
    {
      localjz = ke.aW;
      if (((Boolean)w.q().a(localjz)).booleanValue()) {}
    }
    else
    {
      if (!bool) {
        break label121;
      }
      localjz = ke.aX;
      if (!((Boolean)w.q().a(localjz)).booleanValue()) {
        break label121;
      }
    }
    label121:
    for (paramInt = 1; paramInt != 0; paramInt = 0) {
      return new ne(parama, paramString, paramoc, localun, e.a());
    }
    return new m(parama, paramil, paramString, paramoc, localun, e.a());
  }
  
  public lj createNativeAdViewDelegate(a parama1, a parama2)
  {
    return new lg((FrameLayout)b.a(parama1), (FrameLayout)b.a(parama2));
  }
  
  public rz createRewardedVideoAd(a parama, oc paramoc, int paramInt)
  {
    parama = (Context)b.a(parama);
    w.e();
    un localun = new un(paramInt, tt.j(parama));
    return new rw(parama, e.a(), paramoc, localun);
  }
  
  public ix createSearchAdManager(a parama, il paramil, String paramString, int paramInt)
  {
    parama = (Context)b.a(parama);
    w.e();
    return new v(parama, paramil, paramString, new un(paramInt, tt.j(parama)));
  }
  
  public jc getMobileAdsSettingsManager(a parama)
  {
    return null;
  }
  
  public jc getMobileAdsSettingsManagerWithClientJarVersion(a parama, int paramInt)
  {
    parama = (Context)b.a(parama);
    w.e();
    return q.a(parama, new un(paramInt, tt.j(parama)));
  }
}


/* Location:              com/google/android/gms/ads/internal/ClientApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */