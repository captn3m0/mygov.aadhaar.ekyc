package com.google.android.gms.b;

import java.util.HashMap;

public final class et
  extends bg<Integer, Long>
{
  public Long a;
  public Long b;
  
  public et() {}
  
  public et(String paramString)
  {
    a(paramString);
  }
  
  protected final HashMap<Integer, Long> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), a);
    localHashMap.put(Integer.valueOf(1), b);
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    paramString = b(paramString);
    if (paramString != null)
    {
      a = ((Long)paramString.get(Integer.valueOf(0)));
      b = ((Long)paramString.get(Integer.valueOf(1)));
    }
  }
}


/* Location:              com/google/android/gms/b/et.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */