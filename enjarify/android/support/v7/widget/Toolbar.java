package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.h.a;
import android.support.v4.h.f;
import android.support.v4.h.l;
import android.support.v4.h.m;
import android.support.v4.h.n;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.support.v7.b.a.b;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o.a;
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
import android.view.ViewParent;
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
  private final ArrayList J;
  private final int[] K;
  private final ActionMenuView.e L;
  private bg M;
  private boolean N;
  private final Runnable O;
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
  final ArrayList n;
  Toolbar.c o;
  d p;
  Toolbar.a q;
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
    this(paramContext, paramAttributeSet, i1);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    J = ((ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    n = ((ArrayList)localObject1);
    localObject1 = new int[2];
    K = ((int[])localObject1);
    localObject1 = new android/support/v7/widget/Toolbar$1;
    ((Toolbar.1)localObject1).<init>(this);
    L = ((ActionMenuView.e)localObject1);
    localObject1 = new android/support/v7/widget/Toolbar$2;
    ((Toolbar.2)localObject1).<init>(this);
    O = ((Runnable)localObject1);
    localObject1 = getContext();
    Object localObject2 = a.j.Toolbar;
    localObject2 = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    int i3 = a.j.Toolbar_titleTextAppearance;
    i3 = ((bf)localObject2).g(i3, 0);
    j = i3;
    i3 = a.j.Toolbar_subtitleTextAppearance;
    i3 = ((bf)localObject2).g(i3, 0);
    k = i3;
    i3 = a.j.Toolbar_android_gravity;
    int i6 = C;
    i3 = ((bf)localObject2).c(i3, i6);
    C = i3;
    i3 = a.j.Toolbar_buttonGravity;
    i3 = ((bf)localObject2).c(i3, 48);
    l = i3;
    i3 = a.j.Toolbar_titleMargin;
    i3 = ((bf)localObject2).d(i3, 0);
    i6 = a.j.Toolbar_titleMargins;
    boolean bool3 = ((bf)localObject2).e(i6);
    if (bool3)
    {
      i7 = a.j.Toolbar_titleMargins;
      i3 = ((bf)localObject2).d(i7, i3);
    }
    z = i3;
    y = i3;
    x = i3;
    w = i3;
    i3 = a.j.Toolbar_titleMarginStart;
    i3 = ((bf)localObject2).d(i3, i1);
    if (i3 >= 0) {
      w = i3;
    }
    i3 = a.j.Toolbar_titleMarginEnd;
    i3 = ((bf)localObject2).d(i3, i1);
    if (i3 >= 0) {
      x = i3;
    }
    i3 = a.j.Toolbar_titleMarginTop;
    i3 = ((bf)localObject2).d(i3, i1);
    if (i3 >= 0) {
      y = i3;
    }
    i3 = a.j.Toolbar_titleMarginBottom;
    i3 = ((bf)localObject2).d(i3, i1);
    if (i3 >= 0) {
      z = i3;
    }
    i3 = a.j.Toolbar_maxButtonHeight;
    i3 = ((bf)localObject2).e(i3, i1);
    v = i3;
    i3 = a.j.Toolbar_contentInsetStart;
    i3 = ((bf)localObject2).d(i3, i2);
    int i7 = a.j.Toolbar_contentInsetEnd;
    i7 = ((bf)localObject2).d(i7, i2);
    int i8 = a.j.Toolbar_contentInsetLeft;
    i8 = ((bf)localObject2).e(i8, 0);
    int i9 = a.j.Toolbar_contentInsetRight;
    i9 = ((bf)localObject2).e(i9, 0);
    f();
    aw localaw1 = m;
    h = false;
    if (i8 != i2)
    {
      e = i8;
      a = i8;
    }
    if (i9 != i2)
    {
      f = i9;
      b = i9;
    }
    if ((i3 != i2) || (i7 != i2))
    {
      aw localaw2 = m;
      localaw2.a(i3, i7);
    }
    i3 = a.j.Toolbar_contentInsetStartWithNavigation;
    i3 = ((bf)localObject2).d(i3, i2);
    A = i3;
    i3 = a.j.Toolbar_contentInsetEndWithActions;
    i3 = ((bf)localObject2).d(i3, i2);
    B = i3;
    i3 = a.j.Toolbar_collapseIcon;
    localObject1 = ((bf)localObject2).a(i3);
    d = ((Drawable)localObject1);
    i3 = a.j.Toolbar_collapseContentDescription;
    localObject1 = ((bf)localObject2).c(i3);
    e = ((CharSequence)localObject1);
    i3 = a.j.Toolbar_title;
    localObject1 = ((bf)localObject2).c(i3);
    boolean bool4 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool4) {
      setTitle((CharSequence)localObject1);
    }
    i3 = a.j.Toolbar_subtitle;
    localObject1 = ((bf)localObject2).c(i3);
    bool4 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool4) {
      setSubtitle((CharSequence)localObject1);
    }
    localObject1 = getContext();
    h = ((Context)localObject1);
    i3 = a.j.Toolbar_popupTheme;
    i3 = ((bf)localObject2).g(i3, 0);
    setPopupTheme(i3);
    i3 = a.j.Toolbar_navigationIcon;
    localObject1 = ((bf)localObject2).a(i3);
    if (localObject1 != null) {
      setNavigationIcon((Drawable)localObject1);
    }
    i3 = a.j.Toolbar_navigationContentDescription;
    localObject1 = ((bf)localObject2).c(i3);
    bool4 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool4) {
      setNavigationContentDescription((CharSequence)localObject1);
    }
    i3 = a.j.Toolbar_logo;
    localObject1 = ((bf)localObject2).a(i3);
    if (localObject1 != null) {
      setLogo((Drawable)localObject1);
    }
    i3 = a.j.Toolbar_logoDescription;
    localObject1 = ((bf)localObject2).c(i3);
    bool4 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool4) {
      setLogoDescription((CharSequence)localObject1);
    }
    i3 = a.j.Toolbar_titleTextColor;
    boolean bool1 = ((bf)localObject2).e(i3);
    if (bool1)
    {
      i4 = a.j.Toolbar_titleTextColor;
      i4 = ((bf)localObject2).b(i4, i1);
      setTitleTextColor(i4);
    }
    int i4 = a.j.Toolbar_subtitleTextColor;
    boolean bool2 = ((bf)localObject2).e(i4);
    if (bool2)
    {
      int i5 = a.j.Toolbar_subtitleTextColor;
      i5 = ((bf)localObject2).b(i5, i1);
      setSubtitleTextColor(i5);
    }
    a.recycle();
  }
  
  private int a(int paramInt)
  {
    int i1 = w.g(this);
    int i2 = f.a(paramInt, i1) & 0x7;
    switch (i2)
    {
    default: 
      i2 = 1;
      if (i1 != i2) {
        break;
      }
    }
    for (i2 = 5;; i2 = 3) {
      return i2;
    }
  }
  
  private int a(View paramView, int paramInt)
  {
    int i1 = 0;
    Toolbar.b localb = (Toolbar.b)paramView.getLayoutParams();
    int i2 = paramView.getMeasuredHeight();
    int i3;
    int i4;
    int i5;
    int i6;
    int i8;
    if (paramInt > 0)
    {
      i3 = (i2 - paramInt) / 2;
      i4 = a & 0x70;
      switch (i4)
      {
      default: 
        i4 = C & 0x70;
      }
      switch (i4)
      {
      default: 
        i4 = getPaddingTop();
        i5 = getPaddingBottom();
        i6 = getHeight();
        i3 = (i6 - i4 - i5 - i2) / 2;
        int i7 = topMargin;
        if (i3 < i7) {
          i8 = topMargin;
        }
        break;
      }
    }
    for (;;)
    {
      i8 += i4;
      for (;;)
      {
        return i8;
        i3 = 0;
        break;
        i8 = getPaddingTop() - i3;
        continue;
        i1 = getHeight();
        i4 = getPaddingBottom();
        i1 = i1 - i4 - i2;
        i8 = bottomMargin;
        i8 = i1 - i8 - i3;
      }
      i2 = i6 - i5 - i2 - i3 - i4;
      i5 = bottomMargin;
      if (i2 < i5)
      {
        i8 = bottomMargin - i2;
        i8 = i3 - i8;
        i8 = Math.max(0, i8);
      }
      else
      {
        i8 = i3;
      }
    }
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    int i1 = 1;
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i2 = leftMargin;
    int i3 = paramArrayOfInt[0];
    i2 -= i3;
    i3 = rightMargin;
    int i4 = paramArrayOfInt[i1];
    i3 -= i4;
    i4 = Math.max(0, i2);
    int i5 = Math.max(0, i3);
    i4 += i5;
    i2 = -i2;
    i2 = Math.max(0, i2);
    paramArrayOfInt[0] = i2;
    i2 = -i3;
    i2 = Math.max(0, i2);
    paramArrayOfInt[i1] = i2;
    i2 = getPaddingLeft();
    i3 = getPaddingRight();
    i2 = i2 + i3 + i4 + paramInt2;
    i3 = width;
    i2 = getChildMeasureSpec(paramInt1, i2, i3);
    i3 = getPaddingTop();
    i5 = getPaddingBottom();
    i3 += i5;
    i5 = topMargin;
    i3 += i5;
    i5 = bottomMargin;
    i3 = i3 + i5 + paramInt4;
    int i6 = height;
    i6 = getChildMeasureSpec(paramInt3, i3, i6);
    paramView.measure(i2, i6);
    return paramView.getMeasuredWidth() + i4;
  }
  
  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Toolbar.b localb = (Toolbar.b)paramView.getLayoutParams();
    int i1 = leftMargin;
    int i2 = paramArrayOfInt[0];
    i1 -= i2;
    i2 = Math.max(0, i1) + paramInt1;
    i1 = -i1;
    i1 = Math.max(0, i1);
    paramArrayOfInt[0] = i1;
    i1 = a(paramView, paramInt2);
    int i3 = paramView.getMeasuredWidth();
    int i4 = i2 + i3;
    int i5 = paramView.getMeasuredHeight() + i1;
    paramView.layout(i2, i1, i4, i5);
    return rightMargin + i3 + i2;
  }
  
  private static Toolbar.b a(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof Toolbar.b;
    Toolbar.b localb;
    if (bool)
    {
      localb = new android/support/v7/widget/Toolbar$b;
      paramLayoutParams = (Toolbar.b)paramLayoutParams;
      localb.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localb;
      bool = paramLayoutParams instanceof android.support.v7.app.a.a;
      if (bool)
      {
        localb = new android/support/v7/widget/Toolbar$b;
        paramLayoutParams = (android.support.v7.app.a.a)paramLayoutParams;
        localb.<init>(paramLayoutParams);
      }
      else
      {
        bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
        if (bool)
        {
          localb = new android/support/v7/widget/Toolbar$b;
          paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
          localb.<init>(paramLayoutParams);
        }
        else
        {
          localb = new android/support/v7/widget/Toolbar$b;
          localb.<init>(paramLayoutParams);
        }
      }
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 1073741824;
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    i2 += i3;
    i3 = leftMargin;
    i2 += i3;
    i3 = rightMargin;
    i2 = i2 + i3 + paramInt2;
    i3 = width;
    i2 = getChildMeasureSpec(paramInt1, i2, i3);
    i3 = getPaddingTop();
    int i4 = getPaddingBottom();
    i3 += i4;
    i4 = topMargin;
    i3 += i4;
    i4 = bottomMargin;
    i3 = i3 + i4 + 0;
    int i5 = height;
    i5 = getChildMeasureSpec(paramInt3, i3, i5);
    i3 = View.MeasureSpec.getMode(i5);
    if ((i3 != i1) && (paramInt4 >= 0))
    {
      if (i3 != 0)
      {
        i5 = View.MeasureSpec.getSize(i5);
        paramInt4 = Math.min(i5, paramInt4);
      }
      i5 = View.MeasureSpec.makeMeasureSpec(paramInt4, i1);
    }
    paramView.measure(i2, i5);
  }
  
  private void a(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    int i1;
    if (localObject == null)
    {
      localObject = new android/support/v7/widget/Toolbar$b;
      ((Toolbar.b)localObject).<init>();
      i1 = 1;
      b = i1;
      if (!paramBoolean) {
        break label86;
      }
      View localView = g;
      if (localView == null) {
        break label86;
      }
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localObject = n;
      ((ArrayList)localObject).add(paramView);
    }
    for (;;)
    {
      return;
      i1 = checkLayoutParams((ViewGroup.LayoutParams)localObject);
      if (i1 == 0)
      {
        localObject = a((ViewGroup.LayoutParams)localObject);
        break;
      }
      localObject = (Toolbar.b)localObject;
      break;
      label86:
      addView(paramView, (ViewGroup.LayoutParams)localObject);
    }
  }
  
  private void a(List paramList, int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    int i3 = w.g(this);
    if (i3 == i1) {}
    int i4;
    Toolbar.b localb;
    for (;;)
    {
      i3 = getChildCount();
      i4 = w.g(this);
      i4 = f.a(paramInt, i4);
      paramList.clear();
      if (i1 == 0) {
        break;
      }
      i1 = i3 + -1;
      for (i2 = i1; i2 >= 0; i2 = i1)
      {
        View localView1 = getChildAt(i2);
        localb = (Toolbar.b)localView1.getLayoutParams();
        int i5 = b;
        if (i5 == 0)
        {
          boolean bool1 = a(localView1);
          if (bool1)
          {
            i1 = a;
            i1 = a(i1);
            if (i1 == i4) {
              paramList.add(localView1);
            }
          }
        }
        i1 = i2 + -1;
      }
      i1 = 0;
      localb = null;
    }
    while (i2 < i3)
    {
      View localView2 = getChildAt(i2);
      localb = (Toolbar.b)localView2.getLayoutParams();
      int i6 = b;
      if (i6 == 0)
      {
        boolean bool2 = a(localView2);
        if (bool2)
        {
          i1 = a;
          i1 = a(i1);
          if (i1 == i4) {
            paramList.add(localView2);
          }
        }
      }
      i2 += 1;
    }
  }
  
  private boolean a(View paramView)
  {
    ViewParent localViewParent;
    int i1;
    if (paramView != null)
    {
      localViewParent = paramView.getParent();
      if (localViewParent == this)
      {
        i1 = paramView.getVisibility();
        int i3 = 8;
        if (i1 != i3) {
          i1 = 1;
        }
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localViewParent = null;
    }
  }
  
  private static int b(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = l.a(localMarginLayoutParams);
    return l.b(localMarginLayoutParams) + i1;
  }
  
  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    int i1 = 1;
    Toolbar.b localb = (Toolbar.b)paramView.getLayoutParams();
    int i2 = rightMargin;
    int i3 = paramArrayOfInt[i1];
    i2 -= i3;
    i3 = Math.max(0, i2);
    i3 = paramInt1 - i3;
    i2 = -i2;
    i2 = Math.max(0, i2);
    paramArrayOfInt[i1] = i2;
    i2 = a(paramView, paramInt2);
    int i4 = paramView.getMeasuredWidth();
    i1 = i3 - i4;
    int i5 = paramView.getMeasuredHeight() + i2;
    paramView.layout(i1, i2, i3, i5);
    int i6 = leftMargin + i4;
    return i3 - i6;
  }
  
  private static int c(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = topMargin;
    return bottomMargin + i1;
  }
  
  private boolean d(View paramView)
  {
    Object localObject = paramView.getParent();
    boolean bool;
    if (localObject != this)
    {
      localObject = n;
      bool = ((ArrayList)localObject).contains(paramView);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  protected static Toolbar.b e()
  {
    Toolbar.b localb = new android/support/v7/widget/Toolbar$b;
    localb.<init>();
    return localb;
  }
  
  private void g()
  {
    Object localObject = u;
    if (localObject == null)
    {
      localObject = new android/support/v7/widget/q;
      Context localContext = getContext();
      ((q)localObject).<init>(localContext);
      u = ((ImageView)localObject);
    }
  }
  
  private MenuInflater getMenuInflater()
  {
    g localg = new android/support/v7/view/g;
    Context localContext = getContext();
    localg.<init>(localContext);
    return localg;
  }
  
  private void h()
  {
    d();
    h localh = a.a;
    if (localh == null)
    {
      localh = (h)a.getMenu();
      Object localObject = q;
      if (localObject == null)
      {
        localObject = new android/support/v7/widget/Toolbar$a;
        ((Toolbar.a)localObject).<init>(this);
        q = ((Toolbar.a)localObject);
      }
      localObject = a;
      boolean bool = true;
      ((ActionMenuView)localObject).setExpandedActionViewsExclusive(bool);
      localObject = q;
      Context localContext = h;
      localh.a((android.support.v7.view.menu.o)localObject, localContext);
    }
  }
  
  private void i()
  {
    Object localObject1 = t;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/o;
      Object localObject2 = getContext();
      int i1 = android.support.v7.a.a.a.toolbarNavigationButtonStyle;
      ((o)localObject1).<init>((Context)localObject2, null, i1);
      t = ((ImageButton)localObject1);
      localObject1 = new android/support/v7/widget/Toolbar$b;
      ((Toolbar.b)localObject1).<init>();
      int i2 = l & 0x70;
      int i3 = 0x800003 | i2;
      a = i3;
      localObject2 = t;
      ((ImageButton)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
  }
  
  public final boolean a()
  {
    boolean bool1 = true;
    Object localObject = a;
    boolean bool2;
    if (localObject != null)
    {
      localObject = a;
      d locald = c;
      if (locald != null)
      {
        localObject = c;
        bool2 = ((d)localObject).j();
        if (bool2)
        {
          bool2 = bool1;
          if (!bool2) {
            break label59;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject = null;
      break;
      label59:
      bool1 = false;
    }
  }
  
  public final boolean b()
  {
    boolean bool1 = true;
    Object localObject = a;
    boolean bool2;
    if (localObject != null)
    {
      localObject = a;
      d locald = c;
      if (locald != null)
      {
        localObject = c;
        bool2 = ((d)localObject).f();
        if (bool2)
        {
          bool2 = bool1;
          if (!bool2) {
            break label59;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject = null;
      break;
      label59:
      bool1 = false;
    }
  }
  
  public final void c()
  {
    Object localObject = q;
    if (localObject == null) {}
    for (localObject = null;; localObject = q.b)
    {
      if (localObject != null) {
        ((j)localObject).collapseActionView();
      }
      return;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = super.checkLayoutParams(paramLayoutParams);
    if (bool)
    {
      bool = paramLayoutParams instanceof Toolbar.b;
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  final void d()
  {
    Object localObject1 = a;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/ActionMenuView;
      Object localObject2 = getContext();
      ((ActionMenuView)localObject1).<init>((Context)localObject2);
      a = ((ActionMenuView)localObject1);
      localObject1 = a;
      int i1 = i;
      ((ActionMenuView)localObject1).setPopupTheme(i1);
      localObject1 = a;
      localObject2 = L;
      ((ActionMenuView)localObject1).setOnMenuItemClickListener((ActionMenuView.e)localObject2);
      localObject1 = a;
      localObject2 = r;
      h.a locala = s;
      ((ActionMenuView)localObject1).a((o.a)localObject2, locala);
      localObject1 = new android/support/v7/widget/Toolbar$b;
      ((Toolbar.b)localObject1).<init>();
      int i2 = l & 0x70;
      i1 = 0x800005 | i2;
      a = i1;
      a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = a;
      i1 = 0;
      localObject2 = null;
      a((View)localObject1, false);
    }
  }
  
  final void f()
  {
    aw localaw = m;
    if (localaw == null)
    {
      localaw = new android/support/v7/widget/aw;
      localaw.<init>();
      m = localaw;
    }
  }
  
  public int getContentInsetEnd()
  {
    aw localaw = m;
    int i1;
    if (localaw != null)
    {
      localaw = m;
      boolean bool = g;
      if (bool) {
        i1 = a;
      }
    }
    for (;;)
    {
      return i1;
      i1 = b;
      continue;
      i1 = 0;
      localaw = null;
    }
  }
  
  public int getContentInsetEndWithActions()
  {
    int i1 = B;
    int i2 = -1 << -1;
    if (i1 != i2) {}
    for (i1 = B;; i1 = getContentInsetEnd()) {
      return i1;
    }
  }
  
  public int getContentInsetLeft()
  {
    aw localaw = m;
    int i1;
    if (localaw != null)
    {
      localaw = m;
      i1 = a;
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localaw = null;
    }
  }
  
  public int getContentInsetRight()
  {
    aw localaw = m;
    int i1;
    if (localaw != null)
    {
      localaw = m;
      i1 = b;
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localaw = null;
    }
  }
  
  public int getContentInsetStart()
  {
    aw localaw = m;
    int i1;
    if (localaw != null)
    {
      localaw = m;
      boolean bool = g;
      if (bool) {
        i1 = b;
      }
    }
    for (;;)
    {
      return i1;
      i1 = a;
      continue;
      i1 = 0;
      localaw = null;
    }
  }
  
  public int getContentInsetStartWithNavigation()
  {
    int i1 = A;
    int i2 = -1 << -1;
    if (i1 != i2) {}
    for (i1 = A;; i1 = getContentInsetStart()) {
      return i1;
    }
  }
  
  public int getCurrentContentInsetEnd()
  {
    int i1 = 0;
    Object localObject = a;
    boolean bool;
    if (localObject != null)
    {
      localObject = a.a;
      if (localObject != null)
      {
        bool = ((h)localObject).hasVisibleItems();
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      if (bool)
      {
        i2 = getContentInsetEnd();
        int i3 = B;
        i1 = Math.max(i3, 0);
      }
      for (int i2 = Math.max(i2, i1);; i2 = getContentInsetEnd())
      {
        return i2;
        i2 = 0;
        localObject = null;
        break;
      }
      i2 = 0;
      localObject = null;
    }
  }
  
  public int getCurrentContentInsetLeft()
  {
    int i1 = w.g(this);
    int i2 = 1;
    if (i1 == i2) {}
    for (i1 = getCurrentContentInsetEnd();; i1 = getCurrentContentInsetStart()) {
      return i1;
    }
  }
  
  public int getCurrentContentInsetRight()
  {
    int i1 = w.g(this);
    int i2 = 1;
    if (i1 == i2) {}
    for (i1 = getCurrentContentInsetStart();; i1 = getCurrentContentInsetEnd()) {
      return i1;
    }
  }
  
  public int getCurrentContentInsetStart()
  {
    Drawable localDrawable = getNavigationIcon();
    int i2;
    if (localDrawable != null)
    {
      i1 = getContentInsetStart();
      i2 = Math.max(A, 0);
    }
    for (int i1 = Math.max(i1, i2);; i1 = getContentInsetStart()) {
      return i1;
    }
  }
  
  public Drawable getLogo()
  {
    Object localObject = u;
    if (localObject != null) {}
    for (localObject = u.getDrawable();; localObject = null) {
      return (Drawable)localObject;
    }
  }
  
  public CharSequence getLogoDescription()
  {
    Object localObject = u;
    if (localObject != null) {}
    for (localObject = u.getContentDescription();; localObject = null) {
      return (CharSequence)localObject;
    }
  }
  
  public Menu getMenu()
  {
    h();
    return a.getMenu();
  }
  
  public CharSequence getNavigationContentDescription()
  {
    Object localObject = t;
    if (localObject != null) {}
    for (localObject = t.getContentDescription();; localObject = null) {
      return (CharSequence)localObject;
    }
  }
  
  public Drawable getNavigationIcon()
  {
    Object localObject = t;
    if (localObject != null) {}
    for (localObject = t.getDrawable();; localObject = null) {
      return (Drawable)localObject;
    }
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
    bg localbg = M;
    if (localbg == null)
    {
      localbg = new android/support/v7/widget/bg;
      boolean bool = true;
      localbg.<init>(this, bool);
      M = localbg;
    }
    return M;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Runnable localRunnable = O;
    removeCallbacks(localRunnable);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 9;
    boolean bool1 = true;
    int i2 = n.a(paramMotionEvent);
    if (i2 == i1) {
      I = false;
    }
    boolean bool2 = I;
    if (!bool2)
    {
      bool2 = super.onHoverEvent(paramMotionEvent);
      if ((i2 == i1) && (!bool2)) {
        I = bool1;
      }
    }
    int i3 = 10;
    if (i2 != i3)
    {
      i3 = 3;
      if (i2 != i3) {}
    }
    else
    {
      I = false;
    }
    return bool1;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = w.g(this);
    int i3 = 1;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i11;
    boolean bool2;
    Object localObject4;
    label132:
    int i2;
    if (i1 == i3)
    {
      i1 = 1;
      i4 = i1;
      i5 = getWidth();
      i6 = getHeight();
      i7 = getPaddingLeft();
      i8 = getPaddingRight();
      i9 = getPaddingTop();
      i10 = getPaddingBottom();
      i3 = i5 - i8;
      localObject1 = this;
      localObject1 = K;
      localObject2 = localObject1;
      localObject3 = null;
      i11 = 1;
      bool2 = false;
      localObject4 = null;
      localObject1[i11] = 0;
      localObject1[0] = 0;
      i1 = w.r(this);
      if (i1 < 0) {
        break label1296;
      }
      i11 = paramInt4 - paramInt2;
      i1 = Math.min(i1, i11);
      i11 = i1;
      localObject1 = this;
      localObject3 = t;
      boolean bool1 = a((View)localObject3);
      if (!bool1) {
        break label2500;
      }
      if (i4 == 0) {
        break label1308;
      }
      localObject3 = t;
      i2 = b((View)localObject3, i3, (int[])localObject2, i11);
      i3 = i7;
    }
    for (;;)
    {
      label183:
      localObject1 = this;
      localObject4 = f;
      bool2 = a((View)localObject4);
      label230:
      label277:
      int i15;
      Object localObject5;
      int i20;
      int i25;
      TextView localTextView1;
      int i19;
      int i13;
      if (bool2)
      {
        if (i4 != 0)
        {
          localObject4 = f;
          i2 = b((View)localObject4, i2, (int[])localObject2, i11);
        }
      }
      else
      {
        localObject1 = this;
        localObject4 = a;
        bool2 = a((View)localObject4);
        if (bool2)
        {
          if (i4 == 0) {
            break label1366;
          }
          localObject4 = a;
          i3 = a((View)localObject4, i3, (int[])localObject2, i11);
        }
        int i12 = getCurrentContentInsetLeft();
        i15 = getCurrentContentInsetRight();
        localObject5 = null;
        int i18 = i12 - i3;
        i20 = Math.max(0, i18);
        localObject2[0] = i20;
        i25 = 1;
        localTextView1 = null;
        i18 = i5 - i8 - i2;
        i19 = i15 - i18;
        i20 = Math.max(0, i19);
        localObject2[i25] = i20;
        i3 = Math.max(i3, i12);
        i12 = i5 - i8 - i15;
        i2 = Math.min(i2, i12);
        localObject1 = this;
        localObject4 = g;
        i13 = a((View)localObject4);
        if (i13 != 0)
        {
          if (i4 == 0) {
            break label1389;
          }
          localObject4 = g;
          i2 = b((View)localObject4, i2, (int[])localObject2, i11);
        }
        label426:
        localObject1 = this;
        localObject4 = u;
        i13 = a((View)localObject4);
        if (i13 == 0) {
          break label2489;
        }
        if (i4 == 0) {
          break label1412;
        }
        localObject4 = u;
        i2 = b((View)localObject4, i2, (int[])localObject2, i11);
        i13 = i2;
        i15 = i3;
      }
      for (;;)
      {
        label481:
        localObject1 = this;
        localObject3 = b;
        boolean bool3 = a((View)localObject3);
        localObject3 = c;
        boolean bool4 = a((View)localObject3);
        i3 = 0;
        Object localObject6 = null;
        if (bool3)
        {
          localObject3 = (Toolbar.b)b.getLayoutParams();
          i3 = topMargin;
          localObject5 = b;
          i25 = ((TextView)localObject5).getMeasuredHeight();
          i3 += i25;
          i2 = bottomMargin + i3;
          i3 = i2 + 0;
        }
        int i27;
        if (bool4)
        {
          localObject1 = this;
          localObject3 = (Toolbar.b)c.getLayoutParams();
          int i26 = topMargin;
          localTextView1 = c;
          i20 = localTextView1.getMeasuredHeight();
          i26 += i20;
          i2 = bottomMargin + i27 + i3;
        }
        for (i19 = i2;; i19 = i3)
        {
          if ((bool3) || (bool4))
          {
            if (!bool3) {
              break label1443;
            }
            localObject1 = this;
            localObject3 = b;
            localObject5 = localObject3;
            label670:
            if (!bool4) {
              break label1459;
            }
            localObject1 = this;
            localObject3 = c;
            localObject6 = localObject3;
            label688:
            localObject3 = (Toolbar.b)((View)localObject5).getLayoutParams();
            localObject6 = (Toolbar.b)((View)localObject6).getLayoutParams();
            if (bool3)
            {
              localObject1 = this;
              localObject5 = b;
              i27 = ((TextView)localObject5).getMeasuredWidth();
              if (i27 > 0) {}
            }
            else
            {
              if (!bool4) {
                break label1475;
              }
              localObject1 = this;
              localObject5 = c;
              i27 = ((TextView)localObject5).getMeasuredWidth();
              if (i27 <= 0) {
                break label1475;
              }
            }
            i27 = 1;
            label763:
            localObject1 = this;
            i20 = C & 0x70;
            switch (i20)
            {
            default: 
              i20 = (i6 - i9 - i10 - i19) / 2;
              int i30 = topMargin;
              int i31 = y;
              i30 += i31;
              i31 = i30;
              if (i20 < i30)
              {
                i2 = topMargin;
                i3 = y;
                i2 += i3;
              }
              break;
            }
          }
          for (;;)
          {
            label870:
            i20 = i9 + i2;
            label877:
            label896:
            TextView localTextView2;
            TextView localTextView3;
            if (i4 != 0) {
              if (i27 != 0)
              {
                localObject1 = this;
                i2 = w;
                i3 = localObject2[1];
                i2 -= i3;
                localObject6 = null;
                i3 = Math.max(0, i2);
                i3 = i13 - i3;
                i4 = 1;
                i14 = 0;
                localObject4 = null;
                i2 = -i2;
                i2 = Math.max(0, i2);
                localObject2[i4] = i2;
                if (!bool3) {
                  break label2468;
                }
                localObject1 = this;
                localObject3 = (Toolbar.b)b.getLayoutParams();
                localTextView2 = b;
                i4 = localTextView2.getMeasuredWidth();
                i4 = i3 - i4;
                localObject4 = b;
                i14 = ((TextView)localObject4).getMeasuredHeight() + i20;
                localTextView3 = b;
                localTextView3.layout(i4, i20, i3, i14);
                i20 = x;
                i4 -= i20;
                i2 = bottomMargin;
                i20 = i14 + i2;
              }
            }
            label1296:
            label1308:
            label1366:
            label1389:
            label1412:
            label1443:
            label1459:
            label1475:
            label1670:
            int i24;
            label2441:
            label2443:
            label2468:
            for (i14 = i4;; i14 = i3)
            {
              int i21;
              Object localObject7;
              if (bool4)
              {
                localObject1 = this;
                localObject3 = (Toolbar.b)c.getLayoutParams();
                i4 = topMargin + i20;
                localTextView1 = c;
                i20 = localTextView1.getMeasuredWidth();
                i21 = i3 - i20;
                localTextView3 = c;
                i19 = localTextView3.getMeasuredHeight() + i4;
                localObject7 = c;
                ((TextView)localObject7).layout(i21, i4, i3, i19);
                i4 = x;
                i4 = i3 - i4;
                i2 = bottomMargin;
              }
              for (i2 = i4;; i2 = i3)
              {
                if (i27 != 0) {}
                for (i2 = Math.min(i14, i2);; i2 = i3)
                {
                  i14 = i2;
                  localObject1 = this;
                  localObject3 = J;
                  a((List)localObject3, 3);
                  i27 = J.size();
                  i2 = 0;
                  localObject3 = null;
                  i3 = 0;
                  localObject6 = null;
                  i4 = i15;
                  int i28;
                  int i16;
                  for (;;)
                  {
                    if (i3 < i27)
                    {
                      localObject1 = this;
                      localObject3 = (View)J.get(i3);
                      i4 = a((View)localObject3, i4, (int[])localObject2, i11);
                      i2 = i3 + 1;
                      i3 = i2;
                      continue;
                      i2 = 0;
                      localObject3 = null;
                      i4 = 0;
                      localTextView2 = null;
                      break;
                      i2 = 0;
                      localObject3 = null;
                      i11 = 0;
                      break label132;
                      localObject3 = t;
                      i2 = a((View)localObject3, i7, (int[])localObject2, i11);
                      int i33 = i3;
                      i3 = i2;
                      i2 = i33;
                      break label183;
                      localObject4 = f;
                      i3 = a((View)localObject4, i3, (int[])localObject2, i11);
                      break label230;
                      localObject4 = a;
                      i2 = b((View)localObject4, i2, (int[])localObject2, i11);
                      break label277;
                      localObject4 = g;
                      i3 = a((View)localObject4, i3, (int[])localObject2, i11);
                      break label426;
                      localObject4 = u;
                      i3 = a((View)localObject4, i3, (int[])localObject2, i11);
                      i14 = i2;
                      i15 = i3;
                      break label481;
                      localObject1 = this;
                      localObject3 = c;
                      localObject5 = localObject3;
                      break label670;
                      localObject1 = this;
                      localObject3 = b;
                      localObject6 = localObject3;
                      break label688;
                      i28 = 0;
                      localObject5 = null;
                      break label763;
                      i3 = getPaddingTop();
                      i2 = topMargin + i3;
                      i3 = y;
                      i21 = i2 + i3;
                      break label877;
                      i19 = i6 - i10 - i19 - i21 - i9;
                      i2 = bottomMargin;
                      i6 = z;
                      i2 += i6;
                      if (i19 >= i2) {
                        break label2475;
                      }
                      localObject3 = null;
                      i3 = bottomMargin;
                      i6 = z;
                      i3 = i3 + i6 - i19;
                      i3 = i21 - i3;
                      i2 = Math.max(0, i3);
                      break label870;
                      i2 = i6 - i10;
                      i3 = bottomMargin;
                      i2 -= i3;
                      i3 = z;
                      i2 -= i3;
                      int i22 = i2 - i19;
                      break label877;
                      i2 = 0;
                      localObject3 = null;
                      break label896;
                      if (i28 != 0)
                      {
                        localObject1 = this;
                        i2 = w;
                        i3 = localObject2[0];
                        i2 -= i3;
                        i3 = Math.max(0, i2);
                        i15 += i3;
                        i3 = 0;
                        localObject6 = null;
                        i4 = 0;
                        localTextView2 = null;
                        i2 = -i2;
                        i2 = Math.max(0, i2);
                        localObject2[0] = i2;
                        if (!bool3) {
                          break label2443;
                        }
                        localObject1 = this;
                        localObject3 = (Toolbar.b)b.getLayoutParams();
                        localObject6 = b;
                        i3 = ((TextView)localObject6).getMeasuredWidth() + i16;
                        localTextView2 = b;
                        i4 = localTextView2.getMeasuredHeight() + i22;
                        localTextView3 = b;
                        localTextView3.layout(i16, i22, i3, i4);
                        i22 = x;
                        i3 += i22;
                        i2 = bottomMargin + i4;
                        i4 = i3;
                      }
                    }
                  }
                  for (i3 = i2;; i3 = i24)
                  {
                    if (bool4)
                    {
                      localObject1 = this;
                      localObject3 = (Toolbar.b)c.getLayoutParams();
                      int i23 = topMargin;
                      i3 += i23;
                      localTextView1 = c;
                      i24 = localTextView1.getMeasuredWidth() + i16;
                      localTextView3 = c;
                      i19 = localTextView3.getMeasuredHeight() + i3;
                      localObject7 = c;
                      ((TextView)localObject7).layout(i16, i3, i24, i19);
                      i3 = x + i24;
                      i2 = bottomMargin;
                    }
                    for (i2 = i3;; i2 = i17)
                    {
                      if (i28 == 0) {
                        break label2441;
                      }
                      i16 = Math.max(i4, i2);
                      break;
                      i2 = 0;
                      localObject3 = null;
                      break label1670;
                      localObject1 = this;
                      localObject3 = J;
                      a((List)localObject3, 5);
                      i16 = J.size();
                      i2 = 0;
                      localObject3 = null;
                      i3 = 0;
                      localObject6 = null;
                      for (i19 = i14; i3 < i16; i19 = i14)
                      {
                        localObject1 = this;
                        localObject3 = (View)J.get(i3);
                        i14 = b((View)localObject3, i19, (int[])localObject2, i11);
                        i2 = i3 + 1;
                        i3 = i2;
                      }
                      localObject1 = this;
                      localObject3 = J;
                      a((List)localObject3, 1);
                      localObject7 = J;
                      i14 = localObject2[0];
                      i17 = localObject2[1];
                      i3 = 0;
                      localObject6 = null;
                      i9 = ((List)localObject7).size();
                      i2 = 0;
                      localObject3 = null;
                      i28 = i14;
                      i24 = i17;
                      i14 = 0;
                      localObject4 = null;
                      for (i17 = 0; i14 < i9; i17 = i3)
                      {
                        localObject3 = ((List)localObject7).get(i14);
                        localObject6 = localObject3;
                        localObject6 = (View)localObject3;
                        localObject3 = (Toolbar.b)((View)localObject6).getLayoutParams();
                        int i32 = leftMargin;
                        i10 = i32;
                        i28 = i32 - i28;
                        i2 = rightMargin - i24;
                        i10 = Math.max(0, i28);
                        int i29 = Math.max(0, i2);
                        i28 = -i28;
                        i28 = Math.max(0, i28);
                        localTextView1 = null;
                        i2 = -i2;
                        i24 = Math.max(0, i2);
                        i2 = ((View)localObject6).getMeasuredWidth() + i10 + i29;
                        i3 = i17 + i2;
                        i2 = i14 + 1;
                        i14 = i2;
                      }
                      i2 = (i5 - i7 - i8) / 2 + i7;
                      i3 = i17 / 2;
                      i2 -= i3;
                      i3 = i2 + i17;
                      if (i2 < i4) {
                        i2 = i4;
                      }
                      for (;;)
                      {
                        localObject1 = this;
                        i7 = J.size();
                        localObject6 = null;
                        i4 = 0;
                        localTextView2 = null;
                        for (i3 = i2; i4 < i7; i3 = i2)
                        {
                          localObject1 = this;
                          localObject3 = (View)J.get(i4);
                          i2 = a((View)localObject3, i3, (int[])localObject2, i11);
                          i4 += 1;
                        }
                        if (i3 > i19)
                        {
                          i3 -= i19;
                          i2 -= i3;
                        }
                      }
                      localObject1 = this;
                      J.clear();
                      return;
                    }
                    break;
                    i4 = i17;
                  }
                }
              }
            }
            label2475:
            i2 = i24;
          }
        }
        label2489:
        int i14 = i2;
        int i17 = i3;
      }
      label2500:
      i2 = i3;
      i3 = i7;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    ImageButton localImageButton = null;
    int i2 = 0;
    Object localObject1 = null;
    int[] arrayOfInt = K;
    boolean bool1 = bk.a(this);
    Object localObject2;
    int i12;
    boolean bool8;
    Object localObject3;
    int i14;
    int i16;
    int i3;
    int i19;
    if (bool1)
    {
      boolean bool5 = true;
      bool1 = false;
      localObject2 = null;
      i12 = 0;
      bool8 = bool5;
      bool1 = false;
      localObject2 = null;
      localObject3 = t;
      bool5 = a((View)localObject3);
      if (!bool5) {
        break label1568;
      }
      localObject3 = t;
      i14 = v;
      localObject2 = this;
      i2 = paramInt1;
      i16 = paramInt2;
      a((View)localObject3, paramInt1, 0, paramInt2, i14);
      localObject2 = t;
      i3 = ((ImageButton)localObject2).getMeasuredWidth();
      int i7 = b(t);
      i3 += i7;
      localObject1 = t;
      i2 = ((ImageButton)localObject1).getMeasuredHeight();
      i1 = c(t);
      i2 += i1;
      i2 = Math.max(0, i2);
      localObject3 = null;
      localImageButton = t;
      i1 = w.j(localImageButton);
      i7 = bk.a(0, i1);
      i19 = i7;
    }
    for (int i20 = i2;; i20 = 0)
    {
      localObject3 = f;
      boolean bool6 = a((View)localObject3);
      if (bool6)
      {
        localObject3 = f;
        i1 = 0;
        localImageButton = null;
        i14 = v;
        localObject2 = this;
        i2 = paramInt1;
        i16 = paramInt2;
        a((View)localObject3, paramInt1, 0, paramInt2, i14);
        localObject2 = f;
        i3 = ((ImageButton)localObject2).getMeasuredWidth();
        i8 = b(f);
        i3 += i8;
        i8 = f.getMeasuredHeight();
        localObject1 = f;
        i2 = c((View)localObject1);
        i8 += i2;
        i20 = Math.max(i20, i8);
        localObject3 = f;
        i8 = w.j((View)localObject3);
        i19 = bk.a(i19, i8);
      }
      int i8 = getCurrentContentInsetStart();
      i1 = Math.max(i8, i3) + 0;
      i2 = 0;
      localObject1 = null;
      i3 = i8 - i3;
      i3 = Math.max(0, i3);
      arrayOfInt[bool8] = i3;
      i3 = 0;
      localObject2 = null;
      localObject3 = a;
      boolean bool7 = a((View)localObject3);
      if (bool7)
      {
        localObject3 = a;
        i14 = v;
        localObject2 = this;
        i2 = paramInt1;
        i16 = paramInt2;
        a((View)localObject3, paramInt1, i1, paramInt2, i14);
        localObject2 = a;
        i3 = ((ActionMenuView)localObject2).getMeasuredWidth();
        i9 = b(a);
        i3 += i9;
        i9 = a.getMeasuredHeight();
        localObject1 = a;
        i2 = c((View)localObject1);
        i9 += i2;
        i20 = Math.max(i20, i9);
        localObject3 = a;
        i9 = w.j((View)localObject3);
        i19 = bk.a(i19, i9);
      }
      int i9 = getCurrentContentInsetEnd();
      i2 = Math.max(i9, i3);
      i1 += i2;
      i2 = 0;
      localObject1 = null;
      i3 = i9 - i3;
      i3 = Math.max(0, i3);
      arrayOfInt[i12] = i3;
      localObject2 = g;
      boolean bool2 = a((View)localObject2);
      if (bool2)
      {
        localObject3 = g;
        i14 = 0;
        localObject2 = this;
        i2 = paramInt1;
        i16 = paramInt2;
        int i4 = a((View)localObject3, paramInt1, i1, paramInt2, 0, arrayOfInt);
        i1 += i4;
        i4 = g.getMeasuredHeight();
        localObject3 = g;
        i9 = c((View)localObject3);
        i4 += i9;
        i20 = Math.max(i20, i4);
        localObject2 = g;
        i4 = w.j((View)localObject2);
        i19 = bk.a(i19, i4);
      }
      localObject2 = u;
      boolean bool3 = a((View)localObject2);
      if (bool3)
      {
        localObject3 = u;
        i14 = 0;
        localObject2 = this;
        i2 = paramInt1;
        i16 = paramInt2;
        i5 = a((View)localObject3, paramInt1, i1, paramInt2, 0, arrayOfInt);
        i1 += i5;
        i5 = u.getMeasuredHeight();
        localObject3 = u;
        i9 = c((View)localObject3);
        i5 += i9;
        i20 = Math.max(i20, i5);
        localObject2 = u;
        i5 = w.j((View)localObject2);
        i19 = bk.a(i19, i5);
      }
      int i13 = getChildCount();
      int i5 = 0;
      localObject2 = null;
      i12 = 0;
      int i21 = i19;
      int i22 = i20;
      label833:
      int i6;
      if (i12 < i13)
      {
        localObject3 = getChildAt(i12);
        localObject2 = (Toolbar.b)((View)localObject3).getLayoutParams();
        i5 = b;
        if (i5 != 0) {
          break label1557;
        }
        boolean bool4 = a((View)localObject3);
        if (!bool4) {
          break label1557;
        }
        i14 = 0;
        localObject2 = this;
        i2 = paramInt1;
        i16 = paramInt2;
        i6 = a((View)localObject3, paramInt1, i1, paramInt2, 0, arrayOfInt);
        i1 += i6;
        i6 = ((View)localObject3).getMeasuredHeight();
        i2 = c((View)localObject3);
        i6 += i2;
        i2 = Math.max(i22, i6);
        i6 = w.j((View)localObject3);
        i6 = bk.a(i21, i6);
      }
      int i11;
      for (i9 = i2;; i11 = i22)
      {
        i2 = i12 + 1;
        i12 = i2;
        i21 = i6;
        i22 = i9;
        break label833;
        i9 = 0;
        localObject3 = null;
        i6 = 1;
        i12 = i6;
        i13 = 0;
        TextView localTextView = null;
        break;
        i9 = 0;
        localObject3 = null;
        i6 = 0;
        localObject2 = null;
        i2 = y;
        i16 = z;
        int i23 = i2 + i16;
        i2 = w;
        i16 = x;
        i2 += i16;
        Object localObject4 = b;
        boolean bool10 = a((View)localObject4);
        if (bool10)
        {
          localTextView = b;
          i20 = i1 + i2;
          i19 = paramInt1;
          a(localTextView, paramInt1, i20, paramInt2, i23, arrayOfInt);
          i6 = b.getMeasuredWidth();
          localObject3 = b;
          i9 = b((View)localObject3) + i6;
          localObject2 = b;
          i6 = ((TextView)localObject2).getMeasuredHeight();
          int i17 = c(b);
          i6 += i17;
          localObject4 = b;
          i17 = w.j((View)localObject4);
          i21 = bk.a(i21, i17);
        }
        localObject4 = c;
        boolean bool11 = a((View)localObject4);
        int i18;
        if (bool11)
        {
          localTextView = c;
          i20 = i1 + i2;
          i23 += i6;
          i19 = paramInt1;
          i2 = a(localTextView, paramInt1, i20, paramInt2, i23, arrayOfInt);
          i9 = Math.max(i9, i2);
          i2 = c.getMeasuredHeight();
          localObject4 = c;
          i18 = c((View)localObject4);
          i2 += i18;
          i6 += i2;
          localObject1 = c;
          i2 = w.j((View)localObject1);
          i21 = bk.a(i21, i2);
        }
        i9 += i1;
        i6 = Math.max(i22, i6);
        i2 = getPaddingLeft();
        i1 = getPaddingRight();
        i2 += i1;
        i9 += i2;
        i2 = getPaddingTop();
        i1 = getPaddingBottom();
        i2 += i1;
        i6 += i2;
        i2 = getSuggestedMinimumWidth();
        i9 = Math.max(i9, i2);
        i2 = 0xFF000000 & i21;
        i2 = w.a(i9, paramInt1, i2);
        i9 = getSuggestedMinimumHeight();
        i6 = Math.max(i6, i9);
        i9 = i21 << 16;
        i6 = w.a(i6, paramInt2, i9);
        int i10 = N;
        if (i10 == 0)
        {
          i10 = 0;
          localObject3 = null;
        }
        for (;;)
        {
          if (i10 != 0)
          {
            i6 = 0;
            localObject2 = null;
          }
          setMeasuredDimension(i2, i6);
          return;
          i1 = getChildCount();
          i10 = 0;
          localObject3 = null;
          for (;;)
          {
            if (i10 >= i1) {
              break label1551;
            }
            localObject4 = getChildAt(i10);
            boolean bool9 = a((View)localObject4);
            if (bool9)
            {
              int i15 = ((View)localObject4).getMeasuredWidth();
              if (i15 > 0)
              {
                i18 = ((View)localObject4).getMeasuredHeight();
                if (i18 > 0)
                {
                  i11 = 0;
                  localObject3 = null;
                  break;
                }
              }
            }
            i11 += 1;
          }
          label1551:
          i11 = 1;
        }
        label1557:
        i6 = i21;
      }
      label1568:
      i19 = 0;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof Toolbar.d;
    if (!bool)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (Toolbar.d)paramParcelable;
    Object localObject = e;
    super.onRestoreInstanceState((Parcelable)localObject);
    localObject = a;
    if (localObject != null) {}
    for (localObject = a.a;; localObject = null)
    {
      int i1 = a;
      if (i1 != 0)
      {
        Toolbar.a locala = q;
        if ((locala != null) && (localObject != null))
        {
          i1 = a;
          localObject = ((Menu)localObject).findItem(i1);
          if (localObject != null) {
            m.b((MenuItem)localObject);
          }
        }
      }
      bool = b;
      if (!bool) {
        break;
      }
      localObject = O;
      removeCallbacks((Runnable)localObject);
      localObject = O;
      post((Runnable)localObject);
      break;
      bool = false;
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    int i1 = 1;
    int i2 = -1 << -1;
    int i3 = Build.VERSION.SDK_INT;
    int i4 = 17;
    if (i3 >= i4) {
      super.onRtlPropertiesChanged(paramInt);
    }
    f();
    aw localaw = m;
    if (paramInt == i1)
    {
      int i5 = g;
      if (i1 != i5)
      {
        g = i1;
        boolean bool = h;
        if (!bool) {
          break label214;
        }
        if (i1 == 0) {
          break label147;
        }
        i1 = d;
        if (i1 == i2) {
          break label129;
        }
        i1 = d;
        label94:
        a = i1;
        i1 = c;
        if (i1 == i2) {
          break label138;
        }
        i1 = c;
        label117:
        b = i1;
      }
    }
    for (;;)
    {
      return;
      i1 = 0;
      break;
      label129:
      i1 = e;
      break label94;
      label138:
      i1 = f;
      break label117;
      label147:
      i1 = c;
      if (i1 != i2)
      {
        i1 = c;
        label164:
        a = i1;
        i1 = d;
        if (i1 == i2) {
          break label205;
        }
      }
      label205:
      for (i1 = d;; i1 = f)
      {
        b = i1;
        break;
        i1 = e;
        break label164;
      }
      label214:
      i1 = e;
      a = i1;
      i1 = f;
      b = i1;
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Toolbar.d locald = new android/support/v7/widget/Toolbar$d;
    Object localObject = super.onSaveInstanceState();
    locald.<init>((Parcelable)localObject);
    localObject = q;
    if (localObject != null)
    {
      localObject = q.b;
      if (localObject != null)
      {
        localObject = q.b;
        int i1 = ((j)localObject).getItemId();
        a = i1;
      }
    }
    boolean bool = a();
    b = bool;
    return locald;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    int i2 = n.a(paramMotionEvent);
    if (i2 == 0) {
      H = false;
    }
    boolean bool = H;
    if (!bool)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      if ((i2 == 0) && (!bool)) {
        H = i1;
      }
    }
    if (i2 != i1)
    {
      int i3 = 3;
      if (i2 != i3) {}
    }
    else
    {
      H = false;
    }
    return i1;
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    N = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1 << -1;
    }
    int i1 = B;
    if (paramInt != i1)
    {
      B = paramInt;
      Drawable localDrawable = getNavigationIcon();
      if (localDrawable != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetStartWithNavigation(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1 << -1;
    }
    int i1 = A;
    if (paramInt != i1)
    {
      A = paramInt;
      Drawable localDrawable = getNavigationIcon();
      if (localDrawable != null) {
        requestLayout();
      }
    }
  }
  
  public void setLogo(int paramInt)
  {
    Drawable localDrawable = b.b(getContext(), paramInt);
    setLogo(localDrawable);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    Object localObject;
    boolean bool1;
    if (paramDrawable != null)
    {
      g();
      localObject = u;
      bool1 = d((View)localObject);
      if (!bool1)
      {
        localObject = u;
        boolean bool2 = true;
        a((View)localObject, bool2);
      }
    }
    for (;;)
    {
      localObject = u;
      if (localObject != null)
      {
        localObject = u;
        ((ImageView)localObject).setImageDrawable(paramDrawable);
      }
      return;
      localObject = u;
      if (localObject != null)
      {
        localObject = u;
        bool1 = d((View)localObject);
        if (bool1)
        {
          localObject = u;
          removeView((View)localObject);
          localObject = n;
          ImageView localImageView = u;
          ((ArrayList)localObject).remove(localImageView);
        }
      }
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setLogoDescription(localCharSequence);
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool) {
      g();
    }
    ImageView localImageView = u;
    if (localImageView != null)
    {
      localImageView = u;
      localImageView.setContentDescription(paramCharSequence);
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
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool) {
      i();
    }
    ImageButton localImageButton = t;
    if (localImageButton != null)
    {
      localImageButton = t;
      localImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    Drawable localDrawable = b.b(getContext(), paramInt);
    setNavigationIcon(localDrawable);
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    Object localObject;
    boolean bool1;
    if (paramDrawable != null)
    {
      i();
      localObject = t;
      bool1 = d((View)localObject);
      if (!bool1)
      {
        localObject = t;
        boolean bool2 = true;
        a((View)localObject, bool2);
      }
    }
    for (;;)
    {
      localObject = t;
      if (localObject != null)
      {
        localObject = t;
        ((ImageButton)localObject).setImageDrawable(paramDrawable);
      }
      return;
      localObject = t;
      if (localObject != null)
      {
        localObject = t;
        bool1 = d((View)localObject);
        if (bool1)
        {
          localObject = t;
          removeView((View)localObject);
          localObject = n;
          ImageButton localImageButton = t;
          ((ArrayList)localObject).remove(localImageButton);
        }
      }
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    i();
    t.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(Toolbar.c paramc)
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
    int i1 = i;
    Object localObject;
    if (i1 != paramInt)
    {
      i = paramInt;
      if (paramInt != 0) {
        break label30;
      }
      localObject = getContext();
    }
    for (h = ((Context)localObject);; h = ((Context)localObject))
    {
      return;
      label30:
      localObject = new android/view/ContextThemeWrapper;
      Context localContext = getContext();
      ((ContextThemeWrapper)localObject).<init>(localContext, paramInt);
    }
  }
  
  public void setSubtitle(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setSubtitle(localCharSequence);
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    boolean bool1 = TextUtils.isEmpty(paramCharSequence);
    Object localObject1;
    Object localObject2;
    boolean bool2;
    if (!bool1)
    {
      localObject1 = c;
      int i2;
      if (localObject1 == null)
      {
        localObject1 = getContext();
        localObject2 = new android/support/v7/widget/ab;
        ((ab)localObject2).<init>((Context)localObject1);
        c = ((TextView)localObject2);
        c.setSingleLine();
        localObject2 = c;
        TextUtils.TruncateAt localTruncateAt = TextUtils.TruncateAt.END;
        ((TextView)localObject2).setEllipsize(localTruncateAt);
        i2 = k;
        if (i2 != 0)
        {
          localObject2 = c;
          int i3 = k;
          ((TextView)localObject2).setTextAppearance((Context)localObject1, i3);
        }
        int i1 = G;
        if (i1 != 0)
        {
          localObject1 = c;
          i2 = G;
          ((TextView)localObject1).setTextColor(i2);
        }
      }
      localObject1 = c;
      bool2 = d((View)localObject1);
      if (!bool2)
      {
        localObject1 = c;
        i2 = 1;
        a((View)localObject1, i2);
      }
    }
    for (;;)
    {
      localObject1 = c;
      if (localObject1 != null)
      {
        localObject1 = c;
        ((TextView)localObject1).setText(paramCharSequence);
      }
      E = paramCharSequence;
      return;
      localObject1 = c;
      if (localObject1 != null)
      {
        localObject1 = c;
        bool2 = d((View)localObject1);
        if (bool2)
        {
          localObject1 = c;
          removeView((View)localObject1);
          localObject1 = n;
          localObject2 = c;
          ((ArrayList)localObject1).remove(localObject2);
        }
      }
    }
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    G = paramInt;
    TextView localTextView = c;
    if (localTextView != null)
    {
      localTextView = c;
      localTextView.setTextColor(paramInt);
    }
  }
  
  public void setTitle(int paramInt)
  {
    CharSequence localCharSequence = getContext().getText(paramInt);
    setTitle(localCharSequence);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    boolean bool1 = TextUtils.isEmpty(paramCharSequence);
    Object localObject1;
    Object localObject2;
    boolean bool2;
    if (!bool1)
    {
      localObject1 = b;
      int i2;
      if (localObject1 == null)
      {
        localObject1 = getContext();
        localObject2 = new android/support/v7/widget/ab;
        ((ab)localObject2).<init>((Context)localObject1);
        b = ((TextView)localObject2);
        b.setSingleLine();
        localObject2 = b;
        TextUtils.TruncateAt localTruncateAt = TextUtils.TruncateAt.END;
        ((TextView)localObject2).setEllipsize(localTruncateAt);
        i2 = j;
        if (i2 != 0)
        {
          localObject2 = b;
          int i3 = j;
          ((TextView)localObject2).setTextAppearance((Context)localObject1, i3);
        }
        int i1 = F;
        if (i1 != 0)
        {
          localObject1 = b;
          i2 = F;
          ((TextView)localObject1).setTextColor(i2);
        }
      }
      localObject1 = b;
      bool2 = d((View)localObject1);
      if (!bool2)
      {
        localObject1 = b;
        i2 = 1;
        a((View)localObject1, i2);
      }
    }
    for (;;)
    {
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject1 = b;
        ((TextView)localObject1).setText(paramCharSequence);
      }
      D = paramCharSequence;
      return;
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject1 = b;
        bool2 = d((View)localObject1);
        if (bool2)
        {
          localObject1 = b;
          removeView((View)localObject1);
          localObject1 = n;
          localObject2 = b;
          ((ArrayList)localObject1).remove(localObject2);
        }
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
    TextView localTextView = b;
    if (localTextView != null)
    {
      localTextView = b;
      localTextView.setTextColor(paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/Toolbar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */