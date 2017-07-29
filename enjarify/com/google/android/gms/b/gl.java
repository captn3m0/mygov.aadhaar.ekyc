package com.google.android.gms.b;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public final class gl
  extends Thread
{
  private static final boolean b = vs.b;
  volatile boolean a = false;
  private final BlockingQueue c;
  private final BlockingQueue d;
  private final dz e;
  private final sf f;
  
  public gl(BlockingQueue paramBlockingQueue1, BlockingQueue paramBlockingQueue2, dz paramdz, sf paramsf)
  {
    c = paramBlockingQueue1;
    d = paramBlockingQueue2;
    e = paramdz;
    f = paramsf;
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
      vs.a((String)localObject1, (Object[])localObject2);
    }
    int i = 10;
    Process.setThreadPriority(i);
    Object localObject1 = e;
    ((dz)localObject1).a();
    for (;;)
    {
      try
      {
        localObject1 = c;
        localObject1 = ((BlockingQueue)localObject1).take();
        localObject1 = (pc)localObject1;
        localObject2 = "cache-queue-take";
        ((pc)localObject1).a((String)localObject2);
        localObject2 = e;
        localObject3 = b;
        localObject3 = ((dz)localObject2).a((String)localObject3);
        if (localObject3 != null) {
          break label136;
        }
        localObject2 = "cache-miss";
        ((pc)localObject1).a((String)localObject2);
        localObject2 = d;
        ((BlockingQueue)localObject2).put(localObject1);
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
      label136:
      long l1 = e;
      long l2 = System.currentTimeMillis();
      boolean bool4 = l1 < l2;
      if (bool4) {
        bool4 = bool1;
      }
      for (;;)
      {
        if (!bool4) {
          break label210;
        }
        localObject2 = "cache-hit-expired";
        localInterruptedException.a((String)localObject2);
        j = ((dz.a)localObject3);
        localObject2 = d;
        ((BlockingQueue)localObject2).put(localInterruptedException);
        break;
        bool4 = false;
        localObject2 = null;
      }
      label210:
      localObject2 = "cache-hit";
      localInterruptedException.a((String)localObject2);
      localObject2 = new com/google/android/gms/b/na;
      Object localObject4 = a;
      Map localMap = g;
      ((na)localObject2).<init>((byte[])localObject4, localMap);
      localObject4 = localInterruptedException.a((na)localObject2);
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
          break label326;
        }
        localObject2 = f;
        ((sf)localObject2).a(localInterruptedException, (re)localObject4);
        break;
        bool4 = false;
        localObject2 = null;
      }
      label326:
      localObject2 = "cache-hit-refresh-needed";
      localInterruptedException.a((String)localObject2);
      j = ((dz.a)localObject3);
      bool4 = true;
      d = bool4;
      localObject2 = f;
      Object localObject3 = new com/google/android/gms/b/gl$1;
      ((gl.1)localObject3).<init>(this, localInterruptedException);
      ((sf)localObject2).a(localInterruptedException, (re)localObject4, (Runnable)localObject3);
    }
  }
}


/* Location:              com/google/android/gms/b/gl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */