package android.support.v4.g;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class g<K, V>
{
  private final LinkedHashMap<K, V> a = new LinkedHashMap(0, 0.75F, true);
  private int b;
  private int c = 6;
  private int d;
  private int e;
  private int f;
  private int g;
  
  private void a(int paramInt)
  {
    try
    {
      if ((b < 0) || ((a.isEmpty()) && (b != 0))) {
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
      }
    }
    finally
    {
      throw ((Throwable)localObject1);
      if ((b <= paramInt) || (a.isEmpty())) {
        return;
      }
      Map.Entry localEntry = (Map.Entry)a.entrySet().iterator().next();
      Object localObject2 = localEntry.getKey();
      localEntry.getValue();
      a.remove(localObject2);
      b -= 1;
      e += 1;
    }
  }
  
  public final V a(K paramK)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    try
    {
      paramK = a.get(paramK);
      if (paramK != null)
      {
        f += 1;
        return paramK;
      }
      g += 1;
      return null;
    }
    finally {}
  }
  
  public final V a(K paramK, V paramV)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      d += 1;
      b += 1;
      paramK = a.put(paramK, paramV);
      if (paramK != null) {
        b -= 1;
      }
      a(c);
      return paramK;
    }
    finally {}
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      int j = f + g;
      if (j != 0) {
        i = f * 100 / j;
      }
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(c), Integer.valueOf(f), Integer.valueOf(g), Integer.valueOf(i) });
      return str;
    }
    finally {}
  }
}


/* Location:              android/support/v4/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */