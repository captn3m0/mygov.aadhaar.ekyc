package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class tr$12
  extends tr.a
{
  tr$12(Context paramContext, boolean paramBoolean)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    SharedPreferences.Editor localEditor = a.getSharedPreferences("admob", 0).edit();
    boolean bool = b;
    localEditor.putBoolean("auto_collect_location", bool);
    localEditor.apply();
  }
}


/* Location:              com/google/android/gms/b/tr$12.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */