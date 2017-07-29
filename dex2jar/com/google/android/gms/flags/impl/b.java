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
    try
    {
      if (a == null) {
        a = (SharedPreferences)bn.a(new Callable() {});
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
}


/* Location:              com/google/android/gms/flags/impl/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */