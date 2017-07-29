package com.google.firebase.iid;

import android.app.AlarmManager;
import android.app.PendingIntent;
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
  static final Object a;
  static boolean b = false;
  private boolean d = false;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  private d a(String paramString)
  {
    if (paramString == null) {}
    for (Object localObject = d.a(this, null);; localObject = d.a(this, (Bundle)localObject))
    {
      return (d)localObject;
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      String str = "subtype";
      ((Bundle)localObject).putString(str, paramString);
    }
  }
  
  static void a(Context paramContext)
  {
    Object localObject1 = f.a(paramContext);
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      synchronized (a)
      {
        boolean bool = b;
        if (!bool)
        {
          localObject1 = g.a();
          Intent localIntent = null;
          localIntent = b(0);
          ((g)localObject1).a(paramContext, localIntent);
          bool = true;
          b = bool;
        }
      }
    }
  }
  
  static void a(Context paramContext, FirebaseInstanceId paramFirebaseInstanceId)
  {
    synchronized (a)
    {
      boolean bool = b;
      if (bool) {}
      Object localObject2;
      do
      {
        return;
        localObject2 = paramFirebaseInstanceId.c();
        if (localObject2 == null) {
          break;
        }
        ??? = d.f;
        bool = ((h.a)localObject2).b((String)???);
        if (bool) {
          break;
        }
        localObject2 = FirebaseInstanceId.d().a();
      } while (localObject2 == null);
      a(paramContext);
    }
  }
  
  private void a(Intent paramIntent, String paramString)
  {
    int i = 28800;
    int j = 0;
    Object localObject1 = null;
    int k = 10;
    boolean bool = c(this);
    int n;
    if (paramIntent == null)
    {
      n = k;
      if ((n >= k) || (bool)) {
        break label283;
      }
      k = 30;
      i = k;
    }
    for (;;)
    {
      n = String.valueOf(paramString).length() + 47;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(n);
      localObject2 = ((StringBuilder)localObject1).append("background sync failed: ").append(paramString).append(", retry in ").append(i);
      localObject1 = "s";
      localObject2 = (String)localObject1;
      Log.d("FirebaseInstanceId", (String)localObject2);
      localObject2 = a;
      Object localObject3 = "alarm";
      int m;
      try
      {
        localObject3 = getSystemService((String)localObject3);
        localObject3 = (AlarmManager)localObject3;
        j = i * 2;
        localObject1 = b(j);
        int i1 = 0;
        String str = "com.google.firebase.INSTANCE_ID_EVENT";
        int i2 = 134217728;
        localObject1 = g.a(this, 0, str, (Intent)localObject1, i2);
        i1 = 3;
        long l1 = SystemClock.elapsedRealtime();
        int i3 = i * 1000;
        long l2 = i3;
        l1 += l2;
        ((AlarmManager)localObject3).set(i1, l1, (PendingIntent)localObject1);
        k = 1;
        b = k;
        if (!bool)
        {
          m = d;
          if (m != 0)
          {
            localObject3 = "FirebaseInstanceId";
            localObject2 = "device not connected. Connectivity change received registered";
            Log.d((String)localObject3, (String)localObject2);
          }
          FirebaseInstanceIdService.a.a(this, i);
        }
        return;
      }
      finally {}
      localObject2 = "next_retry_delay_in_seconds";
      n = paramIntent.getIntExtra((String)localObject2, 0);
      break;
      label283:
      if (n < m) {
        i = m;
      } else if (n <= i) {
        i = n;
      }
    }
  }
  
  private void a(Intent paramIntent, boolean paramBoolean)
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject2 = a;
    boolean bool1 = false;
    String str1 = null;
    for (;;)
    {
      try
      {
        b = false;
        str1 = f.a(this);
        if (str1 == null) {
          return;
        }
      }
      finally {}
      Object localObject6 = FirebaseInstanceId.a();
      Object localObject7 = ((FirebaseInstanceId)localObject6).c();
      Object localObject4;
      Object localObject9;
      Object localObject10;
      Object localObject11;
      if (localObject7 != null)
      {
        localObject4 = d.f;
        bool1 = ((h.a)localObject7).b((String)localObject4);
        if (!bool1) {}
      }
      else
      {
        for (;;)
        {
          boolean bool2;
          try
          {
            localObject8 = b;
            localObject9 = "*";
            localObject4 = new android/os/Bundle;
            ((Bundle)localObject4).<init>();
            ((FirebaseInstanceId)localObject6).a((Bundle)localObject4);
            localObject2 = a;
            localObject10 = Looper.getMainLooper();
            localObject11 = Looper.myLooper();
            if (localObject10 == localObject11)
            {
              localObject4 = new java/io/IOException;
              localObject2 = "MAIN_THREAD";
              ((IOException)localObject4).<init>((String)localObject2);
              throw ((Throwable)localObject4);
            }
          }
          catch (IOException localIOException1)
          {
            localObject4 = localIOException1.getMessage();
            a(paramIntent, (String)localObject4);
            break;
            localObject10 = "ttl";
            localObject10 = ((Bundle)localObject4).getString((String)localObject10);
            if (localObject10 == null)
            {
              localObject10 = "jwt";
              localObject11 = "type";
              localObject11 = ((Bundle)localObject4).getString((String)localObject11);
              bool2 = ((String)localObject10).equals(localObject11);
              if (!bool2) {
                break label379;
              }
            }
            i = 0;
            String str2 = null;
            localObject1 = ((d)localObject2).a((String)localObject8, (String)localObject9, (Bundle)localObject4);
            if ((localObject1 != null) && (i != 0))
            {
              localObject4 = d.c;
              localObject2 = e;
              str2 = d.f;
              ((h)localObject4).a((String)localObject2, (String)localObject8, (String)localObject9, (String)localObject1, str2);
            }
            if (localObject1 == null) {
              break label438;
            }
            bool1 = d;
            if (bool1)
            {
              localObject4 = "FirebaseInstanceId";
              localObject2 = "get master token succeeded";
              Log.d((String)localObject4, (String)localObject2);
            }
            a(this, (FirebaseInstanceId)localObject6);
            if ((!paramBoolean) && (localObject7 != null))
            {
              if (localObject7 == null) {
                break;
              }
              localObject4 = a;
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                break;
              }
            }
            a();
          }
          catch (SecurityException localSecurityException)
          {
            localObject2 = "FirebaseInstanceId";
            localObject8 = "Unable to get master token";
            Log.e((String)localObject2, (String)localObject8, localSecurityException);
          }
          break;
          label379:
          localObject1 = d.c;
          localObject10 = e;
          localObject1 = ((h)localObject1).a((String)localObject10, (String)localObject8, (String)localObject9);
          if (localObject1 != null)
          {
            localObject10 = d.f;
            bool2 = ((h.a)localObject1).b((String)localObject10);
            if (!bool2) {
              localObject1 = a;
            }
          }
        }
        label438:
        localObject5 = "returned token is null";
        a(paramIntent, (String)localObject5);
        continue;
      }
      Object localObject8 = FirebaseInstanceId.d();
      Object localObject5 = ((e)localObject8).a();
      if (localObject5 != null)
      {
        localObject2 = ((String)localObject5).split("!");
        int j = localObject2.length;
        int k = 2;
        int m;
        if (j == k)
        {
          localObject9 = localObject2[0];
          localObject6 = localObject2[i];
          m = -1;
        }
        for (;;)
        {
          try
          {
            int n = ((String)localObject9).hashCode();
            boolean bool3;
            switch (n)
            {
            default: 
              switch (m)
              {
              default: 
                ((e)localObject8).a((String)localObject5);
                localObject5 = ((e)localObject8).a();
              }
              break;
            case 83: 
              localObject7 = "S";
              bool3 = ((String)localObject9).equals(localObject7);
              if (!bool3) {
                continue;
              }
              m = 0;
              localObject2 = null;
              break;
            case 85: 
              localObject7 = "U";
              bool3 = ((String)localObject9).equals(localObject7);
              if (!bool3) {
                continue;
              }
              m = i;
              continue;
              localObject9 = FirebaseInstanceId.a();
              localObject7 = ((FirebaseInstanceId)localObject9).c();
              if (localObject7 != null)
              {
                localObject2 = d.f;
                bool4 = ((h.a)localObject7).b((String)localObject2);
                if (!bool4) {
                  break label710;
                }
              }
              localObject5 = new java/io/IOException;
              localObject2 = "token not available";
              ((IOException)localObject5).<init>((String)localObject2);
              throw ((Throwable)localObject5);
            }
          }
          catch (IOException localIOException2)
          {
            localObject5 = localIOException2.getMessage();
            a(paramIntent, (String)localObject5);
          }
          break;
          label710:
          localObject10 = new android/os/Bundle;
          ((Bundle)localObject10).<init>();
          localObject11 = "gcm.topic";
          localObject2 = "/topics/";
          String str3 = String.valueOf(localObject2);
          localObject2 = String.valueOf(localObject6);
          int i1 = ((String)localObject2).length();
          if (i1 != 0)
          {
            localObject2 = str3.concat((String)localObject2);
            label765:
            ((Bundle)localObject10).putString((String)localObject11, (String)localObject2);
            localObject7 = a;
            localObject2 = "/topics/";
            localObject11 = String.valueOf(localObject2);
            localObject2 = String.valueOf(localObject6);
            k = ((String)localObject2).length();
            if (k == 0) {
              break label893;
            }
            localObject2 = ((String)localObject11).concat((String)localObject2);
          }
          for (;;)
          {
            ((FirebaseInstanceId)localObject9).a((Bundle)localObject10);
            localObject9 = a;
            ((d)localObject9).a((String)localObject7, (String)localObject2, (Bundle)localObject10);
            bool4 = d;
            if (!bool4) {
              break;
            }
            localObject2 = "FirebaseInstanceId";
            localObject9 = "subscribe operation succeeded";
            Log.d((String)localObject2, (String)localObject9);
            break;
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>(str3);
            break label765;
            label893:
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>((String)localObject11);
          }
          localObject9 = FirebaseInstanceId.a();
          localObject7 = ((FirebaseInstanceId)localObject9).c();
          if (localObject7 != null)
          {
            localObject2 = d.f;
            bool4 = ((h.a)localObject7).b((String)localObject2);
            if (!bool4) {}
          }
          else
          {
            localObject5 = new java/io/IOException;
            localObject2 = "token not available";
            ((IOException)localObject5).<init>((String)localObject2);
            throw ((Throwable)localObject5);
          }
          localObject10 = new android/os/Bundle;
          ((Bundle)localObject10).<init>();
          localObject11 = "gcm.topic";
          localObject2 = "/topics/";
          str3 = String.valueOf(localObject2);
          localObject2 = String.valueOf(localObject6);
          i1 = ((String)localObject2).length();
          if (i1 != 0)
          {
            localObject2 = str3.concat((String)localObject2);
            ((Bundle)localObject10).putString((String)localObject11, (String)localObject2);
            localObject9 = a;
            localObject7 = a;
            localObject2 = "/topics/";
            localObject11 = String.valueOf(localObject2);
            localObject2 = String.valueOf(localObject6);
            k = ((String)localObject2).length();
            if (k == 0) {
              break label1133;
            }
            localObject2 = ((String)localObject11).concat((String)localObject2);
          }
          for (;;)
          {
            localObject6 = Looper.getMainLooper();
            localObject11 = Looper.myLooper();
            if (localObject6 != localObject11) {
              break label1148;
            }
            localObject5 = new java/io/IOException;
            localObject2 = "MAIN_THREAD";
            ((IOException)localObject5).<init>((String)localObject2);
            throw ((Throwable)localObject5);
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>(str3);
            break;
            label1133:
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>((String)localObject11);
          }
          label1148:
          localObject6 = d.c;
          localObject11 = e;
          ((h)localObject6).b((String)localObject11, (String)localObject7, (String)localObject2);
          localObject6 = "delete";
          localObject11 = "1";
          ((Bundle)localObject10).putString((String)localObject6, (String)localObject11);
          ((d)localObject9).a((String)localObject7, (String)localObject2, (Bundle)localObject10);
          boolean bool4 = d;
          if (bool4)
          {
            localObject2 = "FirebaseInstanceId";
            localObject9 = "unsubscribe operation succeeded";
            Log.d((String)localObject2, (String)localObject9);
          }
        }
      }
      localObject5 = "FirebaseInstanceId";
      localObject2 = "topic sync succeeded";
      Log.d((String)localObject5, (String)localObject2);
    }
  }
  
  private static Intent b(int paramInt)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("ACTION_TOKEN_REFRESH_RETRY");
    localIntent.putExtra("next_retry_delay_in_seconds", paramInt);
    return localIntent;
  }
  
  private static boolean c(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool;
    if (localNetworkInfo != null)
    {
      bool = localNetworkInfo.isConnected();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNetworkInfo = null;
    }
  }
  
  private static String d(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("subtype");
    if (str == null) {
      str = "";
    }
    return str;
  }
  
  public void a() {}
  
  public final boolean a(Intent paramIntent)
  {
    int i = 3;
    boolean bool = Log.isLoggable("FirebaseInstanceId", i);
    d = bool;
    Object localObject = paramIntent.getStringExtra("error");
    String str3;
    if (localObject == null)
    {
      localObject = paramIntent.getStringExtra("registration_id");
      if (localObject == null) {}
    }
    else
    {
      String str1 = d(paramIntent);
      bool = d;
      if (bool)
      {
        String str2 = "FirebaseInstanceId";
        str3 = "Register result in service ";
        localObject = String.valueOf(str1);
        int j = ((String)localObject).length();
        if (j != 0)
        {
          localObject = str3.concat((String)localObject);
          Log.d(str2, (String)localObject);
        }
      }
      else
      {
        a(str1);
        localObject = d.d();
        ((f)localObject).b(paramIntent);
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      localObject = new java/lang/String;
      ((String)localObject).<init>(str3);
      break;
      bool = false;
      localObject = null;
    }
  }
  
  public final void b(Intent paramIntent)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    Object localObject2 = paramIntent.getAction();
    if (localObject2 == null) {
      localObject2 = "";
    }
    int i = -1;
    int j = ((String)localObject2).hashCode();
    label56:
    Object localObject3;
    boolean bool3;
    String str1;
    String str2;
    switch (j)
    {
    default: 
      int k = i;
      switch (k)
      {
      default: 
        localObject2 = d(paramIntent);
        localObject1 = a((String)localObject2);
        localObject3 = paramIntent.getStringExtra("CMD");
        bool3 = d;
        if (bool3)
        {
          str1 = "FirebaseInstanceId";
          str2 = String.valueOf(paramIntent.getExtras());
          int m = String.valueOf(localObject2).length() + 18;
          int n = String.valueOf(localObject3).length();
          m += n;
          n = String.valueOf(str2).length();
          m += n;
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(m);
          StringBuilder localStringBuilder = ((StringBuilder)localObject4).append("Service command ").append((String)localObject2).append(" ").append((String)localObject3);
          localObject4 = " ";
          localStringBuilder = localStringBuilder.append((String)localObject4);
          str2 = str2;
          Log.d(str1, str2);
        }
        str1 = paramIntent.getStringExtra("unregistered");
        if (str1 != null)
        {
          localObject1 = d.c();
          if (localObject2 == null) {
            localObject2 = "";
          }
          ((h)localObject1).c((String)localObject2);
          localObject2 = d.d();
          ((f)localObject2).b(paramIntent);
        }
        break;
      }
      break;
    }
    for (;;)
    {
      return;
      str1 = "ACTION_TOKEN_REFRESH_RETRY";
      boolean bool4 = ((String)localObject2).equals(str1);
      if (!bool4) {
        break;
      }
      bool4 = false;
      localObject2 = null;
      break label56;
      a(paramIntent, false);
      continue;
      str1 = "gcm.googleapis.com/refresh";
      str2 = paramIntent.getStringExtra("from");
      bool3 = str1.equals(str2);
      if (bool3)
      {
        localObject1 = d.c();
        ((h)localObject1).c((String)localObject2);
        a(paramIntent, bool2);
      }
      else
      {
        str1 = "RST";
        bool3 = str1.equals(localObject3);
        if (bool3)
        {
          ((d)localObject1).b();
          a(paramIntent, bool2);
        }
        else
        {
          str1 = "RST_FULL";
          bool3 = str1.equals(localObject3);
          if (bool3)
          {
            localObject2 = d.c();
            bool4 = ((h)localObject2).a();
            if (!bool4)
            {
              ((d)localObject1).b();
              localObject2 = d.c();
              ((h)localObject2).b();
              a(paramIntent, bool2);
            }
          }
          else
          {
            localObject1 = "SYNC";
            bool1 = ((String)localObject1).equals(localObject3);
            if (bool1)
            {
              localObject1 = d.c();
              ((h)localObject1).c((String)localObject2);
              a(paramIntent, bool2);
            }
            else
            {
              localObject2 = "PING";
              bool4 = ((String)localObject2).equals(localObject3);
              if (bool4)
              {
                localObject2 = paramIntent.getExtras();
                localObject1 = f.a(this);
                if (localObject1 == null)
                {
                  localObject2 = "FirebaseInstanceId";
                  localObject1 = "Unable to respond to ping due to missing target package";
                  Log.w((String)localObject2, (String)localObject1);
                }
                else
                {
                  localObject3 = new android/content/Intent;
                  str1 = "com.google.android.gcm.intent.SEND";
                  ((Intent)localObject3).<init>(str1);
                  ((Intent)localObject3).setPackage((String)localObject1);
                  ((Intent)localObject3).putExtras((Bundle)localObject2);
                  f.a(this, (Intent)localObject3);
                  ((Intent)localObject3).putExtra("google.to", "google.com/iid");
                  localObject1 = f.a();
                  ((Intent)localObject3).putExtra("google.message_id", (String)localObject1);
                  localObject2 = "com.google.android.gtalkservice.permission.GTALK_SERVICE";
                  sendOrderedBroadcast((Intent)localObject3, (String)localObject2);
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected final Intent c(Intent paramIntent)
  {
    return (Intent)aa.poll();
  }
}


/* Location:              com/google/firebase/iid/FirebaseInstanceIdService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */