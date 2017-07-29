package com.google.android.gms.b;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.g;

public abstract class f$a
  extends h
{
  final a.d a;
  final a b;
  
  protected f$a(a parama, com.google.android.gms.common.api.c paramc)
  {
    super((com.google.android.gms.common.api.c)localObject);
    localObject = parama.b();
    a = ((a.d)localObject);
    b = parama;
  }
  
  private void a(RemoteException paramRemoteException)
  {
    Status localStatus = new com/google/android/gms/common/api/Status;
    String str = paramRemoteException.getLocalizedMessage();
    localStatus.<init>(8, str, null);
    a(localStatus);
  }
  
  public final void a(Status paramStatus)
  {
    boolean bool = paramStatus.b();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.c.b(bool, "Failed result must not be success");
      g localg = c(paramStatus);
      a(localg);
      return;
      bool = false;
      localg = null;
    }
  }
  
  public final void a(a.c paramc)
  {
    try
    {
      b(paramc);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      a(localDeadObjectException);
      throw localDeadObjectException;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        a(localRemoteException);
      }
    }
  }
  
  protected abstract void b(a.c paramc);
}


/* Location:              com/google/android/gms/b/f$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */