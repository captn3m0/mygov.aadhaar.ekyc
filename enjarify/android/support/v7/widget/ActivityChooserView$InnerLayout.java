package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class ActivityChooserView$InnerLayout
  extends am
{
  private static final int[] a;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16842964;
    a = arrayOfInt;
  }
  
  public ActivityChooserView$InnerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a;
    localObject = bf.a(paramContext, paramAttributeSet, (int[])localObject);
    Drawable localDrawable = ((bf)localObject).a(0);
    setBackgroundDrawable(localDrawable);
    a.recycle();
  }
}


/* Location:              android/support/v7/widget/ActivityChooserView$InnerLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */