package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.widget.RatingBar;

public final class v
  extends RatingBar
{
  private t a;
  
  public v(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  private v(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    t localt = new android/support/v7/widget/t;
    localt.<init>(this);
    a = localt;
    a.a(paramAttributeSet, paramInt);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Object localObject1 = a;
      localObject1 = a;
      if (localObject1 != null)
      {
        int i = ((Bitmap)localObject1).getWidth();
        int j = getNumStars();
        i *= j;
        j = 0;
        i = w.a(i, paramInt1, 0);
        j = getMeasuredHeight();
        setMeasuredDimension(i, j);
      }
      return;
    }
    finally {}
  }
}


/* Location:              android/support/v7/widget/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */