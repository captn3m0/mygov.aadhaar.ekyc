package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.ads.internal.w;

public final class tp
  extends ul
{
  public static void a(String paramString)
  {
    boolean bool = a();
    if (bool)
    {
      String str = "Ads";
      Log.v(str, paramString);
    }
  }
  
  public static boolean a()
  {
    boolean bool = a(2);
    Object localObject;
    if (bool)
    {
      localObject = ke.bl;
      kd localkd = w.q();
      localObject = (Boolean)localkd.a((jz)localObject);
      bool = ((Boolean)localObject).booleanValue();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              com/google/android/gms/b/tp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */