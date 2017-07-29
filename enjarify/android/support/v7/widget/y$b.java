package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.SpinnerAdapter;

final class y$b
  extends an
{
  CharSequence a;
  ListAdapter b;
  final Rect c;
  
  public y$b(y paramy, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    c = ((Rect)localObject);
    k = paramy;
    b();
    j = 0;
    localObject = new android/support/v7/widget/y$b$1;
    ((y.b.1)localObject).<init>(this, paramy);
    l = ((AdapterView.OnItemClickListener)localObject);
  }
  
  final void a()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = q.getBackground();
    int i;
    int k;
    label60:
    int m;
    int n;
    int i1;
    int i2;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject1 = d.c;
      ((Drawable)localObject2).getPadding((Rect)localObject1);
      localObject1 = d;
      bool1 = bk.a((View)localObject1);
      if (bool1)
      {
        localObject1 = d.c;
        i = right;
        k = i;
        m = d.getPaddingLeft();
        n = d.getPaddingRight();
        i1 = d.getWidth();
        localObject1 = d;
        i = b;
        i2 = -2;
        if (i != i2) {
          break label318;
        }
        localObject3 = d;
        localObject1 = (SpinnerAdapter)b;
        Object localObject4 = q.getBackground();
        i2 = ((y)localObject3).a((SpinnerAdapter)localObject1, (Drawable)localObject4);
        localObject1 = d.getContext().getResources().getDisplayMetrics();
        i = widthPixels;
        int i3 = d.c.left;
        i -= i3;
        localObject4 = d.c;
        i3 = right;
        i -= i3;
        if (i2 <= i) {
          break label381;
        }
      }
    }
    for (;;)
    {
      i2 = i1 - m - n;
      i = Math.max(i, i2);
      b(i);
      label225:
      localObject1 = d;
      boolean bool2 = bk.a((View)localObject1);
      if (bool2)
      {
        j = i1 - n;
        i2 = f;
      }
      for (int j = j - i2 + k;; j = k + m)
      {
        g = j;
        return;
        localObject1 = d.c;
        j = -left;
        break;
        localObject2 = d.c;
        localObject3 = d.c;
        right = 0;
        left = 0;
        k = 0;
        localObject2 = null;
        break label60;
        label318:
        localObject1 = d;
        j = b;
        i2 = -1;
        if (j == i2)
        {
          j = i1 - m - n;
          b(j);
          break label225;
        }
        localObject1 = d;
        j = b;
        b(j);
        break label225;
      }
      label381:
      j = i2;
    }
  }
  
  public final void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    b = paramListAdapter;
  }
  
  public final void d()
  {
    int i = 1;
    Object localObject1 = q;
    boolean bool1 = ((PopupWindow)localObject1).isShowing();
    a();
    h();
    super.d();
    e.setChoiceMode(i);
    Object localObject2 = d;
    int j = ((y)localObject2).getSelectedItemPosition();
    ah localah = e;
    PopupWindow localPopupWindow = q;
    boolean bool2 = localPopupWindow.isShowing();
    if ((bool2) && (localah != null))
    {
      localPopupWindow = null;
      localah.setListSelectionHidden(false);
      localah.setSelection(j);
      int k = Build.VERSION.SDK_INT;
      int m = 11;
      if (k >= m)
      {
        k = localah.getChoiceMode();
        if (k != 0) {
          localah.setItemChecked(j, i);
        }
      }
    }
    if (bool1) {}
    for (;;)
    {
      return;
      localObject1 = d.getViewTreeObserver();
      if (localObject1 != null)
      {
        localObject2 = new android/support/v7/widget/y$b$2;
        ((y.b.2)localObject2).<init>(this);
        ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
        localObject1 = new android/support/v7/widget/y$b$3;
        ((y.b.3)localObject1).<init>(this, (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
        a((PopupWindow.OnDismissListener)localObject1);
      }
    }
  }
}


/* Location:              android/support/v7/widget/y$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */