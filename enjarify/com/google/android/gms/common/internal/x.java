package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a.a;
import java.util.HashMap;
import java.util.Set;

final class x
  extends w
  implements Handler.Callback
{
  private final HashMap a;
  private final Context b;
  private final Handler c;
  private final a d;
  private final long e;
  private final long f;
  
  x(Context paramContext)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = ((HashMap)localObject);
    localObject = paramContext.getApplicationContext();
    b = ((Context)localObject);
    localObject = new android/os/Handler;
    Looper localLooper = paramContext.getMainLooper();
    ((Handler)localObject).<init>(localLooper, this);
    c = ((Handler)localObject);
    localObject = a.a();
    d = ((a)localObject);
    e = 5000L;
    f = 300000L;
  }
  
  protected final boolean a(w.a parama, ServiceConnection paramServiceConnection)
  {
    Object localObject1 = "ServiceConnection must not be null";
    c.a(paramServiceConnection, localObject1);
    for (;;)
    {
      Object localObject3;
      Object localObject4;
      synchronized (a)
      {
        localObject1 = a;
        localObject1 = ((HashMap)localObject1).get(parama);
        localObject1 = (x.a)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/common/internal/x$a;
          ((x.a)localObject1).<init>(this, parama);
          ((x.a)localObject1).a(paramServiceConnection);
          ((x.a)localObject1).a();
          localObject3 = a;
          ((HashMap)localObject3).put(parama, localObject1);
          boolean bool1 = c;
          return bool1;
        }
        localObject3 = c;
        int i = 0;
        localObject4 = null;
        ((Handler)localObject3).removeMessages(0, parama);
        boolean bool2 = ((x.a)localObject1).b(paramServiceConnection);
        if (bool2)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject3 = String.valueOf(parama);
          localObject4 = String.valueOf(localObject3);
          i = ((String)localObject4).length() + 81;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(i);
          localObject4 = "Trying to bind a GmsServiceConnection that was already connected before.  config=";
          localObject4 = localStringBuilder.append((String)localObject4);
          localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((IllegalStateException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      ((x.a)localObject2).a(paramServiceConnection);
      int j = b;
      switch (j)
      {
      default: 
        break;
      case 1: 
        localObject3 = f;
        localObject4 = d;
        paramServiceConnection.onServiceConnected((ComponentName)localObject3, (IBinder)localObject4);
        break;
      case 2: 
        ((x.a)localObject2).a();
      }
    }
  }
  
  protected final void b(w.a parama, ServiceConnection paramServiceConnection)
  {
    Object localObject1 = "ServiceConnection must not be null";
    c.a(paramServiceConnection, localObject1);
    Object localObject5;
    int i;
    StringBuilder localStringBuilder;
    synchronized (a)
    {
      localObject1 = a;
      localObject1 = ((HashMap)localObject1).get(parama);
      localObject1 = (x.a)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject4 = String.valueOf(parama);
        localObject5 = String.valueOf(localObject4);
        i = ((String)localObject5).length() + 50;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i);
        localObject5 = "Nonexistent connection status for service config: ";
        localObject5 = localStringBuilder.append((String)localObject5);
        localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((IllegalStateException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    boolean bool1 = ((x.a)localObject2).b(paramServiceConnection);
    Object localObject3;
    if (!bool1)
    {
      localObject3 = new java/lang/IllegalStateException;
      localObject4 = String.valueOf(parama);
      localObject5 = String.valueOf(localObject4);
      i = ((String)localObject5).length() + 76;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      localObject5 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config=";
      localObject5 = localStringBuilder.append((String)localObject5);
      localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
      localObject4 = ((StringBuilder)localObject4).toString();
      ((IllegalStateException)localObject3).<init>((String)localObject4);
      throw ((Throwable)localObject3);
    }
    a.c();
    Object localObject4 = a;
    ((Set)localObject4).remove(paramServiceConnection);
    boolean bool2 = ((x.a)localObject3).b();
    if (bool2)
    {
      localObject3 = c;
      bool1 = false;
      localObject4 = null;
      localObject3 = ((Handler)localObject3).obtainMessage(0, parama);
      localObject4 = c;
      long l = e;
      ((Handler)localObject4).sendMessageDelayed((Message)localObject3, l);
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    int i = what;
    Object localObject7;
    int k;
    Object localObject9;
    switch (i)
    {
    default: 
    case 0: 
      for (;;)
      {
        return bool1;
        synchronized (a)
        {
          localObject1 = obj;
          localObject1 = (w.a)localObject1;
          localObject7 = a;
          localObject7 = ((HashMap)localObject7).get(localObject1);
          localObject7 = (x.a)localObject7;
          if (localObject7 != null)
          {
            boolean bool3 = ((x.a)localObject7).b();
            if (bool3)
            {
              bool3 = c;
              if (bool3)
              {
                ??? = g;
                ??? = c;
                k = 1;
                localObject9 = e;
                ((Handler)???).removeMessages(k, localObject9);
                ??? = g;
                ??? = b;
                a.a((Context)???, (ServiceConnection)localObject7);
                bool3 = false;
                ??? = null;
                c = false;
                int j = 2;
                b = j;
              }
              localObject7 = a;
              ((HashMap)localObject7).remove(localObject1);
            }
          }
          bool1 = bool2;
        }
      }
    }
    for (;;)
    {
      synchronized (a)
      {
        Object localObject3 = obj;
        localObject3 = (w.a)localObject3;
        localObject7 = a;
        localObject7 = ((HashMap)localObject7).get(localObject3);
        localObject7 = (x.a)localObject7;
        if (localObject7 != null)
        {
          int m = b;
          k = 3;
          if (m == k)
          {
            ??? = "GmsClientSupervisor";
            Object localObject10 = String.valueOf(localObject3);
            localObject9 = String.valueOf(localObject10);
            int n = ((String)localObject9).length() + 47;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(n);
            localObject9 = "Timeout waiting for ServiceConnection callback ";
            localObject9 = localStringBuilder.append((String)localObject9);
            localObject10 = ((StringBuilder)localObject9).append((String)localObject10);
            localObject10 = ((StringBuilder)localObject10).toString();
            localObject9 = new java/lang/Exception;
            ((Exception)localObject9).<init>();
            Log.wtf((String)???, (String)localObject10, (Throwable)localObject9);
            ??? = f;
            if (??? == null) {
              ??? = b;
            }
            if (??? != null) {
              break label430;
            }
            ??? = new android/content/ComponentName;
            localObject3 = a;
            localObject10 = "unknown";
            ((ComponentName)???).<init>((String)localObject3, (String)localObject10);
            localObject3 = ???;
            ((x.a)localObject7).onServiceDisconnected((ComponentName)localObject3);
          }
        }
        bool1 = bool2;
      }
      label430:
      Object localObject5 = ???;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */