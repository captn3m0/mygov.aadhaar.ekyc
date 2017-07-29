package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.a.i;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.widget.FrameLayout;

class b$e
  extends FrameLayout
{
  private b.d a;
  private b.c b;
  
  b$e(Context paramContext)
  {
    this(paramContext, null);
  }
  
  b$e(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.i.SnackbarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = a.i.SnackbarLayout_elevation;
    boolean bool = ((TypedArray)localObject).hasValue(i);
    if (bool)
    {
      int j = a.i.SnackbarLayout_elevation;
      j = ((TypedArray)localObject).getDimensionPixelSize(j, 0);
      float f = j;
      w.d(this, f);
    }
    ((TypedArray)localObject).recycle();
    setClickable(true);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    w.w(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b.c localc = b;
    if (localc != null)
    {
      localc = b;
      localc.a();
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    b.d locald = a;
    if (locald != null)
    {
      locald = a;
      locald.a();
    }
  }
  
  void setOnAttachStateChangeListener(b.c paramc)
  {
    b = paramc;
  }
  
  void setOnLayoutChangeListener(b.d paramd)
  {
    a = paramd;
  }
}


/* Location:              android/support/design/widget/b$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */