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
  private static Object a = new Object();
  private static boolean b;
  private static String c;
  private static int d;
  
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
    String str;
    synchronized (a)
    {
      if (b) {
        return;
      }
      b = true;
      str = paramContext.getPackageName();
      paramContext = bc.a(paramContext);
    }
    try
    {
      paramContext = a128metaData;
      if (paramContext == null)
      {
        return;
        paramContext = finally;
        throw paramContext;
      }
      c = paramContext.getString("com.google.app.id");
      d = paramContext.getInt("com.google.android.gms.version");
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        Log.wtf("MetadataValueReader", "This should never happen.", paramContext);
      }
    }
  }
}


/* Location:              com/google/android/gms/common/internal/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */