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
    Object localObject = a.i.SnackbarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = a.i.SnackbarLayout_android_maxWidth;
    j = ((TypedArray)localObject).getDimensionPixelSize(j, i);
    c = j;
    j = a.i.SnackbarLayout_maxActionInlineWidth;
    j = ((TypedArray)localObject).getDimensionPixelSize(j, i);
    d = j;
    ((TypedArray)localObject).recycle();
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    TextView localTextView1 = null;
    int i = getOrientation();
    if (paramInt1 != i)
    {
      setOrientation(paramInt1);
      bool2 = bool1;
    }
    TextView localTextView2 = a;
    i = localTextView2.getPaddingTop();
    int j;
    int k;
    if (i == paramInt2)
    {
      localTextView2 = a;
      i = localTextView2.getPaddingBottom();
      if (i == paramInt3) {}
    }
    else
    {
      localTextView1 = a;
      boolean bool3 = w.B(localTextView1);
      if (!bool3) {
        break label118;
      }
      j = w.l(localTextView1);
      k = w.m(localTextView1);
      w.a(localTextView1, j, paramInt2, k, paramInt3);
    }
    for (;;)
    {
      bool2 = bool1;
      return bool2;
      label118:
      j = localTextView1.getPaddingLeft();
      k = localTextView1.getPaddingRight();
      localTextView1.setPadding(j, paramInt2, k, paramInt3);
    }
  }
  
  public final void a()
  {
    long l1 = 180L;
    long l2 = 70;
    float f = 1.0F;
    w.c(a, 0.0F);
    w.s(a).a(f).a(l1).b(l2).b();
    Object localObject = b;
    int i = ((Button)localObject).getVisibility();
    if (i == 0)
    {
      w.c(b, 0.0F);
      localObject = w.s(b).a(f).a(l1).b(l2);
      ((ae)localObject).b();
    }
  }
  
  public final void b()
  {
    long l1 = 180L;
    long l2 = 0L;
    float f = 1.0F;
    w.c(a, f);
    w.s(a).a(0.0F).a(l1).b(l2).b();
    Object localObject = b;
    int i = ((Button)localObject).getVisibility();
    if (i == 0)
    {
      w.c(b, f);
      localObject = w.s(b).a(0.0F).a(l1).b(l2);
      ((ae)localObject).b();
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
    int i = a.e.snackbar_text;
    Object localObject = (TextView)findViewById(i);
    a = ((TextView)localObject);
    i = a.e.snackbar_action;
    localObject = (Button)findViewById(i);
    b = ((Button)localObject);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    super.onMeasure(paramInt1, paramInt2);
    int j = c;
    if (j > 0)
    {
      j = getMeasuredWidth();
      m = c;
      if (j > m)
      {
        j = c;
        m = 1073741824;
        paramInt1 = View.MeasureSpec.makeMeasureSpec(j, m);
        super.onMeasure(paramInt1, paramInt2);
      }
    }
    Resources localResources1 = getResources();
    int m = a.c.design_snackbar_padding_vertical_2lines;
    j = localResources1.getDimensionPixelSize(m);
    Resources localResources2 = getResources();
    int n = a.c.design_snackbar_padding_vertical;
    m = localResources2.getDimensionPixelSize(n);
    Layout localLayout = a.getLayout();
    n = localLayout.getLineCount();
    int k;
    if (n > i)
    {
      n = i;
      if (n == 0) {
        break label216;
      }
      int i1 = d;
      if (i1 <= 0) {
        break label216;
      }
      Button localButton = b;
      i1 = localButton.getMeasuredWidth();
      int i2 = d;
      if (i1 <= i2) {
        break label216;
      }
      m = j - m;
      k = a(i, j, m);
      if (k == 0) {
        break label250;
      }
      k = i;
    }
    for (;;)
    {
      if (k != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
      return;
      n = 0;
      localLayout = null;
      break;
      label216:
      if (n != 0) {}
      for (;;)
      {
        bool = a(0, k, k);
        if (!bool) {
          break label250;
        }
        bool = i;
        break;
        bool = m;
      }
      label250:
      boolean bool = false;
      localResources1 = null;
    }
  }
}


/* Location:              android/support/design/internal/SnackbarContentLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */