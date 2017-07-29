package com.google.android.gms.b;

import java.util.HashMap;

public final class es
  extends bg<Integer, Object>
{
  public Long a;
  public Boolean b;
  public Boolean c;
  
  public es() {}
  
  public es(String paramString)
  {
    a(paramString);
  }
  
  protected final HashMap<Integer, Object> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), a);
    localHashMap.put(Integer.valueOf(1), b);
    localHashMap.put(Integer.valueOf(2), c);
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    paramString = b(paramString);
    if (paramString != null)
    {
      a = ((Long)paramString.get(Integer.valueOf(0)));
      b = ((Boolean)paramString.get(Integer.valueOf(1)));
      c = ((Boolean)paramString.get(Integer.valueOf(2)));
    }
  }
}


/* Location:              com/google/android/gms/b/es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */