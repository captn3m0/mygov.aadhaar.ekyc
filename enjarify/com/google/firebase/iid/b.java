package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.c.e;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class b
  extends Service
{
  private Binder a;
  private final Object b;
  final ExecutorService c;
  private int d;
  private int e;
  
  public b()
  {
    Object localObject = Executors.newSingleThreadExecutor();
    c = ((ExecutorService)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    e = 0;
  }
  
  private void d(Intent paramIntent)
  {
    if (paramIntent != null) {
      e.a(paramIntent);
    }
    synchronized (b)
    {
      int i = e + -1;
      e = i;
      i = e;
      if (i == 0)
      {
        i = d;
        stopSelfResult(i);
      }
      return;
    }
  }
  
  public boolean a(Intent paramIntent)
  {
    return false;
  }
  
  public abstract void b(Intent paramIntent);
  
  public Intent c(Intent paramIntent)
  {
    return paramIntent;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    Object localObject1 = "EnhancedIntentService";
    int i = 3;
    try
    {
      boolean bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = "EnhancedIntentService";
        String str = "Service received bind request";
        Log.d((String)localObject1, str);
      }
      localObject1 = a;
      if (localObject1 == null)
      {
        localObject1 = new com/google/firebase/iid/b$b;
        ((b.b)localObject1).<init>(this);
        a = ((Binder)localObject1);
      }
      localObject1 = a;
      return (IBinder)localObject1;
    }
    finally {}
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    int i = 2;
    for (;;)
    {
      synchronized (b)
      {
        d = paramInt2;
        int j = e + 1;
        e = j;
        ??? = c(paramIntent);
        if (??? == null)
        {
          d(paramIntent);
          return i;
        }
      }
      boolean bool = a((Intent)???);
      if (bool)
      {
        d(paramIntent);
      }
      else
      {
        ExecutorService localExecutorService = c;
        b.1 local1 = new com/google/firebase/iid/b$1;
        local1.<init>(this, (Intent)???, paramIntent);
        localExecutorService.execute(local1);
        i = 3;
      }
    }
  }
}


/* Location:              com/google/firebase/iid/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */