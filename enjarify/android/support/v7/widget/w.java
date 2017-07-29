package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public final class w
  extends SeekBar
{
  private x a;
  
  public w(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  private w(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    x localx = new android/support/v7/widget/x;
    localx.<init>(this);
    a = localx;
    a.a(paramAttributeSet, paramInt);
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = a;
    Drawable localDrawable = c;
    if (localDrawable != null)
    {
      boolean bool = localDrawable.isStateful();
      if (bool)
      {
        int[] arrayOfInt = b.getDrawableState();
        bool = localDrawable.setState(arrayOfInt);
        if (bool)
        {
          localObject = b;
          ((SeekBar)localObject).invalidateDrawable(localDrawable);
        }
      }
    }
  }
  
  public final void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Object localObject = a;
    Drawable localDrawable = c;
    if (localDrawable != null)
    {
      localObject = c;
      ((Drawable)localObject).jumpToCurrentState();
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    super.onDraw(paramCanvas);
    x localx = a;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = b;
      int j = ((SeekBar)localObject).getMax();
      if (j > i)
      {
        localObject = c;
        int k = ((Drawable)localObject).getIntrinsicWidth();
        Drawable localDrawable = c;
        int m = localDrawable.getIntrinsicHeight();
        if (k >= 0) {
          k /= 2;
        }
        for (;;)
        {
          if (m >= 0) {
            i = m / 2;
          }
          localDrawable = c;
          int n = -k;
          int i1 = -i;
          localDrawable.setBounds(n, i1, k, i);
          i = b.getWidth();
          k = b.getPaddingLeft();
          i -= k;
          localObject = b;
          k = ((SeekBar)localObject).getPaddingRight();
          f1 = i - k;
          float f2 = j;
          f2 = f1 / f2;
          m = paramCanvas.save();
          f1 = b.getPaddingLeft();
          SeekBar localSeekBar = b;
          n = localSeekBar.getHeight() / 2;
          float f3 = n;
          paramCanvas.translate(f1, f3);
          i = 0;
          f1 = 0.0F;
          while (i <= j)
          {
            c.draw(paramCanvas);
            n = 0;
            f3 = 0.0F;
            localSeekBar = null;
            paramCanvas.translate(f2, 0.0F);
            i += 1;
          }
          k = i;
          f2 = f1;
        }
        paramCanvas.restoreToCount(m);
      }
    }
  }
}


/* Location:              android/support/v7/widget/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */