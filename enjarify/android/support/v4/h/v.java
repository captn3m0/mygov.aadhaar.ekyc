package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class v
{
  static final v.c a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/v$b;
      ((v.b)localObject).<init>();
    }
    for (a = (v.c)localObject;; a = (v.c)localObject)
    {
      return;
      localObject = new android/support/v4/h/v$a;
      ((v.a)localObject).<init>();
    }
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }
  
  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.b(paramVelocityTracker, paramInt);
  }
}


/* Location:              android/support/v4/h/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */