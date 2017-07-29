package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class tr$15
  extends tr.a
{
  tr$15(Context paramContext, tr.b paramb)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    Object localObject = a.getSharedPreferences("admob", 0);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "";
    String str2 = ((SharedPreferences)localObject).getString("app_settings_json", str1);
    localBundle.putString("app_settings_json", str2);
    String str3 = "app_settings_last_update_ms";
    str2 = "app_settings_last_update_ms";
    long l = ((SharedPreferences)localObject).getLong(str2, 0L);
    localBundle.putLong(str3, l);
    localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((tr.b)localObject).a(localBundle);
    }
  }
}


/* Location:              com/google/android/gms/b/tr$15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */