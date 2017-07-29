package com.google.android.gms.b;

public final class bf$f
  extends fv
{
  public byte[][] a;
  public byte[] b;
  public Integer c;
  public Integer d;
  
  public bf$f()
  {
    byte[][] arrayOfByte = ge.k;
    a = arrayOfByte;
    b = null;
    c = null;
    d = null;
    ah = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    Object localObject1 = a;
    int k;
    int m;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = a;
      k = localObject1.length;
      if (k > 0)
      {
        k = 0;
        localObject1 = null;
        m = 0;
        localObject2 = null;
        for (;;)
        {
          Object localObject3 = a;
          int n = localObject3.length;
          if (i >= n) {
            break;
          }
          localObject3 = a[i];
          if (localObject3 != null)
          {
            m += 1;
            n = fu.a((byte[])localObject3);
            k += n;
          }
          i += 1;
        }
        i = j + k;
        k = m * 1;
        i += k;
      }
    }
    for (;;)
    {
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject2 = b;
        k = fu.b(2, (byte[])localObject2);
        i += k;
      }
      localObject1 = c;
      if (localObject1 != null)
      {
        localObject2 = c;
        m = ((Integer)localObject2).intValue();
        k = fu.b(3, m);
        i += k;
      }
      localObject1 = d;
      if (localObject1 != null)
      {
        localObject2 = d;
        m = ((Integer)localObject2).intValue();
        k = fu.b(4, m);
        i += k;
      }
      return i;
      i = j;
    }
  }
  
  public final void a(fu paramfu)
  {
    Object localObject1 = a;
    int i;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject1 = a;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = a;
          j = localObject2.length;
          if (i >= j) {
            break;
          }
          localObject2 = a[i];
          if (localObject2 != null)
          {
            int k = 1;
            paramfu.a(k, (byte[])localObject2);
          }
          i += 1;
        }
      }
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = b;
      paramfu.a(i, (byte[])localObject2);
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = c;
      j = ((Integer)localObject2).intValue();
      paramfu.a(i, j);
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = d;
      j = ((Integer)localObject2).intValue();
      paramfu.a(i, j);
    }
    super.a(paramfu);
  }
}


/* Location:              com/google/android/gms/b/bf$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */