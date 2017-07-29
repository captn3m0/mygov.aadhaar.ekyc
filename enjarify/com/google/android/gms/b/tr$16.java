package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class tr$16
  extends tr.a
{
  tr$16(Context paramContext, long paramLong)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    SharedPreferences.Editor localEditor = a.getSharedPreferences("admob", 0).edit();
    long l = b;
    localEditor.putLong("app_last_background_time_ms", l);
    localEditor.apply();
  }
}


/* Location:              com/google/android/gms/b/tr$16.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */