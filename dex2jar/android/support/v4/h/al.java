package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.WindowInsets;

public final class al
{
  public static final d a = new c();
  public final Object b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new b();
      return;
    }
    if (i >= 20)
    {
      a = new a();
      return;
    }
  }
  
  al(Object paramObject)
  {
    b = paramObject;
  }
  
  static al a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return new al(paramObject);
  }
  
  static Object a(al paramal)
  {
    if (paramal == null) {
      return null;
    }
    return b;
  }
  
  public final int a()
  {
    return a.c(b);
  }
  
  public final int b()
  {
    return a.e(b);
  }
  
  public final int c()
  {
    return a.d(b);
  }
  
  public final int d()
  {
    return a.b(b);
  }
  
  public final boolean e()
  {
    return a.g(b);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (al)paramObject;
      if (b != null) {
        break;
      }
    } while (b == null);
    return false;
    return b.equals(b);
  }
  
  public final int hashCode()
  {
    if (b == null) {
      return 0;
    }
    return b.hashCode();
  }
  
  private static class a
    extends al.c
  {
    public final al a(Object paramObject)
    {
      return new al(((WindowInsets)paramObject).consumeSystemWindowInsets());
    }
    
    public final al a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return new al(((WindowInsets)paramObject).replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
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
  
  private static final class b
    extends al.a
  {
    public final boolean g(Object paramObject)
    {
      return ((WindowInsets)paramObject).isConsumed();
    }
  }
  
  private static class c
    implements al.d
  {
    public al a(Object paramObject)
    {
      return null;
    }
    
    public al a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return null;
    }
    
    public int b(Object paramObject)
    {
      return 0;
    }
    
    public int c(Object paramObject)
    {
      return 0;
    }
    
    public int d(Object paramObject)
    {
      return 0;
    }
    
    public int e(Object paramObject)
    {
      return 0;
    }
    
    public boolean f(Object paramObject)
    {
      return false;
    }
    
    public boolean g(Object paramObject)
    {
      return false;
    }
  }
  
  private static abstract interface d
  {
    public abstract al a(Object paramObject);
    
    public abstract al a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract int b(Object paramObject);
    
    public abstract int c(Object paramObject);
    
    public abstract int d(Object paramObject);
    
    public abstract int e(Object paramObject);
    
    public abstract boolean f(Object paramObject);
    
    public abstract boolean g(Object paramObject);
  }
}


/* Location:              android/support/v4/h/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */