package com.google.android.gms.b;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

final class ld$a$2
  implements md
{
  ld$a$2(ld.a parama, nk paramnk) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject = (vc)b.a.get();
    String str;
    if (localObject == null)
    {
      localObject = a;
      str = "/showOverlay";
      ((nk)localObject).b(str, this);
    }
    for (;;)
    {
      return;
      localObject = ((vc)localObject).b();
      str = null;
      ((View)localObject).setVisibility(0);
    }
  }
}


/* Location:              com/google/android/gms/b/ld$a$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */