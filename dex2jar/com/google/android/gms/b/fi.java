package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fi
  extends gm
{
  private static volatile Long i = null;
  private static final Object j = new Object();
  
  public fi(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 22);
  }
  
  protected final void a()
  {
    if (i == null) {
      synchronized (j)
      {
        if (i == null) {
          i = (Long)f.invoke(null, new Object[0]);
        }
      }
    }
    synchronized (e)
    {
      e.u = i;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */