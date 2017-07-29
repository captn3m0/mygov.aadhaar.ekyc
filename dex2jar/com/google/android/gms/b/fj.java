package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fj
  extends gm
{
  private long i = -1L;
  
  public fj(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 12);
  }
  
  protected final void a()
  {
    e.l = Long.valueOf(-1L);
    if (i == -1L) {
      i = ((Integer)f.invoke(null, new Object[] { b.a() })).intValue();
    }
    synchronized (e)
    {
      e.l = Long.valueOf(i);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/fj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */