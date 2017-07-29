package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a
  extends k
  implements Map
{
  h a;
  
  public a() {}
  
  public a(int paramInt)
  {
    super(paramInt);
  }
  
  private h a()
  {
    Object localObject = a;
    if (localObject == null)
    {
      localObject = new android/support/v4/g/a$1;
      ((a.1)localObject).<init>(this);
      a = ((h)localObject);
    }
    return a;
  }
  
  public Set entrySet()
  {
    h localh = a();
    h.b localb = b;
    if (localb == null)
    {
      localb = new android/support/v4/g/h$b;
      localb.<init>(localh);
      b = localb;
    }
    return b;
  }
  
  public Set keySet()
  {
    return a().d();
  }
  
  public void putAll(Map paramMap)
  {
    int i = h;
    int j = paramMap.size();
    i += j;
    a(i);
    Object localObject1 = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      put(localObject2, localObject1);
    }
  }
  
  public Collection values()
  {
    h localh = a();
    h.e locale = d;
    if (locale == null)
    {
      locale = new android/support/v4/g/h$e;
      locale.<init>(localh);
      d = locale;
    }
    return d;
  }
}


/* Location:              android/support/v4/g/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */