package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;

public final class cp$a
{
  final Object a;
  final String b;
  private final av c;
  
  private cp$a(String paramString, av paramav, Object paramObject)
  {
    c.a(paramav);
    c = paramav;
    a = paramObject;
    b = paramString;
  }
  
  static a a(String paramString, int paramInt)
  {
    a locala = new com/google/android/gms/b/cp$a;
    Object localObject = Integer.valueOf(paramInt);
    localObject = av.a(paramString, (Integer)localObject);
    Integer localInteger = Integer.valueOf(paramInt);
    locala.<init>(paramString, (av)localObject, localInteger);
    return locala;
  }
  
  static a a(String paramString, long paramLong1, long paramLong2)
  {
    a locala = new com/google/android/gms/b/cp$a;
    Object localObject = Long.valueOf(paramLong2);
    localObject = av.a(paramString, (Long)localObject);
    Long localLong = Long.valueOf(paramLong1);
    locala.<init>(paramString, (av)localObject, localLong);
    return locala;
  }
  
  static a a(String paramString1, String paramString2, String paramString3)
  {
    a locala = new com/google/android/gms/b/cp$a;
    av localav = av.a(paramString1, paramString3);
    locala.<init>(paramString1, localav, paramString2);
    return locala;
  }
  
  static a a(String paramString, boolean paramBoolean)
  {
    a locala = new com/google/android/gms/b/cp$a;
    av localav = av.a(paramString, paramBoolean);
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    locala.<init>(paramString, localav, localBoolean);
    return locala;
  }
  
  public final Object a(Object paramObject)
  {
    if (paramObject != null) {}
    for (;;)
    {
      return paramObject;
      paramObject = a;
    }
  }
}


/* Location:              com/google/android/gms/b/cp$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */