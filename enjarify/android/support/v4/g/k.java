package android.support.v4.g;

import java.util.Map;

public class k
{
  static Object[] b;
  static int c;
  static Object[] d;
  static int e;
  public int[] f;
  public Object[] g;
  public int h;
  
  public k()
  {
    Object localObject = c.a;
    f = ((int[])localObject);
    localObject = c.c;
    g = ((Object[])localObject);
    h = 0;
  }
  
  public k(int paramInt)
  {
    if (paramInt == 0)
    {
      Object localObject = c.a;
      f = ((int[])localObject);
      localObject = c.c;
      g = ((Object[])localObject);
    }
    for (;;)
    {
      h = 0;
      return;
      e(paramInt);
    }
  }
  
  private int a()
  {
    int i = h;
    int j;
    if (i == 0) {
      j = -1;
    }
    for (;;)
    {
      return j;
      int[] arrayOfInt = f;
      int k = 0;
      Object localObject1 = null;
      j = c.a(arrayOfInt, i, 0);
      if (j >= 0)
      {
        localObject1 = g;
        int m = j << 1;
        localObject1 = localObject1[m];
        if (localObject1 != null)
        {
          k = j + 1;
          for (;;)
          {
            if (k >= i) {
              break label126;
            }
            Object localObject2 = f;
            m = localObject2[k];
            if (m != 0) {
              break label126;
            }
            localObject2 = g;
            int n = k << 1;
            localObject2 = localObject2[n];
            if (localObject2 == null)
            {
              j = k;
              break;
            }
            k += 1;
          }
          label126:
          j += -1;
          for (;;)
          {
            if (j < 0) {
              break label179;
            }
            Object localObject3 = f;
            i = localObject3[j];
            if (i != 0) {
              break label179;
            }
            localObject3 = g;
            m = j << 1;
            localObject3 = localObject3[m];
            if (localObject3 == null) {
              break;
            }
            j += -1;
          }
          label179:
          j = k ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int i = h;
    int j;
    if (i == 0) {
      j = -1;
    }
    for (;;)
    {
      return j;
      int[] arrayOfInt = f;
      j = c.a(arrayOfInt, i, paramInt);
      if (j >= 0)
      {
        Object localObject1 = g;
        int k = j << 1;
        localObject1 = localObject1[k];
        boolean bool3 = paramObject.equals(localObject1);
        if (!bool3)
        {
          int n = j + 1;
          for (;;)
          {
            if (n >= i) {
              break label146;
            }
            Object localObject2 = f;
            k = localObject2[n];
            if (k != paramInt) {
              break label146;
            }
            localObject2 = g;
            int i1 = n << 1;
            localObject2 = localObject2[i1];
            boolean bool2 = paramObject.equals(localObject2);
            if (bool2)
            {
              j = n;
              break;
            }
            n += 1;
          }
          label146:
          j += -1;
          for (;;)
          {
            if (j < 0) {
              break label213;
            }
            Object localObject3 = f;
            i = localObject3[j];
            if (i != paramInt) {
              break label213;
            }
            localObject3 = g;
            int m = j << 1;
            localObject3 = localObject3[m];
            boolean bool1 = paramObject.equals(localObject3);
            if (bool1) {
              break;
            }
            j += -1;
          }
          label213:
          j = n ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    int i = 10;
    int j = 2;
    int k = paramArrayOfInt.length;
    int m = 8;
    if (k == m) {}
    for (;;)
    {
      Object[] arrayOfObject;
      synchronized (a.class)
      {
        k = e;
        if (k < i)
        {
          k = 0;
          Object localObject1 = null;
          arrayOfObject = d;
          paramArrayOfObject[0] = arrayOfObject;
          k = 1;
          paramArrayOfObject[k] = paramArrayOfInt;
          k = (paramInt << 1) + -1;
          if (k >= j)
          {
            i = 0;
            arrayOfObject = null;
            paramArrayOfObject[k] = null;
            k += -1;
            continue;
          }
          d = paramArrayOfObject;
          k = e + 1;
          e = k;
        }
        return;
      }
      k = paramArrayOfInt.length;
      m = 4;
      if (k != m) {
        continue;
      }
      synchronized (a.class)
      {
        k = c;
        if (k < i)
        {
          k = 0;
          Object localObject3 = null;
          arrayOfObject = b;
          paramArrayOfObject[0] = arrayOfObject;
          k = 1;
          paramArrayOfObject[k] = paramArrayOfInt;
          k = (paramInt << 1) + -1;
          while (k >= j)
          {
            i = 0;
            arrayOfObject = null;
            paramArrayOfObject[k] = null;
            k += -1;
          }
          b = paramArrayOfObject;
          k = c + 1;
          c = k;
        }
      }
    }
  }
  
  private void e(int paramInt)
  {
    int i = 8;
    if (paramInt == i) {}
    for (;;)
    {
      Object[] arrayOfObject;
      int j;
      synchronized (a.class)
      {
        Object localObject1 = d;
        if (localObject1 != null)
        {
          arrayOfObject = d;
          g = arrayOfObject;
          i = 0;
          localObject1 = null;
          localObject1 = arrayOfObject[0];
          localObject1 = (Object[])localObject1;
          localObject1 = (Object[])localObject1;
          d = (Object[])localObject1;
          i = 1;
          localObject1 = arrayOfObject[i];
          localObject1 = (int[])localObject1;
          localObject1 = (int[])localObject1;
          f = ((int[])localObject1);
          i = 0;
          localObject1 = null;
          j = 1;
          arrayOfObject[j] = null;
          arrayOfObject[0] = null;
          i = e + -1;
          e = i;
          return;
        }
        localObject1 = new int[paramInt];
        f = ((int[])localObject1);
        i = paramInt << 1;
        localObject1 = new Object[i];
        g = ((Object[])localObject1);
      }
      i = 4;
      if (paramInt == i) {
        synchronized (a.class)
        {
          Object localObject3 = b;
          if (localObject3 != null)
          {
            arrayOfObject = b;
            g = arrayOfObject;
            i = 0;
            localObject3 = null;
            localObject3 = arrayOfObject[0];
            localObject3 = (Object[])localObject3;
            localObject3 = (Object[])localObject3;
            b = (Object[])localObject3;
            i = 1;
            localObject3 = arrayOfObject[i];
            localObject3 = (int[])localObject3;
            localObject3 = (int[])localObject3;
            f = ((int[])localObject3);
            i = 0;
            localObject3 = null;
            j = 1;
            arrayOfObject[j] = null;
            arrayOfObject[0] = null;
            i = c + -1;
            c = i;
          }
        }
      }
    }
  }
  
  public final int a(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = a();; i = a(paramObject, i))
    {
      return i;
      i = paramObject.hashCode();
    }
  }
  
  public final void a(int paramInt)
  {
    int[] arrayOfInt = f;
    int i = arrayOfInt.length;
    if (i < paramInt)
    {
      arrayOfInt = f;
      Object[] arrayOfObject = g;
      e(paramInt);
      int j = h;
      if (j > 0)
      {
        Object localObject = f;
        int k = h;
        System.arraycopy(arrayOfInt, 0, localObject, 0, k);
        localObject = g;
        k = h << 1;
        System.arraycopy(arrayOfObject, 0, localObject, 0, k);
      }
      j = h;
      a(arrayOfInt, arrayOfObject, j);
    }
  }
  
  final int b(Object paramObject)
  {
    int i = 1;
    int j = h * 2;
    Object[] arrayOfObject = g;
    Object localObject;
    if (paramObject == null)
    {
      if (i >= j) {
        break label83;
      }
      localObject = arrayOfObject[i];
      if (localObject == null) {
        i >>= 1;
      }
    }
    for (;;)
    {
      return i;
      i += 2;
      break;
      boolean bool;
      do
      {
        i += 2;
        if (i >= j) {
          break;
        }
        localObject = arrayOfObject[i];
        bool = paramObject.equals(localObject);
      } while (!bool);
      i >>= 1;
      continue;
      label83:
      i = -1;
    }
  }
  
  public final Object b(int paramInt)
  {
    Object[] arrayOfObject = g;
    int i = paramInt << 1;
    return arrayOfObject[i];
  }
  
  public final Object c(int paramInt)
  {
    Object[] arrayOfObject = g;
    int i = (paramInt << 1) + 1;
    return arrayOfObject[i];
  }
  
  public void clear()
  {
    int i = h;
    if (i != 0)
    {
      Object localObject = f;
      Object[] arrayOfObject = g;
      int j = h;
      a((int[])localObject, arrayOfObject, j);
      localObject = c.a;
      f = ((int[])localObject);
      localObject = c.c;
      g = ((Object[])localObject);
      i = 0;
      localObject = null;
      h = 0;
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean containsValue(Object paramObject)
  {
    int i = b(paramObject);
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final Object d(int paramInt)
  {
    int i = 8;
    int j = 0;
    Object localObject1 = g;
    int k = (paramInt << 1) + 1;
    localObject1 = localObject1[k];
    k = h;
    int m = 1;
    Object localObject2;
    Object localObject3;
    if (k <= m)
    {
      localObject2 = f;
      localObject3 = g;
      m = h;
      a((int[])localObject2, (Object[])localObject3, m);
      localObject2 = c.a;
      f = ((int[])localObject2);
      localObject2 = c.c;
      g = ((Object[])localObject2);
      h = 0;
    }
    for (;;)
    {
      return localObject1;
      localObject3 = f;
      k = localObject3.length;
      Object localObject4;
      int n;
      if (k > i)
      {
        k = h;
        localObject4 = f;
        m = localObject4.length / 3;
        if (k < m)
        {
          k = h;
          if (k > i)
          {
            i = h;
            k = h >> 1;
            i += k;
          }
          localObject3 = f;
          localObject4 = g;
          e(i);
          i = h + -1;
          h = i;
          if (paramInt > 0)
          {
            localObject2 = f;
            System.arraycopy(localObject3, 0, localObject2, 0, paramInt);
            localObject2 = g;
            n = paramInt << 1;
            System.arraycopy(localObject4, 0, localObject2, 0, n);
          }
          i = h;
          if (paramInt >= i) {
            continue;
          }
          i = paramInt + 1;
          int[] arrayOfInt = f;
          j = h - paramInt;
          System.arraycopy(localObject3, i, arrayOfInt, paramInt, j);
          i = paramInt + 1 << 1;
          localObject3 = g;
          n = paramInt << 1;
          j = h - paramInt << 1;
          System.arraycopy(localObject4, i, localObject3, n, j);
          continue;
        }
      }
      i = h + -1;
      h = i;
      i = h;
      if (paramInt < i)
      {
        localObject2 = f;
        k = paramInt + 1;
        localObject4 = f;
        n = h - paramInt;
        System.arraycopy(localObject2, k, localObject4, paramInt, n);
        localObject2 = g;
        k = paramInt + 1 << 1;
        localObject4 = g;
        n = paramInt << 1;
        j = h - paramInt << 1;
        System.arraycopy(localObject2, k, localObject4, n, j);
      }
      localObject2 = g;
      k = h << 1;
      localObject2[k] = null;
      localObject2 = g;
      k = (h << 1) + 1;
      localObject2[k] = null;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof k;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (bool2)
      {
        paramObject = (k)paramObject;
        int i = size();
        int k = ((k)paramObject).size();
        if (i != k)
        {
          bool1 = false;
        }
        else
        {
          i = 0;
          try
          {
            for (;;)
            {
              k = h;
              if (i >= k) {
                break;
              }
              localObject1 = b(i);
              localObject2 = c(i);
              localObject3 = ((k)paramObject).get(localObject1);
              if (localObject2 == null)
              {
                if (localObject3 == null)
                {
                  bool4 = ((k)paramObject).containsKey(localObject1);
                  if (bool4) {
                    break label128;
                  }
                }
                bool1 = false;
                break;
              }
              boolean bool4 = localObject2.equals(localObject3);
              if (!bool4)
              {
                bool1 = false;
                break;
              }
              label128:
              i += 1;
            }
          }
          catch (NullPointerException localNullPointerException1)
          {
            bool1 = false;
          }
          catch (ClassCastException localClassCastException1)
          {
            bool1 = false;
          }
        }
      }
      else
      {
        boolean bool3 = paramObject instanceof Map;
        if (bool3)
        {
          paramObject = (Map)paramObject;
          int j = size();
          int m = ((Map)paramObject).size();
          if (j != m)
          {
            bool1 = false;
          }
          else
          {
            j = 0;
            try
            {
              for (;;)
              {
                m = h;
                if (j >= m) {
                  break;
                }
                localObject1 = b(j);
                localObject2 = c(j);
                localObject3 = ((Map)paramObject).get(localObject1);
                if (localObject2 == null)
                {
                  if (localObject3 == null)
                  {
                    bool5 = ((Map)paramObject).containsKey(localObject1);
                    if (bool5) {
                      break label272;
                    }
                  }
                  bool1 = false;
                  break;
                }
                boolean bool5 = localObject2.equals(localObject3);
                if (!bool5)
                {
                  bool1 = false;
                  break;
                }
                label272:
                j += 1;
              }
            }
            catch (NullPointerException localNullPointerException2)
            {
              bool1 = false;
            }
            catch (ClassCastException localClassCastException2)
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
  }
  
  public Object get(Object paramObject)
  {
    int i = a(paramObject);
    Object[] arrayOfObject;
    if (i >= 0)
    {
      arrayOfObject = g;
      i = (i << 1) + 1;
    }
    for (Object localObject = arrayOfObject[i];; localObject = null)
    {
      return localObject;
      i = 0;
    }
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = f;
    Object[] arrayOfObject = g;
    int i = 1;
    int j = h;
    int k = i;
    int m = 0;
    int n = 0;
    if (m < j)
    {
      Object localObject = arrayOfObject[k];
      int i1 = arrayOfInt[m];
      if (localObject == null)
      {
        i = 0;
        localObject = null;
      }
      for (;;)
      {
        i ^= i1;
        n += i;
        m += 1;
        i = k + 2;
        k = i;
        break;
        i = localObject.hashCode();
      }
    }
    return n;
  }
  
  public boolean isEmpty()
  {
    int i = h;
    if (i <= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    int i = 8;
    int j = 4;
    int k = 0;
    Object[] arrayOfObject1 = null;
    int m;
    int n;
    if (paramObject1 == null)
    {
      m = a();
      n = 0;
    }
    Object localObject;
    while (m >= 0)
    {
      i = m << 1;
      j = i + 1;
      localObject = g[j];
      Object[] arrayOfObject2 = g;
      arrayOfObject2[j] = paramObject2;
      return localObject;
      n = paramObject1.hashCode();
      m = a(paramObject1, n);
    }
    m ^= 0xFFFFFFFF;
    int i1 = h;
    int[] arrayOfInt1 = f;
    int i2 = arrayOfInt1.length;
    if (i1 >= i2)
    {
      i1 = h;
      if (i1 < i) {
        break label398;
      }
      i = h;
      j = h >> 1;
      i += j;
    }
    for (;;)
    {
      int[] arrayOfInt2 = f;
      Object[] arrayOfObject3 = g;
      e(i);
      localObject = f;
      i = localObject.length;
      if (i > 0)
      {
        localObject = f;
        i2 = arrayOfInt2.length;
        System.arraycopy(arrayOfInt2, 0, localObject, 0, i2);
        localObject = g;
        i2 = arrayOfObject3.length;
        System.arraycopy(arrayOfObject3, 0, localObject, 0, i2);
      }
      i = h;
      a(arrayOfInt2, arrayOfObject3, i);
      i = h;
      if (m < i)
      {
        localObject = f;
        arrayOfInt2 = f;
        k = m + 1;
        i1 = h - m;
        System.arraycopy(localObject, m, arrayOfInt2, k, i1);
        localObject = g;
        j = m << 1;
        arrayOfObject1 = g;
        i1 = m + 1 << 1;
        i2 = h - m << 1;
        System.arraycopy(localObject, j, arrayOfObject1, i1, i2);
      }
      f[m] = n;
      localObject = g;
      j = m << 1;
      localObject[j] = paramObject1;
      localObject = g;
      j = (m << 1) + 1;
      localObject[j] = paramObject2;
      i = h + 1;
      h = i;
      i = 0;
      localObject = null;
      break;
      label398:
      i1 = h;
      if (i1 < j) {
        i = j;
      }
    }
  }
  
  public Object remove(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {}
    for (Object localObject = d(i);; localObject = null)
    {
      return localObject;
      i = 0;
    }
  }
  
  public int size()
  {
    return h;
  }
  
  public String toString()
  {
    boolean bool = isEmpty();
    if (bool) {}
    StringBuilder localStringBuilder;
    for (String str = "{}";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      int i = h * 28;
      localStringBuilder.<init>(i);
      localStringBuilder.append('{');
      i = 0;
      str = null;
      int j = h;
      if (i < j)
      {
        if (i > 0)
        {
          localObject = ", ";
          localStringBuilder.append((String)localObject);
        }
        Object localObject = b(i);
        if (localObject != this)
        {
          localStringBuilder.append(localObject);
          label89:
          char c1 = '=';
          localStringBuilder.append(c1);
          localObject = c(i);
          if (localObject == this) {
            break label141;
          }
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          i += 1;
          break;
          localObject = "(this Map)";
          localStringBuilder.append((String)localObject);
          break label89;
          label141:
          localObject = "(this Map)";
          localStringBuilder.append((String)localObject);
        }
      }
      i = 125;
      localStringBuilder.append(i);
    }
  }
}


/* Location:              android/support/v4/g/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */