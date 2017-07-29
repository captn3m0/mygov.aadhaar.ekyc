package android.support.design.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.a.c;
import android.support.design.a.e;
import android.support.design.a.i;
import android.support.design.widget.b.b;
import android.support.v4.h.ae;
import android.support.v4.h.w;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout
  extends LinearLayout
  implements b.b
{
  private TextView a;
  private Button b;
  private int c;
  private int d;
  
  public SnackbarContentLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SnackbarContentLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.SnackbarLayout);
    c = paramContext.getDimensionPixelSize(a.i.SnackbarLayout_android_maxWidth, -1);
    d = paramContext.getDimensionPixelSize(a.i.SnackbarLayout_maxActionInlineWidth, -1);
    paramContext.recycle();
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    if (paramInt1 != getOrientation())
    {
      setOrientation(paramInt1);
      bool = true;
    }
    TextView localTextView;
    if ((a.getPaddingTop() != paramInt2) || (a.getPaddingBottom() != paramInt3))
    {
      localTextView = a;
      if (!w.B(localTextView)) {
        break label78;
      }
      w.a(localTextView, w.l(localTextView), paramInt2, w.m(localTextView), paramInt3);
    }
    for (;;)
    {
      bool = true;
      return bool;
      label78:
      localTextView.setPadding(localTextView.getPaddingLeft(), paramInt2, localTextView.getPaddingRight(), paramInt3);
    }
  }
  
  public final void a()
  {
    w.c(a, 0.0F);
    w.s(a).a(1.0F).a(180L).b(70L).b();
    if (b.getVisibility() == 0)
    {
      w.c(b, 0.0F);
      w.s(b).a(1.0F).a(180L).b(70L).b();
    }
  }
  
  public final void b()
  {
    w.c(a, 1.0F);
    w.s(a).a(0.0F).a(180L).b(0L).b();
    if (b.getVisibility() == 0)
    {
      w.c(b, 1.0F);
      w.s(b).a(0.0F).a(180L).b(0L).b();
    }
  }
  
  public Button getActionView()
  {
    return b;
  }
  
  public TextView getMessageView()
  {
    return a;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    a = ((TextView)findViewById(a.e.snackbar_text));
    b = ((Button)findViewById(a.e.snackbar_action));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = paramInt1;
    if (c > 0)
    {
      i = paramInt1;
      if (getMeasuredWidth() > c)
      {
        i = View.MeasureSpec.makeMeasureSpec(c, 1073741824);
        super.onMeasure(i, paramInt2);
      }
    }
    int j = getResources().getDimensionPixelSize(a.c.design_snackbar_padding_vertical_2lines);
    int k = getResources().getDimensionPixelSize(a.c.design_snackbar_padding_vertical);
    if (a.getLayout().getLineCount() > 1)
    {
      paramInt1 = 1;
      if ((paramInt1 == 0) || (d <= 0) || (b.getMeasuredWidth() <= d)) {
        break label142;
      }
      if (!a(1, j, j - k)) {
        break label170;
      }
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 != 0) {
        super.onMeasure(i, paramInt2);
      }
      return;
      paramInt1 = 0;
      break;
      label142:
      if (paramInt1 != 0) {}
      for (paramInt1 = j;; paramInt1 = k)
      {
        if (!a(0, paramInt1, paramInt1)) {
          break label170;
        }
        paramInt1 = 1;
        break;
      }
      label170:
      paramInt1 = 0;
    }
  }
}


/* Location:              android/support/design/internal/SnackbarContentLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */