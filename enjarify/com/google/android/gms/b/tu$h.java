package com.google.android.gms.b;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.w;

public final class tu$h
  extends tu.g
{
  public final vd a(vc paramvc, boolean paramBoolean)
  {
    vo localvo = new com/google/android/gms/b/vo;
    localvo.<init>(paramvc, paramBoolean);
    return localvo;
  }
  
  public final CookieManager c(Context paramContext)
  {
    try
    {
      localCookieManager = CookieManager.getInstance();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        CookieManager localCookieManager;
        tp.b("Failed to obtain CookieManager.", localException);
        tj localtj = w.i();
        String str = "ApiLevelUtil.getCookieManager";
        localtj.a(localException, str);
        Object localObject = null;
      }
    }
    return localCookieManager;
  }
}


/* Location:              com/google/android/gms/b/tu$h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */