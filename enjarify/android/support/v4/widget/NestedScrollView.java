package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.h.b;
import android.support.v4.h.n;
import android.support.v4.h.o;
import android.support.v4.h.p;
import android.support.v4.h.q;
import android.support.v4.h.r;
import android.support.v4.h.t;
import android.support.v4.h.v;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView
  extends FrameLayout
  implements o, q, t
{
  private static final NestedScrollView.a v;
  private static final int[] w;
  private NestedScrollView.b A;
  private long a;
  private final Rect b;
  private m c;
  private h d;
  private h e;
  private int f;
  private boolean g;
  private boolean h;
  private View i;
  private boolean j;
  private VelocityTracker k;
  private boolean l;
  private boolean m;
  private int n;
  private int o;
  private int p;
  private int q;
  private final int[] r;
  private final int[] s;
  private int t;
  private NestedScrollView.c u;
  private final r x;
  private final p y;
  private float z;
  
  static
  {
    Object localObject = new android/support/v4/widget/NestedScrollView$a;
    ((NestedScrollView.a)localObject).<init>();
    v = (NestedScrollView.a)localObject;
    localObject = new int[1];
    localObject[0] = 16843130;
    w = (int[])localObject;
  }
  
  public NestedScrollView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    b = ((Rect)localObject);
    g = bool2;
    h = false;
    i = null;
    j = false;
    m = bool2;
    q = -1;
    localObject = new int[i1];
    r = ((int[])localObject);
    localObject = new int[i1];
    s = ((int[])localObject);
    localObject = m.a(getContext(), null);
    c = ((m)localObject);
    setFocusable(bool2);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    localObject = ViewConfiguration.get(getContext());
    i1 = ((ViewConfiguration)localObject).getScaledTouchSlop();
    n = i1;
    i1 = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
    o = i1;
    int i2 = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
    p = i2;
    localObject = w;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt, 0);
    boolean bool1 = ((TypedArray)localObject).getBoolean(0, false);
    setFillViewport(bool1);
    ((TypedArray)localObject).recycle();
    localObject = new android/support/v4/h/r;
    ((r)localObject).<init>(this);
    x = ((r)localObject);
    localObject = new android/support/v4/h/p;
    ((p)localObject).<init>(this);
    y = ((p)localObject);
    setNestedScrollingEnabled(bool2);
    localObject = v;
    w.a(this, (b)localObject);
  }
  
  private int a(Rect paramRect)
  {
    int i1 = 0;
    View localView1 = null;
    int i2 = getChildCount();
    if (i2 == 0) {
      return i1;
    }
    int i3 = getHeight();
    i2 = getScrollY();
    int i4 = i2 + i3;
    int i5 = getVerticalFadingEdgeLength();
    int i6 = top;
    if (i6 > 0) {
      i2 += i5;
    }
    i6 = bottom;
    View localView2 = getChildAt(0);
    int i7 = localView2.getHeight();
    if (i6 < i7) {
      i4 -= i5;
    }
    i5 = bottom;
    if (i5 > i4)
    {
      i5 = top;
      if (i5 > i2)
      {
        i5 = paramRect.height();
        if (i5 > i3)
        {
          i3 = top;
          i2 = i3 - i2 + 0;
          label148:
          localView1 = getChildAt(0);
          i1 = localView1.getBottom();
          i4 = i1 - i4;
          i2 = Math.min(i2, i4);
        }
      }
    }
    for (;;)
    {
      i1 = i2;
      break;
      i2 = bottom - i4 + 0;
      break label148;
      i5 = top;
      if (i5 < i2)
      {
        i5 = bottom;
        if (i5 < i4)
        {
          i1 = paramRect.height();
          if (i1 > i3)
          {
            i2 = bottom;
            i2 = i4 - i2;
          }
          for (i2 = 0 - i2;; i2 = 0 - i2)
          {
            i4 = -getScrollY();
            i2 = Math.max(i2, i4);
            break;
            i4 = top;
            i2 -= i4;
          }
        }
      }
      i2 = 0;
    }
  }
  
  private void a()
  {
    VelocityTracker localVelocityTracker = k;
    if (localVelocityTracker == null)
    {
      localVelocityTracker = VelocityTracker.obtain();
      k = localVelocityTracker;
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    if (i1 == 0) {
      return;
    }
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    long l2 = a;
    l1 -= l2;
    l2 = 250L;
    boolean bool1 = l1 < l2;
    if (bool1)
    {
      int i2 = getHeight();
      int i3 = getPaddingBottom();
      i2 -= i3;
      i3 = getPaddingTop();
      i2 -= i3;
      View localView = getChildAt(0);
      i2 = localView.getHeight() - i2;
      i2 = Math.max(0, i2);
      i3 = getScrollY();
      int i4 = i3 + paramInt2;
      i2 = Math.min(i4, i2);
      i2 = Math.max(0, i2) - i3;
      Object localObject = c;
      int i5 = getScrollX();
      localObject = a;
      ((OverScroller)localObject).startScroll(i5, i3, 0, i2);
      w.c(this);
    }
    for (;;)
    {
      l1 = AnimationUtils.currentAnimationTimeMillis();
      a = l1;
      break;
      OverScroller localOverScroller = c.a;
      boolean bool2 = localOverScroller.isFinished();
      if (!bool2)
      {
        localOverScroller = c.a;
        localOverScroller.abortAnimation();
      }
      scrollBy(paramInt1, paramInt2);
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    float f1 = 9.1477E-41F;
    i1 = (i1 & 0xFF00) >> 8;
    int i2 = paramMotionEvent.getPointerId(i1);
    int i3 = q;
    if (i2 == i3)
    {
      if (i1 != 0) {
        break label94;
      }
      i1 = 1;
    }
    for (;;)
    {
      f1 = paramMotionEvent.getY(i1);
      i2 = (int)f1;
      f = i2;
      i1 = paramMotionEvent.getPointerId(i1);
      q = i1;
      VelocityTracker localVelocityTracker = k;
      if (localVelocityTracker != null)
      {
        localVelocityTracker = k;
        localVelocityTracker.clear();
      }
      return;
      label94:
      i1 = 0;
      localVelocityTracker = null;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = getHeight();
    int i3 = getScrollY();
    int i4 = i3 + i2;
    i2 = 33;
    float f2 = 4.6E-44F;
    int i5;
    Object localObject1;
    int i6;
    float f3;
    View localView1;
    int i8;
    label89:
    int i9;
    int i10;
    int i11;
    float f4;
    label155:
    Object localObject2;
    if (paramInt1 == i2)
    {
      i2 = 1;
      f2 = Float.MIN_VALUE;
      i5 = i2;
      ArrayList localArrayList = getFocusables(2);
      localObject1 = null;
      i6 = 0;
      f3 = 0.0F;
      int i7 = localArrayList.size();
      i2 = 0;
      f2 = 0.0F;
      localView1 = null;
      i8 = 0;
      if (i8 >= i7) {
        break label347;
      }
      localView1 = (View)localArrayList.get(i8);
      i9 = localView1.getTop();
      i10 = localView1.getBottom();
      if ((paramInt2 >= i10) || (i9 >= paramInt3)) {
        break label436;
      }
      if ((paramInt2 >= i9) || (i10 >= paramInt3)) {
        break label211;
      }
      i11 = 1;
      f4 = Float.MIN_VALUE;
      if (localObject1 != null) {
        break label223;
      }
      localObject2 = localView1;
      i2 = i11;
      f2 = f4;
    }
    for (;;)
    {
      i8 += 1;
      localObject1 = localObject2;
      i6 = i2;
      f3 = f2;
      break label89;
      i2 = 0;
      f2 = 0.0F;
      localView1 = null;
      i5 = 0;
      View localView2 = null;
      break;
      label211:
      i11 = 0;
      f4 = 0.0F;
      localObject2 = null;
      break label155;
      label223:
      if (i5 != 0)
      {
        int i12 = ((View)localObject1).getTop();
        if (i9 < i12) {}
      }
      else
      {
        if (i5 != 0) {
          break label294;
        }
        i9 = ((View)localObject1).getBottom();
        if (i10 <= i9) {
          break label294;
        }
      }
      label294:
      for (i9 = 1;; i9 = 0)
      {
        if (i6 == 0) {
          break label300;
        }
        if ((i11 == 0) || (i9 == 0)) {
          break label436;
        }
        localObject2 = localView1;
        i2 = i6;
        f2 = f3;
        break;
      }
      label300:
      if (i11 != 0)
      {
        i11 = 1;
        f4 = Float.MIN_VALUE;
        localObject2 = localView1;
        i2 = i11;
        f2 = f4;
      }
      else if (i9 != 0)
      {
        localObject2 = localView1;
        i2 = i6;
        f2 = f3;
        continue;
        label347:
        if (localObject1 == null) {
          localObject1 = this;
        }
        if ((paramInt2 >= i3) && (paramInt3 <= i4))
        {
          i2 = 0;
          f2 = 0.0F;
          localView1 = null;
          localView2 = findFocus();
          if (localObject1 != localView2) {
            ((View)localObject1).requestFocus(paramInt1);
          }
          return i2;
        }
        if (i5 != 0) {}
        for (i2 = paramInt2 - i3;; i2 = paramInt3 - i4)
        {
          d(i2);
          i2 = i1;
          f2 = f1;
          break;
        }
      }
      else
      {
        label436:
        i2 = i6;
        f2 = f3;
        localObject2 = localObject1;
      }
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = 1;
    boolean bool = false;
    getOverScrollMode();
    computeHorizontalScrollRange();
    computeHorizontalScrollExtent();
    computeVerticalScrollRange();
    computeVerticalScrollExtent();
    int i2 = paramInt3 + paramInt1;
    int i4 = paramInt4 + paramInt2;
    int i5 = paramInt5 + 0;
    int i7;
    if (i2 > 0)
    {
      i2 = i1;
      i7 = 0;
    }
    for (;;)
    {
      if (i4 > i5)
      {
        i4 = i5;
        i5 = i1;
      }
      for (;;)
      {
        if (i5 != 0)
        {
          m localm = c;
          int i8 = getScrollRange();
          localm.a(i7, i4, i8);
        }
        onOverScrolled(i7, i4, i2, i5);
        if ((i2 != 0) || (i5 != 0)) {
          bool = i1;
        }
        return bool;
        if (i2 >= 0) {
          break label169;
        }
        i2 = i1;
        i7 = 0;
        break;
        if (i4 < 0)
        {
          i5 = i1;
          i4 = 0;
        }
        else
        {
          int i6 = 0;
        }
      }
      label169:
      i7 = i2;
      int i3 = 0;
    }
  }
  
  private boolean a(View paramView)
  {
    boolean bool1 = false;
    int i1 = getHeight();
    boolean bool2 = a(paramView, 0, i1);
    if (!bool2) {
      bool1 = true;
    }
    return bool1;
  }
  
  private boolean a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = b;
    paramView.getDrawingRect(localRect);
    localRect = b;
    offsetDescendantRectToMyCoords(paramView, localRect);
    localRect = b;
    int i1 = bottom + paramInt1;
    int i3 = getScrollY();
    if (i1 >= i3)
    {
      localRect = b;
      i1 = top - paramInt1;
      int i4 = getScrollY() + paramInt2;
      if (i1 <= i4) {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localRect = null;
    }
  }
  
  private static boolean a(View paramView1, View paramView2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramView1 == paramView2) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      Object localObject = paramView1.getParent();
      boolean bool3 = localObject instanceof ViewGroup;
      if (bool3)
      {
        localObject = (View)localObject;
        bool2 = a((View)localObject, paramView2);
        if (bool2)
        {
          bool2 = bool1;
          continue;
        }
      }
      bool2 = false;
      localObject = null;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 >= paramInt3) || (paramInt1 < 0)) {
      paramInt1 = 0;
    }
    for (;;)
    {
      return paramInt1;
      int i1 = paramInt2 + paramInt1;
      if (i1 > paramInt3) {
        paramInt1 = paramInt3 - paramInt2;
      }
    }
  }
  
  private void b()
  {
    VelocityTracker localVelocityTracker = k;
    if (localVelocityTracker != null)
    {
      k.recycle();
      localVelocityTracker = null;
      k = null;
    }
  }
  
  private void b(View paramView)
  {
    Rect localRect = b;
    paramView.getDrawingRect(localRect);
    localRect = b;
    offsetDescendantRectToMyCoords(paramView, localRect);
    localRect = b;
    int i1 = a(localRect);
    if (i1 != 0) {
      scrollBy(0, i1);
    }
  }
  
  private boolean b(int paramInt)
  {
    int i1 = 0;
    Rect localRect1 = null;
    int i2 = 130;
    if (paramInt == i2) {
      i2 = 1;
    }
    for (;;)
    {
      int i3 = getHeight();
      Rect localRect2 = b;
      top = 0;
      localRect1 = b;
      bottom = i3;
      if (i2 != 0)
      {
        i2 = getChildCount();
        if (i2 > 0)
        {
          i2 += -1;
          localObject = getChildAt(i2);
          localRect1 = b;
          i2 = ((View)localObject).getBottom();
          int i4 = getPaddingBottom();
          i2 += i4;
          bottom = i2;
          localObject = b;
          localRect1 = b;
          i1 = bottom - i3;
          top = i1;
        }
      }
      i2 = b.top;
      i1 = b.bottom;
      return a(paramInt, i2, i1);
      i2 = 0;
      Object localObject = null;
    }
  }
  
  private void c()
  {
    j = false;
    b();
    stopNestedScroll();
    h localh = d;
    if (localh != null)
    {
      d.b();
      localh = e;
      localh.b();
    }
  }
  
  private boolean c(int paramInt)
  {
    int i1 = 130;
    View localView1 = findFocus();
    boolean bool1;
    if (localView1 == this)
    {
      bool1 = false;
      localView1 = null;
    }
    Object localObject = FocusFinder.getInstance();
    View localView2 = ((FocusFinder)localObject).findNextFocus(this, localView1, paramInt);
    int i4 = getMaxScrollAmount();
    int i5;
    if (localView2 != null)
    {
      int i6 = getHeight();
      boolean bool3 = a(localView2, i4, i6);
      if (bool3)
      {
        localObject = b;
        localView2.getDrawingRect((Rect)localObject);
        localObject = b;
        offsetDescendantRectToMyCoords(localView2, (Rect)localObject);
        localObject = b;
        i4 = a((Rect)localObject);
        d(i4);
        localView2.requestFocus(paramInt);
        if (localView1 != null)
        {
          boolean bool2 = localView1.isFocused();
          if (bool2)
          {
            bool1 = a(localView1);
            if (bool1)
            {
              i2 = getDescendantFocusability();
              i5 = 131072;
              setDescendantFocusability(i5);
              requestFocus();
              setDescendantFocusability(i2);
            }
          }
        }
        int i2 = 1;
        return i2;
      }
    }
    int i8 = 33;
    if (paramInt == i8)
    {
      i8 = getScrollY();
      if (i8 < i5) {
        i5 = getScrollY();
      }
    }
    for (;;)
    {
      if (i5 != 0) {
        break label311;
      }
      int i3 = 0;
      localView1 = null;
      break;
      if (paramInt == i1)
      {
        i8 = getChildCount();
        if (i8 > 0)
        {
          localView2 = getChildAt(0);
          i8 = localView2.getBottom();
          int i7 = getScrollY();
          int i9 = getHeight();
          i7 += i9;
          i9 = getPaddingBottom();
          i7 -= i9;
          i9 = i8 - i7;
          if (i9 < i5) {
            i5 = i8 - i7;
          }
        }
      }
    }
    label311:
    if (paramInt == i1) {}
    for (;;)
    {
      d(i5);
      break;
      i5 = -i5;
    }
  }
  
  private void d()
  {
    int i1 = getOverScrollMode();
    int i2 = 2;
    h localh;
    if (i1 != i2)
    {
      Object localObject = d;
      if (localObject == null)
      {
        localObject = getContext();
        localh = new android/support/v4/widget/h;
        localh.<init>((Context)localObject);
        d = localh;
        localh = new android/support/v4/widget/h;
        localh.<init>((Context)localObject);
      }
    }
    for (e = localh;; e = null)
    {
      return;
      d = null;
    }
  }
  
  private void d(int paramInt)
  {
    if (paramInt != 0)
    {
      boolean bool = m;
      if (!bool) {
        break label20;
      }
      a(0, paramInt);
    }
    for (;;)
    {
      return;
      label20:
      scrollBy(0, paramInt);
    }
  }
  
  private void e(int paramInt)
  {
    int i1 = 0;
    int i2 = getScrollY();
    if ((i2 > 0) || (paramInt > 0))
    {
      int i4 = getScrollRange();
      if ((i2 < i4) || (paramInt < 0)) {
        i2 = 1;
      }
    }
    for (;;)
    {
      float f1 = paramInt;
      boolean bool = dispatchNestedPreFling(0.0F, f1);
      if (!bool)
      {
        f1 = paramInt;
        dispatchNestedFling(0.0F, f1, i2);
        if (i2 != 0)
        {
          i3 = getChildCount();
          if (i3 > 0)
          {
            i3 = getHeight();
            int i5 = getPaddingBottom();
            i3 -= i5;
            i5 = getPaddingTop();
            i3 -= i5;
            View localView = getChildAt(0);
            int i6 = localView.getHeight();
            m localm = c;
            i5 = getScrollX();
            i1 = getScrollY();
            i6 -= i3;
            int i7 = Math.max(0, i6);
            int i8 = i3 / 2;
            localOverScroller = a;
            i6 = paramInt;
            localm = null;
            localOverScroller.fling(i5, i1, 0, paramInt, 0, 0, 0, i7, 0, i8);
            w.c(this);
          }
        }
      }
      return;
      int i3 = 0;
      OverScroller localOverScroller = null;
    }
  }
  
  private float getVerticalScrollFactorCompat()
  {
    float f1 = z;
    Object localObject1 = null;
    boolean bool1 = f1 < 0.0F;
    if (!bool1)
    {
      Object localObject2 = new android/util/TypedValue;
      ((TypedValue)localObject2).<init>();
      localObject1 = getContext();
      Resources.Theme localTheme = ((Context)localObject1).getTheme();
      int i1 = 16842829;
      boolean bool2 = true;
      boolean bool3 = localTheme.resolveAttribute(i1, (TypedValue)localObject2, bool2);
      if (!bool3)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("Expected theme to define listPreferredItemHeight.");
        throw ((Throwable)localObject2);
      }
      localObject1 = ((Context)localObject1).getResources().getDisplayMetrics();
      f1 = ((TypedValue)localObject2).getDimension((DisplayMetrics)localObject1);
      z = f1;
    }
    return z;
  }
  
  public final void a(int paramInt)
  {
    int i1 = getScrollX();
    i1 = 0 - i1;
    int i2 = getScrollY();
    i2 = paramInt - i2;
    a(i1, i2);
  }
  
  public final boolean a(KeyEvent paramKeyEvent)
  {
    int i1 = 33;
    int i6 = 1;
    float f1 = Float.MIN_VALUE;
    int i8 = 130;
    boolean bool2 = false;
    b.setEmpty();
    Object localObject1 = getChildAt(0);
    int i9;
    int i11;
    Object localObject2;
    int i3;
    if (localObject1 != null)
    {
      i9 = ((View)localObject1).getHeight();
      i11 = getHeight();
      int i12 = getPaddingTop();
      i9 += i12;
      i12 = getPaddingBottom();
      i9 += i12;
      if (i11 < i9)
      {
        i9 = i6;
        if (i9 != 0) {
          break label194;
        }
        boolean bool1 = isFocused();
        if (bool1)
        {
          int i2 = paramKeyEvent.getKeyCode();
          i9 = 4;
          if (i2 != i9)
          {
            localObject2 = findFocus();
            if (localObject2 == this)
            {
              i2 = 0;
              localObject2 = null;
            }
            localObject1 = FocusFinder.getInstance();
            localObject2 = ((FocusFinder)localObject1).findNextFocus(this, (View)localObject2, i8);
            if ((localObject2 != null) && (localObject2 != this))
            {
              i3 = ((View)localObject2).requestFocus(i8);
              if (i3 != 0) {
                bool2 = i6;
              }
            }
          }
        }
      }
    }
    label194:
    int i4;
    for (;;)
    {
      return bool2;
      i9 = 0;
      localObject1 = null;
      break;
      i9 = 0;
      localObject1 = null;
      break;
      i9 = paramKeyEvent.getAction();
      if (i9 == 0)
      {
        i9 = paramKeyEvent.getKeyCode();
        switch (i9)
        {
        default: 
          break;
        case 19: 
          i6 = paramKeyEvent.isAltPressed();
          if (i6 == 0) {
            bool2 = c(i3);
          } else {
            bool2 = b(i3);
          }
          break;
        case 20: 
          i4 = paramKeyEvent.isAltPressed();
          if (i4 == 0) {
            bool2 = c(i8);
          } else {
            bool2 = b(i8);
          }
          break;
        }
      }
    }
    int i10 = paramKeyEvent.isShiftPressed();
    label325:
    label334:
    int i7;
    int i5;
    Rect localRect1;
    if (i10 != 0)
    {
      i10 = i4;
      if (i10 != i8) {
        break label506;
      }
      i4 = i6;
      i7 = getHeight();
      if (i4 == 0) {
        break label514;
      }
      localObject2 = b;
      i8 = getScrollY() + i7;
      top = i8;
      i5 = getChildCount();
      if (i5 > 0)
      {
        i5 += -1;
        localObject2 = getChildAt(i5);
        localRect1 = b;
        i8 = top + i7;
        i11 = ((View)localObject2).getBottom();
        if (i8 > i11)
        {
          localRect1 = b;
          i5 = ((View)localObject2).getBottom() - i7;
          top = i5;
        }
      }
    }
    for (;;)
    {
      localObject2 = b;
      localRect1 = b;
      i8 = top;
      i7 += i8;
      bottom = i7;
      localObject2 = b;
      i5 = top;
      Rect localRect2 = b;
      i7 = bottom;
      a(i10, i5, i7);
      break;
      i10 = i8;
      break label325;
      label506:
      i5 = 0;
      localObject2 = null;
      break label334;
      label514:
      localObject2 = b;
      i8 = getScrollY() - i7;
      top = i8;
      localObject2 = b;
      i5 = top;
      if (i5 < 0)
      {
        localObject2 = b;
        top = 0;
      }
    }
  }
  
  public void addView(View paramView)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScrollView can host only one direct child");
      throw localIllegalStateException;
    }
    super.addView(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScrollView can host only one direct child");
      throw localIllegalStateException;
    }
    super.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScrollView can host only one direct child");
      throw localIllegalStateException;
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScrollView can host only one direct child");
      throw localIllegalStateException;
    }
    super.addView(paramView, paramLayoutParams);
  }
  
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    int i1 = 1;
    Object localObject1 = c.a;
    boolean bool = ((OverScroller)localObject1).computeScrollOffset();
    int i4;
    int i2;
    int i5;
    int i6;
    int i8;
    Object localObject2;
    float f1;
    if (bool)
    {
      int i3 = getScrollX();
      i4 = getScrollY();
      localObject1 = c.a;
      i2 = ((OverScroller)localObject1).getCurrX();
      OverScroller localOverScroller = c.a;
      i5 = localOverScroller.getCurrY();
      if ((i3 != i2) || (i4 != i5))
      {
        i6 = getScrollRange();
        int i7 = getOverScrollMode();
        if ((i7 != 0) && ((i7 != i1) || (i6 <= 0))) {
          break label181;
        }
        i8 = i1;
        i2 -= i3;
        i7 = i5 - i4;
        localObject2 = this;
        a(i2, i7, i3, i4, i6);
        if (i8 != 0)
        {
          d();
          if ((i5 > 0) || (i4 <= 0)) {
            break label192;
          }
          localObject2 = d;
          localObject1 = c;
          f1 = ((m)localObject1).a();
          i2 = (int)f1;
          ((h)localObject2).a(i2);
        }
      }
    }
    for (;;)
    {
      return;
      label181:
      i1 = 0;
      localObject2 = null;
      i8 = 0;
      break;
      label192:
      if ((i5 >= i6) && (i4 < i6))
      {
        localObject2 = e;
        localObject1 = c;
        f1 = ((m)localObject1).a();
        i2 = (int)f1;
        ((h)localObject2).a(i2);
      }
    }
  }
  
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset()
  {
    int i1 = super.computeVerticalScrollOffset();
    return Math.max(0, i1);
  }
  
  public int computeVerticalScrollRange()
  {
    int i1 = getChildCount();
    int i2 = getHeight();
    int i3 = getPaddingBottom();
    i2 -= i3;
    i3 = getPaddingTop();
    i2 -= i3;
    if (i1 == 0) {
      i1 = i2;
    }
    for (;;)
    {
      return i1;
      View localView = getChildAt(0);
      i1 = localView.getBottom();
      i3 = getScrollY();
      i2 = i1 - i2;
      i2 = Math.max(0, i2);
      if (i3 < 0)
      {
        i1 -= i3;
      }
      else if (i3 > i2)
      {
        i2 = i3 - i2;
        i1 += i2;
      }
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    if (!bool)
    {
      bool = a(paramKeyEvent);
      if (!bool) {
        break label24;
      }
    }
    label24:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return y.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return y.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return y.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return y.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    h localh1 = d;
    if (localh1 != null)
    {
      int i1 = getScrollY();
      h localh2 = d;
      boolean bool2 = localh2.a();
      int i6;
      float f2;
      int i7;
      if (!bool2)
      {
        int i2 = paramCanvas.save();
        int i4 = getWidth();
        i6 = getPaddingLeft();
        i4 -= i6;
        i6 = getPaddingRight();
        i4 -= i6;
        i6 = getPaddingLeft();
        float f1 = i6;
        f2 = Math.min(0, i1);
        paramCanvas.translate(f1, f2);
        h localh3 = d;
        i7 = getHeight();
        localh3.a(i4, i7);
        h localh4 = d;
        boolean bool4 = localh4.a(paramCanvas);
        if (bool4) {
          w.c(this);
        }
        paramCanvas.restoreToCount(i2);
      }
      localh2 = e;
      boolean bool3 = localh2.a();
      if (!bool3)
      {
        int i3 = paramCanvas.save();
        int i5 = getWidth();
        i6 = getPaddingLeft();
        i5 -= i6;
        i6 = getPaddingRight();
        i5 -= i6;
        i6 = getHeight();
        i7 = -i5;
        int i8 = getPaddingLeft();
        i7 += i8;
        f2 = i7;
        float f3 = Math.max(getScrollRange(), i1) + i6;
        paramCanvas.translate(f2, f3);
        f3 = 180.0F;
        f2 = i5;
        i8 = 0;
        paramCanvas.rotate(f3, f2, 0.0F);
        e.a(i5, i6);
        localh1 = e;
        boolean bool1 = localh1.a(paramCanvas);
        if (bool1) {
          w.c(this);
        }
        paramCanvas.restoreToCount(i3);
      }
    }
  }
  
  protected float getBottomFadingEdgeStrength()
  {
    int i1 = getChildCount();
    float f1;
    if (i1 == 0)
    {
      i1 = 0;
      f1 = 0.0F;
    }
    for (;;)
    {
      return f1;
      i1 = getVerticalFadingEdgeLength();
      int i2 = getHeight();
      int i3 = getPaddingBottom();
      i2 -= i3;
      View localView = getChildAt(0);
      i3 = localView.getBottom();
      int i4 = getScrollY();
      i3 -= i4;
      i2 = i3 - i2;
      if (i2 < i1)
      {
        float f2 = i2;
        f1 = i1;
        f1 = f2 / f1;
      }
      else
      {
        i1 = 1065353216;
        f1 = 1.0F;
      }
    }
  }
  
  public int getMaxScrollAmount()
  {
    float f1 = getHeight();
    return (int)(0.5F * f1);
  }
  
  public int getNestedScrollAxes()
  {
    return x.a;
  }
  
  int getScrollRange()
  {
    int i1 = 0;
    int i2 = getChildCount();
    if (i2 > 0)
    {
      View localView = getChildAt(0);
      i2 = localView.getHeight();
      int i3 = getHeight();
      int i4 = getPaddingBottom();
      i3 -= i4;
      i4 = getPaddingTop();
      i3 -= i4;
      i2 -= i3;
      i1 = Math.max(0, i2);
    }
    return i1;
  }
  
  protected float getTopFadingEdgeStrength()
  {
    int i1 = getChildCount();
    float f1;
    if (i1 == 0)
    {
      i1 = 0;
      f1 = 0.0F;
    }
    for (;;)
    {
      return f1;
      i1 = getVerticalFadingEdgeLength();
      int i2 = getScrollY();
      if (i2 < i1)
      {
        float f2 = i2;
        f1 = i1;
        f1 = f2 / f1;
      }
      else
      {
        i1 = 1065353216;
        f1 = 1.0F;
      }
    }
  }
  
  public boolean hasNestedScrollingParent()
  {
    return y.a();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return y.a;
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    i1 += i2;
    int i3 = width;
    i3 = getChildMeasureSpec(paramInt1, i1, i3);
    i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    paramView.measure(i3, i1);
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    i1 += i2;
    i2 = leftMargin;
    i1 += i2;
    i2 = rightMargin;
    i1 = i1 + i2 + paramInt2;
    i2 = width;
    i1 = getChildMeasureSpec(paramInt1, i1, i2);
    i2 = topMargin;
    int i3 = View.MeasureSpec.makeMeasureSpec(bottomMargin + i2, 0);
    paramView.measure(i1, i3);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    h = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i2 = paramMotionEvent.getSource() & 0x2;
    if (i2 != 0)
    {
      i2 = paramMotionEvent.getAction();
      switch (i2)
      {
      }
    }
    label149:
    for (;;)
    {
      return bool1;
      boolean bool2 = j;
      if (!bool2)
      {
        int i3 = 9;
        float f1 = n.a(paramMotionEvent, i3);
        float f2 = 0.0F;
        boolean bool3 = f1 < 0.0F;
        if (bool3)
        {
          f2 = getVerticalScrollFactorCompat();
          f1 *= f2;
          int i4 = (int)f1;
          i3 = getScrollRange();
          int i5 = getScrollY();
          i4 = i5 - i4;
          if (i4 < 0)
          {
            i3 = 0;
            f1 = 0.0F;
          }
          for (;;)
          {
            if (i3 == i5) {
              break label149;
            }
            int i1 = getScrollX();
            super.scrollTo(i1, i3);
            i1 = 1;
            break;
            if (i4 <= i3) {
              i3 = i4;
            }
          }
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 2;
    int i2 = -1;
    int i3 = 1;
    float f1 = Float.MIN_VALUE;
    int i4 = 0;
    Object localObject1 = null;
    int i5 = paramMotionEvent.getAction();
    if (i5 == i1)
    {
      boolean bool2 = j;
      if (bool2) {
        return i3;
      }
    }
    i5 &= 0xFF;
    switch (i5)
    {
    }
    for (;;)
    {
      i3 = j;
      break;
      i5 = q;
      if (i5 != i2)
      {
        int i7 = paramMotionEvent.findPointerIndex(i5);
        Object localObject2;
        Object localObject3;
        if (i7 == i2)
        {
          localObject2 = "NestedScrollView";
          localObject1 = new java/lang/StringBuilder;
          String str = "Invalid pointerId=";
          ((StringBuilder)localObject1).<init>(str);
          localObject1 = ((StringBuilder)localObject1).append(i5);
          localObject3 = " in onInterceptTouchEvent";
          localObject1 = (String)localObject3;
          Log.e((String)localObject2, (String)localObject1);
        }
        else
        {
          float f2 = paramMotionEvent.getY(i7);
          i5 = (int)f2;
          i7 = f;
          i7 = Math.abs(i5 - i7);
          i2 = n;
          if (i7 > i2)
          {
            i7 = getNestedScrollAxes() & 0x2;
            if (i7 == 0)
            {
              j = i3;
              f = i5;
              a();
              localObject3 = k;
              ((VelocityTracker)localObject3).addMovement(paramMotionEvent);
              t = 0;
              localObject1 = getParent();
              if (localObject1 != null)
              {
                ((ViewParent)localObject1).requestDisallowInterceptTouchEvent(i3);
                continue;
                i7 = (int)paramMotionEvent.getY();
                f2 = paramMotionEvent.getX();
                i5 = (int)f2;
                i2 = getChildCount();
                if (i2 > 0)
                {
                  i2 = getScrollY();
                  View localView = getChildAt(0);
                  int i8 = localView.getTop() - i2;
                  if (i7 >= i8)
                  {
                    i8 = localView.getBottom();
                    i2 = i8 - i2;
                    if (i7 < i2)
                    {
                      i2 = localView.getLeft();
                      if (i5 >= i2)
                      {
                        i2 = localView.getRight();
                        if (i5 < i2)
                        {
                          i5 = i3;
                          f2 = f1;
                        }
                      }
                    }
                  }
                }
                for (;;)
                {
                  if (i5 != 0) {
                    break label445;
                  }
                  j = false;
                  b();
                  break;
                  i5 = 0;
                  localObject3 = null;
                  f2 = 0.0F;
                  continue;
                  i5 = 0;
                  localObject3 = null;
                  f2 = 0.0F;
                }
                label445:
                f = i7;
                i5 = paramMotionEvent.getPointerId(0);
                q = i5;
                localObject3 = k;
                if (localObject3 == null)
                {
                  localObject3 = VelocityTracker.obtain();
                  k = ((VelocityTracker)localObject3);
                  label486:
                  k.addMovement(paramMotionEvent);
                  c.a.computeScrollOffset();
                  localObject3 = c.a;
                  boolean bool1 = ((OverScroller)localObject3).isFinished();
                  if (bool1) {
                    break label555;
                  }
                }
                for (;;)
                {
                  j = i3;
                  startNestedScroll(i1);
                  break;
                  localObject3 = k;
                  ((VelocityTracker)localObject3).clear();
                  break label486;
                  label555:
                  i3 = 0;
                  localObject2 = null;
                  f1 = 0.0F;
                }
                j = false;
                q = i2;
                b();
                localObject2 = c;
                i4 = getScrollX();
                int i6 = getScrollY();
                i7 = getScrollRange();
                i3 = ((m)localObject2).a(i4, i6, i7);
                if (i3 != 0) {
                  w.c(this);
                }
                stopNestedScroll();
                continue;
                a(paramMotionEvent);
              }
            }
          }
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    int i2 = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    g = false;
    Object localObject = i;
    if (localObject != null)
    {
      localObject = i;
      bool = a((View)localObject, this);
      if (bool)
      {
        localObject = i;
        b((View)localObject);
      }
    }
    i = null;
    boolean bool = h;
    int i3;
    if (!bool)
    {
      localObject = u;
      if (localObject != null)
      {
        i3 = getScrollX();
        NestedScrollView.c localc = u;
        i4 = a;
        scrollTo(i3, i4);
        u = null;
      }
      i3 = getChildCount();
      if (i3 <= 0) {
        break label248;
      }
      localObject = getChildAt(0);
      i3 = ((View)localObject).getMeasuredHeight();
      int i4 = paramInt4 - paramInt2;
      i1 = getPaddingBottom();
      i4 -= i1;
      i1 = getPaddingTop();
      i4 -= i1;
      i3 -= i4;
      i3 = Math.max(0, i3);
      i4 = getScrollY();
      if (i4 <= i3) {
        break label257;
      }
      i2 = getScrollX();
      scrollTo(i2, i3);
    }
    for (;;)
    {
      i3 = getScrollX();
      i2 = getScrollY();
      scrollTo(i3, i2);
      h = true;
      return;
      label248:
      i3 = 0;
      localObject = null;
      break;
      label257:
      i3 = getScrollY();
      if (i3 < 0)
      {
        i3 = getScrollX();
        scrollTo(i3, 0);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    boolean bool = l;
    if (!bool) {}
    for (;;)
    {
      return;
      int i1 = View.MeasureSpec.getMode(paramInt2);
      if (i1 != 0)
      {
        i1 = getChildCount();
        if (i1 > 0)
        {
          FrameLayout.LayoutParams localLayoutParams = null;
          View localView = getChildAt(0);
          int i2 = getMeasuredHeight();
          i1 = localView.getMeasuredHeight();
          if (i1 < i2)
          {
            localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
            int i3 = getPaddingLeft();
            int i4 = getPaddingRight();
            i3 += i4;
            i1 = width;
            i1 = getChildMeasureSpec(paramInt1, i3, i1);
            i3 = getPaddingTop();
            i2 -= i3;
            i3 = getPaddingBottom();
            i2 -= i3;
            i3 = 1073741824;
            i2 = View.MeasureSpec.makeMeasureSpec(i2, i3);
            localView.measure(i1, i2);
          }
        }
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      i1 = (int)paramFloat2;
      e(i1);
    }
    int i2;
    for (int i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt, null);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getScrollY();
    scrollBy(0, paramInt4);
    int i2 = getScrollY() - i1;
    int i3 = paramInt4 - i2;
    dispatchNestedScroll(0, i2, 0, i3, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    x.a = paramInt;
    startNestedScroll(2);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool1 = false;
    int i1 = 2;
    Object localObject;
    boolean bool2;
    if (paramInt == i1)
    {
      paramInt = 130;
      if (paramRect != null) {
        break label59;
      }
      localObject = FocusFinder.getInstance();
      bool2 = false;
      localObject = ((FocusFinder)localObject).findNextFocus(this, null, paramInt);
      label37:
      if (localObject != null) {
        break label73;
      }
    }
    for (;;)
    {
      return bool1;
      i1 = 1;
      if (paramInt != i1) {
        break;
      }
      paramInt = 33;
      break;
      label59:
      localObject = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, paramInt);
      break label37;
      label73:
      bool2 = a((View)localObject);
      if (!bool2) {
        bool1 = ((View)localObject).requestFocus(paramInt, paramRect);
      }
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof NestedScrollView.c;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (NestedScrollView.c)paramParcelable;
      Parcelable localParcelable = paramParcelable.getSuperState();
      super.onRestoreInstanceState(localParcelable);
      u = paramParcelable;
      requestLayout();
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    NestedScrollView.c localc = new android/support/v4/widget/NestedScrollView$c;
    localc.<init>(localParcelable);
    int i1 = getScrollY();
    a = i1;
    return localc;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    NestedScrollView.b localb = A;
    if (localb != null)
    {
      localb = A;
      localb.a(this);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = findFocus();
    if ((localObject == null) || (this == localObject)) {}
    for (;;)
    {
      return;
      Rect localRect = null;
      boolean bool = a((View)localObject, 0, paramInt4);
      if (bool)
      {
        localRect = b;
        ((View)localObject).getDrawingRect(localRect);
        localRect = b;
        offsetDescendantRectToMyCoords((View)localObject, localRect);
        localObject = b;
        int i1 = a((Rect)localObject);
        d(i1);
      }
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    int i1 = paramInt & 0x2;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public void onStopNestedScroll(View paramView)
  {
    x.a = 0;
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    a();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i1 = n.a(paramMotionEvent);
    if (i1 == 0)
    {
      bool6 = false;
      f1 = 0.0F;
      localObject1 = null;
      t = 0;
    }
    boolean bool6 = false;
    float f1 = 0.0F;
    Object localObject1 = null;
    int i11 = t;
    float f2 = i11;
    localMotionEvent.offsetLocation(0.0F, f2);
    Object localObject2;
    float f3;
    int i14;
    int i10;
    int[] arrayOfInt1;
    float f4;
    int i15;
    float f5;
    int i13;
    switch (i1)
    {
    case 4: 
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        localObject2 = k;
        if (localObject2 != null)
        {
          localObject2 = k;
          ((VelocityTracker)localObject2).addMovement(localMotionEvent);
        }
        localMotionEvent.recycle();
        i1 = 1;
        f3 = Float.MIN_VALUE;
        for (;;)
        {
          return i1;
          int i2 = getChildCount();
          if (i2 != 0) {
            break;
          }
          i2 = 0;
          f3 = 0.0F;
          localObject2 = null;
        }
        localObject2 = c.a;
        boolean bool1 = ((OverScroller)localObject2).isFinished();
        if (!bool1)
        {
          bool1 = true;
          f3 = Float.MIN_VALUE;
        }
        for (;;)
        {
          j = bool1;
          if (bool1)
          {
            localObject2 = getParent();
            if (localObject2 != null)
            {
              bool6 = true;
              f1 = Float.MIN_VALUE;
              ((ViewParent)localObject2).requestDisallowInterceptTouchEvent(bool6);
            }
          }
          localObject2 = c.a;
          bool1 = ((OverScroller)localObject2).isFinished();
          if (!bool1)
          {
            localObject2 = c.a;
            ((OverScroller)localObject2).abortAnimation();
          }
          i3 = (int)paramMotionEvent.getY();
          f = i3;
          localObject2 = null;
          i3 = paramMotionEvent.getPointerId(0);
          q = i3;
          i3 = 2;
          f3 = 2.8E-45F;
          startNestedScroll(i3);
          break;
          i3 = 0;
          f3 = 0.0F;
          localObject2 = null;
        }
        i3 = q;
        i14 = paramMotionEvent.findPointerIndex(i3);
        i3 = -1;
        f3 = 0.0F / 0.0F;
        if (i14 != i3) {
          break;
        }
        localObject2 = "NestedScrollView";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Invalid pointerId=");
        i11 = q;
        localObject1 = ((StringBuilder)localObject1).append(i11);
        localObject3 = " in onTouchEvent";
        localObject1 = (String)localObject3;
        Log.e((String)localObject2, (String)localObject1);
      }
      f3 = paramMotionEvent.getY(i14);
      i10 = (int)f3;
      int i3 = f - i10;
      f2 = 0.0F;
      Object localObject3 = null;
      arrayOfInt1 = s;
      int[] arrayOfInt2 = r;
      boolean bool7 = dispatchNestedPreScroll(0, i3, arrayOfInt1, arrayOfInt2);
      int i16;
      if (bool7)
      {
        int i12 = s[1];
        i3 -= i12;
        f2 = 0.0F;
        localObject3 = null;
        f4 = r[1];
        localMotionEvent.offsetLocation(0.0F, f4);
        i12 = t;
        arrayOfInt1 = r;
        i15 = 1;
        f5 = Float.MIN_VALUE;
        i16 = arrayOfInt1[i15];
        i12 += i16;
        t = i12;
      }
      boolean bool8 = j;
      if (!bool8)
      {
        i13 = Math.abs(i3);
        i16 = n;
        if (i13 > i16)
        {
          localObject3 = getParent();
          if (localObject3 != null)
          {
            i16 = 1;
            f4 = Float.MIN_VALUE;
            ((ViewParent)localObject3).requestDisallowInterceptTouchEvent(i16);
          }
          i13 = 1;
          f2 = Float.MIN_VALUE;
          j = i13;
          if (i3 > 0)
          {
            i13 = n;
            i3 -= i13;
            i13 = i3;
          }
        }
      }
      break;
    }
    for (;;)
    {
      label608:
      boolean bool2 = j;
      if (!bool2) {
        break;
      }
      localObject2 = r;
      int i17 = 1;
      f4 = Float.MIN_VALUE;
      int i4 = localObject2[i17];
      i4 = i10 - i4;
      f = i4;
      int i18 = getScrollY();
      int i19 = getScrollRange();
      i4 = getOverScrollMode();
      if (i4 != 0)
      {
        i10 = 1;
        f1 = Float.MIN_VALUE;
        if ((i4 != i10) || (i19 <= 0)) {}
      }
      else
      {
        i4 = 1;
        f3 = Float.MIN_VALUE;
      }
      for (int i20 = i4;; i20 = 0)
      {
        i10 = 0;
        f1 = 0.0F;
        localObject1 = null;
        i17 = 0;
        f4 = 0.0F;
        arrayOfInt1 = null;
        i15 = getScrollY();
        localObject2 = this;
        boolean bool3 = a(0, i13, 0, i15, i19);
        if (bool3)
        {
          bool3 = hasNestedScrollingParent();
          if (!bool3)
          {
            localObject2 = k;
            ((VelocityTracker)localObject2).clear();
          }
        }
        int i21 = getScrollY() - i18;
        int i22 = i13 - i21;
        int[] arrayOfInt3 = r;
        bool3 = dispatchNestedScroll(0, i21, 0, i22, arrayOfInt3);
        if (!bool3) {
          break label911;
        }
        i5 = f;
        i10 = r[1];
        i5 -= i10;
        f = i5;
        f3 = 0.0F;
        localObject2 = null;
        f1 = r[1];
        localMotionEvent.offsetLocation(0.0F, f1);
        i5 = t;
        localObject1 = r;
        i13 = 1;
        f2 = Float.MIN_VALUE;
        i10 = localObject1[i13];
        i5 += i10;
        t = i5;
        break;
        i13 = n;
        i5 += i13;
        i13 = i5;
        break label608;
        i5 = 0;
        f3 = 0.0F;
        localObject2 = null;
      }
      label911:
      if (i20 == 0) {
        break;
      }
      d();
      int i5 = i18 + i13;
      if (i5 < 0)
      {
        localObject2 = d;
        f1 = i13;
        i13 = getHeight();
        f2 = i13;
        f1 /= f2;
        f2 = paramMotionEvent.getX(i14);
        i17 = getWidth();
        f4 = i17;
        f2 /= f4;
        ((h)localObject2).a(f1, f2);
        localObject2 = e;
        i6 = ((h)localObject2).a();
        if (i6 == 0)
        {
          localObject2 = e;
          ((h)localObject2).b();
        }
      }
      for (;;)
      {
        localObject2 = d;
        if (localObject2 == null) {
          break;
        }
        localObject2 = d;
        i6 = ((h)localObject2).a();
        if (i6 != 0)
        {
          localObject2 = e;
          i6 = ((h)localObject2).a();
          if (i6 != 0) {
            break;
          }
        }
        w.c(this);
        break;
        if (i6 > i19)
        {
          localObject2 = e;
          f1 = i13;
          f2 = getHeight();
          f1 /= f2;
          i13 = 1065353216;
          f4 = paramMotionEvent.getX(i14);
          i15 = getWidth();
          f5 = i15;
          f4 /= f5;
          f2 = 1.0F - f4;
          ((h)localObject2).a(f1, f2);
          localObject2 = d;
          i6 = ((h)localObject2).a();
          if (i6 == 0)
          {
            localObject2 = d;
            ((h)localObject2).b();
          }
        }
      }
      int i6 = j;
      int i7;
      if (i6 != 0)
      {
        localObject2 = k;
        f1 = 1.401E-42F;
        f2 = p;
        ((VelocityTracker)localObject2).computeCurrentVelocity(1000, f2);
        i10 = q;
        f3 = v.b((VelocityTracker)localObject2, i10);
        i7 = (int)f3;
        i10 = Math.abs(i7);
        i13 = o;
        if (i10 <= i13) {
          break label1286;
        }
        i7 = -i7;
        e(i7);
      }
      for (;;)
      {
        i7 = -1;
        f3 = 0.0F / 0.0F;
        q = i7;
        c();
        break;
        label1286:
        localObject2 = c;
        i10 = getScrollX();
        i13 = getScrollY();
        i17 = getScrollRange();
        bool4 = ((m)localObject2).a(i10, i13, i17);
        if (bool4) {
          w.c(this);
        }
      }
      boolean bool4 = j;
      if (bool4)
      {
        int i8 = getChildCount();
        if (i8 > 0)
        {
          localObject2 = c;
          i10 = getScrollX();
          i13 = getScrollY();
          i17 = getScrollRange();
          boolean bool5 = ((m)localObject2).a(i10, i13, i17);
          if (bool5) {
            w.c(this);
          }
        }
      }
      int i9 = -1;
      f3 = 0.0F / 0.0F;
      q = i9;
      c();
      break;
      i9 = n.b(paramMotionEvent);
      f1 = paramMotionEvent.getY(i9);
      i10 = (int)f1;
      f = i10;
      i9 = paramMotionEvent.getPointerId(i9);
      q = i9;
      break;
      a(paramMotionEvent);
      i9 = q;
      i9 = paramMotionEvent.findPointerIndex(i9);
      f3 = paramMotionEvent.getY(i9);
      i9 = (int)f3;
      f = i9;
      break;
      i13 = i9;
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    boolean bool = g;
    if (!bool) {
      b(paramView2);
    }
    for (;;)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      i = paramView2;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    int i1 = paramView.getLeft();
    int i3 = paramView.getScrollX();
    i1 -= i3;
    int i4 = paramView.getTop();
    int i5 = paramView.getScrollY();
    i4 -= i5;
    paramRect.offset(i1, i4);
    i4 = a(paramRect);
    if (i4 != 0)
    {
      i1 = 1;
      if (i1 != 0)
      {
        if (!paramBoolean) {
          break label86;
        }
        scrollBy(0, i4);
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      break;
      label86:
      a(0, i4);
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      b();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    g = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      View localView = getChildAt(0);
      int i2 = getWidth();
      int i3 = getPaddingRight();
      i2 -= i3;
      i3 = getPaddingLeft();
      i2 -= i3;
      i3 = localView.getWidth();
      i2 = b(paramInt1, i2, i3);
      i3 = getHeight();
      int i4 = getPaddingBottom();
      i3 -= i4;
      i4 = getPaddingTop();
      i3 -= i4;
      i1 = localView.getHeight();
      i1 = b(paramInt2, i3, i1);
      i3 = getScrollX();
      if (i2 == i3)
      {
        i3 = getScrollY();
        if (i1 == i3) {}
      }
      else
      {
        super.scrollTo(i2, i1);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    boolean bool = l;
    if (paramBoolean != bool)
    {
      l = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    y.a(paramBoolean);
  }
  
  public void setOnScrollChangeListener(NestedScrollView.b paramb)
  {
    A = paramb;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    m = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return y.a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    y.b();
  }
}


/* Location:              android/support/v4/widget/NestedScrollView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */