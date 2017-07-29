package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class ab
{
  static final ab.c a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/ab$e;
      ((ab.e)localObject).<init>();
      a = (ab.c)localObject;
    }
    for (;;)
    {
      return;
      j = 18;
      if (i >= j)
      {
        localObject = new android/support/v4/h/ab$d;
        ((ab.d)localObject).<init>();
        a = (ab.c)localObject;
      }
      else
      {
        j = 14;
        if (i >= j)
        {
          localObject = new android/support/v4/h/ab$b;
          ((ab.b)localObject).<init>();
          a = (ab.c)localObject;
        }
        else
        {
          j = 11;
          if (i >= j)
          {
            localObject = new android/support/v4/h/ab$a;
            ((ab.a)localObject).<init>();
            a = (ab.c)localObject;
          }
          else
          {
            localObject = new android/support/v4/h/ab$f;
            ((ab.f)localObject).<init>();
            a = (ab.c)localObject;
          }
        }
      }
    }
  }
  
  public static void a(ViewGroup paramViewGroup)
  {
    a.a(paramViewGroup);
  }
}


/* Location:              android/support/v4/h/ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */