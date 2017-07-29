package com.google.android.gms.b;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ez
  extends gm
{
  public ez(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 49);
  }
  
  protected final void a()
  {
    i = 1;
    Object localObject1 = e;
    int j = 2;
    Object localObject2 = Integer.valueOf(j);
    P = ((Integer)localObject2);
    for (;;)
    {
      try
      {
        localObject1 = f;
        j = 0;
        localObject2 = null;
        int k = 1;
        Object[] arrayOfObject = new Object[k];
        Object localObject3 = b;
        localObject3 = ((eu)localObject3).b();
        arrayOfObject[0] = localObject3;
        localObject1 = ((Method)localObject1).invoke(null, arrayOfObject);
        localObject1 = (Boolean)localObject1;
        int m = ((Boolean)localObject1).booleanValue();
        localObject2 = e;
        if (m != 0)
        {
          m = i;
          localObject1 = Integer.valueOf(m);
          P = ((Integer)localObject1);
          return;
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        int n;
        Throwable localThrowable = localInvocationTargetException.getTargetException();
        i = localThrowable instanceof Settings.SettingNotFoundException;
        if (i != 0) {
          continue;
        }
        throw localInvocationTargetException;
      }
      n = 0;
      localObject1 = null;
    }
  }
}


/* Location:              com/google/android/gms/b/ez.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */