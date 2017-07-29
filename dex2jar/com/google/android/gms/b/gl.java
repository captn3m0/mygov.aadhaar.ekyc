package com.google.android.gms.b;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class gl
  extends Thread
{
  private static final boolean b = vs.b;
  volatile boolean a = false;
  private final BlockingQueue<pc<?>> c;
  private final BlockingQueue<pc<?>> d;
  private final dz e;
  private final sf f;
  
  public gl(BlockingQueue<pc<?>> paramBlockingQueue1, BlockingQueue<pc<?>> paramBlockingQueue2, dz paramdz, sf paramsf)
  {
    c = paramBlockingQueue1;
    d = paramBlockingQueue2;
    e = paramdz;
    f = paramsf;
  }
  
  public final void run()
  {
    if (b) {
      vs.a("start new dispatcher", new Object[0]);
    }
    Process.setThreadPriority(10);
    e.a();
    dz.a locala;
    for (;;)
    {
      try
      {
        pc localpc = (pc)c.take();
        localpc.a("cache-queue-take");
        locala = e.a(b);
        if (locala != null) {
          break label94;
        }
        localpc.a("cache-miss");
        d.put(localpc);
        continue;
        if (!a) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException) {}
      return;
      label94:
      if (e >= System.currentTimeMillis()) {
        break label241;
      }
      i = 1;
      label107:
      if (i == 0) {
        break;
      }
      localInterruptedException.a("cache-hit-expired");
      j = locala;
      d.put(localInterruptedException);
    }
    localInterruptedException.a("cache-hit");
    re localre = localInterruptedException.a(new na(a, g));
    localInterruptedException.a("cache-hit-parsed");
    if (f < System.currentTimeMillis()) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        f.a(localInterruptedException, localre);
        break;
      }
      localInterruptedException.a("cache-hit-refresh-needed");
      j = locala;
      d = true;
      f.a(localInterruptedException, localre, new Runnable()
      {
        public final void run()
        {
          try
          {
            gl.a(gl.this).put(localInterruptedException);
            return;
          }
          catch (InterruptedException localInterruptedException) {}
        }
      });
      break;
      label241:
      i = 0;
      break label107;
    }
  }
}


/* Location:              com/google/android/gms/b/gl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */