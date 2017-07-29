package android.support.v4.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

abstract class f
  extends e
{
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = a(paramView, paramString, paramContext, paramAttributeSet);
    if (localView == null)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 11;
      if (i >= j) {
        localView = super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
      }
    }
    return localView;
  }
}


/* Location:              android/support/v4/b/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */