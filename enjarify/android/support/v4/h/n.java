package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class n
{
  static final n.d a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/n$c;
      ((n.c)localObject).<init>();
      a = (n.d)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 12;
      if (i >= j)
      {
        localObject = new android/support/v4/h/n$b;
        ((n.b)localObject).<init>();
        a = (n.d)localObject;
      }
      else
      {
        localObject = new android/support/v4/h/n$a;
        ((n.a)localObject).<init>();
        a = (n.d)localObject;
      }
    }
  }
  
  public static float a(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.a(paramMotionEvent, paramInt);
  }
  
  public static int a(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getAction() & 0xFF;
  }
  
  public static int b(MotionEvent paramMotionEvent)
  {
    return (paramMotionEvent.getAction() & 0xFF00) >> 8;
  }
}


/* Location:              android/support/v4/h/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */