package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class l
{
  static final l.a a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/l$c;
      ((l.c)localObject).<init>();
    }
    for (a = (l.a)localObject;; a = (l.a)localObject)
    {
      return;
      localObject = new android/support/v4/h/l$b;
      ((l.b)localObject).<init>();
    }
  }
  
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.a(paramMarginLayoutParams);
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.b(paramMarginLayoutParams);
  }
}


/* Location:              android/support/v4/h/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */