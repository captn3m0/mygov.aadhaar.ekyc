package android.support.v4.g;

public final class f<E>
  implements Cloneable
{
  public static final Object a = new Object();
  public boolean b = false;
  public long[] c;
  public Object[] d;
  public int e;
  
  public f()
  {
    this((byte)0);
  }
  
  private f(byte paramByte)
  {
    paramByte = c.b(10);
    c = new long[paramByte];
    d = new Object[paramByte];
    e = 0;
  }
  
  private long b(int paramInt)
  {
    if (b) {
      d();
    }
    return c[paramInt];
  }
  
  private f<E> c()
  {
    try
    {
      f localf = (f)super.clone();
      return localCloneNotSupportedException1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        c = ((long[])c.clone());
        d = ((Object[])d.clone());
        return localf;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  private void d()
  {
    int m = e;
    long[] arrayOfLong = c;
    Object[] arrayOfObject = d;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      Object localObject = arrayOfObject[i];
      k = j;
      if (localObject != a)
      {
        if (i != j)
        {
          arrayOfLong[j] = arrayOfLong[i];
          arrayOfObject[j] = localObject;
          arrayOfObject[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    b = false;
    e = j;
  }
  
  public final int a()
  {
    if (b) {
      d();
    }
    return e;
  }
  
  public final E a(int paramInt)
  {
    if (b) {
      d();
    }
    return (E)d[paramInt];
  }
  
  public final E a(long paramLong)
  {
    int i = c.a(c, e, paramLong);
    if ((i < 0) || (d[i] == a)) {
      return null;
    }
    return (E)d[i];
  }
  
  public final void a(long paramLong, E paramE)
  {
    int i = c.a(c, e, paramLong);
    if (i >= 0)
    {
      d[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < e) && (d[j] == a))
    {
      c[j] = paramLong;
      d[j] = paramE;
      return;
    }
    i = j;
    if (b)
    {
      i = j;
      if (e >= c.length)
      {
        d();
        i = c.a(c, e, paramLong) ^ 0xFFFFFFFF;
      }
    }
    if (e >= c.length)
    {
      j = c.b(e + 1);
      long[] arrayOfLong = new long[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(c, 0, arrayOfLong, 0, c.length);
      System.arraycopy(d, 0, arrayOfObject, 0, d.length);
      c = arrayOfLong;
      d = arrayOfObject;
    }
    if (e - i != 0)
    {
      System.arraycopy(c, i, c, i + 1, e - i);
      System.arraycopy(d, i, d, i + 1, e - i);
    }
    c[i] = paramLong;
    d[i] = paramE;
    e += 1;
  }
  
  public final void b()
  {
    int j = e;
    Object[] arrayOfObject = d;
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = null;
      i += 1;
    }
    e = 0;
    b = false;
  }
  
  public final String toString()
  {
    if (a() <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(e * 28);
    localStringBuilder.append('{');
    int i = 0;
    if (i < e)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(b(i));
      localStringBuilder.append('=');
      Object localObject = a(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              android/support/v4/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */