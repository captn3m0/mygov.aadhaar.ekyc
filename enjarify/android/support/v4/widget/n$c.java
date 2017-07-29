package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class n$c
  extends n.e
{
  public void a(TextView paramTextView, Drawable paramDrawable)
  {
    int i = 1;
    int j = paramTextView.getLayoutDirection();
    Drawable localDrawable;
    if (j == i)
    {
      j = i;
      if (j == 0) {
        break label53;
      }
      i = 0;
      localDrawable = null;
      label27:
      if (j == 0) {
        break label59;
      }
    }
    for (;;)
    {
      paramTextView.setCompoundDrawables(localDrawable, null, paramDrawable, null);
      return;
      i = 0;
      localDrawable = null;
      j = 0;
      break;
      label53:
      localDrawable = paramDrawable;
      break label27;
      label59:
      paramDrawable = null;
    }
  }
}


/* Location:              android/support/v4/widget/n$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */