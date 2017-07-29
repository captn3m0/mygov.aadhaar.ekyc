package org.a.d;

import java.util.HashMap;
import java.util.Map;
import org.a.c;
import org.a.k;

public abstract interface d
{
  public abstract String a();
  
  public abstract a b();
  
  public static abstract interface a
  {
    public abstract k a(String paramString);
  }
  
  public static final class b
  {
    private static Map<String, d> a = new HashMap();
    
    static
    {
      c[] arrayOfc = c.values();
      int j = arrayOfc.length;
      int i = 0;
      while (i < j)
      {
        c localc = arrayOfc[i];
        String str = localc.a();
        if (a.containsKey(str)) {
          throw new IllegalArgumentException("Attempt to map two key types to the same name " + str);
        }
        a.put(str, localc);
        i += 1;
      }
    }
    
    public static d a(String paramString)
    {
      if (!a.containsKey(paramString)) {
        throw new IllegalArgumentException("Cannot deserialize " + paramString + " no such key has been registered.");
      }
      return (d)a.get(paramString);
    }
  }
}


/* Location:              org/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */