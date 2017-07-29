package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.widget.TextView;

@TargetApi(17)
final class aa
  extends z
{
  private bd b;
  private bd c;
  
  aa(TextView paramTextView)
  {
    super(paramTextView);
  }
  
  final void a()
  {
    super.a();
    if ((b != null) || (c != null))
    {
      Drawable[] arrayOfDrawable = a.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], b);
      a(arrayOfDrawable[2], c);
    }
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    Context localContext = a.getContext();
    m localm = m.a();
    paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, a.j.AppCompatTextHelper, paramInt, 0);
    if (paramAttributeSet.hasValue(a.j.AppCompatTextHelper_android_drawableStart)) {
      b = a(localContext, localm, paramAttributeSet.getResourceId(a.j.AppCompatTextHelper_android_drawableStart, 0));
    }
    if (paramAttributeSet.hasValue(a.j.AppCompatTextHelper_android_drawableEnd)) {
      c = a(localContext, localm, paramAttributeSet.getResourceId(a.j.AppCompatTextHelper_android_drawableEnd, 0));
    }
    paramAttributeSet.recycle();
  }
}


/* Location:              android/support/v7/widget/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */