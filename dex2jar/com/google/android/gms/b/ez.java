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
    e.P = Integer.valueOf(2);
    for (;;)
    {
      try
      {
        boolean bool = ((Boolean)f.invoke(null, new Object[] { b.b() })).booleanValue();
        bf.a locala = e;
        if (bool)
        {
          i = 1;
          P = Integer.valueOf(i);
          return;
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        int i;
        if ((localInvocationTargetException.getTargetException() instanceof Settings.SettingNotFoundException)) {
          continue;
        }
        throw localInvocationTargetException;
      }
      i = 0;
    }
  }
}


/* Location:              com/google/android/gms/b/ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */