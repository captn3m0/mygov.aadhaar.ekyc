package com.google.android.gms.b;

import java.util.HashMap;

public final class es
  extends bg
{
  public Long a;
  public Boolean b;
  public Boolean c;
  
  public es() {}
  
  public es(String paramString)
  {
    a(paramString);
  }
  
  protected final HashMap a()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Integer localInteger = Integer.valueOf(0);
    Object localObject = a;
    localHashMap.put(localInteger, localObject);
    localInteger = Integer.valueOf(1);
    localObject = b;
    localHashMap.put(localInteger, localObject);
    localInteger = Integer.valueOf(2);
    localObject = c;
    localHashMap.put(localInteger, localObject);
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
      localObject = Integer.valueOf(1);
      localObject = (Boolean)localHashMap.get(localObject);
      b = ((Boolean)localObject);
      int i = 2;
      localObject = Integer.valueOf(i);
      localObject = (Boolean)localHashMap.get(localObject);
      c = ((Boolean)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/es.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */