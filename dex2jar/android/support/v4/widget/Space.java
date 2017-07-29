package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class Space
  extends View
{
  public Space(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Space(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public Space(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (getVisibility() == 0) {
      setVisibility(4);
    }
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    switch (i)
    {
    case 0: 
    default: 
      return paramInt1;
    case -2147483648: 
      return Math.min(paramInt1, paramInt2);
    }
    return paramInt2;
  }
  
  public void draw(Canvas paramCanvas) {}
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(a(getSuggestedMinimumWidth(), paramInt1), a(getSuggestedMinimumHeight(), paramInt2));
  }
}


/* Location:              android/support/v4/widget/Space.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */