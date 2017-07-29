package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

public final class c
{
  public static Object a(Object paramObject)
  {
    if (paramObject == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("null reference");
      throw localNullPointerException;
    }
    return paramObject;
  }
  
  public static Object a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      String str = String.valueOf(paramObject2);
      localNullPointerException.<init>(str);
      throw localNullPointerException;
    }
    return paramObject1;
  }
  
  public static String a(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Given String is empty or null");
      throw localIllegalArgumentException;
    }
    return paramString;
  }
  
  public static void a(Handler paramHandler)
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = paramHandler.getLooper();
    if (localObject != localLooper)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Must be called on the handler thread");
      throw ((Throwable)localObject);
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>();
      throw localIllegalStateException;
    }
  }
  
  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      String str = String.valueOf(paramObject);
      localIllegalStateException.<init>(str);
      throw localIllegalStateException;
    }
  }
  
  public static void b(String paramString)
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject != localLooper)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(paramString);
      throw ((Throwable)localObject);
    }
  }
  
  public static void b(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
  }
  
  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = String.valueOf(paramObject);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
  }
  
  public static void c(String paramString)
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject == localLooper)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(paramString);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              com/google/android/gms/common/internal/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */