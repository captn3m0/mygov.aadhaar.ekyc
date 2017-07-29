package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.RatingBar;

public final class v
  extends RatingBar
{
  private t a = new t(this);
  
  public v(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.ratingBarStyle);
  }
  
  private v(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a.a(paramAttributeSet, paramInt);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Bitmap localBitmap = a.a;
      if (localBitmap != null) {
        setMeasuredDimension(w.a(localBitmap.getWidth() * getNumStars(), paramInt1, 0), getMeasuredHeight());
      }
      return;
    }
    finally {}
  }
}


/* Location:              android/support/v7/widget/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */