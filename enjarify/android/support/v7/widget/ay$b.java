package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.app.a.b;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

final class ay$b
  extends am
  implements View.OnLongClickListener
{
  a.b a;
  private final int[] c;
  private TextView d;
  private ImageView e;
  private View f;
  
  public ay$b(ay paramay, Context paramContext, a.b paramb)
  {
    super(paramContext, null, i);
    i = 1;
    Object localObject = new int[i];
    localObject[0] = 16842964;
    c = ((int[])localObject);
    a = paramb;
    localObject = c;
    int j = a.a.actionBarTabStyle;
    localObject = bf.a(paramContext, null, (int[])localObject, j, 0);
    boolean bool = ((bf)localObject).e(0);
    if (bool)
    {
      Drawable localDrawable = ((bf)localObject).a(0);
      setBackgroundDrawable(localDrawable);
    }
    a.recycle();
    setGravity(8388627);
    a();
  }
  
  public final void a()
  {
    int i = 16;
    int j = 8;
    int k = -2;
    a.b localb = a;
    Object localObject1 = localb.c();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((View)localObject1).getParent();
      if (localObject2 != this)
      {
        if (localObject2 != null)
        {
          localObject2 = (ViewGroup)localObject2;
          ((ViewGroup)localObject2).removeView((View)localObject1);
        }
        addView((View)localObject1);
      }
      f = ((View)localObject1);
      localObject2 = d;
      if (localObject2 != null)
      {
        localObject2 = d;
        ((TextView)localObject2).setVisibility(j);
      }
      localObject2 = e;
      if (localObject2 != null)
      {
        e.setVisibility(j);
        localObject2 = e;
        ((ImageView)localObject2).setImageDrawable(null);
      }
    }
    for (;;)
    {
      return;
      localObject2 = f;
      if (localObject2 != null)
      {
        localObject2 = f;
        removeView((View)localObject2);
        f = null;
      }
      localObject2 = localb.a();
      localObject1 = localb.b();
      Object localObject3;
      label265:
      boolean bool;
      if (localObject2 != null)
      {
        localObject3 = e;
        Object localObject4;
        if (localObject3 == null)
        {
          localObject3 = new android/support/v7/widget/q;
          localObject4 = getContext();
          ((q)localObject3).<init>((Context)localObject4);
          localObject4 = new android/support/v7/widget/am$a;
          ((am.a)localObject4).<init>(k, k);
          h = i;
          ((ImageView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          addView((View)localObject3, 0);
          e = ((ImageView)localObject3);
        }
        localObject3 = e;
        ((ImageView)localObject3).setImageDrawable((Drawable)localObject2);
        localObject2 = e;
        ((ImageView)localObject2).setVisibility(0);
        bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool) {
          break label491;
        }
        bool = true;
        label280:
        if (!bool) {
          break label500;
        }
        localObject3 = d;
        if (localObject3 == null)
        {
          localObject3 = new android/support/v7/widget/ab;
          localObject4 = getContext();
          j = a.a.actionBarTabTextStyle;
          ((ab)localObject3).<init>((Context)localObject4, null, j);
          localObject4 = TextUtils.TruncateAt.END;
          ((TextView)localObject3).setEllipsize((TextUtils.TruncateAt)localObject4);
          localObject4 = new android/support/v7/widget/am$a;
          ((am.a)localObject4).<init>(k, k);
          h = i;
          ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          addView((View)localObject3);
          d = ((TextView)localObject3);
        }
        localObject3 = d;
        ((TextView)localObject3).setText((CharSequence)localObject1);
        localObject1 = d;
        ((TextView)localObject1).setVisibility(0);
      }
      for (;;)
      {
        localObject1 = e;
        if (localObject1 != null)
        {
          localObject1 = e;
          localObject3 = localb.d();
          ((ImageView)localObject1).setContentDescription((CharSequence)localObject3);
        }
        if (bool) {
          break label534;
        }
        localObject2 = localb.d();
        bool = TextUtils.isEmpty((CharSequence)localObject2);
        if (bool) {
          break label534;
        }
        setOnLongClickListener(this);
        break;
        localObject2 = e;
        if (localObject2 == null) {
          break label265;
        }
        e.setVisibility(j);
        localObject2 = e;
        ((ImageView)localObject2).setImageDrawable(null);
        break label265;
        label491:
        bool = false;
        localObject2 = null;
        break label280;
        label500:
        localObject1 = d;
        if (localObject1 != null)
        {
          d.setVisibility(j);
          localObject1 = d;
          ((TextView)localObject1).setText(null);
        }
      }
      label534:
      setOnLongClickListener(null);
      setLongClickable(false);
    }
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    String str = a.b.class.getName();
    paramAccessibilityEvent.setClassName(str);
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    if (i >= j)
    {
      String str = a.b.class.getName();
      paramAccessibilityNodeInfo.setClassName(str);
    }
  }
  
  public final boolean onLongClick(View paramView)
  {
    int[] arrayOfInt = new int[2];
    getLocationOnScreen(arrayOfInt);
    Object localObject = getContext();
    int i = getWidth();
    int j = getHeight();
    int k = getResourcesgetDisplayMetricswidthPixels;
    CharSequence localCharSequence = a.d();
    localObject = Toast.makeText((Context)localObject, localCharSequence, 0);
    int m = arrayOfInt[0];
    i /= 2;
    m += i;
    i = k / 2;
    m -= i;
    ((Toast)localObject).setGravity(49, m, j);
    ((Toast)localObject).show();
    return true;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    ay localay1 = b;
    int i = c;
    if (i > 0)
    {
      i = getMeasuredWidth();
      ay localay2 = b;
      int j = c;
      if (i > j)
      {
        localay1 = b;
        i = c;
        j = 1073741824;
        i = View.MeasureSpec.makeMeasureSpec(i, j);
        super.onMeasure(i, paramInt2);
      }
    }
  }
  
  public final void setSelected(boolean paramBoolean)
  {
    boolean bool = isSelected();
    if (bool != paramBoolean) {}
    int i;
    for (bool = true;; i = 0)
    {
      super.setSelected(paramBoolean);
      if ((bool) && (paramBoolean))
      {
        i = 4;
        sendAccessibilityEvent(i);
      }
      return;
    }
  }
}


/* Location:              android/support/v7/widget/ay$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */