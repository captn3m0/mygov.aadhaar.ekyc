package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.w;

final class tw$5
  implements Runnable
{
  tw$5(tw paramtw) {}
  
  public final void run()
  {
    Object localObject = w.m();
    Context localContext = a.a;
    String str1 = a.c;
    String str2 = a.d;
    boolean bool1 = ((tx)localObject).b(localContext, str1, str2);
    if (bool1)
    {
      tp.b("Device is linked for debug signals.");
      localObject = "The device is successfully linked for troubleshooting.";
      str1 = null;
      boolean bool2 = true;
      tx.a(localContext, (String)localObject, false, bool2);
    }
    for (;;)
    {
      return;
      ((tx)localObject).c(localContext, str1, str2);
    }
  }
}


/* Location:              com/google/android/gms/b/tw$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */