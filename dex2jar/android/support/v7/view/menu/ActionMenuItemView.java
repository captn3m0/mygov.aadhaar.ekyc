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
  b c;
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
    g = e();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.ActionMenuItemView, paramInt, 0);
    i = paramContext.getDimensionPixelSize(a.j.ActionMenuItemView_android_minWidth, 0);
    paramContext.recycle();
    k = ((int)(getDisplayMetricsdensity * 32.0F + 0.5F));
    setOnClickListener(this);
    setOnLongClickListener(this);
    j = -1;
    setSaveEnabled(false);
  }
  
  private boolean e()
  {
    Configuration localConfiguration = getContext().getResources().getConfiguration();
    int m = a.b(getResources());
    int n = a.a(getResources());
    return (m >= 480) || ((m >= 640) && (n >= 480)) || (orientation == 2);
  }
  
  private void f()
  {
    int i2 = 0;
    int m;
    int n;
    if (!TextUtils.isEmpty(d))
    {
      m = 1;
      if (e != null)
      {
        if ((a.c & 0x4) != 4) {
          break label87;
        }
        n = 1;
        label37:
        i1 = i2;
        if (n == 0) {
          break label63;
        }
        if (!g)
        {
          i1 = i2;
          if (!h) {
            break label63;
          }
        }
      }
      int i1 = 1;
      label63:
      if ((m & i1) == 0) {
        break label92;
      }
    }
    label87:
    label92:
    for (CharSequence localCharSequence = d;; localCharSequence = null)
    {
      setText(localCharSequence);
      return;
      m = 0;
      break;
      n = 0;
      break label37;
    }
  }
  
  public final void a(j paramj)
  {
    a = paramj;
    setIcon(paramj.getIcon());
    setTitle(paramj.a(this));
    setId(paramj.getItemId());
    if (paramj.isVisible()) {}
    for (int m = 0;; m = 8)
    {
      setVisibility(m);
      setEnabled(paramj.isEnabled());
      if ((paramj.hasSubMenu()) && (f == null)) {
        f = new a();
      }
      return;
    }
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final boolean b()
  {
    return !TextUtils.isEmpty(getText());
  }
  
  public final boolean c()
  {
    return (b()) && (a.getIcon() == null);
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
    if (b != null) {
      b.a(a);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    g = e();
    f();
  }
  
  public boolean onLongClick(View paramView)
  {
    if (b()) {
      return false;
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int m = getWidth();
    int i1 = getHeight();
    int i2 = arrayOfInt[1];
    int i3 = i1 / 2;
    int n = arrayOfInt[0];
    n = m / 2 + n;
    m = n;
    if (w.g(paramView) == 0) {
      m = getResourcesgetDisplayMetricswidthPixels - n;
    }
    paramView = Toast.makeText(localContext, a.getTitle(), 0);
    if (i2 + i3 < localRect.height()) {
      paramView.setGravity(8388661, m, arrayOfInt[1] + i1 - top);
    }
    for (;;)
    {
      paramView.show();
      return true;
      paramView.setGravity(81, 0, i1);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = b();
    if ((bool) && (j >= 0)) {
      super.setPadding(j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    super.onMeasure(paramInt1, paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int n = getMeasuredWidth();
    if (m == Integer.MIN_VALUE) {}
    for (paramInt1 = Math.min(paramInt1, i);; paramInt1 = i)
    {
      if ((m != 1073741824) && (i > 0) && (n < paramInt1)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
      }
      if ((!bool) && (e != null)) {
        super.setPadding((getMeasuredWidth() - e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
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
    if ((a.hasSubMenu()) && (f != null) && (f.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    if (h != paramBoolean)
    {
      h = paramBoolean;
      if (a != null) {
        a.b.g();
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    e = paramDrawable;
    if (paramDrawable != null)
    {
      int i2 = paramDrawable.getIntrinsicWidth();
      int i1 = paramDrawable.getIntrinsicHeight();
      int n = i1;
      int m = i2;
      float f1;
      if (i2 > k)
      {
        f1 = k / i2;
        m = k;
        n = (int)(i1 * f1);
      }
      i2 = n;
      i1 = m;
      if (n > k)
      {
        f1 = k / n;
        i2 = k;
        i1 = (int)(m * f1);
      }
      paramDrawable.setBounds(0, 0, i1, i2);
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
  
  public void setPopupCallback(b paramb)
  {
    c = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    d = paramCharSequence;
    setContentDescription(d);
    f();
  }
  
  private final class a
    extends aj
  {
    public a()
    {
      super();
    }
    
    public final s a()
    {
      if (c != null) {
        return c.a();
      }
      return null;
    }
    
    protected final boolean b()
    {
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (b != null)
      {
        bool1 = bool2;
        if (b.a(a))
        {
          s locals = a();
          bool1 = bool2;
          if (locals != null)
          {
            bool1 = bool2;
            if (locals.f()) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
  }
  
  public static abstract class b
  {
    public abstract s a();
  }
}


/* Location:              android/support/v7/view/menu/ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */