package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class tr$2
  extends tr.a
{
  tr$2(Context paramContext, tr.b paramb)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    Object localObject = a.getSharedPreferences("admob", 0);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "use_https";
    String str2 = "use_https";
    boolean bool1 = true;
    boolean bool2 = ((SharedPreferences)localObject).getBoolean(str2, bool1);
    localBundle.putBoolean(str1, bool2);
    localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((tr.b)localObject).a(localBundle);
    }
  }
}


/* Location:              com/google/android/gms/b/tr$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */