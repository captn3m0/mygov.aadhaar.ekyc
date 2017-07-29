package android.support.v4.h;

import android.view.WindowInsets;

class al$a
  extends al.c
{
  public final al a(Object paramObject)
  {
    al localal = new android/support/v4/h/al;
    WindowInsets localWindowInsets = ((WindowInsets)paramObject).consumeSystemWindowInsets();
    localal.<init>(localWindowInsets);
    return localal;
  }
  
  public final al a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    al localal = new android/support/v4/h/al;
    WindowInsets localWindowInsets = ((WindowInsets)paramObject).replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4);
    localal.<init>(localWindowInsets);
    return localal;
  }
  
  public final int b(Object paramObject)
  {
    return ((WindowInsets)paramObject).getSystemWindowInsetBottom();
  }
  
  public final int c(Object paramObject)
  {
    return ((WindowInsets)paramObject).getSystemWindowInsetLeft();
  }
  
  public final int d(Object paramObject)
  {
    return ((WindowInsets)paramObject).getSystemWindowInsetRight();
  }
  
  public final int e(Object paramObject)
  {
    return ((WindowInsets)paramObject).getSystemWindowInsetTop();
  }
  
  public final boolean f(Object paramObject)
  {
    return ((WindowInsets)paramObject).hasSystemWindowInsets();
  }
}


/* Location:              android/support/v4/h/al$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */