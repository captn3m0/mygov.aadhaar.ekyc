package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class x
  extends w
  implements Handler.Callback
{
  private final HashMap<w.a, a> a = new HashMap();
  private final Context b;
  private final Handler c;
  private final a d;
  private final long e;
  private final long f;
  
  x(Context paramContext)
  {
    b = paramContext.getApplicationContext();
    c = new Handler(paramContext.getMainLooper(), this);
    d = a.a();
    e = 5000L;
    f = 300000L;
  }
  
  protected final boolean a(w.a parama, ServiceConnection paramServiceConnection)
  {
    c.a(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      a locala;
      synchronized (a)
      {
        locala = (a)a.get(parama);
        if (locala == null)
        {
          locala = new a(parama);
          locala.a(paramServiceConnection);
          locala.a();
          a.put(parama, locala);
          parama = locala;
          boolean bool = c;
          return bool;
        }
        c.removeMessages(0, parama);
        if (locala.b(paramServiceConnection))
        {
          parama = String.valueOf(parama);
          throw new IllegalStateException(String.valueOf(parama).length() + 81 + "Trying to bind a GmsServiceConnection that was already connected before.  config=" + parama);
        }
      }
      locala.a(paramServiceConnection);
      switch (b)
      {
      case 1: 
        paramServiceConnection.onServiceConnected(f, d);
        parama = locala;
        break;
      case 2: 
        locala.a();
        parama = locala;
        break;
      default: 
        parama = locala;
      }
    }
  }
  
  protected final void b(w.a parama, ServiceConnection paramServiceConnection)
  {
    c.a(paramServiceConnection, "ServiceConnection must not be null");
    a locala;
    synchronized (a)
    {
      locala = (a)a.get(parama);
      if (locala == null)
      {
        parama = String.valueOf(parama);
        throw new IllegalStateException(String.valueOf(parama).length() + 50 + "Nonexistent connection status for service config: " + parama);
      }
    }
    if (!locala.b(paramServiceConnection))
    {
      parama = String.valueOf(parama);
      throw new IllegalStateException(String.valueOf(parama).length() + 76 + "Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + parama);
    }
    a.c();
    a.remove(paramServiceConnection);
    if (locala.b())
    {
      parama = c.obtainMessage(0, parama);
      c.sendMessageDelayed(parama, e);
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (what)
    {
    default: 
      return false;
    case 0: 
      synchronized (a)
      {
        paramMessage = (w.a)obj;
        ??? = (a)a.get(paramMessage);
        if ((??? != null) && (((a)???).b()))
        {
          if (c)
          {
            g.c.removeMessages(1, e);
            a.a(g.b, (ServiceConnection)???);
            c = false;
            b = 2;
          }
          a.remove(paramMessage);
        }
        return true;
      }
    }
    for (;;)
    {
      synchronized (a)
      {
        w.a locala1 = (w.a)obj;
        a locala = (a)a.get(locala1);
        if ((locala != null) && (b == 3))
        {
          paramMessage = String.valueOf(locala1);
          Log.wtf("GmsClientSupervisor", String.valueOf(paramMessage).length() + 47 + "Timeout waiting for ServiceConnection callback " + paramMessage, new Exception());
          ??? = f;
          paramMessage = (Message)???;
          if (??? == null) {
            paramMessage = b;
          }
          if (paramMessage == null)
          {
            paramMessage = new ComponentName(a, "unknown");
            locala.onServiceDisconnected(paramMessage);
          }
        }
        else
        {
          return true;
        }
      }
    }
  }
  
  private final class a
    implements ServiceConnection
  {
    final Set<ServiceConnection> a;
    int b;
    boolean c;
    IBinder d;
    final w.a e;
    ComponentName f;
    
    public a(w.a parama)
    {
      e = parama;
      a = new HashSet();
      b = 2;
    }
    
    public final void a()
    {
      b = 3;
      x.d(x.this);
      c = a.a(x.c(x.this), e.a(), this, 129);
      if (c)
      {
        Message localMessage = x.b(x.this).obtainMessage(1, e);
        x.b(x.this).sendMessageDelayed(localMessage, x.e(x.this));
        return;
      }
      b = 2;
      try
      {
        x.d(x.this);
        a.a(x.c(x.this), this);
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException) {}
    }
    
    public final void a(ServiceConnection paramServiceConnection)
    {
      x.d(x.this);
      x.c(x.this);
      e.a();
      a.b();
      a.add(paramServiceConnection);
    }
    
    public final boolean b()
    {
      return a.isEmpty();
    }
    
    public final boolean b(ServiceConnection paramServiceConnection)
    {
      return a.contains(paramServiceConnection);
    }
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      synchronized (x.a(x.this))
      {
        x.b(x.this).removeMessages(1, e);
        d = paramIBinder;
        f = paramComponentName;
        Iterator localIterator = a.iterator();
        if (localIterator.hasNext()) {
          ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
        }
      }
      b = 1;
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      synchronized (x.a(x.this))
      {
        x.b(x.this).removeMessages(1, e);
        d = null;
        f = paramComponentName;
        Iterator localIterator = a.iterator();
        if (localIterator.hasNext()) {
          ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
        }
      }
      b = 2;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */