package android.support.v4.h.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

public final class f
{
  public static final c a = new e();
  public final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new a();
      return;
    }
  }
  
  @Deprecated
  public f(Object paramObject)
  {
    b = paramObject;
  }
  
  public final void a(int paramInt)
  {
    a.a(b, paramInt);
  }
  
  public final void a(boolean paramBoolean)
  {
    a.a(b, paramBoolean);
  }
  
  public final void b(int paramInt)
  {
    a.e(b, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (f)paramObject;
        if (b != null) {
          break;
        }
      } while (b == null);
      return false;
    } while (b.equals(b));
    return false;
  }
  
  public final int hashCode()
  {
    if (b == null) {
      return 0;
    }
    return b.hashCode();
  }
  
  static class a
    extends f.e
  {
    public final void a(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setFromIndex(paramInt);
    }
    
    public final void a(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityRecord)paramObject).setScrollable(paramBoolean);
    }
    
    public final void b(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setItemCount(paramInt);
    }
    
    public final void c(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setScrollX(paramInt);
    }
    
    public final void d(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setScrollY(paramInt);
    }
    
    public final void e(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setToIndex(paramInt);
    }
  }
  
  static class b
    extends f.a
  {
    public final void f(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setMaxScrollX(paramInt);
    }
    
    public final void g(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setMaxScrollY(paramInt);
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(Object paramObject, int paramInt);
    
    public abstract void a(Object paramObject, boolean paramBoolean);
    
    public abstract void b(Object paramObject, int paramInt);
    
    public abstract void c(Object paramObject, int paramInt);
    
    public abstract void d(Object paramObject, int paramInt);
    
    public abstract void e(Object paramObject, int paramInt);
    
    public abstract void f(Object paramObject, int paramInt);
    
    public abstract void g(Object paramObject, int paramInt);
  }
  
  static final class d
    extends f.b
  {}
  
  static class e
    implements f.c
  {
    public void a(Object paramObject, int paramInt) {}
    
    public void a(Object paramObject, boolean paramBoolean) {}
    
    public void b(Object paramObject, int paramInt) {}
    
    public void c(Object paramObject, int paramInt) {}
    
    public void d(Object paramObject, int paramInt) {}
    
    public void e(Object paramObject, int paramInt) {}
    
    public void f(Object paramObject, int paramInt) {}
    
    public void g(Object paramObject, int paramInt) {}
  }
}


/* Location:              android/support/v4/h/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */