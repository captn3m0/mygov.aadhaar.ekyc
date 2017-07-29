package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.c.a.a;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.support.v7.widget.ActionMenuView.a;
import android.support.v7.widget.ab;
import android.support.v7.widget.aj;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class ActionMenuItemView
  extends ab
  implements p.a, ActionMenuView.a, View.OnClickListener, View.OnLongClickListener
{
  j a;
  h.b b;
  ActionMenuItemView.b c;
  private CharSequence d;
  private Drawable e;
  private aj f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private int k;
  
  public ActionMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    boolean bool = e();
    g = bool;
    Object localObject = a.j.ActionMenuItemView;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt, 0);
    int m = a.j.ActionMenuItemView_android_minWidth;
    m = ((TypedArray)localObject).getDimensionPixelSize(m, 0);
    i = m;
    ((TypedArray)localObject).recycle();
    int n = (int)(getDisplayMetricsdensity * 32.0F + 0.5F);
    k = n;
    setOnClickListener(this);
    setOnLongClickListener(this);
    j = -1;
    setSaveEnabled(false);
  }
  
  private boolean e()
  {
    int m = 480;
    Configuration localConfiguration = getContext().getResources().getConfiguration();
    Resources localResources1 = getResources();
    int n = a.b(localResources1);
    Resources localResources2 = getResources();
    int i1 = a.a(localResources2);
    if (n < m)
    {
      int i2 = 640;
      if ((n < i2) || (i1 < m))
      {
        i3 = orientation;
        n = 2;
        if (i3 != n) {
          break label85;
        }
      }
    }
    int i3 = 1;
    for (;;)
    {
      return i3;
      label85:
      int i4 = 0;
      localConfiguration = null;
    }
  }
  
  private void f()
  {
    int m = 1;
    boolean bool1 = false;
    CharSequence localCharSequence = d;
    boolean bool2 = TextUtils.isEmpty(localCharSequence);
    Object localObject;
    label62:
    boolean bool3;
    if (!bool2)
    {
      bool2 = m;
      localObject = e;
      if (localObject != null)
      {
        localObject = a;
        int n = c & 0x4;
        int i1 = 4;
        if (n != i1) {
          break label121;
        }
        n = m;
        if (n == 0) {
          break label91;
        }
        bool3 = g;
        if (!bool3)
        {
          bool3 = h;
          if (!bool3) {
            break label91;
          }
        }
      }
      bool1 = m;
      label91:
      bool2 &= bool1;
      if (!bool2) {
        break label130;
      }
    }
    for (localCharSequence = d;; localCharSequence = null)
    {
      setText(localCharSequence);
      return;
      bool2 = false;
      localCharSequence = null;
      break;
      label121:
      bool3 = false;
      localObject = null;
      break label62;
      label130:
      bool2 = false;
    }
  }
  
  public final void a(j paramj)
  {
    a = paramj;
    Object localObject = paramj.getIcon();
    setIcon((Drawable)localObject);
    localObject = paramj.a(this);
    setTitle((CharSequence)localObject);
    int m = paramj.getItemId();
    setId(m);
    int n = paramj.isVisible();
    if (n != 0)
    {
      n = 0;
      localObject = null;
    }
    for (;;)
    {
      setVisibility(n);
      boolean bool = paramj.isEnabled();
      setEnabled(bool);
      bool = paramj.hasSubMenu();
      if (bool)
      {
        localObject = f;
        if (localObject == null)
        {
          localObject = new android/support/v7/view/menu/ActionMenuItemView$a;
          ((ActionMenuItemView.a)localObject).<init>(this);
          f = ((aj)localObject);
        }
      }
      return;
      int i1 = 8;
    }
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final boolean b()
  {
    CharSequence localCharSequence = getText();
    boolean bool = TextUtils.isEmpty(localCharSequence);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCharSequence = null;
    }
  }
  
  public final boolean c()
  {
    boolean bool = b();
    Drawable localDrawable;
    if (bool)
    {
      localDrawable = a.getIcon();
      if (localDrawable == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
  
  public final boolean d()
  {
    return b();
  }
  
  public j getItemData()
  {
    return a;
  }
  
  public void onClick(View paramView)
  {
    h.b localb = b;
    if (localb != null)
    {
      localb = b;
      j localj = a;
      localb.a(localj);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    boolean bool = e();
    g = bool;
    f();
  }
  
  public boolean onLongClick(View paramView)
  {
    int m = 1;
    int n = 0;
    boolean bool = b();
    if (bool)
    {
      bool = false;
      return bool;
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Object localObject1 = getContext();
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = arrayOfInt[m];
    int i4 = i2 / 2;
    i3 += i4;
    i4 = arrayOfInt[0];
    i1 = i1 / 2 + i4;
    i4 = w.g(paramView);
    if (i4 == 0)
    {
      localObject2 = ((Context)localObject1).getResources().getDisplayMetrics();
      i4 = widthPixels;
      i1 = i4 - i1;
    }
    Object localObject2 = a.getTitle();
    localObject1 = Toast.makeText((Context)localObject1, (CharSequence)localObject2, 0);
    i4 = localRect.height();
    if (i3 < i4)
    {
      n = 8388661;
      int i5 = arrayOfInt[m] + i2;
      int i6 = top;
      i5 -= i6;
      ((Toast)localObject1).setGravity(n, i1, i5);
    }
    for (;;)
    {
      ((Toast)localObject1).show();
      i1 = m;
      break;
      i1 = 81;
      ((Toast)localObject1).setGravity(i1, 0, i2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = 1073741824;
    boolean bool = b();
    if (bool)
    {
      i1 = j;
      if (i1 >= 0)
      {
        i1 = j;
        i2 = getPaddingTop();
        i3 = getPaddingRight();
        i4 = getPaddingBottom();
        super.setPadding(i1, i2, i3, i4);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i3 = getMeasuredWidth();
    int i4 = -1 << -1;
    if (i2 == i4) {
      i4 = i;
    }
    for (i1 = Math.min(i1, i4);; i1 = i)
    {
      if (i2 != m)
      {
        i2 = i;
        if ((i2 > 0) && (i3 < i1))
        {
          i1 = View.MeasureSpec.makeMeasureSpec(i1, m);
          super.onMeasure(i1, paramInt2);
        }
      }
      if (!bool)
      {
        Drawable localDrawable = e;
        if (localDrawable != null)
        {
          i1 = getMeasuredWidth();
          Rect localRect = e.getBounds();
          int n = localRect.width();
          i1 = (i1 - n) / 2;
          n = getPaddingTop();
          i2 = getPaddingRight();
          i3 = getPaddingBottom();
          super.setPadding(i1, n, i2, i3);
        }
      }
      return;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(null);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject = a;
    boolean bool = ((j)localObject).hasSubMenu();
    if (bool)
    {
      localObject = f;
      if (localObject != null)
      {
        localObject = f;
        bool = ((aj)localObject).onTouch(this, paramMotionEvent);
        if (!bool) {}
      }
    }
    for (bool = true;; bool = super.onTouchEvent(paramMotionEvent)) {
      return bool;
    }
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    boolean bool = h;
    if (bool != paramBoolean)
    {
      h = paramBoolean;
      Object localObject = a;
      if (localObject != null)
      {
        localObject = a.b;
        ((h)localObject).g();
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    e = paramDrawable;
    if (paramDrawable != null)
    {
      int m = paramDrawable.getIntrinsicWidth();
      int n = paramDrawable.getIntrinsicHeight();
      int i1 = k;
      float f1;
      float f2;
      float f3;
      if (m > i1)
      {
        i1 = k;
        f1 = i1;
        f2 = m;
        f1 /= f2;
        m = k;
        f3 = n * f1;
        n = (int)f3;
      }
      i1 = k;
      if (n > i1)
      {
        i1 = k;
        f1 = i1;
        f3 = n;
        f1 /= f3;
        n = k;
        f2 = m * f1;
        m = (int)f2;
      }
      paramDrawable.setBounds(0, 0, m, n);
    }
    setCompoundDrawables(paramDrawable, null, null, null);
    f();
  }
  
  public void setItemInvoker(h.b paramb)
  {
    b = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    j = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(ActionMenuItemView.b paramb)
  {
    c = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    d = paramCharSequence;
    CharSequence localCharSequence = d;
    setContentDescription(localCharSequence);
    f();
  }
}


/* Location:              android/support/v7/view/menu/ActionMenuItemView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */