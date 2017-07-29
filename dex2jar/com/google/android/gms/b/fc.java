package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fc
  extends gm
{
  public fc(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 5);
  }
  
  protected final void a()
  {
    e.e = Long.valueOf(-1L);
    e.f = Long.valueOf(-1L);
    int[] arrayOfInt = (int[])f.invoke(null, new Object[] { b.a() });
    synchronized (e)
    {
      e.e = Long.valueOf(arrayOfInt[0]);
      e.f = Long.valueOf(arrayOfInt[1]);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */