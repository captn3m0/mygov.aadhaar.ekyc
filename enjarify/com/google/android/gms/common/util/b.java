package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.b.bb;
import com.google.android.gms.b.bc;

public final class b
{
  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool = false;
    Object localObject = "com.google.android.gms";
    ((String)localObject).equals(paramString);
    try
    {
      localObject = bc.a(paramContext);
      int i = 0;
      localObject = ((bb)localObject).a(paramString, 0);
      int j = flags;
      i = 2097152;
      j &= i;
      if (j != 0) {
        bool = true;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
}


/* Location:              com/google/android/gms/common/util/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */