package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;

public final class cp
{
  public static a<Long> A = a.a("measurement.upload.realtime_upload_interval", 10000L, 10000L);
  public static a<Long> B = a.a("measurement.upload.debug_upload_interval", 1000L, 1000L);
  public static a<Long> C = a.a("measurement.upload.minimum_delay", 500L, 500L);
  public static a<Long> D = a.a("measurement.alarm_manager.minimum_interval", 60000L, 60000L);
  public static a<Long> E = a.a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L);
  public static a<Long> F = a.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L);
  public static a<Long> G = a.a("measurement.upload.initial_upload_delay_time", 15000L, 15000L);
  public static a<Long> H = a.a("measurement.upload.retry_time", 1800000L, 1800000L);
  public static a<Integer> I = a.a("measurement.upload.retry_count", 6);
  public static a<Long> J = a.a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);
  public static a<Integer> K = a.a("measurement.lifetimevalue.max_currency_tracked", 4);
  public static a<Integer> L = a.a("measurement.audience.filter_result_max_count", 200);
  public static a<Long> M = a.a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L);
  public static a<Boolean> a = a.a("measurement.service_enabled", true);
  public static a<Boolean> b = a.a("measurement.service_client_enabled", true);
  public static a<Boolean> c = a.a("measurement.log_third_party_store_events_enabled", false);
  public static a<Boolean> d = a.a("measurement.log_installs_enabled", false);
  public static a<Boolean> e = a.a("measurement.log_upgrades_enabled", false);
  public static a<Boolean> f = a.a("measurement.log_androidId_enabled", false);
  public static a<String> g = a.a("measurement.log_tag", "FA", "FA-SVC");
  public static a<Long> h = a.a("measurement.ad_id_cache_time", 10000L, 10000L);
  public static a<Long> i = a.a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L);
  public static a<Long> j = a.a("measurement.config.cache_time", 86400000L, 3600000L);
  public static a<String> k = a.a("measurement.config.url_scheme", "https", "https");
  public static a<String> l = a.a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com");
  public static a<Integer> m = a.a("measurement.upload.max_bundles", 100);
  public static a<Integer> n = a.a("measurement.upload.max_batch_size", 65536);
  public static a<Integer> o = a.a("measurement.upload.max_bundle_size", 65536);
  public static a<Integer> p = a.a("measurement.upload.max_events_per_bundle", 1000);
  public static a<Integer> q = a.a("measurement.upload.max_events_per_day", 100000);
  public static a<Integer> r = a.a("measurement.upload.max_error_events_per_day", 1000);
  public static a<Integer> s = a.a("measurement.upload.max_public_events_per_day", 50000);
  public static a<Integer> t = a.a("measurement.upload.max_conversions_per_day", 500);
  public static a<Integer> u = a.a("measurement.upload.max_realtime_events_per_day", 10);
  public static a<Integer> v = a.a("measurement.store.max_stored_events_per_app", 100000);
  public static a<String> w = a.a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");
  public static a<Long> x = a.a("measurement.upload.backoff_period", 43200000L, 43200000L);
  public static a<Long> y = a.a("measurement.upload.window_interval", 3600000L, 3600000L);
  public static a<Long> z = a.a("measurement.upload.interval", 3600000L, 3600000L);
  
  public static final class a<V>
  {
    final V a;
    final String b;
    private final av<V> c;
    
    private a(String paramString, av<V> paramav, V paramV)
    {
      c.a(paramav);
      c = paramav;
      a = paramV;
      b = paramString;
    }
    
    static a<Integer> a(String paramString, int paramInt)
    {
      return new a(paramString, av.a(paramString, Integer.valueOf(paramInt)), Integer.valueOf(paramInt));
    }
    
    static a<Long> a(String paramString, long paramLong1, long paramLong2)
    {
      return new a(paramString, av.a(paramString, Long.valueOf(paramLong2)), Long.valueOf(paramLong1));
    }
    
    static a<String> a(String paramString1, String paramString2, String paramString3)
    {
      return new a(paramString1, av.a(paramString1, paramString3), paramString2);
    }
    
    static a<Boolean> a(String paramString, boolean paramBoolean)
    {
      return new a(paramString, av.a(paramString, paramBoolean), Boolean.valueOf(paramBoolean));
    }
    
    public final V a(V paramV)
    {
      if (paramV != null) {
        return paramV;
      }
      return (V)a;
    }
  }
}


/* Location:              com/google/android/gms/b/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */