package android.support.v4.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;

public final class a
  extends android.support.v4.c.a
{
  public static void a(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j) {
      paramActivity.finishAffinity();
    }
    for (;;)
    {
      return;
      paramActivity.finish();
    }
  }
  
  public static void a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j)
    {
      i = 0;
      paramActivity.startActivityForResult(paramIntent, paramInt, null);
    }
    for (;;)
    {
      return;
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
  }
}


/* Location:              android/support/v4/b/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */