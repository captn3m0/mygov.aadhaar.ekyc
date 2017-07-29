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
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter
  implements c, com.google.android.gms.ads.mediation.e, g
{
  b a;
  d b;
  e c;
  private View d;
  
  private static <T> T a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return (T)localObject;
    }
    catch (Throwable localThrowable)
    {
      String str = String.valueOf(localThrowable.getMessage());
      ul.e(String.valueOf(paramString).length() + 46 + String.valueOf(str).length() + "Could not instantiate custom event adapter: " + paramString + ". " + str);
    }
    return null;
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
    a = ((b)a(paramBundle1.getString("class_name")));
    if (a == null)
    {
      paramd.a(0);
      return;
    }
    if (paramBundle2 != null) {
      paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    new a(this, paramd);
    paramBundle1.getString("parameter");
  }
  
  public final void requestInterstitialAd(Context paramContext, f paramf, Bundle paramBundle1, a parama, Bundle paramBundle2)
  {
    b = ((d)a(paramBundle1.getString("class_name")));
    if (b == null)
    {
      paramf.b(0);
      return;
    }
    if (paramBundle2 != null) {
      paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    new b(this, paramf);
    paramBundle1.getString("parameter");
  }
  
  public final void requestNativeAd(Context paramContext, h paramh, Bundle paramBundle1, l paraml, Bundle paramBundle2)
  {
    c = ((e)a(paramBundle1.getString("class_name")));
    if (c == null)
    {
      paramh.c(0);
      return;
    }
    if (paramBundle2 != null) {
      paramBundle2.getBundle(paramBundle1.getString("class_name"));
    }
    new c(this, paramh);
    paramBundle1.getString("parameter");
  }
  
  public final void showInterstitial() {}
  
  static final class a
  {
    private final CustomEventAdapter a;
    private final com.google.android.gms.ads.mediation.d b;
    
    public a(CustomEventAdapter paramCustomEventAdapter, com.google.android.gms.ads.mediation.d paramd)
    {
      a = paramCustomEventAdapter;
      b = paramd;
    }
  }
  
  final class b
  {
    private final CustomEventAdapter b;
    private final f c;
    
    public b(CustomEventAdapter paramCustomEventAdapter, f paramf)
    {
      b = paramCustomEventAdapter;
      c = paramf;
    }
  }
  
  static final class c
  {
    private final CustomEventAdapter a;
    private final h b;
    
    public c(CustomEventAdapter paramCustomEventAdapter, h paramh)
    {
      a = paramCustomEventAdapter;
      b = paramh;
    }
  }
}


/* Location:              com/google/android/gms/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */