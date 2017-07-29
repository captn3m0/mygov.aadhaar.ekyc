package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.a.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class x$a
  implements ServiceConnection
{
  final Set a;
  int b;
  boolean c;
  IBinder d;
  final w.a e;
  ComponentName f;
  
  public x$a(x paramx, w.a parama)
  {
    e = parama;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    a = localHashSet;
    b = 2;
  }
  
  public final void a()
  {
    b = 3;
    x.d(g);
    Object localObject1 = x.c(g);
    Object localObject2 = e.a();
    int i = 129;
    boolean bool = a.a((Context)localObject1, (Intent)localObject2, this, i);
    c = bool;
    bool = c;
    if (bool)
    {
      localObject1 = x.b(g);
      int k = 1;
      Object localObject3 = e;
      localObject1 = ((Handler)localObject1).obtainMessage(k, localObject3);
      localObject2 = x.b(g);
      localObject3 = g;
      long l = x.e((x)localObject3);
      ((Handler)localObject2).sendMessageDelayed((Message)localObject1, l);
    }
    for (;;)
    {
      return;
      int j = 2;
      b = j;
      try
      {
        localObject1 = g;
        x.d((x)localObject1);
        localObject1 = g;
        localObject1 = x.c((x)localObject1);
        a.a((Context)localObject1, this);
      }
      catch (IllegalArgumentException localIllegalArgumentException) {}
    }
  }
  
  public final void a(ServiceConnection paramServiceConnection)
  {
    x.d(g);
    x.c(g);
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
    Object localObject1 = g;
    synchronized (x.a((x)localObject1))
    {
      localObject1 = g;
      localObject1 = x.b((x)localObject1);
      int i = 1;
      w.a locala = e;
      ((Handler)localObject1).removeMessages(i, locala);
      d = paramIBinder;
      f = paramComponentName;
      localObject1 = a;
      Iterator localIterator = ((Set)localObject1).iterator();
      j = localIterator.hasNext();
      if (j != 0)
      {
        localObject1 = localIterator.next();
        localObject1 = (ServiceConnection)localObject1;
        ((ServiceConnection)localObject1).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    int j = 1;
    b = j;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    Object localObject1 = g;
    synchronized (x.a((x)localObject1))
    {
      localObject1 = g;
      localObject1 = x.b((x)localObject1);
      int i = 1;
      w.a locala = e;
      ((Handler)localObject1).removeMessages(i, locala);
      boolean bool = false;
      localObject1 = null;
      d = null;
      f = paramComponentName;
      localObject1 = a;
      Iterator localIterator = ((Set)localObject1).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (ServiceConnection)localObject1;
        ((ServiceConnection)localObject1).onServiceDisconnected(paramComponentName);
      }
    }
    int j = 2;
    b = j;
  }
}


/* Location:              com/google/android/gms/common/internal/x$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */