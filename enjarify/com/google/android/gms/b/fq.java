package com.google.android.gms.b;

import android.content.Context;
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
    boolean bool1 = true;
    Object localObject1 = e;
    localObject3 = Integer.valueOf(2);
    O = ((Integer)localObject3);
    localObject1 = f;
    Object localObject4 = new Object[bool1];
    Context localContext = b.b();
    localObject4[0] = localContext;
    localObject1 = (Boolean)((Method)localObject1).invoke(null, (Object[])localObject4);
    boolean bool2 = ((Boolean)localObject1).booleanValue();
    localObject3 = e;
    if (bool2 == bool1) {}
    for (;;)
    {
      try
      {
        localObject1 = e;
        i = 1;
        localObject4 = Integer.valueOf(i);
        O = ((Integer)localObject4);
        return;
      }
      finally {}
      localObject1 = e;
      int i = 0;
      localObject4 = null;
      localObject4 = Integer.valueOf(0);
      O = ((Integer)localObject4);
    }
  }
}


/* Location:              com/google/android/gms/b/fq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */