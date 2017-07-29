package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;

final class qk$2
  implements Runnable
{
  qk$2(qk paramqk, uv paramuv) {}
  
  public final void run()
  {
    Object localObject1 = b;
    synchronized (b)
    {
      Object localObject4 = b;
      qk localqk = b;
      localObject1 = b;
      localObject1 = a;
      un localun = j;
      uv localuv = a;
      Context localContext = c;
      localObject1 = new com/google/android/gms/b/ql$1;
      ((ql.1)localObject1).<init>(localContext);
      boolean bool = ((ql.b)localObject1).a(localun);
      if (bool)
      {
        localObject1 = "Fetching ad response from local ad request service.";
        tp.b((String)localObject1);
        localObject1 = new com/google/android/gms/b/qm$a;
        ((qm.a)localObject1).<init>(localContext, localuv, localqk);
        ((qm)localObject1).c();
      }
      for (;;)
      {
        e = ((tv)localObject1);
        localObject1 = b;
        localObject1 = e;
        if (localObject1 == null)
        {
          localObject1 = b;
          localObject4 = "Could not start the ad request service.";
          localqk = null;
          ((qk)localObject1).a(0, (String)localObject4);
          localObject1 = tt.a;
          localObject4 = b;
          localObject4 = d;
          ((Handler)localObject1).removeCallbacks((Runnable)localObject4);
        }
        return;
        localObject1 = "Fetching ad response from remote ad request service.";
        tp.b((String)localObject1);
        ip.a();
        bool = uk.c(localContext);
        if (bool) {
          break;
        }
        localObject1 = "Failed to connect to remote ad request service.";
        tp.e((String)localObject1);
        bool = false;
        localObject1 = null;
      }
      localObject1 = new com/google/android/gms/b/qm$b;
      ((qm.b)localObject1).<init>(localContext, localun, localuv, localqk);
    }
  }
}


/* Location:              com/google/android/gms/b/qk$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */