package android.support.v4.g;

public final class l<E>
  implements Cloneable
{
  private static final Object d = new Object();
  public boolean a = false;
  public int[] b;
  public int c;
  private Object[] e;
  
  public l()
  {
    this(10);
  }
  
  public l(int paramInt)
  {
    if (paramInt == 0) {
      b = c.a;
    }
    for (e = c.c;; e = new Object[paramInt])
    {
      c = 0;
      return;
      paramInt = c.a(paramInt);
      b = new int[paramInt];
    }
  }
  
  private l<E> d()
  {
    try
    {
      l locall = (l)super.clone();
      return localCloneNotSupportedException1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        b = ((int[])b.clone());
        e = ((Object[])e.clone());
        return locall;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  public final E a(int paramInt)
  {
    paramInt = c.a(b, c, paramInt);
    if ((paramInt < 0) || (e[paramInt] == d)) {
      return null;
    }
    return (E)e[paramInt];
  }
  
  public final void a()
  {
    int m = c;
    int[] arrayOfInt = b;
    Object[] arrayOfObject = e;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      Object localObject = arrayOfObject[i];
      k = j;
      if (localObject != d)
      {
        if (i != j)
        {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfObject[j] = localObject;
          arrayOfObject[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    a = false;
    c = j;
  }
  
  public final void a(int paramInt, E paramE)
  {
    int i = c.a(b, c, paramInt);
    if (i >= 0)
    {
      e[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < c) && (e[j] == d))
    {
      b[j] = paramInt;
      e[j] = paramE;
      return;
    }
    i = j;
    if (a)
    {
      i = j;
      if (c >= b.length)
      {
        a();
        i = c.a(b, c, paramInt) ^ 0xFFFFFFFF;
      }
    }
    if (c >= b.length)
    {
      j = c.a(c + 1);
      int[] arrayOfInt = new int[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(b, 0, arrayOfInt, 0, b.length);
      System.arraycopy(e, 0, arrayOfObject, 0, e.length);
      b = arrayOfInt;
      e = arrayOfObject;
    }
    if (c - i != 0)
    {
      System.arraycopy(b, i, b, i + 1, c - i);
      System.arraycopy(e, i, e, i + 1, c - i);
    }
    b[i] = paramInt;
    e[i] = paramE;
    c += 1;
  }
  
  public final int b()
  {
    if (a) {
      a();
    }
    return c;
  }
  
  public final void b(int paramInt)
  {
    paramInt = c.a(b, c, paramInt);
    if ((paramInt >= 0) && (e[paramInt] != d))
    {
      e[paramInt] = d;
      a = true;
    }
  }
  
  public final void b(int paramInt, E paramE)
  {
    if ((c != 0) && (paramInt <= b[(c - 1)]))
    {
      a(paramInt, paramE);
      return;
    }
    if ((a) && (c >= b.length)) {
      a();
    }
    int i = c;
    if (i >= b.length)
    {
      int j = c.a(i + 1);
      int[] arrayOfInt = new int[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(b, 0, arrayOfInt, 0, b.length);
      System.arraycopy(e, 0, arrayOfObject, 0, e.length);
      b = arrayOfInt;
      e = arrayOfObject;
    }
    b[i] = paramInt;
    e[i] = paramE;
    c = (i + 1);
  }
  
  public final int c(int paramInt)
  {
    if (a) {
      a();
    }
    return b[paramInt];
  }
  
  public final void c()
  {
    int j = c;
    Object[] arrayOfObject = e;
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = null;
      i += 1;
    }
    c = 0;
    a = false;
  }
  
  public final E d(int paramInt)
  {
    if (a) {
      a();
    }
    return (E)e[paramInt];
  }
  
  public final String toString()
  {
    if (b() <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(c * 28);
    localStringBuilder.append('{');
    int i = 0;
    if (i < c)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(c(i));
      localStringBuilder.append('=');
      Object localObject = d(i);
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


/* Location:              android/support/v4/g/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */