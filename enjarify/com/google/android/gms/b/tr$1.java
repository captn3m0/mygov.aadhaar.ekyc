package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class tr$1
  extends tr.a
{
  tr$1(Context paramContext, boolean paramBoolean)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    SharedPreferences.Editor localEditor = a.getSharedPreferences("admob", 0).edit();
    boolean bool = b;
    localEditor.putBoolean("use_https", bool);
    localEditor.apply();
  }
}


/* Location:              com/google/android/gms/b/tr$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */