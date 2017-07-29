package android.support.v4.c.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public final class c
{
  public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {}
    for (Drawable localDrawable = paramResources.getDrawable(paramInt, paramTheme);; localDrawable = paramResources.getDrawable(paramInt)) {
      return localDrawable;
    }
  }
}


/* Location:              android/support/v4/c/a/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */