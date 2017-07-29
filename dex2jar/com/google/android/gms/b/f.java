package com.google.android.gms.b;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.g;

public final class f
{
  public static abstract class a<R extends g, A extends a.c>
    extends h<R>
  {
    final a.d<A> a;
    final a<?> b;
    
    protected a(a<?> parama, com.google.android.gms.common.api.c paramc)
    {
      super();
      a = parama.b();
      b = parama;
    }
    
    private void a(RemoteException paramRemoteException)
    {
      a(new Status(8, paramRemoteException.getLocalizedMessage(), null));
    }
    
    public final void a(Status paramStatus)
    {
      if (!paramStatus.b()) {}
      for (boolean bool = true;; bool = false)
      {
        com.google.android.gms.common.internal.c.b(bool, "Failed result must not be success");
        a(c(paramStatus));
        return;
      }
    }
    
    public final void a(A paramA)
    {
      try
      {
        b(paramA);
        return;
      }
      catch (DeadObjectException paramA)
      {
        a(paramA);
        throw paramA;
      }
      catch (RemoteException paramA)
      {
        a(paramA);
      }
    }
    
    protected abstract void b(A paramA);
  }
}


/* Location:              com/google/android/gms/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */