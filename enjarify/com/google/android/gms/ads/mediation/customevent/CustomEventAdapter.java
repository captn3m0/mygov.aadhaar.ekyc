package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.b.ul;

public final class CustomEventAdapter
  implements c, com.google.android.gms.ads.mediation.e, g
{
  b a;
  d b;
  e c;
  private View d;
  
  private static Object a(String paramString)
  {
    try
    {
      localObject1 = Class.forName(paramString);
      localObject1 = ((Class)localObject1).newInstance();
    }
    finally
    {
      for (;;)
      {
        int i = String.valueOf(paramString).length() + 46;
        int j = String.valueOf(localObject1).length();
        i += j;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(i);
        StringBuilder localStringBuilder = ((StringBuilder)localObject2).append("Could not instantiate custom event adapter: ").append(paramString);
        localObject2 = ". ";
        localStringBuilder = localStringBuilder.append((String)localObject2);
        ul.e((String)localObject1);
        Object localObject1 = null;
      }
    }
    return localObject1;
  }
  
  public final View getBannerView()
  {
    return d;
  }
  
  public final void onDestroy() {}
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final void requestBannerAd(Context paramContext, com.google.android.gms.ads.mediation.d paramd, Bundle paramBundle1, com.google.android.gms.ads.d paramd1, a parama, Bundle paramBundle2)
  {
    Object localObject = (b)a(paramBundle1.getString("class_name"));
    a = ((b)localObject);
    localObject = a;
    if (localObject == null)
    {
      localObject = null;
      paramd.a(0);
    }
    for (;;)
    {
      return;
      if (paramBundle2 != null)
      {
        localObject = paramBundle1.getString("class_name");
        paramBundle2.getBundle((String)localObject);
      }
      new CustomEventAdapter.a(this, paramd);
      localObject = "parameter";
      paramBundle1.getString((String)localObject);
    }
  }
  
  public final void requestInterstitialAd(Context paramContext, f paramf, Bundle paramBundle1, a parama, Bundle paramBundle2)
  {
    Object localObject = (d)a(paramBundle1.getString("class_name"));
    b = ((d)localObject);
    localObject = b;
    if (localObject == null)
    {
      localObject = null;
      paramf.b(0);
    }
    for (;;)
    {
      return;
      if (paramBundle2 != null)
      {
        localObject = paramBundle1.getString("class_name");
        paramBundle2.getBundle((String)localObject);
      }
      new CustomEventAdapter.b(this, this, paramf);
      localObject = "parameter";
      paramBundle1.getString((String)localObject);
    }
  }
  
  public final void requestNativeAd(Context paramContext, h paramh, Bundle paramBundle1, l paraml, Bundle paramBundle2)
  {
    Object localObject = (e)a(paramBundle1.getString("class_name"));
    c = ((e)localObject);
    localObject = c;
    if (localObject == null)
    {
      localObject = null;
      paramh.c(0);
    }
    for (;;)
    {
      return;
      if (paramBundle2 != null)
      {
        localObject = paramBundle1.getString("class_name");
        paramBundle2.getBundle((String)localObject);
      }
      new CustomEventAdapter.c(this, paramh);
      localObject = "parameter";
      paramBundle1.getString((String)localObject);
    }
  }
  
  public final void showInterstitial() {}
}


/* Location:              com/google/android/gms/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */