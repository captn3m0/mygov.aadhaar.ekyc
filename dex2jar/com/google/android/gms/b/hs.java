package com.google.android.gms.b;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

@qi
public final class hs
{
  public final Runnable a = new Runnable()
  {
    public final void run()
    {
      hs.a(hs.this);
    }
  };
  public final Object b = new Object();
  hv c;
  hz d;
  private Context e;
  
  public final ht a(hw paramhw)
  {
    synchronized (b)
    {
      if (d == null)
      {
        paramhw = new ht();
        return paramhw;
      }
    }
    return paramhw;
  }
  
  public final void a()
  {
    synchronized (b)
    {
      if ((e == null) || (c != null)) {
        return;
      }
      o.b local3 = new o.b()
      {
        public final void a()
        {
          synchronized (b)
          {
            try
            {
              d = c.n();
              b.notifyAll();
              return;
            }
            catch (DeadObjectException localDeadObjectException)
            {
              for (;;)
              {
                tp.b("Unable to obtain a cache service instance.", localDeadObjectException);
                hs.a(hs.this);
              }
            }
          }
        }
        
        public final void a(int paramAnonymousInt)
        {
          synchronized (b)
          {
            d = null;
            b.notifyAll();
            return;
          }
        }
      };
      o.c local4 = new o.c()
      {
        public final void a(a arg1)
        {
          synchronized (b)
          {
            d = null;
            if (c != null)
            {
              c = null;
              w.u().b();
            }
            b.notifyAll();
            return;
          }
        }
      };
      c = new hv(e, w.u().a(), local3, local4);
      c.f_();
      return;
    }
  }
  
  public final void a(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    synchronized (b)
    {
      if (e != null) {
        return;
      }
    }
    e = paramContext.getApplicationContext();
    paramContext = ke.cZ;
    if (((Boolean)w.q().a(paramContext)).booleanValue()) {
      a();
    }
    for (;;)
    {
      return;
      paramContext = ke.cY;
      if (((Boolean)w.q().a(paramContext)).booleanValue())
      {
        paramContext = new hh.b()
        {
          public final void a(boolean paramAnonymousBoolean)
          {
            if (paramAnonymousBoolean)
            {
              a();
              return;
            }
            hs.a(hs.this);
          }
        };
        w.h().a(paramContext);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/hs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */