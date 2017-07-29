package com.google.android.gms.b;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.d.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.l;
import java.util.ArrayList;
import java.util.Map;

public abstract class wl
{
  public final int a;
  
  public wl(int paramInt)
  {
    a = paramInt;
  }
  
  public abstract void a(n paramn, boolean paramBoolean);
  
  public abstract void a(x.a<?> parama);
  
  public abstract void a(Status paramStatus);
  
  private static abstract class a
    extends wl
  {
    protected final com.google.android.gms.c.c<Void> b;
    
    public a(com.google.android.gms.c.c<Void> paramc)
    {
      super();
      b = paramc;
    }
    
    public void a(n paramn, boolean paramBoolean) {}
    
    public final void a(x.a<?> parama)
    {
      try
      {
        b(parama);
        return;
      }
      catch (DeadObjectException parama)
      {
        a(wl.a(parama));
        throw parama;
      }
      catch (RemoteException parama)
      {
        a(wl.a(parama));
      }
    }
    
    public void a(Status paramStatus)
    {
      b.a(new l(paramStatus));
    }
    
    protected abstract void b(x.a<?> parama);
  }
  
  public static final class b<A extends f.a<? extends g, a.c>>
    extends wl
  {
    protected final A b;
    
    public b(int paramInt, A paramA)
    {
      super();
      b = paramA;
    }
    
    public final void a(n arg1, boolean paramBoolean)
    {
      f.a locala = b;
      a.put(locala, Boolean.valueOf(paramBoolean));
      n.1 local1 = new n.1(???, locala);
      com.google.android.gms.common.internal.c.b(true, "Callback cannot be null.");
      synchronized (d)
      {
        if (locala.a())
        {
          local1.a();
          return;
        }
        g.add(local1);
      }
    }
    
    public final void a(x.a<?> parama)
    {
      b.a(a);
    }
    
    public final void a(Status paramStatus)
    {
      b.a(paramStatus);
    }
  }
  
  public static final class c
    extends wl.a
  {
    public final ah.a<?> c;
    
    public c(ah.a<?> parama, com.google.android.gms.c.c<Void> paramc)
    {
      super();
      c = parama;
    }
    
    public final void b(x.a<?> parama)
    {
      parama = (al)d.remove(c);
      if (parama != null)
      {
        a.a.a = null;
        return;
      }
      Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", new Exception());
      b.a(new l(Status.c));
    }
  }
}


/* Location:              com/google/android/gms/b/wl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */