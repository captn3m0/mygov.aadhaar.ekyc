package com.google.android.gms.b;

import java.util.HashMap;

public final class ex
  extends bg
{
  public Long a;
  
  public ex() {}
  
  public ex(String paramString)
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
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    Object localObject = b(paramString);
    if (localObject != null)
    {
      Integer localInteger = Integer.valueOf(0);
      localObject = (Long)((HashMap)localObject).get(localInteger);
      a = ((Long)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/ex.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */