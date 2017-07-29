package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.b.bn;
import java.util.concurrent.Callable;

public final class b
{
  private static SharedPreferences a = null;
  
  public static SharedPreferences a(Context paramContext)
  {
    synchronized (SharedPreferences.class)
    {
      Object localObject1 = a;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/flags/impl/b$1;
        ((b.1)localObject1).<init>(paramContext);
        localObject1 = bn.a((Callable)localObject1);
        localObject1 = (SharedPreferences)localObject1;
        a = (SharedPreferences)localObject1;
      }
      localObject1 = a;
      return (SharedPreferences)localObject1;
    }
  }
}


/* Location:              com/google/android/gms/flags/impl/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */