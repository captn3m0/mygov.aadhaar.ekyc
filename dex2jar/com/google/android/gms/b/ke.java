package com.google.android.gms.b;

import android.content.Context;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@qi
public final class ke
{
  public static final jz<Boolean> A;
  public static final jz<Long> B;
  public static final jz<Boolean> C;
  public static final jz<Integer> D;
  public static final jz<Long> E;
  public static final jz<Boolean> F;
  public static final jz<Boolean> G;
  public static final jz<String> H;
  public static final jz<Boolean> I;
  public static final jz<Boolean> J;
  public static final jz<Float> K;
  public static final jz<String> L;
  public static final jz<String> M;
  public static final jz<Boolean> N;
  public static final jz<Boolean> O;
  public static final jz<Boolean> P;
  public static final jz<String> Q;
  public static final jz<String> R;
  public static final jz<String> S;
  public static final jz<Boolean> T;
  public static final jz<String> U;
  public static final jz<Boolean> V;
  public static final jz<Boolean> W;
  public static final jz<Integer> X;
  public static final jz<Integer> Y;
  public static final jz<Integer> Z;
  public static final jz<String> a = jz.a(0, "gads:sdk_core_experiment_id");
  public static final jz<Boolean> aA;
  public static final jz<Integer> aB;
  public static final jz<Boolean> aC;
  public static final jz<String> aD;
  public static final jz<Boolean> aE;
  public static final jz<String> aF;
  public static final jz<String> aG;
  public static final jz<Boolean> aH;
  public static final jz<Long> aI;
  public static final jz<Boolean> aJ;
  public static final jz<Long> aK;
  public static final jz<Long> aL;
  public static final jz<Boolean> aM;
  public static final jz<Long> aN;
  public static final jz<Boolean> aO;
  public static final jz<Boolean> aP;
  public static final jz<String> aQ;
  public static final jz<Boolean> aR;
  public static final jz<Long> aS;
  public static final jz<String> aT;
  public static final jz<Integer> aU;
  public static final jz<Integer> aV;
  public static final jz<Boolean> aW;
  public static final jz<Boolean> aX;
  public static final jz<String> aY;
  public static final jz<String> aZ;
  public static final jz<Integer> aa;
  public static final jz<Integer> ab;
  public static final jz<Boolean> ac;
  public static final jz<Integer> ad;
  public static final jz<Boolean> ae;
  public static final jz<Integer> af;
  public static final jz<Integer> ag;
  public static final jz<String> ah;
  public static final jz<String> ai;
  public static final jz<Boolean> aj;
  public static final jz<Boolean> ak;
  public static final jz<Long> al;
  public static final jz<String> am;
  public static final jz<String> an;
  public static final jz<Boolean> ao;
  public static final jz<Boolean> ap;
  public static final jz<Boolean> aq;
  public static final jz<String> ar;
  public static final jz<Boolean> as;
  public static final jz<Boolean> at;
  public static final jz<Boolean> au;
  public static final jz<Boolean> av;
  public static final jz<Boolean> aw;
  public static final jz<Boolean> ax;
  public static final jz<String> ay;
  public static final jz<String> az;
  public static final jz<String> b = jz.a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
  public static final jz<Long> bA;
  public static final jz<Long> bB;
  public static final jz<Boolean> bC;
  public static final jz<Boolean> bD;
  public static final jz<Boolean> bE;
  public static final jz<Long> bF;
  public static final jz<Long> bG;
  public static final jz<Boolean> bH;
  public static final jz<Long> bI;
  public static final jz<Boolean> bJ;
  public static final jz<Boolean> bK;
  public static final jz<Boolean> bL;
  public static final jz<Boolean> bM;
  public static final jz<Boolean> bN;
  public static final jz<Boolean> bO;
  public static final jz<Boolean> bP;
  public static final jz<Boolean> bQ;
  public static final jz<Boolean> bR;
  public static final jz<Boolean> bS;
  public static final jz<Boolean> bT;
  public static final jz<Boolean> bU;
  public static final jz<Boolean> bV;
  public static final jz<String> bW;
  public static final jz<String> bX;
  public static final jz<String> bY;
  public static final jz<Long> bZ;
  public static final jz<Integer> ba;
  public static final jz<Integer> bb;
  public static final jz<Integer> bc;
  public static final jz<String> bd;
  public static final jz<Integer> be;
  public static final jz<Integer> bf;
  public static final jz<Float> bg;
  public static final jz<Integer> bh;
  public static final jz<String> bi;
  public static final jz<String> bj;
  public static final jz<String> bk;
  public static final jz<Boolean> bl;
  public static final jz<Boolean> bm;
  public static final jz<String> bn;
  public static final jz<Long> bo;
  public static final jz<Boolean> bp;
  public static final jz<Long> bq;
  public static final jz<Boolean> br;
  public static final jz<Boolean> bs;
  public static final jz<Boolean> bt;
  public static final jz<Boolean> bu;
  public static final jz<Boolean> bv;
  public static final jz<Boolean> bw;
  public static final jz<Boolean> bx;
  public static final jz<Boolean> by;
  public static final jz<String> bz;
  public static final jz<Boolean> c = jz.a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
  public static final jz<String> cA = jz.b(1, "gads:auto_location_timeout:experiment_id");
  public static final jz<Long> cB = jz.a(1, "gads:auto_location_interval", -1L);
  public static final jz<String> cC = jz.b(1, "gads:auto_location_interval:experiment_id");
  public static final jz<Boolean> cD = jz.a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));
  public static final jz<String> cE = jz.a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
  public static final jz<Long> cF = jz.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);
  public static final jz<String> cG = jz.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms:experiment_id");
  public static final jz<String> cH = jz.a(0, "gads:afs:csa:experiment_id");
  public static final jz<String> cI = jz.a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
  public static final jz<String> cJ = jz.a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
  public static final jz<String> cK = jz.a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
  public static final jz<String> cL = jz.a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
  public static final jz<String> cM = jz.a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
  public static final jz<Long> cN = jz.a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000L);
  public static final jz<Boolean> cO = jz.a(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));
  public static final jz<Boolean> cP = jz.a(1, "gads:parental_controls:send_from_client", Boolean.valueOf(true));
  public static final jz<Boolean> cQ = jz.a(1, "gads:parental_controls:cache_results", Boolean.valueOf(true));
  public static final jz<Long> cR = jz.a(1, "gads:parental_controls:timeout", 2000L);
  public static final jz<String> cS = jz.a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
  public static final jz<Long> cT = jz.a(0, "gads:safe_browsing:safety_net:delay_ms", 2000L);
  public static final jz<Boolean> cU = jz.a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));
  public static final jz<Boolean> cV = jz.a(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));
  public static final jz<Integer> cW = jz.a(1, "gads:cache:max_concurrent_downloads", 10);
  public static final jz<Long> cX = jz.a(1, "gads:cache:javascript_timeout_millis", 5000L);
  public static final jz<Boolean> cY = jz.a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));
  public static final jz<Boolean> cZ = jz.a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));
  public static final jz<Boolean> ca;
  public static final jz<Boolean> cb;
  public static final jz<String> cc;
  public static final jz<String> cd;
  public static final jz<String> ce;
  public static final jz<String> cf;
  public static final jz<Boolean> cg;
  public static final jz<Boolean> ch;
  public static final jz<String> ci;
  public static final jz<Boolean> cj;
  public static final jz<Boolean> ck;
  public static final jz<Boolean> cl;
  public static final jz<Integer> cm;
  public static final jz<String> cn;
  public static final jz<String> co;
  public static final jz<Boolean> cp;
  public static final jz<Boolean> cq;
  public static final jz<Boolean> cr;
  public static final jz<Boolean> cs;
  public static final jz<Boolean> ct;
  public static final jz<Long> cu;
  public static final jz<Integer> cv;
  public static final jz<Integer> cw;
  public static final jz<Boolean> cx;
  public static final jz<String> cy;
  public static final jz<Long> cz;
  public static final jz<String> d = jz.a(0, "gads:request_builder:singleton_webview_experiment_id");
  public static final jz<Boolean> da = jz.a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));
  public static final jz<Long> db = jz.a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30L));
  public static final jz<Boolean> dc = jz.a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));
  public static final jz<Boolean> dd = jz.a(1, "gads:chrome_custom_tabs:enabled", Boolean.valueOf(true));
  public static final jz<Boolean> de = jz.a(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));
  public static final jz<Boolean> df = jz.a(1, "gads:drx_in_app_preview:enabled", Boolean.valueOf(false));
  public static final jz<Boolean> dg = jz.a(1, "gads:drx_debug_signals:enabled", Boolean.valueOf(false));
  public static final jz<String> dh = jz.a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
  public static final jz<String> di = jz.a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
  public static final jz<String> dj = jz.a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
  public static final jz<String> dk = jz.a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
  public static final jz<Integer> dl = jz.a(1, "gads:drx_debug:timeout_ms", 5000);
  public static final jz<Integer> dm = jz.a(1, "gad:pixel_dp_comparision_multiplier", 1);
  public static final jz<Boolean> dn = jz.a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));
  public static final jz<Boolean> jdField_do = jz.a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));
  public static final jz<Integer> dp = jz.a(1, "gad:interstitial:close_button_padding_dip", 0);
  private static byte[] dq;
  public static final jz<Boolean> e = jz.a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));
  public static final jz<String> f = jz.a(0, "gads:sdk_use_dynamic_module_experiment_id");
  public static final jz<Boolean> g = jz.a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
  public static final jz<Boolean> h = jz.a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
  public static final jz<String> i = jz.a(0, "gads:sdk_crash_report_class_prefix", "com.google.");
  public static final jz<Boolean> j = jz.a(0, "gads:block_autoclicks", Boolean.valueOf(false));
  public static final jz<String> k = jz.a(0, "gads:block_autoclicks_experiment_id");
  public static final jz<String> l = jz.a(0, "gads:spam_app_context:experiment_id");
  public static final jz<Boolean> m = jz.a(1, "gads:spam_app_context:enabled", Boolean.valueOf(false));
  public static final jz<Integer> n = jz.a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
  public static final jz<String> o = jz.a(1, "gads:video_exo_player:version", "1");
  public static final jz<String> p = jz.a(0, "gads:video_stream_cache:experiment_id");
  public static final jz<Integer> q = jz.a(1, "gads:video_stream_cache:limit_count", 5);
  public static final jz<Integer> r = jz.a(1, "gads:video_stream_cache:limit_space", 8388608);
  public static final jz<Integer> s = jz.a(1, "gads:video_stream_exo_allocator:segment_size", 65536);
  public static final jz<Integer> t = jz.a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
  public static final jz<Long> u = jz.a(1, "gads:video_stream_cache:limit_time_sec", 300L);
  public static final jz<Long> v = jz.a(1, "gads:video_stream_cache:notify_interval_millis", 1000L);
  public static final jz<Integer> w = jz.a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
  public static final jz<Boolean> x = jz.a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
  public static final jz<String> y = jz.a(1, "gads:video:metric_frame_hash_times", "");
  public static final jz<Long> z = jz.a(1, "gads:video:metric_frame_hash_time_leniency", 500L);
  
  static
  {
    A = jz.a(1, "gads:video:force_watermark", Boolean.valueOf(false));
    B = jz.a(1, "gads:video:surface_update_min_spacing_ms", 1000L);
    C = jz.a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));
    D = jz.a(1, "gads:video:spinner:scale", 4);
    E = jz.a(1, "gads:video:spinner:jank_threshold_ms", 50L);
    F = jz.a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));
    G = jz.a(1, "gads:memory_bundle:runtime_info", Boolean.valueOf(true));
    H = jz.b(0, "gads:spam_ad_id_decorator:experiment_id");
    I = jz.a(0, "gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    J = jz.a(0, "gads:ad_id_app_context:enabled", Boolean.valueOf(false));
    K = jz.a(0, "gads:ad_id_app_context:ping_ratio", 0.0F);
    L = jz.a(0, "gads:ad_id_app_context:experiment_id");
    M = jz.b(0, "gads:looper_for_gms_client:experiment_id");
    N = jz.a(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    O = jz.a(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    P = jz.a(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
    Q = jz.a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    R = jz.a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    S = jz.a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    T = jz.a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
    U = jz.a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    V = jz.a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    W = jz.a(0, "gads:enable_content_fetching", Boolean.valueOf(true));
    X = jz.a(0, "gads:content_length_weight", 1);
    Y = jz.a(0, "gads:content_age_weight", 1);
    Z = jz.a(0, "gads:min_content_len", 11);
    aa = jz.a(0, "gads:fingerprint_number", 10);
    ab = jz.a(0, "gads:sleep_sec", 10);
    ac = jz.a(1, "gads:enable_content_url_hash", Boolean.valueOf(true));
    ad = jz.a(1, "gads:content_vertical_fingerprint_number", 100);
    ae = jz.a(1, "gads:enable_content_vertical_hash", Boolean.valueOf(true));
    af = jz.a(1, "gads:content_vertical_fingerprint_bits", 23);
    ag = jz.a(1, "gads:content_vertical_fingerprint_ngram", 3);
    ah = jz.a(1, "gads:content_fetch_view_tag_id", "googlebot");
    ai = jz.a(1, "gads:content_fetch_exclude_view_tag", "none");
    aj = jz.a(0, "gad:app_index_enabled", Boolean.valueOf(true));
    ak = jz.a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
    al = jz.a(0, "gads:app_index:timeout_ms", 1000L);
    am = jz.a(0, "gads:app_index:experiment_id");
    an = jz.a(0, "gads:kitkat_interstitial_workaround:experiment_id");
    ao = jz.a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    ap = jz.a(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
    aq = jz.a(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    ar = jz.a(0, "gads:interstitial_follow_url:experiment_id");
    as = jz.a(0, "gads:analytics_enabled", Boolean.valueOf(true));
    at = jz.a(0, "gads:ad_key_enabled", Boolean.valueOf(false));
    au = jz.a(1, "gads:sai:enabled", Boolean.valueOf(false));
    av = jz.a(1, "gads:sai:banner_ad_enabled", Boolean.valueOf(true));
    aw = jz.a(1, "gads:sai:native_ad_enabled", Boolean.valueOf(true));
    ax = jz.a(1, "gads:sai:interstitial_ad_enabled", Boolean.valueOf(true));
    ay = jz.a(1, "gads:sai:click_ping_schema", "[\"/aclk\",\"/pcs/click\"]");
    az = jz.a(1, "gads:sai:impression_ping_schema", "[\"/adview\"]");
    aA = jz.a(1, "gads:sai:click_gmsg_enabled", Boolean.valueOf(true));
    aB = jz.a(0, "gads:webview_cache_version", 0);
    aC = jz.a(1, "gads:webview_recycle:enabled", Boolean.valueOf(false));
    aD = jz.a(1, "gads:webview_recycle:experiment_id");
    aE = jz.a(1, "gads:webview:ignore_over_scroll", Boolean.valueOf(true));
    aF = jz.b(0, "gads:pan:experiment_id");
    aG = jz.a(1, "gads:rewarded:experiment_id");
    aH = jz.a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));
    aI = jz.a(1, "gads:rewarded:adapter_timeout_ms", 20000L);
    aJ = jz.a(1, "gads:app_activity_tracker:enabled", Boolean.valueOf(true));
    aK = jz.a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500L);
    aL = jz.a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5L));
    aM = jz.a(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));
    aN = jz.a(1, "gads:adid_values_in_adrequest:timeout", 2000L);
    aO = jz.a(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));
    aP = jz.a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));
    aQ = jz.a(1, "gads:ad_manager_enforce_arp_invariant:experiment_id");
    aR = jz.a(1, "gads:ad_manager_enforce_arp_invariant:enabled", Boolean.valueOf(false));
    aS = jz.a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000L);
    aT = jz.a(1, "gads:banner_ad_pool:schema", "customTargeting");
    aU = jz.a(1, "gads:banner_ad_pool:max_queues", 3);
    aV = jz.a(1, "gads:banner_ad_pool:max_pools", 3);
    aW = jz.a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
    aX = jz.a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));
    aY = jz.a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    aZ = jz.a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    ba = jz.a(1, "gads:interstitial_ad_pool:max_pools", 3);
    bb = jz.a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    bc = jz.a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    bd = jz.a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    be = jz.a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    bf = jz.a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    bg = jz.a(1, "gads:interstitial_ad_pool:discard_threshold", NaN.0F);
    bh = jz.a(1, "gads:heap_wastage:bytes", 0);
    bi = jz.a(1, "gads:spherical_video:vertex_shader", "");
    bj = jz.a(1, "gads:spherical_video:fragment_shader", "");
    bk = jz.a(1, "gads:spherical_video:experiment_id");
    bl = jz.a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
    bm = jz.a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));
    bn = jz.a(1, "gads:include_local_global_rectangles:experiment_id");
    bo = jz.a(1, "gads:position_watcher:throttle_ms", 200L);
    bp = jz.a(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
    bq = jz.a(0, "gads:device_info_caching_expiry_ms:expiry", 300000L);
    br = jz.a(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
    bs = jz.a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    bt = jz.a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
    bu = jz.a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
    bv = jz.a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
    bw = jz.a(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
    bx = jz.a(1, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(true));
    by = jz.a(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));
    bz = jz.a(0, "gads:gmsg:video_meta:experiment_id");
    bA = jz.a(1, "gads:network:cache_prediction_duration_s", 300L);
    bB = jz.a(1, "gads:network:network_prediction_timeout_ms", 2000L);
    bC = jz.a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
    bD = jz.a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
    bE = jz.a(1, "gads:bypass_adrequest_service_for_inlined_mediation", Boolean.valueOf(true));
    bF = jz.a(0, "gads:ad_loader:timeout_ms", 60000L);
    bG = jz.a(0, "gads:rendering:timeout_ms", 60000L);
    bH = jz.a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    bI = jz.a(1, "gads:gestures:task_timeout", 2000L);
    bJ = jz.a(1, "gads:gestures:encrypt_size_limit:enabled", Boolean.valueOf(false));
    bK = jz.a(1, "gads:gestures:adb_query:enabled", Boolean.valueOf(false));
    bL = jz.a(1, "gads:gestures:adb_click:enabled", Boolean.valueOf(false));
    bM = jz.a(1, "gads:gestures:visibility:enabled", Boolean.valueOf(false));
    bN = jz.a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));
    bO = jz.a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));
    bP = jz.a(0, "gass:client:enabled", Boolean.valueOf(true));
    bQ = jz.a(0, "gass:enabled", Boolean.valueOf(true));
    bR = jz.a(0, "gass:enable_int_signal", Boolean.valueOf(true));
    bS = jz.a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    bT = jz.a(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
    bU = jz.a(0, "gads:support_screen_shot", Boolean.valueOf(true));
    bV = jz.a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));
    bW = jz.a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
    bX = jz.a(1, "gads:sdk_core_constants:experiment_id");
    bY = jz.a(1, "gads:sdk_core_constants:caps", "");
    bZ = jz.a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12L));
    ca = jz.a(0, "gads:js_flags:mf", Boolean.valueOf(false));
    cb = jz.a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    cc = jz.a(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    cd = jz.a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    ce = jz.a(1, "gads:native:video_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_video_ads.html");
    cf = jz.a(1, "gads:native:video_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_video_ads.html");
    cg = jz.a(1, "gads:singleton_webview_native", Boolean.valueOf(false));
    ch = jz.a(1, "gads:native_initialize_Webview_request_time", Boolean.valueOf(false));
    ci = jz.a(1, "gads:singleton_webview_native:experiment_id");
    cj = jz.a(1, "gads:enable_untrack_view_native", Boolean.valueOf(true));
    ck = jz.a(1, "gads:ignore_untrack_view_google_native", Boolean.valueOf(true));
    cl = jz.a(1, "gads:reset_listeners_preparead_native", Boolean.valueOf(true));
    cm = jz.a(1, "gads:native_video_load_timeout", 10);
    cn = jz.a(1, "gads:native_video_load_timeout:experiment_id");
    co = jz.a(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    cp = jz.a(1, "gads:clamp_native_video_player_dimensions", Boolean.valueOf(true));
    cq = jz.a(1, "gads:enable_tracking_for_native_ad_views", Boolean.valueOf(true));
    cr = jz.a(1, "gads:use_new_json_for_native_view_tracking", Boolean.valueOf(true));
    cs = jz.a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));
    ct = jz.a(0, "gads:method_tracing:enabled", Boolean.valueOf(false));
    cu = jz.a(0, "gads:method_tracing:duration_ms", 30000L);
    cv = jz.a(0, "gads:method_tracing:count", 5);
    cw = jz.a(0, "gads:method_tracing:filesize", 134217728);
    cx = jz.a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));
    cy = jz.b(1, "gads:auto_location_for_coarse_permission:experiment_id");
    cz = jz.a(1, "gads:auto_location_timeout", 2000L);
  }
  
  public static List<String> a()
  {
    return w.p().a();
  }
  
  public static void a(Context paramContext)
  {
    uh.a(new Callable()
    {
      private Void a()
      {
        kd localkd = w.q();
        Context localContext = ke.this;
        if (!c) {}
        for (;;)
        {
          synchronized (a)
          {
            if (c) {
              return null;
            }
          }
          try
          {
            localContext = o.f(localContext);
            if (localContext == null)
            {
              b.open();
              continue;
              localObject2 = finally;
              throw ((Throwable)localObject2);
            }
            w.o();
            d = localContext.getSharedPreferences("google_ads_flags", 1);
            c = true;
            b.open();
          }
          finally
          {
            b.open();
          }
        }
      }
    });
    paramContext = bh;
    int i1 = ((Integer)w.q().a(paramContext)).intValue();
    if ((i1 > 0) && (dq == null)) {
      dq = new byte[i1];
    }
  }
  
  public static List<String> b()
  {
    Object localObject1 = w.p();
    List localList = ((kb)localObject1).a();
    localObject1 = c.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (jz)((Iterator)localObject1).next();
      localObject2 = (String)w.q().a((jz)localObject2);
      if (localObject2 != null) {
        localList.add(localObject2);
      }
    }
    return localList;
  }
}


/* Location:              com/google/android/gms/b/ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */