package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.b.dc;
import com.google.android.gms.b.dh;
import com.google.android.gms.b.di;
import com.google.android.gms.c.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.measurement.AppMeasurement;

public final class FirebaseAnalytics
{
  private final dc zzbqb;
  
  public FirebaseAnalytics(dc paramdc)
  {
    c.a(paramdc);
    zzbqb = paramdc;
  }
  
  public static FirebaseAnalytics getInstance(Context paramContext)
  {
    return ag;
  }
  
  public final b getAppInstanceId()
  {
    return zzbqb.h().y();
  }
  
  public final void logEvent(String paramString, Bundle paramBundle)
  {
    zzbqb.f.logEvent(paramString, paramBundle);
  }
  
  public final void setAnalyticsCollectionEnabled(boolean paramBoolean)
  {
    zzbqb.f.setMeasurementEnabled(paramBoolean);
  }
  
  public final void setCurrentScreen(Activity paramActivity, String paramString1, String paramString2)
  {
    zzbqb.l().a(paramActivity, paramString1, paramString2);
  }
  
  public final void setMinimumSessionDuration(long paramLong)
  {
    zzbqb.f.setMinimumSessionDuration(paramLong);
  }
  
  public final void setSessionTimeoutDuration(long paramLong)
  {
    zzbqb.f.setSessionTimeoutDuration(paramLong);
  }
  
  public final void setUserId(String paramString)
  {
    zzbqb.f.setUserId(paramString);
  }
  
  public final void setUserProperty(String paramString1, String paramString2)
  {
    zzbqb.f.setUserProperty(paramString1, paramString2);
  }
}


/* Location:              com/google/firebase/analytics/FirebaseAnalytics.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */