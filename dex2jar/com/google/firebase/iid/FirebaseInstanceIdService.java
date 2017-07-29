package com.google.firebase.iid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.Queue;

public class FirebaseInstanceIdService
  extends b
{
  static final Object a = new Object();
  static boolean b = false;
  private boolean d = false;
  
  private d a(String paramString)
  {
    if (paramString == null) {
      return d.a(this, null);
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("subtype", paramString);
    return d.a(this, localBundle);
  }
  
  static void a(Context paramContext)
  {
    if (f.a(paramContext) == null) {
      return;
    }
    synchronized (a)
    {
      if (!b)
      {
        g.a().a(paramContext, b(0));
        b = true;
      }
      return;
    }
  }
  
  static void a(Context paramContext, FirebaseInstanceId paramFirebaseInstanceId)
  {
    synchronized (a)
    {
      if (b) {
        return;
      }
      paramFirebaseInstanceId = paramFirebaseInstanceId.c();
      if ((paramFirebaseInstanceId == null) || (paramFirebaseInstanceId.b(d.f)) || (FirebaseInstanceId.d().a() != null))
      {
        a(paramContext);
        return;
      }
    }
  }
  
  private void a(Intent arg1, String paramString)
  {
    int i = 28800;
    boolean bool = c(this);
    int j;
    if (??? == null) {
      j = 10;
    }
    for (;;)
    {
      if ((j < 10) && (!bool))
      {
        i = 30;
        label33:
        Log.d("FirebaseInstanceId", String.valueOf(paramString).length() + 47 + "background sync failed: " + paramString + ", retry in " + i + "s");
      }
      synchronized (a)
      {
        paramString = (AlarmManager)getSystemService("alarm");
        PendingIntent localPendingIntent = g.a(this, 0, "com.google.firebase.INSTANCE_ID_EVENT", b(i * 2), 134217728);
        paramString.set(3, SystemClock.elapsedRealtime() + i * 1000, localPendingIntent);
        b = true;
        if (!bool)
        {
          if (d) {
            Log.d("FirebaseInstanceId", "device not connected. Connectivity change received registered");
          }
          a.a(this, i);
        }
        return;
        j = ???.getIntExtra("next_retry_delay_in_seconds", 0);
        continue;
        if (j < 10)
        {
          i = 10;
          break label33;
        }
        if (j > 28800) {
          break label33;
        }
        i = j;
      }
    }
  }
  
  private void a(Intent paramIntent, boolean paramBoolean)
  {
    int j = 1;
    synchronized (a)
    {
      b = false;
      if (f.a(this) == null) {
        return;
      }
    }
    Object localObject4 = FirebaseInstanceId.a();
    Object localObject5 = ((FirebaseInstanceId)localObject4).c();
    if ((localObject5 == null) || (((h.a)localObject5).b(d.f))) {}
    for (;;)
    {
      Object localObject6;
      Object localObject7;
      Object localObject2;
      try
      {
        localObject6 = b;
        ??? = new Bundle();
        ((FirebaseInstanceId)localObject4).a((Bundle)???);
        localObject7 = a;
        if (Looper.getMainLooper() == Looper.myLooper()) {
          throw new IOException("MAIN_THREAD");
        }
      }
      catch (IOException localIOException1)
      {
        a(paramIntent, localIOException1.getMessage());
        return;
        if (localIOException1.getString("ttl") != null) {
          break label961;
        }
        if ("jwt".equals(localIOException1.getString("type")))
        {
          break label961;
          localObject3 = ((d)localObject7).a((String)localObject6, "*", localIOException1);
          localObject2 = localObject3;
          if (localObject3 != null)
          {
            localObject2 = localObject3;
            if (i != 0)
            {
              d.c.a(e, (String)localObject6, "*", (String)localObject3, d.f);
              localObject2 = localObject3;
            }
          }
          if (localObject2 == null) {
            break label322;
          }
          if (d) {
            Log.d("FirebaseInstanceId", "get master token succeeded");
          }
          a(this, (FirebaseInstanceId)localObject4);
          if ((!paramBoolean) && (localObject5 != null) && ((localObject5 == null) || (((String)localObject2).equals(a)))) {
            break;
          }
          a();
          return;
        }
      }
      catch (SecurityException paramIntent)
      {
        Log.e("FirebaseInstanceId", "Unable to get master token", paramIntent);
        return;
      }
      Object localObject3 = d.c.a(e, (String)localObject6, "*");
      int i = j;
      if (localObject3 != null)
      {
        i = j;
        if (!((h.a)localObject3).b(d.f))
        {
          localObject2 = a;
          continue;
          label322:
          a(paramIntent, "returned token is null");
          return;
          localObject4 = FirebaseInstanceId.d();
          localObject2 = ((e)localObject4).a();
          if (localObject2 != null)
          {
            localObject5 = ((String)localObject2).split("!");
            if (localObject5.length == 2)
            {
              localObject3 = localObject5[0];
              localObject5 = localObject5[1];
              j = -1;
            }
            for (;;)
            {
              try
              {
                int k = ((String)localObject3).hashCode();
                i = j;
                switch (k)
                {
                default: 
                  i = j;
                case 84: 
                  switch (i)
                  {
                  default: 
                    ((e)localObject4).a((String)localObject2);
                    localObject2 = ((e)localObject4).a();
                  }
                  break;
                case 83: 
                  i = j;
                  if (!((String)localObject3).equals("S")) {
                    continue;
                  }
                  i = 0;
                  break;
                case 85: 
                  i = j;
                  if (!((String)localObject3).equals("U")) {
                    continue;
                  }
                  i = 1;
                  continue;
                  localObject6 = FirebaseInstanceId.a();
                  localObject8 = ((FirebaseInstanceId)localObject6).c();
                  if ((localObject8 == null) || (((h.a)localObject8).b(d.f))) {
                    throw new IOException("token not available");
                  }
                  break;
                }
              }
              catch (IOException localIOException2)
              {
                a(paramIntent, localIOException2.getMessage());
                return;
              }
              localObject7 = new Bundle();
              localObject3 = String.valueOf("/topics/");
              String str = String.valueOf(localObject5);
              if (str.length() != 0)
              {
                localObject3 = ((String)localObject3).concat(str);
                label593:
                ((Bundle)localObject7).putString("gcm.topic", (String)localObject3);
                localObject8 = a;
                localObject3 = String.valueOf("/topics/");
                localObject5 = String.valueOf(localObject5);
                if (((String)localObject5).length() == 0) {
                  break label697;
                }
              }
              label697:
              for (localObject3 = ((String)localObject3).concat((String)localObject5);; localObject3 = new String((String)localObject3))
              {
                ((FirebaseInstanceId)localObject6).a((Bundle)localObject7);
                a.a((String)localObject8, (String)localObject3, (Bundle)localObject7);
                if (!d) {
                  break;
                }
                Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                break;
                localObject3 = new String((String)localObject3);
                break label593;
              }
              Object localObject8 = FirebaseInstanceId.a();
              localObject7 = ((FirebaseInstanceId)localObject8).c();
              if ((localObject7 == null) || (((h.a)localObject7).b(d.f))) {
                throw new IOException("token not available");
              }
              localObject6 = new Bundle();
              localObject3 = String.valueOf("/topics/");
              str = String.valueOf(localObject5);
              if (str.length() != 0)
              {
                localObject3 = ((String)localObject3).concat(str);
                ((Bundle)localObject6).putString("gcm.topic", (String)localObject3);
                localObject8 = a;
                localObject7 = a;
                localObject3 = String.valueOf("/topics/");
                localObject5 = String.valueOf(localObject5);
                if (((String)localObject5).length() == 0) {
                  break label880;
                }
              }
              label880:
              for (localObject3 = ((String)localObject3).concat((String)localObject5);; localObject3 = new String((String)localObject3))
              {
                if (Looper.getMainLooper() != Looper.myLooper()) {
                  break label894;
                }
                throw new IOException("MAIN_THREAD");
                localObject3 = new String((String)localObject3);
                break;
              }
              label894:
              d.c.b(e, (String)localObject7, (String)localObject3);
              ((Bundle)localObject6).putString("delete", "1");
              ((d)localObject8).a((String)localObject7, (String)localObject3, (Bundle)localObject6);
              if (d) {
                Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
              }
            }
          }
          Log.d("FirebaseInstanceId", "topic sync succeeded");
          return;
          label961:
          i = 0;
        }
      }
    }
  }
  
  private static Intent b(int paramInt)
  {
    Intent localIntent = new Intent("ACTION_TOKEN_REFRESH_RETRY");
    localIntent.putExtra("next_retry_delay_in_seconds", paramInt);
    return localIntent;
  }
  
  private static boolean c(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.isConnected());
  }
  
  private static String d(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("subtype");
    paramIntent = str;
    if (str == null) {
      paramIntent = "";
    }
    return paramIntent;
  }
  
  public void a() {}
  
  public final boolean a(Intent paramIntent)
  {
    d = Log.isLoggable("FirebaseInstanceId", 3);
    if ((paramIntent.getStringExtra("error") != null) || (paramIntent.getStringExtra("registration_id") != null))
    {
      String str2 = d(paramIntent);
      if (d)
      {
        str1 = String.valueOf(str2);
        if (str1.length() == 0) {
          break label84;
        }
      }
      label84:
      for (String str1 = "Register result in service ".concat(str1);; str1 = new String("Register result in service "))
      {
        Log.d("FirebaseInstanceId", str1);
        a(str2);
        d.d().b(paramIntent);
        return true;
      }
    }
    return false;
  }
  
  public final void b(Intent paramIntent)
  {
    Object localObject2 = paramIntent.getAction();
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "";
    }
    int i;
    label42:
    Object localObject3;
    switch (((String)localObject1).hashCode())
    {
    default: 
      i = -1;
      switch (i)
      {
      default: 
        localObject2 = d(paramIntent);
        localObject1 = a((String)localObject2);
        localObject3 = paramIntent.getStringExtra("CMD");
        if (d)
        {
          String str = String.valueOf(paramIntent.getExtras());
          Log.d("FirebaseInstanceId", String.valueOf(localObject2).length() + 18 + String.valueOf(localObject3).length() + String.valueOf(str).length() + "Service command " + (String)localObject2 + " " + (String)localObject3 + " " + str);
        }
        if (paramIntent.getStringExtra("unregistered") != null)
        {
          localObject3 = d.c();
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = "";
          }
          ((h)localObject3).c((String)localObject1);
          d.d().b(paramIntent);
        }
        break;
      }
      break;
    }
    label329:
    do
    {
      do
      {
        return;
        if (!((String)localObject1).equals("ACTION_TOKEN_REFRESH_RETRY")) {
          break;
        }
        i = 0;
        break label42;
        a(paramIntent, false);
        return;
        if ("gcm.googleapis.com/refresh".equals(paramIntent.getStringExtra("from")))
        {
          d.c().c((String)localObject2);
          a(paramIntent, true);
          return;
        }
        if ("RST".equals(localObject3))
        {
          ((d)localObject1).b();
          a(paramIntent, true);
          return;
        }
        if (!"RST_FULL".equals(localObject3)) {
          break label329;
        }
      } while (d.c().a());
      ((d)localObject1).b();
      d.c().b();
      a(paramIntent, true);
      return;
      if ("SYNC".equals(localObject3))
      {
        d.c().c((String)localObject2);
        a(paramIntent, true);
        return;
      }
    } while (!"PING".equals(localObject3));
    paramIntent = paramIntent.getExtras();
    localObject1 = f.a(this);
    if (localObject1 == null)
    {
      Log.w("FirebaseInstanceId", "Unable to respond to ping due to missing target package");
      return;
    }
    localObject2 = new Intent("com.google.android.gcm.intent.SEND");
    ((Intent)localObject2).setPackage((String)localObject1);
    ((Intent)localObject2).putExtras(paramIntent);
    f.a(this, (Intent)localObject2);
    ((Intent)localObject2).putExtra("google.to", "google.com/iid");
    ((Intent)localObject2).putExtra("google.message_id", f.a());
    sendOrderedBroadcast((Intent)localObject2, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
  }
  
  protected final Intent c(Intent paramIntent)
  {
    return (Intent)aa.poll();
  }
  
  private static class a
    extends BroadcastReceiver
  {
    static BroadcastReceiver a;
    final int b;
    
    private a(int paramInt)
    {
      b = paramInt;
    }
    
    /* Error */
    static void a(Context paramContext, int paramInt)
    {
      // Byte code:
      //   0: ldc 2
      //   2: monitorenter
      //   3: getstatic 21	com/google/firebase/iid/FirebaseInstanceIdService$a:a	Landroid/content/BroadcastReceiver;
      //   6: astore_2
      //   7: aload_2
      //   8: ifnull +7 -> 15
      //   11: ldc 2
      //   13: monitorexit
      //   14: return
      //   15: new 2	com/google/firebase/iid/FirebaseInstanceIdService$a
      //   18: dup
      //   19: iload_1
      //   20: invokespecial 23	com/google/firebase/iid/FirebaseInstanceIdService$a:<init>	(I)V
      //   23: putstatic 21	com/google/firebase/iid/FirebaseInstanceIdService$a:a	Landroid/content/BroadcastReceiver;
      //   26: aload_0
      //   27: invokevirtual 29	android/content/Context:getApplicationContext	()Landroid/content/Context;
      //   30: getstatic 21	com/google/firebase/iid/FirebaseInstanceIdService$a:a	Landroid/content/BroadcastReceiver;
      //   33: new 31	android/content/IntentFilter
      //   36: dup
      //   37: ldc 33
      //   39: invokespecial 36	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
      //   42: invokevirtual 40	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      //   45: pop
      //   46: goto -35 -> 11
      //   49: astore_0
      //   50: ldc 2
      //   52: monitorexit
      //   53: aload_0
      //   54: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	55	0	paramContext	Context
      //   0	55	1	paramInt	int
      //   6	2	2	localBroadcastReceiver	BroadcastReceiver
      // Exception table:
      //   from	to	target	type
      //   3	7	49	finally
      //   15	46	49	finally
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      try
      {
        if (a != this) {
          return;
        }
        if (!FirebaseInstanceIdService.b(paramContext)) {
          return;
        }
      }
      finally {}
      if (Log.isLoggable("FirebaseInstanceId", 3)) {
        Log.d("FirebaseInstanceId", "connectivity changed. starting background sync.");
      }
      paramContext.getApplicationContext().unregisterReceiver(this);
      a = null;
      g.a().a(paramContext, FirebaseInstanceIdService.a(b));
    }
  }
}


/* Location:              com/google/firebase/iid/FirebaseInstanceIdService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */