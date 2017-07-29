package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class tr$6
  extends tr.a
{
  tr$6(Context paramContext, tr.b paramb)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    Object localObject = a.getSharedPreferences("admob", 0);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "webview_cache_version";
    String str2 = "webview_cache_version";
    int i = ((SharedPreferences)localObject).getInt(str2, 0);
    localBundle.putInt(str1, i);
    localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((tr.b)localObject).a(localBundle);
    }
  }
}


/* Location:              com/google/android/gms/b/tr$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */