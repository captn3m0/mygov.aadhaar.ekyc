package com.google.android.gms.b;

import org.json.JSONObject;

final class me$1$1
  implements Runnable
{
  me$1$1(me.1 param1, JSONObject paramJSONObject) {}
  
  public final void run()
  {
    vc localvc = b.b;
    JSONObject localJSONObject = a;
    localvc.b("fetchHttpRequestCompleted", localJSONObject);
    tp.b("Dispatched http response.");
  }
}


/* Location:              com/google/android/gms/b/me$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */