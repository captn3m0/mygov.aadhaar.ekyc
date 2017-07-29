package com.google.android.gms.measurement;

import com.google.android.gms.common.util.d;
import com.google.firebase.analytics.FirebaseAnalytics.b;
import java.util.Map;

public final class AppMeasurement$e
  extends FirebaseAnalytics.b
{
  public static final Map a;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String[] arrayOfString1 = new String[32];
    arrayOfString1[0] = "firebase_conversion";
    arrayOfString1[m] = "engagement_time_msec";
    arrayOfString1[k] = "exposure_time";
    arrayOfString1[j] = "ad_event_id";
    arrayOfString1[i] = "ad_unit_id";
    arrayOfString1[5] = "firebase_error";
    arrayOfString1[6] = "firebase_error_value";
    arrayOfString1[7] = "firebase_error_length";
    arrayOfString1[8] = "debug";
    arrayOfString1[9] = "realtime";
    arrayOfString1[10] = "firebase_event_origin";
    arrayOfString1[11] = "firebase_screen";
    arrayOfString1[12] = "firebase_screen_class";
    arrayOfString1[13] = "firebase_screen_id";
    arrayOfString1[14] = "message_device_time";
    arrayOfString1[15] = "message_id";
    arrayOfString1[16] = "message_name";
    arrayOfString1[17] = "message_time";
    arrayOfString1[18] = "previous_app_version";
    arrayOfString1[19] = "previous_os_version";
    arrayOfString1[20] = "topic";
    arrayOfString1[21] = "update_with_analytics";
    arrayOfString1[22] = "previous_first_open_count";
    arrayOfString1[23] = "system_app";
    arrayOfString1[24] = "system_app_update";
    arrayOfString1[25] = "previous_install_count";
    arrayOfString1[26] = "firebase_event_id";
    arrayOfString1[27] = "firebase_extra_params_ct";
    arrayOfString1[28] = "firebase_group_name";
    arrayOfString1[29] = "firebase_list_length";
    arrayOfString1[30] = "firebase_index";
    arrayOfString1[31] = "firebase_event_name";
    String[] arrayOfString2 = new String[32];
    arrayOfString2[0] = "_c";
    arrayOfString2[m] = "_et";
    arrayOfString2[k] = "_xt";
    arrayOfString2[j] = "_aeid";
    arrayOfString2[i] = "_ai";
    arrayOfString2[5] = "_err";
    arrayOfString2[6] = "_ev";
    arrayOfString2[7] = "_el";
    arrayOfString2[8] = "_dbg";
    arrayOfString2[9] = "_r";
    arrayOfString2[10] = "_o";
    arrayOfString2[11] = "_sn";
    arrayOfString2[12] = "_sc";
    arrayOfString2[13] = "_si";
    arrayOfString2[14] = "_ndt";
    arrayOfString2[15] = "_nmid";
    arrayOfString2[16] = "_nmn";
    arrayOfString2[17] = "_nmt";
    arrayOfString2[18] = "_pv";
    arrayOfString2[19] = "_po";
    arrayOfString2[20] = "_nt";
    arrayOfString2[21] = "_uwa";
    arrayOfString2[22] = "_pfo";
    arrayOfString2[23] = "_sys";
    arrayOfString2[24] = "_sysu";
    arrayOfString2[25] = "_pin";
    arrayOfString2[26] = "_eid";
    arrayOfString2[27] = "_epc";
    arrayOfString2[28] = "_gn";
    arrayOfString2[29] = "_ll";
    arrayOfString2[30] = "_i";
    arrayOfString2[31] = "_en";
    a = d.a(arrayOfString1, arrayOfString2);
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurement$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */