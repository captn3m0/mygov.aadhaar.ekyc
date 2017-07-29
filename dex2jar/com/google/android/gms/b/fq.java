package com.google.android.gms.b;

import java.lang.reflect.Method;

public final class fq
  extends gm
{
  public fq(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 48);
  }
  
  protected final void a()
  {
    e.O = Integer.valueOf(2);
    boolean bool = ((Boolean)f.invoke(null, new Object[] { b.b() })).booleanValue();
    locala = e;
    if (bool == true) {}
    for (;;)
    {
      try
      {
        e.O = Integer.valueOf(1);
        return;
      }
      finally {}
      e.O = Integer.valueOf(0);
    }
  }
}


/* Location:              com/google/android/gms/b/fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */