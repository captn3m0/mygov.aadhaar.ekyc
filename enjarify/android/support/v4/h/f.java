package android.support.v4.h;

import android.graphics.Rect;
import android.os.Build.VERSION;

public final class f
{
  static final f.a a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/f$c;
      ((f.c)localObject).<init>();
    }
    for (a = (f.a)localObject;; a = (f.a)localObject)
    {
      return;
      localObject = new android/support/v4/h/f$b;
      ((f.b)localObject).<init>();
    }
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
  {
    a.a(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
  }
}


/* Location:              android/support/v4/h/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */