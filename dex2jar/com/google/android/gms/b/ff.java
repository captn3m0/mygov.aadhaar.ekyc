package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class ff
  extends gm
{
  private long i;
  
  public ff(eu parameu, String paramString1, String paramString2, bf.a parama, long paramLong, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 25);
    i = paramLong;
  }
  
  protected final void a()
  {
    long l = ((Long)f.invoke(null, new Object[0])).longValue();
    synchronized (e)
    {
      e.ae = Long.valueOf(l);
      if (i != 0L)
      {
        e.q = Long.valueOf(l - i);
        e.v = Long.valueOf(i);
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/ff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */