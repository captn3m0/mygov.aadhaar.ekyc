package org.a.d;

import java.util.HashMap;
import java.util.Map;
import org.a.c;

public final class d$b
{
  private static Map a;
  
  static
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    Object localObject2 = c.values();
    int i = localObject2.length;
    int j = 0;
    localObject1 = null;
    while (j < i)
    {
      Object localObject3 = localObject2[j];
      String str = ((d)localObject3).a();
      Map localMap = a;
      boolean bool = localMap.containsKey(str);
      if (bool)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Attempt to map two key types to the same name ");
        localObject2 = str;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localMap = a;
      localMap.put(str, localObject3);
      j += 1;
    }
  }
  
  public static d a(String paramString)
  {
    Object localObject1 = a;
    boolean bool = ((Map)localObject1).containsKey(paramString);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Cannot deserialize ");
      localObject2 = paramString + " no such key has been registered.";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (d)a.get(paramString);
  }
}


/* Location:              org/a/d/d$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */