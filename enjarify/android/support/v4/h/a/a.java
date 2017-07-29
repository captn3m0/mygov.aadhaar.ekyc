package android.support.v4.h.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a
{
  private static final a.e a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/a/a$c;
      ((a.c)localObject).<init>();
      a = (a.e)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 16;
      if (i >= j)
      {
        localObject = new android/support/v4/h/a/a$b;
        ((a.b)localObject).<init>();
        a = (a.e)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 14;
        if (i >= j)
        {
          localObject = new android/support/v4/h/a/a$a;
          ((a.a)localObject).<init>();
          a = (a.e)localObject;
        }
        else
        {
          localObject = new android/support/v4/h/a/a$d;
          ((a.d)localObject).<init>();
          a = (a.e)localObject;
        }
      }
    }
  }
  
  public static f a(AccessibilityEvent paramAccessibilityEvent)
  {
    f localf = new android/support/v4/h/a/f;
    localf.<init>(paramAccessibilityEvent);
    return localf;
  }
  
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    a.a(paramAccessibilityEvent, paramInt);
  }
  
  public static int b(AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(paramAccessibilityEvent);
  }
}


/* Location:              android/support/v4/h/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */