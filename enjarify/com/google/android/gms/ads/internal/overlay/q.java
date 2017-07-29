package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.google.android.gms.b.il;
import com.google.android.gms.b.kk;
import com.google.android.gms.b.km;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;

public final class q
  extends m
{
  public final l a(Context paramContext, vc paramvc, boolean paramBoolean, km paramkm)
  {
    Object localObject = paramContext.getApplicationInfo();
    int i = Build.VERSION.SDK_INT;
    int j;
    if (localObject != null)
    {
      j = targetSdkVersion;
      i = 11;
      if (j < i) {}
    }
    else
    {
      j = 1;
      if (j != 0) {
        break label60;
      }
      j = 0;
    }
    label60:
    f localf;
    for (localObject = null;; localObject = localf)
    {
      return (l)localObject;
      j = 0;
      localObject = null;
      break;
      localf = new com/google/android/gms/ads/internal/overlay/f;
      boolean bool = kd;
      localObject = new com/google/android/gms/ads/internal/overlay/ab;
      un localun = paramvc.o();
      String str = paramvc.v();
      kk localkk = paramvc.x();
      ((ab)localObject).<init>(paramContext, localun, str, paramkm, localkk);
      localf.<init>(paramContext, paramBoolean, bool, (ab)localObject);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */