package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.a.a;

public final class i$1
  implements Runnable
{
  public i$1(Context paramContext) {}
  
  public final void run()
  {
    i.1.1 local1 = new com/google/android/gms/ads/internal/purchase/i$1$1;
    local1.<init>(this);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    a.a();
    a.b(a, localIntent, local1, 1);
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/i$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */