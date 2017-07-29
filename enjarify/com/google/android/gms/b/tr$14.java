package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class tr$14
  extends tr.a
{
  tr$14(Context paramContext, String paramString, long paramLong)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    SharedPreferences.Editor localEditor = a.getSharedPreferences("admob", 0).edit();
    String str = b;
    localEditor.putString("app_settings_json", str);
    long l = c;
    localEditor.putLong("app_settings_last_update_ms", l);
    localEditor.apply();
  }
}


/* Location:              com/google/android/gms/b/tr$14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */