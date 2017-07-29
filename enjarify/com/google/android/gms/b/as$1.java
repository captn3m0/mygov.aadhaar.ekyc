package com.google.android.gms.b;

import android.os.Message;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;

final class as$1
  implements Runnable
{
  as$1(as paramas, g paramg) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = h.c;
      boolean bool = true;
      localObject3 = Boolean.valueOf(bool);
      ((ThreadLocal)localObject1).set(localObject3);
      localObject1 = b;
      localObject1 = a;
      localObject1 = ((j)localObject1).a();
      localObject3 = b;
      localObject3 = h;
      localObject5 = b;
      localObject5 = h;
      i = 0;
      localObject1 = ((as.a)localObject5).obtainMessage(0, localObject1);
      ((as.a)localObject3).sendMessage((Message)localObject1);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Object localObject3 = b;
        localObject3 = h;
        localObject5 = b;
        localObject5 = h;
        int i = 1;
        localObject2 = ((as.a)localObject5).obtainMessage(i, localRuntimeException);
        ((as.a)localObject3).sendMessage((Message)localObject2);
        localObject2 = h.c;
        localObject3 = Boolean.valueOf(false);
        ((ThreadLocal)localObject2).set(localObject3);
        localObject2 = (c)b.g.get();
        if (localObject2 != null)
        {
          localObject3 = b;
          ((c)localObject2).b((as)localObject3);
        }
      }
    }
    finally
    {
      Object localObject2 = h.c;
      Object localObject5 = Boolean.valueOf(false);
      ((ThreadLocal)localObject2).set(localObject5);
      localObject2 = (c)b.g.get();
      if (localObject2 != null)
      {
        localObject5 = b;
        ((c)localObject2).b((as)localObject5);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/as$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */