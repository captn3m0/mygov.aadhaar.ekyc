package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class h<K, V>
{
  h<K, V>.b b;
  h<K, V>.c c;
  h<K, V>.e d;
  
  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
      }
    }
    return i != paramMap.size();
  }
  
  public static <T> boolean a(Set<T> paramSet, Object paramObject)
  {
    if (paramSet == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Set))
      {
        paramObject = (Set)paramObject;
        try
        {
          if (paramSet.size() == ((Set)paramObject).size())
          {
            boolean bool = paramSet.containsAll((Collection)paramObject);
            if (bool) {}
          }
          else
          {
            return false;
          }
        }
        catch (NullPointerException paramSet)
        {
          return false;
        }
        catch (ClassCastException paramSet)
        {
          return false;
        }
      }
    }
    return false;
  }
  
  protected abstract int a();
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract V a(int paramInt, V paramV);
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(K paramK, V paramV);
  
  public final <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    int j = a();
    if (paramArrayOfT.length < j) {
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), j);
    }
    for (;;)
    {
      int i = 0;
      while (i < j)
      {
        paramArrayOfT[i] = a(i, paramInt);
        i += 1;
      }
      if (paramArrayOfT.length > j) {
        paramArrayOfT[j] = null;
      }
      return paramArrayOfT;
    }
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map<K, V> b();
  
  public final Object[] b(int paramInt)
  {
    int j = a();
    Object[] arrayOfObject = new Object[j];
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = a(i, paramInt);
      i += 1;
    }
    return arrayOfObject;
  }
  
  protected abstract void c();
  
  public final Set<K> d()
  {
    if (c == null) {
      c = new c();
    }
    return c;
  }
  
  final class a<T>
    implements Iterator<T>
  {
    final int a;
    int b;
    int c;
    boolean d = false;
    
    a(int paramInt)
    {
      a = paramInt;
      b = a();
    }
    
    public final boolean hasNext()
    {
      return c < b;
    }
    
    public final T next()
    {
      Object localObject = a(c, a);
      c += 1;
      d = true;
      return (T)localObject;
    }
    
    public final void remove()
    {
      if (!d) {
        throw new IllegalStateException();
      }
      c -= 1;
      b -= 1;
      d = false;
      a(c);
    }
  }
  
  final class b
    implements Set<Map.Entry<K, V>>
  {
    b() {}
    
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
    {
      int i = a();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramCollection.next();
        a(localEntry.getKey(), localEntry.getValue());
      }
      return i != a();
    }
    
    public final void clear()
    {
      c();
    }
    
    public final boolean contains(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {}
      int i;
      do
      {
        return false;
        paramObject = (Map.Entry)paramObject;
        i = a(((Map.Entry)paramObject).getKey());
      } while (i < 0);
      return c.a(a(i, 1), ((Map.Entry)paramObject).getValue());
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean equals(Object paramObject)
    {
      return h.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      int j = a() - 1;
      int i = 0;
      if (j >= 0)
      {
        Object localObject1 = a(j, 0);
        Object localObject2 = a(j, 1);
        int k;
        if (localObject1 == null)
        {
          k = 0;
          label45:
          if (localObject2 != null) {
            break label76;
          }
        }
        label76:
        for (int m = 0;; m = localObject2.hashCode())
        {
          j -= 1;
          i += (m ^ k);
          break;
          k = localObject1.hashCode();
          break label45;
        }
      }
      return i;
    }
    
    public final boolean isEmpty()
    {
      return a() == 0;
    }
    
    public final Iterator<Map.Entry<K, V>> iterator()
    {
      return new h.d(h.this);
    }
    
    public final boolean remove(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final int size()
    {
      return a();
    }
    
    public final Object[] toArray()
    {
      throw new UnsupportedOperationException();
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      throw new UnsupportedOperationException();
    }
  }
  
  final class c
    implements Set<K>
  {
    c() {}
    
    public final boolean add(K paramK)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends K> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      c();
    }
    
    public final boolean contains(Object paramObject)
    {
      return a(paramObject) >= 0;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      Map localMap = b();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!localMap.containsKey(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean equals(Object paramObject)
    {
      return h.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      int i = a() - 1;
      int j = 0;
      if (i >= 0)
      {
        Object localObject = a(i, 0);
        if (localObject == null) {}
        for (int k = 0;; k = localObject.hashCode())
        {
          j += k;
          i -= 1;
          break;
        }
      }
      return j;
    }
    
    public final boolean isEmpty()
    {
      return a() == 0;
    }
    
    public final Iterator<K> iterator()
    {
      return new h.a(h.this, 0);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = a(paramObject);
      if (i >= 0)
      {
        a(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      Map localMap = b();
      int i = localMap.size();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        localMap.remove(paramCollection.next());
      }
      return i != localMap.size();
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      return h.a(b(), paramCollection);
    }
    
    public final int size()
    {
      return a();
    }
    
    public final Object[] toArray()
    {
      return b(0);
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return a(paramArrayOfT, 0);
    }
  }
  
  final class d
    implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
  {
    int a = a() - 1;
    int b = -1;
    boolean c = false;
    
    d() {}
    
    public final boolean equals(Object paramObject)
    {
      if (!c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      if (!(paramObject instanceof Map.Entry)) {}
      do
      {
        return false;
        paramObject = (Map.Entry)paramObject;
      } while ((!c.a(((Map.Entry)paramObject).getKey(), a(b, 0))) || (!c.a(((Map.Entry)paramObject).getValue(), a(b, 1))));
      return true;
    }
    
    public final K getKey()
    {
      if (!c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (K)a(b, 0);
    }
    
    public final V getValue()
    {
      if (!c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (V)a(b, 1);
    }
    
    public final boolean hasNext()
    {
      return b < a;
    }
    
    public final int hashCode()
    {
      int j = 0;
      if (!c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      Object localObject1 = a(b, 0);
      Object localObject2 = a(b, 1);
      int i;
      if (localObject1 == null)
      {
        i = 0;
        if (localObject2 != null) {
          break label69;
        }
      }
      for (;;)
      {
        return j ^ i;
        i = localObject1.hashCode();
        break;
        label69:
        j = localObject2.hashCode();
      }
    }
    
    public final void remove()
    {
      if (!c) {
        throw new IllegalStateException();
      }
      a(b);
      b -= 1;
      a -= 1;
      c = false;
    }
    
    public final V setValue(V paramV)
    {
      if (!c) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (V)a(b, paramV);
    }
    
    public final String toString()
    {
      return getKey() + "=" + getValue();
    }
  }
  
  final class e
    implements Collection<V>
  {
    e() {}
    
    public final boolean add(V paramV)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends V> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      c();
    }
    
    public final boolean contains(Object paramObject)
    {
      return b(paramObject) >= 0;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean isEmpty()
    {
      return a() == 0;
    }
    
    public final Iterator<V> iterator()
    {
      return new h.a(h.this, 1);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = b(paramObject);
      if (i >= 0)
      {
        a(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      int i = 0;
      int j = a();
      boolean bool = false;
      while (i < j)
      {
        int m = i;
        int k = j;
        if (paramCollection.contains(a(i, 1)))
        {
          a(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        }
        i = m + 1;
        j = k;
      }
      return bool;
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      int i = 0;
      int j = a();
      boolean bool = false;
      while (i < j)
      {
        int m = i;
        int k = j;
        if (!paramCollection.contains(a(i, 1)))
        {
          a(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        }
        i = m + 1;
        j = k;
      }
      return bool;
    }
    
    public final int size()
    {
      return a();
    }
    
    public final Object[] toArray()
    {
      return b(1);
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return a(paramArrayOfT, 1);
    }
  }
}


/* Location:              android/support/v4/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */