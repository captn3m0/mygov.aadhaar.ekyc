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
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements q, ad
{
  static final int[] f;
  private final Runnable A;
  private final r B;
  ActionBarContainer a;
  public boolean b;
  boolean c;
  android.support.v4.h.ae d;
  final ai e;
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
  private final Rect q;
  private final Rect r;
  private final Rect s;
  private final Rect t;
  private final Rect u;
  private final Rect v;
  private ActionBarOverlayLayout.a w;
  private final int x;
  private m y;
  private final Runnable z;
  
  static
  {
    int[] arrayOfInt = new int[2];
    int i1 = a.a.actionBarSize;
    arrayOfInt[0] = i1;
    arrayOfInt[1] = 16842841;
    f = arrayOfInt;
  }
  
  public ActionBarOverlayLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    q = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    r = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    s = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    t = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    u = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    v = ((Rect)localObject);
    x = 600;
    localObject = new android/support/v7/widget/ActionBarOverlayLayout$1;
    ((ActionBarOverlayLayout.1)localObject).<init>(this);
    e = ((ai)localObject);
    localObject = new android/support/v7/widget/ActionBarOverlayLayout$2;
    ((ActionBarOverlayLayout.2)localObject).<init>(this);
    z = ((Runnable)localObject);
    localObject = new android/support/v7/widget/ActionBarOverlayLayout$3;
    ((ActionBarOverlayLayout.3)localObject).<init>(this);
    A = ((Runnable)localObject);
    a(paramContext);
    localObject = new android/support/v4/h/r;
    ((r)localObject).<init>(this);
    B = ((r)localObject);
  }
  
  private void a(Context paramContext)
  {
    int i1 = 1;
    Object localObject1 = getContext().getTheme();
    Object localObject2 = f;
    localObject2 = ((Resources.Theme)localObject1).obtainStyledAttributes((int[])localObject2);
    int i2 = ((TypedArray)localObject2).getDimensionPixelSize(0, 0);
    g = i2;
    localObject1 = ((TypedArray)localObject2).getDrawable(i1);
    k = ((Drawable)localObject1);
    localObject1 = k;
    int i3;
    if (localObject1 == null)
    {
      i2 = i1;
      setWillNotDraw(i2);
      ((TypedArray)localObject2).recycle();
      localObject1 = paramContext.getApplicationInfo();
      i3 = targetSdkVersion;
      int i4 = 19;
      if (i3 >= i4) {
        break label120;
      }
    }
    for (;;)
    {
      l = i1;
      localObject1 = m.a(paramContext, null);
      y = ((m)localObject1);
      return;
      i3 = 0;
      localObject1 = null;
      break;
      label120:
      i1 = 0;
    }
  }
  
  private static boolean a(View paramView, Rect paramRect, boolean paramBoolean)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = 0;
    float f2 = 0.0F;
    ActionBarOverlayLayout.b localb = (ActionBarOverlayLayout.b)paramView.getLayoutParams();
    int i3 = leftMargin;
    int i4 = left;
    if (i3 != i4)
    {
      i2 = left;
      leftMargin = i2;
      i2 = i1;
      f2 = f1;
    }
    i3 = topMargin;
    i4 = top;
    if (i3 != i4)
    {
      i2 = top;
      topMargin = i2;
      i2 = i1;
      f2 = f1;
    }
    i3 = rightMargin;
    i4 = right;
    if (i3 != i4)
    {
      i2 = right;
      rightMargin = i2;
      i2 = i1;
      f2 = f1;
    }
    if (paramBoolean)
    {
      i3 = bottomMargin;
      i4 = bottom;
      if (i3 != i4)
      {
        i2 = bottom;
        bottomMargin = i2;
      }
    }
    for (;;)
    {
      return i1;
      i1 = i2;
      f1 = f2;
    }
  }
  
  private void i()
  {
    Object localObject = i;
    boolean bool;
    if (localObject == null)
    {
      int i1 = a.f.action_bar_activity_content;
      localObject = (ContentFrameLayout)findViewById(i1);
      i = ((ContentFrameLayout)localObject);
      i1 = a.f.action_bar_container;
      localObject = (ActionBarContainer)findViewById(i1);
      a = ((ActionBarContainer)localObject);
      i1 = a.f.action_bar;
      localObject = findViewById(i1);
      bool = localObject instanceof ae;
      if (!bool) {
        break label75;
      }
    }
    for (localObject = (ae)localObject;; localObject = ((Toolbar)localObject).getWrapper())
    {
      j = ((ae)localObject);
      return;
      label75:
      bool = localObject instanceof Toolbar;
      if (!bool) {
        break;
      }
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Can't make a decor toolbar out of ");
    localObject = localObject.getClass().getSimpleName();
    localObject = (String)localObject;
    localIllegalStateException.<init>((String)localObject);
    throw localIllegalStateException;
  }
  
  final void a()
  {
    Object localObject = z;
    removeCallbacks((Runnable)localObject);
    localObject = A;
    removeCallbacks((Runnable)localObject);
    localObject = d;
    if (localObject != null)
    {
      localObject = d;
      ((android.support.v4.h.ae)localObject).a();
    }
  }
  
  public final void a(int paramInt)
  {
    i();
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      ae localae = j;
      localae.f();
      continue;
      localae = j;
      localae.g();
      continue;
      boolean bool = true;
      setOverlayMode(bool);
    }
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
    return paramLayoutParams instanceof ActionBarOverlayLayout.b;
  }
  
  public final boolean d()
  {
    i();
    return j.j();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Object localObject1 = k;
    int i1;
    float f1;
    Object localObject2;
    if (localObject1 != null)
    {
      boolean bool = l;
      if (!bool)
      {
        localObject1 = a;
        i1 = ((ActionBarContainer)localObject1).getVisibility();
        if (i1 != 0) {
          break label134;
        }
        localObject1 = a;
        f1 = ((ActionBarContainer)localObject1).getBottom();
        localObject2 = a;
        float f2 = w.o((View)localObject2);
        f1 += f2;
        f2 = 0.5F;
        f1 += f2;
        i1 = (int)f1;
      }
    }
    for (;;)
    {
      localObject2 = k;
      int i2 = getWidth();
      Drawable localDrawable = k;
      int i3 = localDrawable.getIntrinsicHeight() + i1;
      ((Drawable)localObject2).setBounds(0, i1, i2, i3);
      localObject1 = k;
      ((Drawable)localObject1).draw(paramCanvas);
      return;
      label134:
      i1 = 0;
      localObject1 = null;
      f1 = 0.0F;
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
    boolean bool1 = true;
    i();
    w.v(this);
    Object localObject = a;
    boolean bool2 = a((View)localObject, paramRect, false);
    t.set(paramRect);
    Rect localRect1 = t;
    Rect localRect2 = q;
    bk.a(this, localRect1, localRect2);
    localRect1 = r;
    localRect2 = q;
    boolean bool3 = localRect1.equals(localRect2);
    if (!bool3)
    {
      localObject = r;
      localRect1 = q;
      ((Rect)localObject).set(localRect1);
      bool2 = bool1;
    }
    if (bool2) {
      requestLayout();
    }
    return bool1;
  }
  
  public final void g()
  {
    i();
    j.m();
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    ActionBarOverlayLayout.b localb = new android/support/v7/widget/ActionBarOverlayLayout$b;
    localb.<init>(paramLayoutParams);
    return localb;
  }
  
  public int getActionBarHideOffset()
  {
    ActionBarContainer localActionBarContainer = a;
    float f1;
    int i1;
    if (localActionBarContainer != null)
    {
      localActionBarContainer = a;
      f1 = w.o(localActionBarContainer);
      i1 = -(int)f1;
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      f1 = 0.0F;
      localActionBarContainer = null;
    }
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
    Context localContext = getContext();
    a(localContext);
    w.w(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = getPaddingLeft();
    getPaddingRight();
    int i3 = getPaddingTop();
    getPaddingBottom();
    int i4 = 0;
    ActionBarOverlayLayout.b localb = null;
    for (int i5 = 0; i5 < i1; i5 = i4)
    {
      View localView = getChildAt(i5);
      i4 = localView.getVisibility();
      int i6 = 8;
      if (i4 != i6)
      {
        localb = (ActionBarOverlayLayout.b)localView.getLayoutParams();
        i6 = localView.getMeasuredWidth();
        int i7 = localView.getMeasuredHeight();
        int i8 = leftMargin + i2;
        i4 = topMargin + i3;
        i6 += i8;
        i7 += i4;
        localView.layout(i8, i4, i6, i7);
      }
      i4 = i5 + 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    int i2 = 0;
    i();
    Object localObject1 = a;
    Object localObject2 = this;
    int i3 = paramInt1;
    int i6 = paramInt2;
    measureChildWithMargins((View)localObject1, paramInt1, 0, paramInt2, 0);
    localObject2 = (ActionBarOverlayLayout.b)a.getLayoutParams();
    int i7 = a.getMeasuredWidth();
    i3 = leftMargin;
    i7 += i3;
    i3 = rightMargin;
    i7 += i3;
    int i8 = Math.max(0, i7);
    localObject1 = a;
    i7 = ((ActionBarContainer)localObject1).getMeasuredHeight();
    i3 = topMargin;
    i7 += i3;
    int i9 = bottomMargin + i7;
    int i11 = Math.max(0, i9);
    localObject2 = a;
    i9 = w.j((View)localObject2);
    int i12 = bk.a(0, i9);
    i9 = w.v(this) & 0x100;
    Object localObject3;
    if (i9 != 0)
    {
      i7 = i1;
      if (i7 == 0) {
        break label678;
      }
      i9 = g;
      boolean bool1 = m;
      if (bool1)
      {
        localObject3 = a.getTabContainer();
        if (localObject3 != null)
        {
          int i4 = g;
          i9 += i4;
        }
      }
    }
    for (;;)
    {
      label224:
      localObject3 = s;
      Rect localRect = q;
      ((Rect)localObject3).set(localRect);
      localObject3 = u;
      localRect = t;
      ((Rect)localObject3).set(localRect);
      boolean bool2 = b;
      int i5;
      if ((!bool2) && (i7 == 0))
      {
        localObject1 = s;
        i5 = top;
        i9 += i5;
        top = i9;
        localObject2 = s;
        i7 = bottom + 0;
      }
      for (bottom = i7;; bottom = i7)
      {
        localObject2 = i;
        localObject1 = s;
        a((View)localObject2, (Rect)localObject1, i1);
        localObject2 = v;
        localObject1 = u;
        boolean bool3 = ((Rect)localObject2).equals(localObject1);
        if (!bool3)
        {
          localObject2 = v;
          localObject1 = u;
          ((Rect)localObject2).set((Rect)localObject1);
          localObject2 = i;
          localObject1 = u;
          ((ContentFrameLayout)localObject2).a((Rect)localObject1);
        }
        localObject1 = i;
        localObject2 = this;
        i5 = paramInt1;
        i6 = paramInt2;
        measureChildWithMargins((View)localObject1, paramInt1, 0, paramInt2, 0);
        localObject2 = (ActionBarOverlayLayout.b)i.getLayoutParams();
        i7 = i.getMeasuredWidth();
        i5 = leftMargin;
        i7 += i5;
        i5 = rightMargin;
        i7 += i5;
        i7 = Math.max(i8, i7);
        i5 = i.getMeasuredHeight();
        i2 = topMargin;
        i5 += i2;
        i10 = bottomMargin + i5;
        i10 = Math.max(i11, i10);
        i5 = w.j(i);
        i5 = bk.a(i12, i5);
        i2 = getPaddingLeft();
        i6 = getPaddingRight();
        i2 += i6;
        i7 += i2;
        i2 = getPaddingTop();
        i6 = getPaddingBottom();
        i2 += i6;
        i10 += i2;
        i2 = getSuggestedMinimumHeight();
        i10 = Math.max(i10, i2);
        i2 = getSuggestedMinimumWidth();
        i7 = w.a(Math.max(i7, i2), paramInt1, i5);
        i5 <<= 16;
        i10 = w.a(i10, paramInt2, i5);
        setMeasuredDimension(i7, i10);
        return;
        i7 = 0;
        localObject1 = null;
        break;
        label678:
        localObject2 = a;
        i10 = ((ActionBarContainer)localObject2).getVisibility();
        i5 = 8;
        if (i10 == i5) {
          break label770;
        }
        localObject2 = a;
        i10 = ((ActionBarContainer)localObject2).getMeasuredHeight();
        break label224;
        localObject1 = u;
        i5 = top;
        i10 += i5;
        top = i10;
        localObject2 = u;
        i7 = bottom + 0;
      }
      label770:
      int i10 = 0;
      localObject2 = null;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = n;
    if ((!bool3) || (!paramBoolean)) {
      return bool2;
    }
    Object localObject = y;
    int i2 = (int)paramFloat2;
    int i3 = -1 << -1;
    int i4 = -1 >>> 1;
    ((m)localObject).a(0, 0, i2, 0, 0, i3, i4);
    localObject = y.a;
    int i1 = ((OverScroller)localObject).getFinalY();
    ActionBarContainer localActionBarContainer = a;
    int i5 = localActionBarContainer.getHeight();
    if (i1 > i5) {
      bool2 = bool1;
    }
    if (bool2)
    {
      a();
      localObject = A;
      ((Runnable)localObject).run();
    }
    for (;;)
    {
      c = bool1;
      bool2 = bool1;
      break;
      a();
      localObject = z;
      ((Runnable)localObject).run();
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = o + paramInt2;
    o = i1;
    i1 = o;
    setActionBarHideOffset(i1);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    B.a = paramInt;
    int i1 = getActionBarHideOffset();
    o = i1;
    a();
    ActionBarOverlayLayout.a locala = w;
    if (locala != null)
    {
      locala = w;
      locala.j();
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    int i1 = paramInt & 0x2;
    ActionBarContainer localActionBarContainer;
    if (i1 != 0)
    {
      localActionBarContainer = a;
      i1 = localActionBarContainer.getVisibility();
      if (i1 == 0) {}
    }
    else
    {
      i1 = 0;
      localActionBarContainer = null;
    }
    for (;;)
    {
      return i1;
      boolean bool = n;
    }
  }
  
  public void onStopNestedScroll(View paramView)
  {
    long l1 = 600L;
    boolean bool = n;
    Runnable localRunnable;
    if (bool)
    {
      bool = c;
      if (!bool)
      {
        int i1 = o;
        ActionBarContainer localActionBarContainer = a;
        int i2 = localActionBarContainer.getHeight();
        if (i1 > i2) {
          break label71;
        }
        a();
        localRunnable = z;
        postDelayed(localRunnable, l1);
      }
    }
    for (;;)
    {
      return;
      label71:
      a();
      localRunnable = A;
      postDelayed(localRunnable, l1);
    }
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    int i1 = 1;
    int i2 = Build.VERSION.SDK_INT;
    int i3 = 16;
    if (i2 >= i3) {
      super.onWindowSystemUiVisibilityChanged(paramInt);
    }
    i();
    int i4 = p ^ paramInt;
    p = paramInt;
    i2 = paramInt & 0x4;
    label61:
    label82:
    ActionBarOverlayLayout.a locala2;
    if (i2 == 0)
    {
      i3 = i1;
      i2 = paramInt & 0x100;
      if (i2 == 0) {
        break label145;
      }
      i2 = i1;
      ActionBarOverlayLayout.a locala1 = w;
      if (locala1 != null)
      {
        locala1 = w;
        if (i2 != 0) {
          break label153;
        }
        locala1.d(i1);
        if ((i3 == 0) && (i2 != 0)) {
          break label158;
        }
        locala2 = w;
        locala2.h();
      }
    }
    for (;;)
    {
      i2 = i4 & 0x100;
      if (i2 != 0)
      {
        locala2 = w;
        if (locala2 != null) {
          w.w(this);
        }
      }
      return;
      i3 = 0;
      break;
      label145:
      i2 = 0;
      locala2 = null;
      break label61;
      label153:
      i1 = 0;
      break label82;
      label158:
      locala2 = w;
      locala2.i();
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    h = paramInt;
    ActionBarOverlayLayout.a locala = w;
    if (locala != null)
    {
      locala = w;
      locala.b(paramInt);
    }
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    a();
    int i1 = a.getHeight();
    i1 = Math.min(paramInt, i1);
    i1 = Math.max(0, i1);
    ActionBarContainer localActionBarContainer = a;
    float f1 = -i1;
    w.b(localActionBarContainer, f1);
  }
  
  public void setActionBarVisibilityCallback(ActionBarOverlayLayout.a parama)
  {
    w = parama;
    Object localObject = getWindowToken();
    if (localObject != null)
    {
      localObject = w;
      int i1 = h;
      ((ActionBarOverlayLayout.a)localObject).b(i1);
      int i2 = p;
      if (i2 != 0)
      {
        i2 = p;
        onWindowSystemUiVisibilityChanged(i2);
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
    boolean bool = n;
    if (paramBoolean != bool)
    {
      n = paramBoolean;
      if (!paramBoolean)
      {
        a();
        bool = false;
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
    ApplicationInfo localApplicationInfo;
    int i1;
    if (paramBoolean)
    {
      localApplicationInfo = getContext().getApplicationInfo();
      i1 = targetSdkVersion;
      int i2 = 19;
      if (i1 < i2) {
        i1 = 1;
      }
    }
    for (;;)
    {
      l = i1;
      return;
      i1 = 0;
      localApplicationInfo = null;
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
}


/* Location:              android/support/v7/widget/ActionBarOverlayLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */