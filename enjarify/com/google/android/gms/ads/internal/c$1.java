package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.il;
import com.google.android.gms.b.md;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.vc;
import java.util.Map;

final class c$1
  implements md
{
  c$1(c paramc) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject = a.f.j;
    if (localObject != null)
    {
      localObject = a.h;
      il localil = a.f.i;
      tg localtg = a.f.j;
      View localView = paramvc.b();
      ((gv)localObject).a(localil, localtg, localView, paramvc);
    }
    for (;;)
    {
      return;
      localObject = "Request to enable ActiveView before adState is available.";
      tp.e((String)localObject);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */