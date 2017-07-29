package com.google.android.gms.b;

import java.util.HashMap;

public final class et
  extends bg
{
  public Long a;
  public Long b;
  
  public et() {}
  
  public et(String paramString)
  {
    a(paramString);
  }
  
  protected final HashMap a()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Integer localInteger = Integer.valueOf(0);
    Long localLong = a;
    localHashMap.put(localInteger, localLong);
    localInteger = Integer.valueOf(1);
    localLong = b;
    localHashMap.put(localInteger, localLong);
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    HashMap localHashMap = b(paramString);
    if (localHashMap != null)
    {
      Object localObject = Integer.valueOf(0);
      localObject = (Long)localHashMap.get(localObject);
      a = ((Long)localObject);
      int i = 1;
      localObject = Integer.valueOf(i);
      localObject = (Long)localHashMap.get(localObject);
      b = ((Long)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/et.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */