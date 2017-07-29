package com.google.android.gms.b;

import android.os.Message;
import java.util.concurrent.locks.Lock;

abstract class r$f
  implements Runnable
{
  private r$f(r paramr) {}
  
  protected abstract void a();
  
  public void run()
  {
    Lock localLock = b.b;
    localLock.lock();
    for (;;)
    {
      try
      {
        boolean bool = Thread.interrupted();
        if (bool)
        {
          localLock = b.b;
          localLock.unlock();
          return;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject3 = b;
        localObject3 = a;
        v.b localb = e;
        int i = 2;
        Object localObject1 = localb.obtainMessage(i, localRuntimeException);
        localObject3 = e;
        ((v.b)localObject3).sendMessage((Message)localObject1);
        localObject1 = b.b;
        ((Lock)localObject1).unlock();
        continue;
      }
      finally
      {
        b.b.unlock();
      }
      a();
      localLock = b.b;
      localLock.unlock();
    }
  }
}


/* Location:              com/google/android/gms/b/r$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */