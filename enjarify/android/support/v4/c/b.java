package android.support.v4.c;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class b
{
  private static final b.a a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/c/b$d;
      ((b.d)localObject).<init>();
      a = (b.a)localObject;
    }
    for (;;)
    {
      return;
      j = 11;
      if (i >= j)
      {
        localObject = new android/support/v4/c/b$c;
        ((b.c)localObject).<init>();
        a = (b.a)localObject;
      }
      else
      {
        localObject = new android/support/v4/c/b$b;
        ((b.b)localObject).<init>();
        a = (b.a)localObject;
      }
    }
  }
  
  public static Intent a(ComponentName paramComponentName)
  {
    return a.a(paramComponentName);
  }
}


/* Location:              android/support/v4/c/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */