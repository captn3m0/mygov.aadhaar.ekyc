package com.google.android.gms.b;

import java.util.HashMap;

public final class ev
  extends bg<Integer, Long>
{
  public Long a;
  public Long b;
  public Long c;
  public Long d;
  public Long e;
  public Long f;
  public Long g;
  public Long h;
  public Long i;
  public Long j;
  public Long k;
  
  public ev() {}
  
  public ev(String paramString)
  {
    a(paramString);
  }
  
  protected final HashMap<Integer, Long> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), a);
    localHashMap.put(Integer.valueOf(1), b);
    localHashMap.put(Integer.valueOf(2), c);
    localHashMap.put(Integer.valueOf(3), d);
    localHashMap.put(Integer.valueOf(4), e);
    localHashMap.put(Integer.valueOf(5), f);
    localHashMap.put(Integer.valueOf(6), g);
    localHashMap.put(Integer.valueOf(7), h);
    localHashMap.put(Integer.valueOf(8), i);
    localHashMap.put(Integer.valueOf(9), j);
    localHashMap.put(Integer.valueOf(10), k);
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    paramString = b(paramString);
    if (paramString != null)
    {
      a = ((Long)paramString.get(Integer.valueOf(0)));
      b = ((Long)paramString.get(Integer.valueOf(1)));
      c = ((Long)paramString.get(Integer.valueOf(2)));
      d = ((Long)paramString.get(Integer.valueOf(3)));
      e = ((Long)paramString.get(Integer.valueOf(4)));
      f = ((Long)paramString.get(Integer.valueOf(5)));
      g = ((Long)paramString.get(Integer.valueOf(6)));
      h = ((Long)paramString.get(Integer.valueOf(7)));
      i = ((Long)paramString.get(Integer.valueOf(8)));
      j = ((Long)paramString.get(Integer.valueOf(9)));
      k = ((Long)paramString.get(Integer.valueOf(10)));
    }
  }
}


/* Location:              com/google/android/gms/b/ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */