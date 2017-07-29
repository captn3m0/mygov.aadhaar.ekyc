package com.google.android.gms.common.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.b;
import java.util.Collections;
import java.util.List;

public final class a
{
  private static final Object a;
  private static a b;
  private final List c;
  private final List d;
  private final List e;
  private final List f;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  private a()
  {
    List localList = Collections.EMPTY_LIST;
    c = localList;
    localList = Collections.EMPTY_LIST;
    d = localList;
    localList = Collections.EMPTY_LIST;
    e = localList;
    localList = Collections.EMPTY_LIST;
    f = localList;
  }
  
  public static a a()
  {
    synchronized (a)
    {
      a locala = b;
      if (locala == null)
      {
        locala = new com/google/android/gms/common/a/a;
        locala.<init>();
        b = locala;
      }
      return b;
    }
  }
  
  public static void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
  }
  
  public static boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    boolean bool1 = false;
    Object localObject = paramIntent.getComponent();
    boolean bool2;
    if (localObject == null)
    {
      bool2 = false;
      localObject = null;
      if (!bool2) {
        break label62;
      }
      localObject = "ConnectionTracker";
      String str = "Attempted to bind to a service in a STOPPED package.";
      Log.w((String)localObject, str);
    }
    for (;;)
    {
      return bool1;
      localObject = ((ComponentName)localObject).getPackageName();
      bool2 = b.a(paramContext, (String)localObject);
      break;
      label62:
      bool1 = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
    }
  }
  
  public static void b() {}
  
  public static boolean b(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    paramContext.getClass().getName();
    return a(paramContext, paramIntent, paramServiceConnection, paramInt);
  }
  
  public static void c() {}
}


/* Location:              com/google/android/gms/common/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */