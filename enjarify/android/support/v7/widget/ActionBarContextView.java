package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.j;
import android.support.v7.view.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView
  extends a
{
  public View g;
  public boolean h;
  private CharSequence i;
  private CharSequence j;
  private View k;
  private LinearLayout l;
  private TextView m;
  private TextView n;
  private int o;
  private int p;
  private int q;
  
  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i1);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = a.j.ActionMode;
    localObject = bf.a(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    int i1 = a.j.ActionMode_background;
    Drawable localDrawable = ((bf)localObject).a(i1);
    w.a(this, localDrawable);
    i1 = a.j.ActionMode_titleTextStyle;
    i1 = ((bf)localObject).g(i1, 0);
    o = i1;
    i1 = a.j.ActionMode_subtitleTextStyle;
    i1 = ((bf)localObject).g(i1, 0);
    p = i1;
    i1 = a.j.ActionMode_height;
    i1 = ((bf)localObject).f(i1, 0);
    e = i1;
    i1 = a.j.ActionMode_closeItemLayout;
    int i2 = a.g.abc_action_mode_close_item_material;
    i1 = ((bf)localObject).g(i1, i2);
    q = i1;
    a.recycle();
  }
  
  private void c()
  {
    int i1 = 8;
    boolean bool1 = true;
    Object localObject1 = l;
    if (localObject1 == null)
    {
      localObject1 = LayoutInflater.from(getContext());
      int i2 = a.g.abc_action_bar_title_item;
      ((LayoutInflater)localObject1).inflate(i2, this);
      int i4 = getChildCount() + -1;
      localObject1 = (LinearLayout)getChildAt(i4);
      l = ((LinearLayout)localObject1);
      localObject1 = l;
      i2 = a.f.action_bar_title;
      localObject1 = (TextView)((LinearLayout)localObject1).findViewById(i2);
      m = ((TextView)localObject1);
      localObject1 = l;
      i2 = a.f.action_bar_subtitle;
      localObject1 = (TextView)((LinearLayout)localObject1).findViewById(i2);
      n = ((TextView)localObject1);
      i4 = o;
      int i5;
      if (i4 != 0)
      {
        localObject1 = m;
        localObject2 = getContext();
        i5 = o;
        ((TextView)localObject1).setTextAppearance((Context)localObject2, i5);
      }
      i4 = p;
      if (i4 != 0)
      {
        localObject1 = n;
        localObject2 = getContext();
        i5 = p;
        ((TextView)localObject1).setTextAppearance((Context)localObject2, i5);
      }
    }
    localObject1 = m;
    Object localObject2 = i;
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject1 = n;
    localObject2 = j;
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject1 = i;
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
    int i3;
    label251:
    TextView localTextView;
    if (!bool2)
    {
      bool2 = bool1;
      localObject2 = j;
      i3 = TextUtils.isEmpty((CharSequence)localObject2);
      if (i3 != 0) {
        break label328;
      }
      localTextView = n;
      if (!bool1) {
        break label333;
      }
      i3 = 0;
      localObject2 = null;
    }
    for (;;)
    {
      localTextView.setVisibility(i3);
      localObject2 = l;
      if ((bool2) || (bool1)) {
        i1 = 0;
      }
      ((LinearLayout)localObject2).setVisibility(i1);
      localObject1 = l.getParent();
      if (localObject1 == null)
      {
        localObject1 = l;
        addView((View)localObject1);
      }
      return;
      bool2 = false;
      localObject1 = null;
      break;
      label328:
      bool1 = false;
      break label251;
      label333:
      i3 = i1;
    }
  }
  
  public final void a(b paramb)
  {
    Object localObject1 = g;
    int i1;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = LayoutInflater.from(getContext());
      i1 = q;
      localObject2 = null;
      localObject1 = ((LayoutInflater)localObject1).inflate(i1, this, false);
      g = ((View)localObject1);
      localObject1 = g;
      addView((View)localObject1);
    }
    for (;;)
    {
      localObject1 = g;
      i1 = a.f.action_mode_close_button;
      localObject1 = ((View)localObject1).findViewById(i1);
      Object localObject3 = new android/support/v7/widget/ActionBarContextView$1;
      ((ActionBarContextView.1)localObject3).<init>(this, paramb);
      ((View)localObject1).setOnClickListener((View.OnClickListener)localObject3);
      localObject1 = (h)paramb.b();
      localObject3 = d;
      if (localObject3 != null)
      {
        localObject3 = d;
        ((d)localObject3).h();
      }
      localObject3 = new android/support/v7/widget/d;
      localObject2 = getContext();
      ((d)localObject3).<init>((Context)localObject2);
      d = ((d)localObject3);
      d.e();
      localObject3 = new android/view/ViewGroup$LayoutParams;
      ((ViewGroup.LayoutParams)localObject3).<init>(-2, -1);
      localObject2 = d;
      Context localContext = b;
      ((h)localObject1).a((o)localObject2, localContext);
      localObject1 = (ActionMenuView)d.a(this);
      c = ((ActionMenuView)localObject1);
      w.a(c, null);
      localObject1 = c;
      addView((View)localObject1, (ViewGroup.LayoutParams)localObject3);
      return;
      localObject1 = g.getParent();
      if (localObject1 == null)
      {
        localObject1 = g;
        addView((View)localObject1);
      }
    }
  }
  
  public final boolean a()
  {
    d locald = d;
    boolean bool;
    if (locald != null)
    {
      locald = d;
      bool = locald.f();
    }
    for (;;)
    {
      return bool;
      bool = false;
      locald = null;
    }
  }
  
  public final void b()
  {
    removeAllViews();
    k = null;
    c = null;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = new android/view/ViewGroup$MarginLayoutParams;
    localMarginLayoutParams.<init>(-1, -2);
    return localMarginLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = new android/view/ViewGroup$MarginLayoutParams;
    Context localContext = getContext();
    localMarginLayoutParams.<init>(localContext, paramAttributeSet);
    return localMarginLayoutParams;
  }
  
  public CharSequence getSubtitle()
  {
    return j;
  }
  
  public CharSequence getTitle()
  {
    return i;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    d locald = d;
    if (locald != null)
    {
      d.g();
      locald = d;
      locald.i();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 14;
    if (i1 >= i2)
    {
      i1 = paramAccessibilityEvent.getEventType();
      i2 = 32;
      if (i1 != i2) {
        break label73;
      }
      paramAccessibilityEvent.setSource(this);
      Object localObject = getClass().getName();
      paramAccessibilityEvent.setClassName((CharSequence)localObject);
      localObject = getContext().getPackageName();
      paramAccessibilityEvent.setPackageName((CharSequence)localObject);
      localObject = i;
      paramAccessibilityEvent.setContentDescription((CharSequence)localObject);
    }
    for (;;)
    {
      return;
      label73:
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 8;
    boolean bool = bk.a(this);
    int i2;
    int i3;
    int i5;
    int i8;
    Object localObject1;
    label131:
    label143:
    Object localObject2;
    label301:
    ActionMenuView localActionMenuView;
    if (bool)
    {
      i2 = paramInt3 - paramInt1;
      i3 = getPaddingRight();
      i2 -= i3;
      i3 = i2;
      i5 = getPaddingTop();
      i2 = paramInt4 - paramInt2;
      int i6 = getPaddingTop();
      i2 -= i6;
      i6 = getPaddingBottom();
      i8 = i2 - i6;
      localObject1 = g;
      if (localObject1 != null)
      {
        localObject1 = g;
        i2 = ((View)localObject1).getVisibility();
        if (i2 != i1)
        {
          localObject1 = (ViewGroup.MarginLayoutParams)g.getLayoutParams();
          if (!bool) {
            break label354;
          }
          i6 = rightMargin;
          if (!bool) {
            break label364;
          }
          i2 = leftMargin;
          i3 = a(i3, i6, bool);
          localObject2 = g;
          i6 = a((View)localObject2, i3, i5, i8, bool);
          i3 = a(i3 + i6, i2, bool);
        }
      }
      localObject1 = l;
      if (localObject1 != null)
      {
        localObject1 = k;
        if (localObject1 == null)
        {
          localObject1 = l;
          i2 = ((LinearLayout)localObject1).getVisibility();
          if (i2 != i1)
          {
            localObject1 = l;
            i2 = a((View)localObject1, i3, i5, i8, bool);
            i3 += i2;
          }
        }
      }
      localObject1 = k;
      if (localObject1 != null)
      {
        localObject1 = k;
        a((View)localObject1, i3, i5, i8, bool);
      }
      if (!bool) {
        break label374;
      }
      i2 = getPaddingLeft();
      localActionMenuView = c;
      if (localActionMenuView != null)
      {
        localObject2 = c;
        if (bool) {
          break label396;
        }
        i3 = 1;
      }
    }
    for (;;)
    {
      a((View)localObject2, i2, i5, i8, i3);
      return;
      i2 = getPaddingLeft();
      i3 = i2;
      break;
      label354:
      int i7 = leftMargin;
      break label131;
      label364:
      i2 = rightMargin;
      break label143;
      label374:
      i2 = paramInt3 - paramInt1;
      int i4 = getPaddingRight();
      i2 -= i4;
      break label301;
      label396:
      i4 = 0;
      localActionMenuView = null;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = -2;
    int i2 = 1073741824;
    int i3 = -1 << -1;
    float f = -0.0F;
    int i4 = 0;
    int i5 = View.MeasureSpec.getMode(paramInt1);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (i5 != i2)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = getClass().getSimpleName();
      localObject2 = (String)localObject3 + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    i5 = View.MeasureSpec.getMode(paramInt2);
    if (i5 == 0)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = getClass().getSimpleName();
      localObject2 = (String)localObject3 + " can only be used with android:layout_height=\"wrap_content\"";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int i6 = View.MeasureSpec.getSize(paramInt1);
    i5 = e;
    int i7;
    int i8;
    int i10;
    Object localObject4;
    if (i5 > 0)
    {
      i5 = e;
      i7 = i5;
      i5 = getPaddingTop();
      i8 = getPaddingBottom();
      int i9 = i5 + i8;
      i5 = getPaddingLeft();
      i5 = i6 - i5;
      i8 = getPaddingRight();
      i5 -= i8;
      i10 = i7 - i9;
      i8 = View.MeasureSpec.makeMeasureSpec(i10, i3);
      localObject4 = g;
      int i13;
      if (localObject4 != null)
      {
        localObject4 = g;
        int i11 = a((View)localObject4, i5, i8);
        localObject1 = (ViewGroup.MarginLayoutParams)g.getLayoutParams();
        i13 = leftMargin;
        i5 = rightMargin + i13;
        i5 = i11 - i5;
      }
      localObject4 = c;
      if (localObject4 != null)
      {
        localObject4 = c.getParent();
        if (localObject4 == this)
        {
          localObject4 = c;
          i5 = a((View)localObject4, i5, i8);
        }
      }
      localObject4 = l;
      if (localObject4 != null)
      {
        localObject4 = k;
        if (localObject4 == null)
        {
          boolean bool = h;
          if (!bool) {
            break label693;
          }
          int i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
          LinearLayout localLinearLayout = l;
          localLinearLayout.measure(i12, i8);
          localObject3 = l;
          i12 = ((LinearLayout)localObject3).getMeasuredWidth();
          if (i12 > i5) {
            break label677;
          }
          i8 = 1;
          label421:
          if (i8 != 0) {
            i5 -= i12;
          }
          localObject4 = l;
          if (i8 == 0) {
            break label686;
          }
          i8 = 0;
          localObject3 = null;
          label450:
          ((LinearLayout)localObject4).setVisibility(i8);
        }
      }
      label457:
      localObject3 = k;
      if (localObject3 != null)
      {
        localObject3 = k;
        localObject4 = ((View)localObject3).getLayoutParams();
        i8 = width;
        if (i8 == i1) {
          break label713;
        }
        i8 = i2;
        label498:
        i13 = width;
        if (i13 >= 0)
        {
          i13 = width;
          i5 = Math.min(i13, i5);
        }
        i13 = height;
        if (i13 == i1) {
          break label720;
        }
        label539:
        i3 = height;
        if (i3 < 0) {
          break label727;
        }
        i3 = Math.min(height, i10);
        label563:
        View localView = k;
        i5 = View.MeasureSpec.makeMeasureSpec(i5, i8);
        i8 = View.MeasureSpec.makeMeasureSpec(i3, i2);
        localView.measure(i5, i8);
      }
      i5 = e;
      if (i5 > 0) {
        break label743;
      }
      i8 = getChildCount();
      i7 = 0;
      localObject2 = null;
      label619:
      if (i4 >= i8) {
        break label734;
      }
      localObject1 = getChildAt(i4);
      i5 = ((View)localObject1).getMeasuredHeight() + i9;
      if (i5 <= i7) {
        break label754;
      }
    }
    for (;;)
    {
      i4 += 1;
      i7 = i5;
      break label619;
      i5 = View.MeasureSpec.getSize(paramInt2);
      i7 = i5;
      break;
      label677:
      i8 = 0;
      localObject3 = null;
      break label421;
      label686:
      i8 = 8;
      break label450;
      label693:
      localObject4 = l;
      i5 = a((View)localObject4, i5, i8);
      break label457;
      label713:
      i8 = i3;
      break label498;
      label720:
      i2 = i3;
      break label539;
      label727:
      i3 = i10;
      break label563;
      label734:
      setMeasuredDimension(i6, i7);
      for (;;)
      {
        return;
        label743:
        setMeasuredDimension(i6, i7);
      }
      label754:
      i5 = i7;
    }
  }
  
  public void setContentHeight(int paramInt)
  {
    e = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = k;
    if (localObject != null)
    {
      localObject = k;
      removeView((View)localObject);
    }
    k = paramView;
    if (paramView != null)
    {
      localObject = l;
      if (localObject != null)
      {
        localObject = l;
        removeView((View)localObject);
        localObject = null;
        l = null;
      }
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    j = paramCharSequence;
    c();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    i = paramCharSequence;
    c();
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    boolean bool = h;
    if (paramBoolean != bool) {
      requestLayout();
    }
    h = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              android/support/v7/widget/ActionBarContextView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */