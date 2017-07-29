package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class h$c
  implements Set
{
  h$c(h paramh) {}
  
  public final boolean add(Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public final void clear()
  {
    a.c();
  }
  
  public final boolean contains(Object paramObject)
  {
    h localh = a;
    int i = localh.a(paramObject);
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localh = null;
    }
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    Map localMap = a.b();
    Iterator localIterator = paramCollection.iterator();
    boolean bool1;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = localIterator.next();
      bool1 = localMap.containsKey(localObject);
    } while (bool1);
    boolean bool2 = false;
    localMap = null;
    for (;;)
    {
      return bool2;
      bool2 = true;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return h.a(this, paramObject);
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = ((h)localObject).a() + -1;
    int j = i;
    int k = 0;
    if (j >= 0)
    {
      localObject = a.a(j, 0);
      if (localObject == null)
      {
        i = 0;
        localObject = null;
      }
      for (;;)
      {
        k += i;
        i = j + -1;
        j = i;
        break;
        i = localObject.hashCode();
      }
    }
    return k;
  }
  
  public final boolean isEmpty()
  {
    h localh = a;
    int i = localh.a();
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localh = null;
    }
  }
  
  public final Iterator iterator()
  {
    h.a locala = new android/support/v4/g/h$a;
    h localh = a;
    locala.<init>(localh, 0);
    return locala;
  }
  
  public final boolean remove(Object paramObject)
  {
    h localh1 = a;
    int i = localh1.a(paramObject);
    if (i >= 0)
    {
      h localh2 = a;
      localh2.a(i);
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localh1 = null;
    }
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    Map localMap = a.b();
    int i = localMap.size();
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      localMap.remove(localObject);
    }
    int j = localMap.size();
    if (i != j) {
      j = 1;
    }
    for (;;)
    {
      return j;
      int k = 0;
      localMap = null;
    }
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    return h.a(a.b(), paramCollection);
  }
  
  public final int size()
  {
    return a.a();
  }
  
  public final Object[] toArray()
  {
    return a.b(0);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    return a.a(paramArrayOfObject, 0);
  }
}


/* Location:              android/support/v4/g/h$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */