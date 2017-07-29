package android.support.v4.g;

public final class l
  implements Cloneable
{
  private static final Object d;
  public boolean a = false;
  public int[] b;
  public int c;
  private Object[] e;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
  }
  
  public l()
  {
    this(10);
  }
  
  public l(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
    {
      localObject = c.a;
      b = ((int[])localObject);
      localObject = c.c;
    }
    for (e = ((Object[])localObject);; e = ((Object[])localObject))
    {
      c = 0;
      return;
      int i = c.a(paramInt);
      int[] arrayOfInt = new int[i];
      b = arrayOfInt;
      localObject = new Object[i];
    }
  }
  
  private l d()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = super.clone();
      localObject2 = (l)localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException2)
    {
      for (;;)
      {
        Object localObject2;
        label52:
        Object localObject3 = null;
      }
    }
    try
    {
      localObject1 = b;
      localObject1 = ((int[])localObject1).clone();
      localObject1 = (int[])localObject1;
      b = ((int[])localObject1);
      localObject1 = e;
      localObject1 = ((Object[])localObject1).clone();
      localObject1 = (Object[])localObject1;
      e = ((Object[])localObject1);
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      break label52;
    }
    return (l)localObject2;
  }
  
  public final Object a(int paramInt)
  {
    int[] arrayOfInt = b;
    int i = c;
    int j = c.a(arrayOfInt, i, paramInt);
    Object localObject1;
    if (j >= 0)
    {
      localObject1 = e[j];
      Object localObject2 = d;
      if (localObject1 != localObject2) {}
    }
    else
    {
      j = 0;
    }
    for (arrayOfInt = null;; arrayOfInt = localObject1[j])
    {
      return arrayOfInt;
      localObject1 = e;
    }
  }
  
  public final void a()
  {
    int i = c;
    int[] arrayOfInt = b;
    Object[] arrayOfObject = e;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject1 = arrayOfObject[j];
      Object localObject2 = d;
      if (localObject1 != localObject2)
      {
        if (j != k)
        {
          int m = arrayOfInt[j];
          arrayOfInt[k] = m;
          arrayOfObject[k] = localObject1;
          localObject1 = null;
          arrayOfObject[j] = null;
        }
        k += 1;
      }
      j += 1;
    }
    a = false;
    c = k;
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    int[] arrayOfInt = b;
    int i = c;
    int k = c.a(arrayOfInt, i, paramInt);
    Object localObject1;
    if (k >= 0)
    {
      localObject1 = e;
      localObject1[k] = paramObject;
    }
    for (;;)
    {
      return;
      k ^= 0xFFFFFFFF;
      i = c;
      if (k < i)
      {
        localObject1 = e[k];
        localObject2 = d;
        if (localObject1 == localObject2)
        {
          b[k] = paramInt;
          localObject1 = e;
          localObject1[k] = paramObject;
          continue;
        }
      }
      boolean bool = a;
      if (bool)
      {
        j = c;
        localObject2 = b;
        m = localObject2.length;
        if (j >= m)
        {
          a();
          arrayOfInt = b;
          j = c;
          k = c.a(arrayOfInt, j, paramInt) ^ 0xFFFFFFFF;
        }
      }
      int j = c;
      Object localObject2 = b;
      int m = localObject2.length;
      int n;
      if (j >= m)
      {
        j = c.a(c + 1);
        localObject2 = new int[j];
        localObject1 = new Object[j];
        Object localObject3 = b;
        n = b.length;
        System.arraycopy(localObject3, 0, localObject2, 0, n);
        localObject3 = e;
        Object[] arrayOfObject = e;
        n = arrayOfObject.length;
        System.arraycopy(localObject3, 0, localObject1, 0, n);
        b = ((int[])localObject2);
        e = ((Object[])localObject1);
      }
      j = c - k;
      if (j != 0)
      {
        localObject1 = b;
        localObject2 = b;
        int i1 = k + 1;
        n = c - k;
        System.arraycopy(localObject1, k, localObject2, i1, n);
        localObject1 = e;
        localObject2 = e;
        i1 = k + 1;
        n = c - k;
        System.arraycopy(localObject1, k, localObject2, i1, n);
      }
      b[k] = paramInt;
      localObject1 = e;
      localObject1[k] = paramObject;
      k = c + 1;
      c = k;
    }
  }
  
  public final int b()
  {
    boolean bool = a;
    if (bool) {
      a();
    }
    return c;
  }
  
  public final void b(int paramInt)
  {
    int[] arrayOfInt = b;
    int i = c;
    int j = c.a(arrayOfInt, i, paramInt);
    if (j >= 0)
    {
      Object localObject1 = e[j];
      Object localObject2 = d;
      if (localObject1 != localObject2)
      {
        localObject1 = e;
        localObject2 = d;
        localObject1[j] = localObject2;
        j = 1;
        a = j;
      }
    }
  }
  
  public final void b(int paramInt, Object paramObject)
  {
    int i = c;
    int k;
    if (i != 0)
    {
      int[] arrayOfInt1 = b;
      k = c + -1;
      i = arrayOfInt1[k];
      if (paramInt <= i) {
        a(paramInt, paramObject);
      }
    }
    for (;;)
    {
      return;
      boolean bool = a;
      if (bool)
      {
        j = c;
        localObject1 = b;
        k = localObject1.length;
        if (j >= k) {
          a();
        }
      }
      int j = c;
      Object localObject1 = b;
      k = localObject1.length;
      if (j >= k)
      {
        k = c.a(j + 1);
        int[] arrayOfInt2 = new int[k];
        localObject1 = new Object[k];
        Object localObject2 = b;
        int m = b.length;
        System.arraycopy(localObject2, 0, arrayOfInt2, 0, m);
        localObject2 = e;
        Object[] arrayOfObject = e;
        m = arrayOfObject.length;
        System.arraycopy(localObject2, 0, localObject1, 0, m);
        b = arrayOfInt2;
        e = ((Object[])localObject1);
      }
      b[j] = paramInt;
      localObject1 = e;
      localObject1[j] = paramObject;
      j += 1;
      c = j;
    }
  }
  
  public final int c(int paramInt)
  {
    boolean bool = a;
    if (bool) {
      a();
    }
    return b[paramInt];
  }
  
  public final void c()
  {
    int i = c;
    Object[] arrayOfObject = e;
    int j = 0;
    while (j < i)
    {
      arrayOfObject[j] = null;
      j += 1;
    }
    c = 0;
    a = false;
  }
  
  public final Object d(int paramInt)
  {
    boolean bool = a;
    if (bool) {
      a();
    }
    return e[paramInt];
  }
  
  public final String toString()
  {
    int i = b();
    if (i <= 0) {}
    StringBuilder localStringBuilder;
    for (String str = "{}";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      i = c * 28;
      localStringBuilder.<init>(i);
      localStringBuilder.append('{');
      i = 0;
      str = null;
      int j = c;
      if (i < j)
      {
        if (i > 0)
        {
          localObject = ", ";
          localStringBuilder.append((String)localObject);
        }
        int k = c(i);
        localStringBuilder.append(k);
        k = 61;
        localStringBuilder.append(k);
        Object localObject = d(i);
        if (localObject != this) {
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          i += 1;
          break;
          localObject = "(this Map)";
          localStringBuilder.append((String)localObject);
        }
      }
      i = 125;
      localStringBuilder.append(i);
    }
  }
}


/* Location:              android/support/v4/g/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */