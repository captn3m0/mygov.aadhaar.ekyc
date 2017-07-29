package com.google.android.gms.b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class gm
  implements Callable
{
  protected final String a;
  protected final eu b;
  protected final String c;
  protected final String d;
  protected final bf.a e;
  protected Method f;
  protected final int g;
  protected final int h;
  
  public gm(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt1, int paramInt2)
  {
    String str = getClass().getSimpleName();
    a = str;
    b = parameu;
    c = paramString1;
    d = paramString2;
    e = parama;
    g = paramInt1;
    h = paramInt2;
  }
  
  private Void b()
  {
    for (;;)
    {
      try
      {
        l1 = System.nanoTime();
        localObject = b;
        String str1 = c;
        String str2 = d;
        localObject = ((eu)localObject).a(str1, str2);
        f = ((Method)localObject);
        localObject = f;
        if (localObject != null) {
          continue;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        long l1;
        Object localObject;
        int i;
        int j;
        long l2;
        continue;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        continue;
      }
      return null;
      a();
      localObject = b;
      localObject = j;
      if (localObject != null)
      {
        i = g;
        j = -1 << -1;
        if (i != j)
        {
          i = h;
          j = g;
          l1 = System.nanoTime() - l1;
          l2 = 1000L;
          l1 /= l2;
          ((bl)localObject).a(i, j, l1);
        }
      }
    }
  }
  
  protected abstract void a();
}


/* Location:              com/google/android/gms/b/gm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */