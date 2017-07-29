package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E>
  implements Collection<E>, Set<E>
{
  static Object[] a;
  static int b;
  static Object[] c;
  static int d;
  private static final int[] j = new int[0];
  private static final Object[] k = new Object[0];
  final boolean e = false;
  int[] f = j;
  public Object[] g = k;
  int h = 0;
  h<E, E> i;
  
  public b()
  {
    this((byte)0);
  }
  
  private b(byte paramByte) {}
  
  private int a()
  {
    int i2 = h;
    int m;
    if (i2 == 0) {
      m = -1;
    }
    int n;
    do
    {
      do
      {
        return m;
        n = c.a(f, i2, 0);
        m = n;
      } while (n < 0);
      m = n;
    } while (g[n] == null);
    int i1 = n + 1;
    while ((i1 < i2) && (f[i1] == 0))
    {
      if (g[i1] == null) {
        return i1;
      }
      i1 += 1;
    }
    n -= 1;
    for (;;)
    {
      if ((n < 0) || (f[n] != 0)) {
        break label115;
      }
      m = n;
      if (g[n] == null) {
        break;
      }
      n -= 1;
    }
    label115:
    return i1 ^ 0xFFFFFFFF;
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int i2 = h;
    int m;
    if (i2 == 0) {
      m = -1;
    }
    int n;
    do
    {
      do
      {
        return m;
        n = c.a(f, i2, paramInt);
        m = n;
      } while (n < 0);
      m = n;
    } while (paramObject.equals(g[n]));
    int i1 = n + 1;
    while ((i1 < i2) && (f[i1] == paramInt))
    {
      if (paramObject.equals(g[i1])) {
        return i1;
      }
      i1 += 1;
    }
    n -= 1;
    for (;;)
    {
      if ((n < 0) || (f[n] != paramInt)) {
        break label150;
      }
      m = n;
      if (paramObject.equals(g[n])) {
        break;
      }
      n -= 1;
    }
    label150:
    return i1 ^ 0xFFFFFFFF;
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (d < 10)
        {
          paramArrayOfObject[0] = c;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt -= 1;
          break label113;
          c = paramArrayOfObject;
          d += 1;
        }
        return;
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {}
    for (;;)
    {
      try
      {
        if (b < 10)
        {
          paramArrayOfObject[0] = a;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt -= 1;
          break label130;
          a = paramArrayOfObject;
          b += 1;
        }
        return;
      }
      finally {}
      label113:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
      break;
      return;
      label130:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
    }
  }
  
  private void b(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (c != null)
        {
          Object[] arrayOfObject1 = c;
          g = arrayOfObject1;
          c = (Object[])arrayOfObject1[0];
          f = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          d -= 1;
          return;
        }
        f = new int[paramInt];
        g = new Object[paramInt];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (a != null)
          {
            Object[] arrayOfObject2 = a;
            g = arrayOfObject2;
            a = (Object[])arrayOfObject2[0];
            f = ((int[])arrayOfObject2[1]);
            arrayOfObject2[1] = null;
            arrayOfObject2[0] = null;
            b -= 1;
            return;
          }
        }
        finally {}
      }
    }
  }
  
  public final int a(Object paramObject)
  {
    if (paramObject == null) {
      return a();
    }
    if (e) {}
    for (int m = System.identityHashCode(paramObject);; m = paramObject.hashCode()) {
      return a(paramObject, m);
    }
  }
  
  public final E a(int paramInt)
  {
    int m = 8;
    Object localObject = g[paramInt];
    if (h <= 1)
    {
      a(f, g, h);
      f = j;
      g = k;
      h = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return (E)localObject;
      if ((f.length <= 8) || (h >= f.length / 3)) {
        break;
      }
      if (h > 8) {
        m = h + (h >> 1);
      }
      arrayOfInt = f;
      arrayOfObject = g;
      b(m);
      h -= 1;
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, f, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, g, 0, paramInt);
      }
    } while (paramInt >= h);
    System.arraycopy(arrayOfInt, paramInt + 1, f, paramInt, h - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1, g, paramInt, h - paramInt);
    return (E)localObject;
    h -= 1;
    if (paramInt < h)
    {
      System.arraycopy(f, paramInt + 1, f, paramInt, h - paramInt);
      System.arraycopy(g, paramInt + 1, g, paramInt, h - paramInt);
    }
    g[h] = null;
    return (E)localObject;
  }
  
  public final boolean add(E paramE)
  {
    int i1;
    int n;
    int m;
    if (paramE == null)
    {
      i1 = a();
      n = 0;
      if (i1 >= 0) {
        return false;
      }
    }
    else
    {
      if (e) {}
      for (m = System.identityHashCode(paramE);; m = paramE.hashCode())
      {
        i1 = a(paramE, m);
        n = m;
        break;
      }
    }
    i1 ^= 0xFFFFFFFF;
    if (h >= f.length)
    {
      if (h < 8) {
        break label240;
      }
      m = h + (h >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = f;
      Object[] arrayOfObject = g;
      b(m);
      if (f.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, f, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, g, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, h);
      if (i1 < h)
      {
        System.arraycopy(f, i1, f, i1 + 1, h - i1);
        System.arraycopy(g, i1, g, i1 + 1, h - i1);
      }
      f[i1] = n;
      g[i1] = paramE;
      h += 1;
      return true;
      label240:
      if (h >= 4) {
        m = 8;
      } else {
        m = 4;
      }
    }
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    boolean bool = false;
    int m = h + paramCollection.size();
    if (f.length < m)
    {
      int[] arrayOfInt = f;
      Object[] arrayOfObject = g;
      b(m);
      if (h > 0)
      {
        System.arraycopy(arrayOfInt, 0, f, 0, h);
        System.arraycopy(arrayOfObject, 0, g, 0, h);
      }
      a(arrayOfInt, arrayOfObject, h);
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      bool |= add(paramCollection.next());
    }
    return bool;
  }
  
  public final void clear()
  {
    if (h != 0)
    {
      a(f, g, h);
      f = j;
      g = k;
      h = 0;
    }
  }
  
  public final boolean contains(Object paramObject)
  {
    return a(paramObject) >= 0;
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
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Set))
      {
        paramObject = (Set)paramObject;
        if (size() != ((Set)paramObject).size()) {
          return false;
        }
        int m = 0;
        try
        {
          while (m < h)
          {
            boolean bool = ((Set)paramObject).contains(g[m]);
            if (!bool) {
              return false;
            }
            m += 1;
          }
          return false;
        }
        catch (NullPointerException paramObject)
        {
          return false;
        }
        catch (ClassCastException paramObject)
        {
          return false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int m = 0;
    int[] arrayOfInt = f;
    int i1 = h;
    int n = 0;
    while (m < i1)
    {
      n += arrayOfInt[m];
      m += 1;
    }
    return n;
  }
  
  public final boolean isEmpty()
  {
    return h <= 0;
  }
  
  public final Iterator<E> iterator()
  {
    if (i == null) {
      i = new h()
      {
        protected final int a()
        {
          return h;
        }
        
        protected final int a(Object paramAnonymousObject)
        {
          return b.this.a(paramAnonymousObject);
        }
        
        protected final Object a(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return g[paramAnonymousInt1];
        }
        
        protected final E a(int paramAnonymousInt, E paramAnonymousE)
        {
          throw new UnsupportedOperationException("not a map");
        }
        
        protected final void a(int paramAnonymousInt)
        {
          a(paramAnonymousInt);
        }
        
        protected final void a(E paramAnonymousE1, E paramAnonymousE2)
        {
          add(paramAnonymousE1);
        }
        
        protected final int b(Object paramAnonymousObject)
        {
          return b.this.a(paramAnonymousObject);
        }
        
        protected final Map<E, E> b()
        {
          throw new UnsupportedOperationException("not a map");
        }
        
        protected final void c()
        {
          clear();
        }
      };
    }
    return i.d().iterator();
  }
  
  public final boolean remove(Object paramObject)
  {
    int m = a(paramObject);
    if (m >= 0)
    {
      a(m);
      return true;
    }
    return false;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    boolean bool = false;
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      bool |= remove(paramCollection.next());
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    int m = h;
    boolean bool = false;
    m -= 1;
    while (m >= 0)
    {
      if (!paramCollection.contains(g[m]))
      {
        a(m);
        bool = true;
      }
      m -= 1;
    }
    return bool;
  }
  
  public final int size()
  {
    return h;
  }
  
  public final Object[] toArray()
  {
    Object[] arrayOfObject = new Object[h];
    System.arraycopy(g, 0, arrayOfObject, 0, h);
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length < h) {
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), h);
    }
    for (;;)
    {
      System.arraycopy(g, 0, paramArrayOfT, 0, h);
      if (paramArrayOfT.length > h) {
        paramArrayOfT[h] = null;
      }
      return paramArrayOfT;
    }
  }
  
  public final String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(h * 14);
    localStringBuilder.append('{');
    int m = 0;
    if (m < h)
    {
      if (m > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = g[m];
      if (localObject != this) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        m += 1;
        break;
        localStringBuilder.append("(this Set)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              android/support/v4/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */