package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V>
  extends k<K, V>
  implements Map<K, V>
{
  h<K, V> a;
  
  public a() {}
  
  public a(int paramInt)
  {
    super(paramInt);
  }
  
  private h<K, V> a()
  {
    if (a == null) {
      a = new h()
      {
        protected final int a()
        {
          return h;
        }
        
        protected final int a(Object paramAnonymousObject)
        {
          return a.this.a(paramAnonymousObject);
        }
        
        protected final Object a(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return g[((paramAnonymousInt1 << 1) + paramAnonymousInt2)];
        }
        
        protected final V a(int paramAnonymousInt, V paramAnonymousV)
        {
          a locala = a.this;
          paramAnonymousInt = (paramAnonymousInt << 1) + 1;
          Object localObject = g[paramAnonymousInt];
          g[paramAnonymousInt] = paramAnonymousV;
          return (V)localObject;
        }
        
        protected final void a(int paramAnonymousInt)
        {
          d(paramAnonymousInt);
        }
        
        protected final void a(K paramAnonymousK, V paramAnonymousV)
        {
          put(paramAnonymousK, paramAnonymousV);
        }
        
        protected final int b(Object paramAnonymousObject)
        {
          return a.this.b(paramAnonymousObject);
        }
        
        protected final Map<K, V> b()
        {
          return a.this;
        }
        
        protected final void c()
        {
          clear();
        }
      };
    }
    return a;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    h localh = a();
    if (b == null) {
      b = new h.b(localh);
    }
    return b;
  }
  
  public Set<K> keySet()
  {
    return a().d();
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(h + paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public Collection<V> values()
  {
    h localh = a();
    if (d == null) {
      d = new h.e(localh);
    }
    return d;
  }
}


/* Location:              android/support/v4/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */