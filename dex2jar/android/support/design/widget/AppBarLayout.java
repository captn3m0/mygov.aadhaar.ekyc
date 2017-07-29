package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.b;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.f.b;
import android.support.v4.f.c;
import android.support.v4.h.al;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

@CoordinatorLayout.b(a=Behavior.class)
public class AppBarLayout
  extends LinearLayout
{
  boolean a;
  int b = 0;
  al c;
  boolean d;
  private int e = -1;
  private int f = -1;
  private int g = -1;
  private List<Object> h;
  private boolean i;
  private final int[] j = new int[2];
  
  public AppBarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
    p.a(paramContext);
    if (Build.VERSION.SDK_INT >= 21)
    {
      y.a(this);
      y.a(this, paramAttributeSet, a.h.Widget_Design_AppBarLayout);
    }
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.AppBarLayout, 0, a.h.Widget_Design_AppBarLayout);
    w.a(this, paramContext.getDrawable(a.i.AppBarLayout_android_background));
    if (paramContext.hasValue(a.i.AppBarLayout_expanded)) {
      a(paramContext.getBoolean(a.i.AppBarLayout_expanded, false), false, false);
    }
    if ((Build.VERSION.SDK_INT >= 21) && (paramContext.hasValue(a.i.AppBarLayout_elevation))) {
      y.a(this, paramContext.getDimensionPixelSize(a.i.AppBarLayout_elevation, 0));
    }
    paramContext.recycle();
    w.a(this, new s()
    {
      public final al a(View paramAnonymousView, al paramAnonymousal)
      {
        AppBarLayout localAppBarLayout = AppBarLayout.this;
        paramAnonymousView = null;
        if (w.x(localAppBarLayout)) {
          paramAnonymousView = paramAnonymousal;
        }
        if (!x.a(c, paramAnonymousView))
        {
          c = paramAnonymousView;
          localAppBarLayout.a();
        }
        return paramAnonymousal;
      }
    });
  }
  
  private a a(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  private static a a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((Build.VERSION.SDK_INT >= 19) && ((paramLayoutParams instanceof LinearLayout.LayoutParams))) {
      return new a((LinearLayout.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new a((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new a(paramLayoutParams);
  }
  
  final void a()
  {
    e = -1;
    f = -1;
    g = -1;
  }
  
  final void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int n = 0;
    int k;
    if (paramBoolean1)
    {
      k = 1;
      if (!paramBoolean2) {
        break label48;
      }
    }
    label48:
    for (int m = 4;; m = 0)
    {
      if (paramBoolean3) {
        n = 8;
      }
      b = (n | m | k);
      requestLayout();
      return;
      k = 2;
      break;
    }
  }
  
  final void b()
  {
    if (h != null)
    {
      int k = 0;
      int m = h.size();
      while (k < m)
      {
        h.get(k);
        k += 1;
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof a;
  }
  
  int getDownNestedPreScrollRange()
  {
    if (f != -1) {
      return f;
    }
    int m = getChildCount() - 1;
    int k = 0;
    if (m >= 0)
    {
      View localView = getChildAt(m);
      a locala = (a)localView.getLayoutParams();
      int n = localView.getMeasuredHeight();
      int i1 = a;
      if ((i1 & 0x5) == 5)
      {
        i2 = topMargin;
        k = bottomMargin + i2 + k;
        if ((i1 & 0x8) != 0) {
          k += w.r(localView);
        }
      }
      while (k <= 0) {
        for (;;)
        {
          int i2;
          m -= 1;
          break;
          if ((i1 & 0x2) != 0) {
            k += n - w.r(localView);
          } else {
            k += n - getTopInset();
          }
        }
      }
    }
    k = Math.max(0, k);
    f = k;
    return k;
  }
  
  int getDownNestedScrollRange()
  {
    if (g != -1) {
      return g;
    }
    int n = getChildCount();
    int m = 0;
    int k = 0;
    if (m < n)
    {
      View localView = getChildAt(m);
      a locala = (a)localView.getLayoutParams();
      int i2 = localView.getMeasuredHeight();
      int i3 = topMargin;
      int i4 = bottomMargin;
      int i1 = a;
      if ((i1 & 0x1) != 0)
      {
        k += i2 + (i3 + i4);
        if ((i1 & 0x2) != 0) {
          k -= w.r(localView) + getTopInset();
        }
      }
    }
    for (;;)
    {
      k = Math.max(0, k);
      g = k;
      return k;
      m += 1;
      break;
    }
  }
  
  final int getMinimumHeightForVisibleOverlappingContent()
  {
    int m = getTopInset();
    int k = w.r(this);
    if (k != 0) {
      return k * 2 + m;
    }
    k = getChildCount();
    if (k > 0) {}
    for (k = w.r(getChildAt(k - 1)); k != 0; k = 0) {
      return k * 2 + m;
    }
    return getHeight() / 3;
  }
  
  int getPendingAction()
  {
    return b;
  }
  
  @Deprecated
  public float getTargetElevation()
  {
    return 0.0F;
  }
  
  final int getTopInset()
  {
    if (c != null) {
      return c.b();
    }
    return 0;
  }
  
  public final int getTotalScrollRange()
  {
    if (e != -1) {
      return e;
    }
    int n = getChildCount();
    int m = 0;
    int k = 0;
    if (m < n)
    {
      View localView = getChildAt(m);
      a locala = (a)localView.getLayoutParams();
      int i2 = localView.getMeasuredHeight();
      int i1 = a;
      if ((i1 & 0x1) != 0)
      {
        int i3 = topMargin;
        k += bottomMargin + (i2 + i3);
        if ((i1 & 0x2) != 0) {
          k -= w.r(localView);
        }
      }
    }
    for (;;)
    {
      k = Math.max(0, k - getTopInset());
      e = k;
      return k;
      m += 1;
      break;
    }
  }
  
  int getUpNestedPreScrollRange()
  {
    return getTotalScrollRange();
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt1 = j;
    int[] arrayOfInt2 = super.onCreateDrawableState(arrayOfInt1.length + paramInt);
    if (i)
    {
      paramInt = a.b.state_collapsible;
      arrayOfInt1[0] = paramInt;
      if ((!i) || (!d)) {
        break label65;
      }
    }
    label65:
    for (paramInt = a.b.state_collapsed;; paramInt = -a.b.state_collapsed)
    {
      arrayOfInt1[1] = paramInt;
      return mergeDrawableStates(arrayOfInt2, arrayOfInt1);
      paramInt = -a.b.state_collapsible;
      break;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a();
    a = false;
    paramInt2 = getChildCount();
    paramInt1 = 0;
    if (paramInt1 < paramInt2)
    {
      if (getChildAtgetLayoutParamsb != null) {
        a = true;
      }
    }
    else
    {
      paramInt3 = getChildCount();
      paramInt1 = 0;
      label62:
      if (paramInt1 >= paramInt3) {
        break label148;
      }
      a locala = (a)getChildAt(paramInt1).getLayoutParams();
      if (((a & 0x1) != 1) || ((a & 0xA) == 0)) {
        break label136;
      }
      paramInt2 = 1;
      label105:
      if (paramInt2 == 0) {
        break label141;
      }
    }
    label136:
    label141:
    label148:
    for (paramBoolean = true;; paramBoolean = false)
    {
      if (i != paramBoolean)
      {
        i = paramBoolean;
        refreshDrawableState();
      }
      return;
      paramInt1 += 1;
      break;
      paramInt2 = 0;
      break label105;
      paramInt1 += 1;
      break label62;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    a();
  }
  
  public void setExpanded(boolean paramBoolean)
  {
    a(paramBoolean, w.F(this), true);
  }
  
  public void setOrientation(int paramInt)
  {
    if (paramInt != 1) {
      throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    super.setOrientation(paramInt);
  }
  
  @Deprecated
  public void setTargetElevation(float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      y.a(this, paramFloat);
    }
  }
  
  public static class Behavior
    extends i<AppBarLayout>
  {
    private int b;
    private boolean c;
    private boolean d;
    private q e;
    private int f = -1;
    private boolean g;
    private float h;
    private WeakReference<View> i;
    private a j;
    
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
    {
      int i2 = a();
      int m = paramAppBarLayout.getChildCount();
      int k = 0;
      View localView;
      label49:
      int i3;
      int n;
      int i1;
      if (k < m)
      {
        localView = paramAppBarLayout.getChildAt(k);
        if ((localView.getTop() <= -i2) && (localView.getBottom() >= -i2)) {
          if (k >= 0)
          {
            localView = paramAppBarLayout.getChildAt(k);
            i3 = getLayoutParamsa;
            if ((i3 & 0x11) == 17)
            {
              n = -localView.getTop();
              i1 = -localView.getBottom();
              m = i1;
              if (k == paramAppBarLayout.getChildCount() - 1) {
                m = i1 + paramAppBarLayout.getTopInset();
              }
              if (!a(i3, 2)) {
                break label186;
              }
              m += w.r(localView);
              k = n;
            }
          }
        }
      }
      for (;;)
      {
        label144:
        if (i2 < (m + k) / 2) {}
        for (;;)
        {
          a(paramCoordinatorLayout, paramAppBarLayout, k.a(m, -paramAppBarLayout.getTotalScrollRange(), 0), 0.0F);
          return;
          k += 1;
          break;
          k = -1;
          break label49;
          label186:
          if (!a(i3, 5)) {
            break label231;
          }
          i1 = w.r(localView) + m;
          k = i1;
          if (i2 < i1) {
            break label144;
          }
          m = i1;
          k = n;
          break label144;
          m = k;
        }
        label231:
        k = n;
      }
    }
    
    private void a(final CoordinatorLayout paramCoordinatorLayout, final AppBarLayout paramAppBarLayout, int paramInt, float paramFloat)
    {
      int k = Math.abs(a() - paramInt);
      paramFloat = Math.abs(paramFloat);
      if (paramFloat > 0.0F) {}
      int m;
      for (k = Math.round(k / paramFloat * 1000.0F) * 3;; k = (int)((k / paramAppBarLayout.getHeight() + 1.0F) * 150.0F))
      {
        m = a();
        if (m != paramInt) {
          break;
        }
        if ((e != null) && (e.a.b())) {
          e.a.e();
        }
        return;
      }
      if (e == null)
      {
        e = x.a();
        e.a(a.e);
        e.a(new q.c()
        {
          public final void a(q paramAnonymousq)
          {
            a_(paramCoordinatorLayout, paramAppBarLayout, a.c());
          }
        });
      }
      for (;;)
      {
        e.a(Math.min(k, 600));
        e.a.a(m, paramInt);
        e.a.a();
        return;
        e.a.e();
      }
    }
    
    private static void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      int m = 0;
      int n = Math.abs(paramInt1);
      int i1 = paramAppBarLayout.getChildCount();
      int k = 0;
      Object localObject;
      label53:
      boolean bool;
      if (k < i1)
      {
        localObject = paramAppBarLayout.getChildAt(k);
        if ((n >= ((View)localObject).getTop()) && (n <= ((View)localObject).getBottom())) {
          if (localObject != null)
          {
            k = getLayoutParamsa;
            if ((k & 0x1) == 0) {
              break label340;
            }
            n = w.r((View)localObject);
            if ((paramInt2 <= 0) || ((k & 0xC) == 0)) {
              break label291;
            }
            if (-paramInt1 < ((View)localObject).getBottom() - n - paramAppBarLayout.getTopInset()) {
              break label285;
            }
            bool = true;
          }
        }
      }
      for (;;)
      {
        label118:
        if (d != bool)
        {
          d = bool;
          paramAppBarLayout.refreshDrawableState();
          paramInt1 = 1;
          label139:
          if (Build.VERSION.SDK_INT >= 11) {
            if (!paramBoolean)
            {
              if (paramInt1 == 0) {
                break label269;
              }
              localObject = e.b(paramAppBarLayout);
              f.clear();
              if (localObject != null) {
                f.addAll((Collection)localObject);
              }
              paramCoordinatorLayout = f;
              k = paramCoordinatorLayout.size();
              paramInt1 = 0;
            }
          }
        }
        for (;;)
        {
          paramInt2 = m;
          if (paramInt1 < k)
          {
            localObject = getgetLayoutParamsa;
            if (!(localObject instanceof AppBarLayout.ScrollingViewBehavior)) {
              break label333;
            }
            paramInt2 = m;
            if (d != 0) {
              paramInt2 = 1;
            }
          }
          if (paramInt2 != 0) {
            paramAppBarLayout.jumpDrawablesToCurrentState();
          }
          label269:
          return;
          k += 1;
          break;
          localObject = null;
          break label53;
          label285:
          bool = false;
          break label118;
          label291:
          if ((k & 0x2) == 0) {
            break label340;
          }
          if (-paramInt1 >= ((View)localObject).getBottom() - n - paramAppBarLayout.getTopInset())
          {
            bool = true;
            break label118;
          }
          bool = false;
          break label118;
          paramInt1 = 0;
          break label139;
          label333:
          paramInt1 += 1;
        }
        label340:
        bool = false;
      }
    }
    
    private static boolean a(int paramInt1, int paramInt2)
    {
      return (paramInt1 & paramInt2) == paramInt2;
    }
    
    final int a()
    {
      return super.c() + b;
    }
    
    public static abstract class a
    {
      public abstract boolean a();
    }
    
    protected static final class b
      extends android.support.v4.h.a
    {
      public static final Parcelable.Creator<b> CREATOR = b.a(new c() {});
      int a;
      float b;
      boolean c;
      
      public b(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        super(paramClassLoader);
        a = paramParcel.readInt();
        b = paramParcel.readFloat();
        if (paramParcel.readByte() != 0) {}
        for (boolean bool = true;; bool = false)
        {
          c = bool;
          return;
        }
      }
      
      public b(Parcelable paramParcelable)
      {
        super();
      }
      
      public final void writeToParcel(Parcel paramParcel, int paramInt)
      {
        super.writeToParcel(paramParcel, paramInt);
        paramParcel.writeInt(a);
        paramParcel.writeFloat(b);
        if (c) {}
        for (paramInt = 1;; paramInt = 0)
        {
          paramParcel.writeByte((byte)paramInt);
          return;
        }
      }
    }
  }
  
  public static class ScrollingViewBehavior
    extends j
  {
    public ScrollingViewBehavior() {}
    
    public ScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.ScrollingViewBehavior_Layout);
      d = paramContext.getDimensionPixelSize(a.i.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
      paramContext.recycle();
    }
    
    private static AppBarLayout b(List<View> paramList)
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        View localView = (View)paramList.get(i);
        if ((localView instanceof AppBarLayout)) {
          return (AppBarLayout)localView;
        }
        i += 1;
      }
      return null;
    }
    
    public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect, boolean paramBoolean)
    {
      AppBarLayout localAppBarLayout = b(paramCoordinatorLayout.a(paramView));
      if (localAppBarLayout != null)
      {
        paramRect.offset(paramView.getLeft(), paramView.getTop());
        paramView = a;
        paramView.set(0, 0, paramCoordinatorLayout.getWidth(), paramCoordinatorLayout.getHeight());
        if (!paramView.contains(paramRect))
        {
          if (!paramBoolean) {}
          for (paramBoolean = true;; paramBoolean = false)
          {
            localAppBarLayout.a(false, paramBoolean, true);
            return true;
          }
        }
      }
      return false;
    }
    
    public final boolean a_(View paramView)
    {
      return paramView instanceof AppBarLayout;
    }
    
    final float b(View paramView)
    {
      if ((paramView instanceof AppBarLayout))
      {
        paramView = (AppBarLayout)paramView;
        int j = paramView.getTotalScrollRange();
        int k = paramView.getDownNestedPreScrollRange();
        paramView = getLayoutParamsa;
        if ((paramView instanceof AppBarLayout.Behavior)) {}
        for (int i = ((AppBarLayout.Behavior)paramView).a(); (k != 0) && (j + i <= k); i = 0) {
          return 0.0F;
        }
        j -= k;
        if (j != 0) {
          return i / j + 1.0F;
        }
      }
      return 0.0F;
    }
    
    public final boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      paramCoordinatorLayout = getLayoutParamsa;
      if ((paramCoordinatorLayout instanceof AppBarLayout.Behavior))
      {
        paramCoordinatorLayout = (AppBarLayout.Behavior)paramCoordinatorLayout;
        int i = paramView2.getBottom();
        int j = paramView1.getTop();
        w.e(paramView1, AppBarLayout.Behavior.a(paramCoordinatorLayout) + (i - j) + c - d(paramView2));
      }
      return false;
    }
    
    final int c(View paramView)
    {
      if ((paramView instanceof AppBarLayout)) {
        return ((AppBarLayout)paramView).getTotalScrollRange();
      }
      return super.c(paramView);
    }
  }
  
  public static final class a
    extends LinearLayout.LayoutParams
  {
    int a = 1;
    Interpolator b;
    
    public a()
    {
      super(-2);
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.AppBarLayout_Layout);
      a = paramAttributeSet.getInt(a.i.AppBarLayout_Layout_layout_scrollFlags, 0);
      if (paramAttributeSet.hasValue(a.i.AppBarLayout_Layout_layout_scrollInterpolator)) {
        b = AnimationUtils.loadInterpolator(paramContext, paramAttributeSet.getResourceId(a.i.AppBarLayout_Layout_layout_scrollInterpolator, 0));
      }
      paramAttributeSet.recycle();
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    @TargetApi(19)
    public a(LinearLayout.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}


/* Location:              android/support/design/widget/AppBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */