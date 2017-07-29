package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;

@qi
public final class si
  extends to
  implements sk, sn
{
  final Context a;
  final String b;
  final String c;
  final nr d;
  private final tg.a e;
  private final sp f;
  private final sn g;
  private final Object h;
  private final long i;
  private int j = 0;
  private int l = 3;
  private sj m;
  
  public si(Context paramContext, String paramString1, String paramString2, nr paramnr, tg.a parama, sp paramsp, sn paramsn, long paramLong)
  {
    a = paramContext;
    b = paramString1;
    c = paramString2;
    d = paramnr;
    e = parama;
    f = paramsp;
    h = new Object();
    g = paramsn;
    i = paramLong;
  }
  
  private boolean a(long paramLong)
  {
    paramLong = i - (w.k().b() - paramLong);
    if (paramLong <= 0L)
    {
      l = 4;
      return false;
    }
    try
    {
      h.wait(paramLong);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      l = 5;
    }
    return false;
  }
  
  public final void a()
  {
    if ((f == null) || (f.b == null) || (f.a == null)) {
      return;
    }
    final sm localsm = f.b;
    b = null;
    a = this;
    ??? = e.a.c;
    final Object localObject3 = f.a;
    try
    {
      if (((od)localObject3).g())
      {
        uk.a.post(new Runnable()
        {
          public final void run()
          {
            a(localObject2, localObject3);
          }
        });
        l1 = w.k().b();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        synchronized (h)
        {
          long l1;
          if (j != 0)
          {
            localObject3 = new sj.a();
            d = (w.k().b() - l1);
            if (1 == j)
            {
              k = 6;
              c = k;
              a = b;
              b = d.d;
              m = ((sj.a)localObject3).a();
              b = null;
              a = null;
              if (j != 1) {
                break;
              }
              g.a(b);
              return;
              uk.a.post(new Runnable()
              {
                public final void run()
                {
                  try
                  {
                    localObject3.a(b.a(a), localObject2, null, localsm, c);
                    return;
                  }
                  catch (RemoteException localRemoteException)
                  {
                    str = String.valueOf(b);
                    if (str.length() == 0) {}
                  }
                  for (String str = "Fail to initialize adapter ".concat(str);; str = new String("Fail to initialize adapter "))
                  {
                    tp.c(str, localRemoteException);
                    a(0);
                    return;
                  }
                }
              });
              continue;
              localRemoteException = localRemoteException;
              tp.c("Fail to check if adapter is initialized.", localRemoteException);
              a(0);
              continue;
            }
            int k = l;
            continue;
          }
          if (!a(l1))
          {
            localObject3 = new sj.a();
            c = l;
            d = (w.k().b() - l1);
            a = b;
            b = d.d;
            m = ((sj.a)localObject3).a();
          }
        }
      }
      g.a(l);
    }
  }
  
  public final void a(int paramInt)
  {
    synchronized (h)
    {
      j = 2;
      l = paramInt;
      h.notify();
      return;
    }
  }
  
  final void a(ih paramih, od paramod)
  {
    f.b.b = this;
    try
    {
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(b))
      {
        paramod.a(paramih, c, d.a);
        return;
      }
      paramod.a(paramih, c);
      return;
    }
    catch (RemoteException paramih)
    {
      tp.c("Fail to load ad from adapter.", paramih);
      a(0);
    }
  }
  
  public final void a(String arg1)
  {
    synchronized (h)
    {
      j = 1;
      h.notify();
      return;
    }
  }
  
  public final void c_() {}
  
  public final sj d()
  {
    synchronized (h)
    {
      sj localsj = m;
      return localsj;
    }
  }
  
  public final void e()
  {
    a(e.a.c, f.a);
  }
  
  public final void f()
  {
    a(0);
  }
}


/* Location:              com/google/android/gms/b/si.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */