package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import java.io.IOException;

final class td$1
  implements Runnable
{
  td$1(Context paramContext, up paramup) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = a;
      localObject1 = a.a((Context)localObject1);
      localObject2 = b;
      ((up)localObject2).b(localObject1);
      return;
    }
    catch (d locald)
    {
      for (;;)
      {
        b.a(locald);
        Object localObject2 = "Exception while getting advertising Id info";
        ul.b((String)localObject2, locald);
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    catch (e locale)
    {
      for (;;) {}
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/b/td$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */