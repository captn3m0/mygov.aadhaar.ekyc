package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.b.pk;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.tp;

final class c$1
  implements Runnable
{
  c$1(c paramc, f paramf, Intent paramIntent) {}
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        localObject1 = c;
        localObject1 = c.a((c)localObject1);
        localObject2 = a;
        localObject2 = b;
        localObject3 = b;
        boolean bool1 = ((k)localObject1).a((String)localObject2, (Intent)localObject3);
        if (bool1)
        {
          localObject1 = c;
          localpl = c.c((c)localObject1);
          localObject1 = new com/google/android/gms/ads/internal/purchase/g;
          localObject2 = c;
          localObject2 = c.b((c)localObject2);
          localObject3 = a;
          localObject3 = c;
          bool2 = true;
          i = -1;
          localIntent = b;
          localf = a;
          ((g)localObject1).<init>((Context)localObject2, (String)localObject3, bool2, i, localIntent, localf);
          localpl.a((pk)localObject1);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        pl localpl;
        boolean bool2;
        int i;
        Intent localIntent;
        f localf;
        String str = "Fail to verify and dispatch pending transaction";
        tp.e(str);
        continue;
      }
      localObject1 = c;
      localpl = c.c((c)localObject1);
      localObject1 = new com/google/android/gms/ads/internal/purchase/g;
      localObject2 = c;
      localObject2 = c.b((c)localObject2);
      localObject3 = a;
      localObject3 = c;
      bool2 = false;
      i = -1;
      localIntent = b;
      localf = a;
      ((g)localObject1).<init>((Context)localObject2, (String)localObject3, false, i, localIntent, localf);
      localpl.a((pk)localObject1);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */