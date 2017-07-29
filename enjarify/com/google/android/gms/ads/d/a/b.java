package com.google.android.gms.ads.d.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.a;

public abstract interface b
  extends com.google.android.gms.ads.mediation.b
{
  public abstract void initialize(Context paramContext, a parama, String paramString, c paramc, Bundle paramBundle1, Bundle paramBundle2);
  
  public abstract boolean isInitialized();
  
  public abstract void loadAd(a parama, Bundle paramBundle1, Bundle paramBundle2);
  
  public abstract void showVideo();
}


/* Location:              com/google/android/gms/ads/d/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */