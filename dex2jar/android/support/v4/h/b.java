package android.support.v4.h;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.h.a.c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class b
{
  private static final b a;
  private static final Object c;
  final Object b = a.a(this);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {
      a = new c();
    }
    for (;;)
    {
      c = a.a();
      return;
      if (Build.VERSION.SDK_INT >= 14) {
        a = new a();
      } else {
        a = new d();
      }
    }
  }
  
  public static c a(View paramView)
  {
    return a.a(c, paramView);
  }
  
  public static void a(View paramView, int paramInt)
  {
    a.a(c, paramView, paramInt);
  }
  
  public static void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.d(c, paramView, paramAccessibilityEvent);
  }
  
  public static void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.c(c, paramView, paramAccessibilityEvent);
  }
  
  public void a(View paramView, android.support.v4.h.a.b paramb)
  {
    a.a(c, paramView, paramb);
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.b(c, paramView, paramAccessibilityEvent);
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return a.a(c, paramView, paramInt, paramBundle);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(c, paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(c, paramView, paramAccessibilityEvent);
  }
  
  static class a
    extends b.d
  {
    public final Object a()
    {
      return new View.AccessibilityDelegate();
    }
    
    public Object a(final b paramb)
    {
      new c.1(new c.a()
      {
        public final void a(View paramAnonymousView, int paramAnonymousInt)
        {
          b.a(paramAnonymousView, paramAnonymousInt);
        }
        
        public final void a(View paramAnonymousView, Object paramAnonymousObject)
        {
          paramb.a(paramAnonymousView, new android.support.v4.h.a.b(paramAnonymousObject));
        }
        
        public final boolean a(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          return paramb.c(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
        
        public final boolean a(ViewGroup paramAnonymousViewGroup, View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          return paramb.a(paramAnonymousViewGroup, paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
        
        public final void b(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          paramb.a(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
        
        public final void c(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          b.d(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
        
        public final void d(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          b.b(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
      });
    }
    
    public final void a(Object paramObject, View paramView, int paramInt)
    {
      ((View.AccessibilityDelegate)paramObject).sendAccessibilityEvent(paramView, paramInt);
    }
    
    public final void a(Object paramObject, View paramView, android.support.v4.h.a.b paramb)
    {
      paramb = b;
      ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityNodeInfo(paramView, (AccessibilityNodeInfo)paramb);
    }
    
    public final boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return ((View.AccessibilityDelegate)paramObject).dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public final boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return ((View.AccessibilityDelegate)paramObject).onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    
    public final void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public final void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      ((View.AccessibilityDelegate)paramObject).onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public final void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      ((View.AccessibilityDelegate)paramObject).sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
    }
  }
  
  static abstract interface b
  {
    public abstract c a(Object paramObject, View paramView);
    
    public abstract Object a();
    
    public abstract Object a(b paramb);
    
    public abstract void a(Object paramObject, View paramView, int paramInt);
    
    public abstract void a(Object paramObject, View paramView, android.support.v4.h.a.b paramb);
    
    public abstract boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle);
    
    public abstract boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent);
    
    public abstract boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent);
    
    public abstract void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent);
    
    public abstract void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent);
    
    public abstract void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent);
  }
  
  static final class c
    extends b.a
  {
    public final c a(Object paramObject, View paramView)
    {
      paramObject = ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
      if (paramObject != null) {
        return new c(paramObject);
      }
      return null;
    }
    
    public final Object a(final b paramb)
    {
      new d.1(new d.a()
      {
        public final Object a(View paramAnonymousView)
        {
          paramAnonymousView = b.a(paramAnonymousView);
          if (paramAnonymousView != null) {
            return a;
          }
          return null;
        }
        
        public final void a(View paramAnonymousView, int paramAnonymousInt)
        {
          b.a(paramAnonymousView, paramAnonymousInt);
        }
        
        public final void a(View paramAnonymousView, Object paramAnonymousObject)
        {
          paramb.a(paramAnonymousView, new android.support.v4.h.a.b(paramAnonymousObject));
        }
        
        public final boolean a(View paramAnonymousView, int paramAnonymousInt, Bundle paramAnonymousBundle)
        {
          return paramb.a(paramAnonymousView, paramAnonymousInt, paramAnonymousBundle);
        }
        
        public final boolean a(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          return paramb.c(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
        
        public final boolean a(ViewGroup paramAnonymousViewGroup, View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          return paramb.a(paramAnonymousViewGroup, paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
        
        public final void b(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          paramb.a(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
        
        public final void c(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          b.d(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
        
        public final void d(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          b.b(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
      });
    }
    
    public final boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
    {
      return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
    }
  }
  
  static class d
    implements b.b
  {
    public c a(Object paramObject, View paramView)
    {
      return null;
    }
    
    public Object a()
    {
      return null;
    }
    
    public Object a(b paramb)
    {
      return null;
    }
    
    public void a(Object paramObject, View paramView, int paramInt) {}
    
    public void a(Object paramObject, View paramView, android.support.v4.h.a.b paramb) {}
    
    public boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
    {
      return false;
    }
    
    public boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return false;
    }
    
    public boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return true;
    }
    
    public void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent) {}
    
    public void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent) {}
    
    public void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent) {}
  }
}


/* Location:              android/support/v4/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */