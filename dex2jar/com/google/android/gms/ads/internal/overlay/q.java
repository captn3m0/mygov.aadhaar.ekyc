package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.google.android.gms.b.il;
import com.google.android.gms.b.km;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.vc;

@qi
public final class q
  extends m
{
  public final l a(Context paramContext, vc paramvc, boolean paramBoolean, km paramkm)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    int i = Build.VERSION.SDK_INT;
    if ((localApplicationInfo == null) || (targetSdkVersion >= 11)) {}
    for (i = 1; i == 0; i = 0) {
      return null;
    }
    return new f(paramContext, paramBoolean, kd, new ab(paramContext, paramvc.o(), paramvc.v(), paramkm, paramvc.x()));
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */