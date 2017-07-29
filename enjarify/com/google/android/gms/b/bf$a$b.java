package com.google.android.gms.b;

public final class bf$a$b
  extends fv
{
  public Long a = null;
  public Long b = null;
  public Long c = null;
  
  public bf$a$b()
  {
    ah = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    Long localLong1 = a;
    Long localLong2;
    long l;
    int j;
    if (localLong1 != null)
    {
      localLong2 = a;
      l = localLong2.longValue();
      j = fu.c(1, l);
      i += j;
    }
    localLong1 = b;
    if (localLong1 != null)
    {
      localLong2 = b;
      l = localLong2.longValue();
      j = fu.c(2, l);
      i += j;
    }
    localLong1 = c;
    if (localLong1 != null)
    {
      localLong2 = c;
      l = localLong2.longValue();
      j = fu.c(3, l);
      i += j;
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    Long localLong1 = a;
    int i;
    Long localLong2;
    long l;
    if (localLong1 != null)
    {
      i = 1;
      localLong2 = a;
      l = localLong2.longValue();
      paramfu.b(i, l);
    }
    localLong1 = b;
    if (localLong1 != null)
    {
      i = 2;
      localLong2 = b;
      l = localLong2.longValue();
      paramfu.b(i, l);
    }
    localLong1 = c;
    if (localLong1 != null)
    {
      i = 3;
      localLong2 = c;
      l = localLong2.longValue();
      paramfu.b(i, l);
    }
    super.a(paramfu);
  }
}


/* Location:              com/google/android/gms/b/bf$a$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */