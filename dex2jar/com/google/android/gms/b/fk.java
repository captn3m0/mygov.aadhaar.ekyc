package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fk
  extends gm
{
  private static volatile String i = null;
  private static final Object j = new Object();
  
  public fk(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 1);
  }
  
  protected final void a()
  {
    e.a = "E";
    if (i == null) {
      synchronized (j)
      {
        if (i == null) {
          i = (String)f.invoke(null, new Object[0]);
        }
      }
    }
    synchronized (e)
    {
      e.a = i;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */