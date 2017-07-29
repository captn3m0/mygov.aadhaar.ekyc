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
    Locale localLocale = getResourcesgetConfigurationlocale;
    a = localLocale;
  }
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    Locale localLocale;
    if (paramCharSequence != null)
    {
      str = paramCharSequence.toString();
      localLocale = a;
    }
    for (String str = str.toUpperCase(localLocale);; str = null) {
      return str;
    }
  }
  
  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}


/* Location:              android/support/v7/e/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */