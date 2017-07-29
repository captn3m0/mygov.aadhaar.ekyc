package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.f.c;
import android.support.v4.h.a.b.a;
import android.support.v4.h.a.b.g;
import android.support.v4.h.ab;
import android.support.v4.h.n;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
  extends ViewGroup
  implements g
{
  static final int[] a;
  static final boolean b;
  static final c j;
  private static final boolean k;
  private f A;
  private float B;
  private float C;
  private Drawable D;
  private Drawable E;
  private Drawable F;
  private Object G;
  private boolean H;
  private Drawable I = null;
  private Drawable J = null;
  private Drawable K = null;
  private Drawable L = null;
  private final ArrayList<View> M;
  final p c;
  final p d;
  int e;
  boolean f;
  List<f> g;
  CharSequence h;
  CharSequence i;
  private final b l = new b();
  private float m;
  private int n;
  private int o = -1728053248;
  private float p;
  private Paint q = new Paint();
  private final i r;
  private final i s;
  private boolean t;
  private boolean u = true;
  private int v = 3;
  private int w = 3;
  private int x = 3;
  private int y = 3;
  private boolean z;
  
  static
  {
    boolean bool2 = true;
    a = new int[] { 16842931 };
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool1 = true;
      b = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label65;
      }
    }
    label65:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      k = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label70;
      }
      j = new d();
      return;
      bool1 = false;
      break;
    }
    label70:
    j = new e();
  }
  
  public DrawerLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResourcesgetDisplayMetricsdensity;
    n = ((int)(64.0F * f1 + 0.5F));
    float f2 = 400.0F * f1;
    r = new i(3);
    s = new i(5);
    c = p.a(this, 1.0F, r);
    c.i = 1;
    c.g = f2;
    r.b = c;
    d = p.a(this, 1.0F, s);
    d.i = 2;
    d.g = f2;
    s.b = d;
    setFocusableInTouchMode(true);
    w.c(this, 1);
    w.a(this, new a());
    ab.a(this);
    if (w.x(this))
    {
      j.a(this);
      D = j.a(paramContext);
    }
    m = (f1 * 10.0F);
    M = new ArrayList();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = android.support.v4.h.f.a(paramInt2, w.g(this));
    Object localObject;
    switch (paramInt2)
    {
    default: 
      if (paramInt1 != 0)
      {
        if (i1 == 3)
        {
          localObject = c;
          label67:
          ((p)localObject).a();
        }
      }
      else {
        switch (paramInt1)
        {
        }
      }
      break;
    }
    do
    {
      do
      {
        return;
        v = paramInt1;
        break;
        w = paramInt1;
        break;
        x = paramInt1;
        break;
        y = paramInt1;
        break;
        localObject = d;
        break label67;
        localObject = b(i1);
      } while (localObject == null);
      e((View)localObject);
      return;
      localObject = b(i1);
    } while (localObject == null);
    f((View)localObject);
  }
  
  private void a(boolean paramBoolean)
  {
    int i4 = getChildCount();
    int i2 = 0;
    int i1 = 0;
    if (i2 < i4)
    {
      View localView = getChildAt(i2);
      g localg = (g)localView.getLayoutParams();
      boolean bool = i1;
      int i3;
      if (d(localView)) {
        if (paramBoolean)
        {
          bool = i1;
          if (!c) {}
        }
        else
        {
          i3 = localView.getWidth();
          if (!a(localView, 3)) {
            break label115;
          }
          i1 |= c.a(localView, -i3, localView.getTop());
        }
      }
      for (;;)
      {
        c = false;
        i3 = i1;
        i2 += 1;
        i1 = i3;
        break;
        label115:
        i1 |= d.a(localView, getWidth(), localView.getTop());
      }
    }
    r.b();
    s.b();
    if (i1 != 0) {
      invalidate();
    }
  }
  
  private static boolean a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable == null) || (!android.support.v4.d.a.a.b(paramDrawable))) {
      return false;
    }
    android.support.v4.d.a.a.b(paramDrawable, paramInt);
    return true;
  }
  
  static float b(View paramView)
  {
    return getLayoutParamsb;
  }
  
  public static String c(int paramInt)
  {
    if ((paramInt & 0x3) == 3) {
      return "LEFT";
    }
    if ((paramInt & 0x5) == 5) {
      return "RIGHT";
    }
    return Integer.toHexString(paramInt);
  }
  
  private View d()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      if ((getLayoutParamsd & 0x1) == 1) {
        return localView;
      }
      i1 += 1;
    }
    return null;
  }
  
  static boolean d(View paramView)
  {
    int i1 = android.support.v4.h.f.a(getLayoutParamsa, w.g(paramView));
    if ((i1 & 0x3) != 0) {
      return true;
    }
    return (i1 & 0x5) != 0;
  }
  
  public static boolean g(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return getLayoutParamsb > 0.0F;
  }
  
  static boolean h(View paramView)
  {
    return (w.d(paramView) != 4) && (w.d(paramView) != 2);
  }
  
  private static boolean i(View paramView)
  {
    return getLayoutParamsa == 0;
  }
  
  private static boolean j(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return (getLayoutParamsd & 0x1) == 1;
  }
  
  public final int a(int paramInt)
  {
    int i1 = w.g(this);
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      if (v != 3) {
        return v;
      }
      if (i1 == 0) {}
      for (paramInt = x; paramInt != 3; paramInt = y) {
        return paramInt;
      }
      if (w != 3) {
        return w;
      }
      if (i1 == 0) {}
      for (paramInt = y; paramInt != 3; paramInt = x) {
        return paramInt;
      }
      if (x != 3) {
        return x;
      }
      if (i1 == 0) {}
      for (paramInt = v; paramInt != 3; paramInt = w) {
        return paramInt;
      }
      if (y != 3) {
        return y;
      }
      if (i1 == 0) {}
      for (paramInt = w; paramInt != 3; paramInt = v) {
        return paramInt;
      }
    }
  }
  
  public final int a(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return a(getLayoutParamsa);
  }
  
  public final void a()
  {
    View localView = b(8388611);
    if (localView == null) {
      throw new IllegalArgumentException("No drawer view found with gravity " + c(8388611));
    }
    f(localView);
  }
  
  final void a(View paramView, float paramFloat)
  {
    paramView = (g)paramView.getLayoutParams();
    if (paramFloat == b) {}
    for (;;)
    {
      return;
      b = paramFloat;
      if (g != null)
      {
        int i1 = g.size() - 1;
        while (i1 >= 0)
        {
          ((f)g.get(i1)).a(paramFloat);
          i1 -= 1;
        }
      }
    }
  }
  
  final void a(View paramView, boolean paramBoolean)
  {
    int i2 = getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (((!paramBoolean) && (!d(localView))) || ((paramBoolean) && (localView == paramView))) {
        w.c(localView, 1);
      }
      for (;;)
      {
        i1 += 1;
        break;
        w.c(localView, 4);
      }
    }
  }
  
  public final void a(Object paramObject, boolean paramBoolean)
  {
    G = paramObject;
    H = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      requestLayout();
      return;
    }
  }
  
  final boolean a(View paramView, int paramInt)
  {
    return (c(paramView) & paramInt) == paramInt;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i3 = 0;
    if (getDescendantFocusability() == 393216) {
      return;
    }
    int i4 = getChildCount();
    int i1 = 0;
    int i2 = 0;
    View localView;
    if (i1 < i4)
    {
      localView = getChildAt(i1);
      if (d(localView)) {
        if (j(localView))
        {
          i2 = 1;
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        M.add(localView);
      }
    }
    if (i2 == 0)
    {
      i2 = M.size();
      i1 = i3;
      while (i1 < i2)
      {
        localView = (View)M.get(i1);
        if (localView.getVisibility() == 0) {
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
        i1 += 1;
      }
    }
    M.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((d() != null) || (d(paramView))) {
      w.c(paramView, 4);
    }
    for (;;)
    {
      if (!b) {
        w.a(paramView, l);
      }
      return;
      w.c(paramView, 1);
    }
  }
  
  public final View b(int paramInt)
  {
    int i1 = android.support.v4.h.f.a(paramInt, w.g(this));
    int i2 = getChildCount();
    paramInt = 0;
    while (paramInt < i2)
    {
      View localView = getChildAt(paramInt);
      if ((c(localView) & 0x7) == (i1 & 0x7)) {
        return localView;
      }
      paramInt += 1;
    }
    return null;
  }
  
  public final boolean b()
  {
    View localView = b(8388611);
    if (localView != null) {
      return j(localView);
    }
    return false;
  }
  
  final int c(View paramView)
  {
    return android.support.v4.h.f.a(getLayoutParamsa, w.g(this));
  }
  
  final View c()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      if ((d(localView)) && (g(localView))) {
        return localView;
      }
      i1 += 1;
    }
    return null;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof g)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    int i2 = getChildCount();
    float f1 = 0.0F;
    int i1 = 0;
    while (i1 < i2)
    {
      f1 = Math.max(f1, getChildAtgetLayoutParamsb);
      i1 += 1;
    }
    p = f1;
    if ((c.b() | d.b())) {
      w.c(this);
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i7 = getHeight();
    boolean bool1 = i(paramView);
    int i2 = 0;
    int i5 = 0;
    int i1 = getWidth();
    int i8 = paramCanvas.save();
    int i3 = i1;
    int i4;
    View localView;
    if (bool1)
    {
      int i9 = getChildCount();
      i4 = 0;
      i2 = i5;
      if (i4 < i9)
      {
        localView = getChildAt(i4);
        if ((localView != paramView) && (localView.getVisibility() == 0))
        {
          Drawable localDrawable = localView.getBackground();
          if (localDrawable != null) {
            if (localDrawable.getOpacity() == -1)
            {
              i3 = 1;
              label105:
              if ((i3 == 0) || (!d(localView)) || (localView.getHeight() < i7)) {
                break label215;
              }
              if (!a(localView, 3)) {
                break label193;
              }
              i3 = localView.getRight();
              if (i3 <= i2) {
                break label558;
              }
              i2 = i3;
            }
          }
        }
      }
    }
    label193:
    label215:
    label558:
    for (;;)
    {
      i5 = i2;
      i3 = i1;
      for (;;)
      {
        i4 += 1;
        i1 = i3;
        i2 = i5;
        break;
        i3 = 0;
        break label105;
        i3 = 0;
        break label105;
        int i6 = localView.getLeft();
        i3 = i6;
        i5 = i2;
        if (i6 >= i1)
        {
          i3 = i1;
          i5 = i2;
        }
      }
      paramCanvas.clipRect(i2, 0, i1, getHeight());
      i3 = i1;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i8);
      if ((p > 0.0F) && (bool1))
      {
        i1 = (int)(((o & 0xFF000000) >>> 24) * p);
        i4 = o;
        q.setColor(i1 << 24 | i4 & 0xFFFFFF);
        paramCanvas.drawRect(i2, 0.0F, i3, getHeight(), q);
      }
      do
      {
        return bool2;
        if ((E != null) && (a(paramView, 3)))
        {
          i1 = E.getIntrinsicWidth();
          i2 = paramView.getRight();
          i3 = c.h;
          f1 = Math.max(0.0F, Math.min(i2 / i3, 1.0F));
          E.setBounds(i2, paramView.getTop(), i1 + i2, paramView.getBottom());
          E.setAlpha((int)(255.0F * f1));
          E.draw(paramCanvas);
          return bool2;
        }
      } while ((F == null) || (!a(paramView, 5)));
      i1 = F.getIntrinsicWidth();
      i2 = paramView.getLeft();
      i3 = getWidth();
      i4 = d.h;
      float f1 = Math.max(0.0F, Math.min((i3 - i2) / i4, 1.0F));
      F.setBounds(i2 - i1, paramView.getTop(), i2, paramView.getBottom());
      F.setAlpha((int)(255.0F * f1));
      F.draw(paramCanvas);
      return bool2;
    }
  }
  
  public final void e(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    g localg = (g)paramView.getLayoutParams();
    if (u)
    {
      b = 1.0F;
      d = 1;
      a(paramView, true);
    }
    for (;;)
    {
      invalidate();
      return;
      d |= 0x2;
      if (a(paramView, 3)) {
        c.a(paramView, 0, paramView.getTop());
      } else {
        d.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
      }
    }
  }
  
  public final void f(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    g localg = (g)paramView.getLayoutParams();
    if (u)
    {
      b = 0.0F;
      d = 0;
    }
    for (;;)
    {
      invalidate();
      return;
      d |= 0x4;
      if (a(paramView, 3)) {
        c.a(paramView, -paramView.getWidth(), paramView.getTop());
      } else {
        d.a(paramView, getWidth(), paramView.getTop());
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new g();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new g(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof g)) {
      return new g((g)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new g((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new g(paramLayoutParams);
  }
  
  public float getDrawerElevation()
  {
    if (k) {
      return m;
    }
    return 0.0F;
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return D;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    u = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    u = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((H) && (D != null))
    {
      int i1 = j.a(G);
      if (i1 > 0)
      {
        D.setBounds(0, 0, getWidth(), i1);
        D.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i1 = n.a(paramMotionEvent);
    boolean bool2 = c.a(paramMotionEvent);
    boolean bool3 = d.a(paramMotionEvent);
    label63:
    int i2;
    label85:
    label113:
    float f1;
    float f2;
    switch (i1)
    {
    default: 
      i1 = 0;
      if ((!(bool3 | bool2)) && (i1 == 0))
      {
        i2 = getChildCount();
        i1 = 0;
        if (i1 >= i2) {
          break label373;
        }
        if (!getChildAtgetLayoutParamsc) {
          break;
        }
        i1 = 1;
        if ((i1 == 0) && (!f)) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    case 0: 
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      B = f1;
      C = f2;
      if (p > 0.0F)
      {
        paramMotionEvent = c.b((int)f1, (int)f2);
        if ((paramMotionEvent == null) || (!i(paramMotionEvent))) {}
      }
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      z = false;
      f = false;
      break label63;
      paramMotionEvent = c;
      int i3 = c.length;
      i2 = 0;
      label214:
      if (i2 < i3) {
        if (paramMotionEvent.a(i2))
        {
          f1 = e[i2] - c[i2];
          f2 = f[i2] - d[i2];
          if (f1 * f1 + f2 * f2 > b * b)
          {
            i1 = 1;
            label286:
            if (i1 == 0) {
              break label331;
            }
          }
        }
      }
      for (i1 = 1; i1 != 0; i1 = 0)
      {
        r.b();
        s.b();
        i1 = 0;
        break label63;
        i1 = 0;
        break label286;
        i1 = 0;
        break label286;
        label331:
        i2 += 1;
        break label214;
      }
      a(true);
      z = false;
      f = false;
      break;
      i1 += 1;
      break label85;
      label373:
      i1 = 0;
      break label113;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (c() != null) {}
      for (int i1 = 1; i1 != 0; i1 = 0)
      {
        paramKeyEvent.startTracking();
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (paramInt == 4)
    {
      paramKeyEvent = c();
      if ((paramKeyEvent != null) && (a(paramKeyEvent) == 0)) {
        a(false);
      }
      if (paramKeyEvent != null) {
        bool = true;
      }
      return bool;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    t = true;
    int i4 = paramInt3 - paramInt1;
    int i5 = getChildCount();
    paramInt3 = 0;
    while (paramInt3 < i5)
    {
      View localView = getChildAt(paramInt3);
      g localg;
      if (localView.getVisibility() != 8)
      {
        localg = (g)localView.getLayoutParams();
        if (i(localView)) {
          localView.layout(leftMargin, topMargin, leftMargin + localView.getMeasuredWidth(), topMargin + localView.getMeasuredHeight());
        }
      }
      else
      {
        paramInt3 += 1;
        continue;
      }
      int i6 = localView.getMeasuredWidth();
      int i7 = localView.getMeasuredHeight();
      int i1;
      float f1;
      label163:
      int i2;
      if (a(localView, 3))
      {
        paramInt1 = -i6;
        i1 = (int)(i6 * b) + paramInt1;
        f1 = (i6 + i1) / i6;
        if (f1 == b) {
          break label310;
        }
        i2 = 1;
        label177:
        switch (a & 0x70)
        {
        default: 
          localView.layout(i1, topMargin, i6 + i1, i7 + topMargin);
          label237:
          if (i2 != 0) {
            a(localView, f1);
          }
          if (b <= 0.0F) {
            break;
          }
        }
      }
      for (paramInt1 = 0; localView.getVisibility() != paramInt1; paramInt1 = 4)
      {
        localView.setVisibility(paramInt1);
        break;
        i1 = i4 - (int)(i6 * b);
        f1 = (i4 - i1) / i6;
        break label163;
        label310:
        i2 = 0;
        break label177;
        paramInt1 = paramInt4 - paramInt2;
        localView.layout(i1, paramInt1 - bottomMargin - localView.getMeasuredHeight(), i6 + i1, paramInt1 - bottomMargin);
        break label237;
        int i8 = paramInt4 - paramInt2;
        int i3 = (i8 - i7) / 2;
        if (i3 < topMargin) {
          paramInt1 = topMargin;
        }
        for (;;)
        {
          localView.layout(i1, paramInt1, i6 + i1, i7 + paramInt1);
          break;
          paramInt1 = i3;
          if (i3 + i7 > i8 - bottomMargin) {
            paramInt1 = i8 - bottomMargin - i7;
          }
        }
      }
    }
    t = false;
    u = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i6 = View.MeasureSpec.getMode(paramInt1);
    int i5 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i2;
    int i1;
    if (i6 == 1073741824)
    {
      i2 = i3;
      if (i5 == 1073741824) {}
    }
    else if (isInEditMode())
    {
      i1 = i3;
      if (i6 != Integer.MIN_VALUE)
      {
        i1 = i3;
        if (i6 == 0) {
          i1 = 300;
        }
      }
      i2 = i1;
      if (i5 == Integer.MIN_VALUE) {
        break label574;
      }
      i2 = i1;
      if (i5 != 0) {
        break label574;
      }
      i3 = 300;
    }
    for (i4 = i1;; i4 = i2)
    {
      setMeasuredDimension(i4, i3);
      label146:
      View localView;
      int i7;
      int i8;
      g localg;
      if ((G != null) && (w.x(this)))
      {
        i5 = 1;
        int i9 = w.g(this);
        i1 = 0;
        i2 = 0;
        int i10 = getChildCount();
        i6 = 0;
        if (i6 >= i10) {
          break label573;
        }
        localView = getChildAt(i6);
        i7 = i2;
        i8 = i1;
        if (localView.getVisibility() != 8)
        {
          localg = (g)localView.getLayoutParams();
          if (i5 != 0)
          {
            i7 = android.support.v4.h.f.a(a, i9);
            if (!w.x(localView)) {
              break label322;
            }
            j.a(localView, G, i7);
          }
        }
      }
      for (;;)
      {
        if (!i(localView)) {
          break label341;
        }
        localView.measure(View.MeasureSpec.makeMeasureSpec(i4 - leftMargin - rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - topMargin - bottomMargin, 1073741824));
        i8 = i1;
        i7 = i2;
        i6 += 1;
        i2 = i7;
        i1 = i8;
        break label146;
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        i5 = 0;
        break;
        label322:
        j.a(localg, G, i7);
      }
      label341:
      if (d(localView))
      {
        if ((k) && (w.t(localView) != m)) {
          w.d(localView, m);
        }
        i8 = c(localView) & 0x7;
        if (i8 == 3) {}
        for (i7 = 1; ((i7 != 0) && (i1 != 0)) || ((i7 == 0) && (i2 != 0)); i7 = 0) {
          throw new IllegalStateException("Child drawer has absolute gravity " + c(i8) + " but this DrawerLayout already has a drawer view along that edge");
        }
        if (i7 != 0) {
          i1 = 1;
        }
        for (;;)
        {
          localView.measure(getChildMeasureSpec(paramInt1, n + leftMargin + rightMargin, width), getChildMeasureSpec(paramInt2, topMargin + bottomMargin, height));
          i7 = i2;
          i8 = i1;
          break;
          i2 = 1;
        }
      }
      throw new IllegalStateException("Child " + localView + " at index " + i6 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
      label573:
      return;
      label574:
      i3 = i4;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof h)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    do
    {
      return;
      paramParcelable = (h)paramParcelable;
      super.onRestoreInstanceState(e);
      if (a != 0)
      {
        View localView = b(a);
        if (localView != null) {
          e(localView);
        }
      }
      if (b != 3) {
        a(b, 3);
      }
      if (c != 3) {
        a(c, 5);
      }
      if (f != 3) {
        a(f, 8388611);
      }
    } while (g == 3);
    a(g, 8388613);
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    Drawable localDrawable;
    if (!k)
    {
      paramInt = w.g(this);
      if (paramInt != 0) {
        break label77;
      }
      if (I == null) {
        break label101;
      }
      a(I, paramInt);
      localDrawable = I;
      E = localDrawable;
      paramInt = w.g(this);
      if (paramInt != 0) {
        break label109;
      }
      if (J == null) {
        break label133;
      }
      a(J, paramInt);
      localDrawable = J;
    }
    for (;;)
    {
      F = localDrawable;
      return;
      label77:
      if (J != null)
      {
        a(J, paramInt);
        localDrawable = J;
        break;
      }
      label101:
      localDrawable = K;
      break;
      label109:
      if (I != null)
      {
        a(I, paramInt);
        localDrawable = I;
      }
      else
      {
        label133:
        localDrawable = L;
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    h localh = new h(super.onSaveInstanceState());
    int i4 = getChildCount();
    int i1 = 0;
    for (;;)
    {
      g localg;
      int i2;
      if (i1 < i4)
      {
        localg = (g)getChildAt(i1).getLayoutParams();
        if (d != 1) {
          break label119;
        }
        i2 = 1;
        if (d != 2) {
          break label124;
        }
      }
      label119:
      label124:
      for (int i3 = 1;; i3 = 0)
      {
        if ((i2 == 0) && (i3 == 0)) {
          break label129;
        }
        a = a;
        b = v;
        c = w;
        f = x;
        g = y;
        return localh;
        i2 = 0;
        break;
      }
      label129:
      i1 += 1;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    c.b(paramMotionEvent);
    d.b(paramMotionEvent);
    float f1;
    float f2;
    boolean bool;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2: 
    default: 
      return true;
    case 0: 
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      B = f1;
      C = f2;
      z = false;
      f = false;
      return true;
    case 1: 
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      paramMotionEvent = c.b((int)f2, (int)f1);
      if ((paramMotionEvent != null) && (i(paramMotionEvent)))
      {
        f2 -= B;
        f1 -= C;
        int i1 = c.b;
        if (f2 * f2 + f1 * f1 < i1 * i1)
        {
          paramMotionEvent = d();
          if (paramMotionEvent != null) {
            if (a(paramMotionEvent) == 2) {
              bool = true;
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      a(bool);
      z = false;
      return true;
      bool = false;
      continue;
      a(true);
      z = false;
      f = false;
      return true;
      bool = true;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    z = paramBoolean;
    if (paramBoolean) {
      a(true);
    }
  }
  
  public void requestLayout()
  {
    if (!t) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    m = paramFloat;
    int i1 = 0;
    while (i1 < getChildCount())
    {
      View localView = getChildAt(i1);
      if (d(localView)) {
        w.d(localView, m);
      }
      i1 += 1;
    }
  }
  
  @Deprecated
  public void setDrawerListener(f paramf)
  {
    if (A != null)
    {
      f localf = A;
      if ((localf != null) && (g != null)) {
        g.remove(localf);
      }
    }
    if ((paramf != null) && (paramf != null))
    {
      if (g == null) {
        g = new ArrayList();
      }
      g.add(paramf);
    }
    A = paramf;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt)
  {
    o = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v4.c.a.a(getContext(), paramInt);; localDrawable = null)
    {
      D = localDrawable;
      invalidate();
      return;
    }
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    D = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    D = new ColorDrawable(paramInt);
    invalidate();
  }
  
  final class a
    extends android.support.v4.h.b
  {
    private final Rect c = new Rect();
    
    a() {}
    
    public final void a(View paramView, android.support.v4.h.a.b paramb)
    {
      if (DrawerLayout.b) {
        super.a(paramView, paramb);
      }
      for (;;)
      {
        paramb.a(DrawerLayout.class.getName());
        paramb.b(false);
        paramb.c(false);
        paramb.a(b.a.a);
        paramb.a(b.a.b);
        return;
        Object localObject1 = android.support.v4.h.a.b.a(paramb);
        super.a(paramView, (android.support.v4.h.a.b)localObject1);
        android.support.v4.h.a.b.a.c(b, paramView);
        Object localObject2 = w.h(paramView);
        if ((localObject2 instanceof View)) {
          paramb.a((View)localObject2);
        }
        localObject2 = c;
        ((android.support.v4.h.a.b)localObject1).a((Rect)localObject2);
        android.support.v4.h.a.b.a.c(b, (Rect)localObject2);
        ((android.support.v4.h.a.b)localObject1).b((Rect)localObject2);
        android.support.v4.h.a.b.a.d(b, (Rect)localObject2);
        boolean bool = android.support.v4.h.a.b.a.s(b);
        android.support.v4.h.a.b.a.i(b, bool);
        localObject2 = ((android.support.v4.h.a.b)localObject1).i();
        android.support.v4.h.a.b.a.c(b, (CharSequence)localObject2);
        paramb.a(((android.support.v4.h.a.b)localObject1).j());
        localObject2 = ((android.support.v4.h.a.b)localObject1).k();
        android.support.v4.h.a.b.a.b(b, (CharSequence)localObject2);
        bool = ((android.support.v4.h.a.b)localObject1).g();
        android.support.v4.h.a.b.a.d(b, bool);
        bool = ((android.support.v4.h.a.b)localObject1).e();
        android.support.v4.h.a.b.a.c(b, bool);
        paramb.b(((android.support.v4.h.a.b)localObject1).b());
        paramb.c(((android.support.v4.h.a.b)localObject1).c());
        bool = android.support.v4.h.a.b.a.t(b);
        android.support.v4.h.a.b.a.j(b, bool);
        bool = ((android.support.v4.h.a.b)localObject1).d();
        android.support.v4.h.a.b.a.h(b, bool);
        bool = ((android.support.v4.h.a.b)localObject1).f();
        android.support.v4.h.a.b.a.g(b, bool);
        paramb.a(((android.support.v4.h.a.b)localObject1).a());
        android.support.v4.h.a.b.a.r(b);
        paramView = (ViewGroup)paramView;
        int j = paramView.getChildCount();
        int i = 0;
        while (i < j)
        {
          localObject1 = paramView.getChildAt(i);
          if (DrawerLayout.h((View)localObject1)) {
            android.support.v4.h.a.b.a.a(b, (View)localObject1);
          }
          i += 1;
        }
      }
    }
    
    public final void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.a(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
    }
    
    public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if ((DrawerLayout.b) || (DrawerLayout.h(paramView))) {
        return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return false;
    }
    
    public final boolean c(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent = paramAccessibilityEvent.getText();
        paramView = c();
        int i;
        if (paramView != null)
        {
          i = c(paramView);
          paramView = DrawerLayout.this;
          i = android.support.v4.h.f.a(i, w.g(paramView));
          if (i != 3) {
            break label73;
          }
          paramView = h;
        }
        for (;;)
        {
          if (paramView != null) {
            paramAccessibilityEvent.add(paramView);
          }
          return true;
          label73:
          if (i == 5) {
            paramView = i;
          } else {
            paramView = null;
          }
        }
      }
      return super.c(paramView, paramAccessibilityEvent);
    }
  }
  
  final class b
    extends android.support.v4.h.b
  {
    b() {}
    
    public final void a(View paramView, android.support.v4.h.a.b paramb)
    {
      super.a(paramView, paramb);
      if (!DrawerLayout.h(paramView)) {
        paramb.a(null);
      }
    }
  }
  
  static abstract interface c
  {
    public abstract int a(Object paramObject);
    
    public abstract Drawable a(Context paramContext);
    
    public abstract void a(View paramView);
    
    public abstract void a(View paramView, Object paramObject, int paramInt);
    
    public abstract void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt);
  }
  
  static final class d
    implements DrawerLayout.c
  {
    public final int a(Object paramObject)
    {
      return f.a(paramObject);
    }
    
    public final Drawable a(Context paramContext)
    {
      return f.a(paramContext);
    }
    
    public final void a(View paramView)
    {
      f.a(paramView);
    }
    
    public final void a(View paramView, Object paramObject, int paramInt)
    {
      f.a(paramView, paramObject, paramInt);
    }
    
    public final void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt)
    {
      f.a(paramMarginLayoutParams, paramObject, paramInt);
    }
  }
  
  static final class e
    implements DrawerLayout.c
  {
    public final int a(Object paramObject)
    {
      return 0;
    }
    
    public final Drawable a(Context paramContext)
    {
      return null;
    }
    
    public final void a(View paramView) {}
    
    public final void a(View paramView, Object paramObject, int paramInt) {}
    
    public final void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt) {}
  }
  
  public static abstract interface f
  {
    public abstract void a();
    
    public abstract void a(float paramFloat);
    
    public abstract void b();
  }
  
  public static final class g
    extends ViewGroup.MarginLayoutParams
  {
    public int a = 0;
    float b;
    boolean c;
    int d;
    
    public g()
    {
      super(-1);
    }
    
    public g(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.a);
      a = paramContext.getInt(0, 0);
      paramContext.recycle();
    }
    
    public g(g paramg)
    {
      super();
      a = a;
    }
    
    public g(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public g(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  protected static final class h
    extends android.support.v4.h.a
  {
    public static final Parcelable.Creator<h> CREATOR = android.support.v4.f.b.a(new c() {});
    int a = 0;
    int b;
    int c;
    int f;
    int g;
    
    public h(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      a = paramParcel.readInt();
      b = paramParcel.readInt();
      c = paramParcel.readInt();
      f = paramParcel.readInt();
      g = paramParcel.readInt();
    }
    
    public h(Parcelable paramParcelable)
    {
      super();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(a);
      paramParcel.writeInt(b);
      paramParcel.writeInt(c);
      paramParcel.writeInt(f);
      paramParcel.writeInt(g);
    }
  }
  
  private final class i
    extends p.a
  {
    final int a;
    p b;
    private final Runnable d = new Runnable()
    {
      public final void run()
      {
        int k = 0;
        Object localObject2 = DrawerLayout.i.this;
        int m = b.h;
        int i;
        Object localObject1;
        int j;
        if (a == 3)
        {
          i = 1;
          if (i == 0) {
            break label226;
          }
          localObject1 = c.b(3);
          if (localObject1 == null) {
            break label221;
          }
          j = -((View)localObject1).getWidth();
          label56:
          j += m;
        }
        for (;;)
        {
          label61:
          if ((localObject1 != null) && (((i != 0) && (((View)localObject1).getLeft() < j)) || ((i == 0) && (((View)localObject1).getLeft() > j) && (c.a((View)localObject1) == 0))))
          {
            DrawerLayout.g localg = (DrawerLayout.g)((View)localObject1).getLayoutParams();
            b.a((View)localObject1, j, ((View)localObject1).getTop());
            c = true;
            c.invalidate();
            ((DrawerLayout.i)localObject2).c();
            localObject1 = c;
            if (!f)
            {
              long l = SystemClock.uptimeMillis();
              localObject2 = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
              j = ((DrawerLayout)localObject1).getChildCount();
              i = k;
              for (;;)
              {
                if (i < j)
                {
                  ((DrawerLayout)localObject1).getChildAt(i).dispatchTouchEvent((MotionEvent)localObject2);
                  i += 1;
                  continue;
                  i = 0;
                  break;
                  label221:
                  j = 0;
                  break label56;
                  label226:
                  localObject1 = c.b(5);
                  j = c.getWidth();
                  j -= m;
                  break label61;
                }
              }
              ((MotionEvent)localObject2).recycle();
              f = true;
            }
          }
        }
      }
    };
    
    i(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a(View paramView)
    {
      if (DrawerLayout.d(paramView)) {
        return paramView.getWidth();
      }
      return 0;
    }
    
    public final void a(int paramInt)
    {
      DrawerLayout localDrawerLayout = DrawerLayout.this;
      View localView = b.j;
      int i = c.a;
      int j = d.a;
      if ((i == 1) || (j == 1)) {
        i = 1;
      }
      DrawerLayout.g localg;
      while ((localView != null) && (paramInt == 0))
      {
        localg = (DrawerLayout.g)localView.getLayoutParams();
        if (b != 0.0F) {
          break label266;
        }
        localg = (DrawerLayout.g)localView.getLayoutParams();
        if ((d & 0x1) == 1)
        {
          d = 0;
          if (g != null)
          {
            paramInt = g.size() - 1;
            for (;;)
            {
              if (paramInt >= 0)
              {
                ((DrawerLayout.f)g.get(paramInt)).b();
                paramInt -= 1;
                continue;
                if ((i == 2) || (j == 2))
                {
                  i = 2;
                  break;
                }
                i = 0;
                break;
              }
            }
          }
          localDrawerLayout.a(localView, false);
          if (localDrawerLayout.hasWindowFocus())
          {
            localView = localDrawerLayout.getRootView();
            if (localView != null) {
              localView.sendAccessibilityEvent(32);
            }
          }
        }
      }
      while (i != e)
      {
        e = i;
        if (g == null) {
          break;
        }
        paramInt = g.size() - 1;
        while (paramInt >= 0)
        {
          g.get(paramInt);
          paramInt -= 1;
        }
        label266:
        if (b == 1.0F)
        {
          localg = (DrawerLayout.g)localView.getLayoutParams();
          if ((d & 0x1) == 0)
          {
            d = 1;
            if (g != null)
            {
              paramInt = g.size() - 1;
              while (paramInt >= 0)
              {
                ((DrawerLayout.f)g.get(paramInt)).a();
                paramInt -= 1;
              }
            }
            localDrawerLayout.a(localView, true);
            if (localDrawerLayout.hasWindowFocus()) {
              localDrawerLayout.sendAccessibilityEvent(32);
            }
          }
        }
      }
    }
    
    public final void a(int paramInt1, int paramInt2)
    {
      if ((paramInt1 & 0x1) == 1) {}
      for (View localView = b(3);; localView = b(5))
      {
        if ((localView != null) && (DrawerLayout.this.a(localView) == 0)) {
          b.a(localView, paramInt2);
        }
        return;
      }
    }
    
    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      paramFloat2 = DrawerLayout.b(paramView);
      int k = paramView.getWidth();
      int i;
      if (DrawerLayout.this.a(paramView, 3)) {
        if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (paramFloat2 > 0.5F))) {
          i = 0;
        }
      }
      for (;;)
      {
        b.a(i, paramView.getTop());
        invalidate();
        return;
        i = -k;
        continue;
        int j = getWidth();
        if (paramFloat1 >= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (paramFloat2 <= 0.5F) {}
          }
        }
        else
        {
          i = j - k;
        }
      }
    }
    
    public final boolean a(View paramView, int paramInt)
    {
      return (DrawerLayout.d(paramView)) && (DrawerLayout.this.a(paramView, a)) && (DrawerLayout.this.a(paramView) == 0);
    }
    
    public final void b()
    {
      removeCallbacks(d);
    }
    
    public final void b(View paramView, int paramInt)
    {
      int i = paramView.getWidth();
      float f;
      if (DrawerLayout.this.a(paramView, 3))
      {
        f = (i + paramInt) / i;
        a(paramView, f);
        if (f != 0.0F) {
          break label76;
        }
      }
      label76:
      for (paramInt = 4;; paramInt = 0)
      {
        paramView.setVisibility(paramInt);
        invalidate();
        return;
        f = (getWidth() - paramInt) / i;
        break;
      }
    }
    
    public final int c(View paramView, int paramInt)
    {
      return paramView.getTop();
    }
    
    final void c()
    {
      int i = 3;
      if (a == 3) {
        i = 5;
      }
      View localView = b(i);
      if (localView != null) {
        f(localView);
      }
    }
    
    public final int d(View paramView, int paramInt)
    {
      if (DrawerLayout.this.a(paramView, 3)) {
        return Math.max(-paramView.getWidth(), Math.min(paramInt, 0));
      }
      int i = getWidth();
      return Math.max(i - paramView.getWidth(), Math.min(paramInt, i));
    }
    
    public final void d()
    {
      postDelayed(d, 160L);
    }
    
    public final void e(View paramView, int paramInt)
    {
      getLayoutParamsc = false;
      c();
    }
  }
}


/* Location:              android/support/v4/widget/DrawerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */