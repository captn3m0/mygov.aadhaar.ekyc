package android.support.v4.h;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

public final class f
{
  static final a a = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new c();
      return;
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
  
  static abstract interface a
  {
    public abstract int a(int paramInt1, int paramInt2);
    
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4);
  }
  
  static final class b
    implements f.a
  {
    public final int a(int paramInt1, int paramInt2)
    {
      return 0xFF7FFFFF & paramInt1;
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
    {
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2);
    }
  }
  
  static final class c
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
}


/* Location:              android/support/v4/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */