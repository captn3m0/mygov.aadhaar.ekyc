package com.google.android.gms.b;

public final class bd$a
  extends fv
{
  public bd.b a;
  public bd.c b;
  
  public bd$a()
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
      j = fu.b(1, (gb)localObject2);
      i += j;
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject2 = b;
      j = fu.b(2, (gb)localObject2);
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
      paramfu.a(i, (gb)localObject2);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = b;
      paramfu.a(i, (gb)localObject2);
    }
    super.a(paramfu);
  }
}


/* Location:              com/google/android/gms/b/bd$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */