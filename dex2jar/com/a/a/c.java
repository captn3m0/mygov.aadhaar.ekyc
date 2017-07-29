package com.a.a;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class c
  extends Thread
{
  private static final boolean b = t.b;
  volatile boolean a = false;
  private final BlockingQueue<l<?>> c;
  private final BlockingQueue<l<?>> d;
  private final b e;
  private final o f;
  
  public c(BlockingQueue<l<?>> paramBlockingQueue1, BlockingQueue<l<?>> paramBlockingQueue2, b paramb, o paramo)
  {
    c = paramBlockingQueue1;
    d = paramBlockingQueue2;
    e = paramb;
    f = paramo;
  }
  
  public final void run()
  {
    if (b) {
      t.a("start new dispatcher", new Object[0]);
    }
    Process.setThreadPriority(10);
    e.a();
    label73:
    b.a locala;
    for (;;)
    {
      try
      {
        l locall = (l)c.take();
        locall.a("cache-queue-take");
        if (!h) {
          break label73;
        }
        locall.b("cache-discard-canceled");
        continue;
        if (!a) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException) {}
      return;
      locala = e.a(b);
      if (locala == null)
      {
        localInterruptedException.a("cache-miss");
        d.put(localInterruptedException);
      }
      else
      {
        if (e >= System.currentTimeMillis()) {
          break label257;
        }
        i = 1;
        label123:
        if (i == 0) {
          break;
        }
        localInterruptedException.a("cache-hit-expired");
        k = locala;
        d.put(localInterruptedException);
      }
    }
    localInterruptedException.a("cache-hit");
    n localn = localInterruptedException.a(new i(a, g));
    localInterruptedException.a("cache-hit-parsed");
    if (f < System.currentTimeMillis()) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        f.a(localInterruptedException, localn);
        break;
      }
      localInterruptedException.a("cache-hit-refresh-needed");
      k = locala;
      d = true;
      f.a(localInterruptedException, localn, new Runnable()
      {
        public final void run()
        {
          try
          {
            c.a(c.this).put(localInterruptedException);
            return;
          }
          catch (InterruptedException localInterruptedException) {}
        }
      });
      break;
      label257:
      i = 0;
      break label123;
    }
  }
}


/* Location:              com/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */