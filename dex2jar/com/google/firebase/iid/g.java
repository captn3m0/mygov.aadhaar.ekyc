package com.google.firebase.iid;

import android.app.PendingIntent;
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
  final Queue<Intent> a = new LinkedList();
  public final Queue<Intent> b = new LinkedList();
  private final k<String, String> d = new k();
  private Boolean e = null;
  
  public static PendingIntent a(Context paramContext, int paramInt, Intent paramIntent)
  {
    return a(paramContext, paramInt, "com.google.firebase.MESSAGING_EVENT", paramIntent, 1073741824);
  }
  
  static PendingIntent a(Context paramContext, int paramInt1, String paramString, Intent paramIntent, int paramInt2)
  {
    Intent localIntent = new Intent(paramContext, FirebaseInstanceIdInternalReceiver.class);
    localIntent.setAction(paramString);
    localIntent.putExtra("wrapped_intent", paramIntent);
    return PendingIntent.getBroadcast(paramContext, paramInt1, localIntent, paramInt2);
  }
  
  public static g a()
  {
    try
    {
      if (c == null) {
        c = new g();
      }
      g localg = c;
      return localg;
    }
    finally {}
  }
  
  private int b(Context paramContext, Intent paramIntent)
  {
    synchronized (d)
    {
      ??? = (String)d.get(paramIntent.getAction());
      ??? = ???;
      if (??? == null)
      {
        ??? = paramContext.getPackageManager().resolveService(paramIntent, 0);
        if ((??? == null) || (serviceInfo == null)) {
          Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        }
      }
    }
    try
    {
      boolean bool;
      if (e == null)
      {
        if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0)
        {
          bool = true;
          label87:
          e = Boolean.valueOf(bool);
        }
      }
      else
      {
        if (!e.booleanValue()) {
          break label416;
        }
        paramContext = e.a_(paramContext, paramIntent);
      }
      for (;;)
      {
        if (paramContext != null) {
          break label447;
        }
        Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
        return 404;
        paramContext = finally;
        throw paramContext;
        ??? = serviceInfo;
        if ((!paramContext.getPackageName().equals(packageName)) || (name == null))
        {
          ??? = String.valueOf(packageName);
          ??? = String.valueOf(name);
          Log.e("FirebaseInstanceId", String.valueOf(???).length() + 94 + String.valueOf(???).length() + "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + (String)??? + "/" + (String)???);
          break;
        }
        ??? = name;
        ??? = ???;
        if (((String)???).startsWith("."))
        {
          ??? = String.valueOf(paramContext.getPackageName());
          ??? = String.valueOf(???);
          if (((String)???).length() == 0) {
            break label377;
          }
          ??? = ((String)???).concat((String)???);
        }
        for (;;)
        {
          synchronized (d)
          {
            d.put(paramIntent.getAction(), ???);
            if (Log.isLoggable("FirebaseInstanceId", 3))
            {
              ??? = String.valueOf(???);
              if (((String)???).length() != 0)
              {
                ??? = "Restricting intent to a specific service: ".concat((String)???);
                Log.d("FirebaseInstanceId", (String)???);
              }
            }
            else
            {
              paramIntent.setClassName(paramContext.getPackageName(), (String)???);
              break;
              label377:
              ??? = new String((String)???);
            }
          }
          ??? = new String("Restricting intent to a specific service: ");
        }
        bool = false;
        break label87;
        label416:
        paramContext = paramContext.startService(paramIntent);
        Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
      }
      label447:
      return 402;
    }
    catch (SecurityException paramContext)
    {
      Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", paramContext);
      return 401;
      return -1;
    }
    catch (IllegalStateException paramContext)
    {
      paramContext = String.valueOf(paramContext);
      Log.e("FirebaseInstanceId", String.valueOf(paramContext).length() + 45 + "Failed to start service while in background: " + paramContext);
    }
  }
  
  public final int a(Context paramContext, String paramString, Intent paramIntent)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        paramContext = String.valueOf(paramString);
        if (paramContext.length() == 0) {}
        break;
      }
      break;
    }
    for (paramContext = "Unknown service action: ".concat(paramContext);; paramContext = new String("Unknown service action: "))
    {
      Log.w("FirebaseInstanceId", paramContext);
      return 500;
      if (!paramString.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
        break;
      }
      i = 0;
      break;
      if (!paramString.equals("com.google.firebase.MESSAGING_EVENT")) {
        break;
      }
      i = 1;
      break;
      a.offer(paramIntent);
      for (;;)
      {
        paramString = new Intent(paramString);
        paramString.setPackage(paramContext.getPackageName());
        return b(paramContext, paramString);
        b.offer(paramIntent);
      }
    }
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    a(paramContext, "com.google.firebase.INSTANCE_ID_EVENT", paramIntent);
  }
}


/* Location:              com/google/firebase/iid/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */