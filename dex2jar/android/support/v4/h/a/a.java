package android.support.v4.h.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a
{
  private static final e a = new d();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
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
  
  public static f a(AccessibilityEvent paramAccessibilityEvent)
  {
    return new f(paramAccessibilityEvent);
  }
  
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    a.a(paramAccessibilityEvent, paramInt);
  }
  
  public static int b(AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(paramAccessibilityEvent);
  }
  
  static class a
    extends a.d
  {}
  
  static class b
    extends a.a
  {}
  
  static final class c
    extends a.b
  {
    public final int a(AccessibilityEvent paramAccessibilityEvent)
    {
      return paramAccessibilityEvent.getContentChangeTypes();
    }
    
    public final void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
    {
      paramAccessibilityEvent.setContentChangeTypes(paramInt);
    }
  }
  
  static class d
    implements a.e
  {
    public int a(AccessibilityEvent paramAccessibilityEvent)
    {
      return 0;
    }
    
    public void a(AccessibilityEvent paramAccessibilityEvent, int paramInt) {}
  }
  
  static abstract interface e
  {
    public abstract int a(AccessibilityEvent paramAccessibilityEvent);
    
    public abstract void a(AccessibilityEvent paramAccessibilityEvent, int paramInt);
  }
}


/* Location:              android/support/v4/h/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */