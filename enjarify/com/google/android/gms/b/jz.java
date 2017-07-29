package com.google.android.gms.b;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.w;
import java.util.Collection;

public abstract class jz
{
  final String a;
  public final Object b;
  private final int c;
  
  private jz(int paramInt, String paramString, Object paramObject)
  {
    c = paramInt;
    a = paramString;
    b = paramObject;
    pa.add(this);
  }
  
  public static jz a(int paramInt, String paramString)
  {
    jz localjz = a(paramInt, paramString, null);
    pb.add(localjz);
    return localjz;
  }
  
  public static jz a(int paramInt, String paramString, float paramFloat)
  {
    jz.4 local4 = new com/google/android/gms/b/jz$4;
    Float localFloat = Float.valueOf(paramFloat);
    local4.<init>(paramInt, paramString, localFloat);
    return local4;
  }
  
  public static jz a(int paramInt1, String paramString, int paramInt2)
  {
    jz.2 local2 = new com/google/android/gms/b/jz$2;
    Integer localInteger = Integer.valueOf(paramInt2);
    local2.<init>(paramInt1, paramString, localInteger);
    return local2;
  }
  
  public static jz a(int paramInt, String paramString, long paramLong)
  {
    jz.3 local3 = new com/google/android/gms/b/jz$3;
    Long localLong = Long.valueOf(paramLong);
    local3.<init>(paramInt, paramString, localLong);
    return local3;
  }
  
  public static jz a(int paramInt, String paramString, Boolean paramBoolean)
  {
    jz.1 local1 = new com/google/android/gms/b/jz$1;
    local1.<init>(paramInt, paramString, paramBoolean);
    return local1;
  }
  
  public static jz a(int paramInt, String paramString1, String paramString2)
  {
    jz.5 local5 = new com/google/android/gms/b/jz$5;
    local5.<init>(paramInt, paramString1, paramString2);
    return local5;
  }
  
  public static jz b(int paramInt, String paramString)
  {
    jz localjz = a(paramInt, paramString, null);
    pc.add(localjz);
    return localjz;
  }
  
  protected abstract Object a(SharedPreferences paramSharedPreferences);
}


/* Location:              com/google/android/gms/b/jz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */