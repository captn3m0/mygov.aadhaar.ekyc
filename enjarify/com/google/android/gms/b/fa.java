package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fa
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
  
  public fa(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 29);
  }
  
  protected final void a()
  {
    Object localObject1 = e;
    ??? = "E";
    x = ((String)???);
    localObject1 = i;
    Object localObject5;
    boolean bool;
    if (localObject1 == null) {
      synchronized (j)
      {
        localObject1 = i;
        if (localObject1 == null)
        {
          localObject1 = f;
          localObject5 = null;
          bool = true;
          Object[] arrayOfObject = new Object[bool];
          Object localObject6 = b;
          localObject6 = ((eu)localObject6).a();
          arrayOfObject[0] = localObject6;
          localObject1 = ((Method)localObject1).invoke(null, arrayOfObject);
          localObject1 = (String)localObject1;
          i = (String)localObject1;
        }
      }
    }
    synchronized (e)
    {
      localObject1 = e;
      localObject5 = i;
      localObject5 = ((String)localObject5).getBytes();
      bool = true;
      localObject5 = bh.a((byte[])localObject5, bool);
      x = ((String)localObject5);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/fa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */