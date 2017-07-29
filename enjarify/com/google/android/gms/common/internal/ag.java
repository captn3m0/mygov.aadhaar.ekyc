package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.b.bb;
import com.google.android.gms.b.bc;

public final class ag
{
  private static Object a;
  private static boolean b;
  private static String c;
  private static int d;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public static String a(Context paramContext)
  {
    c(paramContext);
    return c;
  }
  
  public static int b(Context paramContext)
  {
    c(paramContext);
    return d;
  }
  
  private static void c(Context paramContext)
  {
    for (;;)
    {
      Object localObject2;
      Object localObject4;
      int j;
      synchronized (a)
      {
        boolean bool = b;
        if (bool) {
          return;
        }
        bool = true;
        b = bool;
        localObject2 = paramContext.getPackageName();
        localObject4 = bc.a(paramContext);
        j = 128;
      }
      try
      {
        localObject2 = ((bb)localObject4).a((String)localObject2, j);
        localObject2 = metaData;
        if (localObject2 == null)
        {
          continue;
          localObject3 = finally;
          throw ((Throwable)localObject3);
        }
        localObject4 = "com.google.app.id";
        localObject4 = ((Bundle)localObject3).getString((String)localObject4);
        c = (String)localObject4;
        localObject4 = "com.google.android.gms.version";
        int i = ((Bundle)localObject3).getInt((String)localObject4);
        d = i;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          localObject4 = "MetadataValueReader";
          String str = "This should never happen.";
          Log.wtf((String)localObject4, str, localNameNotFoundException);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/common/internal/ag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */