package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;

@qi
public final class k
{
  private final String a;
  
  public k(String paramString)
  {
    a = paramString;
  }
  
  public final boolean a(String paramString, Intent paramIntent)
  {
    if ((paramString == null) || (paramIntent == null)) {}
    String str;
    for (;;)
    {
      return false;
      w.s();
      str = i.b(paramIntent);
      w.s();
      if (paramIntent == null) {}
      for (paramIntent = null; (str != null) && (paramIntent != null); paramIntent = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE"))
      {
        w.s();
        if (paramString.equals(i.a(str))) {
          break label72;
        }
        tp.e("Developer payload not match.");
        return false;
      }
    }
    label72:
    if (a != null)
    {
      paramString = a;
      if ((TextUtils.isEmpty(str)) || (TextUtils.isEmpty(paramString)) || (TextUtils.isEmpty(paramIntent))) {
        tp.c("Purchase verification failed: missing data.");
      }
      for (boolean bool = false; !bool; bool = l.a(l.a(paramString), str, paramIntent))
      {
        tp.e("Fail to verify signature.");
        return false;
      }
    }
    return true;
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */