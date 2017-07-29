package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.g.a;
import com.google.android.gms.b.ab;
import com.google.android.gms.b.by;
import com.google.android.gms.b.cf;
import com.google.android.gms.b.cu;
import com.google.android.gms.b.cu.a;
import com.google.android.gms.b.dc;
import com.google.android.gms.b.dh;
import com.google.android.gms.b.di;
import com.google.android.gms.b.do;
import com.google.android.gms.b.dr;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.d;
import com.google.firebase.analytics.FirebaseAnalytics.a;
import com.google.firebase.analytics.FirebaseAnalytics.b;
import com.google.firebase.analytics.FirebaseAnalytics.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
@Keep
public class AppMeasurement
{
  private final dc zzbqb;
  
  public AppMeasurement(dc paramdc)
  {
    c.a(paramdc);
    zzbqb = paramdc;
  }
  
  @Deprecated
  @Keep
  public static AppMeasurement getInstance(Context paramContext)
  {
    return af;
  }
  
  private void zzc(String paramString1, String paramString2, Object paramObject)
  {
    zzbqb.h().a(paramString1, paramString2, paramObject);
  }
  
  @Keep
  public void beginAdUnitExposure(String paramString)
  {
    zzbqb.q().a(paramString);
  }
  
  @Keep
  protected void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    zzbqb.h().c(paramString1, paramString2, paramBundle);
  }
  
  @Keep
  protected void clearConditionalUserPropertyAs(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    zzbqb.h().a(paramString1, paramString2, paramString3, paramBundle);
  }
  
  @Keep
  public void endAdUnitExposure(String paramString)
  {
    zzbqb.q().b(paramString);
  }
  
  @Keep
  public long generateEventId()
  {
    return zzbqb.i().x();
  }
  
  @Keep
  public String getAppInstanceId()
  {
    return zzbqb.h().z();
  }
  
  @Keep
  public List<ConditionalUserProperty> getConditionalUserProperties(String paramString1, String paramString2)
  {
    return zzbqb.h().a(paramString1, paramString2);
  }
  
  @Keep
  protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String paramString1, String paramString2, String paramString3)
  {
    return zzbqb.h().a(paramString1, paramString2, paramString3);
  }
  
  @Keep
  public String getCurrentScreenClass()
  {
    f localf = zzbqb.l().y();
    if (localf != null) {
      return c;
    }
    return null;
  }
  
  @Keep
  public String getCurrentScreenName()
  {
    f localf = zzbqb.l().y();
    if (localf != null) {
      return b;
    }
    return null;
  }
  
  @Keep
  public String getGmpAppId()
  {
    try
    {
      String str = ab.a();
      return str;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      zzbqb.e().a.a("getGoogleAppId failed with exception", localIllegalStateException);
    }
    return null;
  }
  
  @Keep
  public int getMaxUserProperties(String paramString)
  {
    zzbqb.h();
    c.a(paramString);
    return cf.L();
  }
  
  @Keep
  protected Map<String, Object> getUserProperties(String paramString1, String paramString2, boolean paramBoolean)
  {
    return zzbqb.h().a(paramString1, paramString2, paramBoolean);
  }
  
  @Keep
  protected Map<String, Object> getUserPropertiesAs(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    return zzbqb.h().a(paramString1, paramString2, paramString3, paramBoolean);
  }
  
  public void logEvent(String paramString, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    cf.W();
    if (!"_iap".equals(paramString))
    {
      int j = zzbqb.i().b(paramString);
      if (j != 0)
      {
        zzbqb.i();
        paramBundle = dr.a(paramString, cf.y(), true);
        if (paramString != null) {}
        for (int i = paramString.length();; i = 0)
        {
          zzbqb.i().a(j, "_ev", paramBundle, i);
          return;
        }
      }
    }
    zzbqb.h().a("app", paramString, localBundle);
  }
  
  @Keep
  public void logEventInternal(String paramString1, String paramString2, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    zzbqb.h().b(paramString1, paramString2, localBundle);
  }
  
  @Keep
  public void registerOnScreenChangeCallback(d paramd)
  {
    zzbqb.l().a(paramd);
  }
  
  @Keep
  protected void setConditionalUserProperty(ConditionalUserProperty paramConditionalUserProperty)
  {
    zzbqb.h().a(paramConditionalUserProperty);
  }
  
  @Keep
  protected void setConditionalUserPropertyAs(ConditionalUserProperty paramConditionalUserProperty)
  {
    zzbqb.h().b(paramConditionalUserProperty);
  }
  
  @Deprecated
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    zzbqb.h().a(paramBoolean);
  }
  
  public void setMinimumSessionDuration(long paramLong)
  {
    zzbqb.h().a(paramLong);
  }
  
  public void setSessionTimeoutDuration(long paramLong)
  {
    zzbqb.h().b(paramLong);
  }
  
  public void setUserId(String paramString)
  {
    zzb("app", "_id", paramString);
  }
  
  public void setUserProperty(String paramString1, String paramString2)
  {
    int j = zzbqb.i().d(paramString1);
    if (j != 0)
    {
      zzbqb.i();
      paramString2 = dr.a(paramString1, cf.z(), true);
      if (paramString1 != null) {}
      for (int i = paramString1.length();; i = 0)
      {
        zzbqb.i().a(j, "_ev", paramString2, i);
        return;
      }
    }
    zzb("app", paramString1, paramString2);
  }
  
  @Keep
  public void unregisterOnScreenChangeCallback(d paramd)
  {
    zzbqb.l().b(paramd);
  }
  
  public void zza(b paramb)
  {
    zzbqb.h().a(paramb);
  }
  
  public void zza(c paramc)
  {
    zzbqb.h().a(paramc);
  }
  
  public void zza(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    for (;;)
    {
      zzbqb.h().a(paramString1, paramString2, paramBundle, paramLong);
      return;
    }
  }
  
  public Map<String, Object> zzaI(boolean paramBoolean)
  {
    Object localObject = zzbqb.h().b(paramBoolean);
    a locala = new a(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      do localdo = (do)((Iterator)localObject).next();
      locala.put(b, localdo.a());
    }
    return locala;
  }
  
  public void zzb(String paramString1, String paramString2, Object paramObject)
  {
    zzc(paramString1, paramString2, paramObject);
  }
  
  public static class ConditionalUserProperty
  {
    @Keep
    public boolean mActive;
    @Keep
    public String mAppId;
    @Keep
    public long mCreationTimestamp;
    @Keep
    public String mExpiredEventName;
    @Keep
    public Bundle mExpiredEventParams;
    @Keep
    public String mName;
    @Keep
    public String mOrigin;
    @Keep
    public long mTimeToLive;
    @Keep
    public String mTimedOutEventName;
    @Keep
    public Bundle mTimedOutEventParams;
    @Keep
    public String mTriggerEventName;
    @Keep
    public long mTriggerTimeout;
    @Keep
    public String mTriggeredEventName;
    @Keep
    public Bundle mTriggeredEventParams;
    @Keep
    public long mTriggeredTimestamp;
    @Keep
    public Object mValue;
    
    public ConditionalUserProperty() {}
    
    public ConditionalUserProperty(ConditionalUserProperty paramConditionalUserProperty)
    {
      c.a(paramConditionalUserProperty);
      mAppId = mAppId;
      mOrigin = mOrigin;
      mCreationTimestamp = mCreationTimestamp;
      mName = mName;
      if (mValue != null)
      {
        mValue = dr.a(mValue);
        if (mValue == null) {
          mValue = mValue;
        }
      }
      mValue = mValue;
      mActive = mActive;
      mTriggerEventName = mTriggerEventName;
      mTriggerTimeout = mTriggerTimeout;
      mTimedOutEventName = mTimedOutEventName;
      if (mTimedOutEventParams != null) {
        mTimedOutEventParams = new Bundle(mTimedOutEventParams);
      }
      mTriggeredEventName = mTriggeredEventName;
      if (mTriggeredEventParams != null) {
        mTriggeredEventParams = new Bundle(mTriggeredEventParams);
      }
      mTriggeredTimestamp = mTriggeredTimestamp;
      mTimeToLive = mTimeToLive;
      mExpiredEventName = mExpiredEventName;
      if (mExpiredEventParams != null) {
        mExpiredEventParams = new Bundle(mExpiredEventParams);
      }
    }
  }
  
  public static final class a
    extends FirebaseAnalytics.a
  {
    public static final Map<String, String> a = d.a(new String[] { "app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "firebase_ad_exposure", "firebase_adunit_exposure", "firebase_extra_parameter" }, new String[] { "_cd", "_ae", "_ui", "_in", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_ep" });
  }
  
  public static abstract interface b {}
  
  public static abstract interface c {}
  
  public static abstract interface d
  {
    public abstract boolean a();
  }
  
  public static final class e
    extends FirebaseAnalytics.b
  {
    public static final Map<String, String> a = d.a(new String[] { "firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "debug", "realtime", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "firebase_event_id", "firebase_extra_params_ct", "firebase_group_name", "firebase_list_length", "firebase_index", "firebase_event_name" }, new String[] { "_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_dbg", "_r", "_o", "_sn", "_sc", "_si", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en" });
  }
  
  public static class f
  {
    public String b;
    public String c;
    public long d;
    
    public f() {}
    
    public f(f paramf)
    {
      b = b;
      c = c;
      d = d;
    }
  }
  
  public static final class g
    extends FirebaseAnalytics.c
  {
    public static final Map<String, String> a = d.a(new String[] { "firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id" }, new String[] { "_ln", "_fot", "_fvt", "_ldl", "_id" });
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */