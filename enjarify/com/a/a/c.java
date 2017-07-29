package com.a.a;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public final class c
  extends Thread
{
  private static final boolean b = t.b;
  volatile boolean a = false;
  private final BlockingQueue c;
  private final BlockingQueue d;
  private final b e;
  private final o f;
  
  public c(BlockingQueue paramBlockingQueue1, BlockingQueue paramBlockingQueue2, b paramb, o paramo)
  {
    c = paramBlockingQueue1;
    d = paramBlockingQueue2;
    e = paramb;
    f = paramo;
  }
  
  public final void run()
  {
    boolean bool1 = true;
    boolean bool2 = b;
    Object localObject2;
    if (bool2)
    {
      localObject1 = "start new dispatcher";
      localObject2 = new Object[0];
      t.a((String)localObject1, (Object[])localObject2);
    }
    int i = 10;
    Process.setThreadPriority(i);
    Object localObject1 = e;
    ((b)localObject1).a();
    for (;;)
    {
      boolean bool4;
      try
      {
        localObject1 = c;
        localObject1 = ((BlockingQueue)localObject1).take();
        localObject1 = (l)localObject1;
        localObject2 = "cache-queue-take";
        ((l)localObject1).a((String)localObject2);
        bool4 = h;
        if (!bool4) {
          break label105;
        }
        localObject2 = "cache-discard-canceled";
        ((l)localObject1).b((String)localObject2);
        continue;
        boolean bool3;
        if (!bool3) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        bool3 = a;
      }
      return;
      label105:
      localObject2 = e;
      Object localObject3 = b;
      localObject3 = ((b)localObject2).a((String)localObject3);
      if (localObject3 == null)
      {
        localObject2 = "cache-miss";
        localInterruptedException.a((String)localObject2);
        localObject2 = d;
        ((BlockingQueue)localObject2).put(localInterruptedException);
      }
      else
      {
        long l1 = e;
        long l2 = System.currentTimeMillis();
        bool4 = l1 < l2;
        if (bool4) {
          bool4 = bool1;
        }
        for (;;)
        {
          if (!bool4) {
            break label234;
          }
          localObject2 = "cache-hit-expired";
          localInterruptedException.a((String)localObject2);
          k = ((b.a)localObject3);
          localObject2 = d;
          ((BlockingQueue)localObject2).put(localInterruptedException);
          break;
          bool4 = false;
          localObject2 = null;
        }
        label234:
        localObject2 = "cache-hit";
        localInterruptedException.a((String)localObject2);
        localObject2 = new com/a/a/i;
        Object localObject4 = a;
        Map localMap = g;
        ((i)localObject2).<init>((byte[])localObject4, localMap);
        localObject4 = localInterruptedException.a((i)localObject2);
        localObject2 = "cache-hit-parsed";
        localInterruptedException.a((String)localObject2);
        l1 = f;
        l2 = System.currentTimeMillis();
        bool4 = l1 < l2;
        if (bool4) {
          bool4 = bool1;
        }
        for (;;)
        {
          if (bool4) {
            break label350;
          }
          localObject2 = f;
          ((o)localObject2).a(localInterruptedException, (n)localObject4);
          break;
          bool4 = false;
          localObject2 = null;
        }
        label350:
        localObject2 = "cache-hit-refresh-needed";
        localInterruptedException.a((String)localObject2);
        k = ((b.a)localObject3);
        bool4 = true;
        d = bool4;
        localObject2 = f;
        localObject3 = new com/a/a/c$1;
        ((c.1)localObject3).<init>(this, localInterruptedException);
        ((o)localObject2).a(localInterruptedException, (n)localObject4, (Runnable)localObject3);
      }
    }
  }
}


/* Location:              com/a/a/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */