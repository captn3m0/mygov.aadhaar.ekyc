package com.google.android.gms.measurement;

import com.google.android.gms.common.util.d;
import com.google.firebase.analytics.FirebaseAnalytics.a;
import java.util.Map;

public final class AppMeasurement$a
  extends FirebaseAnalytics.a
{
  public static final Map a;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String[] arrayOfString1 = new String[21];
    arrayOfString1[0] = "app_clear_data";
    arrayOfString1[m] = "app_exception";
    arrayOfString1[k] = "app_remove";
    arrayOfString1[j] = "app_upgrade";
    arrayOfString1[i] = "app_install";
    arrayOfString1[5] = "app_update";
    arrayOfString1[6] = "firebase_campaign";
    arrayOfString1[7] = "error";
    arrayOfString1[8] = "first_open";
    arrayOfString1[9] = "first_visit";
    arrayOfString1[10] = "in_app_purchase";
    arrayOfString1[11] = "notification_dismiss";
    arrayOfString1[12] = "notification_foreground";
    arrayOfString1[13] = "notification_open";
    arrayOfString1[14] = "notification_receive";
    arrayOfString1[15] = "os_update";
    arrayOfString1[16] = "session_start";
    arrayOfString1[17] = "user_engagement";
    arrayOfString1[18] = "firebase_ad_exposure";
    arrayOfString1[19] = "firebase_adunit_exposure";
    arrayOfString1[20] = "firebase_extra_parameter";
    String[] arrayOfString2 = new String[21];
    arrayOfString2[0] = "_cd";
    arrayOfString2[m] = "_ae";
    arrayOfString2[k] = "_ui";
    arrayOfString2[j] = "_in";
    arrayOfString2[i] = "_ug";
    arrayOfString2[5] = "_au";
    arrayOfString2[6] = "_cmp";
    arrayOfString2[7] = "_err";
    arrayOfString2[8] = "_f";
    arrayOfString2[9] = "_v";
    arrayOfString2[10] = "_iap";
    arrayOfString2[11] = "_nd";
    arrayOfString2[12] = "_nf";
    arrayOfString2[13] = "_no";
    arrayOfString2[14] = "_nr";
    arrayOfString2[15] = "_ou";
    arrayOfString2[16] = "_s";
    arrayOfString2[17] = "_e";
    arrayOfString2[18] = "_xa";
    arrayOfString2[19] = "_xu";
    arrayOfString2[20] = "_ep";
    a = d.a(arrayOfString1, arrayOfString2);
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurement$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */