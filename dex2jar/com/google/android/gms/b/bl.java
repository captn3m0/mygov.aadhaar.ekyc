package com.google.android.gms.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;

public class bl
{
  protected static volatile vz a = null;
  private static final ConditionVariable d = new ConditionVariable();
  private static volatile Random e = null;
  protected volatile Boolean b;
  private eu c;
  
  public bl(eu parameu)
  {
    c = parameu;
    c.execute(new Runnable()
    {
      public final void run()
      {
        if (b != null) {
          return;
        }
        synchronized (bl.b())
        {
          if (b != null) {
            return;
          }
        }
        jz localjz = ke.bH;
        boolean bool1 = ((Boolean)w.q().a(localjz)).booleanValue();
        bool2 = bool1;
        if (bool1) {}
        try
        {
          bl.a = new vz(bl.a(bl.this).a(), "ADSHIELD");
          bool2 = bool1;
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            bool2 = false;
          }
        }
        b = Boolean.valueOf(bool2);
        bl.b().open();
      }
    });
  }
  
  public static int a()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return ThreadLocalRandom.current().nextInt();
      }
      int i = c().nextInt();
      return i;
    }
    catch (RuntimeException localRuntimeException) {}
    return c().nextInt();
  }
  
  private static Random c()
  {
    if (e == null) {}
    try
    {
      if (e == null) {
        e = new Random();
      }
      return e;
    }
    finally {}
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong)
  {
    try
    {
      d.block();
      if ((b.booleanValue()) && (a != null) && (c.d()))
      {
        Object localObject1 = new be.a();
        a = c.a().getPackageName();
        b = Long.valueOf(paramLong);
        localObject1 = new vz.a(a, gb.a((gb)localObject1), '\000');
        h.f = paramInt2;
        h.e = paramInt1;
        Object localObject2 = c.k;
        if (i) {
          throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        i = true;
        localObject2 = new wb(new wj(vz.h(j), vz.i(j), a, b, c, d, vz.g(j), e), h, f, vz.b(), vz.c(), vz.b(), vz.d(), g);
        wj localwj = a;
        if (vz.j(j).a(g, c))
        {
          vz.k(j).a((wb)localObject2);
          return;
        }
        e.a(Status.a);
        return;
      }
    }
    catch (Exception localException) {}
  }
}


/* Location:              com/google/android/gms/b/bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */