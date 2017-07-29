package android.support.v4.h;

import android.graphics.Rect;
import android.view.Gravity;

final class f$c
  implements f.a
{
  public final int a(int paramInt1, int paramInt2)
  {
    return Gravity.getAbsoluteGravity(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
  {
    Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
  }
}


/* Location:              android/support/v4/h/f$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */