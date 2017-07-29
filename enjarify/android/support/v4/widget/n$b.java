package android.support.v4.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

class n$b
  implements n.f
{
  public void a(TextView paramTextView, int paramInt)
  {
    Context localContext = paramTextView.getContext();
    paramTextView.setTextAppearance(localContext, paramInt);
  }
  
  public void a(TextView paramTextView, Drawable paramDrawable)
  {
    paramTextView.setCompoundDrawables(paramDrawable, null, null, null);
  }
}


/* Location:              android/support/v4/widget/n$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */