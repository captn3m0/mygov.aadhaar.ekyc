package com.google.android.gms.b;

import android.util.Log;

@qi
public class ul
{
  public static void a(String paramString, Throwable paramThrowable)
  {
    if (a(3)) {
      Log.d("Ads", paramString, paramThrowable);
    }
  }
  
  public static boolean a(int paramInt)
  {
    return (paramInt >= 5) || (Log.isLoggable("Ads", paramInt));
  }
  
  public static void b(String paramString)
  {
    if (a(3)) {
      Log.d("Ads", paramString);
    }
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    if (a(6)) {
      Log.e("Ads", paramString, paramThrowable);
    }
  }
  
  public static void c(String paramString)
  {
    if (a(6)) {
      Log.e("Ads", paramString);
    }
  }
  
  public static void c(String paramString, Throwable paramThrowable)
  {
    if (a(5)) {
      Log.w("Ads", paramString, paramThrowable);
    }
  }
  
  public static void d(String paramString)
  {
    if (a(4)) {
      Log.i("Ads", paramString);
    }
  }
  
  public static void e(String paramString)
  {
    if (a(5)) {
      Log.w("Ads", paramString);
    }
  }
}


/* Location:              com/google/android/gms/b/ul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */