package android.support.v7.e;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class a
  implements TransformationMethod
{
  private Locale a;
  
  public a(Context paramContext)
  {
    a = getResourcesgetConfigurationlocale;
  }
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramCharSequence != null) {
      return paramCharSequence.toString().toUpperCase(a);
    }
    return null;
  }
  
  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}


/* Location:              android/support/v7/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */