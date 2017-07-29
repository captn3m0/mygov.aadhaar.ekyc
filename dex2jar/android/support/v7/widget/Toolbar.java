package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.a;
import android.support.v4.h.f;
import android.support.v4.h.l;
import android.support.v4.h.m;
import android.support.v4.h.n;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar
  extends ViewGroup
{
  private int A;
  private int B;
  private int C = 8388627;
  private CharSequence D;
  private CharSequence E;
  private int F;
  private int G;
  private boolean H;
  private boolean I;
  private final ArrayList<View> J = new ArrayList();
  private final int[] K = new int[2];
  private final ActionMenuView.e L = new ActionMenuView.e()
  {
    public final boolean a(MenuItem paramAnonymousMenuItem)
    {
      if (o != null) {
        return o.a(paramAnonymousMenuItem);
      }
      return false;
    }
  };
  private bg M;
  private boolean N;
  private final Runnable O = new Runnable()
  {
    public final void run()
    {
      b();
    }
  };
  ActionMenuView a;
  TextView b;
  TextView c;
  Drawable d;
  CharSequence e;
  ImageButton f;
  View g;
  Context h;
  int i;
  int j;
  int k;
  int l;
  aw m;
  final ArrayList<View> n = new ArrayList();
  c o;
  d p;
  a q;
  o.a r;
  h.a s;
  private ImageButton t;
  private ImageView u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public Toolbar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, android.support.v7.a.a.a.toolbarStyle);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = bf.a(getContext(), paramAttributeSet, a.j.Toolbar, paramInt, 0);
    j = paramContext.g(a.j.Toolbar_titleTextAppearance, 0);
    k = paramContext.g(a.j.Toolbar_subtitleTextAppearance, 0);
    C = paramContext.c(a.j.Toolbar_android_gravity, C);
    l = paramContext.c(a.j.Toolbar_buttonGravity, 48);
    int i1 = paramContext.d(a.j.Toolbar_titleMargin, 0);
    paramInt = i1;
    if (paramContext.e(a.j.Toolbar_titleMargins)) {
      paramInt = paramContext.d(a.j.Toolbar_titleMargins, i1);
    }
    z = paramInt;
    y = paramInt;
    x = paramInt;
    w = paramInt;
    paramInt = paramContext.d(a.j.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0) {
      w = paramInt;
    }
    paramInt = paramContext.d(a.j.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0) {
      x = paramInt;
    }
    paramInt = paramContext.d(a.j.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0) {
      y = paramInt;
    }
    paramInt = paramContext.d(a.j.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0) {
      z = paramInt;
    }
    v = paramContext.e(a.j.Toolbar_maxButtonHeight, -1);
    paramInt = paramContext.d(a.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
    i1 = paramContext.d(a.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
    int i2 = paramContext.e(a.j.Toolbar_contentInsetLeft, 0);
    int i3 = paramContext.e(a.j.Toolbar_contentInsetRight, 0);
    f();
    paramAttributeSet = m;
    h = false;
    if (i2 != Integer.MIN_VALUE)
    {
      e = i2;
      a = i2;
    }
    if (i3 != Integer.MIN_VALUE)
    {
      f = i3;
      b = i3;
    }
    if ((paramInt != Integer.MIN_VALUE) || (i1 != Integer.MIN_VALUE)) {
      m.a(paramInt, i1);
    }
    A = paramContext.d(a.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
    B = paramContext.d(a.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
    d = paramContext.a(a.j.Toolbar_collapseIcon);
    e = paramContext.c(a.j.Toolbar_collapseContentDescription);
    paramAttributeSet = paramContext.c(a.j.Toolbar_title);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setTitle(paramAttributeSet);
    }
    paramAttributeSet = paramContext.c(a.j.Toolbar_subtitle);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setSubtitle(paramAttributeSet);
    }
    h = getContext();
    setPopupTheme(paramContext.g(a.j.Toolbar_popupTheme, 0));
    paramAttributeSet = paramContext.a(a.j.Toolbar_navigationIcon);
    if (paramAttributeSet != null) {
      setNavigationIcon(paramAttributeSet);
    }
    paramAttributeSet = paramContext.c(a.j.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setNavigationContentDescription(paramAttributeSet);
    }
    paramAttributeSet = paramContext.a(a.j.Toolbar_logo);
    if (paramAttributeSet != null) {
      setLogo(paramAttributeSet);
    }
    paramAttributeSet = paramContext.c(a.j.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setLogoDescription(paramAttributeSet);
    }
    if (paramContext.e(a.j.Toolbar_titleTextColor)) {
      setTitleTextColor(paramContext.b(a.j.Toolbar_titleTextColor, -1));
    }
    if (paramContext.e(a.j.Toolbar_subtitleTextColor)) {
      setSubtitleTextColor(paramContext.b(a.j.Toolbar_subtitleTextColor, -1));
    }
    a.recycle();
  }
  
  private int a(int paramInt)
  {
    int i2 = w.g(this);
    int i1 = f.a(paramInt, i2) & 0x7;
    paramInt = i1;
    switch (i1)
    {
    case 2: 
    case 4: 
    default: 
      if (i2 == 1) {
        paramInt = 5;
      }
      break;
    case 1: 
    case 3: 
    case 5: 
      return paramInt;
    }
    return 3;
  }
  
  private int a(View paramView, int paramInt)
  {
    b localb = (b)paramView.getLayoutParams();
    int i3 = paramView.getMeasuredHeight();
    int i2;
    int i1;
    int i4;
    if (paramInt > 0)
    {
      paramInt = (i3 - paramInt) / 2;
      i2 = a & 0x70;
      i1 = i2;
      switch (i2)
      {
      default: 
        i1 = C & 0x70;
      }
      switch (i1)
      {
      default: 
        i1 = getPaddingTop();
        i2 = getPaddingBottom();
        i4 = getHeight();
        paramInt = (i4 - i1 - i2 - i3) / 2;
        if (paramInt < topMargin) {
          paramInt = topMargin;
        }
        break;
      }
    }
    for (;;)
    {
      return paramInt + i1;
      paramInt = 0;
      break;
      return getPaddingTop() - paramInt;
      return getHeight() - getPaddingBottom() - i3 - bottomMargin - paramInt;
      i2 = i4 - i2 - i3 - paramInt - i1;
      if (i2 < bottomMargin) {
        paramInt = Math.max(0, paramInt - (bottomMargin - i2));
      }
    }
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = leftMargin - paramArrayOfInt[0];
    int i2 = rightMargin - paramArrayOfInt[1];
    int i3 = Math.max(0, i1) + Math.max(0, i2);
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramArrayOfInt[1] = Math.max(0, -i2);
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + i3 + paramInt2, width), getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + topMargin + bottomMargin + paramInt4, height));
    return paramView.getMeasuredWidth() + i3;
  }
  
  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    b localb = (b)paramView.getLayoutParams();
    int i1 = leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i1) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramInt2 = a(paramView, paramInt2);
    i1 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i1, paramView.getMeasuredHeight() + paramInt2);
    return rightMargin + i1 + paramInt1;
  }
  
  private static b a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof b)) {
      return new b((b)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof android.support.v7.app.a.a)) {
      return new b((android.support.v7.app.a.a)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new b((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new b(paramLayoutParams);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + leftMargin + rightMargin + paramInt2, width);
    paramInt2 = getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + topMargin + bottomMargin + 0, height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt4 >= 0)
      {
        paramInt1 = paramInt4;
        if (paramInt3 != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt4);
        }
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i1, paramInt1);
  }
  
  private void a(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = new b();
    }
    for (;;)
    {
      b = 1;
      if ((!paramBoolean) || (g == null)) {
        break;
      }
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      n.add(paramView);
      return;
      if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
        localObject = a((ViewGroup.LayoutParams)localObject);
      } else {
        localObject = (b)localObject;
      }
    }
    addView(paramView, (ViewGroup.LayoutParams)localObject);
  }
  
  private void a(List<View> paramList, int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    if (w.g(this) == 1) {}
    int i4;
    int i3;
    View localView;
    b localb;
    for (;;)
    {
      i4 = getChildCount();
      i3 = f.a(paramInt, w.g(this));
      paramList.clear();
      paramInt = i2;
      if (i1 == 0) {
        break;
      }
      paramInt = i4 - 1;
      while (paramInt >= 0)
      {
        localView = getChildAt(paramInt);
        localb = (b)localView.getLayoutParams();
        if ((b == 0) && (a(localView)) && (a(a) == i3)) {
          paramList.add(localView);
        }
        paramInt -= 1;
      }
      i1 = 0;
    }
    while (paramInt < i4)
    {
      localView = getChildAt(paramInt);
      localb = (b)localView.getLayoutParams();
      if ((b == 0) && (a(localView)) && (a(a) == i3)) {
        paramList.add(localView);
      }
      paramInt += 1;
    }
  }
  
  private boolean a(View paramView)
  {
    return (paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8);
  }
  
  private static int b(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = l.a(paramView);
    return l.b(paramView) + i1;
  }
  
  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    b localb = (b)paramView.getLayoutParams();
    int i1 = rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i1);
    paramArrayOfInt[1] = Math.max(0, -i1);
    paramInt2 = a(paramView, paramInt2);
    i1 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i1, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (leftMargin + i1);
  }
  
  private static int c(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = topMargin;
    return bottomMargin + i1;
  }
  
  private boolean d(View paramView)
  {
    return (paramView.getParent() == this) || (n.contains(paramView));
  }
  
  protected static b e()
  {
    return new b();
  }
  
  private void g()
  {
    if (u == null) {
      u = new q(getContext());
    }
  }
  
  private MenuInflater getMenuInflater()
  {
    return new g(getContext());
  }
  
  private void h()
  {
    d();
    if (a.a == null)
    {
      h localh = (h)a.getMenu();
      if (q == null) {
        q = new a();
      }
      a.setExpandedActionViewsExclusive(true);
      localh.a(q, h);
    }
  }
  
  private void i()
  {
    if (t == null)
    {
      t = new o(getContext(), null, android.support.v7.a.a.a.toolbarNavigationButtonStyle);
      b localb = new b();
      a = (0x800003 | l & 0x70);
      t.setLayoutParams(localb);
    }
  }
  
  public final boolean a()
  {
    if (a != null)
    {
      ActionMenuView localActionMenuView = a;
      if ((c != null) && (c.j())) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean b()
  {
    if (a != null)
    {
      ActionMenuView localActionMenuView = a;
      if ((c != null) && (c.f())) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final void c()
  {
    if (q == null) {}
    for (j localj = null;; localj = q.b)
    {
      if (localj != null) {
        localj.collapseActionView();
      }
      return;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof b));
  }
  
  final void d()
  {
    if (a == null)
    {
      a = new ActionMenuView(getContext());
      a.setPopupTheme(i);
      a.setOnMenuItemClickListener(L);
      a.a(r, s);
      b localb = new b();
      a = (0x800005 | l & 0x70);
      a.setLayoutParams(localb);
      a(a, false);
    }
  }
  
  final void f()
  {
    if (m == null) {
      m = new aw();
    }
  }
  
  public int getContentInsetEnd()
  {
    if (m != null)
    {
      aw localaw = m;
      if (g) {
        return a;
      }
      return b;
    }
    return 0;
  }
  
  public int getContentInsetEndWithActions()
  {
    if (B != Integer.MIN_VALUE) {
      return B;
    }
    return getContentInsetEnd();
  }
  
  public int getContentInsetLeft()
  {
    if (m != null) {
      return m.a;
    }
    return 0;
  }
  
  public int getContentInsetRight()
  {
    if (m != null) {
      return m.b;
    }
    return 0;
  }
  
  public int getContentInsetStart()
  {
    if (m != null)
    {
      aw localaw = m;
      if (g) {
        return b;
      }
      return a;
    }
    return 0;
  }
  
  public int getContentInsetStartWithNavigation()
  {
    if (A != Integer.MIN_VALUE) {
      return A;
    }
    return getContentInsetStart();
  }
  
  public int getCurrentContentInsetEnd()
  {
    int i1;
    if (a != null)
    {
      h localh = a.a;
      if ((localh != null) && (localh.hasVisibleItems())) {
        i1 = 1;
      }
    }
    for (;;)
    {
      if (i1 != 0)
      {
        return Math.max(getContentInsetEnd(), Math.max(B, 0));
        i1 = 0;
      }
      else
      {
        return getContentInsetEnd();
        i1 = 0;
      }
    }
  }
  
  public int getCurrentContentInsetLeft()
  {
    if (w.g(this) == 1) {
      return getCurrentContentInsetEnd();
    }
    return getCurrentContentInsetStart();
  }
  
  public int getCurrentContentInsetRight()
  {
    if (w.g(this) == 1) {
      return getCurrentContentInsetStart();
    }
    return getCurrentContentInsetEnd();
  }
  
  public int getCurrentContentInsetStart()
  {
    if (getNavigationIcon() != null) {
      return Math.max(getContentInsetStart(), Math.max(A, 0));
    }
    return getContentInsetStart();
  }
  
  public Drawable getLogo()
  {
    if (u != null) {
      return u.getDrawable();
    }
    return null;
  }
  
  public CharSequence getLogoDescription()
  {
    if (u != null) {
      return u.getContentDescription();
    }
    return null;
  }
  
  public Menu getMenu()
  {
    h();
    return a.getMenu();
  }
  
  public CharSequence getNavigationContentDescription()
  {
    if (t != null) {
      return t.getContentDescription();
    }
    return null;
  }
  
  public Drawable getNavigationIcon()
  {
    if (t != null) {
      return t.getDrawable();
    }
    return null;
  }
  
  public Drawable getOverflowIcon()
  {
    h();
    return a.getOverflowIcon();
  }
  
  public int getPopupTheme()
  {
    return i;
  }
  
  public CharSequence getSubtitle()
  {
    return E;
  }
  
  public CharSequence getTitle()
  {
    return D;
  }
  
  public int getTitleMarginBottom()
  {
    return z;
  }
  
  public int getTitleMarginEnd()
  {
    return x;
  }
  
  public int getTitleMarginStart()
  {
    return w;
  }
  
  public int getTitleMarginTop()
  {
    return y;
  }
  
  public ae getWrapper()
  {
    if (M == null) {
      M = new bg(this, true);
    }
    return M;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(O);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i1 = n.a(paramMotionEvent);
    if (i1 == 9) {
      I = false;
    }
    if (!I)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i1 == 9) && (!bool)) {
        I = true;
      }
    }
    if ((i1 == 10) || (i1 == 3)) {
      I = false;
    }
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i3;
    int i6;
    int i9;
    int i2;
    int i7;
    int i8;
    int i10;
    int[] arrayOfInt;
    int i1;
    if (w.g(this) == 1)
    {
      i3 = 1;
      i6 = getWidth();
      i9 = getHeight();
      i2 = getPaddingLeft();
      i7 = getPaddingRight();
      i8 = getPaddingTop();
      i10 = getPaddingBottom();
      paramInt1 = i6 - i7;
      arrayOfInt = K;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      paramInt3 = w.r(this);
      if (paramInt3 < 0) {
        break label892;
      }
      i1 = Math.min(paramInt3, paramInt4 - paramInt2);
      label91:
      if (!a(t)) {
        break label1731;
      }
      if (i3 == 0) {
        break label898;
      }
      paramInt1 = b(t, paramInt1, arrayOfInt, i1);
      paramInt2 = i2;
    }
    for (;;)
    {
      label124:
      paramInt3 = paramInt1;
      paramInt4 = paramInt2;
      if (a(f))
      {
        if (i3 != 0)
        {
          paramInt3 = b(f, paramInt1, arrayOfInt, i1);
          paramInt4 = paramInt2;
        }
      }
      else
      {
        label164:
        paramInt1 = paramInt3;
        paramInt2 = paramInt4;
        if (a(a))
        {
          if (i3 == 0) {
            break label937;
          }
          paramInt2 = a(a, paramInt4, arrayOfInt, i1);
          paramInt1 = paramInt3;
        }
        label204:
        paramInt3 = getCurrentContentInsetLeft();
        paramInt4 = getCurrentContentInsetRight();
        arrayOfInt[0] = Math.max(0, paramInt3 - paramInt2);
        arrayOfInt[1] = Math.max(0, paramInt4 - (i6 - i7 - paramInt1));
        paramInt3 = Math.max(paramInt2, paramInt3);
        paramInt4 = Math.min(paramInt1, i6 - i7 - paramInt4);
        paramInt2 = paramInt4;
        paramInt1 = paramInt3;
        if (a(g))
        {
          if (i3 == 0) {
            break label958;
          }
          paramInt2 = b(g, paramInt4, arrayOfInt, i1);
          paramInt1 = paramInt3;
        }
        label308:
        if (!a(u)) {
          break label1725;
        }
        if (i3 == 0) {
          break label979;
        }
        paramInt2 = b(u, paramInt2, arrayOfInt, i1);
        paramInt3 = paramInt1;
      }
      for (;;)
      {
        label341:
        paramBoolean = a(b);
        boolean bool = a(c);
        paramInt1 = 0;
        Object localObject1;
        if (paramBoolean)
        {
          localObject1 = (b)b.getLayoutParams();
          paramInt1 = topMargin;
          paramInt4 = b.getMeasuredHeight();
          paramInt1 = bottomMargin + (paramInt1 + paramInt4) + 0;
        }
        int i4;
        if (bool)
        {
          localObject1 = (b)c.getLayoutParams();
          paramInt4 = topMargin;
          i4 = c.getMeasuredHeight();
        }
        for (int i5 = bottomMargin + (paramInt4 + i4) + paramInt1;; i5 = paramInt1)
        {
          label479:
          Object localObject2;
          if (!paramBoolean)
          {
            paramInt4 = paramInt2;
            paramInt1 = paramInt3;
            if (!bool) {}
          }
          else
          {
            if (!paramBoolean) {
              break label997;
            }
            localObject1 = b;
            if (!bool) {
              break label1006;
            }
            localObject2 = c;
            label490:
            localObject1 = (b)((View)localObject1).getLayoutParams();
            localObject2 = (b)((View)localObject2).getLayoutParams();
            if (((!paramBoolean) || (b.getMeasuredWidth() <= 0)) && ((!bool) || (c.getMeasuredWidth() <= 0))) {
              break label1015;
            }
            i4 = 1;
            label542:
            switch (C & 0x70)
            {
            default: 
              paramInt1 = (i9 - i8 - i10 - i5) / 2;
              if (paramInt1 < topMargin + y) {
                paramInt1 = topMargin + y;
              }
              break;
            }
          }
          label615:
          label620:
          label636:
          label892:
          label898:
          label937:
          label958:
          label979:
          label997:
          label1006:
          label1015:
          label1135:
          label1693:
          label1710:
          label1716:
          for (;;)
          {
            paramInt1 = i8 + paramInt1;
            if (i3 != 0) {
              if (i4 != 0)
              {
                paramInt4 = w;
                paramInt4 -= arrayOfInt[1];
                paramInt2 -= Math.max(0, paramInt4);
                arrayOfInt[1] = Math.max(0, -paramInt4);
                if (!paramBoolean) {
                  break label1710;
                }
                localObject1 = (b)b.getLayoutParams();
                paramInt4 = paramInt2 - b.getMeasuredWidth();
                i3 = b.getMeasuredHeight() + paramInt1;
                b.layout(paramInt4, paramInt1, paramInt2, i3);
                i5 = x;
                paramInt1 = i3 + bottomMargin;
                paramInt4 -= i5;
              }
            }
            for (;;)
            {
              if (bool)
              {
                localObject1 = (b)c.getLayoutParams();
                paramInt1 = topMargin + paramInt1;
                i3 = c.getMeasuredWidth();
                i5 = c.getMeasuredHeight();
                c.layout(paramInt2 - i3, paramInt1, paramInt2, i5 + paramInt1);
                paramInt1 = x;
                i3 = bottomMargin;
              }
              for (paramInt1 = paramInt2 - paramInt1;; paramInt1 = paramInt2)
              {
                if (i4 != 0) {}
                for (paramInt1 = Math.min(paramInt4, paramInt1);; paramInt1 = paramInt2)
                {
                  paramInt4 = paramInt1;
                  paramInt1 = paramInt3;
                  a(J, 3);
                  paramInt3 = J.size();
                  paramInt2 = 0;
                  for (;;)
                  {
                    if (paramInt2 < paramInt3)
                    {
                      paramInt1 = a((View)J.get(paramInt2), paramInt1, arrayOfInt, i1);
                      paramInt2 += 1;
                      continue;
                      i3 = 0;
                      break;
                      i1 = 0;
                      break label91;
                      paramInt2 = a(t, i2, arrayOfInt, i1);
                      break label124;
                      paramInt4 = a(f, paramInt2, arrayOfInt, i1);
                      paramInt3 = paramInt1;
                      break label164;
                      paramInt1 = b(a, paramInt3, arrayOfInt, i1);
                      paramInt2 = paramInt4;
                      break label204;
                      paramInt1 = a(g, paramInt3, arrayOfInt, i1);
                      paramInt2 = paramInt4;
                      break label308;
                      paramInt3 = a(u, paramInt1, arrayOfInt, i1);
                      break label341;
                      localObject1 = c;
                      break label479;
                      localObject2 = b;
                      break label490;
                      i4 = 0;
                      break label542;
                      paramInt1 = getPaddingTop();
                      paramInt1 = topMargin + paramInt1 + y;
                      break label620;
                      paramInt4 = i9 - i10 - i5 - paramInt1 - i8;
                      if (paramInt4 >= bottomMargin + z) {
                        break label1716;
                      }
                      paramInt1 = Math.max(0, paramInt1 - (bottomMargin + z - paramInt4));
                      break label615;
                      paramInt1 = i9 - i10 - bottomMargin - z - i5;
                      break label620;
                      paramInt4 = 0;
                      break label636;
                      if (i4 != 0)
                      {
                        paramInt4 = w;
                        paramInt4 -= arrayOfInt[0];
                        paramInt3 += Math.max(0, paramInt4);
                        arrayOfInt[0] = Math.max(0, -paramInt4);
                        if (!paramBoolean) {
                          break label1693;
                        }
                        localObject1 = (b)b.getLayoutParams();
                        i3 = b.getMeasuredWidth() + paramInt3;
                        paramInt4 = b.getMeasuredHeight() + paramInt1;
                        b.layout(paramInt3, paramInt1, i3, paramInt4);
                        i5 = x;
                        paramInt1 = bottomMargin;
                        i3 += i5;
                        paramInt1 += paramInt4;
                      }
                    }
                  }
                  for (;;)
                  {
                    if (bool)
                    {
                      localObject1 = (b)c.getLayoutParams();
                      paramInt4 = paramInt1 + topMargin;
                      paramInt1 = c.getMeasuredWidth() + paramInt3;
                      i5 = c.getMeasuredHeight();
                      c.layout(paramInt3, paramInt4, paramInt1, i5 + paramInt4);
                      paramInt4 = x;
                      i5 = bottomMargin;
                    }
                    for (i5 = paramInt4 + paramInt1;; i5 = paramInt3)
                    {
                      paramInt4 = paramInt2;
                      paramInt1 = paramInt3;
                      if (i4 == 0) {
                        break;
                      }
                      paramInt1 = Math.max(i3, i5);
                      paramInt4 = paramInt2;
                      break;
                      paramInt4 = 0;
                      break label1135;
                      a(J, 5);
                      i3 = J.size();
                      paramInt3 = 0;
                      paramInt2 = paramInt4;
                      while (paramInt3 < i3)
                      {
                        paramInt2 = b((View)J.get(paramInt3), paramInt2, arrayOfInt, i1);
                        paramInt3 += 1;
                      }
                      a(J, 1);
                      localObject1 = J;
                      i4 = arrayOfInt[0];
                      i3 = arrayOfInt[1];
                      i5 = ((List)localObject1).size();
                      paramInt4 = 0;
                      paramInt3 = 0;
                      while (paramInt4 < i5)
                      {
                        localObject2 = (View)((List)localObject1).get(paramInt4);
                        b localb = (b)((View)localObject2).getLayoutParams();
                        i4 = leftMargin - i4;
                        i3 = rightMargin - i3;
                        i8 = Math.max(0, i4);
                        i9 = Math.max(0, i3);
                        i4 = Math.max(0, -i4);
                        i3 = Math.max(0, -i3);
                        i10 = ((View)localObject2).getMeasuredWidth();
                        paramInt4 += 1;
                        paramInt3 += i10 + i8 + i9;
                      }
                      paramInt4 = (i6 - i2 - i7) / 2 + i2 - paramInt3 / 2;
                      paramInt3 = paramInt4 + paramInt3;
                      if (paramInt4 < paramInt1) {}
                      for (;;)
                      {
                        paramInt4 = J.size();
                        paramInt3 = 0;
                        paramInt2 = paramInt1;
                        paramInt1 = paramInt3;
                        while (paramInt1 < paramInt4)
                        {
                          paramInt2 = a((View)J.get(paramInt1), paramInt2, arrayOfInt, i1);
                          paramInt1 += 1;
                        }
                        paramInt1 = paramInt4;
                        if (paramInt3 > paramInt2) {
                          paramInt1 = paramInt4 - (paramInt3 - paramInt2);
                        }
                      }
                      J.clear();
                      return;
                    }
                    i3 = paramInt3;
                  }
                }
              }
              paramInt4 = paramInt2;
            }
          }
        }
        label1725:
        paramInt3 = paramInt1;
      }
      label1731:
      paramInt2 = i2;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = K;
    int i5;
    int i6;
    int i1;
    int i4;
    int i3;
    if (bk.a(this))
    {
      i5 = 0;
      i6 = 1;
      i1 = 0;
      if (!a(t)) {
        break label1008;
      }
      a(t, paramInt1, 0, paramInt2, v);
      i1 = t.getMeasuredWidth() + b(t);
      i4 = Math.max(0, t.getMeasuredHeight() + c(t));
      i3 = bk.a(0, w.j(t));
    }
    for (;;)
    {
      int i7 = i1;
      i1 = i3;
      int i2 = i4;
      if (a(f))
      {
        a(f, paramInt1, 0, paramInt2, v);
        i7 = f.getMeasuredWidth() + b(f);
        i2 = Math.max(i4, f.getMeasuredHeight() + c(f));
        i1 = bk.a(i3, w.j(f));
      }
      i3 = getCurrentContentInsetStart();
      int i8 = Math.max(i3, i7) + 0;
      localObject[i6] = Math.max(0, i3 - i7);
      i6 = 0;
      i3 = i1;
      i4 = i2;
      if (a(a))
      {
        a(a, paramInt1, i8, paramInt2, v);
        i6 = a.getMeasuredWidth() + b(a);
        i4 = Math.max(i2, a.getMeasuredHeight() + c(a));
        i3 = bk.a(i1, w.j(a));
      }
      i1 = getCurrentContentInsetEnd();
      i7 = i8 + Math.max(i1, i6);
      localObject[i5] = Math.max(0, i1 - i6);
      i5 = i7;
      i1 = i3;
      i2 = i4;
      if (a(g))
      {
        i5 = i7 + a(g, paramInt1, i7, paramInt2, 0, (int[])localObject);
        i2 = Math.max(i4, g.getMeasuredHeight() + c(g));
        i1 = bk.a(i3, w.j(g));
      }
      i3 = i5;
      i6 = i1;
      i4 = i2;
      if (a(u))
      {
        i3 = i5 + a(u, paramInt1, i5, paramInt2, 0, (int[])localObject);
        i4 = Math.max(i2, u.getMeasuredHeight() + c(u));
        i6 = bk.a(i1, w.j(u));
      }
      i7 = getChildCount();
      i5 = 0;
      i1 = i6;
      i2 = i4;
      i4 = i5;
      i6 = i3;
      label512:
      if (i4 < i7)
      {
        View localView = getChildAt(i4);
        if ((getLayoutParamsb != 0) || (!a(localView))) {
          break label995;
        }
        i6 += a(localView, paramInt1, i6, paramInt2, 0, (int[])localObject);
        i3 = Math.max(i2, localView.getMeasuredHeight() + c(localView));
        i2 = bk.a(i1, w.j(localView));
      }
      for (i1 = i3;; i1 = i3)
      {
        i4 += 1;
        i3 = i1;
        i1 = i2;
        i2 = i3;
        break label512;
        i5 = 1;
        i6 = 0;
        break;
        i5 = 0;
        i4 = 0;
        int i9 = y + z;
        int i10 = w + x;
        i3 = i1;
        if (a(b))
        {
          a(b, paramInt1, i6 + i10, paramInt2, i9, (int[])localObject);
          i3 = b.getMeasuredWidth();
          i5 = b(b) + i3;
          i4 = b.getMeasuredHeight() + c(b);
          i3 = bk.a(i1, w.j(b));
        }
        i8 = i4;
        i7 = i5;
        i1 = i3;
        if (a(c))
        {
          i7 = Math.max(i5, a(c, paramInt1, i6 + i10, paramInt2, i9 + i4, (int[])localObject));
          i8 = i4 + (c.getMeasuredHeight() + c(c));
          i1 = bk.a(i3, w.j(c));
        }
        i3 = Math.max(i2, i8);
        i2 = getPaddingLeft();
        i8 = getPaddingRight();
        i4 = getPaddingTop();
        i5 = getPaddingBottom();
        i2 = w.a(Math.max(i7 + i6 + (i2 + i8), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i1);
        paramInt2 = w.a(Math.max(i3 + (i4 + i5), getSuggestedMinimumHeight()), paramInt2, i1 << 16);
        if (!N) {
          paramInt1 = 0;
        }
        for (;;)
        {
          if (paramInt1 != 0) {
            paramInt2 = 0;
          }
          setMeasuredDimension(i2, paramInt2);
          return;
          i1 = getChildCount();
          paramInt1 = 0;
          for (;;)
          {
            if (paramInt1 >= i1) {
              break label990;
            }
            localObject = getChildAt(paramInt1);
            if ((a((View)localObject)) && (((View)localObject).getMeasuredWidth() > 0) && (((View)localObject).getMeasuredHeight() > 0))
            {
              paramInt1 = 0;
              break;
            }
            paramInt1 += 1;
          }
          label990:
          paramInt1 = 1;
        }
        label995:
        i3 = i2;
        i2 = i1;
      }
      label1008:
      i3 = 0;
      i4 = 0;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof d))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    d locald = (d)paramParcelable;
    super.onRestoreInstanceState(e);
    if (a != null) {}
    for (paramParcelable = a.a;; paramParcelable = null)
    {
      if ((a != 0) && (q != null) && (paramParcelable != null))
      {
        paramParcelable = paramParcelable.findItem(a);
        if (paramParcelable != null) {
          m.b(paramParcelable);
        }
      }
      if (!b) {
        break;
      }
      removeCallbacks(O);
      post(O);
      return;
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 17) {
      super.onRtlPropertiesChanged(paramInt);
    }
    f();
    aw localaw = m;
    if (paramInt == 1) {
      if (bool != g)
      {
        g = bool;
        if (!h) {
          break label168;
        }
        if (!bool) {
          break label113;
        }
        if (d == Integer.MIN_VALUE) {
          break label97;
        }
        paramInt = d;
        label67:
        a = paramInt;
        if (c == Integer.MIN_VALUE) {
          break label105;
        }
      }
    }
    label97:
    label105:
    for (paramInt = c;; paramInt = f)
    {
      b = paramInt;
      return;
      bool = false;
      break;
      paramInt = e;
      break label67;
    }
    label113:
    if (c != Integer.MIN_VALUE)
    {
      paramInt = c;
      a = paramInt;
      if (d == Integer.MIN_VALUE) {
        break label160;
      }
    }
    label160:
    for (paramInt = d;; paramInt = f)
    {
      b = paramInt;
      return;
      paramInt = e;
      break;
    }
    label168:
    a = e;
    b = f;
  }
  
  protected Parcelable onSaveInstanceState()
  {
    d locald = new d(super.onSaveInstanceState());
    if ((q != null) && (q.b != null)) {
      a = q.b.getItemId();
    }
    b = a();
    return locald;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = n.a(paramMotionEvent);
    if (i1 == 0) {
      H = false;
    }
    if (!H)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i1 == 0) && (!bool)) {
        H = true;
      }
    }
    if ((i1 == 1) || (i1 == 3)) {
      H = false;
    }
    return true;
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    N = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 0) {
      i1 = Integer.MIN_VALUE;
    }
    if (i1 != B)
    {
      B = i1;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetStartWithNavigation(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 0) {
      i1 = Integer.MIN_VALUE;
    }
    if (i1 != A)
    {
      A = i1;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setLogo(int paramInt)
  {
    setLogo(android.support.v7.b.a.b.b(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      g();
      if (!d(u)) {
        a(u, true);
      }
    }
    for (;;)
    {
      if (u != null) {
        u.setImageDrawable(paramDrawable);
      }
      return;
      if ((u != null) && (d(u)))
      {
        removeView(u);
        n.remove(u);
      }
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      g();
    }
    if (u != null) {
      u.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = getContext().getText(paramInt);; localCharSequence = null)
    {
      setNavigationContentDescription(localCharSequence);
      return;
    }
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      i();
    }
    if (t != null) {
      t.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(android.support.v7.b.a.b.b(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      i();
      if (!d(t)) {
        a(t, true);
      }
    }
    for (;;)
    {
      if (t != null) {
        t.setImageDrawable(paramDrawable);
      }
      return;
      if ((t != null) && (d(t)))
      {
        removeView(t);
        n.remove(t);
      }
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    i();
    t.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(c paramc)
  {
    o = paramc;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    h();
    a.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (i != paramInt)
    {
      i = paramInt;
      if (paramInt == 0) {
        h = getContext();
      }
    }
    else
    {
      return;
    }
    h = new ContextThemeWrapper(getContext(), paramInt);
  }
  
  public void setSubtitle(int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (c == null)
      {
        Context localContext = getContext();
        c = new ab(localContext);
        c.setSingleLine();
        c.setEllipsize(TextUtils.TruncateAt.END);
        if (k != 0) {
          c.setTextAppearance(localContext, k);
        }
        if (G != 0) {
          c.setTextColor(G);
        }
      }
      if (!d(c)) {
        a(c, true);
      }
    }
    for (;;)
    {
      if (c != null) {
        c.setText(paramCharSequence);
      }
      E = paramCharSequence;
      return;
      if ((c != null) && (d(c)))
      {
        removeView(c);
        n.remove(c);
      }
    }
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    G = paramInt;
    if (c != null) {
      c.setTextColor(paramInt);
    }
  }
  
  public void setTitle(int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (b == null)
      {
        Context localContext = getContext();
        b = new ab(localContext);
        b.setSingleLine();
        b.setEllipsize(TextUtils.TruncateAt.END);
        if (j != 0) {
          b.setTextAppearance(localContext, j);
        }
        if (F != 0) {
          b.setTextColor(F);
        }
      }
      if (!d(b)) {
        a(b, true);
      }
    }
    for (;;)
    {
      if (b != null) {
        b.setText(paramCharSequence);
      }
      D = paramCharSequence;
      return;
      if ((b != null) && (d(b)))
      {
        removeView(b);
        n.remove(b);
      }
    }
  }
  
  public void setTitleMarginBottom(int paramInt)
  {
    z = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt)
  {
    x = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt)
  {
    w = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt)
  {
    y = paramInt;
    requestLayout();
  }
  
  public void setTitleTextColor(int paramInt)
  {
    F = paramInt;
    if (b != null) {
      b.setTextColor(paramInt);
    }
  }
  
  private final class a
    implements android.support.v7.view.menu.o
  {
    h a;
    j b;
    
    a() {}
    
    public final void a(Context paramContext, h paramh)
    {
      if ((a != null) && (b != null)) {
        a.b(b);
      }
      a = paramh;
    }
    
    public final void a(Parcelable paramParcelable) {}
    
    public final void a(h paramh, boolean paramBoolean) {}
    
    public final void a(o.a parama) {}
    
    public final void a(boolean paramBoolean)
    {
      int k = 0;
      int j;
      int m;
      int i;
      if (b != null)
      {
        j = k;
        if (a != null)
        {
          m = a.size();
          i = 0;
        }
      }
      for (;;)
      {
        j = k;
        if (i < m)
        {
          if (a.getItem(i) == b) {
            j = 1;
          }
        }
        else
        {
          if (j == 0) {
            b(b);
          }
          return;
        }
        i += 1;
      }
    }
    
    public final boolean a()
    {
      return false;
    }
    
    public final boolean a(j paramj)
    {
      Object localObject1 = Toolbar.this;
      Object localObject2;
      if (f == null)
      {
        f = new o(((Toolbar)localObject1).getContext(), null, android.support.v7.a.a.a.toolbarNavigationButtonStyle);
        f.setImageDrawable(d);
        f.setContentDescription(e);
        localObject2 = new Toolbar.b();
        a = (l & 0x70 | 0x800003);
        b = 2;
        f.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        f.setOnClickListener(new Toolbar.3((Toolbar)localObject1));
      }
      if (f.getParent() != Toolbar.this) {
        addView(f);
      }
      g = paramj.getActionView();
      b = paramj;
      if (g.getParent() != Toolbar.this)
      {
        localObject1 = Toolbar.e();
        a = (l & 0x70 | 0x800003);
        b = 2;
        g.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        addView(g);
      }
      localObject1 = Toolbar.this;
      int i = ((Toolbar)localObject1).getChildCount() - 1;
      while (i >= 0)
      {
        localObject2 = ((Toolbar)localObject1).getChildAt(i);
        if ((getLayoutParamsb != 2) && (localObject2 != a))
        {
          ((Toolbar)localObject1).removeViewAt(i);
          n.add(localObject2);
        }
        i -= 1;
      }
      requestLayout();
      paramj.d(true);
      if ((g instanceof android.support.v7.view.c)) {
        ((android.support.v7.view.c)g).a();
      }
      return true;
    }
    
    public final boolean a(u paramu)
    {
      return false;
    }
    
    public final int b()
    {
      return 0;
    }
    
    public final boolean b(j paramj)
    {
      if ((g instanceof android.support.v7.view.c)) {
        ((android.support.v7.view.c)g).b();
      }
      removeView(g);
      removeView(f);
      g = null;
      Toolbar localToolbar = Toolbar.this;
      int i = n.size() - 1;
      while (i >= 0)
      {
        localToolbar.addView((View)n.get(i));
        i -= 1;
      }
      n.clear();
      b = null;
      requestLayout();
      paramj.d(false);
      return true;
    }
    
    public final Parcelable c()
    {
      return null;
    }
  }
  
  public static final class b
    extends android.support.v7.app.a.a
  {
    int b = 0;
    
    public b()
    {
      a = 8388627;
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public b(android.support.v7.app.a.a parama)
    {
      super();
    }
    
    public b(b paramb)
    {
      super();
      b = b;
    }
    
    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
      leftMargin = leftMargin;
      topMargin = topMargin;
      rightMargin = rightMargin;
      bottomMargin = bottomMargin;
    }
  }
  
  public static abstract interface c
  {
    public abstract boolean a(MenuItem paramMenuItem);
  }
  
  public static final class d
    extends a
  {
    public static final Parcelable.Creator<d> CREATOR = android.support.v4.f.b.a(new android.support.v4.f.c() {});
    int a;
    boolean b;
    
    public d(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      a = paramParcel.readInt();
      if (paramParcel.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        b = bool;
        return;
      }
    }
    
    public d(Parcelable paramParcelable)
    {
      super();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(a);
      if (b) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }
}


/* Location:              android/support/v7/widget/Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */