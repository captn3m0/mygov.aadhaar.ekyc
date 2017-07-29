package android.support.v4.c.a;

import android.content.res.Resources;
import android.util.DisplayMetrics;

final class b
{
  static int a(Resources paramResources)
  {
    DisplayMetrics localDisplayMetrics = paramResources.getDisplayMetrics();
    float f1 = heightPixels;
    float f2 = density;
    return (int)(f1 / f2);
  }
  
  static int b(Resources paramResources)
  {
    DisplayMetrics localDisplayMetrics = paramResources.getDisplayMetrics();
    float f1 = widthPixels;
    float f2 = density;
    return (int)(f1 / f2);
  }
}


/* Location:              android/support/v4/c/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */