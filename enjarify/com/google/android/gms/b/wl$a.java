package com.google.android.gms.b;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.c.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;

abstract class wl$a
  extends wl
{
  protected final c b;
  
  public wl$a(c paramc)
  {
    super(4);
    b = paramc;
  }
  
  public void a(n paramn, boolean paramBoolean) {}
  
  public final void a(x.a parama)
  {
    try
    {
      b(parama);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      Status localStatus2 = wl.a(localDeadObjectException);
      a(localStatus2);
      throw localDeadObjectException;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Status localStatus1 = wl.a(localRemoteException);
        a(localStatus1);
      }
    }
  }
  
  public void a(Status paramStatus)
  {
    c localc = b;
    l locall = new com/google/android/gms/common/api/l;
    locall.<init>(paramStatus);
    localc.a(locall);
  }
  
  protected abstract void b(x.a parama);
}


/* Location:              com/google/android/gms/b/wl$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */