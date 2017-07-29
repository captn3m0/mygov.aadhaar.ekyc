package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class tr$3
  extends tr.a
{
  tr$3(Context paramContext, tr.b paramb)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    Object localObject = a.getSharedPreferences("admob", 0);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "request_in_session_count";
    String str2 = "request_in_session_count";
    int i = -1;
    int j = ((SharedPreferences)localObject).getInt(str2, i);
    localBundle.putInt(str1, j);
    localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((tr.b)localObject).a(localBundle);
    }
  }
}


/* Location:              com/google/android/gms/b/tr$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */