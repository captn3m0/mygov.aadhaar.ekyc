package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class tr$17
  extends tr.a
{
  tr$17(Context paramContext, tr.b paramb)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    Object localObject = a.getSharedPreferences("admob", 0);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "app_last_background_time_ms";
    String str2 = "app_last_background_time_ms";
    long l = ((SharedPreferences)localObject).getLong(str2, 0L);
    localBundle.putLong(str1, l);
    localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((tr.b)localObject).a(localBundle);
    }
  }
}


/* Location:              com/google/android/gms/b/tr$17.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */