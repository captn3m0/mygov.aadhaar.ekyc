package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.b.md;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.vc;
import java.util.Map;

final class p$5
  implements md
{
  p$5(og paramog, g.a parama, oh paramoh) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = paramvc.b();
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      boolean bool;
      try
      {
        localObject3 = a;
        if (localObject3 == null) {
          break label100;
        }
        localObject3 = a;
        bool = ((og)localObject3).k();
        if (bool) {
          break label93;
        }
        localObject3 = a;
        localObject1 = b.a(localObject1);
        ((og)localObject3).a((a)localObject1);
        localObject1 = b;
        localObject1 = a;
        ((g)localObject1).e();
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = "Unable to call handleClick on mapper";
        tp.c((String)localObject3, localRemoteException);
      }
      continue;
      label93:
      p.a(paramvc);
      continue;
      label100:
      Object localObject3 = c;
      if (localObject3 != null)
      {
        localObject3 = c;
        bool = ((oh)localObject3).i();
        if (!bool)
        {
          localObject3 = c;
          Object localObject2 = b.a(localRemoteException);
          ((oh)localObject3).a((a)localObject2);
          localObject2 = b;
          localObject2 = a;
          ((g)localObject2).e();
        }
        else
        {
          p.a(paramvc);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/p$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */