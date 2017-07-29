package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class tr$9
  extends tr.a
{
  tr$9(Context paramContext, String paramString)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    SharedPreferences.Editor localEditor = a.getSharedPreferences("admob", 0).edit();
    String str = b;
    localEditor.putString("content_url_hashes", str);
    localEditor.apply();
  }
}


/* Location:              com/google/android/gms/b/tr$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */