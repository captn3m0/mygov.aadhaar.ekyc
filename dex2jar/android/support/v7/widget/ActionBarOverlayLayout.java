package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.ai;
import android.support.v4.h.aj;
import android.support.v4.h.q;
import android.support.v4.h.r;
import android.support.v4.h.w;
import android.support.v4.widget.m;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.view.menu.o.a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements q, ad
{
  static final int[] f = { a.a.actionBarSize, 16842841 };
  private final Runnable A = new Runnable()
  {
    public final void run()
    {
      a();
      d = w.s(a).c(-a.getHeight()).a(e);
    }
  };
  private final r B;
  ActionBarContainer a;
  public boolean b;
  boolean c;
  android.support.v4.h.ae d;
  final ai e = new aj()
  {
    public final void b(View paramAnonymousView)
    {
      d = null;
      c = false;
    }
    
    public final void c(View paramAnonymousView)
    {
      d = null;
      c = false;
    }
  };
  private int g;
  private int h = 0;
  private ContentFrameLayout i;
  private ae j;
  private Drawable k;
  private boolean l;
  private boolean m;
  private boolean n;
  private int o;
  private int p;
  private final Rect q = new Rect();
  private final Rect r = new Rect();
  private final Rect s = new Rect();
  private final Rect t = new Rect();
  private final Rect u = new Rect();
  private final Rect v = new Rect();
  private a w;
  private final int x = 600;
  private m y;
  private final Runnable z = new Runnable()
  {
    public final void run()
    {
      a();
      d = w.s(a).c(0.0F).a(e);
    }
  };
  
  public ActionBarOverlayLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    B = new r(this);
  }
  
  private void a(Context paramContext)
  {
    boolean bool2 = true;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(f);
    g = localTypedArray.getDimensionPixelSize(0, 0);
    k = localTypedArray.getDrawable(1);
    if (k == null)
    {
      bool1 = true;
      setWillNotDraw(bool1);
      localTypedArray.recycle();
      if (getApplicationInfotargetSdkVersion >= 19) {
        break label91;
      }
    }
    label91:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      l = bool1;
      y = m.a(paramContext, null);
      return;
      bool1 = false;
      break;
    }
  }
  
  private static boolean a(View paramView, Rect paramRect, boolean paramBoolean)
  {
    boolean bool = false;
    paramView = (b)paramView.getLayoutParams();
    if (leftMargin != left)
    {
      leftMargin = left;
      bool = true;
    }
    if (topMargin != top)
    {
      topMargin = top;
      bool = true;
    }
    if (rightMargin != right)
    {
      rightMargin = right;
      bool = true;
    }
    if ((paramBoolean) && (bottomMargin != bottom))
    {
      bottomMargin = bottom;
      return true;
    }
    return bool;
  }
  
  private void i()
  {
    if (i == null)
    {
      i = ((ContentFrameLayout)findViewById(a.f.action_bar_activity_content));
      a = ((ActionBarContainer)findViewById(a.f.action_bar_container));
      localObject = findViewById(a.f.action_bar);
      if (!(localObject instanceof ae)) {
        break label61;
      }
    }
    for (Object localObject = (ae)localObject;; localObject = ((Toolbar)localObject).getWrapper())
    {
      j = ((ae)localObject);
      return;
      label61:
      if (!(localObject instanceof Toolbar)) {
        break;
      }
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + localObject.getClass().getSimpleName());
  }
  
  final void a()
  {
    removeCallbacks(z);
    removeCallbacks(A);
    if (d != null) {
      d.a();
    }
  }
  
  public final void a(int paramInt)
  {
    i();
    switch (paramInt)
    {
    default: 
      return;
    case 2: 
      j.f();
      return;
    case 5: 
      j.g();
      return;
    }
    setOverlayMode(true);
  }
  
  public final void a(Menu paramMenu, o.a parama)
  {
    i();
    j.a(paramMenu, parama);
  }
  
  public final boolean b()
  {
    i();
    return j.h();
  }
  
  public final boolean c()
  {
    i();
    return j.i();
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof b;
  }
  
  public final boolean d()
  {
    i();
    return j.j();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((k != null) && (!l)) {
      if (a.getVisibility() != 0) {
        break label82;
      }
    }
    label82:
    for (int i1 = (int)(a.getBottom() + w.o(a) + 0.5F);; i1 = 0)
    {
      k.setBounds(0, i1, getWidth(), k.getIntrinsicHeight() + i1);
      k.draw(paramCanvas);
      return;
    }
  }
  
  public final boolean e()
  {
    i();
    return j.k();
  }
  
  public final boolean f()
  {
    i();
    return j.l();
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    i();
    w.v(this);
    boolean bool = a(a, paramRect, false);
    t.set(paramRect);
    bk.a(this, t, q);
    if (!r.equals(q))
    {
      r.set(q);
      bool = true;
    }
    if (bool) {
      requestLayout();
    }
    return true;
  }
  
  public final void g()
  {
    i();
    j.m();
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new b(paramLayoutParams);
  }
  
  public int getActionBarHideOffset()
  {
    if (a != null) {
      return -(int)w.o(a);
    }
    return 0;
  }
  
  public int getNestedScrollAxes()
  {
    return B.a;
  }
  
  public CharSequence getTitle()
  {
    i();
    return j.e();
  }
  
  public final void h()
  {
    i();
    j.n();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    a(getContext());
    w.w(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    getPaddingRight();
    paramInt4 = getPaddingTop();
    getPaddingBottom();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        b localb = (b)localView.getLayoutParams();
        int i1 = localView.getMeasuredWidth();
        int i2 = localView.getMeasuredHeight();
        int i3 = leftMargin + paramInt3;
        int i4 = topMargin + paramInt4;
        localView.layout(i3, i4, i1 + i3, i2 + i4);
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    i();
    measureChildWithMargins(a, paramInt1, 0, paramInt2, 0);
    Object localObject = (b)a.getLayoutParams();
    int i6 = Math.max(0, a.getMeasuredWidth() + leftMargin + rightMargin);
    int i1 = a.getMeasuredHeight();
    int i2 = topMargin;
    int i5 = Math.max(0, bottomMargin + (i1 + i2));
    int i4 = bk.a(0, w.j(a));
    int i3;
    if ((w.v(this) & 0x100) != 0)
    {
      i2 = 1;
      if (i2 == 0) {
        break label444;
      }
      i3 = g;
      i1 = i3;
      if (m)
      {
        i1 = i3;
        if (a.getTabContainer() != null) {
          i1 = i3 + g;
        }
      }
    }
    for (;;)
    {
      label153:
      s.set(q);
      u.set(t);
      if ((!b) && (i2 == 0))
      {
        localObject = s;
        top = (i1 + top);
        localObject = s;
      }
      for (bottom += 0;; bottom += 0)
      {
        a(i, s, true);
        if (!v.equals(u))
        {
          v.set(u);
          i.a(u);
        }
        measureChildWithMargins(i, paramInt1, 0, paramInt2, 0);
        localObject = (b)i.getLayoutParams();
        i1 = Math.max(i6, i.getMeasuredWidth() + leftMargin + rightMargin);
        i2 = i.getMeasuredHeight();
        i3 = topMargin;
        i2 = Math.max(i5, bottomMargin + (i2 + i3));
        i3 = bk.a(i4, w.j(i));
        i4 = getPaddingLeft();
        i5 = getPaddingRight();
        i2 = Math.max(i2 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(w.a(Math.max(i1 + (i4 + i5), getSuggestedMinimumWidth()), paramInt1, i3), w.a(i2, paramInt2, i3 << 16));
        return;
        i2 = 0;
        break;
        label444:
        if (a.getVisibility() == 8) {
          break label506;
        }
        i1 = a.getMeasuredHeight();
        break label153;
        localObject = u;
        top = (i1 + top);
        localObject = u;
      }
      label506:
      i1 = 0;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i1 = 0;
    if ((!n) || (!paramBoolean)) {
      return false;
    }
    y.a(0, 0, (int)paramFloat2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    if (y.a.getFinalY() > a.getHeight()) {
      i1 = 1;
    }
    if (i1 != 0)
    {
      a();
      A.run();
    }
    for (;;)
    {
      c = true;
      return true;
      a();
      z.run();
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    o += paramInt2;
    setActionBarHideOffset(o);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    B.a = paramInt;
    o = getActionBarHideOffset();
    a();
    if (w != null) {
      w.j();
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (a.getVisibility() != 0)) {
      return false;
    }
    return n;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    if ((n) && (!c))
    {
      if (o <= a.getHeight())
      {
        a();
        postDelayed(z, 600L);
      }
    }
    else {
      return;
    }
    a();
    postDelayed(A, 600L);
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 16) {
      super.onWindowSystemUiVisibilityChanged(paramInt);
    }
    i();
    int i3 = p;
    p = paramInt;
    int i1;
    int i2;
    if ((paramInt & 0x4) == 0)
    {
      i1 = 1;
      if ((paramInt & 0x100) == 0) {
        break label120;
      }
      i2 = 1;
      label49:
      if (w != null)
      {
        a locala = w;
        if (i2 != 0) {
          break label125;
        }
        label66:
        locala.d(bool);
        if ((i1 == 0) && (i2 != 0)) {
          break label131;
        }
        w.h();
      }
    }
    for (;;)
    {
      if ((((i3 ^ paramInt) & 0x100) != 0) && (w != null)) {
        w.w(this);
      }
      return;
      i1 = 0;
      break;
      label120:
      i2 = 0;
      break label49;
      label125:
      bool = false;
      break label66;
      label131:
      w.i();
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    h = paramInt;
    if (w != null) {
      w.b(paramInt);
    }
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    a();
    paramInt = Math.max(0, Math.min(paramInt, a.getHeight()));
    w.b(a, -paramInt);
  }
  
  public void setActionBarVisibilityCallback(a parama)
  {
    w = parama;
    if (getWindowToken() != null)
    {
      w.b(h);
      if (p != 0)
      {
        onWindowSystemUiVisibilityChanged(p);
        w.w(this);
      }
    }
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    m = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != n)
    {
      n = paramBoolean;
      if (!paramBoolean)
      {
        a();
        setActionBarHideOffset(0);
      }
    }
  }
  
  public void setIcon(int paramInt)
  {
    i();
    j.a(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    i();
    j.a(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    i();
    j.b(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean)
  {
    b = paramBoolean;
    if ((paramBoolean) && (getContextgetApplicationInfotargetSdkVersion < 19)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      l = paramBoolean;
      return;
    }
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    i();
    j.a(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    i();
    j.a(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void b(int paramInt);
    
    public abstract void d(boolean paramBoolean);
    
    public abstract void h();
    
    public abstract void i();
    
    public abstract void j();
  }
  
  public static final class b
    extends ViewGroup.MarginLayoutParams
  {
    public b()
    {
      super(-1);
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}


/* Location:              android/support/v7/widget/ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */