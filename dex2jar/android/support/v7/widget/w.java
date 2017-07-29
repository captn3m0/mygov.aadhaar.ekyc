package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.SeekBar;

public final class w
  extends SeekBar
{
  private x a = new x(this);
  
  public w(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.seekBarStyle);
  }
  
  private w(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a.a(paramAttributeSet, paramInt);
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    x localx = a;
    Drawable localDrawable = c;
    if ((localDrawable != null) && (localDrawable.isStateful()) && (localDrawable.setState(b.getDrawableState()))) {
      b.invalidateDrawable(localDrawable);
    }
  }
  
  @TargetApi(11)
  public final void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    x localx = a;
    if (c != null) {
      c.jumpToCurrentState();
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    int j = 1;
    super.onDraw(paramCanvas);
    x localx = a;
    if (c != null)
    {
      int k = b.getMax();
      if (k > 1)
      {
        int i = c.getIntrinsicWidth();
        int m = c.getIntrinsicHeight();
        if (i >= 0) {
          i /= 2;
        }
        for (;;)
        {
          if (m >= 0) {
            j = m / 2;
          }
          c.setBounds(-i, -j, i, j);
          float f = (b.getWidth() - b.getPaddingLeft() - b.getPaddingRight()) / k;
          j = paramCanvas.save();
          paramCanvas.translate(b.getPaddingLeft(), b.getHeight() / 2);
          i = 0;
          while (i <= k)
          {
            c.draw(paramCanvas);
            paramCanvas.translate(f, 0.0F);
            i += 1;
          }
          i = 1;
        }
        paramCanvas.restoreToCount(j);
      }
    }
  }
}


/* Location:              android/support/v7/widget/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */