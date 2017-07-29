package com.google.android.gms.b;

public final class bf$b
  extends fv
{
  public Long a = null;
  public Integer b = null;
  public Boolean c = null;
  public int[] d;
  public Long e;
  
  public bf$b()
  {
    int[] arrayOfInt = ge.e;
    d = arrayOfInt;
    e = null;
    ah = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    Object localObject1 = null;
    int j = super.a();
    Object localObject2 = a;
    Object localObject3;
    int k;
    if (localObject2 != null)
    {
      localObject3 = a;
      long l1 = ((Long)localObject3).longValue();
      k = fu.c(1, l1);
      j += k;
    }
    localObject2 = b;
    int m;
    if (localObject2 != null)
    {
      localObject3 = b;
      m = ((Integer)localObject3).intValue();
      k = fu.b(2, m);
      j += k;
    }
    localObject2 = c;
    if (localObject2 != null)
    {
      localObject3 = c;
      ((Boolean)localObject3).booleanValue();
      k = fu.b(3) + 1;
      j += k;
    }
    localObject2 = d;
    if (localObject2 != null)
    {
      localObject2 = d;
      k = localObject2.length;
      if (k > 0)
      {
        k = 0;
        localObject2 = null;
        for (;;)
        {
          localObject3 = d;
          m = localObject3.length;
          if (i >= m) {
            break;
          }
          localObject3 = d;
          m = fu.a(localObject3[i]);
          k += m;
          i += 1;
        }
        j += k;
        localObject1 = d;
        i = localObject1.length * 1;
        j += i;
      }
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      localObject1 = e;
      long l2 = ((Long)localObject1).longValue();
      i = fu.b(5);
      k = fu.b(l2);
      i += k;
      j += i;
    }
    return j;
  }
  
  public final void a(fu paramfu)
  {
    Object localObject1 = a;
    int i;
    Object localObject2;
    long l;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = a;
      l = ((Long)localObject2).longValue();
      paramfu.b(i, l);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = b;
      int j = ((Integer)localObject2).intValue();
      paramfu.a(i, j);
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = c;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramfu.a(i, bool);
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject1 = d;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = d;
          int k = localObject2.length;
          if (i >= k) {
            break;
          }
          k = 4;
          int[] arrayOfInt = d;
          int m = arrayOfInt[i];
          paramfu.a(k, m);
          i += 1;
        }
      }
    }
    localObject1 = e;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = e;
      l = ((Long)localObject2).longValue();
      paramfu.a(i, l);
    }
    super.a(paramfu);
  }
}


/* Location:              com/google/android/gms/b/bf$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */