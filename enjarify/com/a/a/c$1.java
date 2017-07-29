package com.a.a;

import java.util.concurrent.BlockingQueue;

final class c$1
  implements Runnable
{
  c$1(c paramc, l paraml) {}
  
  public final void run()
  {
    try
    {
      Object localObject = b;
      localObject = c.a((c)localObject);
      l locall = a;
      ((BlockingQueue)localObject).put(locall);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/a/a/c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */