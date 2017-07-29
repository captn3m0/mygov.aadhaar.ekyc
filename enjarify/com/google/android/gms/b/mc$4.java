package com.google.android.gms.b;

import com.google.android.gms.ads.internal.overlay.g;
import java.util.Map;

final class mc$4
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject = paramvc.i();
    if (localObject != null) {
      ((g)localObject).a();
    }
    for (;;)
    {
      return;
      localObject = paramvc.j();
      if (localObject != null)
      {
        ((g)localObject).a();
      }
      else
      {
        localObject = "A GMSG tried to close something that wasn't an overlay.";
        tp.e((String)localObject);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mc$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */