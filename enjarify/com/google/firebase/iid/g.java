package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.c.e;
import android.support.v4.g.k;
import android.util.Log;
import java.util.LinkedList;
import java.util.Queue;

public final class g
{
  private static g c;
  final Queue a;
  public final Queue b;
  private final k d;
  private Boolean e;
  
  private g()
  {
    Object localObject = new android/support/v4/g/k;
    ((k)localObject).<init>();
    d = ((k)localObject);
    e = null;
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    a = ((Queue)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    b = ((Queue)localObject);
  }
  
  public static PendingIntent a(Context paramContext, int paramInt, Intent paramIntent)
  {
    return a(paramContext, paramInt, "com.google.firebase.MESSAGING_EVENT", paramIntent, 1073741824);
  }
  
  static PendingIntent a(Context paramContext, int paramInt1, String paramString, Intent paramIntent, int paramInt2)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramContext, FirebaseInstanceIdInternalReceiver.class);
    localIntent.setAction(paramString);
    localIntent.putExtra("wrapped_intent", paramIntent);
    return PendingIntent.getBroadcast(paramContext, paramInt1, localIntent, paramInt2);
  }
  
  public static g a()
  {
    synchronized (g.class)
    {
      g localg = c;
      if (localg == null)
      {
        localg = new com/google/firebase/iid/g;
        localg.<init>();
        c = localg;
      }
      localg = c;
      return localg;
    }
  }
  
  private int b(Context paramContext, Intent paramIntent)
  {
    i = 0;
    localObject1 = null;
    for (;;)
    {
      synchronized (d)
      {
        Object localObject3 = d;
        localObject7 = paramIntent.getAction();
        localObject3 = ((k)localObject3).get(localObject7);
        localObject3 = (String)localObject3;
        if (localObject3 != null) {
          break label458;
        }
        localObject3 = paramContext.getPackageManager().resolveService(paramIntent, 0);
        if (localObject3 != null)
        {
          ??? = serviceInfo;
          if (??? != null) {}
        }
        else
        {
          localObject3 = "FirebaseInstanceId";
          ??? = "Failed to resolve target intent service, skipping classname enforcement";
          Log.e((String)localObject3, (String)???);
        }
        try
        {
          localObject3 = e;
          if (localObject3 == null)
          {
            localObject3 = "android.permission.WAKE_LOCK";
            int j = paramContext.checkCallingOrSelfPermission((String)localObject3);
            if (j != 0) {
              break label579;
            }
            j = 1;
            localObject3 = Boolean.valueOf(j);
            e = ((Boolean)localObject3);
          }
          localObject3 = e;
          boolean bool1 = ((Boolean)localObject3).booleanValue();
          if (!bool1) {
            break label588;
          }
          localObject3 = e.a_(paramContext, paramIntent);
          if (localObject3 != null) {
            break;
          }
          localObject3 = "FirebaseInstanceId";
          ??? = "Error while delivering the message: ServiceIntent not found.";
          Log.e((String)localObject3, (String)???);
          k = 404;
        }
        catch (SecurityException localSecurityException)
        {
          Object localObject5;
          boolean bool2;
          int m;
          int n;
          StringBuilder localStringBuilder;
          String str2;
          int i1;
          ComponentName localComponentName;
          ??? = "FirebaseInstanceId";
          localObject1 = "Error while delivering the message to the serviceIntent";
          Log.e((String)???, (String)localObject1, localSecurityException);
          k = 401;
          continue;
          k = -1;
          continue;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          ??? = "FirebaseInstanceId";
          String str1 = String.valueOf(localIllegalStateException);
          i = String.valueOf(str1).length() + 45;
          localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>(i);
          localObject1 = ((StringBuilder)localObject7).append("Failed to start service while in background: ");
          str1 = str1;
          Log.e((String)???, str1);
          int k = 402;
          continue;
        }
        return k;
      }
      localObject5 = serviceInfo;
      ??? = paramContext.getPackageName();
      localObject7 = packageName;
      bool2 = ((String)???).equals(localObject7);
      if (bool2)
      {
        ??? = name;
        if (??? != null) {}
      }
      else
      {
        ??? = "FirebaseInstanceId";
        localObject7 = String.valueOf(packageName);
        localObject5 = String.valueOf(name);
        m = String.valueOf(localObject7).length() + 94;
        n = String.valueOf(localObject5).length();
        m += n;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(m);
        localObject7 = localStringBuilder.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append((String)localObject7);
        str2 = "/";
        localObject7 = ((StringBuilder)localObject7).append(str2);
        localObject5 = (String)localObject5;
        Log.e((String)???, (String)localObject5);
        continue;
      }
      localObject5 = name;
      ??? = ".";
      bool2 = ((String)localObject5).startsWith((String)???);
      if (bool2)
      {
        ??? = String.valueOf(paramContext.getPackageName());
        localObject5 = String.valueOf(localObject5);
        i1 = ((String)localObject5).length();
        if (i1 == 0) {
          break label541;
        }
        localObject5 = ((String)???).concat((String)localObject5);
      }
      for (;;)
      {
        synchronized (d)
        {
          localObject7 = d;
          str2 = paramIntent.getAction();
          ((k)localObject7).put(str2, localObject5);
          label458:
          ??? = "FirebaseInstanceId";
          i1 = 3;
          bool2 = Log.isLoggable((String)???, i1);
          if (bool2)
          {
            localObject7 = "FirebaseInstanceId";
            str2 = "Restricting intent to a specific service: ";
            ??? = String.valueOf(localObject5);
            n = ((String)???).length();
            if (n != 0)
            {
              ??? = str2.concat((String)???);
              Log.d((String)localObject7, (String)???);
            }
          }
          else
          {
            ??? = paramContext.getPackageName();
            paramIntent.setClassName((String)???, (String)localObject5);
            break;
            label541:
            localObject5 = new java/lang/String;
            ((String)localObject5).<init>((String)???);
          }
        }
        ??? = new java/lang/String;
        ((String)???).<init>(str2);
      }
      label579:
      k = 0;
      localComponentName = null;
      continue;
      label588:
      localComponentName = paramContext.startService(paramIntent);
      ??? = "FirebaseInstanceId";
      localObject1 = "Missing wake lock permission, service start may be delayed";
      Log.d((String)???, (String)localObject1);
    }
  }
  
  public final int a(Context paramContext, String paramString, Intent paramIntent)
  {
    int i = -1;
    int j = paramString.hashCode();
    String str1;
    String str2;
    Object localObject;
    switch (j)
    {
    default: 
      switch (i)
      {
      default: 
        str1 = "FirebaseInstanceId";
        str2 = "Unknown service action: ";
        localObject = String.valueOf(paramString);
        int k = ((String)localObject).length();
        if (k != 0) {
          localObject = str2.concat((String)localObject);
        }
        break;
      }
      break;
    }
    for (;;)
    {
      Log.w(str1, (String)localObject);
      i = 500;
      return i;
      str1 = "com.google.firebase.INSTANCE_ID_EVENT";
      boolean bool = paramString.equals(str1);
      if (!bool) {
        break;
      }
      i = 0;
      localObject = null;
      break;
      str1 = "com.google.firebase.MESSAGING_EVENT";
      bool = paramString.equals(str1);
      if (!bool) {
        break;
      }
      i = 1;
      break;
      localObject = a;
      ((Queue)localObject).offer(paramIntent);
      for (;;)
      {
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>(paramString);
        str1 = paramContext.getPackageName();
        ((Intent)localObject).setPackage(str1);
        i = b(paramContext, (Intent)localObject);
        break;
        localObject = b;
        ((Queue)localObject).offer(paramIntent);
      }
      localObject = new java/lang/String;
      ((String)localObject).<init>(str2);
    }
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    a(paramContext, "com.google.firebase.INSTANCE_ID_EVENT", paramIntent);
  }
}


/* Location:              com/google/firebase/iid/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */