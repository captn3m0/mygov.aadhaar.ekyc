package com.google.android.gms.b;

import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.g.b;
import com.google.android.gms.ads.internal.overlay.r;

final class vd$2
  implements Runnable
{
  vd$2(vd paramvd) {}
  
  public final void run()
  {
    a.a.B();
    Object localObject = a.a.i();
    if (localObject != null)
    {
      g.b localb = l;
      r localr = f;
      localb.removeView(localr);
      boolean bool = true;
      ((g)localObject).a(bool);
    }
    localObject = vd.a(a);
    if (localObject != null)
    {
      vd.a(a).a();
      localObject = a;
      vd.b((vd)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/vd$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */