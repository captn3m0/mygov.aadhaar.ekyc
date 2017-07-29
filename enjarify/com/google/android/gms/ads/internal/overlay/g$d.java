package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tu;
import com.google.android.gms.b.uc;
import java.util.Map;

final class g$d
  extends to
{
  private g$d(g paramg) {}
  
  public final void a()
  {
    Object localObject1 = w.z();
    int i = a.c.p.f;
    Object localObject2 = Integer.valueOf(i);
    localObject1 = (Bitmap)a.get(localObject2);
    if (localObject1 != null)
    {
      localObject2 = w.g();
      Object localObject3 = g.a(a);
      n localn1 = a.c.p;
      boolean bool = d;
      n localn2 = a.c.p;
      float f = e;
      localObject1 = ((tu)localObject2).a((Context)localObject3, (Bitmap)localObject1, bool, f);
      localObject2 = tt.a;
      localObject3 = new com/google/android/gms/ads/internal/overlay/g$d$1;
      ((g.d.1)localObject3).<init>(this, (Drawable)localObject1);
      ((Handler)localObject2).post((Runnable)localObject3);
    }
  }
  
  public final void c_() {}
}


/* Location:              com/google/android/gms/ads/internal/overlay/g$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */