package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fp
  extends gm
{
  private static volatile Long i = null;
  private static final Object j;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    j = localObject;
  }
  
  public fp(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 33);
  }
  
  protected final void a()
  {
    Object localObject1 = i;
    Long localLong;
    if (localObject1 == null) {
      synchronized (j)
      {
        localObject1 = i;
        if (localObject1 == null)
        {
          localObject1 = f;
          localLong = null;
          Object[] arrayOfObject = null;
          arrayOfObject = new Object[0];
          localObject1 = ((Method)localObject1).invoke(null, arrayOfObject);
          localObject1 = (Long)localObject1;
          i = (Long)localObject1;
        }
      }
    }
    synchronized (e)
    {
      localObject1 = e;
      localLong = i;
      A = localLong;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/fp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */