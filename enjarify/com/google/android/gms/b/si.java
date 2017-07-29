package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;

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
    Object localObject = new java/lang/Object;
    localObject.<init>();
    h = localObject;
    g = paramsn;
    i = paramLong;
  }
  
  private boolean a(long paramLong)
  {
    boolean bool1 = false;
    long l1 = i;
    Object localObject = w.k();
    long l2 = ((c)localObject).b() - paramLong;
    l1 -= l2;
    l2 = 0L;
    boolean bool2 = l1 < l2;
    int k;
    if (!bool2)
    {
      k = 4;
      l = k;
    }
    for (;;)
    {
      return bool1;
      try
      {
        localObject = h;
        localObject.wait(l1);
        bool1 = true;
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread localThread = Thread.currentThread();
        localThread.interrupt();
        k = 5;
        l = k;
      }
    }
  }
  
  public final void a()
  {
    int k = 1;
    Object localObject1 = f;
    if (localObject1 != null)
    {
      localObject1 = f.b;
      if (localObject1 != null)
      {
        localObject1 = f.a;
        if (localObject1 != null) {
          break label36;
        }
      }
    }
    for (;;)
    {
      return;
      label36:
      Object localObject4 = f.b;
      b = null;
      a = this;
      localObject1 = e.a.c;
      Object localObject5 = f.a;
      try
      {
        boolean bool1 = ((od)localObject5).g();
        if (bool1)
        {
          localHandler = uk.a;
          ??? = new com/google/android/gms/b/si$1;
          ((si.1)???).<init>(this, (ih)localObject1, (od)localObject5);
          localHandler.post((Runnable)???);
          localObject1 = w.k();
          l1 = ((c)localObject1).b();
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          synchronized (h)
          {
            Handler localHandler;
            long l1;
            int n = j;
            Object localObject7;
            long l2;
            Object localObject2;
            if (n != 0)
            {
              localObject7 = new com/google/android/gms/b/sj$a;
              ((sj.a)localObject7).<init>();
              localObject1 = w.k();
              l2 = ((c)localObject1).b();
              l1 = l2 - l1;
              d = l1;
              n = j;
              if (k == n)
              {
                n = 6;
                c = n;
                localObject1 = b;
                a = ((String)localObject1);
                localObject1 = d;
                localObject1 = d;
                b = ((String)localObject1);
                localObject1 = ((sj.a)localObject7).a();
                m = ((sj)localObject1);
                b = null;
                a = null;
                n = j;
                if (n != k) {
                  break label472;
                }
                localObject1 = g;
                localObject4 = b;
                ((sn)localObject1).a((String)localObject4);
                break;
                localHandler = uk.a;
                ??? = new com/google/android/gms/b/si$2;
                ((si.2)???).<init>(this, (od)localObject5, (ih)localObject1, (sm)localObject4);
                localHandler.post((Runnable)???);
                continue;
                localRemoteException = localRemoteException;
                localObject5 = "Fail to check if adapter is initialized.";
                tp.c((String)localObject5, localRemoteException);
                n = 0;
                localObject2 = null;
                a(0);
                continue;
              }
              n = l;
              continue;
            }
            boolean bool2 = a(l1);
            if (!bool2)
            {
              localObject2 = new com/google/android/gms/b/sj$a;
              ((sj.a)localObject2).<init>();
              int i1 = l;
              c = i1;
              localObject7 = w.k();
              l2 = ((c)localObject7).b();
              l1 = l2 - l1;
              d = l1;
              localObject5 = b;
              a = ((String)localObject5);
              localObject5 = d;
              localObject5 = d;
              b = ((String)localObject5);
              localObject2 = ((sj.a)localObject2).a();
              m = ((sj)localObject2);
            }
          }
        }
        label472:
        sn localsn = g;
        int i2 = l;
        localsn.a(i2);
      }
    }
  }
  
  public final void a(int paramInt)
  {
    Object localObject1 = h;
    int k = 2;
    try
    {
      j = k;
      l = paramInt;
      Object localObject2 = h;
      localObject2.notify();
      return;
    }
    finally {}
  }
  
  final void a(ih paramih, od paramod)
  {
    f.b.b = this;
    String str = "com.google.ads.mediation.admob.AdMobAdapter";
    for (;;)
    {
      try
      {
        localObject2 = b;
        bool = str.equals(localObject2);
        if (bool)
        {
          str = c;
          localObject2 = d;
          localObject2 = a;
          paramod.a(paramih, str, (String)localObject2);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = "Fail to load ad from adapter.";
        tp.c((String)localObject2, localRemoteException);
        boolean bool = false;
        Object localObject1 = null;
        a(0);
        continue;
      }
      str = c;
      paramod.a(paramih, str);
    }
  }
  
  public final void a(String paramString)
  {
    Object localObject1 = h;
    int k = 1;
    try
    {
      j = k;
      Object localObject2 = h;
      localObject2.notify();
      return;
    }
    finally {}
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
    ih localih = e.a.c;
    od localod = f.a;
    a(localih, localod);
  }
  
  public final void f()
  {
    a(0);
  }
}


/* Location:              com/google/android/gms/b/si.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */