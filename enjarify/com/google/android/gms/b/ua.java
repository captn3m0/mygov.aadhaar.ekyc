package com.google.android.gms.b;

import android.content.Context;
import java.util.Map;

public final class ua
{
  static qd a;
  public static final ua.a b;
  private static final Object c;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    localObject = new com/google/android/gms/b/ua$1;
    ((ua.1)localObject).<init>();
    b = (ua.a)localObject;
  }
  
  public ua(Context paramContext)
  {
    a(paramContext);
  }
  
  private static qd a(Context paramContext)
  {
    synchronized (c)
    {
      Object localObject2 = a;
      if (localObject2 == null)
      {
        localObject2 = paramContext.getApplicationContext();
        localObject2 = aw.a((Context)localObject2);
        a = (qd)localObject2;
      }
      localObject2 = a;
      return (qd)localObject2;
    }
  }
  
  public static us a(String paramString, Map paramMap)
  {
    ua.c localc = new com/google/android/gms/b/ua$c;
    localc.<init>((byte)0);
    ua.2 local2 = new com/google/android/gms/b/ua$2;
    local2.<init>(paramString, localc);
    ua.3 local3 = new com/google/android/gms/b/ua$3;
    local3.<init>(paramString, localc, local2, paramMap);
    a.a(local3);
    return localc;
  }
}


/* Location:              com/google/android/gms/b/ua.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */