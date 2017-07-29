package com.google.android.gms.b;

import android.util.Log;

public class ul
{
  public static void a(String paramString, Throwable paramThrowable)
  {
    boolean bool = a(3);
    if (bool)
    {
      String str = "Ads";
      Log.d(str, paramString, paramThrowable);
    }
  }
  
  public static boolean a(int paramInt)
  {
    int i = 5;
    String str;
    boolean bool;
    if (paramInt < i)
    {
      str = "Ads";
      bool = Log.isLoggable(str, paramInt);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public static void b(String paramString)
  {
    boolean bool = a(3);
    if (bool)
    {
      String str = "Ads";
      Log.d(str, paramString);
    }
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    boolean bool = a(6);
    if (bool)
    {
      String str = "Ads";
      Log.e(str, paramString, paramThrowable);
    }
  }
  
  public static void c(String paramString)
  {
    boolean bool = a(6);
    if (bool)
    {
      String str = "Ads";
      Log.e(str, paramString);
    }
  }
  
  public static void c(String paramString, Throwable paramThrowable)
  {
    boolean bool = a(5);
    if (bool)
    {
      String str = "Ads";
      Log.w(str, paramString, paramThrowable);
    }
  }
  
  public static void d(String paramString)
  {
    boolean bool = a(4);
    if (bool)
    {
      String str = "Ads";
      Log.i(str, paramString);
    }
  }
  
  public static void e(String paramString)
  {
    boolean bool = a(5);
    if (bool)
    {
      String str = "Ads";
      Log.w(str, paramString);
    }
  }
}


/* Location:              com/google/android/gms/b/ul.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */