package com.google.android.gms.b;

import android.os.IInterface;
import com.google.android.gms.a.a;

public abstract interface ja
  extends IInterface
{
  public abstract iv createAdLoaderBuilder(a parama, String paramString, oc paramoc, int paramInt);
  
  public abstract pb createAdOverlay(a parama);
  
  public abstract ix createBannerAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt);
  
  public abstract pi createInAppPurchaseManager(a parama);
  
  public abstract ix createInterstitialAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt);
  
  public abstract lj createNativeAdViewDelegate(a parama1, a parama2);
  
  public abstract rz createRewardedVideoAd(a parama, oc paramoc, int paramInt);
  
  public abstract ix createSearchAdManager(a parama, il paramil, String paramString, int paramInt);
  
  public abstract jc getMobileAdsSettingsManager(a parama);
  
  public abstract jc getMobileAdsSettingsManagerWithClientJarVersion(a parama, int paramInt);
}


/* Location:              com/google/android/gms/b/ja.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */