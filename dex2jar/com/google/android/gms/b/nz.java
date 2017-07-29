package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@qi
public final class nz
  implements nq
{
  private final qo a;
  private final oc b;
  private final Context c;
  private final Object d = new Object();
  private final ns e;
  private final boolean f;
  private final long g;
  private final long h;
  private final km i;
  private final boolean j;
  private boolean k = false;
  private nv l;
  private List<nw> m = new ArrayList();
  
  public nz(Context paramContext, qo paramqo, oc paramoc, ns paramns, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, km paramkm)
  {
    c = paramContext;
    a = paramqo;
    b = paramoc;
    e = paramns;
    f = paramBoolean1;
    j = paramBoolean2;
    g = paramLong1;
    h = paramLong2;
    i = paramkm;
  }
  
  public final nw a(List<nr> arg1)
  {
    tp.b("Starting mediation.");
    Object localObject = new ArrayList();
    kk localkk1 = i.a();
    Iterator localIterator1 = ???.iterator();
    label402:
    while (localIterator1.hasNext())
    {
      nr localnr = (nr)localIterator1.next();
      ??? = String.valueOf(b);
      Iterator localIterator2;
      if (???.length() != 0)
      {
        ??? = "Trying mediation network: ".concat(???);
        tp.d(???);
        localIterator2 = c.iterator();
      }
      for (;;)
      {
        if (!localIterator2.hasNext()) {
          break label402;
        }
        String str = (String)localIterator2.next();
        kk localkk2 = i.a();
        synchronized (d)
        {
          if (k)
          {
            localObject = new nw(-1);
            return (nw)localObject;
            ??? = new String("Trying mediation network: ");
            break;
          }
          l = new nv(c, str, b, e, localnr, a.c, a.d, a.k, f, j, a.y, a.n);
          ??? = l.a(g, h);
          m.add(???);
          if (a == 0)
          {
            tp.b("Adapter succeeded.");
            i.a("mediation_network_succeed", str);
            if (!((List)localObject).isEmpty()) {
              i.a("mediation_networks_fail", TextUtils.join(",", (Iterable)localObject));
            }
            i.a(localkk2, new String[] { "mls" });
            i.a(localkk1, new String[] { "ttm" });
            return (nw)???;
          }
        }
        localIterable.add(str);
        i.a(localkk2, new String[] { "mlf" });
        if (c != null) {
          tt.a.post(new Runnable()
          {
            public final void run()
            {
              try
              {
                c.c();
                return;
              }
              catch (RemoteException localRemoteException)
              {
                tp.c("Could not destroy mediation adapter.", localRemoteException);
              }
            }
          });
        }
      }
    }
    if (!localIterable.isEmpty()) {
      i.a("mediation_networks_fail", TextUtils.join(",", localIterable));
    }
    return new nw(1);
  }
  
  public final void a()
  {
    synchronized (d)
    {
      k = true;
      if (l != null) {
        l.a();
      }
      return;
    }
  }
  
  public final List<nw> b()
  {
    return m;
  }
}


/* Location:              com/google/android/gms/b/nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */