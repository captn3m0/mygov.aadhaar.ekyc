package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.f;

final class ql$1
  implements ql.b
{
  ql$1(Context paramContext) {}
  
  public final boolean a(un paramun)
  {
    boolean bool = d;
    Object localObject;
    if (!bool)
    {
      localObject = a;
      bool = f.b((Context)localObject);
      if (bool)
      {
        localObject = ke.O;
        kd localkd = w.q();
        localObject = (Boolean)localkd.a((jz)localObject);
        bool = ((Boolean)localObject).booleanValue();
        if (bool) {}
      }
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              com/google/android/gms/b/ql$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */