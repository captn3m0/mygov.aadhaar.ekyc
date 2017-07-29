package com.google.android.gms.b;

import android.content.Context;

public final class ba
{
  private static Context a;
  private static Boolean b;
  
  public static boolean a(Context paramContext)
  {
    boolean bool2;
    synchronized (ba.class)
    {
      Object localObject1 = paramContext.getApplicationContext();
      Object localObject3 = a;
      if (localObject3 != null)
      {
        localObject3 = b;
        if (localObject3 != null)
        {
          localObject3 = a;
          if (localObject3 == localObject1)
          {
            localObject1 = b;
            bool1 = ((Boolean)localObject1).booleanValue();
            return bool1;
          }
        }
      }
      bool2 = false;
      localObject3 = null;
      b = null;
      try
      {
        localObject3 = paramContext.getClassLoader();
        String str = "com.google.android.instantapps.supervisor.InstantAppsRuntime";
        ((ClassLoader)localObject3).loadClass(str);
        bool2 = true;
        localObject3 = Boolean.valueOf(bool2);
        b = (Boolean)localObject3;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        for (;;)
        {
          bool2 = false;
          Boolean localBoolean = null;
          localBoolean = Boolean.valueOf(false);
          b = localBoolean;
        }
      }
      a = (Context)localObject1;
      localObject1 = b;
      boolean bool1 = ((Boolean)localObject1).booleanValue();
    }
  }
}


/* Location:              com/google/android/gms/b/ba.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */