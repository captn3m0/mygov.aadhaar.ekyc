package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.vc;

final class b$5
  implements Runnable
{
  b$5(b paramb, Intent paramIntent) {}
  
  public final void run()
  {
    w.s();
    Object localObject = a;
    int i = i.a((Intent)localObject);
    w.s();
    if (i == 0)
    {
      localObject = b.f.j;
      if (localObject != null)
      {
        localObject = b.f.j.b;
        if (localObject != null)
        {
          localObject = b.f.j.b.i();
          if (localObject != null)
          {
            localObject = b.f.j.b.i();
            ((g)localObject).a();
          }
        }
      }
    }
    b.f.G = false;
  }
}


/* Location:              com/google/android/gms/ads/internal/b$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */