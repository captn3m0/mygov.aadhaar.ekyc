package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.common.internal.z.a;

final class r$d$1
  extends v.a
{
  r$d$1(u paramu, r paramr, eq parameq)
  {
    super(paramu);
  }
  
  public final void a()
  {
    r localr = a;
    Object localObject1 = b;
    Object localObject2 = null;
    boolean bool1 = localr.b(0);
    if (bool1)
    {
      localObject2 = b;
      boolean bool2 = ((a)localObject2).b();
      if (!bool2) {
        break label186;
      }
      localObject1 = c;
      localObject2 = c;
      bool2 = ((a)localObject2).b();
      if (bool2) {
        break label137;
      }
      localObject1 = "GoogleApiClientConnecting";
      String str = String.valueOf(localObject2);
      int i = String.valueOf(str).length() + 48;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      str = "Sign-in succeeded with resolve account failure: " + str;
      Exception localException = new java/lang/Exception;
      localException.<init>();
      Log.wtf((String)localObject1, str, localException);
      localr.b((a)localObject2);
    }
    for (;;)
    {
      return;
      label137:
      g = true;
      localObject2 = z.a.a(b);
      h = ((z)localObject2);
      bool1 = d;
      i = bool1;
      boolean bool3 = e;
      j = bool3;
      localr.e();
      continue;
      label186:
      bool3 = localr.a((a)localObject2);
      if (bool3)
      {
        localr.f();
        localr.e();
      }
      else
      {
        localr.b((a)localObject2);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/r$d$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */