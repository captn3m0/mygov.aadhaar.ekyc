package android.support.v4.g;

import java.util.Map;

public class k<K, V>
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
    f = c.a;
    g = c.c;
    h = 0;
  }
  
  public k(int paramInt)
  {
    if (paramInt == 0)
    {
      f = c.a;
      g = c.c;
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
    int m = h;
    int i;
    if (m == 0) {
      i = -1;
    }
    int j;
    do
    {
      do
      {
        return i;
        j = c.a(f, m, 0);
        i = j;
      } while (j < 0);
      i = j;
    } while (g[(j << 1)] == null);
    int k = j + 1;
    while ((k < m) && (f[k] == 0))
    {
      if (g[(k << 1)] == null) {
        return k;
      }
      k += 1;
    }
    j -= 1;
    for (;;)
    {
      if ((j < 0) || (f[j] != 0)) {
        break label121;
      }
      i = j;
      if (g[(j << 1)] == null) {
        break;
      }
      j -= 1;
    }
    label121:
    return k ^ 0xFFFFFFFF;
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int m = h;
    int i;
    if (m == 0) {
      i = -1;
    }
    int j;
    do
    {
      do
      {
        return i;
        j = c.a(f, m, paramInt);
        i = j;
      } while (j < 0);
      i = j;
    } while (paramObject.equals(g[(j << 1)]));
    int k = j + 1;
    while ((k < m) && (f[k] == paramInt))
    {
      if (paramObject.equals(g[(k << 1)])) {
        return k;
      }
      k += 1;
    }
    j -= 1;
    for (;;)
    {
      if ((j < 0) || (f[j] != paramInt)) {
        break label156;
      }
      i = j;
      if (paramObject.equals(g[(j << 1)])) {
        break;
      }
      j -= 1;
    }
    label156:
    return k ^ 0xFFFFFFFF;
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (e < 10)
        {
          paramArrayOfObject[0] = d;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          break label117;
          d = paramArrayOfObject;
          e += 1;
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
        if (c < 10)
        {
          paramArrayOfObject[0] = b;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          break label134;
          b = paramArrayOfObject;
          c += 1;
        }
        return;
      }
      finally {}
      label117:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
      break;
      return;
      label134:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
    }
  }
  
  private void e(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (d != null)
        {
          Object[] arrayOfObject1 = d;
          g = arrayOfObject1;
          d = (Object[])arrayOfObject1[0];
          f = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          e -= 1;
          return;
        }
        f = new int[paramInt];
        g = new Object[paramInt << 1];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (b != null)
          {
            Object[] arrayOfObject2 = b;
            g = arrayOfObject2;
            b = (Object[])arrayOfObject2[0];
            f = ((int[])arrayOfObject2[1]);
            arrayOfObject2[1] = null;
            arrayOfObject2[0] = null;
            c -= 1;
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
    return a(paramObject, paramObject.hashCode());
  }
  
  public final void a(int paramInt)
  {
    if (f.length < paramInt)
    {
      int[] arrayOfInt = f;
      Object[] arrayOfObject = g;
      e(paramInt);
      if (h > 0)
      {
        System.arraycopy(arrayOfInt, 0, f, 0, h);
        System.arraycopy(arrayOfObject, 0, g, 0, h << 1);
      }
      a(arrayOfInt, arrayOfObject, h);
    }
  }
  
  final int b(Object paramObject)
  {
    int i = 1;
    int j = 1;
    int k = h * 2;
    Object[] arrayOfObject = g;
    if (paramObject == null)
    {
      i = j;
      while (i < k)
      {
        if (arrayOfObject[i] == null) {
          return i >> 1;
        }
        i += 2;
      }
    }
    do
    {
      i += 2;
      if (i >= k) {
        break;
      }
    } while (!paramObject.equals(arrayOfObject[i]));
    return i >> 1;
    return -1;
  }
  
  public final K b(int paramInt)
  {
    return (K)g[(paramInt << 1)];
  }
  
  public final V c(int paramInt)
  {
    return (V)g[((paramInt << 1) + 1)];
  }
  
  public void clear()
  {
    if (h != 0)
    {
      a(f, g, h);
      f = c.a;
      g = c.c;
      h = 0;
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    return a(paramObject) >= 0;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return b(paramObject) >= 0;
  }
  
  public final V d(int paramInt)
  {
    int i = 8;
    Object localObject = g[((paramInt << 1) + 1)];
    if (h <= 1)
    {
      a(f, g, h);
      f = c.a;
      g = c.c;
      h = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return (V)localObject;
      if ((f.length <= 8) || (h >= f.length / 3)) {
        break;
      }
      if (h > 8) {
        i = h + (h >> 1);
      }
      arrayOfInt = f;
      arrayOfObject = g;
      e(i);
      h -= 1;
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, f, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, g, 0, paramInt << 1);
      }
    } while (paramInt >= h);
    System.arraycopy(arrayOfInt, paramInt + 1, f, paramInt, h - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1 << 1, g, paramInt << 1, h - paramInt << 1);
    return (V)localObject;
    h -= 1;
    if (paramInt < h)
    {
      System.arraycopy(f, paramInt + 1, f, paramInt, h - paramInt);
      System.arraycopy(g, paramInt + 1 << 1, g, paramInt << 1, h - paramInt << 1);
    }
    g[(h << 1)] = null;
    g[((h << 1) + 1)] = null;
    return (V)localObject;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      int i;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      boolean bool;
      if ((paramObject instanceof k))
      {
        paramObject = (k)paramObject;
        if (size() != ((k)paramObject).size()) {
          return false;
        }
        i = 0;
        try
        {
          while (i < h)
          {
            localObject1 = b(i);
            localObject2 = c(i);
            localObject3 = ((k)paramObject).get(localObject1);
            if (localObject2 == null)
            {
              if (localObject3 != null) {
                break label227;
              }
              if (!((k)paramObject).containsKey(localObject1)) {
                break label227;
              }
            }
            else
            {
              bool = localObject2.equals(localObject3);
              if (!bool) {
                return false;
              }
            }
            i += 1;
          }
          if (!(paramObject instanceof Map)) {
            break;
          }
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
      else
      {
        paramObject = (Map)paramObject;
        if (size() != ((Map)paramObject).size()) {
          return false;
        }
        i = 0;
        try
        {
          while (i < h)
          {
            localObject1 = b(i);
            localObject2 = c(i);
            localObject3 = ((Map)paramObject).get(localObject1);
            if (localObject2 == null)
            {
              if (localObject3 != null) {
                break label229;
              }
              if (!((Map)paramObject).containsKey(localObject1)) {
                break label229;
              }
            }
            else
            {
              bool = localObject2.equals(localObject3);
              if (!bool) {
                return false;
              }
            }
            i += 1;
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
    label227:
    return false;
    label229:
    return false;
  }
  
  public V get(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {
      return (V)g[((i << 1) + 1)];
    }
    return null;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = f;
    Object[] arrayOfObject = g;
    int n = h;
    int i = 1;
    int j = 0;
    int k = 0;
    if (j < n)
    {
      Object localObject = arrayOfObject[i];
      int i1 = arrayOfInt[j];
      if (localObject == null) {}
      for (int m = 0;; m = localObject.hashCode())
      {
        k += (m ^ i1);
        j += 1;
        i += 2;
        break;
      }
    }
    return k;
  }
  
  public boolean isEmpty()
  {
    return h <= 0;
  }
  
  public V put(K paramK, V paramV)
  {
    int k = 8;
    int i;
    int j;
    if (paramK == null)
    {
      i = a();
      j = 0;
    }
    while (i >= 0)
    {
      i = (i << 1) + 1;
      paramK = g[i];
      g[i] = paramV;
      return paramK;
      j = paramK.hashCode();
      i = a(paramK, j);
    }
    int m = i ^ 0xFFFFFFFF;
    if (h >= f.length)
    {
      if (h < 8) {
        break label267;
      }
      i = h + (h >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = f;
      Object[] arrayOfObject = g;
      e(i);
      if (f.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, f, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, g, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, h);
      if (m < h)
      {
        System.arraycopy(f, m, f, m + 1, h - m);
        System.arraycopy(g, m << 1, g, m + 1 << 1, h - m << 1);
      }
      f[m] = j;
      g[(m << 1)] = paramK;
      g[((m << 1) + 1)] = paramV;
      h += 1;
      return null;
      label267:
      i = k;
      if (h < 4) {
        i = 4;
      }
    }
  }
  
  public V remove(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {
      return (V)d(i);
    }
    return null;
  }
  
  public int size()
  {
    return h;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(h * 28);
    localStringBuilder.append('{');
    int i = 0;
    if (i < h)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = b(i);
      if (localObject != this)
      {
        localStringBuilder.append(localObject);
        label70:
        localStringBuilder.append('=');
        localObject = c(i);
        if (localObject == this) {
          break label111;
        }
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("(this Map)");
        break label70;
        label111:
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              android/support/v4/g/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */