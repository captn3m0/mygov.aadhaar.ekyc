package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fn
  extends gm
{
  private final StackTraceElement[] i;
  
  public fn(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt, StackTraceElement[] paramArrayOfStackTraceElement)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 45);
    i = paramArrayOfStackTraceElement;
  }
  
  protected final void a()
  {
    int j = 1;
    Object localObject1 = i;
    Object localObject4;
    es locales;
    if (localObject1 != null)
    {
      localObject1 = f;
      ??? = new Object[j];
      localObject4 = i;
      ???[0] = localObject4;
      localObject1 = (String)((Method)localObject1).invoke(null, (Object[])???);
      locales = new com/google/android/gms/b/es;
      locales.<init>((String)localObject1);
    }
    synchronized (e)
    {
      localObject1 = e;
      localObject4 = a;
      L = ((Long)localObject4);
      localObject1 = b;
      int k = ((Boolean)localObject1).booleanValue();
      if (k != 0)
      {
        localObject4 = e;
        localObject1 = c;
        k = ((Boolean)localObject1).booleanValue();
        if (k != 0)
        {
          k = 0;
          localObject1 = null;
          localObject1 = Integer.valueOf(k);
          V = ((Integer)localObject1);
        }
      }
      else
      {
        return;
      }
      k = j;
    }
  }
}


/* Location:              com/google/android/gms/b/fn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */