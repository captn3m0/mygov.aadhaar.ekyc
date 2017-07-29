package com.google.android.gms.measurement;

import com.google.android.gms.common.util.d;
import com.google.firebase.analytics.FirebaseAnalytics.c;
import java.util.Map;

public final class AppMeasurement$g
  extends FirebaseAnalytics.c
{
  public static final Map a;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String[] arrayOfString1 = new String[5];
    arrayOfString1[0] = "firebase_last_notification";
    arrayOfString1[m] = "first_open_time";
    arrayOfString1[k] = "first_visit_time";
    arrayOfString1[j] = "last_deep_link_referrer";
    arrayOfString1[i] = "user_id";
    String[] arrayOfString2 = new String[5];
    arrayOfString2[0] = "_ln";
    arrayOfString2[m] = "_fot";
    arrayOfString2[k] = "_fvt";
    arrayOfString2[j] = "_ldl";
    arrayOfString2[i] = "_id";
    a = d.a(arrayOfString1, arrayOfString2);
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurement$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */