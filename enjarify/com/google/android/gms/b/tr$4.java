package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class tr$4
  extends tr.a
{
  tr$4(Context paramContext, long paramLong)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    SharedPreferences.Editor localEditor = a.getSharedPreferences("admob", 0).edit();
    long l = b;
    localEditor.putLong("first_ad_req_time_ms", l);
    localEditor.apply();
  }
}


/* Location:              com/google/android/gms/b/tr$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */