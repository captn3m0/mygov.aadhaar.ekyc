package android.support.design.widget;

import android.content.Context;
import android.support.design.a.g;
import android.support.design.internal.SnackbarContentLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class Snackbar
  extends b<Snackbar>
{
  private Snackbar(ViewGroup paramViewGroup, View paramView, b.b paramb)
  {
    super(paramViewGroup, paramView, paramb);
  }
  
  public static Snackbar a(View paramView, CharSequence paramCharSequence)
  {
    View localView = null;
    Object localObject2 = paramView;
    if ((localObject2 instanceof CoordinatorLayout)) {
      paramView = (ViewGroup)localObject2;
    }
    label17:
    while (paramView == null)
    {
      throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
      paramView = localView;
      if ((localObject2 instanceof FrameLayout))
      {
        if (((View)localObject2).getId() == 16908290) {
          paramView = (ViewGroup)localObject2;
        } else {
          paramView = (ViewGroup)localObject2;
        }
      }
      else
      {
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          localObject1 = ((View)localObject2).getParent();
          if (!(localObject1 instanceof View)) {
            break label98;
          }
        }
        label98:
        for (localObject1 = (View)localObject1;; localObject1 = null)
        {
          localObject2 = localObject1;
          localView = paramView;
          if (localObject1 != null) {
            break;
          }
          break label17;
        }
      }
    }
    Object localObject1 = (SnackbarContentLayout)LayoutInflater.from(paramView.getContext()).inflate(a.g.design_layout_snackbar_include, paramView, false);
    paramView = new Snackbar(paramView, (View)localObject1, (b.b)localObject1);
    ((SnackbarContentLayout)c.getChildAt(0)).getMessageView().setText(paramCharSequence);
    d = 0;
    return paramView;
  }
  
  public static final class SnackbarLayout
    extends b.e
  {
    public SnackbarLayout(Context paramContext)
    {
      super();
    }
    
    public SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    protected final void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      paramInt2 = getChildCount();
      int i = getMeasuredWidth();
      int j = getPaddingLeft();
      int k = getPaddingRight();
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        View localView = getChildAt(paramInt1);
        if (getLayoutParamswidth == -1) {
          localView.measure(View.MeasureSpec.makeMeasureSpec(i - j - k, 1073741824), View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824));
        }
        paramInt1 += 1;
      }
    }
  }
}


/* Location:              android/support/design/widget/Snackbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */