package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.c.a.a;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import java.io.IOException;

@qi
public final class td
  implements tf
{
  public final us<a.a> a(Context paramContext)
  {
    final up localup = new up();
    ip.a();
    if (uk.d(paramContext)) {
      ts.a(new Runnable()
      {
        public final void run()
        {
          try
          {
            a.a locala = a.a(td.this);
            localup.b(locala);
            return;
          }
          catch (d locald)
          {
            localup.a(locald);
            ul.b("Exception while getting advertising Id info", locald);
            return;
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
      });
    }
    return localup;
  }
  
  public final us<String> a(qo paramqo)
  {
    return new uq(h);
  }
}


/* Location:              com/google/android/gms/b/td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */