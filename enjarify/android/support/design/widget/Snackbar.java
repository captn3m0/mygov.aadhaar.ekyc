package android.support.design.widget;

import android.support.design.a.g;
import android.support.design.internal.SnackbarContentLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class Snackbar
  extends b
{
  private Snackbar(ViewGroup paramViewGroup, View paramView, b.b paramb)
  {
    super(paramViewGroup, paramView, paramb);
  }
  
  public static Snackbar a(View paramView, CharSequence paramCharSequence)
  {
    int i = 0;
    Snackbar localSnackbar = null;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = paramView;
    label114:
    label156:
    label160:
    for (;;)
    {
      boolean bool1 = localObject2 instanceof CoordinatorLayout;
      if (bool1) {
        localObject2 = (ViewGroup)localObject2;
      }
      for (localObject1 = localObject2;; localObject1 = localObject2)
      {
        if (localObject1 != null) {
          break label162;
        }
        localObject2 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject2).<init>("No suitable parent found from the given view. Please provide a valid view.");
        throw ((Throwable)localObject2);
        bool1 = localObject2 instanceof FrameLayout;
        if (!bool1) {
          break label114;
        }
        j = ((View)localObject2).getId();
        int k = 16908290;
        if (j != k) {
          break;
        }
        localObject2 = (ViewGroup)localObject2;
      }
      localObject1 = localObject2;
      localObject1 = (ViewGroup)localObject2;
      if (localObject2 != null)
      {
        localObject2 = ((View)localObject2).getParent();
        boolean bool2 = localObject2 instanceof View;
        if (!bool2) {
          break label156;
        }
      }
      for (localObject2 = (View)localObject2;; localObject2 = null)
      {
        if (localObject2 != null) {
          break label160;
        }
        break;
      }
    }
    label162:
    localObject2 = LayoutInflater.from(((ViewGroup)localObject1).getContext());
    i = a.g.design_layout_snackbar_include;
    localObject2 = (SnackbarContentLayout)((LayoutInflater)localObject2).inflate(i, (ViewGroup)localObject1, false);
    localSnackbar = new android/support/design/widget/Snackbar;
    localSnackbar.<init>((ViewGroup)localObject1, (View)localObject2, (b.b)localObject2);
    ((SnackbarContentLayout)c.getChildAt(0)).getMessageView().setText(paramCharSequence);
    d = 0;
    return localSnackbar;
  }
}


/* Location:              android/support/design/widget/Snackbar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */