package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;

final class m$a
  extends to
{
  private final int b;
  
  public m$a(m paramm, int paramInt)
  {
    b = paramInt;
  }
  
  public final void a()
  {
    int i = -1;
    Object localObject1 = new com/google/android/gms/ads/internal/n;
    Object localObject2 = a.f;
    boolean bool1 = H;
    Object localObject3 = a;
    boolean bool2 = ((m)localObject3).N();
    m localm1 = a;
    boolean bool3 = m.a(localm1);
    m localm2 = a;
    float f = m.b(localm2);
    Object localObject4 = a.f;
    boolean bool4 = H;
    int k;
    int j;
    if (bool4)
    {
      k = b;
      ((n)localObject1).<init>(bool1, bool2, bool3, f, k);
      localObject2 = a.f.j.b;
      j = ((vc)localObject2).q();
      if (j != i) {
        break label256;
      }
      localObject2 = a.f.j;
    }
    label256:
    for (i = g;; i = j)
    {
      localObject2 = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
      localObject3 = a;
      localm1 = a;
      localm2 = a;
      localObject4 = a.f.j.b;
      un localun = a.f.e;
      String str = a.f.j.C;
      ((AdOverlayInfoParcel)localObject2).<init>((ib)localObject3, localm1, localm2, (vc)localObject4, i, localun, str, (n)localObject1);
      localObject1 = tt.a;
      localObject3 = new com/google/android/gms/ads/internal/m$a$1;
      ((m.a.1)localObject3).<init>(this, (AdOverlayInfoParcel)localObject2);
      ((Handler)localObject1).post((Runnable)localObject3);
      return;
      k = i;
      break;
    }
  }
  
  public final void c_() {}
}


/* Location:              com/google/android/gms/ads/internal/m$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */