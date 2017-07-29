package com.google.android.gms.b;

import android.view.View;
import java.lang.reflect.Method;

public final class fs
  extends gm
{
  private final View i;
  
  public fs(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt, View paramView)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 57);
    i = paramView;
  }
  
  protected final void a()
  {
    Object localObject1 = i;
    Object localObject3;
    Object localObject4;
    if (localObject1 != null)
    {
      localObject3 = new com/google/android/gms/b/ex;
      localObject1 = f;
      int j = 1;
      localObject4 = new Object[j];
      View localView = i;
      localObject4[0] = localView;
      localObject1 = (String)((Method)localObject1).invoke(null, (Object[])localObject4);
      ((ex)localObject3).<init>((String)localObject1);
    }
    synchronized (e)
    {
      localObject1 = e;
      localObject4 = new com/google/android/gms/b/bf$a$b;
      ((bf.a.b)localObject4).<init>();
      Y = ((bf.a.b)localObject4);
      localObject1 = e;
      localObject1 = Y;
      localObject3 = a;
      c = ((Long)localObject3);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/fs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */