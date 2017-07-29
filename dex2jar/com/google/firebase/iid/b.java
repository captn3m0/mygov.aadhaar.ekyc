package com.google.firebase.iid;

import android.app.Service;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.support.v4.c.e;
import android.util.Log;
import com.google.android.gms.common.a.a;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class b
  extends Service
{
  private Binder a;
  private final Object b = new Object();
  final ExecutorService c = Executors.newSingleThreadExecutor();
  private int d;
  private int e = 0;
  
  private void d(Intent arg1)
  {
    if (??? != null) {
      e.a(???);
    }
    synchronized (b)
    {
      e -= 1;
      if (e == 0) {
        stopSelfResult(d);
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
    try
    {
      if (Log.isLoggable("EnhancedIntentService", 3)) {
        Log.d("EnhancedIntentService", "Service received bind request");
      }
      if (a == null) {
        a = new b(this);
      }
      paramIntent = a;
      return paramIntent;
    }
    finally {}
  }
  
  public final int onStartCommand(final Intent paramIntent, int paramInt1, int paramInt2)
  {
    synchronized (b)
    {
      d = paramInt2;
      e += 1;
      ??? = c(paramIntent);
      if (??? == null)
      {
        d(paramIntent);
        return 2;
      }
    }
    if (a((Intent)???))
    {
      d(paramIntent);
      return 2;
    }
    c.execute(new Runnable()
    {
      public final void run()
      {
        b(localObject);
        b.a(b.this, paramIntent);
      }
    });
    return 3;
  }
  
  static final class a
  {
    final Intent a;
    private final BroadcastReceiver.PendingResult b;
    private boolean c = false;
    private final ScheduledFuture<?> d;
    
    a(final Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult, ScheduledExecutorService paramScheduledExecutorService)
    {
      a = paramIntent;
      b = paramPendingResult;
      d = paramScheduledExecutorService.schedule(new Runnable()
      {
        public final void run()
        {
          String str = String.valueOf(paramIntent.getAction());
          Log.w("EnhancedIntentService", String.valueOf(str).length() + 61 + "Service took too long to process intent: " + str + " App may get closed.");
          a();
        }
      }, 9500L, TimeUnit.MILLISECONDS);
    }
    
    final void a()
    {
      try
      {
        if (!c)
        {
          b.finish();
          d.cancel(false);
          c = true;
        }
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
  
  public static final class b
    extends Binder
  {
    final b a;
    
    b(b paramb)
    {
      a = paramb;
    }
  }
  
  public static final class c
    implements ServiceConnection
  {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue<b.a> d = new LinkedList();
    private b.b e;
    private boolean f = false;
    
    public c(Context paramContext, String paramString)
    {
      this(paramContext, paramString, new ScheduledThreadPoolExecutor(0));
    }
    
    private c(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService)
    {
      a = paramContext.getApplicationContext();
      b = new Intent(paramString).setPackage(a.getPackageName());
      c = paramScheduledExecutorService;
    }
    
    private void a()
    {
      for (;;)
      {
        b.b localb;
        try
        {
          if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "flush queue called");
          }
          if (d.isEmpty()) {
            break label283;
          }
          if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "found intent to be delivered");
          }
          if ((e == null) || (!e.isBinderAlive())) {
            break;
          }
          if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
          }
          b.a locala1 = (b.a)d.poll();
          localb = e;
          if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
          }
        }
        finally {}
        if (Log.isLoggable("EnhancedIntentService", 3)) {
          Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (a.a(a))
        {
          locala2.a();
        }
        else
        {
          if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "intent being queued for bg execution");
          }
          a.c.execute(new b.b.1(localb, locala2));
        }
      }
      boolean bool;
      if (Log.isLoggable("EnhancedIntentService", 3))
      {
        if (!f)
        {
          bool = true;
          Log.d("EnhancedIntentService", 39 + "binder is dead. start connection? " + bool);
        }
      }
      else if (!f) {
        f = true;
      }
      for (;;)
      {
        try
        {
          a.a();
          bool = a.b(a, b, this, 65);
          if (bool)
          {
            label283:
            return;
            bool = false;
            break;
          }
          Log.e("EnhancedIntentService", "binding to the service failed");
        }
        catch (SecurityException localSecurityException)
        {
          Log.e("EnhancedIntentService", "Exception while binding the service", localSecurityException);
          continue;
        }
        if (!d.isEmpty()) {
          ((b.a)d.poll()).a();
        }
      }
    }
    
    public final void a(Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
    {
      try
      {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
          Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        d.add(new b.a(paramIntent, paramPendingResult, c));
        a();
        return;
      }
      finally {}
    }
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      try
      {
        f = false;
        e = ((b.b)paramIBinder);
        if (Log.isLoggable("EnhancedIntentService", 3))
        {
          paramComponentName = String.valueOf(paramComponentName);
          Log.d("EnhancedIntentService", String.valueOf(paramComponentName).length() + 20 + "onServiceConnected: " + paramComponentName);
        }
        a();
        return;
      }
      finally {}
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      if (Log.isLoggable("EnhancedIntentService", 3))
      {
        paramComponentName = String.valueOf(paramComponentName);
        Log.d("EnhancedIntentService", String.valueOf(paramComponentName).length() + 23 + "onServiceDisconnected: " + paramComponentName);
      }
      a();
    }
  }
}


/* Location:              com/google/firebase/iid/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */