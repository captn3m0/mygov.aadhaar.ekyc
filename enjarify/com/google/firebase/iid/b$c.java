package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.a.a;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class b$c
  implements ServiceConnection
{
  private final Context a;
  private final Intent b;
  private final ScheduledExecutorService c;
  private final Queue d;
  private b.b e;
  private boolean f;
  
  public b$c(Context paramContext, String paramString)
  {
    this(paramContext, paramString, localScheduledThreadPoolExecutor);
  }
  
  private b$c(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService)
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    d = ((Queue)localObject);
    f = false;
    localObject = paramContext.getApplicationContext();
    a = ((Context)localObject);
    localObject = new android/content/Intent;
    ((Intent)localObject).<init>(paramString);
    String str = a.getPackageName();
    localObject = ((Intent)localObject).setPackage(str);
    b = ((Intent)localObject);
    c = paramScheduledExecutorService;
  }
  
  private void a()
  {
    int i = 1;
    Object localObject1 = "EnhancedIntentService";
    int j = 3;
    Object localObject5;
    for (;;)
    {
      try
      {
        bool1 = Log.isLoggable((String)localObject1, j);
        if (bool1)
        {
          localObject1 = "EnhancedIntentService";
          localObject3 = "flush queue called";
          Log.d((String)localObject1, (String)localObject3);
        }
        localObject1 = d;
        bool1 = ((Queue)localObject1).isEmpty();
        if (bool1) {
          break label483;
        }
        localObject1 = "EnhancedIntentService";
        j = 3;
        bool1 = Log.isLoggable((String)localObject1, j);
        if (bool1)
        {
          localObject1 = "EnhancedIntentService";
          localObject3 = "found intent to be delivered";
          Log.d((String)localObject1, (String)localObject3);
        }
        localObject1 = e;
        if (localObject1 == null) {
          break;
        }
        localObject1 = e;
        bool1 = ((b.b)localObject1).isBinderAlive();
        if (!bool1) {
          break;
        }
        localObject1 = "EnhancedIntentService";
        j = 3;
        bool1 = Log.isLoggable((String)localObject1, j);
        if (bool1)
        {
          localObject1 = "EnhancedIntentService";
          localObject3 = "binder is alive, sending the intent.";
          Log.d((String)localObject1, (String)localObject3);
        }
        localObject1 = d;
        localObject1 = ((Queue)localObject1).poll();
        localObject1 = (b.a)localObject1;
        localObject3 = e;
        int k = Binder.getCallingUid();
        m = Process.myUid();
        if (k != m)
        {
          localObject1 = new java/lang/SecurityException;
          localObject4 = "Binding only allowed within app";
          ((SecurityException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
      }
      finally {}
      localObject5 = "EnhancedIntentService";
      int m = 3;
      boolean bool2 = Log.isLoggable((String)localObject5, m);
      if (bool2)
      {
        localObject5 = "EnhancedIntentService";
        localObject6 = "service received new intent via bind strategy";
        Log.d((String)localObject5, (String)localObject6);
      }
      localObject5 = a;
      Object localObject6 = a;
      bool2 = ((b)localObject5).a((Intent)localObject6);
      if (bool2)
      {
        locala.a();
      }
      else
      {
        localObject5 = "EnhancedIntentService";
        m = 3;
        bool2 = Log.isLoggable((String)localObject5, m);
        if (bool2)
        {
          localObject5 = "EnhancedIntentService";
          localObject6 = "intent being queued for bg execution";
          Log.d((String)localObject5, (String)localObject6);
        }
        localObject5 = a;
        localObject5 = c;
        localObject6 = new com/google/firebase/iid/b$b$1;
        ((b.b.1)localObject6).<init>((b.b)localObject3, locala);
        ((ExecutorService)localObject5).execute((Runnable)localObject6);
      }
    }
    Object localObject2 = "EnhancedIntentService";
    j = 3;
    boolean bool1 = Log.isLoggable((String)localObject2, j);
    if (bool1)
    {
      localObject3 = "EnhancedIntentService";
      bool1 = f;
      if (!bool1)
      {
        bool1 = i;
        i = 39;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>(i);
        localObject4 = "binder is dead. start connection? ";
        localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
        localObject2 = ((StringBuilder)localObject4).append(bool1);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.d((String)localObject3, (String)localObject2);
      }
    }
    else
    {
      bool1 = f;
      if (!bool1)
      {
        bool1 = true;
        f = bool1;
      }
    }
    for (;;)
    {
      try
      {
        a.a();
        localObject2 = a;
        localObject4 = b;
        j = 65;
        bool1 = a.b((Context)localObject2, (Intent)localObject4, this, j);
        if (bool1)
        {
          label483:
          return;
          bool1 = false;
          localObject2 = null;
          break;
        }
        localObject2 = "EnhancedIntentService";
        localObject4 = "binding to the service failed";
        Log.e((String)localObject2, (String)localObject4);
      }
      catch (SecurityException localSecurityException)
      {
        localObject4 = "EnhancedIntentService";
        localObject3 = "Exception while binding the service";
        Log.e((String)localObject4, (String)localObject3, localSecurityException);
        continue;
      }
      localObject2 = d;
      bool1 = ((Queue)localObject2).isEmpty();
      if (!bool1)
      {
        localObject2 = d;
        localObject2 = ((Queue)localObject2).poll();
        localObject2 = (b.a)localObject2;
        ((b.a)localObject2).a();
      }
    }
  }
  
  public final void a(Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
  {
    Object localObject1 = "EnhancedIntentService";
    int i = 3;
    try
    {
      boolean bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = "EnhancedIntentService";
        localObject3 = "new intent queued in the bind-strategy delivery";
        Log.d((String)localObject1, (String)localObject3);
      }
      localObject1 = d;
      Object localObject3 = new com/google/firebase/iid/b$a;
      ScheduledExecutorService localScheduledExecutorService = c;
      ((b.a)localObject3).<init>(paramIntent, paramPendingResult, localScheduledExecutorService);
      ((Queue)localObject1).add(localObject3);
      a();
      return;
    }
    finally {}
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    boolean bool = false;
    String str = null;
    try
    {
      f = false;
      paramIBinder = (b.b)paramIBinder;
      e = paramIBinder;
      str = "EnhancedIntentService";
      int i = 3;
      bool = Log.isLoggable(str, i);
      if (bool)
      {
        str = "EnhancedIntentService";
        Object localObject2 = String.valueOf(paramComponentName);
        Object localObject3 = String.valueOf(localObject2);
        int j = ((String)localObject3).length() + 20;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(j);
        localObject3 = "onServiceConnected: ";
        localObject3 = localStringBuilder.append((String)localObject3);
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.d(str, (String)localObject2);
      }
      a();
      return;
    }
    finally {}
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    String str1 = "EnhancedIntentService";
    int i = 3;
    boolean bool = Log.isLoggable(str1, i);
    if (bool)
    {
      str1 = "EnhancedIntentService";
      String str2 = String.valueOf(paramComponentName);
      int j = String.valueOf(str2).length() + 23;
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>(j);
      StringBuilder localStringBuilder2 = localStringBuilder1.append("onServiceDisconnected: ");
      str2 = str2;
      Log.d(str1, str2);
    }
    a();
  }
}


/* Location:              com/google/firebase/iid/b$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */