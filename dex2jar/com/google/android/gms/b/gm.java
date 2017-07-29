package com.google.android.gms.b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class gm
  implements Callable
{
  protected final String a = getClass().getSimpleName();
  protected final eu b;
  protected final String c;
  protected final String d;
  protected final bf.a e;
  protected Method f;
  protected final int g;
  protected final int h;
  
  public gm(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt1, int paramInt2)
  {
    b = parameu;
    c = paramString1;
    d = paramString2;
    e = parama;
    g = paramInt1;
    h = paramInt2;
  }
  
  private Void b()
  {
    try
    {
      long l = System.nanoTime();
      f = b.a(c, d);
      if (f == null) {
        return null;
      }
      a();
      bl localbl = b.j;
      if ((localbl != null) && (g != Integer.MIN_VALUE))
      {
        localbl.a(h, g, (System.nanoTime() - l) / 1000L);
        return null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return null;
    }
    catch (InvocationTargetException localInvocationTargetException) {}
    return null;
  }
  
  protected abstract void a();
}


/* Location:              com/google/android/gms/b/gm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */