package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.h.b;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.p;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView
  extends am
  implements h.b, p
{
  h a;
  boolean b;
  d c;
  h.a d;
  ActionMenuView.e e;
  private Context f;
  private int g;
  private o.a h;
  private boolean i;
  private int j;
  private int k;
  private int l;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f1 = getResourcesgetDisplayMetricsdensity;
    int m = (int)(56.0F * f1);
    k = m;
    int n = (int)(f1 * 4.0F);
    l = n;
    f = paramContext;
    g = 0;
  }
  
  static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int m = 1;
    int n = 2;
    boolean bool2 = false;
    ActionMenuView.c localc = (ActionMenuView.c)paramView.getLayoutParams();
    int i1 = View.MeasureSpec.getSize(paramInt3) - paramInt4;
    int i3 = View.MeasureSpec.getMode(paramInt3);
    int i4 = View.MeasureSpec.makeMeasureSpec(i1, i3);
    boolean bool3 = paramView instanceof ActionMenuItemView;
    Object localObject;
    label83:
    int i2;
    if (bool3)
    {
      localObject = paramView;
      localObject = (ActionMenuItemView)paramView;
      if (localObject == null) {
        break label237;
      }
      bool3 = ((ActionMenuItemView)localObject).b();
      if (!bool3) {
        break label237;
      }
      i3 = m;
      if ((paramInt2 <= 0) || ((i3 != 0) && (paramInt2 < n))) {
        break label243;
      }
      i2 = View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, -1 << -1);
      ((View)paramView).measure(i2, i4);
      int i5 = ((View)paramView).getMeasuredWidth();
      i2 = i5 / paramInt1;
      i5 %= paramInt1;
      if (i5 != 0) {
        i2 += 1;
      }
      if ((i3 != 0) && (i2 < n)) {
        i2 = n;
      }
    }
    for (;;)
    {
      boolean bool1 = a;
      if ((!bool1) && (i3 != 0)) {
        bool2 = m;
      }
      d = bool2;
      b = i2;
      int i6 = View.MeasureSpec.makeMeasureSpec(i2 * paramInt1, 1073741824);
      ((View)paramView).measure(i6, i4);
      return i2;
      i2 = 0;
      localObject = null;
      break;
      label237:
      i3 = 0;
      break label83;
      label243:
      i2 = 0;
      localObject = null;
    }
  }
  
  public static ActionMenuView.c a()
  {
    ActionMenuView.c localc = d();
    a = true;
    return localc;
  }
  
  protected static ActionMenuView.c a(ViewGroup.LayoutParams paramLayoutParams)
  {
    ActionMenuView.c localc;
    if (paramLayoutParams != null)
    {
      boolean bool = paramLayoutParams instanceof ActionMenuView.c;
      if (bool)
      {
        localc = new android/support/v7/widget/ActionMenuView$c;
        paramLayoutParams = (ActionMenuView.c)paramLayoutParams;
        localc.<init>(paramLayoutParams);
        int m = h;
        if (m <= 0)
        {
          m = 16;
          h = m;
        }
      }
    }
    for (;;)
    {
      return localc;
      localc = new android/support/v7/widget/ActionMenuView$c;
      localc.<init>(paramLayoutParams);
      break;
      localc = d();
    }
  }
  
  private ActionMenuView.c b(AttributeSet paramAttributeSet)
  {
    ActionMenuView.c localc = new android/support/v7/widget/ActionMenuView$c;
    Context localContext = getContext();
    localc.<init>(localContext, paramAttributeSet);
    return localc;
  }
  
  private boolean b(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    Object localObject;
    if (paramInt == 0)
    {
      bool2 = false;
      localObject = null;
    }
    for (;;)
    {
      return bool2;
      int m = paramInt + -1;
      localObject = getChildAt(m);
      View localView = getChildAt(paramInt);
      int n = getChildCount();
      if (paramInt < n)
      {
        boolean bool4 = localObject instanceof ActionMenuView.a;
        if (bool4)
        {
          localObject = (ActionMenuView.a)localObject;
          bool3 = ((ActionMenuView.a)localObject).d();
          bool1 = bool3 | false;
        }
      }
      if (paramInt > 0)
      {
        bool3 = localView instanceof ActionMenuView.a;
        if (bool3)
        {
          localObject = localView;
          localObject = (ActionMenuView.a)localView;
          bool3 = ((ActionMenuView.a)localObject).c() | bool1;
          continue;
        }
      }
      boolean bool3 = bool1;
    }
  }
  
  private static ActionMenuView.c d()
  {
    ActionMenuView.c localc = new android/support/v7/widget/ActionMenuView$c;
    localc.<init>();
    h = 16;
    return localc;
  }
  
  public final void a(h paramh)
  {
    a = paramh;
  }
  
  public final void a(o.a parama, h.a parama1)
  {
    h = parama;
    d = parama1;
  }
  
  public final boolean a(j paramj)
  {
    return a.a(paramj, null, 0);
  }
  
  public final void b()
  {
    d locald = c;
    if (locald != null)
    {
      locald = c;
      locald.h();
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      bool = paramLayoutParams instanceof ActionMenuView.c;
      if (!bool) {}
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public Menu getMenu()
  {
    Object localObject1 = a;
    Object localObject2;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = getContext();
      localObject2 = new android/support/v7/view/menu/h;
      ((h)localObject2).<init>((Context)localObject1);
      a = ((h)localObject2);
      localObject2 = a;
      localObject3 = new android/support/v7/widget/ActionMenuView$d;
      ((ActionMenuView.d)localObject3).<init>(this);
      ((h)localObject2).a((h.a)localObject3);
      localObject2 = new android/support/v7/widget/d;
      ((d)localObject2).<init>((Context)localObject1);
      c = ((d)localObject2);
      c.e();
      localObject2 = c;
      localObject1 = h;
      if (localObject1 == null) {
        break label128;
      }
      localObject1 = h;
    }
    for (;;)
    {
      f = ((o.a)localObject1);
      localObject1 = a;
      localObject2 = c;
      localObject3 = f;
      ((h)localObject1).a((o)localObject2, (Context)localObject3);
      localObject1 = c;
      ((d)localObject1).a(this);
      return a;
      label128:
      localObject1 = new android/support/v7/widget/ActionMenuView$b;
      ((ActionMenuView.b)localObject1).<init>(this);
    }
  }
  
  public Drawable getOverflowIcon()
  {
    getMenu();
    Object localObject = c;
    d.d locald = i;
    if (locald != null) {
      localObject = i.getDrawable();
    }
    for (;;)
    {
      return (Drawable)localObject;
      boolean bool = k;
      if (bool) {
        localObject = j;
      } else {
        localObject = null;
      }
    }
  }
  
  public int getPopupTheme()
  {
    return g;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    d locald = c;
    if (locald != null)
    {
      c.a(false);
      locald = c;
      boolean bool = locald.j();
      if (bool)
      {
        c.g();
        locald = c;
        locald.f();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = i;
    if (!bool1)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int n = getChildCount();
    int i1 = (paramInt4 - paramInt2) / 2;
    int i2 = getDividerWidth();
    int i3 = 0;
    View localView1 = null;
    int m = paramInt3 - paramInt1;
    int i4 = getPaddingRight();
    m -= i4;
    i4 = getPaddingLeft();
    int i6 = m - i4;
    boolean bool3 = false;
    boolean bool4 = bk.a(this);
    m = 0;
    Object localObject = null;
    int i9 = 0;
    label99:
    View localView2;
    int i5;
    int i7;
    label216:
    int i13;
    if (i9 < n)
    {
      localView2 = getChildAt(i9);
      m = localView2.getVisibility();
      i4 = 8;
      if (m == i4) {
        break label906;
      }
      localObject = (ActionMenuView.c)localView2.getLayoutParams();
      boolean bool2 = a;
      if (bool2)
      {
        i5 = localView2.getMeasuredWidth();
        bool3 = b(i9);
        if (bool3) {
          i5 += i2;
        }
        int i12 = localView2.getMeasuredHeight();
        if (bool4)
        {
          i7 = getPaddingLeft();
          m = leftMargin + i7;
          i7 = m + i5;
          i13 = i12 / 2;
          i13 = i1 - i13;
          i12 += i13;
          localView2.layout(m, i13, i7, i12);
          m = i6 - i5;
          i7 = 1;
          i5 = i3;
        }
      }
    }
    for (;;)
    {
      i9 += 1;
      i3 = i5;
      i6 = m;
      break label99;
      i7 = getWidth();
      i13 = getPaddingRight();
      i7 -= i13;
      m = rightMargin;
      i7 -= m;
      m = i7 - i5;
      break label216;
      i5 = localView2.getMeasuredWidth();
      int i14 = leftMargin;
      i5 += i14;
      m = rightMargin + i5;
      m = i6 - m;
      b(i9);
      i5 = i3 + 1;
      continue;
      m = 1;
      if ((n == m) && (i7 == 0))
      {
        m = 0;
        localObject = getChildAt(0);
        i5 = ((View)localObject).getMeasuredWidth();
        i7 = ((View)localObject).getMeasuredHeight();
        i6 = (paramInt3 - paramInt1) / 2;
        i3 = i5 / 2;
        i6 -= i3;
        i3 = i7 / 2;
        i3 = i1 - i3;
        i5 += i6;
        i7 += i3;
        ((View)localObject).layout(i6, i3, i5, i7);
        break;
      }
      label491:
      label513:
      label554:
      int i10;
      int i8;
      if (i7 != 0)
      {
        m = 0;
        localObject = null;
        m = i3 - m;
        i5 = 0;
        if (m <= 0) {
          break label716;
        }
        m = i6 / m;
        i6 = Math.max(0, m);
        if (!bool4) {
          break label725;
        }
        m = getWidth();
        i5 = getPaddingRight();
        i5 = m - i5;
        m = 0;
        localObject = null;
        i7 = 0;
        if (i7 < n)
        {
          localView1 = getChildAt(i7);
          localObject = (ActionMenuView.c)localView1.getLayoutParams();
          i9 = localView1.getVisibility();
          i2 = 8;
          if (i9 == i2) {
            break label899;
          }
          boolean bool5 = a;
          if (bool5) {
            break label899;
          }
          i10 = rightMargin;
          i5 -= i10;
          i10 = localView1.getMeasuredWidth();
          i2 = localView1.getMeasuredHeight();
          i8 = i2 / 2;
          i8 = i1 - i8;
          i14 = i5 - i10;
          i2 += i8;
          localView1.layout(i14, i8, i5, i2);
          m = leftMargin + i10 + i6;
        }
      }
      label716:
      label725:
      label740:
      label892:
      label899:
      for (m = i5 - m;; m = i5)
      {
        i7 += 1;
        i5 = m;
        break label554;
        break;
        m = 1;
        break label491;
        m = 0;
        localObject = null;
        break label513;
        i5 = getPaddingLeft();
        m = 0;
        localObject = null;
        i7 = 0;
        int i11;
        if (i7 < n)
        {
          localView1 = getChildAt(i7);
          localObject = (ActionMenuView.c)localView1.getLayoutParams();
          i10 = localView1.getVisibility();
          i2 = 8;
          if (i10 == i2) {
            break label892;
          }
          boolean bool6 = a;
          if (bool6) {
            break label892;
          }
          i11 = leftMargin;
          i5 += i11;
          i11 = localView1.getMeasuredWidth();
          i2 = localView1.getMeasuredHeight();
          i8 = i2 / 2;
          i8 = i1 - i8;
          i14 = i5 + i11;
          i2 += i8;
          localView1.layout(i5, i8, i14, i2);
        }
        for (m = rightMargin + i11 + i6 + i5;; m = i5)
        {
          i7 += 1;
          i5 = m;
          break label740;
          break;
        }
      }
      label906:
      m = i6;
      i5 = i3;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = i;
    int i5 = View.MeasureSpec.getMode(paramInt1);
    int i15 = 1073741824;
    float f1 = 2.0F;
    if (i5 == i15)
    {
      i5 = 1;
      f2 = Float.MIN_VALUE;
    }
    int i18;
    int i19;
    int i20;
    int i22;
    int i28;
    int i29;
    for (;;)
    {
      i = i5;
      boolean bool3 = i;
      if (bool1 != bool3)
      {
        bool3 = false;
        f2 = 0.0F;
        localObject1 = null;
        j = 0;
      }
      int i6 = View.MeasureSpec.getSize(paramInt1);
      bool1 = i;
      if (bool1)
      {
        localObject2 = a;
        if (localObject2 != null)
        {
          int m = j;
          if (i6 != m)
          {
            j = i6;
            localObject1 = a;
            m = 1;
            f3 = Float.MIN_VALUE;
            ((h)localObject1).a(m);
          }
        }
      }
      i15 = getChildCount();
      boolean bool4 = i;
      if ((!bool4) || (i15 <= 0)) {
        break label2056;
      }
      i18 = View.MeasureSpec.getMode(paramInt2);
      i7 = View.MeasureSpec.getSize(paramInt1);
      i19 = View.MeasureSpec.getSize(paramInt2);
      n = getPaddingLeft();
      i15 = getPaddingRight();
      n += i15;
      i15 = getPaddingTop();
      i20 = getPaddingBottom();
      i22 = i15 + i20;
      i15 = -2;
      f1 = 0.0F / 0.0F;
      i23 = paramInt2;
      i28 = getChildMeasureSpec(paramInt2, i22, i15);
      i29 = i7 - n;
      i7 = k;
      i20 = i29 / i7;
      i7 = k;
      i7 = i29 % i7;
      if (i20 != 0) {
        break;
      }
      i7 = 0;
      f2 = 0.0F;
      localObject1 = null;
      setMeasuredDimension(i29, 0);
      return;
      i7 = 0;
      f2 = 0.0F;
      localObject1 = null;
    }
    int n = k;
    i7 /= i20;
    int i30 = n + i7;
    int i31 = 0;
    int i32 = 0;
    int i33 = 0;
    View localView1 = null;
    n = 0;
    float f3 = 0.0F;
    Object localObject2 = null;
    int i35 = 0;
    float f4 = 0.0F;
    long l1 = 0L;
    int i36 = getChildCount();
    int i7 = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    int i37 = 0;
    float f5 = 0.0F;
    label357:
    int i23 = i37;
    View localView2;
    int i39;
    int i24;
    int i42;
    int i45;
    label539:
    label561:
    int i41;
    int i2;
    label607:
    label626:
    long l2;
    int i47;
    int i48;
    long l3;
    if (i37 < i36)
    {
      localView2 = getChildAt(i37);
      i7 = localView2.getVisibility();
      i39 = 8;
      if (i7 == i39) {
        break label2210;
      }
      boolean bool11 = localView2 instanceof ActionMenuItemView;
      boolean bool14 = bool11;
      i39 = n + 1;
      if (bool11)
      {
        i7 = l;
        n = 0;
        f3 = 0.0F;
        localObject2 = null;
        i24 = l;
        i42 = i24;
        i45 = 0;
        localView2.setPadding(i7, 0, i24, 0);
      }
      localObject1 = (ActionMenuView.c)localView2.getLayoutParams();
      f = false;
      c = 0;
      b = 0;
      d = false;
      leftMargin = 0;
      n = 0;
      f3 = 0.0F;
      localObject2 = null;
      rightMargin = 0;
      if (bool14)
      {
        localObject2 = localView2;
        localObject2 = (ActionMenuItemView)localView2;
        int i1 = ((ActionMenuItemView)localObject2).b();
        if (i1 != 0)
        {
          i1 = 1;
          f3 = Float.MIN_VALUE;
          e = i1;
          i1 = a;
          if (i1 == 0) {
            break label759;
          }
          i1 = 1;
          f3 = Float.MIN_VALUE;
          i24 = i30;
          i41 = a(localView2, i30, i1, i28, i22);
          i24 = i41;
          i32 = Math.max(i32, i41);
          boolean bool2 = d;
          if (!bool2) {
            break label2204;
          }
          i2 = i33 + 1;
          int i8 = a;
          if (i8 == 0) {
            break label2193;
          }
          i8 = 1;
          f2 = Float.MIN_VALUE;
          i35 = i20 - i41;
          i15 = localView2.getMeasuredHeight();
          i24 = i31;
          i33 = Math.max(i31, i15);
          i15 = 1;
          f1 = Float.MIN_VALUE;
          i24 = i41;
          if (i41 != i15) {
            break label2159;
          }
          f1 = Float.MIN_VALUE;
          l2 = 1 << i37 | l1;
          i47 = i33;
          i48 = i35;
          i33 = i2;
          i35 = i8;
          f4 = f2;
          l3 = l2;
          i20 = i32;
          i15 = i39;
        }
      }
    }
    for (;;)
    {
      i39 = i37 + 1;
      i37 = i39;
      i32 = i20;
      i31 = i47;
      i20 = i48;
      l1 = l3;
      i2 = i15;
      break label357;
      i2 = 0;
      f3 = 0.0F;
      localObject2 = null;
      break label539;
      label759:
      i2 = i20;
      break label561;
      int i9;
      label798:
      int i38;
      long l4;
      label812:
      label845:
      int i25;
      if (i35 != 0)
      {
        i9 = 2;
        f2 = 2.8E-45F;
        if (i2 == i9)
        {
          i9 = 1;
          f2 = Float.MIN_VALUE;
          i15 = i9;
          f1 = f2;
          i38 = 0;
          f5 = 0.0F;
          l4 = l1;
          i22 = i20;
          if ((i33 <= 0) || (i22 <= 0)) {
            break label1321;
          }
          i39 = -1 >>> 1;
          l1 = 0L;
          i20 = 0;
          i9 = 0;
          f2 = 0.0F;
          localObject1 = null;
          i45 = 0;
          i24 = i45;
          if (i45 >= i36) {
            break label1004;
          }
          localObject1 = (ActionMenuView.c)getChildAt(i45).getLayoutParams();
          boolean bool12 = d;
          if (!bool12) {
            break label2148;
          }
          i25 = b;
          if (i25 >= i39) {
            break label955;
          }
          i20 = b;
          l1 = 1 << i45;
          i9 = 1;
          f2 = Float.MIN_VALUE;
        }
      }
      label955:
      label1004:
      label1048:
      int i40;
      for (;;)
      {
        int i46;
        i45 += 1;
        i39 = i20;
        i20 = i9;
        break label845;
        i9 = 0;
        f2 = 0.0F;
        localObject1 = null;
        i15 = 0;
        localView2 = null;
        f1 = 0.0F;
        break label798;
        i9 = b;
        if (i9 == i39)
        {
          f2 = Float.MIN_VALUE;
          long l5 = 1 << i46;
          long l6 = l5;
          l1 |= l5;
          i9 = i20 + 1;
          i20 = i39;
          continue;
          l4 |= l1;
          i25 = i22;
          long l7;
          View localView3;
          int i43;
          if (i20 <= i22)
          {
            i46 = i39 + 1;
            i9 = 0;
            f2 = 0.0F;
            localObject1 = null;
            i39 = 0;
            i20 = i22;
            l7 = l4;
            i25 = i36;
            if (i39 < i36)
            {
              localView3 = getChildAt(i39);
              localObject1 = (ActionMenuView.c)localView3.getLayoutParams();
              i42 = 1 << i39;
              i25 = i42;
              l5 = i42;
              l6 = l5;
              l6 = l5 & l1;
              long l8 = 0L;
              i43 = l6 < l8;
              if (i43 == 0)
              {
                i9 = b;
                i25 = i46;
                if (i9 != i46) {
                  break label2141;
                }
                f2 = Float.MIN_VALUE;
                l5 = 1 << i39;
                l4 = l5;
                l7 |= l5;
                i9 = i20;
              }
            }
          }
          for (;;)
          {
            i39 += 1;
            i20 = i9;
            break label1048;
            if (i15 != 0)
            {
              int i26 = e;
              i43 = i26;
              if (i26 != 0)
              {
                i43 = 1;
                i26 = i43;
                if (i20 == i43)
                {
                  i27 = l;
                  i43 = i27;
                  int i44 = i27 + i30;
                  i27 = l;
                  localView3.setPadding(i44, 0, i27, 0);
                }
              }
            }
            int i27 = b;
            i41 = i27;
            i41 = i27 + 1;
            i27 = i41;
            b = i41;
            i41 = 1;
            i27 = i41;
            f = i41;
            i9 = i20 + -1;
            continue;
            i9 = 1;
            f2 = Float.MIN_VALUE;
            l4 = l7;
            i38 = i9;
            f5 = f2;
            i22 = i20;
            break label812;
            label1321:
            l1 = l4;
            long l9;
            int i16;
            int i12;
            if (i35 == 0)
            {
              i9 = 1;
              f2 = Float.MIN_VALUE;
              if (i2 == i9)
              {
                i9 = 1;
                f2 = Float.MIN_VALUE;
                if (i22 <= 0) {
                  break label1900;
                }
                l2 = 0L;
                boolean bool8 = l1 < l2;
                if (!bool8) {
                  break label1900;
                }
                i2 += -1;
                i27 = i22;
                if ((i22 >= i2) && (i9 == 0))
                {
                  i2 = 1;
                  f3 = Float.MIN_VALUE;
                  if (i32 <= i2) {
                    break label1900;
                  }
                }
                i2 = Long.bitCount(l1);
                f3 = i2;
                if (i9 != 0) {
                  break label2134;
                }
                l2 = 1L & l1;
                l9 = 0L;
                boolean bool5 = l2 < l9;
                if (bool5)
                {
                  f2 = 0.0F;
                  localObject1 = (ActionMenuView.c)getChildAt(0).getLayoutParams();
                  bool5 = e;
                  if (!bool5)
                  {
                    int i10 = 1056964608;
                    f2 = 0.5F;
                    f3 -= f2;
                  }
                }
                f2 = Float.MIN_VALUE;
                i16 = i36 + -1;
                l2 = 1 << i16 & l1;
                l9 = 0L;
                boolean bool6 = l2 < l9;
                if (!bool6) {
                  break label2134;
                }
                int i11 = i36 + -1;
                localObject1 = (ActionMenuView.c)getChildAt(i11).getLayoutParams();
                boolean bool7 = e;
                if (bool7) {
                  break label2134;
                }
                i12 = 1056964608;
              }
            }
            label1600:
            label1620:
            label1796:
            label1889:
            label1900:
            label1908:
            label2056:
            label2134:
            for (f2 = f3 - 0.5F;; f2 = f3)
            {
              f3 = 0.0F;
              localObject2 = null;
              int i3 = f2 < 0.0F;
              int i13;
              boolean bool13;
              if (i3 > 0)
              {
                f3 = i22 * i30;
                f2 = f3 / f2;
                i12 = (int)f2;
                i3 = i12;
                i12 = 0;
                f2 = 0.0F;
                localObject1 = null;
                i20 = 0;
                i16 = i38;
                f1 = f5;
                i27 = i36;
                if (i20 >= i36) {
                  break label1908;
                }
                f2 = Float.MIN_VALUE;
                l9 = 1 << i20 & l1;
                long l10 = 0L;
                i13 = l9 < l10;
                if (i13 == 0) {
                  break label1889;
                }
                localView1 = getChildAt(i20);
                localObject1 = (ActionMenuView.c)localView1.getLayoutParams();
                bool13 = localView1 instanceof ActionMenuItemView;
                if (!bool13) {
                  break label1796;
                }
                c = i3;
                i16 = 1;
                f1 = Float.MIN_VALUE;
                f = i16;
                if (i20 == 0)
                {
                  boolean bool9 = e;
                  if (!bool9)
                  {
                    i17 = -i3 / 2;
                    leftMargin = i17;
                  }
                }
                i13 = 1;
                f2 = Float.MIN_VALUE;
              }
              for (;;)
              {
                i20 += 1;
                i17 = i13;
                f1 = f2;
                break label1620;
                i13 = 0;
                f2 = 0.0F;
                localObject1 = null;
                break;
                i13 = 0;
                f2 = 0.0F;
                localObject1 = null;
                i3 = 0;
                localObject2 = null;
                f3 = 0.0F;
                break label1600;
                bool13 = a;
                if (bool13)
                {
                  c = i3;
                  f1 = Float.MIN_VALUE;
                  f = true;
                  i17 = -i3 / 2;
                  rightMargin = i17;
                  i13 = 1;
                  f2 = Float.MIN_VALUE;
                }
                else
                {
                  if (i20 != 0)
                  {
                    i34 = i3 / 2;
                    leftMargin = i34;
                  }
                  i34 = i36 + -1;
                  if (i20 != i34)
                  {
                    i34 = i3 / 2;
                    rightMargin = i34;
                  }
                  i13 = i17;
                  f2 = f1;
                }
              }
              i17 = i38;
              f1 = f5;
              if (i17 != 0)
              {
                i13 = 0;
                f2 = 0.0F;
                localObject1 = null;
                i3 = 0;
                localObject2 = null;
                f3 = 0.0F;
                for (;;)
                {
                  i27 = i36;
                  if (i3 >= i36) {
                    break;
                  }
                  localView2 = getChildAt(i3);
                  localObject1 = (ActionMenuView.c)localView2.getLayoutParams();
                  boolean bool10 = f;
                  if (bool10)
                  {
                    i21 = b * i30;
                    i14 = c + i21;
                    i21 = 1073741824;
                    i14 = View.MeasureSpec.makeMeasureSpec(i14, i21);
                    i27 = i28;
                    localView2.measure(i14, i28);
                  }
                  i14 = i3 + 1;
                  i3 = i14;
                }
              }
              i14 = 1073741824;
              f2 = 2.0F;
              i27 = i18;
              if (i18 != i14) {}
              for (;;)
              {
                setMeasuredDimension(i29, i31);
                break;
                i14 = 0;
                f2 = 0.0F;
                localObject1 = null;
                i4 = 0;
                localObject2 = null;
                f3 = 0.0F;
                while (i4 < i17)
                {
                  localObject1 = (ActionMenuView.c)getChildAt(i4).getLayoutParams();
                  i21 = 0;
                  rightMargin = 0;
                  leftMargin = 0;
                  i14 = i4 + 1;
                  i4 = i14;
                }
                super.onMeasure(paramInt1, paramInt2);
                break;
                i31 = i19;
              }
            }
            label2141:
            i14 = i21;
          }
        }
        else
        {
          label2148:
          i14 = i21;
          i21 = i40;
        }
      }
      label2159:
      int i17 = i40;
      int i21 = i32;
      i47 = i34;
      i48 = i35;
      i35 = i14;
      f4 = f2;
      int i34 = i4;
      l3 = l1;
      continue;
      label2193:
      int i14 = i35;
      f2 = f4;
      break label626;
      label2204:
      int i4 = i34;
      break label607;
      label2210:
      i17 = i4;
      l3 = l1;
      i47 = i31;
      i48 = i21;
      i21 = i32;
    }
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    c.l = paramBoolean;
  }
  
  public void setOnMenuItemClickListener(ActionMenuView.e parame)
  {
    e = parame;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    Object localObject = c;
    d.d locald = i;
    if (locald != null)
    {
      localObject = i;
      ((d.d)localObject).setImageDrawable(paramDrawable);
    }
    for (;;)
    {
      return;
      boolean bool = true;
      k = bool;
      j = paramDrawable;
    }
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    int m = g;
    Object localObject;
    if (m != paramInt)
    {
      g = paramInt;
      if (paramInt != 0) {
        break label30;
      }
      localObject = getContext();
    }
    for (f = ((Context)localObject);; f = ((Context)localObject))
    {
      return;
      label30:
      localObject = new android/view/ContextThemeWrapper;
      Context localContext = getContext();
      ((ContextThemeWrapper)localObject).<init>(localContext, paramInt);
    }
  }
  
  public void setPresenter(d paramd)
  {
    c = paramd;
    c.a(this);
  }
}


/* Location:              android/support/v7/widget/ActionMenuView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */