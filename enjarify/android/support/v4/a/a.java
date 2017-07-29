package android.support.v4.a;

import android.os.Build.VERSION;
import android.view.View;

public final class a
{
  private static final b a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 12;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/a/d;
      ((d)localObject).<init>();
    }
    for (a = (b)localObject;; a = (b)localObject)
    {
      return;
      localObject = new android/support/v4/a/c;
      ((c)localObject).<init>();
    }
  }
  
  public static void a(View paramView)
  {
    a.a(paramView);
  }
}


/* Location:              android/support/v4/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */