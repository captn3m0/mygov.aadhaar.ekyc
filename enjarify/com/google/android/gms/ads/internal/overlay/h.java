package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import com.google.android.gms.common.util.i;

public final class h
{
  public static void a(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    int i = k;
    int j = 4;
    Object localObject1;
    Object localObject2;
    if (i == j)
    {
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = b;
        if (localObject1 != null)
        {
          localObject1 = b;
          ((ib)localObject1).e();
        }
        w.b();
        localObject1 = a;
        localObject2 = i;
        a.a(paramContext, (e)localObject1, (s)localObject2);
      }
    }
    for (;;)
    {
      return;
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      ((Intent)localObject1).setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
      un localun = m;
      boolean bool3 = d;
      ((Intent)localObject1).putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", bool3);
      localObject2 = "shouldCallOnOverlayOpened";
      ((Intent)localObject1).putExtra((String)localObject2, paramBoolean);
      AdOverlayInfoParcel.a((Intent)localObject1, paramAdOverlayInfoParcel);
      boolean bool1 = i.e();
      if (!bool1)
      {
        int k = 524288;
        ((Intent)localObject1).addFlags(k);
      }
      boolean bool2 = paramContext instanceof Activity;
      if (!bool2)
      {
        int m = 268435456;
        ((Intent)localObject1).addFlags(m);
      }
      w.e();
      tt.a((Context)paramContext, (Intent)localObject1);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */