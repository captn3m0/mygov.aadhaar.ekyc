package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class tr$10
  extends tr.a
{
  tr$10(Context paramContext, tr.b paramb)
  {
    super((byte)0);
  }
  
  public final void a()
  {
    Object localObject = a.getSharedPreferences("admob", 0);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "content_url_hashes";
    String str2 = "content_url_hashes";
    String str3 = "";
    localObject = ((SharedPreferences)localObject).getString(str2, str3);
    localBundle.putString(str1, (String)localObject);
    localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((tr.b)localObject).a(localBundle);
    }
  }
}


/* Location:              com/google/android/gms/b/tr$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */