package com.google.android.gms.b;

public final class cp
{
  public static cp.a A;
  public static cp.a B;
  public static cp.a C;
  public static cp.a D;
  public static cp.a E;
  public static cp.a F = cp.a.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L);
  public static cp.a G = cp.a.a("measurement.upload.initial_upload_delay_time", 15000L, 15000L);
  public static cp.a H = cp.a.a("measurement.upload.retry_time", 1800000L, 1800000L);
  public static cp.a I = cp.a.a("measurement.upload.retry_count", 6);
  public static cp.a J = cp.a.a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);
  public static cp.a K = cp.a.a("measurement.lifetimevalue.max_currency_tracked", 4);
  public static cp.a L = cp.a.a("measurement.audience.filter_result_max_count", 200);
  public static cp.a M = cp.a.a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L);
  public static cp.a a;
  public static cp.a b;
  public static cp.a c;
  public static cp.a d;
  public static cp.a e;
  public static cp.a f;
  public static cp.a g;
  public static cp.a h;
  public static cp.a i;
  public static cp.a j;
  public static cp.a k;
  public static cp.a l;
  public static cp.a m;
  public static cp.a n;
  public static cp.a o;
  public static cp.a p;
  public static cp.a q;
  public static cp.a r;
  public static cp.a s;
  public static cp.a t;
  public static cp.a u;
  public static cp.a v;
  public static cp.a w;
  public static cp.a x;
  public static cp.a y;
  public static cp.a z;
  
  static
  {
    boolean bool = true;
    long l1 = 10000L;
    long l2 = 86400000L;
    long l3 = 3600000L;
    a = cp.a.a("measurement.service_enabled", bool);
    b = cp.a.a("measurement.service_client_enabled", bool);
    c = cp.a.a("measurement.log_third_party_store_events_enabled", false);
    d = cp.a.a("measurement.log_installs_enabled", false);
    e = cp.a.a("measurement.log_upgrades_enabled", false);
    f = cp.a.a("measurement.log_androidId_enabled", false);
    g = cp.a.a("measurement.log_tag", "FA", "FA-SVC");
    h = cp.a.a("measurement.ad_id_cache_time", l1, l1);
    i = cp.a.a("measurement.monitoring.sample_period_millis", l2, l2);
    j = cp.a.a("measurement.config.cache_time", l2, l3);
    String str = "https";
    k = cp.a.a("measurement.config.url_scheme", str, str);
    str = "app-measurement.com";
    l = cp.a.a("measurement.config.url_authority", str, str);
    m = cp.a.a("measurement.upload.max_bundles", 100);
    n = cp.a.a("measurement.upload.max_batch_size", 65536);
    o = cp.a.a("measurement.upload.max_bundle_size", 65536);
    p = cp.a.a("measurement.upload.max_events_per_bundle", 1000);
    q = cp.a.a("measurement.upload.max_events_per_day", 100000);
    r = cp.a.a("measurement.upload.max_error_events_per_day", 1000);
    s = cp.a.a("measurement.upload.max_public_events_per_day", 50000);
    t = cp.a.a("measurement.upload.max_conversions_per_day", 500);
    u = cp.a.a("measurement.upload.max_realtime_events_per_day", 10);
    v = cp.a.a("measurement.store.max_stored_events_per_app", 100000);
    str = "https://app-measurement.com/a";
    w = cp.a.a("measurement.upload.url", str, str);
    x = cp.a.a("measurement.upload.backoff_period", 43200000L, 43200000L);
    y = cp.a.a("measurement.upload.window_interval", l3, l3);
    z = cp.a.a("measurement.upload.interval", l3, l3);
    A = cp.a.a("measurement.upload.realtime_upload_interval", l1, l1);
    B = cp.a.a("measurement.upload.debug_upload_interval", 1000L, 1000L);
    C = cp.a.a("measurement.upload.minimum_delay", 500L, 500L);
    D = cp.a.a("measurement.alarm_manager.minimum_interval", 60000L, 60000L);
    E = cp.a.a("measurement.upload.stale_data_deletion_interval", l2, l2);
  }
}


/* Location:              com/google/android/gms/b/cp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */