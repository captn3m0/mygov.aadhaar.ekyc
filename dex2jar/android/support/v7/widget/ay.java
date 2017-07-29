package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.support.v7.a.a.j;
import android.support.v7.app.a.b;
import android.support.v7.view.a;
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
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public final class ay
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final Interpolator i = new DecelerateInterpolator();
  Runnable a;
  am b;
  int c;
  int d;
  int e;
  private Spinner f;
  private boolean g;
  private int h;
  
  private boolean a()
  {
    return (f != null) && (f.getParent() == this);
  }
  
  private boolean b()
  {
    if (!a()) {
      return false;
    }
    removeView(f);
    addView(b, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(f.getSelectedItemPosition());
    return false;
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (a != null) {
      post(a);
    }
  }
  
  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = a.a(getContext());
    TypedArray localTypedArray = a.obtainStyledAttributes(null, a.j.ActionBar, a.a.actionBarStyle, 0);
    int k = localTypedArray.getLayoutDimension(a.j.ActionBar_height, 0);
    Resources localResources = a.getResources();
    int j = k;
    if (!paramConfiguration.b()) {
      j = Math.min(k, localResources.getDimensionPixelSize(a.d.abc_action_bar_stacked_max_height));
    }
    localTypedArray.recycle();
    setContentHeight(j);
    d = a.getResources().getDimensionPixelSize(a.d.abc_action_bar_stacked_tab_max_width);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (a != null) {
      removeCallbacks(a);
    }
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {}
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 1;
    int j = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    if (j == 1073741824)
    {
      bool = true;
      setFillViewport(bool);
      int k = b.getChildCount();
      if ((k <= 1) || ((j != 1073741824) && (j != Integer.MIN_VALUE))) {
        break label327;
      }
      if (k <= 2) {
        break label314;
      }
      c = ((int)(View.MeasureSpec.getSize(paramInt1) * 0.4F));
      label68:
      c = Math.min(c, d);
      label83:
      j = View.MeasureSpec.makeMeasureSpec(e, 1073741824);
      if ((bool) || (!g)) {
        break label335;
      }
      label105:
      if (paramInt2 == 0) {
        break label348;
      }
      b.measure(0, j);
      if (b.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1)) {
        break label340;
      }
      if (!a())
      {
        if (f == null)
        {
          y localy = new y(getContext(), null, a.a.actionDropDownStyle);
          localy.setLayoutParams(new am.a(-2, -1));
          localy.setOnItemSelectedListener(this);
          f = localy;
        }
        removeView(b);
        addView(f, new ViewGroup.LayoutParams(-2, -1));
        if (f.getAdapter() == null) {
          f.setAdapter(new a());
        }
        if (a != null)
        {
          removeCallbacks(a);
          a = null;
        }
        f.setSelection(h);
      }
    }
    for (;;)
    {
      paramInt2 = getMeasuredWidth();
      super.onMeasure(paramInt1, j);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (paramInt2 != paramInt1)) {
        setTabSelected(h);
      }
      return;
      bool = false;
      break;
      label314:
      c = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label68;
      label327:
      c = -1;
      break label83;
      label335:
      paramInt2 = 0;
      break label105;
      label340:
      b();
      continue;
      label348:
      b();
    }
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public final void setAllowCollapse(boolean paramBoolean)
  {
    g = paramBoolean;
  }
  
  public final void setContentHeight(int paramInt)
  {
    e = paramInt;
    requestLayout();
  }
  
  public final void setTabSelected(int paramInt)
  {
    h = paramInt;
    int k = b.getChildCount();
    int j = 0;
    if (j < k)
    {
      final View localView = b.getChildAt(j);
      if (j == paramInt) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        if (bool)
        {
          localView = b.getChildAt(paramInt);
          if (a != null) {
            removeCallbacks(a);
          }
          a = new Runnable()
          {
            public final void run()
            {
              int i = localView.getLeft();
              int j = (getWidth() - localView.getWidth()) / 2;
              smoothScrollTo(i - j, 0);
              a = null;
            }
          };
          post(a);
        }
        j += 1;
        break;
      }
    }
    if ((f != null) && (paramInt >= 0)) {
      f.setSelection(paramInt);
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return b.getChildCount();
    }
    
    public final Object getItem(int paramInt)
    {
      return b.getChildAt(paramInt)).a;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
      {
        paramView = ay.this;
        paramViewGroup = (a.b)getItem(paramInt);
        paramViewGroup = new ay.b(paramView, paramView.getContext(), paramViewGroup);
        paramViewGroup.setBackgroundDrawable(null);
        paramViewGroup.setLayoutParams(new AbsListView.LayoutParams(-1, e));
        return paramViewGroup;
      }
      paramViewGroup = (ay.b)paramView;
      a = ((a.b)getItem(paramInt));
      paramViewGroup.a();
      return paramView;
    }
  }
  
  private final class b
    extends am
    implements View.OnLongClickListener
  {
    a.b a;
    private final int[] c = { 16842964 };
    private TextView d;
    private ImageView e;
    private View f;
    
    public b(Context paramContext, a.b paramb)
    {
      super(null, a.a.actionBarTabStyle);
      a = paramb;
      this$1 = bf.a(paramContext, null, c, a.a.actionBarTabStyle, 0);
      if (e(0)) {
        setBackgroundDrawable(a(0));
      }
      a.recycle();
      setGravity(8388627);
      a();
    }
    
    public final void a()
    {
      Object localObject1 = a;
      Object localObject2 = ((a.b)localObject1).c();
      if (localObject2 != null)
      {
        localObject1 = ((View)localObject2).getParent();
        if (localObject1 != this)
        {
          if (localObject1 != null) {
            ((ViewGroup)localObject1).removeView((View)localObject2);
          }
          addView((View)localObject2);
        }
        f = ((View)localObject2);
        if (d != null) {
          d.setVisibility(8);
        }
        if (e != null)
        {
          e.setVisibility(8);
          e.setImageDrawable(null);
        }
        return;
      }
      if (f != null)
      {
        removeView(f);
        f = null;
      }
      Object localObject3 = ((a.b)localObject1).a();
      localObject2 = ((a.b)localObject1).b();
      int i;
      if (localObject3 != null)
      {
        Object localObject4;
        if (e == null)
        {
          localObject4 = new q(getContext());
          am.a locala = new am.a(-2, -2);
          h = 16;
          ((ImageView)localObject4).setLayoutParams(locala);
          addView((View)localObject4, 0);
          e = ((ImageView)localObject4);
        }
        e.setImageDrawable((Drawable)localObject3);
        e.setVisibility(0);
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break label365;
        }
        i = 1;
        label209:
        if (i == 0) {
          break label370;
        }
        if (d == null)
        {
          localObject3 = new ab(getContext(), null, a.a.actionBarTabTextStyle);
          ((TextView)localObject3).setEllipsize(TextUtils.TruncateAt.END);
          localObject4 = new am.a(-2, -2);
          h = 16;
          ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          addView((View)localObject3);
          d = ((TextView)localObject3);
        }
        d.setText((CharSequence)localObject2);
        d.setVisibility(0);
      }
      for (;;)
      {
        if (e != null) {
          e.setContentDescription(((a.b)localObject1).d());
        }
        if ((i != 0) || (TextUtils.isEmpty(((a.b)localObject1).d()))) {
          break label397;
        }
        setOnLongClickListener(this);
        return;
        if (e == null) {
          break;
        }
        e.setVisibility(8);
        e.setImageDrawable(null);
        break;
        label365:
        i = 0;
        break label209;
        label370:
        if (d != null)
        {
          d.setVisibility(8);
          d.setText(null);
        }
      }
      label397:
      setOnLongClickListener(null);
      setLongClickable(false);
    }
    
    public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(a.b.class.getName());
    }
    
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      if (Build.VERSION.SDK_INT >= 14) {
        paramAccessibilityNodeInfo.setClassName(a.b.class.getName());
      }
    }
    
    public final boolean onLongClick(View paramView)
    {
      paramView = new int[2];
      getLocationOnScreen(paramView);
      Object localObject = getContext();
      int i = getWidth();
      int j = getHeight();
      int k = getResourcesgetDisplayMetricswidthPixels;
      localObject = Toast.makeText((Context)localObject, a.d(), 0);
      ((Toast)localObject).setGravity(49, paramView[0] + i / 2 - k / 2, j);
      ((Toast)localObject).show();
      return true;
    }
    
    public final void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      if ((c > 0) && (getMeasuredWidth() > c)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(c, 1073741824), paramInt2);
      }
    }
    
    public final void setSelected(boolean paramBoolean)
    {
      if (isSelected() != paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        super.setSelected(paramBoolean);
        if ((i != 0) && (paramBoolean)) {
          sendAccessibilityEvent(4);
        }
        return;
      }
    }
  }
}


/* Location:              android/support/v7/widget/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */