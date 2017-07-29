package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class tr$13
  extends tr.a
{
  tr$13(Context paramContext, tr.b paramb)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    Object localObject = a.getSharedPreferences("admob", 0);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "auto_collect_location";
    String str2 = "auto_collect_location";
    boolean bool = ((SharedPreferences)localObject).getBoolean(str2, false);
    localBundle.putBoolean(str1, bool);
    localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((tr.b)localObject).a(localBundle);
    }
  }
}


/* Location:              com/google/android/gms/b/tr$13.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */