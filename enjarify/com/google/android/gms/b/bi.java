package com.google.android.gms.b;

import java.util.HashMap;

public final class bi
  extends bg
{
  public String a = "E";
  public long b = -1;
  public String c = "E";
  public String d = "E";
  public String e = "E";
  
  public bi() {}
  
  public bi(String paramString)
  {
    this();
    a(paramString);
  }
  
  protected final HashMap a()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Integer localInteger = Integer.valueOf(0);
    Object localObject = a;
    localHashMap.put(localInteger, localObject);
    localInteger = Integer.valueOf(4);
    localObject = e;
    localHashMap.put(localInteger, localObject);
    localInteger = Integer.valueOf(3);
    localObject = d;
    localHashMap.put(localInteger, localObject);
    localInteger = Integer.valueOf(2);
    localObject = c;
    localHashMap.put(localInteger, localObject);
    localInteger = Integer.valueOf(1);
    localObject = Long.valueOf(b);
    localHashMap.put(localInteger, localObject);
    return localHashMap;
  }
  
  protected final void a(String paramString)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    HashMap localHashMap = b(paramString);
    long l;
    if (localHashMap != null)
    {
      localObject = Integer.valueOf(0);
      localObject = localHashMap.get(localObject);
      if (localObject != null) {
        break label174;
      }
      localObject = "E";
      a = ((String)localObject);
      localObject = Integer.valueOf(m);
      localObject = localHashMap.get(localObject);
      if (localObject != null) {
        break label195;
      }
      l = -1;
      label76:
      b = l;
      localObject = Integer.valueOf(k);
      localObject = localHashMap.get(localObject);
      if (localObject != null) {
        break label224;
      }
      localObject = "E";
      label107:
      c = ((String)localObject);
      localObject = Integer.valueOf(j);
      localObject = localHashMap.get(localObject);
      if (localObject != null) {
        break label246;
      }
      localObject = "E";
      label137:
      d = ((String)localObject);
      localObject = Integer.valueOf(i);
      localObject = localHashMap.get(localObject);
      if (localObject != null) {
        break label267;
      }
    }
    for (Object localObject = "E";; localObject = (String)localHashMap.get(localObject))
    {
      e = ((String)localObject);
      return;
      label174:
      localObject = Integer.valueOf(0);
      localObject = (String)localHashMap.get(localObject);
      break;
      label195:
      localObject = Integer.valueOf(m);
      localObject = (Long)localHashMap.get(localObject);
      l = ((Long)localObject).longValue();
      break label76;
      label224:
      localObject = Integer.valueOf(k);
      localObject = (String)localHashMap.get(localObject);
      break label107;
      label246:
      localObject = Integer.valueOf(j);
      localObject = (String)localHashMap.get(localObject);
      break label137;
      label267:
      localObject = Integer.valueOf(i);
    }
  }
}


/* Location:              com/google/android/gms/b/bi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */