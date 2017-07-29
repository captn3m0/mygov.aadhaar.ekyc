package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fk
  extends gm
{
  private static volatile String i = null;
  private static final Object j;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    j = localObject;
  }
  
  public fk(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 1);
  }
  
  protected final void a()
  {
    Object localObject1 = e;
    ??? = "E";
    a = ((String)???);
    localObject1 = i;
    String str;
    if (localObject1 == null) {
      synchronized (j)
      {
        localObject1 = i;
        if (localObject1 == null)
        {
          localObject1 = f;
          str = null;
          Object[] arrayOfObject = null;
          arrayOfObject = new Object[0];
          localObject1 = ((Method)localObject1).invoke(null, arrayOfObject);
          localObject1 = (String)localObject1;
          i = (String)localObject1;
        }
      }
    }
    synchronized (e)
    {
      localObject1 = e;
      str = i;
      a = str;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/fk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */