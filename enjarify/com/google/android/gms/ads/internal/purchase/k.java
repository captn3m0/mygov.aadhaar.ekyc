package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.tp;
import java.security.PublicKey;

public final class k
{
  private final String a;
  
  public k(String paramString)
  {
    a = paramString;
  }
  
  public final boolean a(String paramString, Intent paramIntent)
  {
    boolean bool1 = false;
    if ((paramString == null) || (paramIntent == null)) {}
    for (;;)
    {
      return bool1;
      w.s();
      String str1 = i.b(paramIntent);
      w.s();
      boolean bool2;
      if (paramIntent == null) {
        bool2 = false;
      }
      for (String str2 = null;; str2 = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE"))
      {
        if ((str1 == null) || (str2 == null)) {
          break label91;
        }
        w.s();
        localObject = i.a(str1);
        boolean bool3 = paramString.equals(localObject);
        if (bool3) {
          break label93;
        }
        str2 = "Developer payload not match.";
        tp.e(str2);
        break;
      }
      label91:
      continue;
      label93:
      Object localObject = a;
      if (localObject != null)
      {
        localObject = a;
        boolean bool4 = TextUtils.isEmpty(str1);
        if (!bool4)
        {
          bool4 = TextUtils.isEmpty((CharSequence)localObject);
          if (!bool4)
          {
            bool4 = TextUtils.isEmpty(str2);
            if (!bool4) {
              break label174;
            }
          }
        }
        tp.c("Purchase verification failed: missing data.");
        bool2 = false;
        str2 = null;
        for (;;)
        {
          if (bool2) {
            break label195;
          }
          str2 = "Fail to verify signature.";
          tp.e(str2);
          break;
          label174:
          localObject = l.a((String)localObject);
          bool2 = l.a((PublicKey)localObject, str1, str2);
        }
      }
      label195:
      bool1 = true;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */