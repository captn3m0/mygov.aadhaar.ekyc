package android.support.v4.h.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public final class b
{
  public static final g a = new l();
  public final Object b;
  public int c = -1;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 24)
    {
      a = new e();
      return;
    }
    if (Build.VERSION.SDK_INT >= 23)
    {
      a = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 22)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new k();
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      a = new j();
      return;
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new i();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new h();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new f();
      return;
    }
  }
  
  public b(Object paramObject)
  {
    b = paramObject;
  }
  
  public static b a(b paramb)
  {
    paramb = a.a(b);
    if (paramb != null) {
      return new b(paramb);
    }
    return null;
  }
  
  public final int a()
  {
    return a.b(b);
  }
  
  public final void a(int paramInt)
  {
    a.a(b, paramInt);
  }
  
  public final void a(Rect paramRect)
  {
    a.a(b, paramRect);
  }
  
  public final void a(View paramView)
  {
    a.b(b, paramView);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    a.a(b, paramCharSequence);
  }
  
  public final void a(Object paramObject)
  {
    a.c(b, a);
  }
  
  public final void a(boolean paramBoolean)
  {
    a.a(b, paramBoolean);
  }
  
  public final boolean a(a parama)
  {
    return a.a(b, E);
  }
  
  public final void b(Rect paramRect)
  {
    a.b(b, paramRect);
  }
  
  public final void b(boolean paramBoolean)
  {
    a.e(b, paramBoolean);
  }
  
  public final boolean b()
  {
    return a.k(b);
  }
  
  public final void c(boolean paramBoolean)
  {
    a.f(b, paramBoolean);
  }
  
  public final boolean c()
  {
    return a.l(b);
  }
  
  public final boolean d()
  {
    return a.p(b);
  }
  
  public final boolean e()
  {
    return a.i(b);
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
        paramObject = (b)paramObject;
        if (b != null) {
          break;
        }
      } while (b == null);
      return false;
    } while (b.equals(b));
    return false;
  }
  
  public final boolean f()
  {
    return a.m(b);
  }
  
  public final boolean g()
  {
    return a.j(b);
  }
  
  public final void h()
  {
    a.q(b);
  }
  
  public final int hashCode()
  {
    if (b == null) {
      return 0;
    }
    return b.hashCode();
  }
  
  public final CharSequence i()
  {
    return a.e(b);
  }
  
  public final CharSequence j()
  {
    return a.c(b);
  }
  
  public final CharSequence k()
  {
    return a.d(b);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Object localObject = new Rect();
    a((Rect)localObject);
    localStringBuilder.append("; boundsInParent: " + localObject);
    b((Rect)localObject);
    localStringBuilder.append("; boundsInScreen: " + localObject);
    localStringBuilder.append("; packageName: ").append(i());
    localStringBuilder.append("; className: ").append(j());
    localStringBuilder.append("; text: ").append(a.f(b));
    localStringBuilder.append("; contentDescription: ").append(k());
    localStringBuilder.append("; viewId: ").append(a.u(b));
    localStringBuilder.append("; checkable: ").append(a.g(b));
    localStringBuilder.append("; checked: ").append(a.h(b));
    localStringBuilder.append("; focusable: ").append(b());
    localStringBuilder.append("; focused: ").append(c());
    localStringBuilder.append("; selected: ").append(d());
    localStringBuilder.append("; clickable: ").append(e());
    localStringBuilder.append("; longClickable: ").append(f());
    localStringBuilder.append("; enabled: ").append(g());
    localStringBuilder.append("; password: ").append(a.n(b));
    localStringBuilder.append("; scrollable: " + a.o(b));
    localStringBuilder.append("; [");
    int i = a();
    if (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      i = (j ^ 0xFFFFFFFF) & i;
      switch (j)
      {
      default: 
        localObject = "ACTION_UNKNOWN";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        if (i != 0) {
          localStringBuilder.append(", ");
        }
        break;
        localObject = "ACTION_FOCUS";
        continue;
        localObject = "ACTION_CLEAR_FOCUS";
        continue;
        localObject = "ACTION_SELECT";
        continue;
        localObject = "ACTION_CLEAR_SELECTION";
        continue;
        localObject = "ACTION_CLICK";
        continue;
        localObject = "ACTION_LONG_CLICK";
        continue;
        localObject = "ACTION_ACCESSIBILITY_FOCUS";
        continue;
        localObject = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue;
        localObject = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject = "ACTION_NEXT_HTML_ELEMENT";
        continue;
        localObject = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue;
        localObject = "ACTION_SCROLL_FORWARD";
        continue;
        localObject = "ACTION_SCROLL_BACKWARD";
        continue;
        localObject = "ACTION_CUT";
        continue;
        localObject = "ACTION_COPY";
        continue;
        localObject = "ACTION_PASTE";
        continue;
        localObject = "ACTION_SET_SELECTION";
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static final a A = new a(b.a.d());
    public static final a B = new a(b.a.f());
    public static final a C = new a(b.a.g());
    public static final a D = new a(b.a.h());
    public static final a a = new a(1);
    public static final a b = new a(2);
    public static final a c = new a(4);
    public static final a d = new a(8);
    public static final a e = new a(16);
    public static final a f = new a(32);
    public static final a g = new a(64);
    public static final a h = new a(128);
    public static final a i = new a(256);
    public static final a j = new a(512);
    public static final a k = new a(1024);
    public static final a l = new a(2048);
    public static final a m = new a(4096);
    public static final a n = new a(8192);
    public static final a o = new a(16384);
    public static final a p = new a(32768);
    public static final a q = new a(65536);
    public static final a r = new a(131072);
    public static final a s = new a(262144);
    public static final a t = new a(524288);
    public static final a u = new a(1048576);
    public static final a v = new a(2097152);
    public static final a w = new a(b.a.b());
    public static final a x = new a(b.a.a());
    public static final a y = new a(b.a.c());
    public static final a z = new a(b.a.e());
    final Object E;
    
    private a(int paramInt)
    {
      this(b.a.a(paramInt));
    }
    
    private a(Object paramObject)
    {
      E = paramObject;
    }
  }
  
  static class b
    extends b.k
  {
    public final Object a(int paramInt)
    {
      return new AccessibilityNodeInfo.AccessibilityAction(paramInt, null);
    }
    
    public final Object a(int paramInt1, int paramInt2)
    {
      return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false, 0);
    }
    
    public final Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, false);
    }
    
    public final boolean a(Object paramObject1, Object paramObject2)
    {
      return ((AccessibilityNodeInfo)paramObject1).removeAction((AccessibilityNodeInfo.AccessibilityAction)paramObject2);
    }
  }
  
  static class c
    extends b.b
  {}
  
  static class d
    extends b.c
  {
    public final Object a()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
    }
    
    public final Object b()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
    }
    
    public final Object c()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
    }
    
    public final Object d()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
    }
    
    public final Object e()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
    }
    
    public final Object f()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
    }
    
    public final Object g()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
    }
  }
  
  static final class e
    extends b.d
  {
    public final Object h()
    {
      return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
    }
  }
  
  static class f
    extends b.l
  {
    public final Object a(Object paramObject)
    {
      return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)paramObject);
    }
    
    public final void a(Object paramObject, int paramInt)
    {
      ((AccessibilityNodeInfo)paramObject).addAction(paramInt);
    }
    
    public final void a(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).getBoundsInParent(paramRect);
    }
    
    public final void a(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).addChild(paramView);
    }
    
    public final void a(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setClassName(paramCharSequence);
    }
    
    public final void a(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setCheckable(paramBoolean);
    }
    
    public final int b(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getActions();
    }
    
    public final void b(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).getBoundsInScreen(paramRect);
    }
    
    public final void b(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).setParent(paramView);
    }
    
    public final void b(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setContentDescription(paramCharSequence);
    }
    
    public final void b(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setChecked(paramBoolean);
    }
    
    public final CharSequence c(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getClassName();
    }
    
    public final void c(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).setBoundsInParent(paramRect);
    }
    
    public final void c(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).setSource(paramView);
    }
    
    public final void c(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setPackageName(paramCharSequence);
    }
    
    public final void c(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setClickable(paramBoolean);
    }
    
    public final CharSequence d(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getContentDescription();
    }
    
    public final void d(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).setBoundsInScreen(paramRect);
    }
    
    public final void d(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setEnabled(paramBoolean);
    }
    
    public final CharSequence e(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getPackageName();
    }
    
    public final void e(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setFocusable(paramBoolean);
    }
    
    public final CharSequence f(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getText();
    }
    
    public final void f(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setFocused(paramBoolean);
    }
    
    public final void g(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setLongClickable(paramBoolean);
    }
    
    public final boolean g(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isCheckable();
    }
    
    public final void h(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setSelected(paramBoolean);
    }
    
    public final boolean h(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isChecked();
    }
    
    public final boolean i(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isClickable();
    }
    
    public final boolean j(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isEnabled();
    }
    
    public final boolean k(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isFocusable();
    }
    
    public final boolean l(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isFocused();
    }
    
    public final boolean m(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isLongClickable();
    }
    
    public final boolean n(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isPassword();
    }
    
    public final boolean o(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isScrollable();
    }
    
    public final boolean p(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isSelected();
    }
    
    public final void q(Object paramObject)
    {
      ((AccessibilityNodeInfo)paramObject).setScrollable(true);
    }
    
    public final void r(Object paramObject)
    {
      ((AccessibilityNodeInfo)paramObject).recycle();
    }
  }
  
  public static abstract interface g
  {
    public abstract Object a();
    
    public abstract Object a(int paramInt);
    
    public abstract Object a(int paramInt1, int paramInt2);
    
    public abstract Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean);
    
    public abstract Object a(Object paramObject);
    
    public abstract void a(Object paramObject, int paramInt);
    
    public abstract void a(Object paramObject, Rect paramRect);
    
    public abstract void a(Object paramObject, View paramView);
    
    public abstract void a(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void a(Object paramObject, boolean paramBoolean);
    
    public abstract boolean a(Object paramObject1, Object paramObject2);
    
    public abstract int b(Object paramObject);
    
    public abstract Object b();
    
    public abstract void b(Object paramObject, Rect paramRect);
    
    public abstract void b(Object paramObject, View paramView);
    
    public abstract void b(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void b(Object paramObject1, Object paramObject2);
    
    public abstract void b(Object paramObject, boolean paramBoolean);
    
    public abstract CharSequence c(Object paramObject);
    
    public abstract Object c();
    
    public abstract void c(Object paramObject, Rect paramRect);
    
    public abstract void c(Object paramObject, View paramView);
    
    public abstract void c(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void c(Object paramObject1, Object paramObject2);
    
    public abstract void c(Object paramObject, boolean paramBoolean);
    
    public abstract CharSequence d(Object paramObject);
    
    public abstract Object d();
    
    public abstract void d(Object paramObject, Rect paramRect);
    
    public abstract void d(Object paramObject, boolean paramBoolean);
    
    public abstract CharSequence e(Object paramObject);
    
    public abstract Object e();
    
    public abstract void e(Object paramObject, boolean paramBoolean);
    
    public abstract CharSequence f(Object paramObject);
    
    public abstract Object f();
    
    public abstract void f(Object paramObject, boolean paramBoolean);
    
    public abstract Object g();
    
    public abstract void g(Object paramObject, boolean paramBoolean);
    
    public abstract boolean g(Object paramObject);
    
    public abstract Object h();
    
    public abstract void h(Object paramObject, boolean paramBoolean);
    
    public abstract boolean h(Object paramObject);
    
    public abstract void i(Object paramObject, boolean paramBoolean);
    
    public abstract boolean i(Object paramObject);
    
    public abstract void j(Object paramObject, boolean paramBoolean);
    
    public abstract boolean j(Object paramObject);
    
    public abstract boolean k(Object paramObject);
    
    public abstract boolean l(Object paramObject);
    
    public abstract boolean m(Object paramObject);
    
    public abstract boolean n(Object paramObject);
    
    public abstract boolean o(Object paramObject);
    
    public abstract boolean p(Object paramObject);
    
    public abstract void q(Object paramObject);
    
    public abstract void r(Object paramObject);
    
    public abstract boolean s(Object paramObject);
    
    public abstract boolean t(Object paramObject);
    
    public abstract String u(Object paramObject);
  }
  
  static class h
    extends b.f
  {
    public final void i(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setVisibleToUser(paramBoolean);
    }
    
    public final void j(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setAccessibilityFocused(paramBoolean);
    }
    
    public final boolean s(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isVisibleToUser();
    }
    
    public final boolean t(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isAccessibilityFocused();
    }
  }
  
  static class i
    extends b.h
  {}
  
  static class j
    extends b.i
  {
    public final String u(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getViewIdResourceName();
    }
  }
  
  static class k
    extends b.j
  {
    public Object a(int paramInt1, int paramInt2)
    {
      return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false);
    }
    
    public Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
    }
    
    public final void b(Object paramObject1, Object paramObject2)
    {
      ((AccessibilityNodeInfo)paramObject1).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject2);
    }
    
    public final void c(Object paramObject1, Object paramObject2)
    {
      ((AccessibilityNodeInfo)paramObject1).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject2);
    }
  }
  
  static class l
    implements b.g
  {
    public Object a()
    {
      return null;
    }
    
    public Object a(int paramInt)
    {
      return null;
    }
    
    public Object a(int paramInt1, int paramInt2)
    {
      return null;
    }
    
    public Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return null;
    }
    
    public Object a(Object paramObject)
    {
      return null;
    }
    
    public void a(Object paramObject, int paramInt) {}
    
    public void a(Object paramObject, Rect paramRect) {}
    
    public void a(Object paramObject, View paramView) {}
    
    public void a(Object paramObject, CharSequence paramCharSequence) {}
    
    public void a(Object paramObject, boolean paramBoolean) {}
    
    public boolean a(Object paramObject1, Object paramObject2)
    {
      return false;
    }
    
    public int b(Object paramObject)
    {
      return 0;
    }
    
    public Object b()
    {
      return null;
    }
    
    public void b(Object paramObject, Rect paramRect) {}
    
    public void b(Object paramObject, View paramView) {}
    
    public void b(Object paramObject, CharSequence paramCharSequence) {}
    
    public void b(Object paramObject1, Object paramObject2) {}
    
    public void b(Object paramObject, boolean paramBoolean) {}
    
    public CharSequence c(Object paramObject)
    {
      return null;
    }
    
    public Object c()
    {
      return null;
    }
    
    public void c(Object paramObject, Rect paramRect) {}
    
    public void c(Object paramObject, View paramView) {}
    
    public void c(Object paramObject, CharSequence paramCharSequence) {}
    
    public void c(Object paramObject1, Object paramObject2) {}
    
    public void c(Object paramObject, boolean paramBoolean) {}
    
    public CharSequence d(Object paramObject)
    {
      return null;
    }
    
    public Object d()
    {
      return null;
    }
    
    public void d(Object paramObject, Rect paramRect) {}
    
    public void d(Object paramObject, boolean paramBoolean) {}
    
    public CharSequence e(Object paramObject)
    {
      return null;
    }
    
    public Object e()
    {
      return null;
    }
    
    public void e(Object paramObject, boolean paramBoolean) {}
    
    public CharSequence f(Object paramObject)
    {
      return null;
    }
    
    public Object f()
    {
      return null;
    }
    
    public void f(Object paramObject, boolean paramBoolean) {}
    
    public Object g()
    {
      return null;
    }
    
    public void g(Object paramObject, boolean paramBoolean) {}
    
    public boolean g(Object paramObject)
    {
      return false;
    }
    
    public Object h()
    {
      return null;
    }
    
    public void h(Object paramObject, boolean paramBoolean) {}
    
    public boolean h(Object paramObject)
    {
      return false;
    }
    
    public void i(Object paramObject, boolean paramBoolean) {}
    
    public boolean i(Object paramObject)
    {
      return false;
    }
    
    public void j(Object paramObject, boolean paramBoolean) {}
    
    public boolean j(Object paramObject)
    {
      return false;
    }
    
    public boolean k(Object paramObject)
    {
      return false;
    }
    
    public boolean l(Object paramObject)
    {
      return false;
    }
    
    public boolean m(Object paramObject)
    {
      return false;
    }
    
    public boolean n(Object paramObject)
    {
      return false;
    }
    
    public boolean o(Object paramObject)
    {
      return false;
    }
    
    public boolean p(Object paramObject)
    {
      return false;
    }
    
    public void q(Object paramObject) {}
    
    public void r(Object paramObject) {}
    
    public boolean s(Object paramObject)
    {
      return false;
    }
    
    public boolean t(Object paramObject)
    {
      return false;
    }
    
    public String u(Object paramObject)
    {
      return null;
    }
  }
  
  public static final class m
  {
    public final Object a;
    
    public m(Object paramObject)
    {
      a = paramObject;
    }
  }
  
  public static final class n
  {
    final Object a;
    
    private n(Object paramObject)
    {
      a = paramObject;
    }
    
    public static n a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return new n(b.a.a(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean));
    }
  }
}


/* Location:              android/support/v4/h/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */