package com.google.android.gms.b;

public final class bf$e
  extends fv
{
  public Long a = null;
  public String b = null;
  public byte[] c = null;
  
  public bf$e()
  {
    ah = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    Object localObject1 = a;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = a;
      long l = ((Long)localObject2).longValue();
      j = fu.c(1, l);
      i += j;
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject2 = b;
      j = fu.b(3, (String)localObject2);
      i += j;
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject2 = c;
      j = fu.b(4, (byte[])localObject2);
      i += j;
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    Object localObject1 = a;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = a;
      long l = ((Long)localObject2).longValue();
      paramfu.b(i, l);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = b;
      paramfu.a(i, (String)localObject2);
    }
    localObject1 = c;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = c;
      paramfu.a(i, (byte[])localObject2);
    }
    super.a(paramfu);
  }
}


/* Location:              com/google/android/gms/b/bf$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */