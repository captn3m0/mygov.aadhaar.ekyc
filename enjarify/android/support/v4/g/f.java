package android.support.v4.g;

public final class f
  implements Cloneable
{
  public static final Object a;
  public boolean b = false;
  public long[] c;
  public Object[] d;
  public int e;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public f()
  {
    this((byte)0);
  }
  
  private f(byte paramByte)
  {
    int i = c.b(10);
    long[] arrayOfLong = new long[i];
    c = arrayOfLong;
    Object[] arrayOfObject = new Object[i];
    d = arrayOfObject;
    e = 0;
  }
  
  private long b(int paramInt)
  {
    boolean bool = b;
    if (bool) {
      d();
    }
    return c[paramInt];
  }
  
  private f c()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = super.clone();
      localObject2 = (f)localObject2;
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
      localObject1 = c;
      localObject1 = ((long[])localObject1).clone();
      localObject1 = (long[])localObject1;
      c = ((long[])localObject1);
      localObject1 = d;
      localObject1 = ((Object[])localObject1).clone();
      localObject1 = (Object[])localObject1;
      d = ((Object[])localObject1);
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      break label52;
    }
    return (f)localObject2;
  }
  
  private void d()
  {
    int i = e;
    long[] arrayOfLong = c;
    Object[] arrayOfObject = d;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject1 = arrayOfObject[j];
      Object localObject2 = a;
      if (localObject1 != localObject2)
      {
        if (j != k)
        {
          long l = arrayOfLong[j];
          arrayOfLong[k] = l;
          arrayOfObject[k] = localObject1;
          localObject1 = null;
          arrayOfObject[j] = null;
        }
        k += 1;
      }
      j += 1;
    }
    b = false;
    e = k;
  }
  
  public final int a()
  {
    boolean bool = b;
    if (bool) {
      d();
    }
    return e;
  }
  
  public final Object a(int paramInt)
  {
    boolean bool = b;
    if (bool) {
      d();
    }
    return d[paramInt];
  }
  
  public final Object a(long paramLong)
  {
    long[] arrayOfLong = c;
    int i = e;
    int j = c.a(arrayOfLong, i, paramLong);
    Object localObject1;
    if (j >= 0)
    {
      localObject1 = d[j];
      Object localObject2 = a;
      if (localObject1 != localObject2) {}
    }
    else
    {
      j = 0;
    }
    for (arrayOfLong = null;; arrayOfLong = localObject1[j])
    {
      return arrayOfLong;
      localObject1 = d;
    }
  }
  
  public final void a(long paramLong, Object paramObject)
  {
    long[] arrayOfLong = c;
    int i = e;
    int k = c.a(arrayOfLong, i, paramLong);
    Object localObject1;
    if (k >= 0)
    {
      localObject1 = d;
      localObject1[k] = paramObject;
    }
    for (;;)
    {
      return;
      k ^= 0xFFFFFFFF;
      i = e;
      if (k < i)
      {
        localObject1 = d[k];
        localObject2 = a;
        if (localObject1 == localObject2)
        {
          c[k] = paramLong;
          localObject1 = d;
          localObject1[k] = paramObject;
          continue;
        }
      }
      boolean bool = b;
      if (bool)
      {
        j = e;
        localObject2 = c;
        m = localObject2.length;
        if (j >= m)
        {
          d();
          arrayOfLong = c;
          j = e;
          k = c.a(arrayOfLong, j, paramLong) ^ 0xFFFFFFFF;
        }
      }
      int j = e;
      Object localObject2 = c;
      int m = localObject2.length;
      int n;
      if (j >= m)
      {
        j = c.b(e + 1);
        localObject2 = new long[j];
        localObject1 = new Object[j];
        Object localObject3 = c;
        n = c.length;
        System.arraycopy(localObject3, 0, localObject2, 0, n);
        localObject3 = d;
        Object[] arrayOfObject = d;
        n = arrayOfObject.length;
        System.arraycopy(localObject3, 0, localObject1, 0, n);
        c = ((long[])localObject2);
        d = ((Object[])localObject1);
      }
      j = e - k;
      if (j != 0)
      {
        localObject1 = c;
        localObject2 = c;
        int i1 = k + 1;
        n = e - k;
        System.arraycopy(localObject1, k, localObject2, i1, n);
        localObject1 = d;
        localObject2 = d;
        i1 = k + 1;
        n = e - k;
        System.arraycopy(localObject1, k, localObject2, i1, n);
      }
      c[k] = paramLong;
      localObject1 = d;
      localObject1[k] = paramObject;
      k = e + 1;
      e = k;
    }
  }
  
  public final void b()
  {
    int i = e;
    Object[] arrayOfObject = d;
    int j = 0;
    while (j < i)
    {
      arrayOfObject[j] = null;
      j += 1;
    }
    e = 0;
    b = false;
  }
  
  public final String toString()
  {
    int i = a();
    if (i <= 0) {}
    StringBuilder localStringBuilder;
    for (String str = "{}";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      i = e * 28;
      localStringBuilder.<init>(i);
      localStringBuilder.append('{');
      i = 0;
      str = null;
      int j = e;
      if (i < j)
      {
        if (i > 0)
        {
          localObject = ", ";
          localStringBuilder.append((String)localObject);
        }
        long l = b(i);
        localStringBuilder.append(l);
        char c1 = '=';
        localStringBuilder.append(c1);
        Object localObject = a(i);
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


/* Location:              android/support/v4/g/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */