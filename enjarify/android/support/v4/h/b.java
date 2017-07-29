package android.support.v4.h;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.h.a.c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class b
{
  private static final b.b a;
  private static final Object c;
  final Object b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/b$c;
      ((b.c)localObject).<init>();
      a = (b.b)localObject;
    }
    for (;;)
    {
      c = a.a();
      return;
      i = Build.VERSION.SDK_INT;
      j = 14;
      if (i >= j)
      {
        localObject = new android/support/v4/h/b$a;
        ((b.a)localObject).<init>();
        a = (b.b)localObject;
      }
      else
      {
        localObject = new android/support/v4/h/b$d;
        ((b.d)localObject).<init>();
        a = (b.b)localObject;
      }
    }
  }
  
  public b()
  {
    Object localObject = a.a(this);
    b = localObject;
  }
  
  public static c a(View paramView)
  {
    b.b localb = a;
    Object localObject = c;
    return localb.a(localObject, paramView);
  }
  
  public static void a(View paramView, int paramInt)
  {
    b.b localb = a;
    Object localObject = c;
    localb.a(localObject, paramView, paramInt);
  }
  
  public static void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b localb = a;
    Object localObject = c;
    localb.d(localObject, paramView, paramAccessibilityEvent);
  }
  
  public static void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b localb = a;
    Object localObject = c;
    localb.c(localObject, paramView, paramAccessibilityEvent);
  }
  
  public void a(View paramView, android.support.v4.h.a.b paramb)
  {
    b.b localb = a;
    Object localObject = c;
    localb.a(localObject, paramView, paramb);
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b localb = a;
    Object localObject = c;
    localb.b(localObject, paramView, paramAccessibilityEvent);
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    b.b localb = a;
    Object localObject = c;
    return localb.a(localObject, paramView, paramInt, paramBundle);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b localb = a;
    Object localObject = c;
    return localb.a(localObject, paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b localb = a;
    Object localObject = c;
    return localb.a(localObject, paramView, paramAccessibilityEvent);
  }
}


/* Location:              android/support/v4/h/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */