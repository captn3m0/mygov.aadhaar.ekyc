package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.c.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import java.util.Map;

public final class wl$c
  extends wl.a
{
  public final ah.a c;
  
  public wl$c(ah.a parama, c paramc)
  {
    super(paramc);
    c = parama;
  }
  
  public final void b(x.a parama)
  {
    Object localObject1 = d;
    Object localObject2 = c;
    localObject1 = (al)((Map)localObject1).remove(localObject2);
    if (localObject1 != null)
    {
      localObject1 = a.a;
      localObject2 = null;
      a = null;
    }
    for (;;)
    {
      return;
      Object localObject3 = new java/lang/Exception;
      ((Exception)localObject3).<init>();
      Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", (Throwable)localObject3);
      localObject1 = b;
      localObject2 = new com/google/android/gms/common/api/l;
      localObject3 = Status.c;
      ((l)localObject2).<init>((Status)localObject3);
      ((c)localObject1).a((Exception)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/wl$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */