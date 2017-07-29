package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.j;
import android.support.v7.view.b;
import android.support.v7.view.menu.h;
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
    this(paramContext, paramAttributeSet, a.a.actionModeStyle);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = bf.a(paramContext, paramAttributeSet, a.j.ActionMode, paramInt, 0);
    w.a(this, paramContext.a(a.j.ActionMode_background));
    o = paramContext.g(a.j.ActionMode_titleTextStyle, 0);
    p = paramContext.g(a.j.ActionMode_subtitleTextStyle, 0);
    e = paramContext.f(a.j.ActionMode_height, 0);
    q = paramContext.g(a.j.ActionMode_closeItemLayout, a.g.abc_action_mode_close_item_material);
    a.recycle();
  }
  
  private void c()
  {
    int i4 = 8;
    int i2 = 1;
    if (l == null)
    {
      LayoutInflater.from(getContext()).inflate(a.g.abc_action_bar_title_item, this);
      l = ((LinearLayout)getChildAt(getChildCount() - 1));
      m = ((TextView)l.findViewById(a.f.action_bar_title));
      n = ((TextView)l.findViewById(a.f.action_bar_subtitle));
      if (o != 0) {
        m.setTextAppearance(getContext(), o);
      }
      if (p != 0) {
        n.setTextAppearance(getContext(), p);
      }
    }
    m.setText(i);
    n.setText(j);
    int i1;
    label167:
    Object localObject;
    if (!TextUtils.isEmpty(i))
    {
      i1 = 1;
      if (TextUtils.isEmpty(j)) {
        break label234;
      }
      localObject = n;
      if (i2 == 0) {
        break label239;
      }
    }
    label234:
    label239:
    for (int i3 = 0;; i3 = 8)
    {
      ((TextView)localObject).setVisibility(i3);
      localObject = l;
      if (i1 == 0)
      {
        i1 = i4;
        if (i2 == 0) {}
      }
      else
      {
        i1 = 0;
      }
      ((LinearLayout)localObject).setVisibility(i1);
      if (l.getParent() == null) {
        addView(l);
      }
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label167;
    }
  }
  
  public final void a(final b paramb)
  {
    if (g == null)
    {
      g = LayoutInflater.from(getContext()).inflate(q, this, false);
      addView(g);
    }
    for (;;)
    {
      g.findViewById(a.f.action_mode_close_button).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramb.c();
        }
      });
      paramb = (h)paramb.b();
      if (d != null) {
        d.h();
      }
      d = new d(getContext());
      d.e();
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
      paramb.a(d, b);
      c = ((ActionMenuView)d.a(this));
      w.a(c, null);
      addView(c, localLayoutParams);
      return;
      if (g.getParent() == null) {
        addView(g);
      }
    }
  }
  
  public final boolean a()
  {
    if (d != null) {
      return d.f();
    }
    return false;
  }
  
  public final void b()
  {
    removeAllViews();
    k = null;
    c = null;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
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
    if (d != null)
    {
      d.g();
      d.i();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(i);
      }
    }
    else {
      return;
    }
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = bk.a(this);
    int i1;
    int i2;
    int i3;
    Object localObject;
    if (paramBoolean)
    {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
      i2 = getPaddingTop();
      i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      paramInt2 = i1;
      if (g != null)
      {
        paramInt2 = i1;
        if (g.getVisibility() != 8)
        {
          localObject = (ViewGroup.MarginLayoutParams)g.getLayoutParams();
          if (!paramBoolean) {
            break label254;
          }
          paramInt2 = rightMargin;
          label89:
          if (!paramBoolean) {
            break label263;
          }
          paramInt4 = leftMargin;
          label100:
          paramInt2 = a(i1, paramInt2, paramBoolean);
          paramInt2 = a(paramInt2 + a(g, paramInt2, i2, i3, paramBoolean), paramInt4, paramBoolean);
        }
      }
      paramInt4 = paramInt2;
      if (l != null)
      {
        paramInt4 = paramInt2;
        if (k == null)
        {
          paramInt4 = paramInt2;
          if (l.getVisibility() != 8) {
            paramInt4 = paramInt2 + a(l, paramInt2, i2, i3, paramBoolean);
          }
        }
      }
      if (k != null) {
        a(k, paramInt4, i2, i3, paramBoolean);
      }
      if (!paramBoolean) {
        break label273;
      }
      paramInt1 = getPaddingLeft();
      label213:
      if (c != null)
      {
        localObject = c;
        if (paramBoolean) {
          break label286;
        }
      }
    }
    label254:
    label263:
    label273:
    label286:
    for (paramBoolean = true;; paramBoolean = false)
    {
      a((View)localObject, paramInt1, i2, i3, paramBoolean);
      return;
      i1 = getPaddingLeft();
      break;
      paramInt2 = leftMargin;
      break label89;
      paramInt4 = rightMargin;
      break label100;
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
      break label213;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = 1073741824;
    int i4 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    }
    int i6 = View.MeasureSpec.getSize(paramInt1);
    int i1;
    int i5;
    int i2;
    if (e > 0)
    {
      i1 = e;
      int i7 = getPaddingTop() + getPaddingBottom();
      paramInt1 = i6 - getPaddingLeft() - getPaddingRight();
      i5 = i1 - i7;
      i2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
      paramInt2 = paramInt1;
      Object localObject;
      if (g != null)
      {
        paramInt1 = a(g, paramInt1, i2);
        localObject = (ViewGroup.MarginLayoutParams)g.getLayoutParams();
        paramInt2 = leftMargin;
        paramInt2 = paramInt1 - (rightMargin + paramInt2);
      }
      paramInt1 = paramInt2;
      if (c != null)
      {
        paramInt1 = paramInt2;
        if (c.getParent() == this) {
          paramInt1 = a(c, paramInt2, i2);
        }
      }
      paramInt2 = paramInt1;
      if (l != null)
      {
        paramInt2 = paramInt1;
        if (k == null)
        {
          if (!h) {
            break label496;
          }
          paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
          l.measure(paramInt2, i2);
          int i8 = l.getMeasuredWidth();
          if (i8 > paramInt1) {
            break label484;
          }
          i2 = 1;
          label291:
          paramInt2 = paramInt1;
          if (i2 != 0) {
            paramInt2 = paramInt1 - i8;
          }
          localObject = l;
          if (i2 == 0) {
            break label490;
          }
          paramInt1 = 0;
          label316:
          ((LinearLayout)localObject).setVisibility(paramInt1);
        }
      }
      label322:
      if (k != null)
      {
        localObject = k.getLayoutParams();
        if (width == -2) {
          break label510;
        }
        paramInt1 = 1073741824;
        label352:
        i2 = paramInt2;
        if (width >= 0) {
          i2 = Math.min(width, paramInt2);
        }
        if (height == -2) {
          break label517;
        }
        paramInt2 = i3;
        label387:
        if (height < 0) {
          break label524;
        }
        i3 = Math.min(height, i5);
        label407:
        k.measure(View.MeasureSpec.makeMeasureSpec(i2, paramInt1), View.MeasureSpec.makeMeasureSpec(i3, paramInt2));
      }
      if (e > 0) {
        break label539;
      }
      i2 = getChildCount();
      paramInt1 = 0;
      paramInt2 = i4;
      label444:
      if (paramInt2 >= i2) {
        break label531;
      }
      i1 = getChildAt(paramInt2).getMeasuredHeight() + i7;
      if (i1 <= paramInt1) {
        break label547;
      }
      paramInt1 = i1;
    }
    label484:
    label490:
    label496:
    label510:
    label517:
    label524:
    label531:
    label539:
    label547:
    for (;;)
    {
      paramInt2 += 1;
      break label444;
      i1 = View.MeasureSpec.getSize(paramInt2);
      break;
      i2 = 0;
      break label291;
      paramInt1 = 8;
      break label316;
      paramInt2 = a(l, paramInt1, i2);
      break label322;
      paramInt1 = Integer.MIN_VALUE;
      break label352;
      paramInt2 = Integer.MIN_VALUE;
      break label387;
      i3 = i5;
      break label407;
      setMeasuredDimension(i6, paramInt1);
      return;
      setMeasuredDimension(i6, i1);
      return;
    }
  }
  
  public void setContentHeight(int paramInt)
  {
    e = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    if (k != null) {
      removeView(k);
    }
    k = paramView;
    if ((paramView != null) && (l != null))
    {
      removeView(l);
      l = null;
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
    if (paramBoolean != h) {
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */