package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class aa
{
  static final aa.d a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/aa$c;
      ((aa.c)localObject).<init>();
      a = (aa.d)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 11;
      if (i >= j)
      {
        localObject = new android/support/v4/h/aa$b;
        ((aa.b)localObject).<init>();
        a = (aa.d)localObject;
      }
      else
      {
        localObject = new android/support/v4/h/aa$a;
        ((aa.a)localObject).<init>();
        a = (aa.d)localObject;
      }
    }
  }
  
  public static boolean a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
}


/* Location:              android/support/v4/h/aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */