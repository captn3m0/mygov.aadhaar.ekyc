package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements Collection, Set
{
  static Object[] a;
  static int b;
  static Object[] c;
  static int d;
  private static final int[] j = new int[0];
  private static final Object[] k = new Object[0];
  final boolean e = false;
  int[] f;
  public Object[] g;
  int h;
  h i;
  
  public b()
  {
    this((byte)0);
  }
  
  private b(byte paramByte)
  {
    Object localObject = j;
    f = ((int[])localObject);
    localObject = k;
    g = ((Object[])localObject);
    h = 0;
  }
  
  private int a()
  {
    int m = h;
    int n;
    if (m == 0) {
      n = -1;
    }
    for (;;)
    {
      return n;
      int[] arrayOfInt = f;
      int i1 = 0;
      Object localObject1 = null;
      n = c.a(arrayOfInt, m, 0);
      if (n >= 0)
      {
        localObject1 = g[n];
        if (localObject1 != null)
        {
          i1 = n + 1;
          for (;;)
          {
            if (i1 >= m) {
              break label106;
            }
            Object localObject2 = f;
            int i2 = localObject2[i1];
            if (i2 != 0) {
              break label106;
            }
            localObject2 = g[i1];
            if (localObject2 == null)
            {
              n = i1;
              break;
            }
            i1 += 1;
          }
          label106:
          n += -1;
          for (;;)
          {
            if (n < 0) {
              break label149;
            }
            Object localObject3 = f;
            m = localObject3[n];
            if (m != 0) {
              break label149;
            }
            localObject3 = g[n];
            if (localObject3 == null) {
              break;
            }
            n += -1;
          }
          label149:
          n = i1 ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int m = h;
    int n;
    if (m == 0) {
      n = -1;
    }
    for (;;)
    {
      return n;
      int[] arrayOfInt = f;
      n = c.a(arrayOfInt, m, paramInt);
      if (n >= 0)
      {
        Object localObject1 = g[n];
        boolean bool2 = paramObject.equals(localObject1);
        if (!bool2)
        {
          int i1 = n + 1;
          for (;;)
          {
            if (i1 >= m) {
              break label126;
            }
            Object localObject2 = f;
            int i2 = localObject2[i1];
            if (i2 != paramInt) {
              break label126;
            }
            localObject2 = g[i1];
            boolean bool3 = paramObject.equals(localObject2);
            if (bool3)
            {
              n = i1;
              break;
            }
            i1 += 1;
          }
          label126:
          n += -1;
          for (;;)
          {
            if (n < 0) {
              break label183;
            }
            Object localObject3 = f;
            m = localObject3[n];
            if (m != paramInt) {
              break label183;
            }
            localObject3 = g[n];
            boolean bool1 = paramObject.equals(localObject3);
            if (bool1) {
              break;
            }
            n += -1;
          }
          label183:
          n = i1 ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    int m = 10;
    int n = 2;
    int i1 = paramArrayOfInt.length;
    int i2 = 8;
    if (i1 == i2) {}
    for (;;)
    {
      Object[] arrayOfObject;
      synchronized (b.class)
      {
        i1 = d;
        if (i1 < m)
        {
          i1 = 0;
          Object localObject1 = null;
          arrayOfObject = c;
          paramArrayOfObject[0] = arrayOfObject;
          i1 = 1;
          paramArrayOfObject[i1] = paramArrayOfInt;
          i1 = paramInt + -1;
          if (i1 >= n)
          {
            m = 0;
            arrayOfObject = null;
            paramArrayOfObject[i1] = null;
            i1 += -1;
            continue;
          }
          c = paramArrayOfObject;
          i1 = d + 1;
          d = i1;
        }
        return;
      }
      i1 = paramArrayOfInt.length;
      i2 = 4;
      if (i1 != i2) {
        continue;
      }
      synchronized (b.class)
      {
        i1 = b;
        if (i1 < m)
        {
          i1 = 0;
          Object localObject3 = null;
          arrayOfObject = a;
          paramArrayOfObject[0] = arrayOfObject;
          i1 = 1;
          paramArrayOfObject[i1] = paramArrayOfInt;
          i1 = paramInt + -1;
          while (i1 >= n)
          {
            m = 0;
            arrayOfObject = null;
            paramArrayOfObject[i1] = null;
            i1 += -1;
          }
          a = paramArrayOfObject;
          i1 = b + 1;
          b = i1;
        }
      }
    }
  }
  
  private void b(int paramInt)
  {
    int m = 8;
    if (paramInt == m) {}
    for (;;)
    {
      Object[] arrayOfObject;
      int n;
      synchronized (b.class)
      {
        Object localObject1 = c;
        if (localObject1 != null)
        {
          arrayOfObject = c;
          g = arrayOfObject;
          m = 0;
          localObject1 = null;
          localObject1 = arrayOfObject[0];
          localObject1 = (Object[])localObject1;
          localObject1 = (Object[])localObject1;
          c = (Object[])localObject1;
          m = 1;
          localObject1 = arrayOfObject[m];
          localObject1 = (int[])localObject1;
          localObject1 = (int[])localObject1;
          f = ((int[])localObject1);
          m = 0;
          localObject1 = null;
          n = 1;
          arrayOfObject[n] = null;
          arrayOfObject[0] = null;
          m = d + -1;
          d = m;
          return;
        }
        localObject1 = new int[paramInt];
        f = ((int[])localObject1);
        localObject1 = new Object[paramInt];
        g = ((Object[])localObject1);
      }
      m = 4;
      if (paramInt == m) {
        synchronized (b.class)
        {
          Object localObject3 = a;
          if (localObject3 != null)
          {
            arrayOfObject = a;
            g = arrayOfObject;
            m = 0;
            localObject3 = null;
            localObject3 = arrayOfObject[0];
            localObject3 = (Object[])localObject3;
            localObject3 = (Object[])localObject3;
            a = (Object[])localObject3;
            m = 1;
            localObject3 = arrayOfObject[m];
            localObject3 = (int[])localObject3;
            localObject3 = (int[])localObject3;
            f = ((int[])localObject3);
            m = 0;
            localObject3 = null;
            n = 1;
            arrayOfObject[n] = null;
            arrayOfObject[0] = null;
            m = b + -1;
            b = m;
          }
        }
      }
    }
  }
  
  public final int a(Object paramObject)
  {
    if (paramObject == null)
    {
      int m = a();
      return m;
    }
    boolean bool = e;
    if (bool) {}
    for (int n = System.identityHashCode(paramObject);; n = paramObject.hashCode())
    {
      n = a(paramObject, n);
      break;
    }
  }
  
  public final Object a(int paramInt)
  {
    int m = 8;
    int n = 0;
    int[] arrayOfInt = null;
    Object localObject1 = g[paramInt];
    int i1 = h;
    int i2 = 1;
    Object localObject2;
    Object localObject3;
    if (i1 <= i2)
    {
      localObject2 = f;
      localObject3 = g;
      i2 = h;
      a((int[])localObject2, (Object[])localObject3, i2);
      localObject2 = j;
      f = ((int[])localObject2);
      localObject2 = k;
      g = ((Object[])localObject2);
      h = 0;
    }
    for (;;)
    {
      return localObject1;
      localObject3 = f;
      i1 = localObject3.length;
      if (i1 > m)
      {
        i1 = h;
        localObject4 = f;
        i2 = localObject4.length / 3;
        if (i1 < i2)
        {
          i1 = h;
          if (i1 > m)
          {
            m = h;
            i1 = h >> 1;
            m += i1;
          }
          localObject3 = f;
          localObject4 = g;
          b(m);
          m = h + -1;
          h = m;
          if (paramInt > 0)
          {
            localObject2 = f;
            System.arraycopy(localObject3, 0, localObject2, 0, paramInt);
            localObject2 = g;
            System.arraycopy(localObject4, 0, localObject2, 0, paramInt);
          }
          m = h;
          if (paramInt >= m) {
            continue;
          }
          m = paramInt + 1;
          arrayOfInt = f;
          int i3 = h - paramInt;
          System.arraycopy(localObject3, m, arrayOfInt, paramInt, i3);
          m = paramInt + 1;
          localObject3 = g;
          n = h - paramInt;
          System.arraycopy(localObject4, m, localObject3, paramInt, n);
          continue;
        }
      }
      m = h + -1;
      h = m;
      m = h;
      if (paramInt < m)
      {
        localObject2 = f;
        i1 = paramInt + 1;
        localObject4 = f;
        n = h - paramInt;
        System.arraycopy(localObject2, i1, localObject4, paramInt, n);
        localObject2 = g;
        i1 = paramInt + 1;
        localObject4 = g;
        n = h - paramInt;
        System.arraycopy(localObject2, i1, localObject4, paramInt, n);
      }
      localObject2 = g;
      i1 = h;
      i2 = 0;
      Object localObject4 = null;
      localObject2[i1] = null;
    }
  }
  
  public final boolean add(Object paramObject)
  {
    int m = 8;
    int n = 4;
    int i1 = 0;
    int i4;
    Object localObject1;
    if (paramObject == null)
    {
      int i2 = a();
      i4 = 0;
      if (i2 >= 0)
      {
        i2 = 0;
        localObject1 = null;
        return i2;
      }
    }
    else
    {
      boolean bool = e;
      if (bool) {}
      for (i3 = System.identityHashCode(paramObject);; i3 = paramObject.hashCode())
      {
        int i5 = a(paramObject, i3);
        i4 = i3;
        i3 = i5;
        break;
      }
    }
    int i6 = i3 ^ 0xFFFFFFFF;
    int i3 = h;
    int[] arrayOfInt = f;
    int i7 = arrayOfInt.length;
    if (i3 >= i7)
    {
      i3 = h;
      if (i3 < m) {
        break label365;
      }
      i3 = h;
      m = h >> 1;
      i3 += m;
    }
    for (;;)
    {
      Object localObject2 = f;
      Object[] arrayOfObject = g;
      b(i3);
      localObject1 = f;
      i3 = localObject1.length;
      if (i3 > 0)
      {
        localObject1 = f;
        i7 = localObject2.length;
        System.arraycopy(localObject2, 0, localObject1, 0, i7);
        localObject1 = g;
        i7 = arrayOfObject.length;
        System.arraycopy(arrayOfObject, 0, localObject1, 0, i7);
      }
      i3 = h;
      a((int[])localObject2, arrayOfObject, i3);
      i3 = h;
      if (i6 < i3)
      {
        localObject1 = f;
        localObject2 = f;
        n = i6 + 1;
        i1 = h - i6;
        System.arraycopy(localObject1, i6, localObject2, n, i1);
        localObject1 = g;
        localObject2 = g;
        n = i6 + 1;
        i1 = h - i6;
        System.arraycopy(localObject1, i6, localObject2, n, i1);
      }
      f[i6] = i4;
      localObject1 = g;
      localObject1[i6] = paramObject;
      i3 = h + 1;
      h = i3;
      i3 = 1;
      break;
      label365:
      i3 = h;
      if (i3 >= n) {
        i3 = m;
      } else {
        i3 = n;
      }
    }
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    boolean bool1 = false;
    int m = h;
    int n = paramCollection.size();
    m += n;
    Object localObject1 = f;
    n = localObject1.length;
    if (n < m)
    {
      localObject1 = f;
      Object[] arrayOfObject = g;
      b(m);
      m = h;
      if (m > 0)
      {
        localObject2 = f;
        int i1 = h;
        System.arraycopy(localObject1, 0, localObject2, 0, i1);
        localObject2 = g;
        i1 = h;
        System.arraycopy(arrayOfObject, 0, localObject2, 0, i1);
      }
      m = h;
      a((int[])localObject1, arrayOfObject, m);
    }
    Object localObject2 = paramCollection.iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = ((Iterator)localObject2).next();
      bool2 = add(localObject1);
      bool1 |= bool2;
    }
    return bool1;
  }
  
  public final void clear()
  {
    int m = h;
    if (m != 0)
    {
      Object localObject = f;
      Object[] arrayOfObject = g;
      int n = h;
      a((int[])localObject, arrayOfObject, n);
      localObject = j;
      f = ((int[])localObject);
      localObject = k;
      g = ((Object[])localObject);
      m = 0;
      localObject = null;
      h = 0;
    }
  }
  
  public final boolean contains(Object paramObject)
  {
    int m = a(paramObject);
    if (m >= 0) {}
    int n;
    for (m = 1;; n = 0) {
      return m;
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
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Set;
      if (bool2)
      {
        paramObject = (Set)paramObject;
        int m = size();
        int n = ((Set)paramObject).size();
        if (m != n)
        {
          bool1 = false;
        }
        else
        {
          m = 0;
          try
          {
            for (;;)
            {
              n = h;
              if (m >= n) {
                break;
              }
              Object localObject = g;
              localObject = localObject[m];
              boolean bool3 = ((Set)paramObject).contains(localObject);
              if (!bool3)
              {
                bool1 = false;
                break;
              }
              m += 1;
            }
          }
          catch (NullPointerException localNullPointerException)
          {
            bool1 = false;
          }
          catch (ClassCastException localClassCastException)
          {
            bool1 = false;
          }
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public final int hashCode()
  {
    int m = 0;
    int[] arrayOfInt = f;
    int n = h;
    int i1 = 0;
    while (m < n)
    {
      int i2 = arrayOfInt[m];
      i1 += i2;
      m += 1;
    }
    return i1;
  }
  
  public final boolean isEmpty()
  {
    int m = h;
    if (m <= 0) {}
    int n;
    for (m = 1;; n = 0) {
      return m;
    }
  }
  
  public final Iterator iterator()
  {
    Object localObject = i;
    if (localObject == null)
    {
      localObject = new android/support/v4/g/b$1;
      ((b.1)localObject).<init>(this);
      i = ((h)localObject);
    }
    return i.d().iterator();
  }
  
  public final boolean remove(Object paramObject)
  {
    int m = a(paramObject);
    if (m >= 0) {
      a(m);
    }
    int n;
    for (m = 1;; n = 0) {
      return m;
    }
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    boolean bool1 = false;
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      Object localObject = localIterator.next();
      bool2 = remove(localObject);
      bool1 |= bool2;
    }
    return bool1;
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    int m = h + -1;
    boolean bool1 = false;
    int n = m;
    while (n >= 0)
    {
      Object localObject = g[n];
      boolean bool2 = paramCollection.contains(localObject);
      if (!bool2)
      {
        a(n);
        bool1 = true;
      }
      n += -1;
    }
    return bool1;
  }
  
  public final int size()
  {
    return h;
  }
  
  public final Object[] toArray()
  {
    Object[] arrayOfObject1 = new Object[h];
    Object[] arrayOfObject2 = g;
    int m = h;
    System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, m);
    return arrayOfObject1;
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    int m = paramArrayOfObject.length;
    int n = h;
    if (m < n)
    {
      localObject = paramArrayOfObject.getClass().getComponentType();
      n = h;
    }
    for (Object localObject = (Object[])Array.newInstance((Class)localObject, n);; localObject = paramArrayOfObject)
    {
      Object[] arrayOfObject = g;
      int i1 = h;
      System.arraycopy(arrayOfObject, 0, localObject, 0, i1);
      n = localObject.length;
      i1 = h;
      if (n > i1)
      {
        n = h;
        i1 = 0;
        localObject[n] = null;
      }
      return (Object[])localObject;
    }
  }
  
  public final String toString()
  {
    boolean bool = isEmpty();
    if (bool) {}
    StringBuilder localStringBuilder;
    for (String str = "{}";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      int m = h * 14;
      localStringBuilder.<init>(m);
      localStringBuilder.append('{');
      m = 0;
      str = null;
      int n = h;
      if (m < n)
      {
        if (m > 0)
        {
          localObject = ", ";
          localStringBuilder.append((String)localObject);
        }
        Object localObject = g[m];
        if (localObject != this) {
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          m += 1;
          break;
          localObject = "(this Set)";
          localStringBuilder.append((String)localObject);
        }
      }
      m = 125;
      localStringBuilder.append(m);
    }
  }
}


/* Location:              android/support/v4/g/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */