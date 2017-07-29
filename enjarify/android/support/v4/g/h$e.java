package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;

final class h$e
  implements Collection
{
  h$e(h paramh) {}
  
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
    int i = localh.b(paramObject);
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
    Iterator localIterator = paramCollection.iterator();
    boolean bool1;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = localIterator.next();
      bool1 = contains(localObject);
    } while (bool1);
    boolean bool2 = false;
    localIterator = null;
    for (;;)
    {
      return bool2;
      bool2 = true;
    }
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
    locala.<init>(localh, 1);
    return locala;
  }
  
  public final boolean remove(Object paramObject)
  {
    h localh1 = a;
    int i = localh1.b(paramObject);
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
    int i = 1;
    int j = 0;
    int k = a.a();
    boolean bool1 = false;
    h localh = null;
    while (j < k)
    {
      Object localObject = a.a(j, i);
      boolean bool2 = paramCollection.contains(localObject);
      if (bool2)
      {
        localh = a;
        localh.a(j);
        j += -1;
        k += -1;
        bool1 = i;
      }
      j += 1;
    }
    return bool1;
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    int i = 1;
    int j = 0;
    int k = a.a();
    boolean bool1 = false;
    h localh = null;
    while (j < k)
    {
      Object localObject = a.a(j, i);
      boolean bool2 = paramCollection.contains(localObject);
      if (!bool2)
      {
        localh = a;
        localh.a(j);
        j += -1;
        k += -1;
        bool1 = i;
      }
      j += 1;
    }
    return bool1;
  }
  
  public final int size()
  {
    return a.a();
  }
  
  public final Object[] toArray()
  {
    return a.b(1);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    return a.a(paramArrayOfObject, 1);
  }
}


/* Location:              android/support/v4/g/h$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */