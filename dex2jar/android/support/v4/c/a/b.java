package android.support.v4.c.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.util.DisplayMetrics;

@TargetApi(9)
final class b
{
  static int a(Resources paramResources)
  {
    paramResources = paramResources.getDisplayMetrics();
    return (int)(heightPixels / density);
  }
  
  static int b(Resources paramResources)
  {
    paramResources = paramResources.getDisplayMetrics();
    return (int)(widthPixels / density);
  }
}


/* Location:              android/support/v4/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */