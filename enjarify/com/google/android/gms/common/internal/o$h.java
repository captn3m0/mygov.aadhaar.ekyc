package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

public final class o$h
  implements ServiceConnection
{
  private final int b;
  
  public o$h(o paramo, int paramInt)
  {
    b = paramInt;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    o localo;
    int i;
    int j;
    if (paramIBinder == null)
    {
      localo = a;
      i = 8;
      j = b;
      localo.a(i, j);
    }
    for (;;)
    {
      return;
      localo = a;
      synchronized (o.a(localo))
      {
        localo = a;
        ad localad = ad.a.a(paramIBinder);
        o.a(localo, localad);
        localo = a;
        i = 0;
        ??? = null;
        j = b;
        localo.a(0, j);
      }
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    Object localObject1 = a;
    synchronized (o.a((o)localObject1))
    {
      localObject1 = a;
      o.a((o)localObject1, null);
      localObject1 = a.e;
      ??? = a.e;
      int i = b;
      ??? = ((Handler)???).obtainMessage(4, i, 1);
      ((Handler)localObject1).sendMessage((Message)???);
      return;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/o$h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */