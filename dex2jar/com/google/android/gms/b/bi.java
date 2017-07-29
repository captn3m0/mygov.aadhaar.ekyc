package com.google.android.gms.b;

import java.util.HashMap;

public final class bi
  extends bg<Integer, Object>
{
  public String a = "E";
  public long b = -1L;
  public String c = "E";
  public String d = "E";
  public String e = "E";
  
  public bi() {}
  
  public bi(String paramString)
  {
    this();
    a(paramString);
  }
  
  protected final HashMap<Integer, Object> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), a);
    localHashMap.put(Integer.valueOf(4), e);
    localHashMap.put(Integer.valueOf(3), d);
    localHashMap.put(Integer.valueOf(2), c);
    localHashMap.put(Integer.valueOf(1), Long.valueOf(b));
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    HashMap localHashMap = b(paramString);
    long l;
    if (localHashMap != null)
    {
      if (localHashMap.get(Integer.valueOf(0)) != null) {
        break label113;
      }
      paramString = "E";
      a = paramString;
      if (localHashMap.get(Integer.valueOf(1)) != null) {
        break label129;
      }
      l = -1L;
      label47:
      b = l;
      if (localHashMap.get(Integer.valueOf(2)) != null) {
        break label148;
      }
      paramString = "E";
      label67:
      c = paramString;
      if (localHashMap.get(Integer.valueOf(3)) != null) {
        break label164;
      }
      paramString = "E";
      label87:
      d = paramString;
      if (localHashMap.get(Integer.valueOf(4)) != null) {
        break label180;
      }
    }
    label113:
    label129:
    label148:
    label164:
    label180:
    for (paramString = "E";; paramString = (String)localHashMap.get(Integer.valueOf(4)))
    {
      e = paramString;
      return;
      paramString = (String)localHashMap.get(Integer.valueOf(0));
      break;
      l = ((Long)localHashMap.get(Integer.valueOf(1))).longValue();
      break label47;
      paramString = (String)localHashMap.get(Integer.valueOf(2));
      break label67;
      paramString = (String)localHashMap.get(Integer.valueOf(3));
      break label87;
    }
  }
}


/* Location:              com/google/android/gms/b/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */