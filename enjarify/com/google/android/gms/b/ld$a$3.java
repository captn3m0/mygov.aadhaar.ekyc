package com.google.android.gms.b;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

final class ld$a$3
  implements md
{
  ld$a$3(ld.a parama, nk paramnk) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject = (vc)b.a.get();
    if (localObject == null)
    {
      localObject = a;
      String str = "/hideOverlay";
      ((nk)localObject).b(str, this);
    }
    for (;;)
    {
      return;
      localObject = ((vc)localObject).b();
      int i = 8;
      ((View)localObject).setVisibility(i);
    }
  }
}


/* Location:              com/google/android/gms/b/ld$a$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */